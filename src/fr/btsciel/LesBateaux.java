package fr.btsciel;

import fr.btsciel.clavier.In;
import java.util.ArrayList;

public class LesBateaux {
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        ArrayList <Bateau> lesBateaux = new ArrayList<>();
        int choice = 0;

        while (choice != 5) {
            System.out.println("...Les bateaux...");
            System.out.println("Voici le menu afin de creer vos nouveaux bateaux");
            System.out.println("Pour creer un bateau normal sassissez 1");
            System.out.println("Pour creer une barque sassissez 2");
            System.out.println("Pour creer un bateau a voile sassissez 3");
            System.out.println("Pour creer un bateau a moteur sassissez 4");
            System.out.println("Pour creer un bateau a helice sassissez 5");
            System.out.print("Votre choix: ");
            choice = In.readInteger();

            switch (choice) {
                case 1 -> {
                    Bateau bateau = new Bateau(3.0, 1.5, "Plastique");
                    lesBateaux.add(bateau);
                }
                case 2 -> {
                    Barque barque = new Barque(4.0, 2.0, "Bois", 2);
                    lesBateaux.add(barque);
                }
                case 3 -> {
                    Bateau_A_Voile bateau_voile = new Bateau_A_Voile(12.0, 4.0, "Kevlar", 4, 2);
                    lesBateaux.add(bateau_voile);
                }
                case 4 -> {
                    Bateau_A_Moteur bateau_moteur = new Bateau_A_Moteur(5.0, 3.0, "Aluminium", 34, 2);
                    lesBateaux.add(bateau_moteur);
                }
                case 5 -> {
                    Bateau_A_Helice bateau_helice = new Bateau_A_Helice(4.0, 2.0, "Bois", 50, 1, 1.0);
                    lesBateaux.add(bateau_helice);
                }
            }
        }

        System.out.println("Les bateaux: ");

        for (Bateau b : lesBateaux) {
            switch (b.getClass().getSimpleName()) {
                case "Bateau" ->
                        System.out.println(YELLOW + "Bateau -> " + "\t\t\t\t" + b.getCoque() + "\t" + b.getLongueur() + " m" + "\t\t" + b.getLargeur() + " m" + RESET);
                case "Barque" -> {
                    Barque barque = (Barque) b;
                    System.out.println(GREEN + "Barque -> " + "\t\t\t\t" + barque.getCoque() + "\t\t" + barque.getLongueur() + " m" + "\t\t" + barque.getLargeur() + " m" + "\t" + barque.getRame() + " rames" + RESET);
                }
                case "Bateau_A_Voile" -> {
                    Bateau_A_Voile voile = (Bateau_A_Voile) b;
                    System.out.println(RED + "Bateau a voile -> " + "\t\t" + voile.getCoque() + "\t\t" + voile.getLongueur() + " m" + "\t\t" + voile.getLargeur() + " m" + "\t" + voile.getMats() + " mats" + "\t\t" + voile.getVoiles() + " voiles" + RESET);
                }
                case "Bateau_A_Moteur" -> {
                    Bateau_A_Moteur moteur = (Bateau_A_Moteur) b;
                    System.out.println(BLUE + "Bateau a moteur -> " + "\t\t" + moteur.getCoque() + "\t" + moteur.getLongueur() + " m" + "\t\t" + moteur.getLargeur() + " m" + "\t" + moteur.getNombreDeMoteurs() + " moteurs" + "\t" + moteur.getPuissance() + " CV" + RESET);
                }
                case "Bateau_A_Helice" -> {
                    Bateau_A_Helice helice = (Bateau_A_Helice) b;
                    System.out.print(PURPLE + "Bateau a helice -> " + "\t\t" + helice.getCoque() + "\t\t" + helice.getLongueur() + " m" + "\t\t" + helice.getLargeur() + " m" + "\t" + helice.getNombreDeMoteurs() + " moteurs" + "\t" + helice.getPuissance() + " CV" + "\t\t" + helice.getTirant_D_Eau() + " m de tirant d'eau" + RESET);
                }
            }
        }
    }
}