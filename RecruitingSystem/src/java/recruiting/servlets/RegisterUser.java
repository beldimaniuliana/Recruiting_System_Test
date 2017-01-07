/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruiting.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import recruiting.entity.Role;
import recruiting.entity.User;
import recruiting.request.Request;


@WebServlet(name = "RegisterUser", urlPatterns = {"/registerUser"})
public class RegisterUser extends HttpServlet {
    @EJB
    Request requestt;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
              List<User> userList = requestt.getAllUsers();
              request.getSession().setAttribute("userList", userList); 
        
              List<Role> roleList = requestt.getAllRoles();
              request.getSession().setAttribute("roleList", roleList);
              response.sendRedirect("registerUser.jsp");
    }

   

}
