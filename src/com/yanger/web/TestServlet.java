package com.yanger.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 */
//继承httpServlet就能用里面的方法
@WebServlet(name = "testServlet",urlPatterns = {"/test"})
public class TestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置响应内容
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<div> doPost 我的web学习ing。。。</div>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置响应内容
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<div> doGet 我的web学习ing。。。</div>");

        ServletContext servletContext = req.getServletContext();
        String url = servletContext.getInitParameter("url");
        System.out.println(url);

        servletContext.setAttribute("appInfo","xxx.com info");
        String appInfo = (String)servletContext.getAttribute("appInfo");
        System.out.println(appInfo);
    }


    @Override
    public void destroy() {
        System.out.println("servlet destory");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("servlet init");
    }
}
