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
        <h3>Cadastramento de Técnicos</h3>

        <a href="/tecnico" class="btn btn-sm btn-outline-primary">Novo</a>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Email</th>
                    <th>Telefone</th>
                    <th>Coren</th>
                    <th>Diarista</th>
                    <th>Sexo</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="t" items="${listagem}">
            <tr>
                <td>${t.id}</td>
                <td>${t.nome}</td>
                <td>${t.email}</td>
                <td>${t.telefone}</td>
                <td>${t.coren}</td>
                <td>${t.diarista}</td>
                <td>${t.sexo}</td>
                <td><a href="/tecnico/${t.id}/excluir">excluir</a> </td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>