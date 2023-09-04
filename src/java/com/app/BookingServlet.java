package com.app;

import java.io.IOException;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Booking")
public class BookingServlet extends HttpServlet {
    private static final long serialVersionUID=1L;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PreparedStatement pst = null;
        Connection con = null;
        RequestDispatcher dispatcher = null;
        
        String uname = request.getParameter("username");
        String destination = request.getParameter("destination");
        String hchain = request.getParameter("hotel");
        String adult = request.getParameter("adults");
        String child = request.getParameter("children");
        String day = request.getParameter("days");
        String phone = request.getParameter("phone");
        int adults = Integer.parseInt(adult);
        int children = Integer.parseInt(child);
        int days = Integer.parseInt(day);
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tbw?useSSL=false","root","");
            pst = con.prepareStatement("INSERT INTO package (username,destination,hotelchain,adults,children,days,phone) VALUES (?,?,?,?,?,?,?) ");
            pst.setString(1, uname);
            pst.setString(2, destination);
            pst.setString(3, hchain);
            pst.setInt(4, adults);
            pst.setInt(5, children);
            pst.setInt(6, days);
            pst.setString(7, phone);
            
            int rowcount = pst.executeUpdate();
            dispatcher=request.getRequestDispatcher("Bookings.jsp");
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

