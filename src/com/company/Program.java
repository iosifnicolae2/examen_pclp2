package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by iosif on 02/07/2017.
 */
public class Program {
    private ArrayList<Oras> lista = new ArrayList();
    private int nr_orase = 0;


    private  void adaugare(){
        Oras o = new Oras();
        o.citeste(nr_orase);
        lista.add(o);
        nr_orase = nr_orase  + 1;
    }

    private void eliminare(String nume){

        int nr = lista.size();

        for(int i=0;i<nr;i++){
            if(lista.get(i).getNume().equalsIgnoreCase(nume)){
                lista.remove(i);
                nr--;
                i--;
            }
        }

    }

    private double distanta(Oras a, Oras b){
        return Math.sqrt(111*Math.pow(a.getLat()-b.getLat(),2)+79*Math.pow(a.getLng()-b.getLng(),2));

    }

    private void afisare_itinerar(){
        double distanta = 0;
        for(int i=0;i<lista.size()-1;i++){
            distanta+= distanta(lista.get(i),lista.get(i+1));
        }
        System.out.println("Distanta itinerariului este: "+distanta);
    }

    private void salvare_itinerar(){

        try {
            PrintWriter printWriter = new PrintWriter(new FileOutputStream("./output.txt",false));


        for(int i=0;i<lista.size()-1;i++){
            printWriter.println("d("+lista.get(i).getNume()+","+lista.get(i+1).getNume()+") = "+distanta(lista.get(i),lista.get(i+1))+"km");

        }

        printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("A aparut o eroare: "+e);
        }
    }



    public void start(){

        for(int i=0;i<3;i++)
            adaugare();

        String d;
        d = "citit de la tastatura...";

        eliminare(d);

        afisare_itinerar();

        salvare_itinerar();



    }


}
