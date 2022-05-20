import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Ejercicio01 extends JFrame {

	private JPanel contentPane;
	private Connection conexion;
	private Statement sentencia;
	private ResultSet rs;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JButton btnConectar;
	private JButton btnDesconectar;
	private JButton btnMostrar;
	private JButton btnConsultar;
	private int c;
        private String n;
        private float p;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio01 frame = new Ejercicio01();
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
	public Ejercicio01() {
		setTitle("Bases de datos y consultas");
		String bd="D:/4to año/Base de Datos/PerfumeriaNuevaGuia.accdb";
		String us="";
 		String pw="";
		
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBaseDeDatos = new JLabel("Base de datos:");
		lblBaseDeDatos.setBounds(36, 11, 86, 14);
		contentPane.add(lblBaseDeDatos);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(25, 132, 46, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(144, 133, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(249, 132, 46, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblResultados = new JLabel("Resultados");
		lblResultados.setBounds(175, 88, 86, 14);
		contentPane.add(lblResultados);

		txtCodigo = new JTextField();
		txtCodigo.setText("");
		txtCodigo.setBounds(23, 158, 86, 20);
		contentPane.add(txtCodigo);

		txtNombre = new JTextField();
		txtNombre.setText("");
		txtNombre.setBounds(142, 158, 86, 20);
		contentPane.add(txtNombre);
				
		txtPrecio = new JTextField();
		txtPrecio.setText("");
		txtPrecio.setBounds(249, 158, 86, 20);
		contentPane.add(txtPrecio);
				
		btnConectar = new JButton("Conectar");
		btnConectar.setEnabled(true);
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					conectar(bd,us,pw);
					btnConectar.setEnabled(false);
					btnDesconectar.setEnabled(true);
					btnConsultar.setEnabled(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnConectar.setBounds(121, 7, 91, 23);
		contentPane.add(btnConectar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setEnabled(false);
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					consultar("select codart,nomart,precio from articulos;");
					btnMostrar.setEnabled(true);
					btnConsultar.setEnabled(false);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnConsultar.setBounds(221, 7, 91, 23);
		contentPane.add(btnConsultar);
		
		btnMostrar = new JButton("Mostrar Siguiente");
		btnMostrar.setEnabled(false);
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (rs.next()){
						c=rs.getInt("codart");
						n=rs.getString("nomart");
						p=rs.getFloat("precio");
						txtCodigo.setText(String.valueOf(c));
						txtNombre.setText(n);
						txtPrecio.setText(String.valueOf(p));
					}else{
						JOptionPane.showMessageDialog(null, "No hay más registros !","Error",JOptionPane.ERROR_MESSAGE);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnMostrar.setBounds(106, 203, 155, 23);
		contentPane.add(btnMostrar);
		
		btnDesconectar = new JButton("Desconectar");
		btnDesconectar.setEnabled(false);
		btnDesconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					conexion.close();
					rs.close();
					btnConectar.setEnabled(true);
					btnDesconectar.setEnabled(false);
					btnConsultar.setEnabled(false);
					btnMostrar.setEnabled(false);
					txtCodigo.setText("");
					txtNombre.setText("");
					txtPrecio.setText("");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		btnDesconectar.setBounds(322, 7, 91, 23);
		contentPane.add(btnDesconectar);
				
	}

	public void conectar(String bd,String us,String pw) throws SQLException {
		
	    conexion=DriverManager.getConnection("jdbc:ucanaccess://"+bd,us,pw);
		   	
	}
	
	public void consultar(String instSQL) throws SQLException{
		
		sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	 	rs = sentencia.executeQuery(instSQL);
	  
	}
}
