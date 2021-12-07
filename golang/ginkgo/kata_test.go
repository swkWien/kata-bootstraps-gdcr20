package main

import (
	"fmt"
	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
)

var _ = Describe("Something", func() {
	It("does something", func() {
		Expect(SayHello()).To(Equal("Hello"))
	})

	It("passing", func() {
		Expect(42).To(Equal(42))
	})
})

var _ = Describe("SnakePart", func() {
	It("get size", func() {
		snake := SnakePart{Direction: LEFT, Next: nil}
		snakeLen := snake.Len()

		Expect(snakeLen).To(Equal(1))
	})

	It("get size", func() {
		snake := SnakePart{Direction: LEFT, Next: &SnakePart{Direction: LEFT, Next: nil}}
		snakeLen := snake.Len()

		Expect(snakeLen).To(Equal(2))
	})

	It("is head?", func() {
		snake := SnakePart{Direction: LEFT, Next: &SnakePart{Direction: LEFT, Next: nil}}

		Expect(snake.IsHead(nil)).To(Equal(true))
	})

	It("is head?", func() {
		tail := SnakePart{Direction: LEFT, Next: nil}
		snake := SnakePart{Direction: LEFT, Next: &tail}

		fmt.Println(snake)

		Expect(tail.IsHead(&snake)).To(Equal(false))
	})

	It("are snakes equals?", func() {
		tail := SnakePart{Direction: LEFT, Next: nil}
		snake := SnakePart{Direction: LEFT, Next: &tail}

		tail2 := SnakePart{Direction: LEFT, Next: nil}
		snake2 := SnakePart{Direction: LEFT, Next: &tail2}

		fmt.Println(snake)

		Expect(snake2.IsHead(&snake)).To(Equal(true))
	})
})
