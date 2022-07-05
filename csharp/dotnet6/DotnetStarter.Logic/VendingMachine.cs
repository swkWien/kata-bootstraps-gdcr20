namespace DotnetStarter.Logic.Tests;

public class VendingMachine
{
    public VendingMachine(IDisplay display)
    {
        display.NewMessage("INSERT COIN");
    }

    public int Money { get; set; }
}