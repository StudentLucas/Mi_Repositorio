import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Ejercicio29 extends JFrame {

	private JPanel contentPane;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	int x;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio29 frame = new Ejercicio29();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ejercicio29() {
		
		setTitle("Aleatorios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 184);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAleatorioEntre = new JLabel("Aleatorio entre 1 y 6:");
		lblAleatorioEntre.setBounds(21, 23, 120, 14);
		contentPane.add(lblAleatorioEntre);
		
		JLabel lblAleatorioEntre_1 = new JLabel("Aleatorio entre 0 y 99:");
		lblAleatorioEntre_1.setBounds(21, 64, 139, 14);
		contentPane.add(lblAleatorioEntre_1);
		
		JLabel lblAleatorioEntre_2 = new JLabel("Aleatorio entre 10 y 20:");
		lblAleatorioEntre_2.setBounds(21, 107, 139, 14);
		contentPane.add(lblAleatorioEntre_2);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				x=(int) (Math.random()*6)+1;
				lbl1.setText(""+x);
			}
		});
		btnGenerar.setBounds(167, 19, 91, 23);
		contentPane.add(btnGenerar);
		
		JButton btnGenerar_1 = new JButton("Generar");
		btnGenerar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				x=(int) (Math.random()*100);
				lbl2.setText(""+x);
			}
		});
		btnGenerar_1.setBounds(167, 60, 91, 23);
		contentPane.add(btnGenerar_1);
		
		JButton btnGenerar_2 = new JButton("Generar");
		btnGenerar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				x=(int) (Math.random()*(20-10+1))+10;
				lbl3.setText(""+x);
			}
		});
		btnGenerar_2.setBounds(167, 103, 91, 23);
		contentPane.add(btnGenerar_2);
		
		lbl1 = new JLabel("");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl1.setBounds(284, 23, 46, 14);
		contentPane.add(lbl1);
		
		lbl2 = new JLabel("");
		lbl2.setBounds(284, 64, 46, 14);
		contentPane.add(lbl2);
		
		lbl3 = new JLabel("");
		lbl3.setBounds(284, 107, 46, 14);
		contentPane.add(lbl3);
	}
}

