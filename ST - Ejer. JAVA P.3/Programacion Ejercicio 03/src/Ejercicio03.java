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


public class Ejercicio03 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio03 frame = new Ejercicio03();
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
	public Ejercicio03() {
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
		btnCambiar.setBounds(136, 122, 167, 45);
		contentPane.add(btnCambiar);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(Color.GREEN);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel1.setText("Esto es un texto...");
			}
		});
		btnReset.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		btnReset.setBounds(136, 196, 167, 45);
		contentPane.add(btnReset);
	}
}
