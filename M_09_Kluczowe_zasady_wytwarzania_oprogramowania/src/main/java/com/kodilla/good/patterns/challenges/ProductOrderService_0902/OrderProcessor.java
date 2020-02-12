package com.kodilla.good.patterns.challenges.ProductOrderService_0902;

import com.kodilla.good.patterns.challenges.ProductOrderService_0902.infoService.InformationService;
import com.kodilla.good.patterns.challenges.ProductOrderService_0902.request.OrderRequest;
import com.kodilla.good.patterns.challenges.ProductOrderService_0902.service.OrderService;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }

    public void process(OrderRequest orderRequest) {

        if (orderService.order(orderRequest.getUser(), orderRequest.product)) {
            informationService.createOrder(orderRequest.getUser());

            informationService.acceptedOrder();
            orderRequest.user.addStaff(orderRequest.product);
            orderRequest.user.setMoney(orderRequest.user.getMoney() - orderRequest.product.getPrice());
            new OrderDto(orderRequest.getUser(), true);
        } else {
            System.out.println("Nie udało się zrealizować zamówienia");
            new OrderDto(orderRequest.getUser(), false);
        }
    }


}
