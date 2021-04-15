<?php

namespace Tests;

use PHPUnit\Framework\TestCase;
use swkberlin\Kata;

require __DIR__ . '/../vendor/autoload.php';

class BoardTest extends TestCase
{


    public function testDummy()
    {
        $kata = new Kata();
        $this->assertTrue(false);
    }

    public function testNotFailing()
    {
        $this->assertTrue(true);
    }

}
