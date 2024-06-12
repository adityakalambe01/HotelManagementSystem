package com.hotelmanagementsystem.entity.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class InvalidFeedbackException extends RuntimeException{
    private String message = "Invalid feedback!!!";

    @Override
    public String toString(){
        return "InvalidFeedbackException: "+ message;
    }
}
