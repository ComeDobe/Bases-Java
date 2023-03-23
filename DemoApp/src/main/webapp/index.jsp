<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title> Enregistrement des Employés </title>
</head>
<body>
<h1><%= " Enregistrement des Employés MNS" %></h1>
<form action="Connecter.jsp " method="post"></form>
<table>

    <tr><td> Nom : </td> <td><input type="text" name=" nom"> </td></tr>
    <tr><td> Numero : </td> <td><input type="text" name=" numero"> </td></tr>
    <tr><td> Adresse: </td> <td><input type="text" name=" adresse"> </td></tr>
    <tr><td> </td> <td><input type="submit" value="Enregistrer"> </td></tr>
</table>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>