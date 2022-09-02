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
            <c:if test="${not empty user}">

                <li class="nav-item">
                    <a class="nav-link" href="/usuario/lista">Usuário</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/atendente/lista">Atendente</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/medico/lista">Médico</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/tecnico/lista">Técnico</a>
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
            </c:if>
        </ul>
        <ul class="navbar-nav">
        <c:if test="${empty user}">
            <li class="nav-item">
                <a class="nav-link" href="">Signup</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/login">Login</a>
            </li>
        </c:if>
            <c:if test="${not empty user}">
            <li class="nav-item">
                <a class="nav-link" href="/logout">Logout ${user}</a>
            </li>
        </c:if>
        </ul>
    </div>
</nav>
    <div class="container mt-3">
        <h2>AppAtendimento</h2>
        <p>Projeto de Gestão de Atendimentos</p>

        <h3>Classe: Atendimento</h3>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Atributo</th>
                <th>Tipo</th>
                <th>Descrição</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>data</td>
                <td>LocalDate</td>
                <td>Data do Atendimento</td>
            </tr>
            <tr>
                <td>hora</td>
                <td>LocalTime</td>
                <td>Horário do Atendimento</td>
            </tr>
            <tr>
                <td>local</td>
                <td>String</td>
                <td>Local do Atendimento</td>
            </tr>
            </tbody>
        </table>
        <h3>Classe: Paciente</h3>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Atributo</th>
                <th>Tipo</th>
                <th>Descrição</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>nome</td>
                <td>String</td>
                <td>Nome do Paciente</td>
            </tr>
            <tr>
                <td>telefone</td>
                <td>String</td>
                <td>Telefone de contato do paciente</td>
            </tr>
            <tr>
                <td>idade</td>
                <td>int</td>
                <td>Idade do Paciente</td>
            </tr>
            </tbody>
        </table>
        <h3>Classe: Pessoa</h3>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Atributo</th>
                <th>Tipo</th>
                <th>Descrição</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>nome</td>
                <td>String</td>
                <td>Nome dos Profissionais</td>
            </tr>
            <tr>
                <td>email</td>
                <td>String</td>
                <td>E-mail de contato</td>
            </tr>
            <tr>
                <td>telefone</td>
                <td>String</td>
                <td>Telefone de contato</td>
            </tr>
            </tbody>
        </table>
        <h3>Classe: Atendente</h3>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Atributo</th>
                <th>Tipo</th>
                <th>Descrição</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>idade</td>
                <td>int</td>
                <td>Idade do Atendente</td>
            </tr>
            <tr>
                <td>formacao</td>
                <td>String</td>
                <td>Formação escolar</td>
            </tr>
            <tr>
                <td>turno</td>
                <td>String</td>
                <td>Turno de trabalho</td>
            </tr>
            </tbody>
        </table>
        <h3>Classe: Medico</h3>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Atributo</th>
                <th>Tipo</th>
                <th>Descrição</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>crm</td>
                <td>String</td>
                <td>CRM do médico</td>
            </tr>
            <tr>
                <td>especialista</td>
                <td>boolean</td>
                <td>Identificação se é especialista</td>
            </tr>
            <tr>
                <td>pediatra</td>
                <td>boolean</td>
                <td>Identificação se é pediatra</td>
            </tr>
            </tbody>
        </table>
        <h3>Classe: Tecnico</h3>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Atributo</th>
                <th>Tipo</th>
                <th>Descrição</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>coren</td>
                <td>String</td>
                <td>COREN do técnico</td>
            </tr>
            <tr>
                <td>diarista</td>
                <td>boolean</td>
                <td>Identificação se é diarista</td>
            </tr>
            <tr>
                <td>sexo</td>
                <td>String</td>
                <td>Sexo do técnico</td>
            </tr>
            </tbody>
        </table>
    </div>
</body>
</html>