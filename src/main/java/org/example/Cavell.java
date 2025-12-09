package org.example;

public class Cavell extends Bay{
    public Cavell (String name, HospitalInformation info, MedicalNotification notification) {
        super("Cavell Bay",info, notification);
    }
    protected  String getServiceName(){
        return "Service taking place";
    };
}