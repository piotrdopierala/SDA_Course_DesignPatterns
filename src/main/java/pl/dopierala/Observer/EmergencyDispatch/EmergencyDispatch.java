package pl.dopierala.Observer.EmergencyDispatch;

import pl.dopierala.Observer.EmergencyDispatch.AssetsObservers.FirstAmbulance;
import pl.dopierala.Observer.EmergencyDispatch.AssetsObservers.SecondAmbulance;
import pl.dopierala.Observer.EmergencyDispatch.AssetsObservers.ThirdAmbulance;
import pl.dopierala.Observer.EmergencyDispatch.Subject.OperatorAdam;

public class EmergencyDispatch {
    public static void main(String[] args) {
        OperatorAdam operatorAdam = new OperatorAdam();

        FirstAmbulance firstAmbulance = new FirstAmbulance(operatorAdam);
        SecondAmbulance secondAmbulance = new SecondAmbulance(operatorAdam);
        ThirdAmbulance thirdAmbulance = new ThirdAmbulance(operatorAdam);

        operatorAdam.setStatus("Car accident");
        operatorAdam.setStatus("Faint");
        operatorAdam.setStatus("Broken bone");

    }
}
