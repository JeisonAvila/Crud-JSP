
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.Id;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.usuario;


public class Controlador extends HttpServlet {
    
        String Listar = "vistas/Listar.jsp";
        String Agregar = "vistas/Agregar.jsp";
        String Editar = "vistas/Editar.jsp";
        usuario u =new usuario();
        UsuarioDao dao =  new UsuarioDao();

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("Listar")){
            String Listar = null;
            acceso=Listar;
        
    } else if
            (action.equalsIgnoreCase("Agregar")){
        acceso=Agregar;       
    }
    else if(action.equalsIgnoreCase("Agregar")){
            int Id = request.getIntHeader("txtId");
            int Clave = request.getIntHeader("txtClave");
        String Nombre = request.getParameter("txtNombre");
        String Categoria = request.getParameter("txtCategoria");
        String Web = request.getParameter("txtWeb");
        String Rector = request.getParameter("txtRector");
        int Telefono = request.getIntHeader("txtTelefono");
        String Ciudad = request.getParameter("txtCiudad");
        int NumCarreras = request.getIntHeader("txtNumCarreras");
        int NumSedes = request.getIntHeader("txtNumSedes");
        
        u.setId(Id);
        u.setClave(Clave);
        u.setNombre(Nombre);
        u.setCategoria(Categoria);
        u.setWeb(Web);
        u.setRector(Rector);
        u.setTelefono(Telefono);
        u.setCiudad(Ciudad);
        u.setNumCarreras(NumCarreras);
        u.setNumSedes(NumSedes);
        dao.Agregar(u);
        acceso=Listar;
    }
    else if(action.equalsIgnoreCase("Editar")){
        request.setAttribute("id", request.getParameter("id"));
        acceso="Editar";
        
    }
    else if(action.equalsIgnoreCase("Actualizar")){
            int Id = Integer.parseInt(request.getParameter("txtId"));
            int Clave = request.getIntHeader("txtClave");
        String Nombre = request.getParameter("txtNombre");
        String Categoria = request.getParameter("txtCategoria");
        String Web = request.getParameter("txtWeb");
        String Rector = request.getParameter("txtRector");
        int Telefono = request.getIntHeader("txtTelefono");
        String Ciudad = request.getParameter("txtCiudad");
        int NumCarreras = request.getIntHeader("txtNumCarreras");
        int NumSedes = request.getIntHeader("txtNumSedes");
        u.setId(Id);
        u.setClave(Clave);
        u.setNombre(Nombre);
        u.setCategoria(Categoria);
        u.setWeb(Web);
        u.setRector(Rector);
        u.setTelefono(Telefono);
        u.setCiudad(Ciudad);
        u.setNumCarreras(NumCarreras);
        u.setNumSedes(NumSedes);
        dao.Editar(u);
        acceso=Listar;
        
    }
    else if(action.equalsIgnoreCase("Eliminar")){
            int Id = Integer.parseInt(request.getParameter("Id"));
        u.setId(Id);
        dao.Eliminar(Id);
        acceso=Listar;
        
        
    }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    } 
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
