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
<nav class="navbar navbar-expand-sm bg-light navbar-light">
    <div class="container-fluid">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link active" href="/">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/atendente/lista">Atendente</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/medico/lista">M�dico</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/tecnico/lista">T�cnico</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/pessoa/lista">Pessoa</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/paciente/lista">Paciente</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/atendimento/lista">Atendimento</a>
            </li>
        </ul>
    </div>
</nav>
    <div class="container mt-3">
        <h3>Gerenciamento dos Atendimentos</h3>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Descri��o</th>
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