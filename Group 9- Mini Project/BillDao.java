/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproject;

import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Arya
 */
public class BillDao {
    public static String getId(){
        int id = 1;
        try{
           ResultSet rs = Bill.getData("select max{id} from bill");
           if(rs.next()){
               id=rs.getInt(1);
               id=id+1;
           }
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
}
