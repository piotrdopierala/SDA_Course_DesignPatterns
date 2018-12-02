package pl.dopierala.Observer.EmergencyDispatch.Subject;

import pl.dopierala.Observer.EmergencyDispatch.AssetsObservers.IAmbulance;
import pl.dopierala.Observer.EmergencyDispatch.AssetsObservers.IEmergencyAssetListener;

public interface Operator {

    void registerObserver(IAmbulance ambulance);

    void removeObserver(IAmbulance ambulacne);

    void notifyObservers();
}
