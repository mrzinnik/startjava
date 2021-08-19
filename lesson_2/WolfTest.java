public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "male";
        wolfOne.name = "Ocelot";
        wolfOne.weight = 40.4f;
        wolfOne.age = 7;
        wolfOne.colour = "gray";

        System.out.println("wolfOne gender = " + wolfOne.gender);
        System.out.println("wolfOne name = " + wolfOne.name);
        System.out.println("wolfOne weight = " + wolfOne.weight);
        System.out.println("wolfOne age = " + wolfOne.age);
        System.out.println("wolfOne colour = " + wolfOne.colour);

        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}