<%--
  Created by IntelliJ IDEA.
  User: stagiaire
  Date: 06/03/2023
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>


<%--<%@ page import "java.sql.*" %>--%>
<%--<%@ page import="static java.lang.Class.forName" %>--%>
<%--<%@ page import="java.sql.Connection" %>--%>
<%--<%@ page import="java.sql.DriverManager" %>--%>
<%--<%@ page import="java.sql.PreparedStatement" %>--%>

<%--<%--%>
<%--    String nom = request.getParameter("nom");--%>
<%--    String numero = request.getParameter("numero");--%>
<%--    String adresse = request.getParameter("adresse");--%>

<%--    try {--%>
<%--        class.forName("com.mysql.cj.jdbc.Driver");--%>
<%--        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emplyes_mns?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris", "root", "");--%>
<%--        PreparedStatement pst = con.prepareStatement("INSERT INTO emplyes_mns.emplye (nom, numero, adresse) VALUES (?,?,?)");--%>
<%--        pst.setString(1, nom);--%>
<%--        pst.setString(2, numero);--%>
<%--        pst.setString(3, adresse);--%>

<%--            int x = pst.executeUpdate();--%>
<%--            if (x > 0) {--%>
<%--                out.println("Employé ajouté avec succès");--%>
<%--            } else {--%>
<%--                out.println("Ereeur, l'employé n'a pas pu etre ajouté");--%>
<%--            }--%>

<%--    } catch (Exception e) {--%>
<%--        throw new RuntimeException(e);--%>
<%--    }--%>

<%--%>--%>



<%@ page import="java.sql.*" %>
<%@ page import="static java.lang.Class.forName" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>

<%
    String nom = request.getParameter("nom");
    String numero = request.getParameter("numero");
    String adresse = request.getParameter("adresse");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emplyes_mns?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris", "root", "");
        PreparedStatement pst = con.prepareStatement("INSERT INTO emplyes_mns.emplye (nom, numero, adresse) VALUES (?,?,?)");
        pst.setString(1, nom);
        pst.setString(2, numero);
        pst.setString(3, adresse);

        int x = pst.executeUpdate();
        if (x > 0) {
            response.getWriter().println("Employé ajouté avec succès");
        } else {
            response.getWriter().println("Erreur, l'employé n'a pas pu être ajouté");
        }

    } catch (Exception e) {
        throw new RuntimeException(e);
    }

%>
