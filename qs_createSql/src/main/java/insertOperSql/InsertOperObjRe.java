package insertOperSql;

import base.Insert;
import util.OperObjReDao;
import util.OperTypeDao;

import static javafx.scene.input.KeyCode.O;


/**
 * Created by yan on 16-7-8.
 */
public class InsertOperObjRe extends Insert{
    public String objectId="";
    public OperTypeDao dao=new OperTypeDao();
    @Override
    public String getSql(String str) {

        String sql="";
        String[] s = str.split(",");
        if(!s[0].equals("")){
            s[0]=s[0].replaceAll("[^0-9\\.]","");
            int operId=dao.selectByTypes(s[0].trim()).getId();
            sql = "INSERT INTO oper_obj_realtion (obj_id,oper_id)VALUES("+objectId+",'" + operId + "');";
        }
        return sql;
    }

    public InsertOperObjRe(String objectId) {
        this.objectId = objectId;
    }
}
