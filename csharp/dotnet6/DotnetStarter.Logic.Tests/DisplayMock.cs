namespace DotnetStarter.Logic.Tests;

public class DisplayMock : IDisplay
{
    public string LastMessage { get; private set; } = "";

    public void NewMessage(string message)
    {
        LastMessage = message;
    }
}