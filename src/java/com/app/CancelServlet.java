package com.app;

import java.io.IOException;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cancel")
public class CancelServlet extends HttpServlet {
    private static final long serialVersionUID=1L;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PreparedStatement pst = null;
        Connection con = null;
        RequestDispatcher dispatcher = null;
        
        String bid = request.getParameter("bid");
        int bids = Integer.parseInt(bid);
        
        try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tbw?useSSL=false","root","");
                pst = con.prepareStatement("delete from package where bid = ?");
                pst.setInt(1, bids);
            
                int rowcount = pst.executeUpdate();
                dispatcher=request.getRequestDispatcher("CancelOrder.jsp");
                if(rowcount>0){
                    request.setAttribute("status", "success");
    
                } else if (bid!=null)
                {
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

