package rabbitmq.tmptalk;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * Created by pan on 16-11-28.
 */
//MessageController
public class TP {
    private static String exChaneName = "testCustomer_d";
    private static String online_Message_exChangeName = "messageExchange";
    public static void main(String[] args) throws Exception{
        String userId="1234";
        // 创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
//      设置RabbitMQ地址
        factory.setHost("114.215.239.181");
        factory.setPort(5672);
        factory.setUsername("qsrabbit");
        factory.setPassword("q_s4Rabbit@2016");
        Connection connection=factory.newConnection();
        Channel channel=connection.createChannel();
        channel.exchangeDeclare(online_Message_exChangeName,"direct");
        String message = "你号trt!";
        channel.basicPublish(online_Message_exChangeName, userId, null, message.getBytes());
        System.out.println(" [x] Sent '" + userId + "':'" + message + "'");
        channel.close();
        connection.close();
    }
}
