import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class Ejercicio12 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio12 frame = new Ejercicio12();
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
	public Ejercicio12() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Imagen.PNG"));
		setTitle("Check Box");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 211, 139);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTexto = new JLabel("Texto de prueba");
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTexto.setBounds(50, 25, 125, 23);
		contentPane.add(lblTexto);
		
		JCheckBox chckbxNegrita = new JCheckBox("Negrita");
		chckbxNegrita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=0,n=0;
				if (lblTexto.getFont().isItalic()==true)
					{i=Font.ITALIC;}
					if (chckbxNegrita.isSelected())
						{n=Font.BOLD;
						
						}
					lblTexto.setFont(new Font("Tahoma", n+i, 14));
			}
		});
		chckbxNegrita.setBounds(6, 67, 97, 23);
		contentPane.add(chckbxNegrita);
		
		JCheckBox chckbxItalica = new JCheckBox("It\u00E1lica");
		chckbxItalica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=0,n=0;
				if (lblTexto.getFont().isBold()==true)
					{n=Font.BOLD;}
					if (chckbxItalica.isSelected())
						{i=Font.ITALIC;
						
						}
					lblTexto.setFont(new Font("Tahoma", n+i, 14));
			}
		});
		chckbxItalica.setBounds(142, 67, 97, 23);
		contentPane.add(chckbxItalica);
	}
}

