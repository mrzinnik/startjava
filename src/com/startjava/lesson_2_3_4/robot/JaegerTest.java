package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setName("Bracer Phoenix");
        jaegerOne.setHeight(70.91f);
        jaegerOne.setWeight(2128);
        jaegerOne.setWeapon("Vortex Cannon");
        System.out.println("Jaeger #1:");
        System.out.println(jaegerOne);
        
        Jaeger jaegerTwo = new Jaeger("Gipsy Avenger", 81.77f, 2004, "Plasma Caster 2.0");
        System.out.println("Jaeger #2:");
        System.out.println(jaegerTwo);
        jaegerTwo.setName("Saber Athena");
        jaegerTwo.setHeight(76.91f);
        jaegerTwo.setWeight(1628);
        jaegerTwo.setWeapon("N-16 Particle Charger");
        System.out.println("Jaeger #2:");
        System.out.println(jaegerTwo);

        jaegerOne.drift();
        jaegerOne.move();
        System.out.println(jaegerTwo.scanKaiju());
        jaegerTwo.useWeapon();
    }
}