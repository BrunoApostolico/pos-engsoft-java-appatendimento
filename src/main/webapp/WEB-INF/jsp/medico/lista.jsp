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
        <h3>Cadastramento de Médicos</h3>

        <a href="/medico" class="btn btn-sm btn-outline-primary">Novo</a>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Email</th>
                    <th>Telefone</th>
                    <th>CRM</th>
                    <th>Especialista</th>
                    <th>Pediatra</th>
                    <th>Ano de Formação</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="m" items="${listagem}">
            <tr>
                <td>${m.id}</td>
                <td>${m.nome}</td>
                <td>${m.email}</td>
                <td>${m.telefone}</td>
                <td>${m.crm}</td>
                <td>${m.especialista}</td>
                <td>${m.pediatra}</td>
                <td>${m.anoFormacao}</td>
                <td><a href="/medico/${m.id}/excluir">excluir</a></td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>