public class Field {
    public void start(){
        Player player = new Player();
        Computer computer = new Computer();
        int quantityOfTries = 0;

        do {
            player.getNumber();

            int bulls = computer.getFourNumbers().bullSolver(player.fourNumbers);
            int cows = computer.getFourNumbers().cowSolver(player.fourNumbers);
            quantityOfTries++;

            if (bulls == 4) {
                System.out.println("Bulls: 4");
                System.out.println("You win using " + quantityOfTries + " try!");
                return;
            }
            else {
                System.out.println("Input number again, please");
                System.out.println("Bulls: " + bulls + " Cows: " + cows + " (" + quantityOfTries + " try)");
            }
        } while (true);
    }
}
