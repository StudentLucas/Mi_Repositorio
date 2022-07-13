import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ejercicio05 extends JFrame {

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
    private DefaultTableModel model;
    private float p;
    private JButton btnNewButton;
    private JButton btnPrimero;
    private JButton btnUltimo;
    private JButton btnSalir;
    private JLabel lblParaModificcion;
    private JTextField textNombre_1;
    
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio05 frame = new Ejercicio05();
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
	public Ejercicio05() throws SQLException {
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
		lblCodigo.setBounds(10, 11, 46, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(162, 11, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(378, 11, 46, 14);
		contentPane.add(lblPrecio);

		txtCodigo = new JTextField();
		txtCodigo.setText("");
		txtCodigo.setBounds(10, 36, 35, 47);
		contentPane.add(txtCodigo);

		txtNombre = new JTextField();
		txtNombre.setText("");
		txtNombre.setBounds(55, 36, 299, 47);
		contentPane.add(txtNombre);
				
		txtPrecio = new JTextField();
		txtPrecio.setText("");
		txtPrecio.setBounds(378, 36, 46, 47);
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
		btnMostrar.setBounds(229, 94, 97, 23);
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
		btnNewButton.setBounds(119, 94, 89, 23);
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
		btnPrimero.setBounds(0, 94, 89, 23);
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
		btnUltimo.setBounds(335, 94, 89, 23);
		contentPane.add(btnUltimo);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(335, 227, 89, 23);
		contentPane.add(btnSalir);
		
		lblParaModificcion = new JLabel("Para Buscar por Nombre");
		lblParaModificcion.setBounds(145, 132, 160, 14);
		contentPane.add(lblParaModificcion);
		
		textNombre_1 = new JTextField();
		textNombre_1.setBounds(10, 157, 414, 36);
		contentPane.add(textNombre_1);
		textNombre_1.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String nombre;
				nombre = textNombre_1.getText();
				
				String sql= "SELECT Codart,Nomart,Precio FROM Articulos WHERE Nomart LIKE '%" +nombre +"%'";
					  
				
				try {
					
					Statement sentencia;
					sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
					ResultSet rs=sentencia.executeQuery(sql);
					
					while(rs.next()){
						c=rs.getInt("codart");
						n=rs.getString("nomart");
						p=rs.getFloat("precio");
						txtCodigo.setText(String.valueOf(c));
						txtNombre.setText(n);
						txtPrecio.setText(String.valueOf(p));
					}
					
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				
			}
		});
		btnBuscar.setBounds(10, 227, 89, 23);
		contentPane.add(btnBuscar);
				
	}

	protected void conectar(String bd, String us, String pw) throws SQLException {
		
 		conexion=DriverManager.getConnection("jdbc:ucanaccess://"+bd,us,pw);
	}	
	
	public void consultar(String instSQL) throws SQLException{
		
		sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	 	rs = sentencia.executeQuery(instSQL);
	  
	}
}
