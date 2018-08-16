package com.example.muhammadxoshnaw.memo;

public class Memo {
    private String title;
    private String description;

    public Memo(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}






/*

CREATE TABLE Memo(id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, description TEXT);


* */
