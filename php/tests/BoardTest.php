<?php

declare(strict_types=1);

namespace Tests;

use PHPUnit\Framework\TestCase;
use swkberlin\Board;
use swkberlin\Position;

class BoardTest extends TestCase
{
    public function testIsWithinBounds(): void
    {
        $board = new Board(10, 10);
        $this->assertTrue($board->isWithinBounds(new Position(5, 5)));
        $board = new Board(10, 10);
        $position = new Position(5, 5);
        $this->assertFalse($board->isWithinBounds(new Position(10, 10)));
    }

    public function testSetAndGetGridValue(): void
    {
        $board = new Board(10, 10);
        $position = new Position(5, 5);
        $board->setGridValue($position, 'S');
        $this->assertEquals('S', $board->getGridValue($position));
    }
}