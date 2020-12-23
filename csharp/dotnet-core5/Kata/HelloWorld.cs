using System.Collections.Generic;
using System.Linq;

namespace Kata
{
    public class HelloWorld
    {
        public static bool DoesCellSurvive(bool isAlive, int numberOfLivingNeighbours)
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
