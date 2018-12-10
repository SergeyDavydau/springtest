<%--
  Created by IntelliJ IDEA.
  User: sazon_sa
  Date: 10.12.18
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Author</title>
</head>
<body>
   <form method="Post">
       <Table>
           <td style="padding-right: 40">
               <div class="row" margin=6>
                   <label>Author Name</label>
                   <br/>
                   <input type="text" name="first name" value="${authorName.firstName}"/>
               </div>
           </td>
           <td>
               <div class="row">
                   <label>Second Name</label>
                   <br/>
                   <input type="text" name="secondName" value="${authorName.secondName}"/>
               </div>
           </td>
       </Table>
       <button type="submit" value="Save">Save</button>
   </form>
</body>
</html>