package com.kodilla.good.patterns.challenges.Fly_0902;

//Mamy do czynienia z bardzo małą firmą lotniczą, która oferuje prywatne loty. Do tej pory, wszystko było uzgadniane
// przez telefon bezpośrednio z klientem, jednak zarząd firmy stwierdził, że jest to bardzo niewydajne rozwiązanie,
// ponieważ wiele razy muszą powtarzać to samo, a klienci mają problemy z dodzwonieniem się do firmy ze względu na
// ograniczoną ilość konsultantów.
//Uznano, że dobrze byłoby stworzyć system, który posiadałby zapisaną listę wszystkich lotów, np. GDAŃSK -> WROCŁAW.
//System mimo samego przetrzymywania lotów powinien zawierać serwis, który pozwoliłby nam operację związane z
// wyszukiwaniem lotów jak:
//1.	Znalezienie wszystkich lotów z podanego miasta
//2.	Znalezienie wszystkich lotów do danego miasta
//3.	Znalezienie lotów poprzez inne miasto np. lot z Gdańska przez Kraków do Wrocławia
//Firma zna się na technologiach i wymaga użycia iteracji za pomocą Stream oraz spodziewa się
// wykorzystania kontraktu Equals i Hashcode.
//Czy dasz radę rozwiązać problem tej firmy lotniczej?
//Po wykonaniu każdego wyzwania poinformuj swojego mentora o tym, że kod został przesłany do
// repozytorium i podaj mu linka. Pozwoli to na sprawne sprawdzenie Twojego kodu.
public class Main {
    public static void main(String[] args) {

        Search search = new Search();
        search.searchFrom( "Poznan");
        search.searchTo("Gdansk");
        search.searchThrough( "Wroclaw", "Warszawa");


    }
}
