using Xunit;

namespace DotnetStarter.Logic.Tests
{
    public class HelloWorldTest
    {
        [Fact]
        public void A_VendingMachine_IsCreated()
        {
            var machine = new VendingMachine();
            Assert.NotNull(machine);
        }
    }

    internal class VendingMachine
    {
        public VendingMachine()
        {
        }
    }
}