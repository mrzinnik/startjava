public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setName("Bracer Phoenix");
        jaegerOne.setHeight(70.91f);
        jaegerOne.setWeight(2128);
        jaegerOne.setWeapon("Vortex Cannon");
        System.out.println("Jaeger #1 name = " + jaegerOne.getName());
        System.out.println("Jaeger #1 height = " + jaegerOne.getHeight());
        System.out.println("Jaeger #1 weight = " + jaegerOne.getWeight());
        System.out.println("Jaeger #1 weapon = " + jaegerOne.getWeapon());
        
        Jaeger jaegerTwo = new Jaeger("Gipsy Avenger", 81.77f, 2004, "Plasma Caster 2.0");
        System.out.println("Jaeger #2 name = " + jaegerTwo.getName());
        System.out.println("Jaeger #2 height = " + jaegerTwo.getHeight());
        System.out.println("Jaeger #2 weight = " + jaegerTwo.getWeight());
        System.out.println("Jaeger #2 weapon = " + jaegerTwo.getWeapon());
        jaegerTwo.setName("Saber Athena");
        jaegerTwo.setHeight(76.91f);
        jaegerTwo.setWeight(1628);
        jaegerTwo.setWeapon("N-16 Particle Charger");
        System.out.println("Jaeger #2 name = " + jaegerTwo.getName());
        System.out.println("Jaeger #2 height = " + jaegerTwo.getHeight());
        System.out.println("Jaeger #2 weight = " + jaegerTwo.getWeight());
        System.out.println("Jaeger #2 weapon = " + jaegerTwo.getWeapon());

        jaegerOne.drift();
        jaegerOne.move();
        System.out.println(jaegerTwo.scanKaiju());
        jaegerTwo.useWeapon();
    }
}