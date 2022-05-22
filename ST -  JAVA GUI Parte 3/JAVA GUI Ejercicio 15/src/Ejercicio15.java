import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ejercicio15 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio15 frame = new Ejercicio15();
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
	public Ejercicio15() {
		setTitle("Radio 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 201, 164);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTexto = new JLabel("Hola Mundo");
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTexto.setForeground(Color.BLUE);
		lblTexto.setBounds(10, 8, 161, 41);
		contentPane.add(lblTexto);
		
		JRadioButton rdbtnAzul = new JRadioButton("Azul");
		rdbtnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblTexto.setForeground(Color.BLUE);
			}
		});
		rdbtnAzul.setSelected(true);
		rdbtnAzul.setBounds(27, 56, 51, 23);
		contentPane.add(rdbtnAzul);
		
		JRadioButton rdbtnVerde = new JRadioButton("Verde");
		rdbtnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setForeground(Color.GREEN);;
			}
		});
		rdbtnVerde.setBounds(27, 82, 76, 23);
		contentPane.add(rdbtnVerde);
		
		JRadioButton rdbtnRojo = new JRadioButton("Rojo");
		rdbtnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setForeground(Color.RED);;
			}
		});
		rdbtnRojo.setBounds(27, 108, 68, 17);
		contentPane.add(rdbtnRojo);
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtnAzul);
		grupo1.add(rdbtnVerde);
		grupo1.add(rdbtnRojo);
		
		JRadioButton rdbtn12 = new JRadioButton("!2");
		rdbtn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setFont(new Font("Tahoma", Font.BOLD, 12));
			}
		});
		rdbtn12.setSelected(true);
		rdbtn12.setBounds(131, 50, 51, 35);
		contentPane.add(rdbtn12);
		
		JRadioButton rdbtn14 = new JRadioButton("14");
		rdbtn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblTexto.setFont(new Font("Tahoma", Font.BOLD, 14));
			}
		});
		rdbtn14.setBounds(131, 82, 56, 23);
		contentPane.add(rdbtn14);
		
		JRadioButton rdbtn16 = new JRadioButton("16");
		rdbtn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setFont(new Font("Tahoma", Font.BOLD, 16));
			}
		});
		rdbtn16.setBounds(131, 105, 64, 23);
		contentPane.add(rdbtn16);
		
		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(rdbtn12);
		grupo2.add(rdbtn14);
		grupo2.add(rdbtn16);	 
	}
}
