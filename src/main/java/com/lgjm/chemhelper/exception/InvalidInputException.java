package com.lgjm.chemhelper.exception;

/**
 * An exception for when invalid input is provided by the client.
 *
 * @author ChemHelper
 * @version 09/19/2017
 */
public class InvalidInputException extends Exception {

    public InvalidInputException(String message) {
        super(message);
    }

}
