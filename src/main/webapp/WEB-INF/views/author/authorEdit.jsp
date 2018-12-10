
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
     <form method="post">
         <Table>
             <td style="padding-right: 40">
                 <div class="row" margin=6>
                     <label>Author Name</label>
                     <input type="hidden" name="id" value="${authorName.id}"/>
                     <br/>
                     <input type="text" name="first name" value="${authorName.firstName}"/>
                 </div>
             </td>
             <td>
                 <div class="row">
                     <label>Second Name</label>
                     <br/>
                     <input type="text" name="secondName" value="${authorName.secondsName}"/>
                 </div>
             </td>

         </Table>
         <button type="submit" value="Save">Save</button>
     </form>
</body>
</html>