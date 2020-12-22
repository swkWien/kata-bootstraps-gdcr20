<?php

namespace Tests;

use PHPUnit\Framework\TestCase;
use swkberlin\Kata;

require __DIR__ . '/../vendor/autoload.php';

class MatrixTest extends TestCase
{


    public function testEmptyMatrixDimension()
    {
    	$h = 5;
    	$w = 5;
    	$matrix = $this->generateMatrix($h, $w);
        $this->assertEquals($h * $w, count($matrix));
    }

	public function testGameInititaliazion()
	{
		$h = 5;
		$w = 5;
		$matrix = $this->generateMatrix($h, $w);
		$gameplay = $this->initGame($matrix);
		$this->assertNotNull($gameplay[0]);
	}

	public function testIsCellAlive()
	{
		$h = 5;
		$w = 5;
		$matrix = $this->generateMatrix($h, $w);
		$gameplay = $this->initGame($matrix);
		$cell = $this->isCellAlive($gameplay);

		$this->assertEquals(1, $cell);
	}

    private function generateMatrix($h, $w)
	{
		$returnArray = [];
		for($i = 0; $i < $h * $w; $i++){
			array_push($returnArray, rand(0, 1));
		}
		return $returnArray;
	}

	private function initGame($matrix)
	{
		$matrix[0] = 1;

		return $matrix;
	}

	private function isCellAlive($matrix)
	{
		$key = array_search(1, $matrix);

		return $matrix[$key];
	}
}
