import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;


public class Ejercicio16 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio16 frame = new Ejercicio16();
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
	public Ejercicio16() {
		setTitle("Barra de desplazamiento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 185);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTexto = new JLabel("Texto");
		lblTexto.setBounds(91, 11, 34, 14);
		contentPane.add(lblTexto);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setMinimum(10);
		scrollBar.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent arg0) {
				lblTexto.setLocation(scrollBar.getValue(), lblTexto.getY());
				
			}
		});
		scrollBar.setBlockIncrement(100);
		scrollBar.setUnitIncrement(10);
		scrollBar.setMaximum(10+300-34);
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		scrollBar.setBounds(10, 36, 300, 23);
		contentPane.add(scrollBar);
		
		JButton btnIzquierda = new JButton("Izquierda");
		btnIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				scrollBar.setValue(10);
			}
		});
		btnIzquierda.setBounds(10, 85, 91, 23);
		contentPane.add(btnIzquierda);
		
		JButton btnDerecha = new JButton("Derecha");
		btnDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				scrollBar.setValue(10+300-34);
			}
		});
		btnDerecha.setBounds(219, 85, 91, 23);
		contentPane.add(btnDerecha);
		
		JCheckBox chckbxRojo = new JCheckBox("Rojo");
		chckbxRojo.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if ( chckbxRojo.isSelected() )
				{lblTexto.setForeground(Color.RED);}
				else
				{lblTexto.setForeground(Color.BLACK);}	
			}
		});
		chckbxRojo.setBounds(131, 85, 61, 23);
		contentPane.add(chckbxRojo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(126, 125, 66, 23);
		contentPane.add(btnSalir);
		
		
	}
}
