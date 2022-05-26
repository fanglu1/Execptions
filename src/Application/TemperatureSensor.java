package Application;

import java.util.Random;


public class TemperatureSensor implements Sensor{
    private boolean isOn;
    private int read;

    public TemperatureSensor(int i){
        this.read = i;
    }
    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        if (isOn()) {
            return new Random().nextInt(61) - 30;
        }
            throw new IllegalStateException();
        }
    }
