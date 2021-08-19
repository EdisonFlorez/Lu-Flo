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

public class Consulta3_79Dao {
	private static final String SQL_COMMAND = "SELECT ID_Proyecto, l.Nombre || ' ' || l.Primer_Apellido AS nom_ape " + 
									   "FROM Proyecto p JOIN Lider l ON p.ID_Lider = l.ID_Lider " + 
									   "WHERE p.Banco_Vinculado = 'Colpatria';";
    public ArrayList<Consulta3VO_79> consulta3DAO() throws SQLException {
		Connection connect_DB = JDBCUtilities.getConnection();
		ArrayList<Consulta3VO_79> result_sqlCommand = new ArrayList<Consulta3VO_79>();

		PreparedStatement command = connect_DB.prepareStatement(SQL_COMMAND);
        ResultSet result = command.executeQuery();
		try {
			while(result.next()){
				Consulta3VO_79 consulta3_VO = new Consulta3VO_79(result.getInt("ID_Proyecto"), result.getString("nom_ape"));
				result_sqlCommand.add(consulta3_VO);
			}
		} catch (Exception e) {
			System.out.println("error" + e);
		}finally{
			if(connect_DB != null){
				connect_DB.close();
			}
		}
		
		return result_sqlCommand;
		
    }  
}
