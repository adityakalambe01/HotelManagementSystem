package com.hotelmanagementsystem.entity.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class InvalidMaintenanceException extends RuntimeException {
    private String message = "Invalid maintenance!!!";

    @Override
    public String toString(){
        return "InvalidMaintenanceException: "+ message;
    }
}
