import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Ejercicio11 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio11 frame = new Ejercicio11();
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
	public Ejercicio11() {
		setTitle("Escurridiza");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 268, 250);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFoto = new JLabel("Foto");
		lblFoto.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				if (lblFoto.getX()==10)
					{lblFoto.setLocation(150, 10);}
				else
				{lblFoto.setLocation(10, 10);}
			}
		});
		lblFoto.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblFoto.setIcon(new ImageIcon("/Ejercicios Java/Programacion Ejercicio 11/src/Imagen.png"));
		lblFoto.setBounds(122, 59, 92, 97);
		lblFoto.setLocation(10, 10);
		contentPane.add(lblFoto);
		
		JButton btnOcultar = new JButton("");
		btnOcultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblFoto.setVisible(false);}
				
		});
		btnOcultar.setIcon(new ImageIcon("/Ejercicios Java/Programacion Ejercicio 11/src/Ocultar.jpg"));
		btnOcultar.setBounds(34, 143, 68, 65);
		contentPane.add(btnOcultar);
		
		JLabel lblMensaje = new JLabel("Haga Click sobre la foto ...");
		lblMensaje.setBounds(56, 118, 146, 14);
		contentPane.add(lblMensaje);
		
		JButton btnVer = new JButton("");
		btnVer.setIcon(new ImageIcon("/Ejercicios Java/Programacion Ejercicio 11/src/Ver.jpg"));
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblFoto.setVisible(true);
			}
		});
		btnVer.setBounds(151, 143, 68, 65);
		contentPane.add(btnVer);
	}
}
