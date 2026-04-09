package mh961387.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp,  Integer status, String message, String details) {}
