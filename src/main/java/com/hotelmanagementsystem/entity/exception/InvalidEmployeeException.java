package com.hotelmanagementsystem.entity.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class InvalidEmployeeException extends RuntimeException{
    private String message = "Invalid Employee!!!";

    @Override
    public String toString(){
        return "InvalidEmployeeException: "+ message;
    }
}
