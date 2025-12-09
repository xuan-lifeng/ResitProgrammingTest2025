package org.example;

public class Henderson extends Bay{
    public Henderson (String name, HospitalInformation info, MedicalNotification notification) {
        super("Henderson Bay",info, notification);
    }
    protected  String getServiceName(){
        return "Dialysis inactive";
    };
}