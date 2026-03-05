public class Lamp {
    private int watt;
    private boolean isOn = false;


    public Lamp (int watt, boolean isOn){
        this.watt = watt;
        this.isOn = isOn;
    }

    void turnOn(){

    }

    void turnOff(){

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getWatt() {
        return watt;
    }
}
