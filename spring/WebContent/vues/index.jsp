<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sp" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/spring/saveE.htm">
<table>
<caption>Gestion des etudiants</caption>
<tr><th>Code :</th><td><input type="text" name="codeEtud"></td></tr>
<tr><th>Nom :</th><td><input type="text" name="nomEtud"></td></tr>
<tr><th>Prenom :</th><td><input type="text" name="prenomEtud"></td></tr>
<tr><th>Age :</th><td><input type="text" name="ageEtud"></td></tr>
<tr><td><input type="submit" value="Entregistrer"></td></tr>
</table>
</form>
<form action="/spring/RechE.htm">
<table>
<caption>Rechercher Etudiant</caption>
<tr><th>Code :</th><td><input type="text" name="codeEtud"></td></tr>
<tr><td><input type="submit" value="Rechercher"></td></tr>
</table>
</form>
<table>
<caption>Liste des etudiants</caption>
<tr><th>Code</th><th>Nom</th><th>Pr�nom</th><th>Age</th></tr>
<sp:forEach items="${listeE}" var="lE">
<tr><td>${lE.code}</td><td>${lE.nom}</td><td>${lE.prenom}</td><td>${lE.age}</td>
<td><a href="/spring/deleteE.htm?codeE=${lE.code}">supprimer</a> </td>

</tr>
</sp:forEach>
</table>
</body>
</html>