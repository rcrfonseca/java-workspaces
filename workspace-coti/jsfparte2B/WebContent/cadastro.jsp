<%@ taglib uri="http://java.sun.com/jsf/core"   prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html"   prefix="h" %>

<f:view>
   <h:form id="form1">
   <h:outputText value="Nome"></h:outputText><br/>
   <h:inputText value="#{ManagerBean.pessoa.nome}"></h:inputText><br/>  
   <h:outputText value="Sexo"></h:outputText><br/>
   <h:inputText value="#{ManagerBean.pessoa.sexo}"></h:inputText><br/>
   
   <h:outputText value="Bairro"></h:outputText><br/>
   <h:inputText value="#{ManagerBean.pessoa.endereco.bairro}"></h:inputText><br/>

   <h:outputText value="Cidade"></h:outputText><br/>
   <h:inputText value="#{ManagerBean.pessoa.endereco.cidade}"></h:inputText><br/>

   <h:outputText value="Estado"></h:outputText><br/>
   <h:inputText value="#{ManagerBean.pessoa.endereco.estado}"></h:inputText><br/>
    
  <h:commandButton value="Gravar os Dados" action="#{ManagerBean.gravaDados}">
  </h:commandButton>
  <p/>
   <h:messages></h:messages>
   </h:form>
   
   <p/>
   
   <h:form>
   			<h:dataTable value="#{ManagerBean.listagem}" var="pessoa" border="1" width="70%">
   				<h:column>
   					<f:facet name="header"><h:outputText value="Nome" /></f:facet>
   					<h:outputText value="#{pessoa.nome}"></h:outputText>
   				</h:column>
   				
   				<h:column>
   					<f:facet name="header"><h:outputText value="Sexo" /></f:facet>
   					<h:outputText value="#{pessoa.sexo}"></h:outputText>
   				</h:column>
   				
   				<h:column>
   					<f:facet name="header"><h:outputText value="Bairro" /></f:facet>
   					<h:outputText value="#{pessoa.endereco.bairro}"></h:outputText>
   				</h:column>
   				
   				<h:column>
   					<f:facet name="header"><h:outputText value="Cidade" /></f:facet>
   					<h:outputText value="#{pessoa.endereco.cidade}"></h:outputText>
   				</h:column>
   				
   				<h:column>
   					<f:facet name="header"><h:outputText value="Estado" /></f:facet>
   					<h:outputText value="#{pessoa.endereco.estado}"></h:outputText>
   				</h:column>
   			</h:dataTable>
   </h:form>
</f:view>