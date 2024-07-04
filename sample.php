<?php

class Sample {
    public function hello() {
        $this->add(1, 2);
        return "Hello, World!";
    }

    public function add($a, $b) {
        return $a + $b;
    }
}
