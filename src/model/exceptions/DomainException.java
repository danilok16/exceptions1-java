/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.exceptions;

/**
 *
 * @author dkaus
 */
public class DomainException extends Exception{// extends Exception ou extends RuntimeException
    
    public DomainException(String msg){
        super(msg);
        
    }
}
