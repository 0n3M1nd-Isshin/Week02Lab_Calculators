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
        
        <form method="post" action="arithmetic">
            
            <label>First: </label>
            <input type="text" name="first_num" value="${firstNum}">
            <br>
            <label>Second: </label>
            <input type="text" name="second_num" value="${secondNum}">
            <br>
            
            <button type="radio" name="arith" value="+" onclick="">+</button>
            <button type="radio" name="arith" value="-">-</button>
            <button type="radio" name="arith" value="*">*</button>
            <button type="radio" name="arith" value="%">%</button>
            <br>
            
            <p>Result: ${arithMessage}</p>
        </form>
        <a href="age">Age Calculator</a>
    </body>
</html>
