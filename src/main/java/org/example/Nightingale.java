package org.example;

public class Nightingale extends Bay{
    public Nightingale (String name, HospitalInformation info, MedicalNotification notification) {
        super("Nightingale Bay",info, notification);
    }
    protected  String getServiceName(){
        return "Ultrasound scanner inactive";
    };
}

