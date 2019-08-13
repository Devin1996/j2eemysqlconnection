
package servlets;

import beans.UserBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        String uname = request.getParameter("uname");
        String pword = request.getParameter("pword");
        
        UserBean user = new UserBean();
        boolean check = user.login(uname, pword);
        
        if (check) {

                    response.sendRedirect("LoginSuccess.jsp");

        } else {
            
                  response.sendRedirect("LoginError.jsp");
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
    

}
