<%-- 
    Document   : agecalculator
    Created on : Sep 22, 2020, 5:55:43 PM
    Author     : 823280
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form method="post" action="age">
            
            <label>Enter your age: </label>
            <input type="number" name="age_input" value="${ageinput}">
            <br>
            
            <input type="submit" value="Age next birthday">
            <br>
            
            <p>${ageMessage}</p>
                    
        </form>
        <a href="arithmetic">Arithmetic Calculator</a>
        
    </body>
</html>
