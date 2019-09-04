<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add product</title>
    </head>
    <body>
        <h1>Add product</h1>
        <form:form action="products.htm" method="post" commandName="products">
            <form:label path="name">Enter product name : </form:label> <br/> 
            <form:input id="name" type="text" path="name" placeholder="product name..."></form:input> <br/>
            <form:label path="price">Enter product price : </form:label> <br/> 
            <form:input id="price" type="text" path="price" placeholder="product price..."></form:input> <br/>
            <form:label path="quantity">Enter product quantity : </form:label> <br/> 
            <form:input id="quantity" type="text" path="quantity" placeholder="product quantity..."></form:input> <br/>
                <input type="submit" value="Submit"/> 
        </form:form>

        <h1>Delete customer</h1>
        <form:form action="products.htm" method="post" commandName="products">
            <form:label path="products_id">Enter product id which you want to delete : </form:label> <br/> 
            <form:input id="products_id" type="text" path="products_id" placeholder="products id..."></form:input> <br/>
                <input type="submit" value="Submit"/> 
        </form:form>

        <h1>Update customer</h1>
        <form:form action="products.htm" method="post" commandName="products">
            <form:label path="products_id">Enter product id which you want to update : </form:label> <br/> 
            <form:input id="products_id" type="text" path="products_id" placeholder="products id..."></form:input> <br/>
            <form:label path="name">Enter product new name : </form:label> <br/>
            <form:input id="name" type="text" path="name" placeholder="customers new name..."></form:input> <br/>
            <form:label path="price">Enter product new price : </form:label> <br/>
            <form:input id="price" type="text" path="price" placeholder="customers new price..."></form:input> <br/>
            <form:label path="quantity">Enter product new quantity : </form:label> <br/>
            <form:input id="quantity" type="text" path="quantity" placeholder="customers new quantity..."></form:input> <br/>
                <input type="submit" value="Submit"/> 
        </form:form>       



    </body>
</html>
