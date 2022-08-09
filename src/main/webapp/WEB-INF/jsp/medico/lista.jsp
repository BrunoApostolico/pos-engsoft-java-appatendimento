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
        </ul>
    </div>
</nav>
    <div class="container mt-3">
        <h3>Classe: Medico</h3>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Email</th>
                    <th>Telefone</th>
                    <th>CRM</th>
                    <th>Especialista</th>
                    <th>Pediatra</th>
                </tr>
            </thead>
            <tbody>
            <tr>
                <td>Luiz Alberto</td>
                <td>luiz@medico.com</td>
                <td>21 99225-5443</td>
                <td>123123123</td>
                <td>Sim</td>
                <td>Não</td>
            </tr>
            <tr>
                <td>Regina Silva</td>
                <td>regina@medico.com</td>
                <td>21 99335-5882</td>
                <td>432124223</td>
                <td>Não</td>
                <td>Sim</td>
            </tr>
            <tr>
                <td>Maria Jose</td>
                <td>maria@medico.com</td>
                <td>21 99113-3775</td>
                <td>643543623</td>
                <td>Sim</td>
                <td>Não</td>
            </tr>
            </tbody>
        </table>
    </div>
</body>
</html>