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
@WebServlet(name = "submitServlet",urlPatterns = {"/submit"})
public class SubmitServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置响应内容
        resp.setContentType("text/html;charset=utf-8");

        req.setCharacterEncoding("utf-8");
        String userName = req.getParameter("userName");
        String pwd = req.getParameter("pwd");
        System.out.println(userName +"-"+pwd);

        if(userName.equals("xdclass") && pwd.equals("123")){
            resp.getWriter().write("登录成功");
        }else{
            resp.getWriter().write("账号密码错误");
        }
    }


}
