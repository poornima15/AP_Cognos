package com.jda.ap.bi.cognos.exception;

/**
 * Created by Lee on 7/25/2014.
 */
public class FrameworkManagerException extends Exception
{
    public FrameworkManagerException(String message) {
        super(message);
    }

    public FrameworkManagerException(String message, Throwable cause) {
        super(message, cause);
    }

    public FrameworkManagerException(Throwable cause) {
        super(cause);
    }

    public FrameworkManagerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
