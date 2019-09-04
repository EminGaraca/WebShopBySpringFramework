<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add sale</title>
    </head>
    <body>
        <h1>Add sale</h1>
        <form:form action="sale.htm" method="post" commandName="sale">
            <form:label path="customers_id">Enter customer id : </form:label> <br/> 
            <form:input id="customers_id" type="text" path="customers_id" placeholder="ID of customer..."></form:input> <br/>
            <form:label path="products_id">Enter  product id : </form:label> <br/> 
            <form:input id="products_id" type="text" path="products_id" placeholder="ID of product..."></form:input> <br/>
            <form:label path="quantity">Enter quantity : </form:label> <br/> 
            <form:input id="quantity" type="text" path="quantity" placeholder="quantity..."></form:input> <br/>
            
                <input type="submit" value="Submit"/> 
        </form:form>

    </body>
</html>
