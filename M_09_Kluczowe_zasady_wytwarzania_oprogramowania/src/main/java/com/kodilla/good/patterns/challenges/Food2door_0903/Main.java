package com.kodilla.good.patterns.challenges.Food2door_0903;

import com.kodilla.good.patterns.challenges.Food2door_0903.order.Load;
import com.kodilla.good.patterns.challenges.Food2door_0903.order.Process;
import com.kodilla.good.patterns.challenges.Food2door_0903.order.Respository;
import com.kodilla.good.patterns.challenges.Food2door_0903.producent.Producent;

//Firma “Food2Door” zajmuje się dystrybucją lokalnych i świeżych produktów z okolicznych wiosek.
// Produkty można zamawiać przez internet, a następnie kurier dostarcza je do naszego domu.
// W związku z jej dynamicznym rozwojem i pojawiającymi się nowymi producentami produktów,
// system musi zostać rozszerzony o podsystem podłączenia producentów. Proces zamawiania produktów od różnych producentów
// zawsze jest taki sam, jednakże nie istnieje żadna uwspólniona logika dla tego przypadku.
//Załóżmy, że osoba o imieniu Adam odpowiadająca za opracowywanie biznesowej strony aplikacji przedstawia nam zagadnienie
// do rozwiązania w następujący sposób:
//“Hej, słuchaj mamy taki problem - mamy już trzech producentów jedzenia: ExtraFoodShop, HealthyShop, GlutenFreeShop.
// Na horyzoncie pojawiają się nowe firmy, które chcą dołączyć do naszego łańcucha dostaw, niestety kodowanie procesu
// zamawiania dla każdego z dystrybutorów jest bardzo żmudne i do tego kod się wciąż powtarza. Wszyscy z tych producentów
// różnią się nieco implementacją, jednakże schemat zamawiania przebiega następująco:
//1.	Pobieramy informacje o dostawcy, oraz ilości i rodzaju produktu,
//2.	Następnie każdy z producentów posiada metodę process(), która pozwala na zrealizowanie tego zamówienia w
// danym sklepie
//3.	Dalsza część również wygląda wszędzie tak samo, zwracane są informacje czy udało się zrealizować zamówienie
//To zadanie jest naprawdę 'otwarte' na Twoją inwencję twórczą - spróbuj napisać rozwiązanie, które pozwoli na
// sprawne 'dołączanie' do istniejącego systemu wielu nowych producentów. zakladamy, że całość systemu poza tym, co
// zostało zawarte w powyższych punktach jest nieistotna - napisz kod odzwierciedlający tylko te wytyczne,
// wymyślając jednocześnie drobne różnice w implementacji metody process() dla każdego producenta :)
public class Main {
    public static void main(String[] args) {


        Load order = new Load();
        Producent producent = order.load("Mars", 20,"HealthyShop" );
        Process process = new Process(new Respository());
        process.start(producent);
    }
}
