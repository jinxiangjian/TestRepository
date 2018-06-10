import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyObject  implements InvocationHandler {
    private Object proxied = null;
    public ProxyObject(){}

    public ProxyObject(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("hello");

        return method.invoke(proxied,args);
    }
}
