package com.blog;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class BlogServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<String> posts = Arrays.asList(
                "Welcome to my first blog!",
                "Java Servlets are powerful.",
                "Maven makes build automation easy."
        );

        req.setAttribute("posts", posts);
        RequestDispatcher rd = req.getRequestDispatcher("blog.jsp");
        rd.forward(req, resp);
    }
}
