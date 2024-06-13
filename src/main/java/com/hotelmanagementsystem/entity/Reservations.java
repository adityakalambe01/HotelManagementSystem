package com.hotelmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reservations")
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    @ManyToOne
    private Guests guestId;

    @ManyToOne
    private Rooms roomId;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private String reservationStatus;

    private String paymentDetails;

    @ManyToOne
    private BookingChannel bookingChannelId;
}
