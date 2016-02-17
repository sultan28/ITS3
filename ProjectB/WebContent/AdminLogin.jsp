<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Login Page</title>
    </head>    
    <body>
    <div>
    ${message }
    </div>
        <div id="mystyle" class="myform">
            <form id="form" name="form" method="post" action="LoginSer">
                <h1>Login</h1>
                <p>Please enter your login information
                
                    <span class="small">Enter your Admin ID</span>
                </label>
                <input type="text" name="adminId" id="adminId" />

                <label>Password
                    <span class="small">Min. size 6 chars</span>
                </label>
                <input type="password" name="password" id="password" />

                <button type="submit">Sign-in</button>
                <div class="spacer"></div>
            </form>
        </div>
    
</body>
</html>