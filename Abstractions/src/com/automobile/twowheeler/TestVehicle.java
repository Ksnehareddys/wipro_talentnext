package com.automobile.twowheeler;



public class TestVehicle {
    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println("Hero Bike Details:");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Reg No: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println("\nHonda Car Details:");
        Honda honda = new Honda();
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Reg No: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();
    }
}