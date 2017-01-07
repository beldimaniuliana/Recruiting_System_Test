/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruiting.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import recruiting.entity.Test;
import recruiting.request.Request;




@WebServlet(name = "TestServlet", urlPatterns = {"/welcomee"})
public class TestServlet extends  HttpServlet{
    
      @EJB
      Request req;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        req.CreateTest(1, "Xculescu");
        
        //Test test = new Test(3, "Xculescu");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>You added a Test</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>The test name is :<h1>");
            //out.println("<p>" + req.ShowTest("name") + "</p>");
            out.println("</body>");
            out.println("</html>");
        }  finally {
        out.close();
        }
    }


}