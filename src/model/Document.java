package model;

import java.time.LocalDate;

public abstract class Document implements Exportable {
    private String title;
    private LocalDate createdAt;
    private String author;

    public Document(String title, LocalDate createdAt, String author) {
        this.title = title;
        this.createdAt = createdAt;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    final public String getExportData(Format format) {
        if (format.equals(Format.PDF)){
            return "PDF Export: " + title + " by " + author;
        } else if(format.equals(Format.HTML)){
            return "<h1>{"+ title +"}</h1><p>{" + author + "}</p>";
        } else if (format.equals(Format.TEXT)){
            return "Title: " + title +", Author: " + author;
        } else {
            return "No data";
        }
    }
}
