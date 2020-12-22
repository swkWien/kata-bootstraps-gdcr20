<?php

namespace Tests;

use PHPUnit\Framework\TestCase;
use swkberlin\Kata;

require __DIR__ . '/../vendor/autoload.php';

class CellTest extends TestCase
{
    public function testMatrixIsAnArray()
	{
		$matrix = $this->generateMatrix(4, 4);
		$this->assertIsArray($matrix);
	}

	public function testMatrixIsMultidimensionalArray()
	{
		$matrix = $this->generateMatrix(4, 4);
		foreach($matrix as $val) {
			$this->assertIsArray($val);
		}
	}

//	public function testCellWithTwoNeighbors()
//    {
//    	$matrix = $this->generateMatrix(4, 4);
//    	$this->assertIsArray($matrix);
//
//    }

    private function generateMatrix($width, $height) {
		$row = [];
		for($i = 0; $i < $width; $i++) {
			$row[] = $this->generateGrid($height);
		}
		return $row;
	}

    private function generateGrid($height, $grid = []) {
		for($i = 0; $i < $height; $i++) {
			$grid[] = NULL;
		}
		return $grid;
	}



}
