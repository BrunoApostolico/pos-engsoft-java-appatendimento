<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
                <a class="nav-link" href="/usuario">Signup</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/login">Login</a>
            </li>
        </c:if>
            <c:if test="${not empty user}">
            <li class="nav-item">
                <a class="nav-link" href="/logout">Logout, ${user.nome}</a>
            </li>
        </c:if>
        </ul>
    </div>
</nav>