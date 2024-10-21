package com.example.library.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.List;

    @Entity
    public class Book extends BaseEntity {
        private String Name;

        @ManyToOne
        @JoinColumn(name = "author_id")
        private List<Author> authors;
    }
