package org.example;
public class Sanger extends Bay{
    public Sanger (String name, HospitalInformation info, MedicalNotification notification) {
        super("Sanger Bay",info, notification);
    }
    protected  String getServiceName(){
        return "Service taking place";
    }
}
