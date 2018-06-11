public class JVMOOMTest {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws InterruptedException{
        byte[] alloction1,alloction2,alloction3,alloction4;

//        System.out.println("hi");
//
//        alloction1 = new byte[2 * _1MB];
//        alloction2 = new byte[2 * _1MB];
//        alloction3 = new byte[2 * _1MB];
//        alloction4 = new byte[4 * _1MB];
//
//        List<OOMObject> list = new ArrayList<>();
//        for(int i = 0; i< 1000;i++){
//            Thread.sleep(50);
//            list.add(new OOMObject());
//        }
//
//        new Thread().start();
//        new Thread().start();
//        new Thread().start();
//        new Thread().start();
//        new Thread().start();
//        new Thread().start(); new Thread().start();
//        new Thread().start();

        System.out.println(ClassLoader.getSystemClassLoader());

        System.out.println(JVMOOMTest.class.getClassLoader().getParent().getParent());
        System.out.println(OOMObject.class.getClassLoader());



    }
}