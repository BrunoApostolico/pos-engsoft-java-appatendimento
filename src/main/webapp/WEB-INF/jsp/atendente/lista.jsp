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
                    <th>Nome</th>
                    <th>Email</th>
                    <th>Telefone</th>
                    <th>Idade</th>
                    <th>Formação</th>
                    <th>Turno</th>
                </tr>
            </thead>
            <tbody>
            <tr>
                <td>Karen</td>
                <td>karen@atendimento.com</td>
                <td>24 99988-5577</td>
                <td>19</td>
                <td>Ensino Médio</td>
                <td>Dia</td>
            </tr>
            <tr>
                <td>Hellen</td>
                <td>hellen@atendimento.com</td>
                <td>24 99977-8866</td>
                <td>23</td>
                <td>Ensino Superior</td>
                <td>Noite</td>
            </tr>
            <tr>
                <td>Kaian</td>
                <td>kaian@atendimento.com</td>
                <td>24 99922-4455</td>
                <td>21</td>
                <td>Ensino Fundamental</td>
                <td>Dia</td>
            </tr>
            </tbody>
        </table>
    </div>
</body>
</html>