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
<title>Par�metros Gerais</title>
</head>
<body>

   <form action="gravar_usuario.jsp" method="post" >
   
   <fieldset>
     <legend>Cadastro de Par�metros</legend><br>
<br>Insira os valores desejados:

<table>
	<tr>


	</tr>
	<tr>
		<td style="width: 93px">Hora:</td>
		<td style="width: 310px"><input></td>
	</tr>
	<tr>
		<td>Di�ria:</td>
		<td><input></td>
	</tr>
	<tr>
		<td>Mensalidade:</td>
		<td><input></td>
	</tr>
	<tr>
		<td>Vagas:</td>
		<td><input type="text" value="" name="login" size="40"
			style="width: 146px"></td>
	</tr>
	<tr>
		<td style="width: 142px">Vagas Especiais:</td>
		<td style="width: 301px"><input></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="button" value="Gravar" onclick="submit()"><input
			type="submit" value="Excluir"><input type="submit"
			value="Alterar"></td>
	</tr>

</table>
<br>
<a href="menu.jsp" > Voltar ao Menu </a>


</fieldset>
   
   
   
   </form>


</body>
</html>