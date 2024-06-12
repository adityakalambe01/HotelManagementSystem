package com.hotelmanagementsystem.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class InvalidPaymentException extends RuntimeException{
    private String message = "Invalid payment!!!";

    @Override
    public String toString(){
        return "InvalidPaymentException: " + message;
    }
}
