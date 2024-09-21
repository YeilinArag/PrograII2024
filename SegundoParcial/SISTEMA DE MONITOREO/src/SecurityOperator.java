class SecurityOperator implements Observer {
    @Override
    public void update (String sensorType, double value) {
        if(sensorType.equals("Pressure")){
            System.out.println("Alerta de mantenimiento: Anormal" + sensorType + "detectado: " + value);
        }
    }
}
