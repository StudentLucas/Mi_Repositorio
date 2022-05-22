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

public class Ejercicio03 extends JFrame {

	private JPanel contentPane;
	private Connection conexion;
	private Statement sentencia;
	private ResultSet rs;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JTextField textnombre;
    private JTextField textprecio;
    private JTextField textbarras;
	private JButton btnMostrar;
	private int c;
    private String n;
    private float p;
    private JButton btnNewButton;
    private JButton btnPrimero;
    private JButton btnUltimo;
    private JButton btnAgregar;
    private JButton btnSalir;
    private JLabel lblCdbarras;
    private JTextField textrubro;
    private JTextField textproveedor;
    
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio03 frame = new Ejercicio03();
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
	public Ejercicio03() throws SQLException {
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
		lblNombre.setBounds(185, 11, 46, 14);
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
		txtPrecio.setBounds(364, 36, 46, 20);
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
		btnMostrar.setBounds(207, 67, 97, 23);
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
		btnNewButton.setBounds(109, 67, 89, 23);
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
		btnPrimero.setBounds(10, 67, 89, 23);
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
		btnUltimo.setBounds(314, 67, 89, 23);
		contentPane.add(btnUltimo);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
					Statement sentencia;
					sentencia=conexion.createStatement();
					
					
					String nom	= textnombre.getText();
					String pre	= textprecio.getText();
					String CDB	= textbarras.getText();
					String rub	= textrubro.getText();
					int cdrub = Integer.parseInt(rub);
					String prov	= textproveedor.getText();
					int cdprov = Integer.parseInt(prov);
					
					int cantidad;
					cantidad=sentencia.executeUpdate("INSERT INTO articulos (NomArt,Precio,CodRub,CodProv,CodBarras) VALUES ('"+nom+"',"+pre+","+cdrub+","+cdprov+",'"+CDB+"');");
					
					
					
					conectar(bd,us,pw);
					consultar("Select codart,nomart,precio from articulos;");
					
					
				} catch (SQLException e1) {	
					e1.printStackTrace();
				}	
				
		}
	});
		btnAgregar.setBounds(10, 227, 89, 23);
		contentPane.add(btnAgregar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(335, 227, 89, 23);
		contentPane.add(btnSalir);
		
		textnombre = new JTextField();
		textnombre.setBounds(66, 110, 163, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textprecio = new JTextField();
		textprecio.setBounds(64, 144, 74, 20);
		contentPane.add(textprecio);
		textprecio.setColumns(10);
		
		JLabel lblNom = new JLabel("Nombre");
		lblNom.setBounds(10, 113, 46, 14);
		contentPane.add(lblNom);
		
		JLabel lblPre = new JLabel("Precio");
		lblPre.setBounds(10, 147, 46, 14);
		contentPane.add(lblPre);
		
		lblCdbarras = new JLabel("CD.Barras");
		lblCdbarras.setBounds(10, 189, 64, 14);
		contentPane.add(lblCdbarras);
		
		textbarras = new JTextField();
		textbarras.setBounds(66, 186, 165, 20);
		contentPane.add(textbarras);
		textbarras.setColumns(10);
		
		JLabel lblRubro = new JLabel("Codigo Rubro");
		lblRubro.setBounds(262, 113, 92, 14);
		contentPane.add(lblRubro);
		
		textrubro = new JTextField();
		textrubro.setBounds(389, 110, 35, 20);
		contentPane.add(textrubro);
		textrubro.setColumns(10);
		
		JLabel lblCodigoProveedor = new JLabel("Codigo Proveedor");
		lblCodigoProveedor.setBounds(262, 147, 117, 14);
		contentPane.add(lblCodigoProveedor);
		
		textproveedor = new JTextField();
		textproveedor.setBounds(389, 144, 35, 20);
		contentPane.add(textproveedor);
		textproveedor.setColumns(10);
				
	}

	protected void conectar(String bd, String us, String pw) throws SQLException {
		
 		conexion=DriverManager.getConnection("jdbc:ucanaccess://"+bd,us,pw);
	}	
	
	public void consultar(String instSQL) throws SQLException{
		
		sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	 	rs = sentencia.executeQuery(instSQL);
	  
	}
}
