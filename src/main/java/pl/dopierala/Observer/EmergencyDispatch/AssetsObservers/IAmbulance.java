package pl.dopierala.Observer.EmergencyDispatch.AssetsObservers;

public interface IAmbulance extends IEmergencyAssetListener {
    int getIncidentCount();
    boolean getIsFree();
}
