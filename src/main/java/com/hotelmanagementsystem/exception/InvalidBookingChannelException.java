package com.hotelmanagementsystem.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class InvalidBookingChannelException extends RuntimeException{
    private String message = "Invalid booking channel";

    @Override
    public String toString(){
        return "InvalidBookingChannelException"+": "+message;
    }
}