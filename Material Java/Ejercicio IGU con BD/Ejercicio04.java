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

public class Ejercicio04 extends JFrame {

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
    private JButton btnModificar;
    private JButton btnSalir;
    private JLabel lblParaModificcion;
    private JLabel lblCodigo_1;
    private JLabel lblNombre_1;
    private JLabel lblPrecio_1;
    private JTextField textCodigo_1;
    private JTextField textNombre_1;
    private JTextField textPrecio_2;
    
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio04  frame = new Ejercicio04 ();
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
	public Ejercicio04 () throws SQLException {
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
		txtCodigo.setBounds(10, 36, 35, 20);
		contentPane.add(txtCodigo);

		txtNombre = new JTextField();
		txtNombre.setText("");
		txtNombre.setBounds(55, 36, 299, 20);
		contentPane.add(txtNombre);
				
		txtPrecio = new JTextField();
		txtPrecio.setText("");
		txtPrecio.setBounds(378, 36, 46, 20);
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
		btnMostrar.setBounds(228, 67, 97, 23);
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
		btnNewButton.setBounds(119, 67, 89, 23);
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
		btnPrimero.setBounds(0, 68, 89, 23);
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
		btnUltimo.setBounds(335, 67, 89, 23);
		contentPane.add(btnUltimo);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
					Statement sentencia;
					sentencia=conexion.createStatement();
					
					String cod = textCodigo_1.getText(); 
					String nom = textNombre_1.getText();
					String pre = textPrecio_2.getText();
					
					int cantidad;
					cantidad=sentencia.executeUpdate("UPDATE articulos SET NomArt='"+nom+"', Precio="+pre+" WHERE Codart="+cod+";");
						            
											
					//conexion.close();
					//rs.close();
					
					conectar(bd,us,pw);
					consultar("Select codart,nomart,precio from articulos;");
					
					
					
				} catch (SQLException e1) {	
					e1.printStackTrace();
				}	
				
		}
	});
		btnModificar.setBounds(10, 227, 89, 23);
		contentPane.add(btnModificar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(335, 227, 89, 23);
		contentPane.add(btnSalir);
		
		lblParaModificcion = new JLabel("Para Modificcion");
		lblParaModificcion.setBounds(172, 120, 106, 14);
		contentPane.add(lblParaModificcion);
		
		lblCodigo_1 = new JLabel("Codigo");
		lblCodigo_1.setBounds(10, 153, 46, 14);
		contentPane.add(lblCodigo_1);
		
		lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setBounds(162, 153, 46, 14);
		contentPane.add(lblNombre_1);
		
		lblPrecio_1 = new JLabel("Precio");
		lblPrecio_1.setBounds(378, 153, 46, 14);
		contentPane.add(lblPrecio_1);
		
		textCodigo_1 = new JTextField();
		textCodigo_1.setBounds(0, 178, 52, 20);
		contentPane.add(textCodigo_1);
		textCodigo_1.setColumns(10);
		
		textNombre_1 = new JTextField();
		textNombre_1.setBounds(62, 178, 292, 20);
		contentPane.add(textNombre_1);
		textNombre_1.setColumns(10);
		
		textPrecio_2 = new JTextField();
		textPrecio_2.setBounds(364, 178, 60, 20);
		contentPane.add(textPrecio_2);
		textPrecio_2.setColumns(10);
				
	}

	protected void conectar(String bd, String us, String pw) throws SQLException {
		
 		conexion=DriverManager.getConnection("jdbc:ucanaccess://"+bd,us,pw);
	}	
	
	public void consultar(String instSQL) throws SQLException{
		
		sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	 	rs = sentencia.executeQuery(instSQL);
	  
	}
}
