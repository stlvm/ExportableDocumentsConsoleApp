package model;

import model.Document;

import java.time.LocalDate;

public class Report extends Document {
    public Report(String title, LocalDate createdAt, String author) {
        super(title, createdAt, author);
    }
}
