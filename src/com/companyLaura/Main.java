package com.companyLaura;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameX;
        String nameDb = "Laura";

        String email;
        String emailX;
        String emailDb = "laura@gmail.com";

        String pass;
        String passX;
        String passDb = "parole123";

        String logins;
        String yn;

        System.out.println();
        System.out.println("Esi sveicināts super advancētajā sociālajā tīklā iekš konsoles!");
        System.out.println("Ja vēl neesi reģistrējies, taču vēlies to izdarīt, tad ieraksti - REGISTER.");
        System.out.println("Bet ja esi, tad ieraksti - LOGIN.");
        logins = scanner.nextLine();

        switch (logins) {
            case "REGISTER" -> {                                  //REGISTER
                System.out.println("Sāksim reģistrāciju.");
                System.out.println("Ievadi savu vārdu:");
                nameX = scanner.nextLine();
                System.out.println("Ievadi savu e-pastu:");
                emailX = scanner.nextLine();
                System.out.println("Ievadi savu paroli (vismaz 8 simboli):");
                passX = scanner.nextLine();
                //nosacījumi, kāpēc nevarētu piereģistrēties
                if (nameX.equals(nameDb)) {                        //nevar būt jau esošs lietotājs
                    System.out.println("Lietotājs ar šādu vārdu jau eksistē. Izvēlies citu vārdu.");
                    System.out.println("Pārlādē lapu un sāc no jauna! :D ");
                } else if (passX.length() < 8) {                     //parolei jābūt vismaz 8 simboliem
                    System.out.println("Bija taču teikts, ka parolei vajag vismaz 8 simbolus.");
                    System.out.println("Pārlādē lapu un sāc no jauna! :D ");
                } else if (emailX.equals(emailDb)) {               //nevar būt viens e-pasts vairākiem lietotājiem
                    System.out.println("Opiņā. Kāds cits būs reģistrējies ar Tavu e-pastu.");
                    System.out.println("Pārlādē lapu un sāc no jauna! :D ");

                } else {                                         //ja viss kārtībā ar reģistrāciju
                    System.out.println("Apsveicam, " + nameX + "! Esi reģistrēts!");
                    System.out.println("Vai vēlies ieiet savā jaunajā profiLā?");
                    System.out.println("Jā - Y. Nē - N.");
                    yn = scanner.nextLine();
                    switch (yn) {
                        case "N" -> System.out.println("OK. Gaidīsim citreiz! Foršu dienu!");
                        case "Y" -> {                                //Login ar tikko reģistrētiem datiem
                            System.out.println("Lieliski!");
                            System.out.println("Ievadi savu e-pastu:");
                            email = scanner.nextLine();
                            System.out.println("Ievadi savu paroli:");
                            pass = scanner.nextLine();
                            if (!pass.equals(passX) || !email.equals(emailX)) {
                                System.out.println("Lietotājs ar šādiem datiem neeksistē.");
                                System.out.println("Pārlādē lapu un sāc no jauna! :D ");

                            } else {                                     //Lietotāja profils
                                System.out.println("Čau, " + nameX + "! Šis ir Tavs profils!");
                                System.out.println("Vārds: " + nameX);
                                System.out.println("E-pasts: " + emailX);
                                System.out.println("Parole: " + passX);
                                System.out.println();
                                System.out.println("Un anekdote:");
                                System.out.println("A programmer puts two glasses on his bedside table before going to sleep.\n" +
                                        "One full of water in case he gets thirsty and an empty one in case he doesn’t.");
                                System.out.println();

                                do {                                     //LOGOUT
                                    System.out.println("Vai vēlies iziet?");
                                    System.out.println("Jā - Y. Nē - N.");
                                    yn = scanner.nextLine();
                                } while (!yn.equals("Y"));
                                System.out.println("OK. Gaidīsim nākošreiz! Foršu dienu!");
                            }
                        }
                    }
                }
            }
            case "LOGIN" -> {                                    //LOGIN
                System.out.println("Ievadi savu e-pastu:");
                email = scanner.nextLine();
                System.out.println("Ievadi savu paroli:");
                pass = scanner.nextLine();

                if (!email.equals(emailDb)) {                  //Login ar jau esošiem datiem
                    System.out.println("Nav pareizs e-pasts vai parole");
                    System.out.println("Pārlādē lapu un sāc no jauna! :D ");
                } else if (!pass.equals(passDb)) {
                    System.out.println("Nav pareizs e-pasts vai parole");
                    System.out.println("Pārlādē lapu un sāc no jauna! :D ");
                } else {
                    System.out.println("Čau, " + nameDb + "! Sen nebiji redzēts! Šis ir Tavs profils!");
                    System.out.println("Vārds: " + nameDb);
                    System.out.println("E-pasts: " + emailDb);
                    System.out.println("Parole: " + passDb);
                    System.out.println();
                    System.out.println("Un anekdote:");
                    System.out.println("A programmer puts two glasses on his bedside table before going to sleep.\n" +
                            "One full of water in case he gets thirsty and an empty one in case he doesn’t.");
                    System.out.println();

                    do {                                     //LOGOUT
                        System.out.println("Vai vēlies iziet?");
                        System.out.println("Jā - Y. Nē - N.");
                        yn = scanner.nextLine();
                    } while (!yn.equals("Y"));
                    System.out.println("OK. Gaidīsim nākošreiz! Foršu dienu!");
                }
            }
            default -> {                                                //Nav ne LOGIN, ne REGISTER
                System.out.println("Kaut kas nav pareizi.");
                System.out.println("Vai tad tik grūti uzrakstīt vienu no diviem vārdiem?");
                System.out.println("Pārlādē lapu un mēģini vēlreiz. :D");
            }
        }
    }
}
