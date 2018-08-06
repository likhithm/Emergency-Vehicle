package com.example.demo.repository;

import com.example.demo.model.Whitelist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WhitelistRepository extends JpaRepository<Whitelist, String> {
}