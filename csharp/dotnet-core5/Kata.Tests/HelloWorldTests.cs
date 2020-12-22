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
        [InlineData(false, 0, false)]
        [InlineData(false, 1, false)]
        [InlineData(false, 2, false)]
        [InlineData(false, 3, true)]
        [InlineData(false, 4, false)]
        [InlineData(false, 5, false)]
        [InlineData(false, 6, false)]
        [InlineData(false, 7, false)]
        [InlineData(false, 8, false)]

        [InlineData(true, 0, false)]
        [InlineData(true, 1, false)]
        [InlineData(true, 2, true)]
        [InlineData(true, 3, true)]
        [InlineData(true, 4, false)]
        [InlineData(true, 5, false)]
        [InlineData(true, 6, false)]
        [InlineData(true, 7, false)]
        [InlineData(true, 8, false)]
        public void Cell_rules(bool isAlive, int numberOfLivingNeighbours, bool expected)
        {
            var result = DoesCellSurvive(isAlive, numberOfLivingNeighbours);
            result.Should().Be(expected);
        }

        private bool DoesCellSurvive(bool isAlive, int numberOfLivingNeighbours)
        {
            var tuples = new List<(bool Alive, int Num, bool Expected)>
            {
                new (false, 0, false),
                new (false, 1, false),
                new (false, 2, false),
                new (false, 3, true),
                new (false, 4, false),
                new (false, 5, false),
                new (false, 6, false),
                new (false, 7, false),
                new (false, 8, false),

                new (true, 0, false),
                new (true, 1, false),
                new (true, 2, true),
                new (true, 3, true),
                new (true, 4, false),
                new (true, 5, false),
                new (true, 6, false),
                new (true, 7, false),
                new (true, 8, false),
            };

            return tuples
                .First(x => x.Num == numberOfLivingNeighbours && x.Alive == isAlive)
                .Expected;
        }
    }
}
