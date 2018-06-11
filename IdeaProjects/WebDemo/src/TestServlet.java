import javax.servlet.*;
import java.io.IOException;


public class TestServlet implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Hello World");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
