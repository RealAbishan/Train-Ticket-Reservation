package com.example.trainticketreservation.Utills;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ENVConfig {

    @Value("${env.db.mongo.url}")
    private String dbUrl;
    @Value("${env.db.mongo.dbName}")
    private String dbName;

    public String getDbUrl() {
        return dbUrl;
    }

    public String getDbName() {
        return dbName;
    }
}
