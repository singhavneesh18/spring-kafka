package com.kafka.example.dto;

public class KafkaRequestDto {

    private String topicName;
    private String message;

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "KafkaRequestDto{" +
                "topicName='" + topicName + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
