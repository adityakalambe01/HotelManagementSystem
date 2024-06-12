package com.hotelmanagementsystem.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class InvalidReservationException extends RuntimeException{
    private String message = "Invalid reservation!!!";

    @Override
    public String toString(){
        return "InvalidReservationException: " + message;
    }
}
