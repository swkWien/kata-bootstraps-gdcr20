using FluentAssertions;
using Xunit;

namespace Kata.Tests
{
    public class HelloWorldTests
    {   
        [Theory]
        [InlineData(false, 0, false)]
        [InlineData(false, 1, false)]
        [InlineData(false, 2, false)]
        [InlineData(false, 3, true)]
        [InlineData(false, 4, false)]
        [InlineData(false, 5, false)]
        [InlineData(false, 6, false)]
        [InlineData(false, 7, false)]
        [InlineData(false, 8, false)]

        [InlineData(true, 0, false)]
        [InlineData(true, 1, false)]
        [InlineData(true, 2, true)]
        [InlineData(true, 3, true)]
        [InlineData(true, 4, false)]
        [InlineData(true, 5, false)]
        [InlineData(true, 6, false)]
        [InlineData(true, 7, false)]
        [InlineData(true, 8, false)]
        public void Cell_rules(bool isAlive, int numberOfLivingNeighbours, bool expected) =>
            HelloWorld.DoesCellSurvive(isAlive, numberOfLivingNeighbours)
                .Should().Be(expected);
    }
}
