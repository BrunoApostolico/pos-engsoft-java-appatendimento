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
    <h2>Cadastramento de Técnico</h2>
    <form action="/tecnico/incluir" method="post">

        <c:import url="/WEB-INF/jsp/pessoa/cadastro.jsp"/>
        <div class="mb-3 mt-3">
            <label>Coren:</label>
            <input type="text" class="form-control"  placeholder="Informe o Coren" name="coren">
        </div>
        <div class="mb-3 mt-3">
            <label>Diarista:</label>
            <label class="radio-inline">
                <input type="radio" name="diarista" value="true" checked> Sim
            </label>
            <label class="radio-inline">
                <input type="radio" name="diarista" value="false"> Não
            </label>
        </div>
        <div class="mb-3 mt-3">
            <label>Sexo:</label>
            <input type="text" class="form-control"  placeholder="Informe o Sexo" name="sexo">
        </div>

        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>
</body>
</html>