import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Color;

import javax.swing.JLabel;



public class Ejercicio27 extends JFrame {

	private static final long serialVersionUID = -8841189848878279546L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup2 = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio27 frame = new Ejercicio27();
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
	public Ejercicio27() {
		setTitle("Area de texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 50, 207, 264);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		scrollPane.setViewportView(textArea);
		
		//
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(335, 353, 115, 29);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		contentPane.add(btnSalir);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(317, 56, 133, 20);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//String t;
				//int pos,cant;
				int pos;
				//t =(String) comboBox.getSelectedItem();
				//lblTexto.setText(t);
				//lblA.setText(t);
				pos=comboBox.getSelectedIndex();
				//lblB.setText(Integer.toString(pos));
				//lblNumero.setText(Integer.toString(pos));
				//cant=comboBox.getItemCount();
				//lblCantidad.setText(Integer.toString(cant));
				if (pos==0){
					textArea.setLineWrap(false);
					textArea.setWrapStyleWord(false);
					
					//
				}
				if (pos==1){
					textArea.setLineWrap(true);
					textArea.setWrapStyleWord(false);
					
					//
				}
				if (pos==2){
					textArea.setLineWrap(true);
					textArea.setWrapStyleWord(true);
					
					//
				}
			}
		});
		comboBox.addItem("Sin Ajuste");
		comboBox.addItem("Ajuste por Letra");
		comboBox.addItem("Ajuste por Palabra");
		contentPane.add(comboBox);
		
		/*
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String t;
				int pos,cant;
				t =(String) comboBox_1.getSelectedItem();
				//lblTexto.setText(t);
				lblA.setText(t);
				pos=comboBox_1.getSelectedIndex();
				lblB.setText(Integer.toString(pos));
				//lblNumero.setText(Integer.toString(pos));
				cant=comboBox_1.getItemCount();
				//lblCantidad.setText(Integer.toString(cant));
				if (pos==0){
					textArea.setBackground(Color.WHITE);
				}
				if (pos==1){
					textArea.setBackground(Color.RED);
				}
				if (pos==2){
					textArea.setBackground(Color.BLUE);
				}
				if (pos==3){
					textArea.setBackground(Color.GREEN);
				}
			}
		});
		comboBox_1.setBounds(461, 155, 87, 20);
		comboBox_1.addItem("Blanco");
		comboBox_1.addItem("Rojo");
		comboBox_1.addItem("Azul");
		comboBox_1.addItem("Verde");
		contentPane.add(comboBox_1);
		*/
		
		JCheckBox chckbxNegrita = new JCheckBox("Negrita");
		chckbxNegrita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Font auxFont=textArea.getFont(); 
				int i=0,n=0;
				if (textArea.getFont().isItalic()==true)
					{i=Font.ITALIC;}
					if (chckbxNegrita.isSelected())
						{n=Font.BOLD;
						
						}
					textArea.setFont(new Font(auxFont.getName(), n+i, auxFont.getSize()));

			}
		});
		
		chckbxNegrita.setBounds(317, 113, 97, 23);
		contentPane.add(chckbxNegrita);
		
		JCheckBox chckbxItalic = new JCheckBox("Italic");
		chckbxItalic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Font auxFont=textArea.getFont(); 
				int i=0,n=0;
				if (textArea.getFont().isBold()==true)
					{n=Font.BOLD;}
					if (chckbxItalic.isSelected())
						{i=Font.ITALIC;
						
						}
					textArea.setFont(new Font(auxFont.getName(), n+i, auxFont.getSize()));

			}
		});
		chckbxItalic.setBounds(448, 113, 97, 23);
		contentPane.add(chckbxItalic);
		
		JButton btnTextoDePrueba = new JButton("Texto de Prueba");
		btnTextoDePrueba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("24) En el ejercicio anterior quitar los botones de opción y reemplazarlos por un ComboBox. Agregar dos grupos de botones de opción para elegir color de fondo y letras. Usar un CheckBox para tipografía negrita y otro para itálica.");
			}
		});
		btnTextoDePrueba.setBounds(219, 409, 133, 29);
		contentPane.add(btnTextoDePrueba);
		
		JRadioButton rdbtnVerde = new JRadioButton("Verde");
		rdbtnVerde.setBounds(324, 274, 63, 23);
		contentPane.add(rdbtnVerde);
		rdbtnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setForeground(Color.GREEN);
			}
		});
		buttonGroup.add(rdbtnVerde);
		
		JRadioButton rdbtnAzul = new JRadioButton("Azul");
		rdbtnAzul.setBounds(324, 242, 63, 29);
		contentPane.add(rdbtnAzul);
		rdbtnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setForeground(Color.BLUE);
			}
		});
		buttonGroup.add(rdbtnAzul);
		
		JRadioButton rdbtnRojo = new JRadioButton("Rojo");
		rdbtnRojo.setBounds(324, 210, 63, 29);
		contentPane.add(rdbtnRojo);
		rdbtnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setForeground(Color.RED);
			}
		});
		buttonGroup.add(rdbtnRojo);
		
		JRadioButton rdbtnNegro = new JRadioButton("Negro");
		rdbtnNegro.setBounds(324, 184, 63, 23);
		contentPane.add(rdbtnNegro);
		rdbtnNegro.setSelected(true);
		rdbtnNegro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setForeground(Color.BLACK);
			}
		});
		buttonGroup.add(rdbtnNegro);
		
		
		JLabel lblLetras = new JLabel("Letras :");
		lblLetras.setBounds(336, 163, 51, 14);
		contentPane.add(lblLetras);
		lblLetras.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JRadioButton rdbtnVerde2 = new JRadioButton("Verde");
		rdbtnVerde2.setBounds(448, 271, 79, 29);
		contentPane.add(rdbtnVerde2);
		rdbtnVerde2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setBackground(Color.GREEN);
			}
		});
		buttonGroup2.add(rdbtnVerde2);
		
		JRadioButton rdbtnAzul2 = new JRadioButton("Azul");
		rdbtnAzul2.setBounds(448, 242, 79, 29);
		contentPane.add(rdbtnAzul2);
		rdbtnAzul2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setBackground(Color.BLUE);
			}
		});
		buttonGroup2.add(rdbtnAzul2);
		
		JRadioButton rdbtnRojo2 = new JRadioButton("Rojo");
		rdbtnRojo2.setBounds(448, 210, 79, 29);
		contentPane.add(rdbtnRojo2);
		rdbtnRojo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setBackground(Color.RED);
			}
		});
		buttonGroup2.add(rdbtnRojo2);
		
		// fondo:
		
		JRadioButton rdbtnBlanco = new JRadioButton("Blanco");
		rdbtnBlanco.setBounds(448, 181, 79, 29);
		contentPane.add(rdbtnBlanco);
		rdbtnBlanco.setSelected(true);
		rdbtnBlanco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setBackground(Color.WHITE);
			}
		});
		buttonGroup2.add(rdbtnBlanco);
		
		JLabel lblFondo = new JLabel("Fondo :");
		lblFondo.setBounds(463, 164, 64, 14);
		contentPane.add(lblFondo);
		lblFondo.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(117, 353, 115, 29);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textArea.setBackground(Color.WHITE);
				textArea.setForeground(Color.BLACK);
				rdbtnNegro.setSelected(true);
				rdbtnBlanco.setSelected(true);
				chckbxNegrita.setSelected(false);
				chckbxItalic.setSelected(false);
			}
		});
		contentPane.add(btnBorrar);
	}
}
