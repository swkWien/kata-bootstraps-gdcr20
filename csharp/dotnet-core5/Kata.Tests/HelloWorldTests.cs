using System.Collections.Generic;
using FluentAssertions;
using Xunit;

namespace Kata.Tests
{
    public class HelloWorldTests
    {   

        [Theory]
        [InlineData(0, 5, 5, false)]
        [InlineData(1, 5, 5, false)]
        [InlineData(2, 5, 5, true)]
        [InlineData(3, 5, 5, true)]
        [InlineData(4, 5, 5, false)]
        [InlineData(5, 5, 5, false)]
        [InlineData(6, 5, 5, false)]
        [InlineData(7, 5, 5, false)]
        [InlineData(8, 5, 5, false)]
        public void Is_cell_alive_returns_expected(int numberOfLivingNeighbours, int x, int y, bool expected) 
            => new Cell(new Position(x, y), numberOfLivingNeighbours)
                .IsAlive().Should().Be(expected);

        [Theory]
        [InlineData(0, 0, 0, true)]
        public void Is_cell_in_Corner(int numberOfLivingNeighbours, int x, int y, bool expected)
        {
            // var grid = new Grid(new List<Cell>{ });
            //
            // var result = grid.IsInCorner(cell);
            // new Cell(new Position(x, y), numberOfLivingNeighbours)
            //     .IsInCorner().Should().Be(expected);
        }
    }

    class Grid
    {
        public Grid(List<Cell> cells)
        {
            Cells = cells;
        }

        public int XWidth { get; set; }
        public int YWidth { get; set; }
        public List<Cell> Cells { get; }

        public bool IsInCorner(Cell cell)
        {
            return true;
        }
    }

    class Position
    {
        public Position(in int x, in int y)
        {
            X = x;
            Y = y;
        }

        public int X { get; set; }
        public int Y { get; set; }
    }
    
    class Cell
    {
        private readonly Position _position;
        public int NumberOfLivingNeighbours { get; }

        public Cell(Position position, int numberOfLivingNeighbours)
        {
            _position = position;
            NumberOfLivingNeighbours = numberOfLivingNeighbours;
        }

        public bool IsAlive()
        {
            return NumberOfLivingNeighbours == 3 || NumberOfLivingNeighbours == 2;
        }
    }
}
