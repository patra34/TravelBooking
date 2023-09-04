package com.app;

import java.io.IOException;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
    private static final long serialVersionUID=1L;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PreparedStatement pst = null;
        Connection con = null;
        RequestDispatcher dispatcher = null;
        
        String uname = request.getParameter("username");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String cpassword = request.getParameter("cpassword");
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tbw?useSSL=false","root","");
            pst = con.prepareStatement("INSERT INTO user (username,password,phone,email) VALUES (?,?,?,?) ");
            pst.setString(1, uname);
            pst.setString(2, password);
            pst.setString(3, phone);
            pst.setString(4, email);
            
            int rowcount = pst.executeUpdate();
            dispatcher=request.getRequestDispatcher("Signup.jsp");
            
            if(rowcount>0){
                request.setAttribute("status", "success");
    
            } else {
                request.setAttribute("status", "failed");
                
            }
            dispatcher.forward(request, response);
        } catch (ClassNotFoundException | SQLException | ServletException | IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

