package com.kodilla.good.patterns.challenges.ProductOrderService_0902.infoService;


import com.kodilla.good.patterns.challenges.ProductOrderService_0902.User;
public class MailService implements InformationService {
    public void createOrder(User user) {
        System.out.println(user.getName() + " twoje zamówienie się powiodło!!");
    }
    public void acceptedOrder() {
        System.out.println("Nowe zamówienie jest zakceptowane i dodawne do systemu. Czekaj na kuriera z paczką;)");
    }

}
