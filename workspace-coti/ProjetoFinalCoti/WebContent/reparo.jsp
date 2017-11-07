<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="shortcut icon" href="favicon.ico" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title> Sistema de Inventário de Computadores e Impressoras - Solicitar Reparo </title>

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
        
        <h3> Solicitar Reparo de Computador e Impressora </h3>
        <form name="form" method="post" action="ControleReparo">
        	<table>
                <tr>
                	<td> Computador Defeituoso: </td>
                    <td> 
                    	 <select name="computador">
                    	 <option value=""> </option>
                         </select>                    
                    </td>
                </tr>
                <tr>
                	<td> Impressora Defeituosa: </td>
                    <td> 
                    	 <select name="impressora">
                    	 <option value=""> </option>
                         </select>                    
                    </td>
                </tr>
                <tr>
                	<td> Usuário: </td>
                    <td> <input name="usuario" size="20" value=""/></td>
                </tr>
                <tr>
                	<td> </td>
                    <td> <textarea name="descricao" cols="80" rows="7" value=""> </textarea></td>
                </tr>
         		<tr>
                	<td> <br/> <input id="botao" type="button" value="Enviar Solicitação" onclick="validaReparo()"/> </td>
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

	function validaReparo()
	{
		f = document.form;
		
		if (f.computador.value && f.impressora.value == "" ){
			alert("Escolha pelo menos um Computador ou Impressora da lista");
			f.computador.focus();
		} else if(f.usuario.value.length < 3){
			alert("O campo 'USUÁRIO' deve conter pelo menos 3 caracteres");
			f.usuario.focus();
		} else if(f.descricao.value.length < 5){
			alert("O campo 'DESCRIÇÃO DO PROBLEMA' deve conter pelo menos 5 caracteres");
			f.descricao.focus();
		} else{
			f.submit();
		}
	}
    
    </script>

</body>
</html>