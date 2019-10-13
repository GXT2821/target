package com.gt.demo.mvcframework.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author gt
 */
public class DispathServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        //1.加载配置文件
        doLoadConfig();

        //2.解析配置文件，扫描所有相关的类
        doScanner();

        //3.初始化所有相关文件的类，并保存到IOC容器中
        doInstance();

        //4.完成自动化的依赖注入
        doAutoWried();

        //5.创建HandlerMapping与url和method的对应关系
        initHandlerMapping();

    }

    private void initHandlerMapping() {
    }

    private void doAutoWried() {
    }

    private void doInstance() {
    }

    private void doScanner() {
    }

    private void doLoadConfig() {
    }
}
