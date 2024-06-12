package com.hotelmanagementsystem.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor

public class InvalidInventoryException extends RuntimeException{
    private String message = "Invalid inventory!!!";

    @Override
    public String toString(){
        return "InvalidInventoryException: "+message;
    }
}
