package pl.dopierala.Observer.stacjaMeteo.observer;

public interface Obserwator {
    void aktualizacja(float temperatura, float wilgotnosc, float cisnienie);
}
