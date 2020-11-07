using FluentAssertions;
using Xunit;

namespace Kata.Tests
{
    public class HelloWorldTests
    {
        [Fact]
        public void SingleCellUniverse_CellIsDead()
        {
            // Arrange
            var universe = new Universe(1, 1);

            // Act
            var cell = universe.GetCell(1, 1);

            // Assert
            cell.IsAlive.Should().BeFalse();
        }

        [Fact]
        public void LivingCell_NoNeightbors_DiesNextIteration()
        {
            // Arrange
            var universe = new Universe(1, 1);

            // Act

            // Assert

        }
    }
}
