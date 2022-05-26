package Application;

public class StandardSensor implements Sensor {
    private boolean isOn;
    private int read;

    public StandardSensor(int i){
        this.isOn = isOn;
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
        return this.read;
    }
}
