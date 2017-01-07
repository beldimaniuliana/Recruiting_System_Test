
package recruiting.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import recruiting.entity.Role;
import recruiting.request.Request;

@WebServlet(name = "RegistUser", urlPatterns = {"/registUser"})
public class RegistUser extends HttpServlet {

    @EJB
    Request req;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        //String phone = request.getParameter("phone");
       // String role = request.getParameter("role");
        int role = Integer.parseInt(request.getParameter("role"));
        
        req.createUser(1, username, password, firstname, lastname, email, 9, 0,role);
      
        response.sendRedirect("registerUser.jsp");
    }
}
