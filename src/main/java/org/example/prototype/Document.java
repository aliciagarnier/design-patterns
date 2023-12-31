package org.example.prototype;

import java.time.LocalDate;

public class Document {
    private String name;

    private LocalDate date;

    private String path;

//    public Document(String name, LocalDate date, String path) {
//        this.name = name;
//        this.date = date;
//        this.path = path;
//    }
    public static Document clone (Document prototype) {
        Document document = new Document();
        document.name = prototype.name;
        document.date = prototype.date;
        document.path = prototype.path;
        return document;
    }
}
