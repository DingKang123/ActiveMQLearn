package com.track.dao;

import org.springframework.stereotype.Repository;
import com.broadsense.iov.jms.JMSListener;

public class Lister {
    public Lister(){
        try {
            JMSListener.startJmsTopicListener("topic/send",new MQ());// QM() 订阅 主题  topic/send
        } catch (Exception e) {
        }
    }
}
