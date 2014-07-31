package com.jda.ap.bi.cognos.exception;

/**
 * Created by Lee on 7/24/2014.
 */
public class BIConfigException extends Exception
{
    public BIConfigException(String message) {
        super(message);
    }

    public BIConfigException(String message, Throwable cause) {
        super(message, cause);
    }

    public BIConfigException(Throwable cause) {
        super(cause);
    }
}
