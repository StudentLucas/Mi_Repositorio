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
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio10 extends JFrame {

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
					Ejercicio10 frame = new Ejercicio10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public boolean isNumeric(String str) 
    {try {
	     Float.parseFloat(str);
          return true;
         } 
     catch (NumberFormatException nfe) 
         {
		return false;
	    }
    }
	
	
	
	/**
	 * Create the frame.
	 */
	public Ejercicio10() {
		
		setTitle("Sumador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 254, 171);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrimerNmero = new JLabel("Primer n\u00FAmero:");
		lblPrimerNmero.setBounds(20, 11, 109, 22);
		contentPane.add(lblPrimerNmero);
		
		JLabel lblSegundoNmero = new JLabel("Segundo n\u00FAmero:");
		lblSegundoNmero.setBounds(20, 44, 109, 30);
		contentPane.add(lblSegundoNmero);
		
		JLabel lblSuma = new JLabel("Suma:");
		lblSuma.setBounds(20, 80, 66, 22);
		contentPane.add(lblSuma);
		
		txtNro1 = new JTextField();
		txtNro1.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {
				txtSuma.setText("");
				setTitle("Sumador");
			}
		});
		txtNro1.setBounds(130, 12, 74, 20);
		contentPane.add(txtNro1);
		txtNro1.setColumns(10);
		
		txtNro2 = new JTextField();
		txtNro2.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {
				txtSuma.setText("");
				setTitle("Sumador");
				
			}
		});

		txtNro2.setBounds(130, 44, 74, 20);
		contentPane.add(txtNro2);
		txtNro2.setColumns(10);
		
		txtSuma = new JTextField();
		txtSuma.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent arg0) {
				txtNro1.requestFocus();
			}
		});
		txtSuma.setBounds(130, 81, 74, 20);
		contentPane.add(txtSuma);
		txtSuma.setColumns(10);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float n1,n2,s;
				String num1,num2,suma;
				num1=txtNro1.getText();
				num2=txtNro2.getText();
				if (! isNumeric(num1))
					{JOptionPane.showMessageDialog(null, "El primer número no es válido.","Error",JOptionPane.ERROR_MESSAGE);			// a)
					 txtNro1.requestFocus();
					 txtNro1.setText("");
					 
					}
				else
					{if (! isNumeric(num2))
						{JOptionPane.showMessageDialog(null, "El segundo número no es válido.","Error",JOptionPane.ERROR_MESSAGE);		// a)
						 txtNro2.requestFocus();
					     txtNro2.setText("");
					    }
					else
						{
				   		 n1=Float.parseFloat(num1);
				         n2=Float.parseFloat(num2);
				         s=n1+n2;
				         suma=Float.toString(s);
				         txtSuma.setText(suma);
				         setTitle("Sumador = " + s);
						}
					}
			}
			
		});
		btnSumar.setBounds(4, 112, 74, 23);
		contentPane.add(btnSumar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNro1.setText("");
				txtNro2.setText("");
				txtSuma.setText("");
				txtNro1.requestFocus();
				setTitle("Sumador");
			}
		});
		btnLimpiar.setBounds(86, 113, 80, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int resp = JOptionPane.showConfirmDialog(null, "¿Seguro de salir?", "Confirmar", JOptionPane.YES_NO_OPTION);																	// b)
				if (resp==0)
					{
				     System.exit(0);
					}
			}
		});
		btnSalir.setBounds(176, 112, 64, 23);
		contentPane.add(btnSalir);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(113, 75, 104, 2);
		contentPane.add(separator);	
		
		JButton btnPn = new JButton("...");
		btnPn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String texto = JOptionPane.showInputDialog (null, "Primer número: ", "Ingreso de datos",JOptionPane.INFORMATION_MESSAGE);
				if (texto !=null)						// c)
					{if (texto.length()>0)
						{txtNro1.setText(texto);}
					}
				btnSumar.requestFocus();
				
				}
				
		
		});
		btnPn.setBounds(219, 11, 23, 23);
		contentPane.add(btnPn);
		
		JButton btnSn = new JButton("...");
		btnSn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String texto = JOptionPane.showInputDialog (null, "Segundo número: ", "Ingreso de datos",JOptionPane.INFORMATION_MESSAGE);
				if (texto !=null)							// c)
					{if (texto.length()>0)
						{txtNro2.setText(texto);}
					}
				btnSumar.requestFocus();
			}
		});
		btnSn.setBounds(219, 48, 23, 23);
		contentPane.add(btnSn);
	}
}
