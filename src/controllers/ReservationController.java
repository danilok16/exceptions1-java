/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import model.entities.Reservation;
import model.exceptions.DomainException;

/**
 *
 * @author danilo.alves
 */
public class ReservationController {

    public long duration(Reservation reservation) {
        long diff = reservation.getCheckOut().getTime() - reservation.getCheckIn().getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);  //converte milliseconds para dias
    }

    public void updateDates(Reservation reservation, Date checkIn, Date checkOut) throws DomainException{
        Date now = new Date();
        
        if (checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("Reservation dates for update must be future dates");
            /*
            throw new IllegalArgumentException("Reservation dates for update must be future dates");
            
            ou exceção personalizada
            
            throw new DomainException("Reservation dates for update must be future dates");
            */
        } 
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        
        reservation.setCheckIn(checkIn);
        reservation.setCheckOut(checkOut);
    }

}
