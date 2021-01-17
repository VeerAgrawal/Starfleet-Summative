import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Guitars g1 = new Guitars();
        Guitars g2 = new Guitars("-Amateur Guitar", "Acoustic", 150, 100, "Black");
        Guitars g3 = new Guitars("-Intermediate Guitar", "Electro-acoustic", 200, 100, "Blue");
        Guitars g4 = new Guitars("-Advanced Guitar", "Electric", 250, 100, "White");
        Guitars g5 = new Guitars("-Expert Guitar", "Electric", 300, 100, "Red");

        Perform m1 = new Perform();
        Perform m2 = new Perform("Tokyo", 45, 60);
        Perform m3 = new Perform("Las vegas", 75, 80);

        Player player = new Player();

        Scanner Input = new Scanner(System.in);
        int input;

        do
            {
            System.out.println("1)Display all guitars  2)Inventory  3)Shop  4)Perform  5)Tune  6)Sell  7)Exit");
            System.out.println("Where do you want to go? (input a number):");
            input = Input.nextInt();
            switch (input) {
                case 1:
                    g1.Print();
                    g2.Print();
                    g3.Print();
                    g4.Print();
                    g5.Print();
                    break;
                case 2:
                    player.Display();
                    break;

                case 3:
                    g1.Print();
                    g2.Print();
                    g3.Print();
                    g4.Print();
                    g5.Print();
                    System.out.println("Balance:" + player.getMoney() + "$");
                    System.out.println("Which Guitar do you want to buy?(input number)");
                    int buy = Input.nextInt();

                    if (buy == 1) {
                        player.Shop(g1);
                    } else if (buy == 2) {
                        player.Shop(g2);
                    } else if (buy == 3) {
                        player.Shop(g3);
                    } else if (buy == 4) {
                        player.Shop(g4);
                    } else if (buy == 5) {
                        player.Shop(g5);
                    }
                    break;

                case 4:
                    m1.Print2();
                    m2.Print2();
                    m3.Print2();
                    player.Display();
                    player.Concert();

                    break;

                case 5:
                    player.Tune();
                    break;

                case 6:
                    player.Display();
                    player.Sell();

                    break;

                default:


            }
        }
        while (input < 7);

    }
}
