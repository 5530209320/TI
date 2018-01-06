package com.example.simplerssreader;

/**
 * Created by Pongsakorn on 8/12/2560.
 */

public class RssFeedModel{

    public String title;
    public String link;
    public String description;

    public RssFeedModel(String title, String link, String description) {
        this.title = title;
        this.link = link;
        this.description = description;
    }
}