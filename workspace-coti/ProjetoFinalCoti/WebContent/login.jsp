<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="shortcut icon" href="favicon.ico" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title> Sistema de Inventário de Computadores e Impressoras - Página de Login </title>

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
			<li> <a href="cadastrousuario.jsp"> Voltar para Cadastro de Usuário </a> </li>
        </ul>
        
        </div>
        <!-- FIM DO MENU -->
        
        <div id="corpo">

                <table width="160px" align="center" border="0">
                
                	<tr> <th> <h3> Bem vindo</h3> </th> </tr>
                    
					<form name="form" method="post" action="ControleLogin">	
                	<tr> 
                    	<td> Login: </td> 
                    </tr>
                    <tr>
                    	<td> <input name="login" type="text" /> </td>
                    </tr>
                    <tr> 
                    	<td> Senha: </td> 
                    </tr>
                    <tr>
                    	<td> <input name="senha" type="password" /> </td>
                    </tr>
                    <tr> 
                        <td> <input id="botao" type="button" value="Login" onclick="validaLogin()">  </td>
                    </tr>
                    <tr>
                    	<td colspan="2"> <br/> <el> ${mensagem} </el> </td>
                    </tr>
      
           		</form>
 
                </table>

      	</div>
        <!-- FIM DO CORPO -->
        
        <div id="menuRodape">
        <br/>
        <ul> 
        	<li> <a href="index.html"> Voltar para Index </a> </li>
            <li> <a href="cadastrousuario.jsp"> Voltar para Cadastro de Usuário </a> </li>
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

	function validaLogin()
	{
		f = document.form;
		
		if (f.login.value.length < 3){
			alert("O campo 'NOME' deve conter pelo menos 3 caracteres");
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