import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class Ejercicio19 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio19 frame = new Ejercicio19();
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
	public Ejercicio19() {
		setTitle("ComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTextoDePrueba = new JLabel("Texto de prueba");
		lblTextoDePrueba.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLUE, null, null, null));
		lblTextoDePrueba.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoDePrueba.setBounds(105, 11, 160, 31);
		contentPane.add(lblTextoDePrueba);
		
		JLabel lblTipografia = new JLabel("Tipografia");
		lblTipografia.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipografia.setBounds(29, 63, 64, 14);
		contentPane.add(lblTipografia);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setHorizontalAlignment(SwingConstants.CENTER);
		lblColor.setBounds(159, 63, 46, 14);
		contentPane.add(lblColor);
		
		JComboBox<String>  comboBox = new JComboBox<String>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (comboBox.getSelectedItem()== "Arial"){
					lblTextoDePrueba.setFont(new Font("Arial", Font.BOLD, 12));
				}
				if (comboBox.getSelectedItem()== "Times New Roman"){
					lblTextoDePrueba.setFont(new Font("Times New Roman", Font.BOLD, 14));
				}
				if (comboBox.getSelectedItem()== "Tahoma"){
					lblTextoDePrueba.setFont(new Font("Tahoma", Font.BOLD, 16));
				}
					
			}
		});
		comboBox.setBounds(10, 88, 107, 20);
		comboBox.addItem("Arial");
		comboBox.addItem("Times New Roman");
		comboBox.addItem("Tahoma");
		
		
		
		contentPane.add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
				if (comboBox_1.getSelectedItem()== "Negro"){
					lblTextoDePrueba.setForeground(Color.BLACK);
				}
				if (comboBox_1.getSelectedItem()== "Rojo"){
					lblTextoDePrueba.setForeground(Color.RED);
				}
				if (comboBox_1.getSelectedItem()== "Azul"){
					lblTextoDePrueba.setForeground(Color.BLUE);
				}
				
			}
		});
		comboBox_1.setBounds(137, 88, 93, 20);
		comboBox_1.addItem("Negro");
		comboBox_1.addItem("Rojo");
		comboBox_1.addItem("Azul");
		
		contentPane.add(comboBox_1);
		
		JCheckBox chckbxNegrita = new JCheckBox("Negrita");
		chckbxNegrita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0,n=0;
				if (lblTextoDePrueba.getFont().isItalic()==true)
					{i=Font.ITALIC;}
					if (chckbxNegrita.isSelected())
						{n=Font.BOLD;
						
						}
					lblTextoDePrueba.setFont(new Font("Tahoma", n+i, 14));
			}
		});
		chckbxNegrita.setBounds(254, 87, 75, 23);
		contentPane.add(chckbxNegrita);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);;
			}
		});
		btnSalir.setBounds(335, 87, 89, 23);
		contentPane.add(btnSalir);
	}
}
