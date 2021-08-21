package view;
import model.vo.*;

import java.sql.SQLException;
import java.util.*;
import controller.ControladorRequerimientosReto4_79;
    

public class Tables {
    public static final ControladorRequerimientosReto4_79 controlador = new ControladorRequerimientosReto4_79();  
    
    public Object[][] getInfoProjects() throws SQLException{
        
        ArrayList<Consulta1VO_79> list = controlador.realizarConsulta1();                       
        Object[][] data = new Object[list.size()][4];

        for(int i = 0; i < list.size(); i++) {
            data[i][0] = list.get(i).getId();
            data[i][1] = list.get(i).getDate();
            data[i][2] = list.get(i).getBank();
            data[i][3] = list.get(i).getSerial();
        }
        return data;
    }
    public Object[][] getInfoDeductibles() throws SQLException{
        
        ArrayList<Consulta2VO_79> list = controlador.realizarConsulta2();                       
        Object[][] data = new Object[list.size()][4];

        for(int i = 0; i < list.size(); i++) {
            data[i][0] = list.get(i).getName();
            data[i][1] = list.get(i).getLastNames();
            data[i][2] = list.get(i).getSalary();
            data[i][3] = list.get(i).getDeductible();
        }
        return data;
    }
    public Object[][] getInfoClients() throws SQLException{
        ArrayList<Consulta3VO_79> list = controlador.realizarConsulta3();                       
        Object[][] data = new Object[list.size()][2];

        for(int i = 0; i < list.size(); i++) {
            data[i][0] = list.get(i).getId();
            data[i][1] = list.get(i).getNameLastName();         
        }
        return data;
    }
}
