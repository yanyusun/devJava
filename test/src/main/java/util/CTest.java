package util;

import util.bean.A;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pan on 16-8-30.
 */
public class CTest {
    public static void main(String[] args) {
        List<A> al = new ArrayList<A>();
        A a = new A();
        a.s="1";
        A a2 = new A();
        a2.s="2";
        A a3 = new A();
        a3.s="3";

        al.add(a);
        al.add(a2);
        al.add(a3);
        al.remove(a);
        al.remove(a3);
        for(A as:al){
            System.out.println(as.s);
        }

    }
}
