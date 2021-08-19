package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)
import model.dao.*;
import model.vo.*;

//Librerías para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto4_79 {
	public static final Consulta1_79Dao consulta1 = new Consulta1_79Dao();
	public static final Consulta2_79Dao consulta2 = new Consulta2_79Dao();
	public static final Consulta3_79Dao consulta3 = new Consulta3_79Dao();

	public ArrayList<Consulta1VO_79> realizarConsulta1() throws SQLException{
		return consulta1.consulta1DAO();
	}
	public ArrayList<Consulta2VO_79> realizarConsulta2() throws SQLException{
		return consulta2.consulta2DAO();
	}
	public ArrayList<Consulta3VO_79> realizarConsulta3()throws SQLException{
		return consulta3.consulta3DAO();
	}
    
}
