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

        do {
            mainMenu.mainMenuControllerView();
            resp = sc.nextInt();
            switch (resp) {
                case 1:
                    reservationControllerView.reservation();
                    break;
            }
            sc.nextLine();
        } while (resp != 2);

        sc.close();
    }

}
