package util;

import base.Dao;
import operObj.OperObjRe;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.transaction.jdbc.JdbcTransaction;

import java.sql.SQLException;

/**
 * Created by root on 16-7-10.
 */
public class OperObjReDao extends Dao{
    public void insert(OperObjRe model){
        SqlSession openSession=getSqlSession();
        JdbcTransaction t = new JdbcTransaction(openSession.getConnection());
        openSession.insert("add",model);
        try {
            t.commit();
            t.close();
            openSession.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
