<?php

declare(strict_types=1);

namespace Tests;

use PHPUnit\Framework\TestCase;
use swkberlin\Position;
use swkberlin\Snake;

class SnakeTest extends TestCase
{
    public function testInitialState(): void
    {
        $snake = new Snake(new Position(5, 5));
        $this->assertCount(1, $snake->getBody());
        $this->assertEquals('UP', $snake->getDirection());
    }

    public function testSetDirectionFromAscii(): void
    {
        $snake = new Snake(new Position(5, 5));
        $snake->setDirectionFromAscii('^');
        $this->assertEquals('UP', $snake->getDirection());
        $snake->setDirectionFromAscii('v');
        $this->assertEquals('DOWN', $snake->getDirection());
        $snake->setDirectionFromAscii('<');
        $this->assertEquals('LEFT', $snake->getDirection());
        $snake->setDirectionFromAscii('>');
        $this->assertEquals('RIGHT', $snake->getDirection());
    }

    public function testMove(): void
    {
        $snake = new Snake(new Position(5, 5));
        $snake->move();
        $this->assertCount(1, $snake->getBody());
        $this->assertEquals(5, $snake->getBody()[0]->getX());
        $this->assertEquals(4, $snake->getBody()[0]->getY());
    }

    public function testGrow(): void
    {
        $snake = new Snake(new Position(5, 5));
        $snake->grow();
        $this->assertCount(2, $snake->getBody());
    }
}