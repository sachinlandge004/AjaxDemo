<%-- 
    Document   : newjsp
    Created on : 9 Mar, 2019, 6:55:06 PM
    Author     : AMIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js" type="text/javascript"></script>
        <script src="js/jquery-3.1.1.min.js" type="text/javascript"></script>
        <script src="js/demo.js" type="text/javascript"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form id="demo" action="Save.do" name="demo">
            Id : <input type="text" id="id" name="id"/><br>
            Name : <input type="text" id="name" name="name"/><br>
            City : <input type="text" id="city" name="city"/><br>
            
            <button id="submit">Submit</button>
        </form>
    </body>
   
</html>
