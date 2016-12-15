package insertOperSql;

import base.Insert;

/**
 * Created by yan on 16-7-8.
 */
public class insertOper extends Insert {

    @Override
    public String getSql(String str) {
        String sql="";
        String[] s = str.split(",");
        if(!s[0].equals("")){
            sql = "INSERT INTO oper_type (oper_type,oper_name)VALUES("+s[0]+",'" + s[1] + "');";
        }
        return sql;
    }
}
