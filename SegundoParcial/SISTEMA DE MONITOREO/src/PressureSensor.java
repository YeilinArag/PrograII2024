class PressureSensor extends Sensor {
    public PressureSensor() {
        this.type = "Presure";
        this.threshold = 1000.0;
    }
    @Override
    public void setValue(double value) {
        this.value = value;
        if(value > threshold || value < 0.1 * threshold){
            notifyObservers();
        }
    }

    public void attach(Observer security) {
    }
}