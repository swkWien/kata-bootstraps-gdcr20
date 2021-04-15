<?php

namespace Tests;

use PHPUnit\Framework\TestCase;
use swkberlin\Board;

require __DIR__ . '/../vendor/autoload.php';

class BoardTest extends TestCase
{
/*    public function testDummy()
    {
        $board = new Board();
        $result = $board->test();

        $this->assertEquals(5, $result);
    }*/

    public function board_should_have_x_and_y_parameters_as_integer_on_initialization()
    {
				$board = new Board($x, $y);
				$newBoard = $board->initializeBoard();


        $this->assertIsArray($newBoard);
    }

}
