package org.example;

public class Cavell extends Bay{
    public Cavell (String name, HospitalInformation info, MedicalNotification notification) {
        super("Cavell Bay",info, notification);
    }
    @Override
    protected String getStatus(){
        return "Service taking place";
    }
}