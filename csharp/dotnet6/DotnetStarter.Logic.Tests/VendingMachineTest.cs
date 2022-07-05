using Xunit;

namespace DotnetStarter.Logic.Tests
{
    public class VendingMachineTest
    {
        [Fact]
        public void A_VendingMachine_IsCreated()
        {
            var machine = new VendingMachine();
            Assert.NotNull(machine);
        }
    }
}