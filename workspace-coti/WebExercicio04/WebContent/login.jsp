<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Web Exerc�cio 04 - Projeto Login com BD</title>
</head>
<body>

<h2> P�gina de Login </h2>
<hr/>
<br/>

<form name="form" method="post" action="ControleLogin">
Login:<br/>
<input name="login" type="text" size="35" value=""/>
<br/>
Senha:<br/>
<input name="senha1" type="password" size="20"/>
<br/>
Redigite a senha:<br/>
<input name="senha2" type="password" size="20"/>
<br/>
<br/>
<input name="enviar" type="button" value="Logar no sistema" onclick="validaForm()" />
</form>

<script>
function validaForm(){
	f = document.form;
	
	if(f.login.value == ""){
		alert("Digite o login");
		f.login.focus();
	}else if(f.senha1.value == ""){
		alert("Digite a senha");
		f.senha1.focus();
	}else if(f.senha2.value == ""){
		alert("Redigite a senha");
		f.senha2.focus();
	}else if(f.senha1.value != f.senha2.value){
		alert("As senhas digitadas n�o s�o iguais!");
		f.senha2.focus();
	}else {
		f.submit();
	}
}
</script>

<br/>
<br/>
<h3> Resultado</h3>
${mensagem}
<hr/>

<a href="index.jsp"> Voltar para a index </a>

</body>
</html>