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
    <h2>Cadastramento de Médico</h2>
    <form action="/medico/incluir" method="post">

        <c:import url="/WEB-INF/jsp/pessoa/cadastro.jsp"/>
        <div class="mb-3 mt-3">
            <label>CRM:</label>
            <input type="text" class="form-control"  placeholder="Informe o CRM" name="crm">
        </div>
        <div class="mb-3 mt-3">
            <label>Especialista:</label>
            <label class="radio-inline">
                <input type="radio" name="especialista" value="true" checked> Sim
            </label>
            <label class="radio-inline">
                <input type="radio" name="especialista" value="false"> Não
            </label>
        </div>
        <div class="mb-3 mt-3">
            <label>Pediatra:</label>
            <label class="radio-inline">
                <input type="radio" name="pediatra" value="true" checked> Sim
            </label>
            <label class="radio-inline">
                <input type="radio" name="pediatra" value="false"> Não
            </label>
        </div>
        <div class="mb-3 mt-3">
            <label>Ano de Formação:</label>
            <input type="text" class="form-control"  placeholder="Informe o ano de Formação" name="anoFormacao">
        </div>

        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>
</body>
</html>