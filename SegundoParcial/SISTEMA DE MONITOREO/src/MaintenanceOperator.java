class MaintenanceOperator implements Observer {
    @Override

    public void update(String sensorType, double value) {
        if (sensorType.equals("Pressure")) {
            System.out.println("Notificacion de Mantenimiento: Anormal" + sensorType + "detectado" + value);
        }

    }
}


