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

        [Fact]
        public void FindNeighbors_OneLivingNeighbors_One()
        {
            // Arrange
            var seed = new Seed().Living((1, 1)); // value tuples c# 7
            var world = new World(seed);
            var cell = world.GetCell((0,0));
            // Act
            var actual = world.FindLivingNeighborsOf(cell);
            // Assert
            actual.Should().Be(1);
        }
    }

    internal class Cell
    {
    }

    internal class World
    {
        public World(Seed seed)
        {
        }

        internal int FindLivingNeighborsOf(Cell cell)
        {
            return 0;
        }

        internal Cell GetCell((int x, int y) location)
        {
            return new Cell();
        }
    }

    internal class Seed
    {
        internal Seed Living(params (int x, int y)[] livingCoordinates)
        {
            return this;
        }
    }
}

// dotnet --list-sdks

