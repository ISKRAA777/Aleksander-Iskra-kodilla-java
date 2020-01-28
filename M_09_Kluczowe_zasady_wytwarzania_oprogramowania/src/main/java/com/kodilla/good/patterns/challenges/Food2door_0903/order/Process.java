package com.kodilla.good.patterns.challenges.Food2door_0903.order;


import com.kodilla.good.patterns.challenges.Food2door_0903.producent.Producent;

// klasa odpowiedzalna za cały proces zamówienia
public class Process {
    // posiada pole prywatne Respository dzieki czemu 'widzi' zamowienie z magazynu
    private Respository respository;

    public Process(Respository respository) {
        this.respository = respository;
    }

    //metoda odpowiedzialna za zamówienia
    public void start(Producent producent) {
        if (producent.process()) {              //jesli proces jest true czyli wszsystko jest ok to działa i tworzy nowe zamowieni
            respository.create(producent.getClass().getSimpleName(), producent.product(), producent.quantity());
            new OrderDTO(producent.product(), producent.quantity(), true);
        } else {        // jesli nie to zmienia zamówienie na false czyli je usuwa
            new OrderDTO(producent.product(), producent.quantity(), false);
        }
    }

}
