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
        <h3>Cadastramento dos Atendimentos</h3>

        <a href="/atendimento" class="btn btn-sm btn-outline-primary">Novo</a>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Descrição</th>
                    <th>Data</th>
                    <th>Hora</th>
                    <th>Presencial</th>
                    <th>Paciente</th>
                    <th>Pessoas</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="at" items="${listagem}">
            <tr>
                <td>${at.id}</td>
                <td>${at.descricao}</td>
                <td>${at.data}</td>
                <td>${at.hora}</td>
                <td>${at.presencial}</td>
                <td>${at.paciente.nome}</td>
                <td>${at.pessoas.size()}</td>
                <td><a href="/atendimento/${at.id}/excluir">excluir</a> </td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>