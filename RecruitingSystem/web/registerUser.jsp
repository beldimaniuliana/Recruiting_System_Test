<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page Testing</title>
    </head>
    <body>
        <h1>Hello You!</h1>
    
         <br>
          <form action="registUser" method="POST">
             <label>Username: </label><input type="text" name="username"><br/>
             <label>Password: </label><input type="password" name="password"><br/>
             <label>First Name: </label><input type="text" name="firstname"><br/>
             <label>Last Name:</label><input type="text" name="lastname"><br/>
             <label>Email: </label><input type="email" name="email"><br/>
             <label>Phone: </label><input type="number" name="phone"><br/>
             <label>Role: </label>
             <select name="role">
                <c:forEach items="${roleList}" var="item">
                     <option value="${item.id}">${item.name}</option>
                </c:forEach>
             </select><br/>
             <input type="submit" value="Action">
        </form>
         <br/><br/>
         <table border="1">
                 <th>ID</th>
                 <th>USERNAME</th>
                 <th>PASSWORD</th>
                 <th>FIRST NAME</th>
                 <th>LAST NAME</th>
                 <th>EMAIL</th>
                 <th>PHONE</th>
                 <th>ACTIVE</th>
                 <th>ROLE</th>
             <c:forEach items="${userList}" var="item">
             <tr>
                 <td>${item.id}</td>
                 <td>${item.username}</td>
                 <td>${item.password}</td>
                 <td>${item.firstName}</td>
                 <td>${item.lastName}</td>
                 <td>${item.email}</td>
                 <td>${item.phone}</td>
                 <td>${item.active}</td>
                 <td>${item.idGroup.id}</td>
             </tr>
             </c:forEach>
         </table>
         
    </body>
</html>
