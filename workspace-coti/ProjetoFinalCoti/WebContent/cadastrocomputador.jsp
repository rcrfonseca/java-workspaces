<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="shortcut icon" href="favicon.ico" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title> Sistema de Inventário de Computadores e Impressoras - Cadastrar Computador </title>

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
        <h3> Cadastro de Computador </h3>
        <form name="form" method="post" action="ControleComputador">
        	<table>
            	<tr>
                	<td> Nome do Computador na Intranet: </td>
                    <td> <input name="nome" size="20" value=""/></td>
                </tr>
                <tr>
                	<td> CPU: </td>
                    <td> <input name="cpu" size="20" value=""/></td>
                </tr>
                <tr>
                	<td> RAM: </td>
                    <td> <input name="ram" size="20" value=""/></td>
                </tr>
                <tr>
                	<td> Placa de Vídeo: </td>
                    <td> <input name="video" size="20" value=""/></td>
                </tr>
                <tr>
                	<td> Drive de Mídia [CD, DVD, BLU-RAY]: </td>
                    <td> <input name="drivemidia" size="20" value=""/></td>
                </tr>
                <tr>
                	<td> H.D.: </td>
                    <td> <input name="hd" size="20" value=""/></td>
                </tr>
                <tr>
                	<td> Placa-Mãe: </td>
                    <td> <input name="placamae" size="20" value=""/></td>
                </tr>
                <tr>
                	<td> Monitor: </td>
                    <td> <input name="monitor" size="20" value=""/></td>
                </tr>
				<tr>
                	<td> Sistema Operacional: </td>
                    <td> <input name="so" size="20" value=""/></td>
                </tr>
                <tr>
                	<td> <br/> <input id="botao" type="button" value="Cadastrar Computador" onclick="validaComputador()"/> </td>
                    <td> <br/> <input id="botao" type="reset" value="Limpar"/> </td>
                </tr>
                <tr>
                    <td colspan="2"> <br/> <el> ${mensagem} </el> </td>
                </tr>
            </table>
          </form>
        
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
    
    <script type="application/javascript">

	function validaComputador()
	{
		f = document.form;
		
		if (f.nome.value.length < 3){
			alert("O campo 'NOME' deve conter pelo menos 3 caracteres");
			f.nome.focus();
		} else if(f.cpu.value.length < 3){
			alert("O campo 'CPU' deve conter pelo menos 3 caracteres");
			f.cpu.focus();
		} else if(f.ram.value.length < 3){
			alert("O campo 'RAM' deve conter pelo menos 3 caracteres");
			f.ram.focus();
		} else if(f.video.value.length < 3){
			alert("O campo 'VÍDEO' deve conter pelo menos 3 caracteres");
			f.video.focus();
		} else if(f.drivemidia.value.length < 2){
			alert("O campo 'DRIVE DE MÍDIA' deve conter pelo menos 2 caracteres");
			f.drivemidia.focus();
		} else if(f.hd.value.length < 5){
			alert("O campo 'H.D.' deve conter pelo menos 5 caracteres");
			f.hd.focus();
		} else if(f.placamae.value.length < 5){
			alert("O campo 'PLACA-MÃE' deve conter pelo menos 5 caracteres");
			f.placamae.focus();
		} else if(f.monitor.value.length < 4){
			alert("O campo 'MONITOR' deve conter pelo menos 4 caracteres");
			f.monitor.focus();
		} else if(f.so.value.length < 5){
			alert("O campo 'SISTEMA OPERACIONAL' deve conter pelo menos 5 caracteres");
			f.so.focus();
		} else{
			f.submit();
		}
	}
    
    </script>
${mensagem}
</body>
</html>