<%--
  Created by IntelliJ IDEA.
  User: stagiaire
  Date: 02/03/2023
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <p> Bonjour à tous </p>
  <p>
   <%
     String heure = (String)request.getSession().getAttribute("heure");
     if (heure.equals("jour")) {
       out.println("Bonjour");
     }
     else{
       out.println("Bonsoir");
     }
   %>
  </p>
  <p>
    <%
      for (int i = 0; i < 10; i++) {
        out.println("Bonjour, une nouvelle ligne !<br/>");
      }
    %>

  </p>
  </body>
</html>
