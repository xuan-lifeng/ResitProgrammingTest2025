package org.example;

public class Dix extends Bay{
    public Dix (String name, HospitalInformation info, MedicalNotification notification) {
        super("Dix Bay",info, notification);
    }
    @Override
    protected String getStatus(){
        return "Service taking place";
    }
}