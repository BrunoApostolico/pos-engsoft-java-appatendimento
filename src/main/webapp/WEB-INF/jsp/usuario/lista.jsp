<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="pt-BR">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppAtendimento</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

    <div class="container mt-3">
        <h3>Cadastramento de Usu�rios</h3>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Email</th>
                    <th>Senha</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="u" items="${listagem}">
            <tr>
                <td>${u.nome}</td>
                <td>${u.email}</td>
                <td>${u.senha}</td>
                <td><a href="/usuario/${u.email}/excluir">excluir</a></td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>