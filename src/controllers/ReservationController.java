/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import model.entities.Reservation;

/**
 *
 * @author danilo.alves
 */
public class ReservationController {
    
    public long duration(Reservation reservation){
        long diff = reservation.getCheckout().getTime() - reservation.getCheckin().getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);  //converte milliseconds para dias
    }
    
    public void updateDates(Reservation reservation, Date checkin, Date checkout){
        reservation.setCheckin(checkin);
        reservation.setCheckout(checkout);
    }
    
    
}
