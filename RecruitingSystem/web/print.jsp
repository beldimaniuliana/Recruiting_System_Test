
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Print Data</title>
    </head>
    <body>
        <h1></h1>
        
        <%= session.getAttribute("name") %>
        
        <table>
            <c:forEach items="${myList}" var="item">
                <tr>         
                    <td>${item}</td>            
                </tr>
            </c:forEach>
        </table>
             
    </body>
</html>
