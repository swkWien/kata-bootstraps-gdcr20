using FluentAssertions;
using Xunit;

namespace Kata.Tests
{
    public class HelloWorldTests
    {
        [Fact]
        public void Cell_survives_when_it_has_2_living_neighbours()
        {
            var cell = new Cell();
            var numberOfLivingNeighbours = 2;
            var result = CellSurvives(cell, numberOfLivingNeighbours);
            result.Should().BeTrue();
        }

        [Fact]
        public void Cell_dies_when_it_has_1_living_neighbour()
        {
            var cell = new Cell();
            var numberOfLivingNeighbours = 1;
            var result = CellSurvives(cell, numberOfLivingNeighbours);
            result.Should().BeFalse("Should die with less than 2 living neighbours (1)");
        }

        [Fact]
        public void Cell_dies_when_no_living_neighbours_are_present()
        {
            var cell = new Cell();
            var numberOfLivingNeighbours = 0;
            var result = CellSurvives(cell, numberOfLivingNeighbours);
            result.Should().BeFalse("Should die with less than 2 living neighbours (0)");
        }

        private bool CellSurvives(Cell cell, in int numberOfLivingNeighbours)
        {
            return numberOfLivingNeighbours != 1;
        }
    }

    public class Cell
    {
    }
}
