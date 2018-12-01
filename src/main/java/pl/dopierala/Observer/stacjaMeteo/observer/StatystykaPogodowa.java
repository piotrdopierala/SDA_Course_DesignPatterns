package pl.dopierala.Observer.stacjaMeteo.observer;

import pl.dopierala.Observer.stacjaMeteo.subject.Podmiot;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StatystykaPogodowa implements WyswietlElement, Obserwator {
    private List<Float> temperatury = new ArrayList<>();
    private List<Float> wilgotnosci = new ArrayList<>();
    private List<Float> cisnienia = new ArrayList<>();
    private Podmiot danePogodowe;

    public StatystykaPogodowa(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        this.danePogodowe.zarejestrujObserwatora(this);//rejestrujemy siebie!
    }

    @Override
    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatury.add(temperatura);
        this.wilgotnosci.add(wilgotnosc);
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("Srednia temperatura:");
        System.out.println(temperatury.stream().collect(Collectors.averagingDouble(p -> p)));
        System.out.println("Srednie cisnienie:");
        System.out.println(wilgotnosci.stream().collect(Collectors.averagingDouble(p -> p)));
    }
}
