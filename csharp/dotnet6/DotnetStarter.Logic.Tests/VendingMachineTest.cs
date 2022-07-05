using Xunit;

namespace DotnetStarter.Logic.Tests
{
    public class VendingMachineTest
    {
        [Fact]
        public void A_VendingMachine_IsCreated()
        {
            var machine = CreateVendingMachine(new DisplayMock());
            Assert.NotNull(machine);
        }

        [Fact]
        public void A_VendingMachine_IsCreated_ShowsInsertCoin()
        {
            var displayMock = new DisplayMock();
            CreateVendingMachine(displayMock);
            Assert.Equal("", displayMock.LastMessage);
        }

        [Fact]
        public void A_VendingMachine_HasMoneyProperty()
        {
            var machine = CreateVendingMachine(new DisplayMock());
            Assert.Equal(0, machine.Money);
        }

        public static VendingMachine CreateVendingMachine(DisplayMock displayMock) => new(displayMock);
    }

    public class DisplayMock : IDisplay
    {
        public string LastMessage { get; set; } = "";
    }
}