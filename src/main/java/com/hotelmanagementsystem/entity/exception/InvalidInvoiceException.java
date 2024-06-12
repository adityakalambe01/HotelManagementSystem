package com.hotelmanagementsystem.entity.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class InvalidInvoiceException extends RuntimeException{
    private String message = "Invalid booking channel";

    @Override
    public String toString(){
        return "InvalidInvoiceException: " + message;
    }
}
