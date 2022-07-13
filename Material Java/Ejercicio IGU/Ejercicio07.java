import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.border.BevelBorder;


public class Ejercicio07 extends JFrame {

	private JPanel contentPane;
	private JTextField textPrimerNum;
	private JTextField textSegundoNum;
	private JTextField textSumaTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio07 frame = new Ejercicio07();
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
	public Ejercicio07() {
		setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		setTitle("Sumador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Primer numero:");
		lblNewLabel.setBounds(10, 32, 194, 30);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Segundo numero:");
		lblNewLabel_1.setBounds(10, 86, 194, 30);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Suma:");
		lblNewLabel_2.setBounds(10, 153, 194, 30);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);
		
		textPrimerNum = new JTextField();
		textPrimerNum.setBounds(244, 30, 180, 32);
		textPrimerNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		contentPane.add(textPrimerNum);
		textPrimerNum.setColumns(10);
		
		textSegundoNum = new JTextField();
		textSegundoNum.setBounds(244, 86, 180, 30);
		contentPane.add(textSegundoNum);
		textSegundoNum.setColumns(10);
		
		textSumaTotal = new JTextField();
		textSumaTotal.setBounds(244, 155, 180, 30);
		contentPane.add(textSumaTotal);
		textSumaTotal.setColumns(10);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.setBounds(23, 214, 105, 37);
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float n1,n2,s;     
				String num1,num2,suma;     
				num1=textPrimerNum.getText();     
				n1=Float.parseFloat(num1);     
				num2=textSegundoNum.getText();    
				n2=Float.parseFloat(num2);     
				s=n1+n2;     
				suma=Float.toString(s);     
				textSumaTotal.setText(suma); 
			}
		});
		contentPane.add(btnSumar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPrimerNum.setText("");
				textSegundoNum.setText("");
				textSumaTotal.setText("");
			}
		});
		btnLimpiar.setBounds(162, 214, 105, 37);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(306, 214, 105, 37);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		contentPane.add(btnSalir);
		
		JSeparator separator = new JSeparator();
		separator.setOpaque(true);
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(211, 142, 213, 2);
		contentPane.add(separator);
	}
}
