// // ZAD 9391_Set_Zduplikowane_zamowienia;od napisany przez dewelopera
// //z innej firmy przechowuje zduplikowane wartości dotyczące zamówień
// w sklepie internetowym. Przez to wysyłane są czasem 2 produkty zamiast 1.

// Z tego co wiadomo developer użył ArrayList do przechowywania numerów
//zamówienia, czy jest to dobry pomysł?

// Twoim zadaniem jest wykonanie własnej implementacji przechowywania//
//numerów zamówień. Pamiętaj, aby sprawdzić, czy Twoje rozwiązanie pozwala
// na przechowywanie zduplikowanych wartości

package ZAD_0402_Set_Zduplikowane_zamowienia;

import java.util.HashSet;
import java.util.Set;

public class Zduplikowane_zamowienie_9391 {
    public static void main(String[] args) {
        Set<String> order = new HashSet<>();
        order.add("Order7");
        order.add("Order1");
        order.add("Order3");
        order.add("Order7");
        for (String s : order) {
            System.out.println(s);
        }
    }
}
