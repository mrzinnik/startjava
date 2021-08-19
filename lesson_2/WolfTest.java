public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("male");
        wolfOne.setName("Ocelot");
        wolfOne.setWeight(40.4f);
        wolfOne.setAge(9);
        wolfOne.setColour("gray");

        System.out.println("wolfOne gender = " + wolfOne.getGender());
        System.out.println("wolfOne name = " + wolfOne.getName());
        System.out.println("wolfOne weight = " + wolfOne.getWeight());
        System.out.println("wolfOne age = " + wolfOne.getAge());
        System.out.println("wolfOne colour = " + wolfOne.getColour());

        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}