package org.example;

public class Barton extends Bay{
    public Barton (String name, HospitalInformation info, MedicalNotification notification) {
        super("Barton Bay",info, notification);
    }
    protected String getServiceName(){
        return "Service taking place";
    };
}
