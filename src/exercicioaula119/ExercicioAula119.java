/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula119;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entities.Reservation;
import view.entities.MainMenuView;
import view.entities.ReservationControllerView;

/**
 *
 * @author danilo.alves
 */
public class ExercicioAula119 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        
        Scanner sc = new Scanner(System.in);
        
         int resp;
        MainMenuView mainMenu = new MainMenuView();
        ReservationControllerView reservationControllerView = new ReservationControllerView();
        
         do{
           mainMenu.mainMenuControllerView();
           resp = sc.nextInt();
           switch(resp){
               case 1: reservationControllerView.reservation();
               break;
           }
            sc.nextLine();
        }while(resp != 2);
     
        
        /*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check - in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check - out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());
        
        if(!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }
        else{
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println(reservation);
            
            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check - in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check - out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());
            
            Date now = new Date();
            if(checkIn.before(now) || checkOut.before(now)){
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            }
            else if(!checkOut.after(checkIn)){
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            }
            else{
                //updateDates
            }
        }
        */
        sc.close();
    }
    
}
