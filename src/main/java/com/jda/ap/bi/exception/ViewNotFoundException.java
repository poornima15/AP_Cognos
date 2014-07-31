package com.jda.ap.bi.exception;

/**
 * User: Lee
 * Date: 7/30/2014
 * Time: 2:48 PM
 */
public class ViewNotFoundException extends Exception
{

    public ViewNotFoundException(String message)
    {
        super(message);
    }


    public ViewNotFoundException(String message, Throwable cause)
    {
        super(message, cause);
    }


    public ViewNotFoundException(Throwable cause)
    {
        super(cause);
    }
}
