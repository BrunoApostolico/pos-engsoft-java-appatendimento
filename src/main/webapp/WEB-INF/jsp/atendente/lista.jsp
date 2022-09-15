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
        <h3>Cadastramento de Atendente</h3>

        <a href="/atendente" class="btn btn-sm btn-outline-primary">Novo</a>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Email</th>
                    <th>Telefone</th>
                    <th>Idade</th>
                    <th>Formação</th>
                    <th>Turno</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="a" items="${listagem}">
            <tr>
                <td>${a.id}</td>
                <td>${a.nome}</td>
                <td>${a.email}</td>
                <td>${a.telefone}</td>
                <td>${a.idade}</td>
                <td>${a.formacao}</td>
                <td>${a.turno}</td>
                <td><a href="/atendente/${a.id}/excluir">excluir</a></td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>