import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Ejercicio09 extends JFrame {

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
					Ejercicio09 frame = new Ejercicio09();
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
	public Ejercicio09() {
		setTitle("Sumador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 258, 171);
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
		
		//campo texto 1
		
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
		
		//campo texto 2
		
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
		
		//campo texto 3
		
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
					{txtNro1.requestFocus();
					 txtNro1.setText("");
					}
				else
					{if (! isNumeric(num2))
						{txtNro2.requestFocus();
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
				System.exit(0);
			}
		});
		btnSalir.setBounds(176, 112, 64, 23);
		contentPane.add(btnSalir);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(113, 75, 104, 2);
		contentPane.add(separator);
	}
}
