<h2>Login do Usuário</h2><p/>
<hr/>
<p/>
<form method="post" action="Controle" name="form1">
Login<br/>
<input type="text" name="login" value="" size="30" />
<br/>Senha <br/>
<input type="password" name="senha1" value="" size="15" />
<br/>Redigite a Senha<br/>
<input type="password" name="senha2" value="" size="15" />
<p/>
<input type="button" value="Enviar os Dados" onclick="main()" />
<script>
 function main(){
     if (form1.login.value.length < 3){
         //se a quantidade de letras do login for menor que 3
          alert("digite o login ..."); //alert
          form1.login.focus(); // focus() é o cursor do login
     } 
     else if(form1.senha1.value.length<3){
    	    alert("digite a Senha ..."); //alert
            form1.senha1.focus(); // focus() é o cursor do login
     }else if (form1.senha1.value != form1.senha2.value){
 	         alert("digite as senhas Iguais"); //alert
             form1.senha1.focus(); // focus() é o cursor do login
     }else{
       form1.submit(); //se estiver tudo certo ele envia dados...
     }
	 
 }
</script>
</form>