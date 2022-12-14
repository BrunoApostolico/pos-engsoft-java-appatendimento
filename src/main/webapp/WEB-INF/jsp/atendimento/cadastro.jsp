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
<c:set var="ativaBotao" value="" />
<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h2>Cadastramento de Atendimentos</h2>
    <form action="/atendimento/incluir" method="post">

        <div class="mb-3 mt-3">
            <label>Descri??o:</label>
            <input type="text" class="form-control"  placeholder="Descri??o" value="Primeiro Atendimento" name="descricao">
        </div>
        <div class="mb-3 mt-3">
            <c:if test="${not empty pacientes}">
                <label>Paciente:</label>
                <select name="paciente" class="form-control" id="sel1">
                    <c:forEach var="p" items="${pacientes}">
                        <option value="${p.id}">${p.nome}</option>
                    </c:forEach>
                </select>
            </c:if>
            <c:if test="${empty pacientes}">
                <label>N?o tem pacientes cadastrados!!!</label>
                <c:set var="ativaBotao" value="disabled" />
            </c:if>
        </div>
        <div class="mb-3 mt-3">
            <c:if test="${not empty pessoas}">
            <label>Pessoas:</label>
            <c:forEach var="ps" items="${pessoas}">
                <div class="checkbox">
                    <label><input type="checkbox" name="pessoas" value="${ps.id}">${ps.nome}</label>
                </div>
            </c:forEach>
            </c:if>
            <c:if test="${empty pessoas}">
                <label>N?o existem funcion?rios cadastrados!!!</label>
                <c:set var="ativaBotao" value="disabled" />
            </c:if>
        </div>

        <button ${ativaBotao} type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>
</body>
</html>