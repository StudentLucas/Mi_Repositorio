import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.JScrollBar;


public class Ejercicio23 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio23 frame = new Ejercicio23();
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
	public Ejercicio23() {
		
		int intervalo=1000;
		Timer timer = new Timer(intervalo, new ActionListener() {
			int tit=0;
			public void actionPerformed(ActionEvent ev) {
				if (tit==0){
					setTitle("Timer");
					tit=1;
				}else{
					setTitle("");
					tit=0;
				}
			}
		} ) ;

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		scrollBar.setBounds(10, 50, 414, 17);
		contentPane.add(scrollBar);
		
		JButton btnEmpezar = new JButton("Empezar");
		btnEmpezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				timer.start();
			}
		});
		btnEmpezar.setBounds(10, 11, 89, 23);
		contentPane.add(btnEmpezar);
		
		JButton btnParar = new JButton("Parar");
		btnParar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					timer.stop();
			}
		});
		btnParar.setBounds(109, 11, 89, 23);
		contentPane.add(btnParar);
		
		JButton btnNewButton = new JButton("Izquierda");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				scrollBar.setValue(10);
			}
		});
		btnNewButton.setBounds(234, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnDerecha = new JButton("Derecha");
		btnDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				scrollBar.setValue(10+300-34);
			}
		});
		btnDerecha.setBounds(335, 11, 89, 23);
		contentPane.add(btnDerecha);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(335, 227, 89, 23);
		contentPane.add(btnSalir);
		
		
	}
}
