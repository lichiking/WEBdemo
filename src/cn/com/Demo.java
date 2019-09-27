package cn.com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo")
public class Demo extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       ss();
       pp();
        req.getRequestDispatcher("/WEB-INF/hello.jsp").forward(req, resp);

    }

    public void ss(){
        System.out.println("ssssss");
    }

    public void pp(){
        System.out.println("pppppp");
    }
}
