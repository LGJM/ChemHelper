<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="taglibs.jsp"%>

<html>
    <head>
        <%-- JQuery --%>
        <script
            src="https://code.jquery.com/jquery-2.2.4.min.js"
            integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
            crossorigin="anonymous">
        </script>

        <%-- Materialize --%>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css"/>

        <%-- Material Design Icons --%>
        <link rel="stylesheet" href="https://cdn.materialdesignicons.com/2.0.46/css/materialdesignicons.min.css"/>

        <%-- Custom CSS --%>
        <link rel="stylesheet" href="/resources/css/common/chemhelper.css"/>

        <link rel="shortcut icon" href="/resources/images/favicon.ico"/>
        <title>ChemHelper<%--<sitemesh:write property="meta.heading">--%></title>
    </head>

    <body>
        <%@ include file="header.jsp" %>
        <div class="container"><decorator:body/></div>
        <%@ include file="footer.jsp" %>
    </body>
</html>
