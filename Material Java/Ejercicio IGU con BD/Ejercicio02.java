import java.awt.EventQueue;
import java.awt.HeadlessException;
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

public class Ejercicio02 extends JFrame {

	private JPanel contentPane;
	private Connection conexion;
	private Statement sentencia;
	private ResultSet rs;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JButton btnMostrar;
	private int c;
    private String n;
    private float p;
    private JButton btnNewButton;
    private JButton btnPrimero;
    private JButton btnUltimo;
    private JButton btnBorrar;
    private JButton btnSalir;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio02 frame = new Ejercicio02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Ejercicio02() throws SQLException {
		setTitle("Bases de datos y consultas");
		String bd="D:/4to año/Base de Datos/PerfumeriaNuevaGuia.accdb";
		String us="";
 		String pw="";
		
 		Connection conexion;
 		conexion=DriverManager.getConnection("jdbc:ucanaccess://"+bd,us,pw);
 		
 		sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	 	rs = sentencia.executeQuery("Select codart,nomart,precio from articulos;");
 		
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(23, 35, 46, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(185, 35, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(346, 35, 46, 14);
		contentPane.add(lblPrecio);

		txtCodigo = new JTextField();
		txtCodigo.setText("");
		txtCodigo.setBounds(10, 60, 55, 20);
		contentPane.add(txtCodigo);

		txtNombre = new JTextField();
		txtNombre.setText("");
		txtNombre.setBounds(75, 60, 247, 20);
		contentPane.add(txtNombre);
				
		txtPrecio = new JTextField();
		txtPrecio.setText("");
		txtPrecio.setBounds(332, 60, 60, 20);
		contentPane.add(txtPrecio);
		
		btnMostrar = new JButton(" Siguiente");
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
					e.printStackTrace();
				}
				
			}
		});
		btnMostrar.setBounds(208, 120, 97, 23);
		contentPane.add(btnMostrar);
		
		btnNewButton = new JButton("Anterior");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
						if (rs.previous()){
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
						e.printStackTrace();
					}
			}
		});
		btnNewButton.setBounds(109, 120, 89, 23);
		contentPane.add(btnNewButton);
		
		btnPrimero = new JButton("Primero");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					try {
						if (rs.first()){
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
						e.printStackTrace();
					}
			}
		});
		btnPrimero.setBounds(10, 120, 89, 23);
		contentPane.add(btnPrimero);
		
		btnUltimo = new JButton("Ultimo");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (rs.last()){
						c=rs.getInt("codart");
						n=rs.getString("nomart");
						p=rs.getFloat("precio");
						txtCodigo.setText(String.valueOf(c));
						txtNombre.setText(n);
						txtPrecio.setText(String.valueOf(p));
					}else{
						JOptionPane.showMessageDialog(null, "No hay más registros !","Error",JOptionPane.ERROR_MESSAGE);
					}
				} catch (SQLException r) {
					r.printStackTrace();
				}
		}
	});
		btnUltimo.setBounds(335, 120, 89, 23);
		contentPane.add(btnUltimo);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					Statement sentencia; 
					sentencia=conexion.createStatement();
					
					int cantidad;
					cantidad=sentencia.executeUpdate("Delete from articulos where codart="+c+";");
					
					conexion.close();
					rs.close();
					
					conectar(bd,us,pw);
					consultar("Select codart,nomart,precio from articulos;");
					
					txtCodigo.setText("");
					txtNombre.setText("");
					txtPrecio.setText("");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				
		}
	});
		btnBorrar.setBounds(109, 178, 89, 23);
		contentPane.add(btnBorrar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(233, 178, 89, 23);
		contentPane.add(btnSalir);
				
	}

	
	protected void conectar(String bd, String us, String pw) throws SQLException {
		
 		conexion=DriverManager.getConnection("jdbc:ucanaccess://"+bd,us,pw);
	}

	public void consultar(String instSQL) throws SQLException{
		
		sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	 	rs = sentencia.executeQuery(instSQL);
	  
	}
}
