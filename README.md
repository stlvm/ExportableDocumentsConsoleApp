# ExportableDocumentsConsoleApp

Java console application for working with two types of documents: Report and Article.  
Demonstrates object-oriented programming, inheritance, interfaces, enums, sorting, filtering, grouping, and basic algorithmic logic.

## Features

- Two document types: Report and Article (both extend Document)
- Export data in multiple formats: TEXT, HTML, PDF
- Sort documents by creation date, author, and type (Report before Article)
- Group and count documents by author and by type
- Find the most recent document by a given author
- All functionality implemented without external libraries

## Technologies

- Java 17
- Abstract classes and inheritance
- Interfaces with method implementations
- Enums for export format
- Stream API (filter, map, sorted, groupingBy, counting)

## Project structure

- `model/`
  - `Document.java` – abstract base class
  - `Report.java`, `Article.java` – specific document types
  - `Exportable.java` – interface with export method
  - `Format.java` – enum for export formats

- `service/`
  - `DocumentService.java` – utility methods: sorting, grouping, filtering

- `main/`
  - `Main.java` – entry point, creates test data and calls service methods

## How to run

  1. Compile:
   ```bash
   javac main/Main.java model/*.java service/*.java
   ```
  2. Run:
   ```bash
   javac main/Main.java
   ```
