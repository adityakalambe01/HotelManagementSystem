package com.hotelmanagementsystem.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class InvalidGuestException {
    private String message = "Invalid guest!!!";

    @Override
    public String toString(){
        return "InvalidGuestException: "+message;
    }
}
