using System;
using System.Collections.Generic;
using System.Linq;
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
        public void Get_correct_number_of_living_neighbours(int numberOfLivingNeighbours, bool expected)
        {
            var cell = new Cell(true);
            for (var i = 0; i < numberOfLivingNeighbours; i++)
            {
                cell.AddNeighbour(new Cell(true));
            }

            var list = Enumerable
                .Range(0, numberOfLivingNeighbours)
                .ToList();
            
            var result = list.ForEach(y => cell.AddNeighbour(new Cell(true)));

            int[] numbers = { 1, 2, 3 };
            numbers.ToList().ForEach(n => Console.WriteLine(n));
            
            cell.ShouldSurvive().Should().Be(expected);
        }
    }

    public class Cell
    {
        public bool IsAlive { get; } = false;
        
        private readonly List<Cell> _neighbouringCells  = new();

        public Cell(bool isAlive)
        {
            IsAlive = isAlive;
        }

        public void AddNeighbour(Cell cell)
        {
            _neighbouringCells.Add(cell);            
        }

        public bool ShouldSurvive()
        {
            var neighbouringCellsCount = _neighbouringCells.Count(x => x.IsAlive);
            return neighbouringCellsCount >= 2 && neighbouringCellsCount < 4;
        }
    }
}
