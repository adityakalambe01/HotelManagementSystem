package com.hotelmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRequest extends JpaRepository<ServiceRequest, Long> {
}
