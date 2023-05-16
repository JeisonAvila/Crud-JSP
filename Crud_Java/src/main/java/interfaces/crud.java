
package interfaces;

import java.util.List;
import modelo.usuario;


public interface crud {
    public List listar();
    public usuario list(int id);
    public boolean Agregar(usuario usu);
    public boolean Editar(usuario usu);
    public boolean Eliminar (int id);
    
    
    
        
    
}
