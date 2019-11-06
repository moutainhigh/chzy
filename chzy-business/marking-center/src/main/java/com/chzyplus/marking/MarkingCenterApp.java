package com.chzyplus.marking;

import com.central.common.annotation.EnableLoginArgResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 */
@EnableLoginArgResolver
@EnableDiscoveryClient
@EnableFeignClients
@EnableTransactionManagement
@SpringBootApplication
public class MarkingCenterApp {
    public static void main(String[] args) {
        SpringApplication.run(MarkingCenterApp.class, args);
    }
}
