package dataStructure;

import java.util.ArrayList;
import java.util.Date;
/**
 * Created by Kelvin Meyer on 2016/09/24.
 * MYRKEL002
 */
public class Event {
    private String nameOfEvent;
    private Date time;
    private String place;
    private ArrayList<People> people = new ArrayList<>();
    private People creator;
    private boolean pub;

    public Event(Date time, String place, ArrayList<People> people, People creator, boolean pub) {
        this.time = time;
        this.place = place;
        this.people = people;
        this.creator = creator;
        this.pub = pub;
    }

    public Date getTime() {
        return time;
    }

    public String getPlace() {
        return place;
    }

    public ArrayList<People> getPeople() {
        return people;
    }

    public People getCreator() {
        return creator;
    }

    public boolean isPub() {
        return pub;
    }

    public String toString(){
        return nameOfEvent+" at "+place+" on "+time.toString()+" created by "+creator.getName();
    }
    public String getParticipants(){
        return people.toString();
    }
}
