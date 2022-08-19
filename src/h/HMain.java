package h;

import java.util.ArrayList;
import java.util.HashMap;

public class HMain {

    public static void main(String[] args) {

        Test test = new Test();
/*
        test.a = "10";
        test.b = true;
        boolean c = true;
        // weapper클래스 : 원시타입을 객체인 것처럼 포장한다

        System.out.println(test.a);
        System.out.println(test.b);
        System.out.println(test.a.getClass().getName());
        System.out.println(test.b.getClass().getName());

        Test<String, Integer> test1 = new Test();
        test1.a = "a";
        test1.b = 100;

        Test<String, String> test2 = new Test();
        test2.a = "a";
        test2.b = "b";
       */

        ArrayList list = new ArrayList();
        HashMap<String, Integer> map = new HashMap<>();
        // 맵에
        map.put("키", 100);
        map.put("키", 50);
        System.out.println(map);

        // 맵의 갯수를 반환
        System.out.println(map.size());
        // 맵에 있는 키만 반환해준다.
        System.out.println(map.keySet());
        //key에 해당하는 value를 반환한다.
        System.out.println(map.get("키"));
        // 맵에 해당 key가 있는지 없는지 boolean으로 반환한다.
        System.out.println(map.containsKey("키"));

        // key값을 제거한다.
        map.remove("키");
        System.out.println(map);
        map.clear();
        System.out.println(map);

        System.out.println(map.keySet());



    }
}