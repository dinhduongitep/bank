package com.vpbank.banksystemserver;

import com.vpbank.banksystemserver.controller.VnPayController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.UnsupportedEncodingException;

@SpringBootApplication
public class BankSystemServerApplication {

    public static void main(String[] args) {
//        SpringApplication.run(BankSystemServerApplication.class, args);
        //Test VNPay
        VnPayController vnpayController = new VnPayController();
        try {
            String paymentUrl = vnpayController.createPaymentUrl("1", 10000000);
            vnpayController.openURL(paymentUrl);
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }

    }

}
