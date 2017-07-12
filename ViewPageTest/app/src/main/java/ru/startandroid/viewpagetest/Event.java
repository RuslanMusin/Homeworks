package ru.startandroid.viewpagetest;

/**
 * Created by user on 10.07.2017.
 */

public class Event {

    private String eventName;
    private String description;
    private String image;

    public String getEventName() {
        return eventName;
    }

    public Event setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Event setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
