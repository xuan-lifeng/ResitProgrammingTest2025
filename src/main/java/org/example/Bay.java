package org.example;

public abstract class Bay {
    protected String name;
    protected HospitalInformation info;
    protected MedicalNotification notification;

    protected String service;

    public Bay(String name, HospitalInformation info, MedicalNotification notification) {
        this.name = name;
        this.info = info;
        this.notification = notification;
    }
    public void update() {
        service= notification.getService();
    }
    protected abstract String getStatus();

    public String getDisplayText() {
        return "<html><b>" + name + "</b><br>"
                + "Service: " + service + "<br>";
    }


}


