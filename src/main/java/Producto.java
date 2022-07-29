
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Producto {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    
    public void crear(int codigo, String nombre, int cantidad, String lugar, String fecha){
       String sql = "insert into medicamentos (codigo, nombre, cantidad, lugar, fecha) value(?,?,?,?,?)";
       try{
           con = conectar.Conectar();
           ps = con.prepareStatement(sql);
           ps.setInt(1, codigo);
           ps.setString(2, nombre);
           ps.setInt(3, cantidad);
           ps.setString(4, lugar);
           ps.setString(5, fecha);
         
           ps.executeUpdate();
           
       }catch(Exception e){      
    }
}
    
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        Producto p = new Producto();
        //p.crear(1, "Acetaminofén", 5);
        
        
        
    }
    
}
