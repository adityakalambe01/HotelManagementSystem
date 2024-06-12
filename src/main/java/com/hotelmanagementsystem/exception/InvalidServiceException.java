package com.hotelmanagementsystem.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class InvalidServiceException extends RuntimeException{
    private String message = "Invalid service!!!";

    @Override
    public String toString(){
        return "InvalidServiceException: " + message;
    }
}
