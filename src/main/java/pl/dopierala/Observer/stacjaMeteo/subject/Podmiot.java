package pl.dopierala.Observer.stacjaMeteo.subject;

import pl.dopierala.Observer.stacjaMeteo.observer.Obserwator;

public interface Podmiot {
    void zarejestrujObserwatora(Obserwator obserwator);
    void usunObserwatora(Obserwator obserwator);
    void powiadomObserwatorow();
}
