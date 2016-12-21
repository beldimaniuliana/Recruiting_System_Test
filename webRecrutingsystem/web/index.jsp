
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h1>Sign up</h1>
        <a href="signup.jsp">Sign‐up!</a>
        
        <br><br>
      
        <h2>Simple form - send by GET</h2>
        <form method="get" action="SimpleForm">
            <label>Username:</label>
            <input type="text" name="username">
            <input type="submit" value="Submit">
        </form>
        
        <h2>Simple form - send by POST</h2>
        <form method="post" action="SimpleForm">
            <label>Username:</label>
            <input type="text" name="username">
            <input type="submit" value="Submit">
        </form>
        
        <h2>Send name->Servlet->JSP</h2>
        <form method="post" action="SendDataToJSP">
            <label>Name</label>
            <input type="text" name="name">
            <input type="submit" value="Submit">
        </form>
    
    </body>
</html>
