package util;

import base.Dao;
import operType.OperType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.transaction.jdbc.JdbcTransaction;

import java.sql.SQLException;

/**
 * Created by root on 16-7-10.
 */
public class OperTypeDao extends Dao{
    public OperType selectByType(int type){
        SqlSession openSession=getSqlSession();
        JdbcTransaction t = new JdbcTransaction(openSession.getConnection());
        OperType operType=openSession.selectOne("selectByType",type);
        try {
            t.commit();
            t.close();
            openSession.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            return operType;
        }
    }
    public OperType selectByTypes(String type){
        SqlSession openSession=getSqlSession();
        JdbcTransaction t = new JdbcTransaction(openSession.getConnection());
        OperType operType=openSession.selectOne("selectByTypes",type);
        try {
            t.commit();
            t.close();
            openSession.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            return operType;
        }
    }
}
