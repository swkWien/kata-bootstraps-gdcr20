using FluentAssertions;
using Xunit;

namespace Kata.Tests
{
    public class HelloWorldTests
    {
        [Fact]
        public void Cell_survives_when_it_has_2_living_neighbours()
        {
            Cell cell = new Cell();
            int numberOfLivingNeighbours = 2;
            var result = CellSurvives(cell, numberOfLivingNeighbours);
            result.Should().BeTrue();
        }

        [Fact]
        public void Cell_dies_when_it_has_1_living_neighbour()
        {
            Cell cell = new Cell();
            int numberOfLivingNeighbours = 1;
            var result = CellSurvives(cell, numberOfLivingNeighbours);
            result.Should().BeFalse("Should die with less than 2 living neighbours");
        }

        private bool CellSurvives(Cell cell, in int numberOfLivingNeighbours)
        {
            return true;
        }
    }

    public class Cell
    {
    }
}
