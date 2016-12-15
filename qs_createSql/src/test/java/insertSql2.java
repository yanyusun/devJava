import base.Insert;
import insertOperSql.InsertObject;
import insertOperSql.InsertOperObjRe;
import insertOperSql.InsertRoleOper;
import insertOperSql.insertOper;
import org.junit.Test;

/**
 * Created by pan on 16-9-14.
 */
public class insertSql2 {
    /*
    ﻿SET FOREIGN_KEY_CHECKS = 0;
    truncate oper_type
    truncate oper_obj_realtion
    truncate object_type
    truncate t_role_oper_re
    ﻿SET FOREIGN_KEY_CHECKS = 1;
     */
    @Test
    public void testObject(){
        Insert insert = new InsertObject();
        insert.writeSql("/home/pan/权限/所有对象.txt");
    }
    @Test
    public void testOper(){
        Insert insert = new insertOper();
        insert.writeSql("/home/pan/权限/所有权限");
    }

    @Test
    public void testOperObjRe(){
        Insert insert1 = new InsertOperObjRe("1");
        insert1.writeSql("/home/pan/权限/对象涉及操作/资产包.txt");

        Insert insert2 = new InsertOperObjRe("2");
        insert2.writeSql("/home/pan/权限/对象涉及操作/借款人.txt");

        Insert insert3 = new InsertOperObjRe("3");
        insert3.writeSql("/home/pan/权限/对象涉及操作/抵押物.txt");

        Insert insert4 = new InsertOperObjRe("4");
        insert4.writeSql("/home/pan/权限/对象涉及操作/借据.txt");

        Insert insert5 = new InsertOperObjRe("5");
        insert5.writeSql("/home/pan/权限/对象涉及操作/资料实勘.txt");

        Insert insert6 = new InsertOperObjRe("6");
        insert6.writeSql("/home/pan/权限/对象涉及操作/案件.txt");

        Insert insert7 = new InsertOperObjRe("7");
        insert7.writeSql("/home/pan/权限/对象涉及操作/资产源.txt");

        Insert insert8 = new InsertOperObjRe("8");
        insert8.writeSql("/home/pan/权限/对象涉及操作/用户信息.txt");






    }


    @Test
    public void testRoleOper(){
        //用户类型：0-普通用户;11-平台管理员(改为1);2-委托号;31-催收;32-律所;33-中介

        //平台
        Insert insert = new InsertRoleOper("1","1");
        insert.writeSql("/home/pan/权限/人员权限/平台/平台管理员");

        Insert insert2 = new InsertRoleOper("1","2");
        insert2.writeSql("/home/pan/权限/人员权限/平台/平台管理者");

        Insert insert1 = new InsertRoleOper("1","3");
        insert1.writeSql("/home/pan/权限/人员权限/平台/平台参与人");

        Insert insert3 = new InsertRoleOper("1","4");
        insert3.writeSql("/home/pan/权限/人员权限/平台/平台所属人");

        //委托号
        Insert insert4 = new InsertRoleOper("2","1");
        insert4.writeSql("/home/pan/权限/人员权限/委托方/委托管理员");

        Insert insert6 = new InsertRoleOper("2","2");
        insert6.writeSql("/home/pan/权限/人员权限/委托方/委托管理者");

        Insert insert5 = new InsertRoleOper("2","3");
        insert5.writeSql("/home/pan/权限/人员权限/委托方/委托参与人");

        Insert insert7 = new InsertRoleOper("2","4");
        insert7.writeSql("/home/pan/权限/人员权限/委托方/委托所属人");


        //催收
        Insert insert8 = new InsertRoleOper("31","1");
        insert8.writeSql("/home/pan/权限/人员权限/催收/催收管理员.txt");

        Insert insert10 = new InsertRoleOper("31","2");
        insert10.writeSql("/home/pan/权限/人员权限/催收/催收管理者.txt");

        Insert insert9 = new InsertRoleOper("31","3");
        insert9.writeSql("/home/pan/权限/人员权限/催收/催收参与者.txt");

        Insert insert11 = new InsertRoleOper("31","4");
        insert11.writeSql("/home/pan/权限/人员权限/催收/催收所属人.txt");

        //律所
        Insert insert12 = new InsertRoleOper("32","1");
        insert12.writeSql("/home/pan/权限/人员权限/司法/司法管理员.txt");

        Insert insert14 = new InsertRoleOper("32","2");
        insert14.writeSql("/home/pan/权限/人员权限/司法/司法管理者.txt");

        Insert insert13 = new InsertRoleOper("32","3");
        insert13.writeSql("/home/pan/权限/人员权限/司法/司法参与者.txt");

        Insert insert15 = new InsertRoleOper("32","4");
        insert15.writeSql("/home/pan/权限/人员权限/司法/司法所属人.txt");

        //中介
        Insert insert16 = new InsertRoleOper("33","1");
        insert16.writeSql("/home/pan/权限/人员权限/中介/中介管理员.txt");

        Insert insert17 = new InsertRoleOper("33","2");
        insert17.writeSql("/home/pan/权限/人员权限/中介/中介管理者.txt");

        Insert insert18 = new InsertRoleOper("33","3");
        insert18.writeSql("/home/pan/权限/人员权限/中介/中介参与者.txt");

        Insert insert19 = new InsertRoleOper("33","4");
        insert19.writeSql("/home/pan/权限/人员权限/中介/中介所属人.txt");

    }






    @Test
    public void ex(){
//        Insert insert = new insertOper();
//        insert.writeSql("/home/pan/权限/已还款权限.txt");

//        Insert insert6 = new InsertOperObjRe("114");
//        insert6.writeSql("/home/pan/权限/对象涉及操作/案件已还款.txt");

//        //律所
//        Insert insert12 = new InsertRoleOper("32","1");
//        insert12.writeSql("/home/pan/权限/人员权限/司法/已还款管理员.txt");
//
//        Insert insert14 = new InsertRoleOper("32","2");
//        insert14.writeSql("/home/pan/权限/人员权限/司法/已还款管理者.txt");
//
//        Insert insert15 = new InsertRoleOper("32","4");
//        insert15.writeSql("/home/pan/权限/人员权限/司法/已还款所属人.txt");

    }

    @Test
    public void exU(){
//        Insert insert = new insertOper();
//         insert.writeSql("/home/pan/权限/用户协作器分配器权限.txt");
    }












}
