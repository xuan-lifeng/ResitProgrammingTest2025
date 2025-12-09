package org.example;
public class Sanger extends Bay{
    public Sanger (String name, HospitalInformation info, MedicalNotification notification) {
        super("Sanger Bay",info, notification);
    }
    @Override
    protected String getStatus(){
        return "Service taking place";
    }
}
