package com.yanger.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 */
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置响应内容
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter printWriter = resp.getWriter();

        printWriter.write("<div>我的web学习ing。。。</div>");
    }
}
