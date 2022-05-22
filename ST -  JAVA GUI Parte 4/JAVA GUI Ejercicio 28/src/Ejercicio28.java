import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JScrollPane;



public class Ejercicio28 extends JFrame {

	private JPanel contentPane;
        private JTextPane textpane;
        
        
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio28 frame = new Ejercicio28();
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
	public Ejercicio28() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 230, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Archivo = new JMenu("Archivo");
		menuBar.add(Archivo);
		
		JMenu Texto = new JMenu("Texto");
		menuBar.add(Texto);
		
		JMenu mnColor = new JMenu("Color");
		Texto.add(mnColor);
		
		JMenu Tamaño = new JMenu("Tama\u00F1o");
		Texto.add(Tamaño);
				
		JMenu Alineacion = new JMenu("Alineacion");
		menuBar.add(Alineacion);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 5, 205, 190);
		contentPane.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(5, 5, 205, 190);
		contentPane.add(textPane);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(335, 353, 115, 29);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(57, 206, 90, 20);
		contentPane.add(btnSalir);
		
		JMenuItem Limpiar = new JMenuItem("Limpiar");
		Limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("");
				textPane.setForeground(Color.BLACK);
			}
		});
		Archivo.add(Limpiar);
		
		JMenuItem Salir = new JMenuItem("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		Archivo.add(Salir);
		

		JMenuItem Negro = new JMenuItem("Negro");
		Negro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setForeground(Color.BLACK);
			}
		});
		mnColor.add(Negro);
		

		JMenuItem Azul = new JMenuItem("Azul");
		Azul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setForeground(Color.BLUE);
			}
		});
		mnColor.add(Azul);
		
		JMenuItem Rojo = new JMenuItem("Rojo");
		Rojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setForeground(Color.RED);
			}
		});
		mnColor.add(Rojo);
		
		JMenuItem Item10 = new JMenuItem("10");
		Item10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setFont(new Font("Arial", Font.PLAIN, 10));
			}
		});
		Tamaño.add(Item10);
		
		JMenuItem Item12 = new JMenuItem("12");
		Item12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setFont(new Font("Arial", Font.PLAIN, 12));
			}
		});
		Tamaño.add(Item12);
		
		JMenuItem Item14 = new JMenuItem("14");
		Item14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setFont(new Font("Arial", Font.PLAIN, 14));
			}
		});
		Tamaño.add(Item14);
		
		JMenuItem SinAjuste = new JMenuItem("Sin Ajuste");
		SinAjuste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//textPane.setLineWrap(false);
				//textPane.setWrapStyleWord(false);
			}
		});
		Alineacion.add(SinAjuste);
		

		JMenuItem AjustePorLetra = new JMenuItem("Ajuste Por Letra");
		AjustePorLetra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//textPane.setLineWrap(true);
				//textPane.setWrapStyleWord(false);
			}
		});
		Alineacion.add(AjustePorLetra);
		
		JMenuItem AjustePorPalabra = new JMenuItem("Ajuste Por Palabra");
		AjustePorPalabra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//textPane.setLineWrap(true);
				//textPane.setWrapStyleWord(true);
			}
		});
		Alineacion.add(AjustePorPalabra);
		
	}
}
