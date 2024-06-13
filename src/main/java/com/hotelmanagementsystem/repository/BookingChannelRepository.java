package com.hotelmanagementsystem.repository;

import com.hotelmanagementsystem.entity.BookingChannel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingChannelRepository extends JpaRepository<BookingChannel, Long> {
}
