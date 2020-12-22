using FluentAssertions;
using Xunit;

namespace Kata.Tests
{
    public class HelloWorldTests
    {   
        [Fact]
        public void SayHelloWorld_ShouldReturnHelloWorld()
        {
            // Arrange
            var sut = new HelloWorld();
            // Act
            var actual = sut.SayHelloWorld();
            // Assert
            actual.Should().Be("Oh oh...");
        }

        [Fact]
        public void Cell_survives_when_it_has_2_living_neighbours()
        {
            Cell cell = new Cell();
            int numberOfLivingNeighbours = 2;
            var result = CellSurvives(cell, numberOfLivingNeighbours);
            result.Should().BeTrue();
        }

        private bool CellSurvives(Cell cell, in int numberOfLivingNeighbours)
        {
            throw new System.NotImplementedException();
        }
    }

    public class Cell
    {
    }
}
