<?php

declare(strict_types=1);

namespace swkberlin;

class Board
{
    private int $width;
    private int $height;
    private array $grid;

    public function __construct(int $width, int $height)
    {
        $this->width = $width;
        $this->height = $height;
        $this->grid = array_fill(0, $height, array_fill(0, $width, ' '));
    }

    public function isWithinBounds(Position $position): bool
    {
        return $position->getX() >= 0 && $position->getX() < $this->width &&
               $position->getY() >= 0 && $position->getY() < $this->height;
    }

    public function getWidth(): int
    {
        return $this->width;
    }

    public function getHeight(): int
    {
        return $this->height;
    }

    public function getGrid(): array
    {
        return $this->grid;
    }

    public function setGridValue(Position $position, string $value): void
    {
        $this->grid[$position->getY()][$position->getX()] = $value;
    }

    public function getGridValue(Position $position): string
    {
        return $this->grid[$position->getY()][$position->getX()];
    }
}