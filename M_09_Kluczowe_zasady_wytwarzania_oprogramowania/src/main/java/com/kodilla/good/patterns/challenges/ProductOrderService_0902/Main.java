package com.kodilla.good.patterns.challenges.ProductOrderService_0902;

import com.kodilla.good.patterns.challenges.ProductOrderService_0902.infoService.MailService;
import com.kodilla.good.patterns.challenges.ProductOrderService_0902.request.OrderRequestImpl;
import com.kodilla.good.patterns.challenges.ProductOrderService_0902.service.OrderServiceImpl;

public class Main {
    public static void main(String[] args) {


        OrderRequestImpl orderRequestRetriever = new OrderRequestImpl();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(),
                new OrderServiceImpl());

        orderProcessor.process(orderRequestRetriever
                .retrieve(new User("Adam", "Małysz", "Wisła, 00-000 Królewska 12", 100),
                        new Product("narty", 50)));

    }

}
