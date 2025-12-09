package org.example;

public class Barton extends Bay{
    public Barton (String name, HospitalInformation info, MedicalNotification notification) {
        super("Barton Bay",info, notification);
    }
    @Override
    protected String getStatus(){
        return "Service taking place";
    }
}
