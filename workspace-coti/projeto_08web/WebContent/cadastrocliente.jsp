<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html>
	<html:form action="Controle" method="Post" onsubmit="return validateClienteForm(this);">
	
	<br/> Nome: <br/>
	<html:text property="nome" size="35" value="" />
	
	<br/> Email: <br/>
	<html:text property="email" size="50" value="" />
	
	<br/> Data Nacimento: <br/>
	<html:text property="datanasc" size="12" value="" />
	<p/>
	
	<html:submit> Enviar os Dados </html:submit>

	</html:form>
	<html:javascript formName="ClienteForm" />
</html:html>