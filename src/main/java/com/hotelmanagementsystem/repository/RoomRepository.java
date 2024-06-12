package com.hotelmanagementsystem.repository;

import com.hotelmanagementsystem.entity.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Rooms, Long> {
}
