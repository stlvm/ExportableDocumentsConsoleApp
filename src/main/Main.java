package main;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static service.DocumentService.*;

public class Main {
    public static void main(String[] args) {
        List<Document> documents = List.of(
                new Report("Q1 Report", LocalDate.of(2024, 1, 15), "Alice"),
                new Report("Annual Summary", LocalDate.of(2023, 12, 1), "Bob"),
                new Article("Tech Trends", LocalDate.of(2024, 2, 10), "Charlie"),
                new Article("Java Weekly", LocalDate.of(2024, 3, 5), "Alice"),
                new Report("Budget Plan", LocalDate.of(2024, 4, 20), "Dana"),
                new Article("AI Research", LocalDate.of(2023, 11, 25), "Bob")
        );
        List<Document> sortedDocuments = sortDocuments(documents);
        for(Document d : sortedDocuments){
            d.getExportData(Format.PDF);
        }

        countDocumentsPerAuthor(documents).entrySet().stream()
                .forEach(a -> System.out.println(a.getKey() + ": " + a.getValue()));

        lastDocumentByAuthor(documents, "ALICE").ifPresent(a -> System.out.println(a.getTitle()));
    }
}