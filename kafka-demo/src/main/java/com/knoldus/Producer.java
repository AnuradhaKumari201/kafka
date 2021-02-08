package com.knoldus;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;
import java.util.Random;

public class Producer {
    public static void main(String[] args){
        // For example 192.168.1.1:9092,192.168.1.2:9092
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "com.knoldus.UserSerializer");
        
        KafkaProducer kafkaProducer = new KafkaProducer(properties);
        try{
            for(int i = 1; i < 5; i++){
                Random rd = new Random();
                User user = new User("123"+i, rd.nextInt(100), "User"+i, "Kafka");
                System.out.println(user);

                kafkaProducer.send(new ProducerRecord("user", user));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            kafkaProducer.close();
        }
    }
}