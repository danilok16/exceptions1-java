/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.entities;

import controllers.ReservationController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.entities.Reservation;
import model.exceptions.DomainException;

/**
 *
 * @author dkaus
 */
public class ReservationControllerView {

    public void reservation() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ReservationController reservationController = new ReservationController();

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check - in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check - out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.print(reservation + " ");
            System.out.println(reservationController.duration(reservation) + " nights");

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check - in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check - out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());
            reservationController.updateDates(reservation, checkIn, checkOut);
        } catch (InputMismatchException e) {
            System.out.println("Invalid room number!");
        } catch (ParseException e) {
            System.out.println("Invalid date format!");
        } catch (DomainException e) {
            System.out.println("Erro in reservation: " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Unexpected error");
        }
        // sc.close();
    }

}
