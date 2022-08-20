package Libreary_management_system;

public class Module2 {
    public void chemistry(){
        String[] chem = { "Organic chemistry","Physical chemistry","Bio chemistry","Inorganic chemistry","Polymer chemistry"};

        System.out.println("The books available in chemistry department are as follows: ");
        for (int i = 0; i < chem.length; i++) {
            System.out.println(chem[i]);
        }
    }

    public void physics(){
        String[] phy = {"Mechanics","Dynamics","Solid State Physics","Astro Physics","Electromagnetism"};

        System.out.println("The books available in physics department are as follows: ");
        for (int i = 0; i < phy.length; i++) {
            System.out.println(phy[i]);
        }
    }

    public void biology(){
        String[] bio ={"Zoology","Botany","Medical Science","xyz","abc"};

        System.out.println("The books available in biology department are as follows: ");
        for (int i = 0; i < bio.length; i++) {
            System.out.println(bio[i]);
        }
    }
}
