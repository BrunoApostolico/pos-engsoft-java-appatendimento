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
        <h3>Cadastramento de Pacientes</h3>

        <a href="/paciente" class="btn btn-sm btn-outline-primary">Novo</a>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nome</th>
                    <th>Telefone</th>
                    <th>Idade</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="pa" items="${listagem}">
            <tr>
                <td>${pa.id}</td>
                <td>${pa.nome}</td>
                <td>${pa.telefone}</td>
                <td>${pa.idade}</td>
                <td><a href="/paciente/${pa.id}/excluir">excluir</a></td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>