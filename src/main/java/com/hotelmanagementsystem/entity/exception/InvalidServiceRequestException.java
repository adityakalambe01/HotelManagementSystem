package com.hotelmanagementsystem.entity.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class InvalidServiceRequestException extends RuntimeException{
    private String message = "Invalid service request!!!";

    @Override
    public String toString(){
        return "InvalidServiceRequestException: " + message;
    }
}
