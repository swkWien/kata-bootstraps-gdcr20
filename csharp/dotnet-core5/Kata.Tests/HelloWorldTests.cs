using FluentAssertions;
using Xunit;

namespace Kata.Tests
{
    public class HelloWorldTests
    {   
        [Theory]
        [InlineData(0, false)]
        [InlineData(1, false)]
        [InlineData(2, true)]
        [InlineData(3, true)]
        [InlineData(4, false)]
        [InlineData(5, false)]
        [InlineData(6, false)]
        [InlineData(7, false)]
        [InlineData(8, false)]
        public void Cell_behaves_according_to_rules(int numberOfLivingNeighbours, bool expected) 
            => CellSurvives(numberOfLivingNeighbours).Should().Be(expected);

        private bool CellSurvives(int numberOfLivingNeighbours) 
            => numberOfLivingNeighbours >= 2 && numberOfLivingNeighbours <= 3;

        [Fact]
        public void A_board_can_be_initialized_with_size_5x5() 
            => new Board(5, 5).ToString().Should().Be("5 x 5");

        [Fact]
        public void Bring_a_cell_to_life()
        {
            var board = new Board(5, 5);
            board.BringCellToLife(1, 1);
        }
    }

    public class Board
    {
        private int X { get; }
        private int Y { get; }

        public Board(int x, int y)
        {
            X = x;
            Y = y;
        }

        public override string ToString()
        {
            return $"{X} x {Y}";
        }

        public void BringCellToLife(int x, int y)
        {
            throw new System.NotImplementedException();
        }
    }
}
