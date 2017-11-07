<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="shortcut icon" href="favicon.ico" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title> Sistema de Inventário de Computadores e Impressoras - Alterar Impressora </title>

<link href="css/estilo.css" rel="stylesheet" type="text/css" />
<link href="css/menu.css" rel="stylesheet" type="text/css" />
<link href="css/menurodape.css" rel="stylesheet" type="text/css" />
<link href="css/datagrid.css" rel="stylesheet" type="text/css" />

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

        <h3> Cadastro de Impressora </h3>
        <form name="form" method="post" action="ControleImpressoraAt">
        	<table>
        	<%@ page import="entity.*,persistence.*" %>
        	<% 
        		ImpressoraDao id = new ImpressoraDao();
        		Impressora i = (Impressora) id.findByNome(); 
            	out.print("<tr>");
                out.print("<td>" + i.getNome() + "Nome da Impressora na Intranet: " + "</td>"); %>
                    <td> <input name="nome" size="20" value=""/></td>
                </tr>
                <tr>
                	<td> Marca da Impressora: </td>
                    <td> <input name="marca" size="20" value=""/></td>
                </tr>
                <tr>
                	<td> Modelo da Impressora: </td>
                    <td> <input name="modelo" size="20" value=""/></td>
                </tr>
                <tr>
                	<td> Conexão da Impressora: </td>
                    <td> 
                    	 <select name="conexaoImpressora">
                    	 <option value=""> Selecione um tipo </option>
                    	 <option value="usb"> USB </option>
                         <option value="rede"> Rede </option>
                         </select>                    
                    </td>
                </tr>
                <tr>
                	<td> <br/> <input id="botao" type="button" value="Alterar Impressora" onclick="validaImpressora()"/> </td>
                    <td> <br/> <input id="botao" type="reset" value="Limpar"/> </td>
                </tr>
                <tr>
                    <td colspan="2"> <br/> <el> ${mensagem} </el> </td>
                </tr>
          
            </table>
          </form>

		<!-- DATA GRID PARA RESGATAR OS DADOS CADASTRADOS, ALTERAR E DELETAR -->
		<%@ page import="entity.*,persistence.*" %>
				
		<table id="datagrid" cellspacing="0">
			<tr>
				<th align="left">Nome</th>
				<th align="left">Marca</th>
				<th align="left">Modelo</th>
				<th align="left">Conexão</th>
				<th align="left">Operação</th>
				<th align="left">Operação</th>
			</tr> 	
		</table>
        <br/>
		<!-- FIM DO DATA GRID -->
        
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

	function validaImpressora()
	{
		f = document.form;
		
		if (f.nome.value.length < 3){
			alert("O campo 'NOME' deve conter pelo menos 3 caracteres");
			f.nome.focus();
		} else if(f.marca.value.length < 2){
			alert("O campo 'MARCA' deve conter pelo menos 2 caracteres");
			f.marca.focus();
		} else if(f.modelo.value.length < 2){
			alert("O campo 'MODELO' deve conter pelo menos 2 caracteres");
			f.modelo.focus();
		} else if(f.conexaoImpressora.value.length == ""){
			alert("Selecione o tipo de conexão para a impressora");
			f.conexaoImpressora.focus();
		} else{
			f.submit();
		}
	}
    
    </script>
${mensagem}
</body>
</html>