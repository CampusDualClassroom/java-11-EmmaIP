package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        redRemote.turnOn();
        System.out.println("El mando está: " + redRemote.isOn());

        redRemote.channelUp();
        System.out.println("El canal es: " + redRemote.getChannel());

        redRemote.channelDown();
        System.out.println("El canal es: " + redRemote.getChannel());

        redRemote.channel = 0;
        System.out.println("El canal es: " + redRemote.getChannel());
        redRemote.channelDown();
        System.out.println("El canal es: " + redRemote.getChannel());

        redRemote.volumeUp();
        System.out.println("El volumen es: " + redRemote.getVolume());
        redRemote.volumeDown();
        System.out.println("El volumen es: " + redRemote.getVolume());

        redRemote.volume = 0;
        System.out.println("El volumen es: " + redRemote.getVolume());
        redRemote.volumeDown();

        System.out.println("El color del mando a distancia es: " + redRemote.getColor());

        redRemote.turnOff();
        System.out.println("El mando está: " + redRemote.isOn());

    }

}