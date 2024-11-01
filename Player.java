import java.util.Scanner;
import java.util.Random;

class Player {
    private int choice;

    public void setPcChoice() {
        Scanner askChoice = new Scanner(System.in);
        boolean validChoice = false;

        while (!validChoice) {
            System.out.print("Please choose your fighter now (ROCK, PAPER, SCISSORS): ");
            String pcChoice = askChoice.nextLine().toUpperCase();

            for (int i = 0; i < Config.CHOICES.length; i++) {
                if (pcChoice.equals(Config.CHOICES[i])) {
                    this.choice = i;
                    validChoice = true;
                    break;
                }
            }
            if (!validChoice) {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public void setNpcChoice() {
        Random rand = new Random();
        this.choice = rand.nextInt(Config.CHOICES.length); 
    }

    public int getChoice() {
        return this.choice;
    }
}
