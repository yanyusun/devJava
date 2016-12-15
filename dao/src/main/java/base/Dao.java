package base;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by root on 16-7-10.
 */
public class Dao {
    public SqlSession getSqlSession() {
        Reader config = null;
        try {
            config = Resources.getResourceAsReader("config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
        return ssf.openSession();
    }
}
