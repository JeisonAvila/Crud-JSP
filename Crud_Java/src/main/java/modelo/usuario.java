
package modelo;


public class usuario {
    int Id;
    int clave;
    String nombre;
    String categoria;
    String web;
    String rector;
    int telefono;
    String ciudad;
    int numCarreras;
    int numSedes;

    public usuario(int clave, String nombre, String categoria, String web, String rector, int telefono, String ciudad, int numCarreras, int numSedes) {
        this.clave = clave;
        this.nombre = nombre;
        this.categoria = categoria;
        this.web = web;
        this.rector = rector;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.numCarreras = numCarreras;
        this.numSedes = numSedes;
    }

    public usuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getRector() {
        return rector;
    }

    public void setRector(String rector) {
        this.rector = rector;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumCarreras() {
        return numCarreras;
    }

    public void setNumCarreras(int numCarreras) {
        this.numCarreras = numCarreras;
    }

    public int getNumSedes() {
        return numSedes;
    }

    public void setNumSedes(int numSedes) {
        this.numSedes = numSedes;
    }
    
}
