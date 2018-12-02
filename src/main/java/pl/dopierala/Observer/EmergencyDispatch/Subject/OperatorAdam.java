package pl.dopierala.Observer.EmergencyDispatch.Subject;

import pl.dopierala.Observer.EmergencyDispatch.AssetsObservers.IAmbulance;

import java.util.ArrayList;
import java.util.List;

public class OperatorAdam implements Operator {

    private List<IAmbulance> assets = new ArrayList<>();
    private String status;

    @Override
    public void registerObserver(IAmbulance ambulance) {
        assets.add(ambulance);
    }

    @Override
    public void removeObserver(IAmbulance ambulacne) {
        assets.remove(ambulacne);
    }

    @Override
    public void notifyObservers() {
        assets.stream().filter(IAmbulance::getIsFree).findFirst().ifPresent(this::sendAmbulanse);
    }

    private void sendAmbulanse(IAmbulance amb){
        amb.update(status);
        int incCount = amb.getIncidentCount();
        if(incCount>2)
            System.out.println("Operator wysyla ambulans "+amb.getClass().getSimpleName()+" do domu. Wyjechal "+incCount+" razy.");
    }



    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status =status;
        notifyObservers();
    }


}
