import Model.Account;
import Model.Reminder;
import Model.TestCountDownLatch;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;
import java.util.concurrent.*;

public class SynchronizedTest {
    static void customer(ProxyInterface pi){
        pi.say();
    }

    @Test
    public void Test() throws ExecutionException, InterruptedException {
        //region //同步代码块

//        Account account = new Account("12345",1000);
//        new DrawThread("甲",account,800).start();
//        new DrawThread("乙",account,800).start();
//
//        Account account1  = new Account("6789",1000); //提供一个线程安全的draw()方法来完成取钱操作  同步方法
//        account1.draw(800);
//        account1.draw(800);
        //上面第二案例并不完全正确，但是意在说明两种案例的不同

        //endregion

        //region 线程安全

        //Collections.synchronizedList()
        //MutablePoint 线程不安全，
        //MonitorVehicleTracker 线程安全
        //ConcurrentHashMap

        //endregion

        //region //闭锁

        //CountDownLatch
//        TestCountDownLatch.testCountDownLatch();
//        //FutureTask
//        FutureTask<Integer> task = new FutureTask(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                return new Integer(1);
//            }
//        });
//        Integer future = task.get();

        //endregion

        //region //线程池

//        Executor executor = Executors.newFixedThreadPool(100);
//        executor.execute(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
//
//        ExecutorService executorService = Executors.newFixedThreadPool(100);
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });

        //endregion

        //region timer 定时器
        //endregion

        //region //同步代码块
//        new Reminder(5);
//
//        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);
//        executor.schedule();
//
//        DelayQueue delayQueue = new DelayQueue();
//
//        CompletionService completionService = new ExecutorCompletionService(executor);
//
//
//
//        ThreadPoolExecutor executor1 = new ThreadPoolExecutor(10,100,0L,TimeUnit.MICROSECONDS,new LinkedBlockingDeque<>());
//        executor1.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
//        executor1.setThreadFactory(new ThreadFactory() {
//            @Override
//            public Thread newThread(Runnable r) {
//                return null;
//            }
//        });

        //endregion
        //region //动态代理
//        TestCountDownLatch.class;
//        Proxy.newProxyInstance()



        RealObject real = new RealObject();
        ProxyInterface proxy = (ProxyInterface)Proxy.newProxyInstance(ProxyInterface.class.getClassLoader(),new Class[]{ProxyInterface.class},new ProxyObject(real));
        customer(proxy);
        //endregion

    }

    public static void main(String[] args){
        new Reminder(5);
    }
}
