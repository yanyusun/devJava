package util;

/**
 * Created by yan on 16-7-16.
 */
public class StringUtil {
    public static void main(String[] args) throws Exception{
       /* String s="certificate";
        String key="COM:com.dqys.auth.orm.dao.facade.TUserInfoMapper:f9d7f3a8c42db62f0329546b4ff24a4f";
        System.out.println(key.getBytes("utf-8").toString());
        String ss="12";

        System.out.println(Integer.decode(ss));*/
        getUP("objectUserRelation");
    }
    public static  String getUP(String s){
        System.out.println(s.toUpperCase());
        return  s;
    }
}
