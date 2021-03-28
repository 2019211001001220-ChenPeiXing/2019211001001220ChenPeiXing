package dabing.week3.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

public class LifeCycleServlet extends HttpServlet {

    public LifeCycleServlet(){
        System.out.println("i am in constructor,--> LifeCycleServlet()");
    }

    @Override
    public void init(){
        System.out.println("i am in init() ");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in service() -->doGet()");
    }

    @Override
    public void destroy(){
        System.out.println("i am in destroy() ");
    }
}