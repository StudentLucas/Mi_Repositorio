import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio26 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio26 frame = new Ejercicio26();
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
	public Ejercicio26() {
		setTitle("Area de texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 50, 207, 264);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		scrollPane.setViewportView(textArea);
		
		JRadioButton rdbtnSinajuste = new JRadioButton("Sin Ajuste");
		rdbtnSinajuste.setSelected(true);
		rdbtnSinajuste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setLineWrap(false);
				textArea.setWrapStyleWord(false);

			}
		});
		buttonGroup.add(rdbtnSinajuste);
		rdbtnSinajuste.setBounds(317, 99, 155, 29);
		contentPane.add(rdbtnSinajuste);
		
		JRadioButton rdbtnAjusteletra = new JRadioButton("Ajuste por Letra");
		rdbtnAjusteletra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setLineWrap(true);
				textArea.setWrapStyleWord(false);
			}
		});
		buttonGroup.add(rdbtnAjusteletra);
		rdbtnAjusteletra.setBounds(317, 158, 155, 29);
		contentPane.add(rdbtnAjusteletra);
		
		JRadioButton rdbtnAjustepalabra = new JRadioButton("Ajuste por Palabra");
		rdbtnAjustepalabra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setLineWrap(true);
				textArea.setWrapStyleWord(true);
			}
		});
		buttonGroup.add(rdbtnAjustepalabra);
		rdbtnAjustepalabra.setBounds(317, 215, 183, 29);
		contentPane.add(rdbtnAjustepalabra);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnBorrar.setBounds(117, 353, 115, 29);
		contentPane.add(btnBorrar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(335, 353, 115, 29);
		contentPane.add(btnSalir);
	}
}

