using FluentAssertions;
using Xunit;

namespace Kata.Tests
{
    public class HelloWorldTests
    {
        [Fact]
        public void FindNeighbors_NoNeighbors_Zero()
        {
            // Arrange
            var world = new World();
            var cell = world.GetCell();
            // Act
            var actual = world.FindLivingNeighborsOf(cell);
            // Asseert
            actual.Should().Be(0);
        }
    }

    class Cell
    {
    }

    class World
    {
        internal int FindLivingNeighborsOf(Cell cell)
        {
            throw new System.NotImplementedException();
        }

        internal Cell GetCell()
        {
            return new Cell();
        }
    }
}
