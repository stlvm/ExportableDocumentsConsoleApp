package model;

import model.Document;

import java.time.LocalDate;

public class Article extends Document {
    public Article(String title, LocalDate createdAt, String author) {
        super(title, createdAt, author);
    }
}
