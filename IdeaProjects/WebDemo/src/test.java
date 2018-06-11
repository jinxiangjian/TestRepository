
import com.alibaba.fastjson.JSON;
import groovy.lang.GroovyClassLoader;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.jupiter.api.Test;
import sun.net.www.http.HttpClient;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

/**
 * Created by xjjin on 2017/4/12.
 */
public class test {
    public static void main(String[] args)  throws Exception{
        List<TestPoJo> src = new ArrayList<TestPoJo>();
        TestPoJo poJo1 = new TestPoJo(1,"1");
        TestPoJo poJo2 = new TestPoJo(2,"2");
        TestPoJo poJo3 = new TestPoJo(3,"3");
        src.add(poJo1);
        src.add(poJo2);
        src.add(poJo3);

//        List<TestPoJo> des =  new ArrayList<TestPoJo>(Arrays.asList(new TestPoJo[src.size()]));
//        Collections.copy(des,src);
//
//        for(TestPoJo s : src){
//            s.setA(5);
//            System.out.print(s.getA());
//        }
//        System.out.print("\n");
//        for(TestPoJo s : des){
//            System.out.print(s.getA());
//        }

//        TestPoJo poJo1 = new TestPoJo(1,"1");
//        TestPoJo poJo2 = new TestPoJo(2,"2");

//        String s = "Hello world!";
//        int i = 897648764;
//
//        ByteArrayOutputStream os = new ByteArrayOutputStream();
//        ObjectOutputStream out = new ObjectOutputStream(os);
//        out.writeObject(s);
//        out.writeObject(i);
//
//        ByteArrayInputStream is = new ByteArrayInputStream(os.toByteArray());
//        ObjectInputStream in = new ObjectInputStream(is);;
//        System.out.println(in.readObject());
//        System.out.println(in.readObject());
//        String value = "{\"flagShipGroups\": [{\"mgrGroupId\": 12,\"homePageJumpUrl\": \"/rn_hotelflagship/main.js?CRNType=1&CRNModuleName=flagship&groupid={0}&cityid={1}&inday={2}&outday={3}&location={4}&hoteltype={5}&cityname={6}\",\"groupName\": \"凯悦旗舰店\"}]}";
//        com.ctrip.hotelwireless.business.model.flagShip.FlagshipGroups  t = g(value,com.ctrip.hotelwireless.business.model.flagShip.FlagshipGroups.class);
//        System.out.println(t.getFlagShipGroups().get(0));
//
//        HttpClient httpClient = new DefaultHttpClient();
//
//        GroovyClassLoader loader = new GroovyClassLoader();


//        src.sort(Comparator.comparingInt(o ->  Optional.of(TestPoJo :: getA).orElse(new ArrayList<>().size())));

        TestPoJo poJo4 = new TestPoJo(4,"4");
        System.out.println(poJo4.getTesEnum() == TesEnum.None);
        System.out.println(TesEnum.None.equals(poJo4.getTesEnum()));
        System.out.println(poJo4.getTesEnum().equals(TesEnum.None));

    }

    private static  <T> T g(String value,Class<T> classZZ){
        T t = (T) JSON.parseObject(value, classZZ);
        System.out.println(t);
        return t;
    }
}
