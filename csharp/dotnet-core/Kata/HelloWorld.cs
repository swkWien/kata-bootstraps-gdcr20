using System;

namespace Kata
{
    public class HelloWorld
    {
    }

    public class Universe
    {
        public Universe(int width, int height)
        {

        }

        public Cell GetCell(int x, int y)
        {
            return new Cell();
        }
    }

    public class Cell
    {
        public bool IsAlive { get; }

        public Cell()
        {
        }
    }
}
