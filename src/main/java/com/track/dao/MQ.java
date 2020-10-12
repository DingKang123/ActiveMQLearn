package com.track.dao;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MQ implements MessageListener {
    @Override
    public void onMessage(Message message) {
        try {
            if (message instanceof TextMessage) {
                TextMessage msg = (TextMessage) message;
                System.out.println("== 收到一个JMS消息..." + msg.getText());
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
