import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio18 extends JFrame {

	private JPanel contentPane;
	private JTextField txtTextoagregado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio18 frame = new Ejercicio18();
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
	
public Ejercicio18() {
		setTitle("ComboBox Ejercicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTexto = new JLabel("Texto");
		lblTexto.setBounds(139, 15, 46, 14);
		contentPane.add(lblTexto);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(193, 15, 46, 14);
		contentPane.add(lblNumero);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(249, 15, 46, 14);
		contentPane.add(lblCantidad);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				String t;
				int pos,cant;
				t =(String) comboBox.getSelectedItem();
				lblTexto.setText(t);
				pos=comboBox.getSelectedIndex();
				lblNumero.setText(Integer.toString(pos));
				cant=comboBox.getItemCount();
				lblCantidad.setText(Integer.toString(cant));
				
			}
		});
		comboBox.setBounds(148, 40, 125, 22);
		comboBox.addItem("Norte");
		comboBox.addItem("Sur");
		comboBox.addItem("Este");
		comboBox.addItem("Oeste");
		
		contentPane.add(comboBox);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ta;
				ta=txtTextoagregado.getText();
				comboBox.addItem(ta);
				
			}
		});
		btnAgregar.setBounds(10, 76, 91, 23);
		contentPane.add(btnAgregar);
		
		txtTextoagregado = new JTextField();
		txtTextoagregado.setText("TextoAgregado");
		txtTextoagregado.setBounds(10, 114, 86, 20);
		contentPane.add(txtTextoagregado);
		txtTextoagregado.setColumns(10);
		
		JButton btnBorrarActual = new JButton("Borrar Actual");
		btnBorrarActual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox.removeItemAt(comboBox.getSelectedIndex());
			}
		});
		btnBorrarActual.setBounds(10, 11, 119, 23);
		contentPane.add(btnBorrarActual);
		
		JButton btnBorraTodo = new JButton("Borra Todo");
		btnBorraTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox.removeAllItems();
			}
		});
		btnBorraTodo.setBounds(305, 11, 119, 23);
		contentPane.add(btnBorraTodo);
		
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
