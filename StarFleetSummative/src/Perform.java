public class Perform
{
    private String city;
    private int price;
    private int minTuning;

    Perform()
    {
        city = "Mumbai";
        price = 15;
        minTuning = 20;
    }

    Perform(String _city, int _price, int _minTuning)
    {
        city = _city;
        price = _price;
        minTuning = _minTuning;
    }

    public void Print2()
    {
        System.out.println("City:"+city+", Reward:"+price+"$, Minimum Tuning Required:"+minTuning+"%");
    }
}
