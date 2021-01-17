import java.util.Scanner;

public class Player
{
    private Guitars[] Inventory;
    private int Money;
    Guitars guitar = new Guitars();
    Scanner Input1 = new Scanner(System.in);


    public Player()
    {
        Inventory = new Guitars[5];
        Money = 100;
    }

    public void Display()
    {
        for (int i = 0; i < Inventory.length; i++)
        {
            if(Inventory[i] != null)
            {
                Inventory[i].Print();
            }
        }
    }

    public void Shop(Guitars g)
    {
        if (Money >= g.getCost())
        {
            for (int i = 0; i < Inventory.length; i++)
            {
                if (Inventory[i] == null)
                {
                    Inventory[i] = g;
                    System.out.println("Guitar Purchased");
                    Money = Money - g.getCost();
                    System.out.println("Balance:"+Money+"$");
                    break;
                }
            }
        }
        else
        {
            System.out.println("You have insufficient funds for this transaction");
            System.out.println("Try performing to earn money");
        }
    }

    public void Tune() {
        for (int i = 0; i < Inventory.length; i++) {
            if (Inventory[i] != null) {
                System.out.println(Inventory[i].getName() + ", Tuning: " + Inventory[i].getTuning() + "/100%");
            }
        }
        System.out.println("Tunning Cost: 20$");
        System.out.println("Choose a Guitar to Tune(input a number)");
        int input = Input1.nextInt();

        int rinput = input - 1;

        if (Inventory[rinput].getTuning() != 100) {
            if (rinput <= Inventory.length && Inventory[rinput] != null) {
                Inventory[rinput].setTuning(100);
                Money = Money - 20;
                System.out.println("Your Guitar is now fully tuned!!");
                System.out.println("Balance:" + Money + "$");
            } else {
                System.out.println("You don't have any guitars in that slot!");
            }
        } else {
            System.out.println("Your Guitar is already at a 100% tuning");
        }
    }
    public void Concert ()
    {
        System.out.println("Which City do you want to perform in?(input a number)");
        int input3 = Input1.nextInt();

        System.out.println("Which Guitar will you take? (input a number)");
        int input2 = Input1.nextInt();
        int ainput = input2 - 1;

        if (ainput <= Inventory.length && Inventory[ainput] != null)
            {
                if (Inventory[ainput].getTuning() != 0)
                {
                    int x = 0;
                    int y = 0;
                    if (input3 == 1) {
                        x = 15;
                        y = 20;
                    }
                    if (input3 == 2) {
                        x = 45;
                        y = 60;
                    }
                    if (input3 == 3) {
                        x = 75;
                        y = 80;
                    }

                    if (Inventory[ainput].getTuning() > y)
                    {
                        Money = Money + x;
                        System.out.println("your tour was a success!!!");
                        System.out.println("You made " + x + "$");
                        System.out.println("Balance: " + Money +"$");
                        Inventory[ainput].setTuning(Inventory[ainput].getTuning() - 20);
                        System.out.println("Your guitar tuning is now at: "+Inventory[ainput].getTuning() +"%");
                    }
                    else if (Inventory[ainput].getTuning() < y)
                    {
                        System.out.println("You did badly in the concert!! Maybe your guitar was not tuned");
                        System.out.println("You lost 30$ for your poor performance");
                        Money = Money - 30;
                        System.out.println("Balance:"+Money+"$");

                    }
                }
                else
                    {
                    System.out.println("You Need to Tune this Guitar before you perform");
                }
            }
        else {
                System.out.println("You don't have any guitars in that slot!");
            }


    }

    public void Sell()
    {
        System.out.println("All guitars are sold at a standard price of 50$");
        System.out.println("Which Guitar would you like to sell");
        int input5 = Input1.nextInt();
        int dinput = input5 - 1;

        if (Inventory[dinput] != null)
        {
            Inventory[dinput] = null;
            Money = Money + 50;
            System.out.println("Balance: "+Money+"$");
        }

    }



    public int getMoney()
    {
        return Money;
    }
    public void setMoney(int _Money)
    {
        Money = _Money;
    }

    public Guitars[] getInventory() {
        return Inventory;
    }

    public void setInventory(Guitars[] _Inventory) {
        Inventory = _Inventory;
    }
}