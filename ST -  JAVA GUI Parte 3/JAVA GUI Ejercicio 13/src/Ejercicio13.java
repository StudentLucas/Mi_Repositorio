import java.awt.BorderLayout;
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
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;


public class Ejercicio13 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio13 frame = new Ejercicio13();
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
	public Ejercicio13() {
		setTitle("Radio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 146, 111);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTexto = new JLabel("Color");
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTexto.setForeground(Color.BLUE);
		lblTexto.setBounds(37, 11, 51, 41);
		contentPane.add(lblTexto);
		
		JRadioButton rdbtnAzul = new JRadioButton("Azul");
		rdbtnAzul.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (rdbtnAzul.isSelected()==true)
					{lblTexto.setForeground(Color.BLUE);;}
				else
				{lblTexto.setForeground(Color.GREEN);}
	
			}
		});
		rdbtnAzul.setSelected(true);
		rdbtnAzul.setBounds(10, 56, 51, 23);
		contentPane.add(rdbtnAzul);
		
		JRadioButton rdbtnVerde = new JRadioButton("Verde");
		rdbtnVerde.setBounds(66, 56, 76, 23);
		contentPane.add(rdbtnVerde);
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtnAzul);
		grupo1.add(rdbtnVerde);
		 
	}
}
