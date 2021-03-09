package animalkingdom;


abstract class AbstractAnimal 
{
    private static int uniqueNumber = 0;
    private int id;
    private String name;
    private int yearDiscovered;

    public AbstractAnimal(String name, int yearDiscovered)
    {
        this.id = uniqueNumber++;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public String consumeFood()
    {
        return "consuming food";
    }

    abstract String move();
    abstract String breath();
    abstract String reproduce();

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getYearDiscovered()
    {
        return yearDiscovered;
    }

    // public String move(String action)
    // {
    //     return name + " moves by "+ action;
    // }

    // public String breath(String action)
    // {
    //     return name + " breaths by " + action;
    // }

    // public String reproduce(String action)
    // {
    //     return name + " reproduces "+ action;
    // }

    @Override
    public String toString()
    {
        return "Animals: {id="+id+", name="+name+", yearNamed= "+yearDiscovered+"}"; 
    }
}
