using Xunit;

namespace DotnetStarter.Logic.Tests
{
    public class VendingMachineTest
    {
        [Fact]
        public void A_VendingMachine_IsCreated()
        {
            var machine = CreateVendingMachine();
            Assert.NotNull(machine);
        }

        [Fact]
        public void A_VendingMachine_HasMoneyProperty()
        {
            var machine = CreateVendingMachine();
            Assert.Equal(0, machine.Money);
        }

        public static VendingMachine CreateVendingMachine() => new();
    }
}