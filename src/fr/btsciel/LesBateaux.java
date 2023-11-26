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
                case 1:
                    Bateau bateau = new Bateau(3.0, 1.5, "Plastique");
                    lesBateaux.add(bateau);
                    break;
                case 2:
                    Barque barque = new Barque(4.0, 2.0, "Bois", 2);
                    lesBateaux.add(barque);
                    break;
                case 3:
                    Bateau_A_Voile bateau_voile = new Bateau_A_Voile(12.0, 4.0, "Kevlar", 4, 2);
                    lesBateaux.add(bateau_voile);
                    break;
                case 4:
                    Bateau_A_Moteur bateau_moteur = new Bateau_A_Moteur(5.0, 3.0, "Aluminium", 34, 2);
                    lesBateaux.add(bateau_moteur);
                    break;
                case 5:
                    Bateau_A_Helice bateau_helice = new Bateau_A_Helice(4.0, 2.0, "Bois", 50, 1, 1.0);
                    lesBateaux.add(bateau_helice);
                    break;
            }
        }

        Bateau bateau1 = lesBateaux.get(0);
        Bateau bateau2 = lesBateaux.get(1);
        Bateau bateau3 = lesBateaux.get(2);
        Bateau bateau4 = lesBateaux.get(3);
        Bateau bateau5 = lesBateaux.get(4);

        Barque barque1 = (Barque) bateau2;
        Bateau_A_Voile voile1 = (Bateau_A_Voile) bateau3;
        Bateau_A_Moteur moteur1 = (Bateau_A_Moteur) bateau4;
        Bateau_A_Helice helice1 = (Bateau_A_Helice) bateau5;

        System.out.println("Les bateaux: ");
        System.out.println(YELLOW + "Bateau -> " + "\t\t\t\t" + bateau1.getCoque() + "\t" + bateau1.getLongueur() + " m" + "\t\t" + bateau1.getLargeur() + " m" + RESET);
        System.out.println(GREEN + "Barque -> " + "\t\t\t\t" + barque1.getCoque() + "\t\t" + barque1.getLongueur() + " m" + "\t\t" + barque1.getLargeur() + " m" + "\t" + barque1.getRame() + " rames" + RESET);
        System.out.println(RED + "Bateau a voile -> " + "\t\t" + voile1.getCoque() + "\t\t" + voile1.getLongueur() + " m" + "\t\t" + voile1.getLargeur() + " m" + "\t" + voile1.getMats() + " mats" + "\t\t" + voile1.getVoiles() + " voiles" + RESET);
        System.out.println(BLUE + "Bateau a moteur -> " + "\t\t" + moteur1.getCoque() + "\t" + moteur1.getLongueur() + " m" + "\t\t" + moteur1.getLargeur() + " m" + "\t" + moteur1.getNombreDeMoteurs() + " moteurs" + "\t" + moteur1.getPuissance() + " CV" + RESET);
        System.out.print(PURPLE + "Bateau a helice -> " + "\t\t" + helice1.getCoque() + "\t\t" + helice1.getLongueur() + " m" + "\t\t" + helice1.getLargeur() + " m" + "\t" + helice1.getNombreDeMoteurs() + " moteurs" + "\t" + helice1.getPuissance() + " CV" + "\t\t" + helice1.getTirant_D_Eau() + " m de tirant d'eau" + RESET);
    }
}