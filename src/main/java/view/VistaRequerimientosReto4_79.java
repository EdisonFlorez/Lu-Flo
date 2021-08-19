package view;

import controller.*;

import model.vo.*;
import java.sql.SQLException;
import java.util.ArrayList;


public class VistaRequerimientosReto4_79 {
    
    public static final ControladorRequerimientosReto4_79 controlador = new ControladorRequerimientosReto4_79();

    public static void consulta1(){
        System.out.println("-----Consulta 1-------"); 
        try{

            ArrayList<Consulta1VO_79> lista = controlador.realizarConsulta1();

            //Encabezado del resultado
            System.out.printf("%s %s %s %s %n", "id_proyecto", "fecha_inicio", "entidad_bancaria", "serial");
            
            //Cada VO cargado, mostrarlo en la vista
			for(Consulta1VO_79 elemento: lista){
				System.out.printf("%d %s %s %s %n", elemento.getId(), elemento.getDate(), elemento.getBank(), elemento.getSerial());
			}
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }

    public static void consulta2(){
        System.out.println("-----Consulta 2-------"); 
        try{

            ArrayList<Consulta2VO_79> lista = controlador.realizarConsulta2();

            //Encabezado del resultado
            System.out.printf("%s %s %s %s %n", "nombre", "salario", "deducible", "apellidos");
            
            //Cada VO cargado, mostrarlo en la vista
            for(Consulta2VO_79 elemento: lista){
				System.out.printf("%s %d %f %s %n", elemento.getName(), elemento.getSalary(), elemento.getDeductible(), elemento.getLastNames());
			}
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }


    public static void consulta3(){
        System.out.println("-----Consulta 3-------"); 
        try{

            ArrayList<Consulta3VO_79> lista = controlador.realizarConsulta3();

            //Encabezado del resultado
            System.out.printf("%s %s %n", "id_proyecto", "nom_ape");
            //Cada VO cargado, mostrarlo en la vista
            for(Consulta3VO_79 elemento: lista){
				System.out.printf("%s %s %n", elemento.getId(), elemento.getNameLastName());
			}
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }
}
