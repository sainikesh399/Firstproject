<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

<div class="container">
    <h3 class="text-center mt-3" style="color: burlywood; background-color: grey; padding: 20px;">
        Update student
    </h3>
    <form action="updatestudent" method="post">
        <table class="table2"  >
            <tr>
                <th><label for="id">Id:</label></th>
                <th><input type="number" name="id" min="1" placeholder="Enter id here:"></th>
            </tr>
            <tr>
                <th><label for="name">Name:</label></th>
                <th><input type="text" name="name" placeholder="Enter name here:"></th>
            </tr>
            
            <tr>
                <th><label for="email">Email:</label></th>
                <th><input type="email" name="email"  placeholder="Enter email here:"></th>
            </tr>
            <tr>
                <th><label for="age">Age:</label></th>
                <th><input type="number" name="age" min="0" placeholder="Enter age:"></th>
            </tr>
            <tr>
                <th><label for="gender">Gender:</label></th>
                <th><select name="gender">
               <option  value="Male"> Male:
               <option  value="Female"> Female:
               <option  value="Other"> Other:
               </select> </th>
            </tr>
            <tr>
                <th><input class="btn btn-success" type="submit" value="Update"></th>
                <th><input class="btn btn-primary" type="reset" value="Reset"></th>
            </tr>
        </table>
    </form>
    
    <ul class="list-group-infos mt-3">
        <li class="list-group-item mt-3" >
            <a class="navbar-brand black" href="index">Go back</a>
        </li>
    </ul>
</div>

</body>
</html>