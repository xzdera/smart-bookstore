package org.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Document(indexName = "books")
public class Book {
    @Id
    private Long id;
    private String title;
    private String author;
    private String description;
    private BigDecimal price;
    // getters and setters
}