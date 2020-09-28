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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        //parameters
        String firstnum = request.getParameter("first_num");
        String secondnum = request.getParameter("second_num");
        String arith = request.getParameter("arith");
        //String subtract = request.getParameter("subtract");
        
        
        //attributes
        request.setAttribute("firstNum", firstnum);
        request.setAttribute("secondNum", secondnum);        
        
        if(firstnum.isEmpty() && secondnum.isEmpty() || !firstnum.isEmpty() && secondnum.isEmpty() || firstnum.isEmpty() && !secondnum.isEmpty()) {
            request.setAttribute("arithMessage", "invalid"); 
        }
        
        if(!firstnum.isEmpty() && !secondnum.isEmpty()) {
            int answer;
            
            switch(arith) {
                case "+": answer = Integer.parseInt(firstnum) + Integer.parseInt(secondnum);
                         request.setAttribute("arithMessage", answer);
                break;
                case "-": answer = Integer.parseInt(firstnum) - Integer.parseInt(secondnum);
                         request.setAttribute("arithMessage", answer);
                break;
                case "*": answer = Integer.parseInt(firstnum) * Integer.parseInt(secondnum);
                          request.setAttribute("arithMessage", answer);
                break;
                case "%": answer = Integer.parseInt(firstnum) % Integer.parseInt(secondnum);
                          request.setAttribute("arithMessage", answer);
                break;
                default: request.setAttribute("arithMessage", "---");
                break;
            }

        }
        
        //refresh page with the answer
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
    }

}
