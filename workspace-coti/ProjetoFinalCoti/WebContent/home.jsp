<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="shortcut icon" href="favicon.ico" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title> Sistema de Inventário de Computadores e Impressoras - Página Inicial </title>

<link href="css/estilo.css" rel="stylesheet" type="text/css" />
<link href="css/menu.css" rel="stylesheet" type="text/css" />
<link href="css/menurodape.css" rel="stylesheet" type="text/css" />

</head>

<body>
	<div id="site">
    	
        <div id="topo">
        
        <img src="imagens/pclogo.png" align="right"/>
        <titulo> <p> Sistema de InventÁrio de Computadores e Impressoras </p> </titulo>
        
        </div>
        <!-- FIM DO TOPO -->
        
        <div id="menu">
        
        <ul> 
        	<li> <a href="home.jsp"> Home </a> </li>
        	<li> <a href="cadastrocomputador.jsp"> Cadastrar Computador </a> </li>
            <li> <a href="cadastroimpressora.jsp"> Cadastrar Impressora </a> </li>
            <li> <a href="reparo.jsp"> Solicitar Reparo </a> </li>
            <li> <a href="login.jsp"> Sair </a> </li>
        </ul>
        
        </div>
        <!-- FIM DO MENU -->
        
        <div id="corpo">
        <el> <h4> ${mensagem} </h4> </el>
        <h3> Projeto Final Coti Informática | Curso Web Developer Java 2011 </h3>
        
        <center> <img src="imagens/coti.jpg"/> </center>
        <br/> 
        <br/>
     	</div>
        <!-- FIM DO CORPO -->
        
        <div id="menuRodape">
        <br/>
        <ul> 
        	<li> <a href="home.jsp"> Home </a> </li>
        	<li> <a href="cadastrocomputador.jsp"> Cadastrar Computador </a> </li>
            <li> <a href="cadastroimpressora.jsp"> Cadastrar Impressora </a> </li>
            <li> <a href="reparo.jsp"> Solicitar Reparo </a> </li>
            <li> <a href="login.jsp"> Sair </a> </li>
        </ul>
        
        </div>
        <!-- FIM DO MENU RODAPÉ -->
        
        <div id="rodape">
        
        <p> Projeto: Sistema de Inventário de Computadores e Impressoras </p>
        <p> Autores: Gileno Oliveira Pinto e Raphael Carlos Rocha Fonseca </p>
        
        </div>
        <!-- FIM DO RODAPÉ -->
        
	</div>
    <!-- FIM DO SITE -->

</body>
</html>