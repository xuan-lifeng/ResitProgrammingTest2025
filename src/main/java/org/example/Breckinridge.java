package org.example;
public class Breckinridge extends Bay{
    public Breckinridge (String name, HospitalInformation info, MedicalNotification notification) {
        super("Breckinridge Bay",info, notification);
    }
    protected  String getServiceName(){
        return "Service taking place";
    };
}