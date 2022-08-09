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
        <h3>Classe: Pessoa</h3>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Atributo</th>
                <th>Tipo</th>
                <th>Descri��o</th>
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
    </div>
</body>
</html>