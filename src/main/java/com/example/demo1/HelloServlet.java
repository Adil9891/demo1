package com.example.demo1;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello !";
        for (int i = 0; i < 10; i++) {
            message = message+ " - "+ i;
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<link rel=\"stylesheet\" href=\"design.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<table>\n" +
                "    <tr>\n" +
                "        <td>1</td>\n" +
                "        <td>2</td>\n" +
                "        <td>3</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td>4</td>\n" +
                "        <td>5</td>\n" +
                "        <td>6</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td>7</td>\n" +
                "        <td>8</td>\n" +
                "        <td>9</td>\n" +
                "    </tr>\n" +
                "</table>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n");


    }

    public void destroy() {
    }
}