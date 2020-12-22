<?php


namespace swkberlin\gol;


class Grid
{
	private $width = 0;
	private $height = 0;

	public function __construct($width, $height)
	{
		$this->width = $width;
		$this->height = $height;

	}

	public function getBoard()
	{
		$board = [];
		for ($this->height; $this->height < 10; $this->height++) {
			for ($this->width; $this->width < 10; $this->width++) {
				$board[$this->height][$this->width] = NULL;
			}
		}
		return $board;
	}

}