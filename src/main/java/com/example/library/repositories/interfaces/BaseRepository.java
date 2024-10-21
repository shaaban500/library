package com.example.library.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<T, ID> extends JpaRepository<T, ID> {
}
