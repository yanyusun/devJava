package base;

import java.io.*;


/**
 * Created by yan on 16-7-7.
 */
public class Insert {

    public String getSql(String str) {
        String sql="";
        String[] s = str.split(",");
        if(!s[0].equals("")){
            sql = "INSERT INTO oper_obj_realtion (obj_id,oper_id)VALUES(13," + s[0] + ");";
        }
        return sql;
    }

    //private static String filePath="/root/objectType/借据.txt";
    public void writeFile(String filePath) {

        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader br = new BufferedReader(reader);
            StringBuffer sb = new StringBuffer("");
            String str = null;

            while ((str = br.readLine()) != null) {
                sb.append(getSql(str) + "\n");
            }

            br.close();
            reader.close();

            // write string to file
            FileWriter writer = new FileWriter("/root/insertSql.txt");
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(sb.toString());

            bw.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeSql(String filePath) {

        try {
            //
            FileReader reader = new FileReader(filePath);
            BufferedReader br = new BufferedReader(reader);
            String str = null;

            while ((str = br.readLine()) != null) {
                System.out.println(getSql(str));
            }

            br.close();
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
