package com.yanger.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 */
//继承httpServlet就能用里面的方法
@WebServlet(name = "responseServlet", urlPatterns = {"/response"})
public class ResponseServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        //设置编码
        resp.setCharacterEncoding("utf-8");

        //设置请求头
//        resp.addHeader("name","java");
//        resp.addHeader("xxxx","spring");

        //设置状态码
//        resp.setStatus(200);

        //设置响应头为utf-8，不然浏览器会现实乱码
        resp.setHeader("Content-Type","text/html;charset=utf-8");

        String data = "我的请求头运用";

        /*
            以下表示两种写法
         */
//        OutputStream outputStream = resp.getOutputStream();
//        byte[] bytes = data.getBytes("UTF-8");
        //通过流传输，将其写到页面上
//        outputStream.write(bytes);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write(data);

    }


}
