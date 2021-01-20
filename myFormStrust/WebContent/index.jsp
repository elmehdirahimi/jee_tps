<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="Css/Styles.css"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>gestion du client</h3>
<hr/>
<s:form action="saveCompte">
<s:textfield label="Numero" name="code"></s:textfield>
<s:textfield label="Nom" name="nom"></s:textfield>
<s:textfield label="Ville" name="ville"></s:textfield>
<s:submit value="Créer mon compte" class="compteButton"></s:submit>
</s:form>
</body>
</html>