import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Ejercicio06 extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textNombre;
	private JTextField textPrecio;
	private Connection conexion;
	private Statement sentencia;
	private ResultSet rs;
	private int c;
    private String n;
    private float p;
    private JTextField textCodigo_1;
    private JTextField textNombre_1;
    private JTextField textPrecio_1;
    private JTextField textBarras;
    private JTextField textRubros;
    private JTextField textProv;
    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio06 frame = new Ejercicio06();
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
	public Ejercicio06() {
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
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 45, 46, 14);
		contentPane.add(lblCodigo);
		
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(178, 45, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(361, 45, 46, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblCod = new JLabel("Codigo");
		lblCod.setBounds(10, 175, 46, 14);
		contentPane.add(lblCod);
		lblCod.setEnabled(true);
		
		JLabel lblNom = new JLabel("Nombre");
		lblNom.setBounds(125, 130, 46, 14);
		contentPane.add(lblNom);
		lblNom.setEnabled(true);
		
		JLabel lblPre = new JLabel("Precio");
		lblPre.setBounds(73, 175, 46, 14);
		contentPane.add(lblPre);
		lblPre.setEnabled(true);
		
		JLabel lblCbarras = new JLabel("C.Barras");
		lblCbarras.setBounds(130, 175, 59, 14);
		contentPane.add(lblCbarras);
		lblCbarras.setEnabled(true);
		
		JLabel lblCrubro = new JLabel("C.Rubro");
		lblCrubro.setBounds(222, 175, 58, 14);
		contentPane.add(lblCrubro);
		
		JLabel lblCprov = new JLabel("C.Prov");
		lblCprov.setBounds(270, 175, 46, 14);
		contentPane.add(lblCprov);
		lblCprov.setEnabled(true);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(10, 70, 53, 20);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		textCodigo.setEnabled(true);
		
		textNombre = new JTextField();
		textNombre.setBounds(73, 70, 255, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		textNombre.setEnabled(true);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(338, 70, 86, 20);
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		textPrecio.setEnabled(true);
		
		textCodigo_1 = new JTextField();
		textCodigo_1.setBounds(10, 190, 46, 20);
		contentPane.add(textCodigo_1);
		textCodigo_1.setColumns(10);
		textCodigo_1.setEnabled(true);
		
		textNombre_1 = new JTextField();
		textNombre_1.setBounds(10, 148, 298, 20);
		contentPane.add(textNombre_1);
		textNombre_1.setColumns(10);
		textNombre_1.setEnabled(true);
		
		textPrecio_1 = new JTextField();
		textPrecio_1.setBounds(66, 190, 53, 20);
		contentPane.add(textPrecio_1);
		textPrecio_1.setColumns(10);
		textPrecio_1.setEnabled(true);
		
		
		textBarras = new JTextField();
		textBarras.setBounds(129, 190, 86, 20);
		contentPane.add(textBarras);
		textBarras.setColumns(10);
		textBarras.setEnabled(true);
		
		textRubros = new JTextField();
		textRubros.setBounds(222, 190, 38, 20);
		contentPane.add(textRubros);
		textRubros.setColumns(10);
		textRubros.setEnabled(true);
		
		textProv = new JTextField();
		textProv.setBounds(270, 190, 38, 20);
		contentPane.add(textProv);
		textProv.setColumns(10);
		textProv.setEnabled(true);
	
			
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(112, 236, 77, 23);
		contentPane.add(btnSalir);
		
		JButton btnPrimero = new JButton("Primero");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (rs.first()){
						c=rs.getInt("codart");
						n=rs.getString("nomart");
						p=rs.getFloat("precio");
						textCodigo.setText(String.valueOf(c));
						textNombre.setText(n);
						textPrecio.setText(String.valueOf(p));
					}else{
						JOptionPane.showMessageDialog(null, "No hay más registros !","Error",JOptionPane.ERROR_MESSAGE);
					}
				} catch (SQLException q) {
					q.printStackTrace();
				}
		}
	});
		btnPrimero.setBounds(10, 101, 89, 23);
		contentPane.add(btnPrimero);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (rs.previous()){
						c=rs.getInt("codart");
						n=rs.getString("nomart");
						p=rs.getFloat("precio");
						textCodigo.setText(String.valueOf(c));
						textNombre.setText(n);
						textPrecio.setText(String.valueOf(p));
					}else{
						JOptionPane.showMessageDialog(null, "No hay más registros !","Error",JOptionPane.ERROR_MESSAGE);
					}
				} catch (SQLException r) {
					r.printStackTrace();
				}
		}
	});
		btnAnterior.setBounds(115, 101, 89, 23);
		contentPane.add(btnAnterior);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (rs.next()){
						c=rs.getInt("codart");
						n=rs.getString("nomart");
						p=rs.getFloat("precio");
						textCodigo.setText(String.valueOf(c));
						textNombre.setText(n);
						textPrecio.setText(String.valueOf(p));
					}else{
						JOptionPane.showMessageDialog(null, "No hay más registros !","Error",JOptionPane.ERROR_MESSAGE);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		});
		btnSiguiente.setBounds(219, 101, 89, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnUltimo = new JButton("Ultimo");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (rs.last()){
						c=rs.getInt("codart");
						n=rs.getString("nomart");
						p=rs.getFloat("precio");
						textCodigo.setText(String.valueOf(c));
						textNombre.setText(n);
						textPrecio.setText(String.valueOf(p));
					}else{
						JOptionPane.showMessageDialog(null, "No hay más registros !","Error",JOptionPane.ERROR_MESSAGE);
					}
				} catch (SQLException r) {
					r.printStackTrace();
				}
		}
	});
		btnUltimo.setBounds(318, 101, 89, 23);
		contentPane.add(btnUltimo);
		
		
		
		JButton btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					conectar(bd,us,pw);
					JOptionPane.showMessageDialog(null, "La conexion fue exitosa");
				} catch (SQLException q) {
					q.printStackTrace();
					JOptionPane.showMessageDialog(null, "La conexion no se pudo realizar");
				}
			}
		});
		btnConectar.setBounds(10, 11, 89, 23);
		contentPane.add(btnConectar);
		
		JButton btnDesconectar = new JButton("Desconectar");
		btnDesconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				try {
					conexion.close();
					rs.close();
					textCodigo.setText("");
					textNombre.setText("");
					textPrecio.setText("");
					JOptionPane.showMessageDialog(null, "La Desconexion fue exitosa");
				} catch (SQLException s) {
					s.printStackTrace();
					JOptionPane.showMessageDialog(null, "La Desconexion no se pudo realizar");
				}
			}
			
		});
		btnDesconectar.setBounds(276, 11, 123, 23);
		contentPane.add(btnDesconectar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					consultar("select codart,nomart,precio from articulos;");
					JOptionPane.showMessageDialog(null, "Ingreso a la consulta exitosamente");
				} catch (SQLException t) {
					t.printStackTrace();
					JOptionPane.showMessageDialog(null, "No se pudo Ingresar a la consulta");
				}
			}
		});
		btnConsultar.setBounds(147, 11, 89, 23);
		contentPane.add(btnConsultar);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Statement sentencia;
					sentencia=conexion.createStatement();
					String nom	= textNombre_1.getText();
					String pre	= textPrecio_1.getText();
					String CDB	= textBarras.getText();
					String rub	= textRubros.getText();
					int cdrub = Integer.parseInt(rub);
					String prov	= textProv.getText();
					int cdprov = Integer.parseInt(prov);
			
					int cantidad;
					cantidad=sentencia.executeUpdate("INSERT INTO articulos (NomArt,Precio,CodRub,CodProv,CodBarras) VALUES ('"+nom+"',"+pre+","+cdrub+","+cdprov+",'"+CDB+"');");
					
					conectar(bd,us,pw);
					consultar("Select codart,nomart,precio from articulos;");
					
					JOptionPane.showMessageDialog(null, "Los Datos se Agregaron Exitosamente");
				
		}catch (SQLException e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "Los Datos no se pudieron Agregar");	
			}
		   }	
		});
		btnAgregar.setBounds(335, 155, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Statement sentencia; 
					sentencia=conexion.createStatement();
					int cantidad;
					cantidad=sentencia.executeUpdate("Delete from articulos where codart="+c+";");
					textCodigo.setText("");
					textNombre.setText("");
					textPrecio.setText("");
					
					conectar(bd,us,pw);
					consultar("Select codart,nomart,precio from articulos;");
					
					JOptionPane.showMessageDialog(null, "Los Datos se Borraron Exitosamente");
				
		}catch (SQLException e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "Los Datos no se pudieron Borrar");
		}	
	
				
			}
		});
		btnBorrar.setBounds(335, 182, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Statement sentencia;
					sentencia=conexion.createStatement();
					
					String cod = textCodigo_1.getText(); 
					String nom = textNombre_1.getText();
					String pre = textPrecio_1.getText();
					
					int cantidad;
					cantidad=sentencia.executeUpdate("UPDATE articulos SET NomArt='"+nom+"', Precio="+pre+" WHERE Codart="+cod+";");	
					
					conectar(bd,us,pw);
					consultar("Select codart,nomart,precio from articulos;");
					
					JOptionPane.showMessageDialog(null, "Los Datos se Modificaron Exitosamente");
				
				
			}catch (SQLException e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "Los Datos no se pudieron Modificar");
		}	  
				
				
			}
		});
		btnModificar.setVerticalAlignment(SwingConstants.BOTTOM);
		btnModificar.setBounds(335, 208, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				try {	
					String nombre;
					nombre = textNombre_1.getText();
					
					String sql= "SELECT Codart,Nomart,Precio FROM Articulos WHERE Nomart LIKE '%" +nombre +"%';";
					
					Statement sentencia;
					sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
					ResultSet rs=sentencia.executeQuery(sql);
					
					while(rs.next()){
						c=rs.getInt("codart");
						n=rs.getString("nomart");
						p=rs.getFloat("precio");
						textCodigo.setText(String.valueOf(c));
						textNombre.setText(n);
						textPrecio.setText(String.valueOf(p));
					}
					conectar(bd,us,pw);
					consultar("SELECT Codart,Nomart,Precio FROM Articulos WHERE Nomart LIKE '%" +nombre +"%';");
					
					JOptionPane.showMessageDialog(null, "El Dato se Encontro Exitosamente");	
				
				
			} catch (SQLException r) {
				r.printStackTrace();
				JOptionPane.showMessageDialog(null, "Los Datos no se pudieron Encontrar");
			}
			
			
			
			}
		});
		btnBuscar.setVerticalAlignment(SwingConstants.BOTTOM);
		btnBuscar.setBounds(335, 235, 89, 23);
		contentPane.add(btnBuscar);
			
		
}
		
		public void conectar(String bd,String us,String pw) throws SQLException {
	
			conexion=DriverManager.getConnection("jdbc:ucanaccess://"+bd,us,pw);
	   	
		}

		public void consultar(String instSQL) throws SQLException{
	
			sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = sentencia.executeQuery(instSQL);
  
		}
	}
