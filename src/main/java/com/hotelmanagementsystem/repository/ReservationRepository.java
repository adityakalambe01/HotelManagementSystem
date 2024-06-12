package com.hotelmanagementsystem.repository;

import com.hotelmanagementsystem.entity.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservations, Long> {
}
