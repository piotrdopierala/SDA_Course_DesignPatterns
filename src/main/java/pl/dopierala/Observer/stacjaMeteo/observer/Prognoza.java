package pl.dopierala.Observer.stacjaMeteo.observer;

import pl.dopierala.Observer.stacjaMeteo.subject.Podmiot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Prognoza implements Obserwator, WyswietlElement {

    private List<Float> temperatury = new ArrayList<>();
    private List<Float> wilgotnosci = new ArrayList<>();
    private List<Float> cisnienia = new ArrayList<>();
    private Podmiot danePogodowe;

    public Prognoza(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatury.add(temperatura);
        this.wilgotnosci.add(wilgotnosc);
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("Prognoza dla temperatury: 30"+"Prognoza dla cisnienia: 20");
    }
}
