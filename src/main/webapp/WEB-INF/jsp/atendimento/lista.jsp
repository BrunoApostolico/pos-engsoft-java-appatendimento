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
        <h3>Classe: Atendente</h3>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Data</th>
                    <th>Hora</th>
                    <th>Local</th>
                </tr>
            </thead>
            <tbody>
            <tr>
                <td>08/08/2022</td>
                <td>08:30</td>
                <td>São Pedro da Aldeia</td>
            </tr>
            <tr>
                <td>09/08/2022</td>
                <td>09:30</td>
                <td>Rio de Janeiro</td>
            </tr>
            <tr>
                <td>10/08/2022</td>
                <td>10:30</td>
                <td>Cabo Frio</td>
            </tr>
            </tbody>
        </table>
    </div>
</body>
</html>