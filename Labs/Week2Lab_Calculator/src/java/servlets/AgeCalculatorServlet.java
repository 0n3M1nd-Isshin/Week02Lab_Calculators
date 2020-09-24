/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 823280
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        //parameters
        int next = 1;
        int age_input;
        String ageinput = request.getParameter("age_input");
        //Integer.parseInt("ageinput");
        
        //attributes
        request.setAttribute("ageInput", ageinput);
        
        //prevents null inputs 
        if(ageinput == null || ageinput.equals("")) {
            
            request.setAttribute("ageMessage", "You must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
            
        }
        if (!ageinput.isEmpty()) {
            
            int nextBday;
            nextBday = Integer.parseInt(ageinput) + next;
            
            request.setAttribute("ageMessage", "Your age next birthday will be " + nextBday);
            
            
        }
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
    }
}
