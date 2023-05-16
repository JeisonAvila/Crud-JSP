
package modelo_dao;

import confi.Conexion;
import interfaces.crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Id;
import modelo.usuario;


public class Usuario_dao implements crud{
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    usuario u = new usuario();
    
    

    @Override
    public List listar() {
        
    ArrayList<usuario>list=new ArrayList<>();
    String sql="select * from universidades";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next());
            usuario usu = new usuario();
            usu.setId(rs.getInt("Id"));
            usu.setClave(rs.getInt("clave"));
            usu.setNombre(rs.getString("Nombre"));
            usu.setCategoria(rs.getString("categoria"));
            usu.setWeb(rs.getString("web"));
            usu.setRector(rs.getString("rector"));
            usu.setTelefono(rs.getInt("telefono"));
            usu.setCiudad(rs.getString("ciudad"));
            usu.setNumCarreras(rs.getInt("numCarreras"));
            usu.setNumSedes(rs.getInt("numSedes"));
            list.add(usu);
            
        } catch (Exception e) {
        }
    return list;
    }

    @Override
    public usuario list(int id) {
        String Id = null;
        
        String sql="select * from universidades where Id"+Id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next());
            
            u.setId(rs.getInt("Id"));
            u.setClave(rs.getInt("clave"));
            u.setNombre(rs.getString("Nombre"));
            u.setCategoria(rs.getString("categoria"));
            u.setWeb(rs.getString("web"));
            u.setRector(rs.getString("rector"));
            u.setTelefono(rs.getInt("telefono"));
            u.setCiudad(rs.getString("ciudad"));
            u.setNumCarreras(rs.getInt("numCarreras"));
            u.setNumSedes(rs.getInt("numSedes"));
           
            
        } catch (Exception e) {
        }
    return u;
    }

    @Override
    public boolean Agregar(usuario usu) {
        String sql="insert into universidades (Id, Clave, Nombre, Categoria, Web, Rector, Telefono, Ciudad, NumCarreras, NumSedes) values ('"+usu.getId()+"','"+usu.getClave()
                +"','"+usu.getNombre()+"','"+usu.getCategoria()+"','"+usu.getWeb()+"','"+usu.getRector()+"','"+usu.getTelefono()+"','"+usu.getCiudad()+"','"+usu.getNumCarreras()
                +"','"+usu.getNumSedes()+"',')";
        try {
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    return false;}

    @Override
    public boolean Editar(usuario usu) {
         String sql="update universidades set Id= '"+usu.getId()+"',Clave'"+usu.getClave()
                +"',Nombre'"+usu.getNombre()+"',Categoria'"+usu.getCategoria()+"',Web'"+usu.getWeb()+"',Rector'"+usu.getRector()+"',Telefono'"+usu.getTelefono()+"',Ciudad'"+usu.getCiudad()+"',NumCarreras'"+usu.getNumCarreras()
                +"',NumSedes'"+usu.getNumSedes()+"',where id="+usu.getId();
         try {
             con = cn.getConnection();
             ps = con.prepareStatement(sql);
             ps.executeUpdate();
             
        } catch (Exception e) {
        } return false;
    }

    @Override
    public boolean Eliminar(int id) {
        String Id = null;
        String sql="delete * from universidades where ID"+ Id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
            
        } catch (Exception e) {
        }
   return false;
    }

   
    
}
