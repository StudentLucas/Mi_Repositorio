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


public class Ejercicio14 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio14 frame = new Ejercicio14();
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
	public Ejercicio14() {
		setTitle("Radio 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 133, 173);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTexto = new JLabel("Color");
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTexto.setForeground(Color.BLUE);
		lblTexto.setBounds(35, 8, 51, 41);
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
		
			 
	}
}
