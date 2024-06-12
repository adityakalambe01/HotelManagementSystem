package com.hotelmanagementsystem.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class InvalidRoomException extends RuntimeException{
    private String message = "Invalid room!!!";

    @Override
    public String toString(){
        return "InvalidRoomException: " + message;
    }
}
