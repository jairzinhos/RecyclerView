package org.beginningandroid.recyclerview;

/// We are showing the properties of the list to show

public class MatchModel {
    private String match, hour, ligue, channel, status, link;

    /*
    public MatchModel(String match, String hour, String ligue, String channel, String status, String link) {
        this.match = match;
        this.hour = hour;
        this.ligue = ligue;
        this.channel = channel;
        this.status = status;
        this.link = link;
    }

    public MatchModel(String match, String hour, String ligue) {
    }

     */
    /*

    public MatchModel(String match, String hour, String ligue, String channel, String status, String link) {
        this.match = match;
        this.hour = hour;
        this.ligue = ligue;
        this.channel = channel;
        this.status = status;
        this.link = link;}
    */
    public MatchModel(String match, String hour, String ligue, String channel, String status, String link) {
        /*
        this.match = match;
        this.hour = hour;
        this.ligue = ligue;
        this.channel = channel;
        this.status = status;
        this.link = link;

         */
    }
    /*
    public MatchModel(String match, String hour, String Liga, String channel, String status, String link) {
    }
    */
    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getLigue() {
        return ligue;
    }

    public void setLigue(String ligue) {
        this.ligue = ligue;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


}