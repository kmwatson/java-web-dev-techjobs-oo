package org.launchcode.techjobs_oo;

public class Job {

    private int id;
    private static int nextId = 1;
    private String value;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String aValue) {
        this();
        this.value = aValue;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    public boolean equals(Object jobToBeCompared) {
        if (jobToBeCompared == this) {
            return true;
        }
        
        if (jobToBeCompared == null) {
            return false;
        }

        if (jobToBeCompared.getClass() != getClass()) {
            return false;
        }

        Job theJob = (Job) jobToBeCompared;
        return theJob.getJobId() == getJobId();
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
