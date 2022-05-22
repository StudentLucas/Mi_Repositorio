import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import java.awt.Font;


public class Ejercicio08 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNro1;
	private JTextField txtNro2;
	private JTextField txtSuma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio08 frame = new Ejercicio08();
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
	public Ejercicio08() {
		setTitle("Sumador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrimerNmero = new JLabel("Primer numero:");
		lblPrimerNmero.setFont(new Font("Microsoft YaHei UI", Font.BOLD | Font.ITALIC, 12));
		lblPrimerNmero.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimerNmero.setBounds(10, 6, 194, 30);
		contentPane.add(lblPrimerNmero);
		
		JLabel lblSegundoNmero = new JLabel("Segundo numero:");
		lblSegundoNmero.setFont(new Font("Microsoft YaHei", Font.BOLD | Font.ITALIC, 12));
		lblSegundoNmero.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundoNmero.setBounds(10, 47, 194, 30);
		contentPane.add(lblSegundoNmero);
		
		JLabel lblSuma = new JLabel("Suma:");
		lblSuma.setFont(new Font("Microsoft YaHei", Font.BOLD | Font.ITALIC, 12));
		lblSuma.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuma.setBounds(10, 102, 194, 30);
		contentPane.add(lblSuma);
		
		txtNro1 = new JTextField();
		txtNro1.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {
				txtSuma.setText("");					// b)
			}
		});
		txtNro1.setBounds(283, 11, 110, 20);
		contentPane.add(txtNro1);
		txtNro1.setColumns(10);
		
		txtNro2 = new JTextField();
		txtNro2.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {
				txtSuma.setText("");					// b)
			}
		});

		txtNro2.setBounds(283, 57, 110, 20);
		contentPane.add(txtNro2);
		txtNro2.setColumns(10);
		
		txtSuma = new JTextField();
		txtSuma.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent arg0) {
				txtNro1.requestFocus(); 					// a)
			}
		});
		txtSuma.setBounds(283, 107, 110, 20);
		contentPane.add(txtSuma);
		txtSuma.setColumns(10);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.setFont(new Font("Microsoft YaHei", Font.BOLD | Font.ITALIC, 12));
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float n1,n2,s;
				String num1,num2,suma;
				num1=txtNro1.getText();
				n1=Float.parseFloat(num1);
				num2=txtNro2.getText();
				n2=Float.parseFloat(num2);
				s=n1+n2;
				suma=Float.toString(s);
				txtSuma.setText(suma);
			}
		});
		btnSumar.setBounds(10, 168, 110, 30);
		contentPane.add(btnSumar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Microsoft YaHei", Font.BOLD | Font.ITALIC, 13));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNro1.setText("");
				txtNro2.setText("");
				txtSuma.setText("");
				txtNro1.requestFocus();						// c)
			}
		});
		btnLimpiar.setBounds(142, 168, 110, 30);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Microsoft YaHei", Font.BOLD | Font.ITALIC, 14));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(284, 168, 110, 28);
		contentPane.add(btnSalir);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(293, 88, 100, 2);
		contentPane.add(separator);
	}
}
