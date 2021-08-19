public class Wolf {
    
    private String gender;
    private String name;
    private float weight;
    private int age;
    private String colour;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void move() {
        System.out.println(name + " is moving");
    }

    public void sit() {
        System.out.println(name + " is sitting");
    }

    public void run() {
        System.out.println(name + " is running");
    }

    public void howl() {
        System.out.println(name + " is howling");
    }

    public void hunt() {
        System.out.println(name + " is hunting");
    }
}