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
        <h3>Classe: Tecnico</h3>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Email</th>
                    <th>Telefone</th>
                    <th>Coren</th>
                    <th>Diarista</th>
                    <th>Sexo</th>
                </tr>
            </thead>
            <tbody>
            <tr>
                <td>Priscila</td>
                <td>priscila@tecnico.com</td>
                <td>21 99363-8628</td>
                <td>123123123</td>
                <td>Sim</td>
                <td>Feminino</td>
            </tr>
            <tr>
                <td>Vanessa</td>
                <td>vanessa@tecnico.com</td>
                <td>21 99112-2443</td>
                <td>123432321</td>
                <td>Sim</td>
                <td>Feminino</td>
            </tr>
            <tr>
                <td>Leandro</td>
                <td>leandro@tecnico.com</td>
                <td>21 99118-8554</td>
                <td>432432432</td>
                <td>Não</td>
                <td>Masculino</td>
            </tr>
            </tbody>
        </table>
    </div>
</body>
</html>