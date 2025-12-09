package org.example;

public class Seacole extends Bay{
    public Seacole (String name, HospitalInformation info, MedicalNotification notification) {
        super("Seacole Bay",info, notification);
    }
    @Override
    protected String getStatus(){
        return "ECG recorder and Masseur inactive";
    }
}
