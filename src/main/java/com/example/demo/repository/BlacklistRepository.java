package com.example.demo.repository;

import com.example.demo.model.Blacklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlacklistRepository extends JpaRepository<Blacklist, String> {
}