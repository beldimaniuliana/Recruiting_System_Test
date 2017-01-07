
package recruiting.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SendDataToJSP", urlPatterns = {"/SendDataToJSP"})
public class SendDataToJSP extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Send a data to JSP received from JSP input:
        String name = request.getParameter("name");
        request.getSession().setAttribute("name", name);
        
        //Send a a list to JSP:
        List<String> myList = Arrays.asList("Data1", "Data2", "Data3");
        request.getSession().setAttribute("myList", myList);
        
        response.sendRedirect("print.jsp");
    }
}
