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
    <h2>Cadastramento de Atendente</h2>
    <form action="/atendente/incluir" method="post">
        <c:import url="/WEB-INF/jsp/pessoa/cadastro.jsp"/>

        <div class="mb-3 mt-3">
            <label>Idade:</label>
            <input type="number" class="form-control"  placeholder="Informe a Idade" name="idade">
        </div>
        <div class="mb-3 mt-3">
            <label>Formação:</label>
            <input type="text" class="form-control"  placeholder="Informe a Formação" name="formacao">
        </div>
        <div class="mb-3 mt-3">
            <label>Turno:</label>
            <input type="text" class="form-control"  placeholder="Informe o Turno" name="turno">
        </div>




        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>
</body>
</html>