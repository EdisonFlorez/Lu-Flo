package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.*;

public class Consulta2_79Dao {
		//revisar el comando en las comillas simples o dobles para el guión.
	private static final String SQL_COMMAND = "SELECT Nombre, Salario, Salario * 0.08 AS deducible, " +
									   "Primer_Apellido || '-' || Segundo_Apellido AS apellidos " +
									   "FROM Lider WHERE Salario BETWEEN 500000 AND 650000;";

    public ArrayList<Consulta2VO_79> consulta2DAO() throws SQLException {
		Connection connect_DB = JDBCUtilities.getConnection();
		ArrayList<Consulta2VO_79> result_sqlCommand = new ArrayList<Consulta2VO_79>();

		PreparedStatement command = connect_DB.prepareStatement(SQL_COMMAND);
        ResultSet result = command.executeQuery();
		try {
			while(result.next()){
				Consulta2VO_79 consulta2_VO = new Consulta2VO_79(result.getString("Nombre"), result.getInt("Salario"),
																result.getDouble("deducible"), result.getString("apellidos"));
				result_sqlCommand.add(consulta2_VO);
			}
		} catch (Exception e) {
			System.out.println("error"+e);	
		}finally{
			if(connect_DB != null){
				connect_DB.close();
			}
		}		
	
		return result_sqlCommand;
		    
    }  
}
