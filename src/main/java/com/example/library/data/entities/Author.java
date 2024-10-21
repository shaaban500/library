package com.example.library.data.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "authors")
public class Author extends BaseEntity{
    private String name;
    private String email;
    private String gender;
    private double salary;

    @OneToMany(mappedBy="author", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;
}
