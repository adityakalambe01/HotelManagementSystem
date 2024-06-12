package com.hotelmanagementsystem.repository;

import com.hotelmanagementsystem.entity.Guests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guests, Long> {
}
