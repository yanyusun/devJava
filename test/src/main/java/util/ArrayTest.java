package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by pan on 16-11-3.
 */
public class ArrayTest {
    public static void main(String[] args) {
        List<Integer> b1 = new ArrayList();
        b1.add(1);
        b1.add(2);
        List<Integer> b2 = new ArrayList();
        b2.add(3);
        b2.add(4);
        List<Integer> c = new ArrayList();
        //Collections.copy(c,b1);
        c.addAll(b1);
        c.addAll(b2);
        c.set(0,0);
        for(Integer i:c){
            System.out.println(i);
        }
        for(Integer i:b1){
            System.out.println("b1-->"+i);
        }
        Iterator<Integer> it=c.iterator();
        while (it.hasNext()){
            if(it.next()==0){
                it.remove();
            }
        }
        for(Integer i:c){
            System.out.println("c-->"+i);
        }
        for(Integer i:b2){
            System.out.println("b2-->"+i);
        }
    }
}
