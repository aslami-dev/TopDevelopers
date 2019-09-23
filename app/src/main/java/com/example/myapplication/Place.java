package com.example.myapplication;

import android.content.Context;

public class Place {

    public Place(String _street, String Khooche, String Pelak) {

        this.Street = _street;
        this.Khooche = Khooche;
        this.Pelak = Pelak;
    }

    public Place(String name) {

        if (name != null) {
            this.Name = name;
        } else {
            this.Name = "";
        }
    }

    public Place() {

    }


    public int squre;
    public Context context;
    private String Street;
    public String Khooche;
    public String Pelak;
    public String Name;
    public static String City = "mashhad";
    public  static String City2;

    public static String getAddress(String Street,
                                    String Khooche,
                                    String Pelak) {

        return Street + " " + Khooche + " " + Pelak;
    }

    public String getStreet() {
        App.getContext();
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }
}
