<?php

declare(strict_types=1);

namespace swkberlin;

class Snake
{
    private array $body;
    private string $direction;

    public function __construct(Position $startPosition)
    {
        $this->body = [$startPosition];
        $this->direction = 'UP';
    }

    public function getBody(): array
    {
        return $this->body;
    }

    public function getDirection(): string
    {
        return $this->direction;
    }

    public function setDirectionFromAscii(string $ascii): void
    {
        switch ($ascii) {
            case '^':
                $this->direction = 'UP';
                break;
            case 'v':
                $this->direction = 'DOWN';
                break;
            case '<':
                $this->direction = 'LEFT';
                break;
            case '>':
                $this->direction = 'RIGHT';
                break;
        }
    }

    public function move(): void
    {
        $head = $this->body[0];
        switch ($this->direction) {
            case 'UP':
                array_unshift($this->body, new Position($head->getX(), $head->getY() - 1));
                break;
            case 'DOWN':
                array_unshift($this->body, new Position($head->getX(), $head->getY() + 1));
                break;
            case 'LEFT':
                array_unshift($this->body, new Position($head->getX() - 1, $head->getY()));
                break;
            case 'RIGHT':
                array_unshift($this->body, new Position($head->getX() + 1, $head->getY()));
                break;
        }
        array_pop($this->body);
    }

    public function grow(): void
    {
        $tail = end($this->body);
        array_push($this->body, new Position($tail->getX(), $tail->getY()));
    }
}