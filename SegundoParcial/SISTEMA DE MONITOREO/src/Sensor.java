abstract class Sensor {
    private List<Observer> observers = new ArrayList<>();
    protected String type;
    protected double value;
    protected double threshold;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(type, value);
        }
    }

    public abstract void setValue(double value);
}
