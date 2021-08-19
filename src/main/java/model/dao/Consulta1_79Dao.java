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

public class Consulta1_79Dao {
	private static final String SQL_COMMAND = "SELECT ID_Proyecto, Fecha_Inicio, Banco_Vinculado, Serial " +
											  "FROM Proyecto WHERE Id_Proyecto > 4 AND ID_Proyecto < 12;"; 
    	

	public ArrayList<Consulta1VO_79> consulta1DAO() throws SQLException {
		Connection connect_DB = JDBCUtilities.getConnection();
		ArrayList<Consulta1VO_79> result_sqlCommand = new ArrayList<Consulta1VO_79>();
		
		PreparedStatement command = connect_DB.prepareStatement(SQL_COMMAND);
        ResultSet result = command.executeQuery();
		try {
			while(result.next()){
				Consulta1VO_79 consulta1_VO = new Consulta1VO_79(result.getInt("ID_Proyecto"), result.getString("Fecha_Inicio"),
																result.getString("Banco_Vinculado"), result.getString("Serial"));
				result_sqlCommand.add(consulta1_VO);
			}
				 
		} catch (SQLException e) {
			System.out.println("error"+e);
		} finally{
			if(connect_DB != null){
				connect_DB.close();
			}
		}
		return result_sqlCommand;
	}
}
