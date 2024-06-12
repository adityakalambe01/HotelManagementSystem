package com.hotelmanagementsystem.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class InvalidRoomTypeException extends RuntimeException{
    private String message = "Invalid room type!!!";

    @Override
    public String toString(){
        return "InvalidRoomTypeException: " + message;
    }
}
