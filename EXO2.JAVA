import java.util.*;
class EXO2
{
    public static void main (String args[])
    {
        Scanner clavier= new Scanner (System.in);
        System.out.print(" donner le numero duy jour :");
        int nbjour = clavier.nextInt();
        switch( nbjour)
        {
            case 1: System.out.print("Lundi"); break;
            case 2: System.out.print("Mardi"); break;
            case 3: System.out.print("Mercredi"); break;
            case 4: System.out.print("Jeudi"); break;
            case 5: System.out.print("Vendredi"); break;
            case 6: System.out.print("Samedi"); break;
            case 7: System.out.print("Dimanche"); break;
            default : System.out.print(" numero du jour invalide");
        }
        
        
        clavier.close();
    }
}
