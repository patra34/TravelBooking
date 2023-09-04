package com.app;

import java.io.IOException;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/alogin")
public class AloginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        PreparedStatement pst = null;
        Connection con = null;
        RequestDispatcher dispatcher = null;
        HttpSession session = request.getSession();
        
        String uname= request.getParameter("admin");
        String pass= request.getParameter("password");
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tbw?useSSL=false","root","");
            pst = con.prepareStatement("SELECT * from admin WHERE aname=? and password=?");
            pst.setString(1, uname);
            pst.setString(2, pass);
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                dispatcher=request.getRequestDispatcher("AdminBooking.jsp");
                session.setAttribute("name", rs.getString("aname"));
            } else {
                request.setAttribute("status","failed");
                dispatcher=request.getRequestDispatcher("AdminLogin.jsp");
            }
            dispatcher.forward(request, response);
            
        
        } catch (ClassNotFoundException | SQLException | ServletException | IOException e) {
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


