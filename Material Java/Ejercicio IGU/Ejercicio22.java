import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Ejercicio22 extends JFrame {
	private static final long serialVersionUID = 8520267309207946578L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio22 frame = new Ejercicio22();
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
	public Ejercicio22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		int intervalo=1000;
		
		JLabel lblTexto = new JLabel("Texto de prueba");
		lblTexto.setHorizontalAlignment(SwingConstants.LEFT);
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTexto.setForeground(Color.RED);
		lblTexto.setBounds(10, 174, 140, 32);
		contentPane.add(lblTexto);
		
		Timer timer = new Timer(intervalo, new ActionListener() {
			int tit=0;
			public void actionPerformed(ActionEvent ev) {
				if (tit==0){
					setTitle("Timer");
					lblTexto.setText("Texto de prueba");
					tit=1;
				}else{
					setTitle("");
					lblTexto.setText("");
					tit=0;
				}
			}
		} ) ;
		
		JButton btnNewButton = new JButton("Empezar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				timer.start();
			}
		});
		btnNewButton.setBounds(59, 27, 91, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Parar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				timer.stop();
			}
		});
		btnNewButton_1.setBounds(192, 27, 91, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Más rápido");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				timer.setDelay(200);
			}
		});
		btnNewButton_2.setBounds(116, 72, 106, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Normal");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				timer.setDelay(1000);
			}
		});
		btnNewButton_3.setBounds(116, 106, 106, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Más lento");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				timer.setDelay(2000);
			}
		});
		btnNewButton_4.setBounds(116, 140, 106, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(254, 188, 89, 23);
		contentPane.add(btnSalir);
	}
}

