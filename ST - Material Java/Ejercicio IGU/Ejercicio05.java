import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Ejercicio05 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio05 frame = new Ejercicio05();
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
	public Ejercicio05() {
		setFont(new Font("Gungsuh", Font.BOLD | Font.ITALIC, 16));
		setTitle("Hola mundo!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblNewLabel1 = new JLabel("Esto es un Texto...");
		lblNewLabel1.setOpaque(true);
		lblNewLabel1.setBackground(Color.YELLOW);
		lblNewLabel1.setForeground(Color.MAGENTA);
		lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel1.setBounds(109, 42, 216, 45);
		contentPane.add(lblNewLabel1);
		
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.setForeground(Color.RED);
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel1.setText("...pero esto puede Cambiar");
			}
		});
		btnCambiar.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		btnCambiar.setBounds(10, 121, 167, 45);
		contentPane.add(btnCambiar);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(Color.GREEN);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel1.setText("Esto es un texto...");
			}
		});
		btnReset.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		btnReset.setBounds(10, 192, 167, 45);
		contentPane.add(btnReset);
		
		JButton btnOcultar = new JButton("Ocultar");
		btnOcultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel1.setText("");
				lblNewLabel1.setOpaque(false);
			}
		});
		btnOcultar.setFont(new Font("MS UI Gothic", Font.BOLD | Font.ITALIC, 16));
		btnOcultar.setBounds(234, 122, 167, 45);
		contentPane.add(btnOcultar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 16));
		btnSalir.setBounds(234, 193, 167, 45);
		contentPane.add(btnSalir);
	}
}