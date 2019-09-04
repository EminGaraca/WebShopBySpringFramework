<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add customer</title>
    </head>
    <body>
        <h1>Add customer</h1>
        <form:form action="customers.htm" method="post" commandName="customers">
            <form:label path="name">Enter name of customer : </form:label> <br/> 
            <form:input id="name" type="text" path="name" placeholder="name of customer..."></form:input> <br/>
                <input type="submit" value="Submit"/> 
        </form:form>

        <h1>Delete customer</h1>
        <form:form action="customers.htm" method="post" commandName="customers">
            <form:label path="customers_id">Enter customer id which you want to delete : </form:label> <br/> 
            <form:input id="customers_id" type="text" path="customers_id" placeholder="customers id..."></form:input> <br/>
                <input type="submit" value="Submit"/> 
        </form:form>

        <h1>Update customer</h1>
        <form:form action="customers.htm" method="post" commandName="customers">
            <form:label path="customers_id">Enter customer id which you want update : </form:label> <br/> 
            <form:input id="customers_id" type="text" path="customers_id" placeholder="customers id..."></form:input> <br/>
            <form:label path="name">Enter customer new name : </form:label> <br/>
            <form:input id="name" type="text" path="name" placeholder="customers new name..."></form:input> <br/>
                <input type="submit" value="Submit"/> 
        </form:form>       



    </body>
</html>
