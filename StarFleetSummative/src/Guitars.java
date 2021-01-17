public class Guitars
{
    private String Name;
    private String Type;
    private int Tuning = 100;
    private int Cost;
    private String Color;

    Guitars()
    {
        Type = "Acoustic";
        Name = "-Basic Guitar";
        Cost = 000;
        Color = "Brown";

    }

    Guitars(String _Name, String _Type, int _Cost, int _Tuning, String _Color)
    {
        Name = _Name;
        Type = _Type;
        Cost = _Cost;
        Tuning = _Tuning;
        Color = _Color;

    }

    public void Print()
    {
        System.out.println(Name + ", Type:" + Type + ", Color:" + Color + ", Tuning:" + Tuning + "/100%, Cost:" + Cost + "$");

    }



    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getTuning() {
        return Tuning;
    }

    public void setTuning(int Tuning) {
        this.Tuning = Tuning;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int Cost) {
        this.Cost = Cost;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

}
