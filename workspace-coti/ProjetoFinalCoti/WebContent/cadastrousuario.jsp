<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="shortcut icon" href="favicon.ico" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title> Sistema de Inventário de Computadores e Impressoras - Cadastro de Usuário </title>

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
        	<li> <a href="index.html"> Voltar para Index </a> </li>
            <li> <a href="login.jsp"> Ir para Login </a> </li>

        </ul>
        
        </div>
        <!-- FIM DO MENU -->
        
        <div id="corpo">
        
       		 <div id="usuario">
             <h3> Cadastro de Usuário </h3>
             <form name="form" method="post" action="ControleUsuario">
             	<table width="500px" align="left" border="0">
                	<tr>
                    	<td> Nome do Usuário: </td> 
                        <td> <input name="nome" type="text" value="" size="50"/></td>
                    </tr>
                    <tr>
                    	<td> Login [EMAIL]: </td>
                        <td><input name="login" type="text" value="" size="50"/></td>
                    </tr>
                    <tr>
                        <td> Senha: </td> 
                        <td><input name="senha" type="password" size="50"/></td>
                	</tr>
                    <tr>
                    	<td> <br/> <input id="botao" type="button" value="Cadastrar Usuário" onclick="validaCadastroUsuario()"/> </td>
                        <td> <br/> <input id="botao" type="reset" value="Limpar"/> </td>
                    </tr>
                    <tr>
                    	<td colspan="2"> <el> ${mensagem} </el> </td>
                    </tr>
                </table>
                </form>
   			 
		  </div>
             <!-- FIM DO LOGIN -->
     
      	</div>
        <!-- FIM DO CORPO -->
        
        <div id="menuRodape">
        <br/>
        <ul> 
        	<li> <a href="index.html"> Voltar para Index </a> </li>
            <li> <a href="login.jsp"> Ir para Login </a> </li>
            
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

	function validaCadastroUsuario()
	{
		f = document.form;
		
		if (f.nome.value.length < 3){
			alert("O campo 'NOME' deve conter pelo menos 3 caracteres");
			f.nome.focus();
		} else if(f.login.value.length < 4){
			alert("Digite um email válido");
			f.login.focus();
		} else if(f.senha.value.length < 3){
			alert("O campo 'SENHA' deve conter pelo menos 3 caracteres");
			f.senha.focus();
		} else{
			f.submit();
		}
	}
    
    </script>

</body>
</html>