package service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import model.*;

public class DocumentService {
    public static List<Document>  sortDocuments(List<Document> documents){
        return documents.stream()
                .sorted(Comparator.comparing(Document::getCreatedAt).reversed()
                        .thenComparing(Document::getAuthor)
                        .thenComparing(a -> a instanceof Article))
                .collect(Collectors.toList());
    }
    public static Optional<Document> findByTitle(List<Document> documents, String title){
        return documents.stream()
                .filter(a -> a.getTitle().equals(title))
                .findFirst();
    }
    public static Map<String, List<Document>> groupByAuthor(List<Document> documents){
        return documents.stream()
                .collect(Collectors.groupingBy(
                        Document::getAuthor,
                        Collectors.toList()
                ));
    }
    public static Map<Class<?>, Long> countByType(List<Document> documents){
        return documents.stream()
                .collect(Collectors.groupingBy(
                        Document::getClass,
                        Collectors.counting()
                ));
    }
    public static Map<String, Long> countDocumentsPerAuthor(List<Document> documents){
        return documents.stream()
                .collect(Collectors.groupingBy(
                        Document::getAuthor,
                        Collectors.counting())
                );
    }
    public static Optional<Document> lastDocumentByAuthor(List<Document> documents, String author) {
        return documents.stream()
                .filter(doc -> doc.getAuthor().equalsIgnoreCase(author))
                .sorted(Comparator.comparing(Document::getCreatedAt).reversed())
                .findFirst();
    }
}
