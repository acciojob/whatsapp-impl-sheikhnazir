package com.driver;

public class Group {
    public Object setName;
    private String name;
    private int numberOfParticipants;

    public Group(Object setName, String name, int numberOfParticipants) {
        this.setName = setName;
        this.name = name;
        this.numberOfParticipants = numberOfParticipants;
    }

    public Group() {

    }

    public Object getSetName() {
        return setName;
    }

    public void setSetName(Object setName) {
        this.setName = setName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }
}
