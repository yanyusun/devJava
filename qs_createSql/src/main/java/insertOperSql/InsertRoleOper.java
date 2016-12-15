package insertOperSql;

import base.Insert;
import util.OperTypeDao;

/**
 * Created by yan on 16-7-8.
 */
public class InsertRoleOper extends Insert{
    public String user_type;
    public String user_role;
    public OperTypeDao dao=new OperTypeDao();
    @Override
    public String getSql(String str) {
        String sql="";
        String[] s = str.split(",");
        if(!s[0].equals("")){
            s[0]=s[0].replaceAll("[^0-9\\.]","");
            int operId=dao.selectByTypes(s[0]).getId();
            sql = "INSERT INTO t_role_oper_re (user_type,role_type,oper_id)VALUES("+user_type+","+user_role +",'" +operId + "');";
        }
        return sql;
    }

    public InsertRoleOper(String user_type, String user_role) {
        this.user_type = user_type;
        this.user_role = user_role;
    }
}
