package ru.startandroid.twoactivitychef;

/**
 * Created by user on 10.07.2017.
 */

public class Recepie  {

    private String nameOfDish;

    private String time;

    private String cooking;

    private String moreInformation;

    public Recepie(String title, String data, String check) {
        this.nameOfDish = title;
        this.cooking = data;
        this.time = check;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCooking() {
        return cooking;
    }

    public void setCooking(String cooking) {
        this.cooking = cooking;
    }

    public String getMoreInformation() {
        return moreInformation;
    }

    public Recepie setMoreInformation(String moreInformation) {
        this.moreInformation = moreInformation;
        return this;
    }
}
