<?php

namespace Tests;

use PHPUnit\Framework\TestCase;
use swkberlin\gol\Grid;

class GridTest extends TestCase
{
    public function testSomething()
    {
        $width = 10;
        $height = 10;
        $grid = new Grid($width, $height);
        $expected = $this->getBoard($height, $width);

        $board = $grid->getBoard();

        $this->assertEquals($expected, $board);
    }

    private function getBoard($height, $width)
    {
        $board = [];
        for ($height = 0; $height < 10; $height++) {
            for ($width = 0; $width < 10; $width++) {
                $board[$height][$width] = NULL;
            }
        }
        return $board;
    }
}
