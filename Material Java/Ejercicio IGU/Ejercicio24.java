import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.SpinnerNumberModel;


public class Ejercicio24 extends JFrame {

	private JPanel contentPane;
	private int pos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio24 frame = new Ejercicio24();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio24() {
		setTitle("Movimiento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		int intervalo=50;  // antes emezaba a 1000
		
		JLabel lblA = new JLabel("A");
		lblA.setBounds(402, 135, 46, 14);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setBounds(115, 135, 46, 14);
		contentPane.add(lblB);
		
		JLabel lblFoto = new JLabel("Foto");
		lblFoto.setIcon(new ImageIcon("C:\\Users\\blanc\\Desktop\\EclipsePortable\\Data\\workspace\\Ejercicio22\\src\\River.jpg"));
		lblFoto.setBounds(10, 11, 120, 80);
		contentPane.add(lblFoto);
		
		JLabel lblFoto2 = new JLabel("Foto");
		lblFoto2.setIcon(new ImageIcon("C:\\Users\\blanc\\Desktop\\EclipsePortable\\Data\\workspace\\Ejercicio22\\src\\RiverIzquierda.jpg"));
		lblFoto2.setBounds(10, 11, 120, 80);
		contentPane.add(lblFoto2);
		
		Timer timer = new Timer(intervalo, new ActionListener() {
			int pos=10;
			int cam=0;
			int aaa=10;
			public void actionPerformed(ActionEvent ev) {
				//if (pos< 10 || pos>500){
				if (pos>500-120){
					if (cam==0){
						aaa=-10;
						cam=1;
					}
					lblFoto.setVisible(false);
					lblFoto2.setVisible(true);	//

				}
				if (pos<20){
					if (cam==1){
						aaa=10;
						cam=0;
					}
					lblFoto.setVisible(true); //
					lblFoto2.setVisible(false);	
				}
				lblFoto2.setLocation(pos, 11);
				lblFoto.setLocation(pos, 11);
				//lblFoto2.setLocation(pos, 11);
				pos=pos+aaa;
				lblA.setText(Integer.toString(pos));
			}
		} ) ;
		
		JLabel lblLento = new JLabel("Lento");
		lblLento.setBounds(464, 204, 46, 14);
		contentPane.add(lblLento);
		
		JLabel lblRapido = new JLabel("Rapido");
		lblRapido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRapido.setBounds(10, 204, 46, 14);
		contentPane.add(lblRapido);
		
		JLabel lblVelocidad = new JLabel("Velocidad");
		lblVelocidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblVelocidad.setBounds(222, 154, 73, 14);
		contentPane.add(lblVelocidad);
		
		JButton btnEmpezar = new JButton("Empezar");
		btnEmpezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				timer.start();
				lblB.setText(Integer.toString(intervalo));
			}
		});
		btnEmpezar.setBounds(10, 227, 89, 23);
		contentPane.add(btnEmpezar);
		
		JButton btnParar = new JButton("Parar");
		btnParar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			timer.stop();
			}
		});
		btnParar.setBounds(115, 227, 89, 23);
		contentPane.add(btnParar);
		
		JButton btnIzquierda = new JButton("Izquierda");
		btnIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pos=20;
				if (lblFoto.isVisible()==true){
					lblFoto.setLocation(pos, 11);
					lblA.setText(Integer.toString(pos));
				}else{
					lblFoto2.setLocation(pos, 11);
					lblA.setText(Integer.toString(pos));
				}	
			}
		});
		btnIzquierda.setBounds(222, 227, 89, 23);
		contentPane.add(btnIzquierda);
		
		JButton btnDerecha = new JButton("Derecha");
		btnDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pos=500-120;
				if (lblFoto.isVisible()==true){
					lblFoto.setLocation(pos, 11);
					lblA.setText(Integer.toString(pos));
				}else{
					lblFoto2.setLocation(pos, 11);
					lblA.setText(Integer.toString(pos));
				}		
			}
		});
		btnDerecha.setBounds(324, 227, 89, 23);
		contentPane.add(btnDerecha);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(421, 227, 89, 23);
		contentPane.add(btnSalir);
		
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(50, 1, 100, 1));
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int sss=(int) spinner.getValue();
				timer.setDelay(sss);
				lblB.setText(Integer.toString(sss));
			}
		});
		spinner.setBounds(42, 129, 40, 47);
		contentPane.add(spinner);

	}
}
