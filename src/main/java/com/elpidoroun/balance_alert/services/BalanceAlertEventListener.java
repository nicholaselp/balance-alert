package com.elpidoroun.balance_alert.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class BalanceAlertEventListener {

    private static final Logger logger = LoggerFactory.getLogger(BalanceAlertEventListener.class);

    public static final String LOW_BALANCE_ALERT_TOPIC = "low-balance-alert";

    @KafkaListener(topics = LOW_BALANCE_ALERT_TOPIC, groupId = "balance-alert-group")
    void listener(String message){
        logger.info("\n\n***************************************************\n" +
                message +"\n"+
                "***************************************************\n\n");
    }
}
