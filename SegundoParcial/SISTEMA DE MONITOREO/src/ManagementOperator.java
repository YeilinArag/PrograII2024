class ManagementOperator implements Observer {
    @Override
    public void update(String sensorType, double value) {
        System.out.println("Management Notification: Critical incident in " + sensorType + ": " + value);
    }
}
