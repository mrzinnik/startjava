public class ConditionalStatement {
    
    public static void main(String[] args) {
        int age = 21;
        if(age > 20) {
            System.out.println("Person is over 20 years old")
        }

        boolean isMale = true;
        if(isMale) {
            System.out.println("Person is male");
        }
        if(!isMale) {
            System.out.println("Person is female");
        }
        

        double height = 1.9;
        if(height < 1.80) {
            System.out.println("Person's height is less than 1.8 meters");
        } else {
            System.out.println("Person's height is equals or more than 1.8 meters");
        }

        char nameFirstChar = 'K';
        if(nameFirstChar == 'M') {
            System.out.println("Person's name starts with letter M");
        } else if(nameFirstChar == 'I') {
            System.out.println("Person's name starts with letter I");
        } else {
            System.out.println("Person's name starts with letter other than M and I");
        }
    }
}