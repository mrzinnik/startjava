public class MyFirstGame {
    
    public static void main(String[] args) {
        int computerNumber = 100;
        int playerNumber = 50;

        while(true) {
            System.out.println(playerNumber);
            if(playerNumber == computerNumber) {
                System.out.println("Поздравляю, число угадано!");
                break;
            }
            if(playerNumber > computerNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                playerNumber--;
            }
            if(playerNumber < computerNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                playerNumber++;
            }
        }
    }
}