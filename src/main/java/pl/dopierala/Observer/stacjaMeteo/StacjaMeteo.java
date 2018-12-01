package pl.dopierala.Observer.stacjaMeteo;


import pl.dopierala.Observer.stacjaMeteo.observer.Prognoza;
import pl.dopierala.Observer.stacjaMeteo.observer.StatystykaPogodowa;
import pl.dopierala.Observer.stacjaMeteo.observer.WarunkiBiezaceWyswietl;
import pl.dopierala.Observer.stacjaMeteo.subject.DanePogodowe;

public class StacjaMeteo {
    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();

        WarunkiBiezaceWyswietl warunkiBiezaceWyswietl = new WarunkiBiezaceWyswietl(danePogodowe);
        StatystykaPogodowa statystykaPogodowa = new StatystykaPogodowa(danePogodowe);
        Prognoza prognos = new Prognoza(danePogodowe);

        //ZADANIE!
        //DODAJ DWA KOLEJNE SPOSOBY WYSWIETLANIA
        //PROGNOZA
        //STATYSTYKA


        danePogodowe.ustawOdczyty(26.6f, 35f, 1013.1f);
        danePogodowe.ustawOdczyty(28.1f, 85f, 998.5f);
        danePogodowe.ustawOdczyty(25.9f, 12f, 996.0f);
    }
}
