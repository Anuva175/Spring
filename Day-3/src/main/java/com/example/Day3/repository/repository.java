package com.example.Day3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Day3.model.student;

public interface repository extends JpaRepository<student, Integer> {

}
