package org.example;

public class Nightingale extends Bay{
    public Nightingale (String name, HospitalInformation info, MedicalNotification notification) {
        super("Nightingale Bay",info, notification);
    }
    @Override
    protected String getStatus(){
        return "Ultrasound scanner inactive";
    }
}

