package rabbitmq.tmptalk;

import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * Created by pan on 16-11-28.
 */
public class TC {
    private static String exChaneName = "testCustomer_d";
    private static String online_Message_exChangeName = "messageExchange";
    public static void main(String[] args) throws Exception {
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
        String queueName = channel.queueDeclare().getQueue();
        channel.queueBind(queueName, online_Message_exChangeName, userId);


        System.out.println("C [*] Waiting for messages. To exit press CTRL+C");
//      DefaultConsumer类实现了Consumer接口，通过传入一个频道，告诉服务器我们需要那个频道的消息，如果频道中有消息，就会执行回调函数handleDelivery
        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println("C [x] Received '" + message + "'");
            }
        };
//      自动回复队列应答 -- RabbitMQ中的消息确认机制，后面章节会详细讲解
        channel.basicConsume(queueName, true, consumer);



    }



}
