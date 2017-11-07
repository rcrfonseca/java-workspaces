<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
  
  body {
	  font-family: verdana;
	  font-size: 9pt;
	  padding: 30pt;
	}
	
	fieldset {
	  padding: 20px;
	  background-color: #eaeaea;
	  border: 1px solid #0000aa;
	}
  
    legend {
	   background: #fff;
	   font-weight: bold;
	   color: #0000aa;
	}

</style>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro usuario</title>
</head>
<body>

   <form action="gravar_usuario.jsp" method="post" >
   
   <fieldset>
     <legend>Cadastro  de Usuários</legend>
     
     <table>
       <tr>
    
    
	   </tr>
	   <tr>
	   <td>Descrição:</td>
<td><input type="radio" value="atendente" checked="checked">Atendente       <input type="radio" value="gerente">Gerente</td>
	</tr>
	<tr>
	<td>Login:</td>
  <td><input type="text" value="" name="login" size="40"  ></td>
	</tr>      
    <tr>
    <td>Senha:</td>
 <td><input type="password" name="senha" size="40" >
 </td>
 </tr>
 <tr>
 <td></td>
 <td><input type="button" value="Gravar" onclick="submit()">
 			<input type="submit" value="Excluir">
 			<input type="submit" value="Alterar">
 			<input type="submit" value="Consultar"></td>
</tr>     
     </table><br>
<a href="menu.jsp" > Voltar ao Menu </a>


</fieldset>
   
   
   
   </form>


</body>
</html>