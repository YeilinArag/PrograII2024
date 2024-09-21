class Main {}
    public static void main(String[] args) {

        TemperatureSensor tempSensor = new TemperatureSensor();
        PressureSensor pressureSensor = new PressureSensor();

        Observer security = new SecurityOperator();
        Observer maintenance = new MaintenanceOperator();
        Observer management = new ManagementOperator();

        tempSensor.attach(security);
        tempSensor.attach(management);
        pressureSensor.attach(security);
        pressureSensor.attach(maintenance);
        pressureSensor.attach(management);


        tempSensor.setValue(110.0);
        pressureSensor.setValue(1200.0);
        pressureSensor.setValue(50.0);
    }
}