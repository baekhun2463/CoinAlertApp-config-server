package org.coinalert.coinalertappconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CoinAlertAppConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoinAlertAppConfigServerApplication.class, args);
    }

}
