package com.bytebank.app.client;

public class Client {

    private String name;
    private String ssn;
    private String occupation;

    public Client() {
        /** If this constructor is not defined, initialization of attributes 
        received in the constructor becomes mandatory.*/ 
    }

    public Client(String name, String ssn, String occupation) {
        this.name = name;
        this.ssn = ssn;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
}
