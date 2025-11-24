<!DOCTYPE html>
<html>
<head>
    <title>Blog Posts</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>Latest Blog Posts</h1>
    <p>Here are my blog posts generated using a Java Servlet.</p>

    <%
        java.util.List<String> posts = (java.util.List<String>) request.getAttribute("posts");
        for(String p : posts){
    %>
        <div class="post"><%= p %></div>
    <% } %>

</body>
</html>
