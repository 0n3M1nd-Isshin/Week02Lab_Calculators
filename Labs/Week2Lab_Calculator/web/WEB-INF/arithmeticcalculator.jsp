<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 23, 2020, 7:33:29 PM
    Author     : 823280
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculators</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form method="post" action="">
            
            <label>First: </label>
            <input type="number" name="age_input" value="">
            <br>
            <label>Second: </label>
            <input type="number" name="age_input" value="">
            <br>
            
            <input type="submit" value="+">
            <input type="submit" value="-">
            <input type="submit" value="*">
            <input type="submit" value="%">
            <br>
            
            <p>${arithMessage}</p>
                
        </form>
        <a href="age">Age Calculator</a>
    </body>
</html>
