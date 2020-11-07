using FluentAssertions;
using Xunit;

namespace Kata.Tests
{
    public class HelloWorldTests
    {
        [Fact]
        public void FindNeighbors_NoLivingNeighbors_Zero()
        {
            // Arrange
            var seed = new Seed();
            var world = new World(seed);
            var cell = world.GetCell((0,0));
            // Act
            var actual = world.FindLivingNeighborsOf(cell);
            // Assert
            actual.Should().Be(0);
        }

        public void FindNeighbors_OneLivingNeighbors_One()
        {
            // Arrange
            var seed = new Seed().living((1,1)) // value tuples c# 7
            var world = new World(seed);
            var cell = world.GetCell((0,0));
            // Act
            var actual = world.FindLivingNeighborsOf(cell);
            // Assert
            actual.Should().Be(1);
        }
    }

    class Cell
    {
    }

    class World
    {
        internal int FindLivingNeighborsOf(Cell cell)
        {
            return 0;
        }

        internal Cell GetCell((int x, int y))
        {
            return new Cell();
        }
    }

    class Seed
    {
        void living(params (int x, int y)[] livingCoordinates)
        {

        }
    }
}

// dotnet --list-sdks

