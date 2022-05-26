package Application;


import java.util.ArrayList;

public class AverageSensor implements Sensor{

    private boolean isOn;
    private ArrayList<Sensor> avgSensor;

    public AverageSensor(){
        this.avgSensor = new ArrayList<>();

    }
    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        if(isOn){

        }
    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return 0;
    }

    public void addSensor(Sensor toAdd){
        avgSensor.add(toAdd);
    }
}
