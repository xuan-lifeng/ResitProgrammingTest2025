package org.example;

public class Henderson extends Bay{
    public Henderson (String name, HospitalInformation info, MedicalNotification notification) {
        super("Henderson Bay",info, notification);
    }
    @Override
    protected String getStatus(){
        return "Dialysis inactive";
    }
}