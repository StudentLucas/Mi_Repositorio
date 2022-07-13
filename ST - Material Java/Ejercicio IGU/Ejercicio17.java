import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;


public class Ejercicio17 extends JFrame {

	private JPanel contentPane;
	private JLabel lblFneg;
	private JLabel lblCpos;
	private JLabel lblFpos;
	private JLabel lblC;
	private JLabel lblF;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JLabel label;
	private JLabel label_1;
	private JSeparator separator_6;
	private JSeparator separator_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio17 frame = new Ejercicio17();
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
	public Ejercicio17() {
		setTitle("Temperaturas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 210, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
						
		JLabel lblCneg = new JLabel("-100");
		lblCneg.setBounds(34, 217, 31, 20);
		contentPane.add(lblCneg);
		
		lblFneg = new JLabel("-148");
		lblFneg.setBounds(127, 217, 31, 20);
		contentPane.add(lblFneg);
		
		lblCpos = new JLabel("200");
		lblCpos.setBounds(41, 33, 24, 26);
		contentPane.add(lblCpos);
		
		lblFpos = new JLabel("392");
		lblFpos.setBounds(127, 33, 31, 26);
		contentPane.add(lblFpos);
		
		lblC = new JLabel("0 \u00B0C");
		lblC.setForeground(Color.BLUE);
		lblC.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblC.setBounds(23, 272, 66, 26);
		contentPane.add(lblC);
		
		lblF = new JLabel("32 \u00B0F");
		lblF.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblF.setForeground(Color.BLUE);
		lblF.setBounds(110, 272, 66, 26);
		contentPane.add(lblF);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setValue(200);
		scrollBar.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent arg0) {
				float vc,vf;
				String vcs,vfs;			
				vc=200-scrollBar.getValue();
				vcs=Float.toString(vc);
				lblC.setText(vcs+" \u00B0C");
				vf= (float) (1.8 * vc + 32.0);
				vfs=Float.toString(vf);
				lblF.setText(vfs+" \u00B0F");
			}
		});
		scrollBar.setMaximum(310);
		scrollBar.setMinimum(0);
		scrollBar.setBounds(86, 33, 16, 210);
		scrollBar.setValue(200);
		contentPane.add(scrollBar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(56, 50, 24, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(56, 231, 24, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(100, 50, 24, 2);
		contentPane.add(separator_2);
		
		separator_3 = new JSeparator();
		separator_3.setBounds(100, 230, 24, 2);
		contentPane.add(separator_3);
		
		separator_4 = new JSeparator();
		separator_4.setBounds(100, 167, 24, 2);
		contentPane.add(separator_4);
		
		separator_5 = new JSeparator();
		separator_5.setBounds(56, 167, 24, 2);
		contentPane.add(separator_5);
		
		label = new JLabel("0");
		label.setBounds(49, 155, 16, 26);
		contentPane.add(label);
		
		label_1 = new JLabel("32");
		label_1.setBounds(127, 155, 31, 26);
		contentPane.add(label_1);
		
		separator_7 = new JSeparator();
		separator_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		separator_7.setBounds(10, 264, 177, 40);
		contentPane.add(separator_7);
		
		
	}
}
