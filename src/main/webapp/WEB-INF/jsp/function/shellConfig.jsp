<%@ include file="/WEB-INF/jsp/common/taglibs.jsp"%>

<%--<form:form action="" command="bean" method="post">--%>
    <%--<form:radiobutton path="isAtomicNum" name="typeToggle" label="Atomic Num"/>--%>
<%--</form:form>--%>
<%--<form:form action="/submit" method="post" commandName="bean" id="tempForm">--%>
    <%--<div class="row">--%>
        <%--<div class="input-field col s12">--%>
            <%--<form:input path="input" type="text" id="input"/>--%>
            <%--<label for="input">ENTER SOMETHING</label>--%>
            <%--<br>--%>
            <%--<form:button class="btn waves-effect waves-light" type="submit">SUBMIT</form:button>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</form:form>--%>
<form:form action="/fn/temp2" method="post" commandName="fnBean" modelAttribute="fnBean" id="tempForm">
    <form:textarea path="input" type="text" id="input"/>
    <label for="input">ENTER SOMETHING</label>
    <form:button type="submit">SUBMIT</form:button>
</form:form>