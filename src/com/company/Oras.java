package com.company;

import java.util.Scanner;

/**
 * Created by iosif on 02/07/2017.
 */
public class Oras {
    private String nume;
    private double lat;
    private double lng;
    private int poz;

    public Oras() {
    }

    public Oras(String nume, double lat, double lng, int poz) {
        this.nume = nume;
        this.lat = lat;
        this.lng = lng;
        this.poz = poz;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public int getPoz() {
        return poz;
    }

    public void setPoz(int poz) {
        this.poz = poz;
    }

    public void citeste(int poz) {
        System.out.println("Introduceti elementul "+(poz+1));
        try{

            Scanner scanner = new Scanner(System.in);
            this.nume =  scanner.nextLine();
            this.lat =  Double.parseDouble(scanner.nextLine());
            this.lng =  Double.parseDouble(scanner.nextLine());
            this.poz = poz;
        }catch (Exception e){
            System.out.println("A aparut o eroare la citirea orasului: "+e);
        }

    }
}
