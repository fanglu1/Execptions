package Application;


import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{

    private boolean isOn;
    private ArrayList<Sensor> avgSensor;
    private ArrayList<Integer> readings;

    public AverageSensor(){
        avgSensor = new ArrayList<>();
        readings = new ArrayList<>();
    }
    @Override
    public boolean isOn() {
        boolean isOn = true;
        for(Sensor sensor : avgSensor){
            if(!sensor.isOn()) {
                isOn = false;
            }
        }
        return isOn;
    }

    @Override
    public void setOn() {
        avgSensor.stream()
                .forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        avgSensor.stream()
                .forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        if(!isOn){
            throw new IllegalStateException();
        }
        double avgTemp = avgSensor.stream()
                .mapToInt(Sensor::read)
                .average().getAsDouble();
        readings.add((int) avgTemp);
        return (int) avgTemp;
    }

    public void addSensor(Sensor toAdd){
        avgSensor.add(toAdd);
    }
    public List<Integer> readings(){
        return readings;
    }
}
