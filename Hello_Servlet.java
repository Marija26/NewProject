package servlet_sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.io.PrintWriter;

/**
 * Created by Admin on 12.06.2017.
 */
@WebServlet(name = "Hello_Servlet", urlPatterns = {"/a/b/c","/servlets/hello"})
public class Hello_Servlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>hello</h1>");
        out.flush();
    }
}
