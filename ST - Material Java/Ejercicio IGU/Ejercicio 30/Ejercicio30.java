import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.util.Calendar;
import javax.swing.Timer;
import javax.swing.SwingConstants;



public class Ejercicio30 extends JFrame {

	String  data2,data3;
	int anio,mes,dia,horas,minutos,segundos,intervalo=500,x,pos=10,cam=0,aaa=55,num1,num2,parpadeo;
    static Calendar cal;
	
	private JPanel contentPane;
	private JTextField Numero;
	private Timer timer;
	
	private JLabel lbl_Napostado;
	private JLabel lbl_Resultado;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio30 frame = new Ejercicio30();
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
	public Ejercicio30() {
			
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 450, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 204));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Numero = new JTextField();
		Numero.setBounds(157, 397, 53, 19);
		Numero.setHorizontalAlignment(SwingConstants.CENTER);
		Numero.setBackground(new Color(204, 255, 255));
		Numero.setToolTipText("Elija un Número del 1 al 8");
		contentPane.add(Numero);
		
		JLabel lblNmeroDeApuesta = new JLabel("Número de Apuesta");
		lblNmeroDeApuesta.setBounds(12, 399, 127, 18);
		lblNmeroDeApuesta.setFont(new Font("Abyssinica SIL", Font.BOLD, 14));
		lblNmeroDeApuesta.setForeground(SystemColor.info);
		contentPane.add(lblNmeroDeApuesta);
		
		JLabel lblTimba = new JLabel("Timba 21");
		lblTimba.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimba.setBounds(105, 99, 152, 26);
		lblTimba.setFont(new Font("Lohit Devanagari", Font.BOLD | Font.ITALIC, 26));
		lblTimba.setForeground(SystemColor.info);
		contentPane.add(lblTimba);
		
		JLabel lblMomentoDeJugada = new JLabel("Momento de Jugada");
		lblMomentoDeJugada.setBounds(301, 225, 131, 18);
		lblMomentoDeJugada.setFont(new Font("Abyssinica SIL", Font.BOLD, 14));
		lblMomentoDeJugada.setForeground(SystemColor.info);
		contentPane.add(lblMomentoDeJugada);
		
		JLabel label = new JLabel("1");
		label.setBounds(12, 130, 42, 41);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setOpaque(true);
		label.setBackground(new Color(139, 0, 0));
		label.setForeground(new Color(50, 205, 50));
		label.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("2");
		label_1.setBounds(66, 130, 42, 41);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setOpaque(true);
		label_1.setForeground(new Color(50, 205, 50));
		label_1.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
		label_1.setBackground(new Color(0, 0, 0));
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("3");
		label_2.setBounds(120, 130, 42, 41);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setOpaque(true);
		label_2.setForeground(new Color(50, 205, 50));
		label_2.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
		label_2.setBackground(new Color(139, 0, 0));
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setBounds(174, 130, 42, 41);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setOpaque(true);
		label_3.setForeground(new Color(50, 205, 50));
		label_3.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
		label_3.setBackground(new Color(0, 0, 0));
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("5");
		label_4.setBounds(228, 130, 42, 41);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setOpaque(true);
		label_4.setForeground(new Color(50, 205, 50));
		label_4.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
		label_4.setBackground(new Color(139, 0, 0));
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("6");
		label_5.setBounds(282, 130, 42, 41);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setOpaque(true);
		label_5.setForeground(new Color(50, 205, 50));
		label_5.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
		label_5.setBackground(new Color(0, 0, 0));
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("7");
		label_6.setBounds(336, 130, 42, 41);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setOpaque(true);
		label_6.setForeground(new Color(50, 205, 50));
		label_6.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
		label_6.setBackground(new Color(139, 0, 0));
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("8");
		label_7.setBounds(390, 130, 42, 41);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setOpaque(true);
		label_7.setForeground(new Color(50, 205, 50));
		label_7.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
		label_7.setBackground(new Color(0, 0, 0));
		contentPane.add(label_7);
		
		JLabel lblFecha1 = new JLabel("");
		lblFecha1.setBounds(301, 250, 146, 26);
		lblFecha1.setForeground(Color.YELLOW);
		lblFecha1.setFont(new Font("Abyssinica SIL", Font.BOLD, 14));
		contentPane.add(lblFecha1);
		
		JLabel lblApuestaAlNumero = new JLabel("Aposto al Numero");
		lblApuestaAlNumero.setBounds(12, 226, 127, 26);
		lblApuestaAlNumero.setFont(new Font("Abyssinica SIL", Font.BOLD, 14));
		lblApuestaAlNumero.setForeground(Color.YELLOW);
		contentPane.add(lblApuestaAlNumero);
		
		JLabel lbl_Napostado = new JLabel("");
		lbl_Napostado.setBounds(141, 225, 42, 26);
		lbl_Napostado.setForeground(Color.YELLOW);
		contentPane.add(lbl_Napostado);
		
		JLabel lblSalioElNumero = new JLabel("Salio el Numero");
		lblSalioElNumero.setBounds(12, 278, 127, 15);
		lblSalioElNumero.setForeground(Color.YELLOW);
		lblSalioElNumero.setFont(new Font("Abyssinica SIL", Font.BOLD, 14));
		contentPane.add(lblSalioElNumero);
		
		JLabel lbl_Resultado = new JLabel("");
		lbl_Resultado.setBounds(133, 274, 50, 19);
		lbl_Resultado.setForeground(Color.YELLOW);
		lbl_Resultado.setFont(new Font("Abyssinica SIL", Font.BOLD, 14));
		contentPane.add(lbl_Resultado);
		
		JLabel lbl_Loteria = new JLabel("");
		lbl_Loteria.setIcon(new ImageIcon("/Ejercicios Java/Programacion Ejercicio 30/src/logo-loteria2013.png"));
		lbl_Loteria.setBounds(-17, 0, 478, 133);
		contentPane.add(lbl_Loteria);
		
		JLabel lblNewLabel = new JLabel("GANASTE!!");
		lblNewLabel.setVisible(false);
		lblNewLabel.setFont(new Font("Noto Sans Disp", Font.BOLD, 26));
		lblNewLabel.setForeground(new Color(50, 205, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 324, 131, 17);
		contentPane.add(lblNewLabel);
						
		JLabel lblPerdistes = new JLabel("PERDISTES!!");
		lblPerdistes.setVisible(false);
		lblPerdistes.setForeground(new Color(50, 205, 50));
		lblPerdistes.setFont(new Font("Noto Sans Disp", Font.BOLD, 24));
		lblPerdistes.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerdistes.setBounds(12, 320, 150, 25);
		contentPane.add(lblPerdistes);
		
		JLabel lbl_Flecha = new JLabel("");
		lbl_Flecha.setBounds(12, 172, 34, 41);
		lbl_Flecha.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Flecha.setIcon(new ImageIcon("/Ejercicios Java/Programacion Ejercicio 30/src/Flecha_arriba.svg.png"));
		contentPane.add(lbl_Flecha);
		
		JLabel lbl_espera = new JLabel("Espere Por Favor...");
		lbl_espera.setVisible(false);
		lbl_espera.setFont(new Font("NanumSquareRound Regular", Font.BOLD, 14));
		lbl_espera.setForeground(new Color(50, 205, 50));
		lbl_espera.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_espera.setBounds(282, 324, 148, 26);
		contentPane.add(lbl_espera);
		
		
		// inicializacion del Timer 1
		
		 timer = new Timer(intervalo, new ActionListener() {
			
			public void actionPerformed(ActionEvent ev) {
				
				if (pos>500-120){
					if (cam==0){
						aaa=-55;
						cam=1;
					}
				}
				if (pos<20){
					if (cam==1){
						aaa=55;
						cam=0;
					}
				}
				pos=pos+aaa;
				lbl_Flecha.setLocation(pos, 172);
				
				if (x==1){
					if (pos==10){
						timer.stop();
					} 
				}
				if (x==2){
					if (pos==65){
						timer.stop();
						}
				}
				if (x==3){
					if (pos==120){
						timer.stop();
						}
				}
				if (x==4){
					if (pos==175){
						timer.stop();
						}
				}	
				if (x==5){
					if (pos==230){
						timer.stop();
						}
				}
				if (x==6){
					if (pos==285){
						timer.stop();
						}
				}	
				if (x==7){
					if (pos==340){
						timer.stop();
						}
				}
				if (x==8){
					if (pos==395){
						timer.stop();
						}
				}		
				
				// Si Gano o Perdio
				
				data2 = lbl_Napostado.getText();
				data3 = lbl_Resultado.getText();
				num1 =Integer.parseInt(data2);
				num2 =Integer.parseInt(data3);
				
				if (num1 == num2 ) {
					lblNewLabel.setVisible(true);
					lblPerdistes.setVisible(false);
				}else {
					lblNewLabel.setVisible(false);
					lblPerdistes.setVisible(true);
				}
			}
	 } ) ;

		
		JButton btnJugar = new JButton("Apostar");
		btnJugar.setBounds(12, 440, 82, 28);
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					
					String data;
					data = Numero.getText();
					lbl_Napostado.setText(data);
					
					
			    if(Numero.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Escriba un Numero Por Favor","Error",JOptionPane.ERROR_MESSAGE);
				}else {
					
					timer.start();	
					
		    		//Fecha y Hora
				
		    		cal=Calendar.getInstance();  //Fecha y hora actual
		    		anio=cal.get(Calendar.YEAR);
		    		mes=cal.get(Calendar.MONTH);
		    		mes=mes+1;  //el mes va en el rango de 0 a 11
		    		dia=cal.get(Calendar.DATE);
		    		horas=cal.get(Calendar.HOUR_OF_DAY);
		    		minutos=cal.get(Calendar.MINUTE);
		    		segundos=cal.get(Calendar.SECOND);	
		    		lblFecha1.setText(""+dia+"/"+mes+"/"+anio+" \n "+horas+":"+minutos+":"+segundos+"");  
		    		
		    		x=(int) (Math.random()*8)+1;
					lbl_Resultado.setText(""+x);					
					
					}  
			}		
			
		});
		btnJugar.setBackground(new Color(204, 255, 255));
		btnJugar.setFont(new Font("Abyssinica SIL", Font.BOLD, 14));
		contentPane.add(btnJugar);
		
		
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.setBounds(380, 440, 61, 28);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setBackground(new Color(204, 255, 255));
		btnNewButton.setFont(new Font("Abyssinica SIL", Font.BOLD, 14));
		contentPane.add(btnNewButton);	
		
		
		
		
		
		
	}
}
