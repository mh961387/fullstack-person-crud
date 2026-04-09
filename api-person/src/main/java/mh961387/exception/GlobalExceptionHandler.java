package mh961387.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import java.util.Date;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleNotFound(
            ResourceNotFoundException ex,
            HttpServletRequest request) {

        ExceptionResponse error = new ExceptionResponse(
                new Date(),
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage(),
                request.getRequestURI()
        );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ExceptionResponse> handleBadRequest(
            IllegalArgumentException ex,
            HttpServletRequest request) {

        ExceptionResponse error = new ExceptionResponse(
                new Date(),
                HttpStatus.BAD_REQUEST.value(),
                ex.getMessage(),
                request.getRequestURI()
        );

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> handleGeneric(
            Exception ex,
            HttpServletRequest request) {

        ExceptionResponse error = new ExceptionResponse(
                new Date(),
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Unexpected error",
                request.getRequestURI()
        );

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }
}