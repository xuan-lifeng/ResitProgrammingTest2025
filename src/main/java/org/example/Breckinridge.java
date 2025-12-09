package org.example;
public class Breckinridge extends Bay{
    public Breckinridge (String name, HospitalInformation info, MedicalNotification notification) {
        super("Breckinridge Bay",info, notification);
    }
    @Override
    protected String getStatus(){
        return "Service taking place";
    }
}