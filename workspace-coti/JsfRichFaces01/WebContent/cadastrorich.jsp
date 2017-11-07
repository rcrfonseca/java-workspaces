<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Projeto JSF com Rich Faces </title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>

<h2> Bem vindo ao Rich Faces </h2>
<p/>
<hr/>
<p/>

<f:view>
	<rich:panel>
		<f:facet name="header">
		<h:outputText value="Cadastro com Rich Faces"/>
		</f:facet>
			<a4j:form id="form1">
				<h:panelGrid columns="2"> 
					<h:outputText value="Nome"/>
					<h:inputText value="#{ManagerBean.pessoa.nome}" size="35"/>
					
					<h:outputText value="Email"/>
					<h:inputText value="#{ManagerBean.pessoa.email}" size="50"/>
					
					<a4j:commandButton value="Gravar os Dados" reRender="form1, form2" action="#{ManagerBean.cadastro}"/>
				</h:panelGrid>
				<h:messages></h:messages>
			</a4j:form>
			<p/>
			<a4j:form id="form2">
				<rich:dataTable border="1" width="70%" align="center" value="#{ManagerBean.listagem}" var="pessoa" id="tabela">
				
					<rich:column>
						<f:facet name="header"> 
							<h:outputText value="Código"></h:outputText>
						</f:facet>
						<h:outputText value="#{pessoa.idpessoa}"></h:outputText>
					</rich:column> 
					
					<rich:column>
						<f:facet name="header"> 
							<h:outputText value="Nome"></h:outputText>
						</f:facet>
						<h:outputText value="#{pessoa.nome}"></h:outputText>
					</rich:column> 
					
					<rich:column>
						<f:facet name="header"> 
							<h:outputText value="Email"></h:outputText>
						</f:facet>
						<h:outputText value="#{pessoa.email}"></h:outputText>
					</rich:column> 
					
				</rich:dataTable>
				
			<rich:datascroller for="tabela" maxPages="3"></rich:datascroller>

			</a4j:form>
	</rich:panel>
</f:view>
</body>
</html>