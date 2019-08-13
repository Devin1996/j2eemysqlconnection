]'<%-- 
    Document   : Login
    Created on : Jul 19, 2018, 9:37:06 PM
    Author     : rajitha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Form</h1>
        <form action="LoginServlet" method="POST" >
            <table>
                <tr>
                    <td>Username:</td><td><input type="text" name="uname"></td>
                </tr>
                <tr>
                    <td>Password:</td><td><input type="text" name="pword"></td>
                </tr>
                <tr>
                    <td></td><td><input type="submit" value="SUBMIT"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
