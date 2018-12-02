package pl.dopierala.Observer.EmergencyDispatch.AssetsObservers;

import pl.dopierala.Observer.EmergencyDispatch.Subject.Operator;

public class ThirdAmbulance implements IAmbulance {

    private int incidentCnt;
    private String status;
    private Operator operator;
    private boolean isFree = true;

    public ThirdAmbulance(Operator operator) {
        incidentCnt = 0;
        this.operator = operator;
        operator.registerObserver(this);
    }

    @Override
    public void update(String status) {
        this.status = status;
        driveToIncident();
    }

    public void driveToIncident() {
        System.out.println("Ambulance 3 driving to incident:" + status);
        incidentCnt++;
        isFree = false;

        Runnable incidentRun = new Runnable() {
            @Override
            public void run() {
                if (!isFree) {
                    try {
                        Thread.sleep(5000);
                        isFree=true;
                        System.out.println(ThirdAmbulance.class.getSimpleName()+" is free.");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread incidentThread = new Thread(incidentRun);
        incidentThread.start();
    }

    @Override
    public int getIncidentCount() {
        return incidentCnt;
    }

    @Override
    public boolean getIsFree() {
        return isFree;
    }

}
