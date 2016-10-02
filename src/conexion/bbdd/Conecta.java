package conexion.bbdd;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Conecta {
	
	public static void main(String[] args) {
		
		Conecta con;
		con = new Conecta();
		
	}
	
	public Conecta(){
		
		registraDriver();
		conectar();

		
		
	}
	
	public void registraDriver(){
		// REGISTRAR EL DRIVER siempre igual
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			System.out.println("Registro exitoso");

			} catch (Exception e) {

			System.out.println(e.toString());

			}
		
	}

	public void conectar(){
		
		// Connection es una clase de la libreria añadida
		
		Connection con = null;

		//...

		try {

		con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/empresa?"
		+ "user=root&password=");

		// Otros y operaciones sobre la base de datos...

		} catch (SQLException ex) {

		// Mantener el control sobre el tipo de error

		System.out.println("SQLException: " + ex.getMessage());

		}
		
		consulta(con);
	}

	public void consulta(Connection con){
		
	}
}
