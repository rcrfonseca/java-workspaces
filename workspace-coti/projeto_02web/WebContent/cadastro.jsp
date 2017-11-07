<form method="post" action="Controle" name="form1">*First Name <br />

<input type="text" name="firstname" value"" size="15" maxlength="30" />
<br />
<div id='errofirstname' style='color: #F00'></div>

<br />
*Last Name <br />
<input type="text" name="lastname" value"" size="15" maxlength="30" />
<br />
<div id='errolastname' style='color: #F00'></div>

<br />
*Email <br />
<input type="text" name="email" value"" size="30" maxlength="30" /> <br />
<div id='erroemail' style='color: #F00'></div>

<p /><input type="button" value="Enviar os dados" onclick=
	"main()"
/>
</form>


<script>
	function main() {
		if (form1.firstname.value.length == 0) {
			document.getElementById("errofirstname").innerHTML = 'Digite o Nome';
		} else if (form1.lastname.value.length == 0) {
			document.getElementById("errolastname").innerHTML = 'Digite o Sobrenome';
		} else if (form1.email.value.length == 0) {
			document.getElementById("erroemail").innerHTML = 'Digite o Email';
		} else {
			form1.submit();
		}
	}
</script>

<p/>
${msg}