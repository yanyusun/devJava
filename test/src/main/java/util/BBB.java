package util;

import util.bean.A;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pan on 16-9-22.
 */
public class BBB {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);

        A a =new A();
        a.setList(list);
        a.getList();
        System.out.println(a.getList());
    }
}
