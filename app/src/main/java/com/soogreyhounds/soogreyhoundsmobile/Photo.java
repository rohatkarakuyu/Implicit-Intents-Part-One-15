package com.soogreyhounds.soogreyhoundsmobile;

public class Photo {

    int id ;
    String uuid ;
    String title ;
    String url ;
    String note ;


    String mPerson;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUUID() {
        return uuid;
    }

    public void setUUID(String uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getURL() {
        return url;
    }

    public void setURL(String url) {
        this.url = url;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPerson() {
        return mPerson;
    }

    public void setPerson(String mPerson) {
        this.mPerson = mPerson;
    }
}
