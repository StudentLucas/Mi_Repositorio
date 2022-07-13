import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ejercicio06 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio06 frame = new Ejercicio06();
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
	public Ejercicio06() {
		setTitle("Movimiento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setOpaque(true);
		lblNewLabel1.setForeground(Color.RED);
		lblNewLabel1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel1.setBackground(Color.RED);
		lblNewLabel1.setBounds(10, 11, 19, 20);
		contentPane.add(lblNewLabel1);
		
		JButton btnIzquierda = new JButton("Izquierda");
		btnIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int x,y;
				 x=lblNewLabel1.getX();
				 y=lblNewLabel1.getY();
				 x=x-10;
				 if (x<10)
				 {x=10;
				 }
				 lblNewLabel1.setLocation(x,y); 			
			}
		});
		btnIzquierda.setBounds(61, 216, 131, 35);
		contentPane.add(btnIzquierda);
		
		JButton btnDerecha = new JButton("Derecha");
		btnDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x,y,xf;
				 x=lblNewLabel1.getX();
				 y=lblNewLabel1.getY();
				 x=x+10;
				 xf=410+0-5;
				 if (x>xf)
				 {x=xf;
				 }
				 lblNewLabel1.setLocation(x, y);
			}
		});
		btnDerecha.setBounds(247, 216, 131, 35);
		contentPane.add(btnDerecha);
	}

}
