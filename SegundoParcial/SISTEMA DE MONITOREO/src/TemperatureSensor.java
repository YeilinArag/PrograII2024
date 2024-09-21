 class TemperatureSensor extends Sensor {
    public TemperatureSensor() {
        this.type = "Temperature";
        this.threshold=100.0;
    }
    @Override
     public void setValue(double value) {
        this.value=value;
        if (value > threshold){
            notifyObservers();
        }
    }
}

