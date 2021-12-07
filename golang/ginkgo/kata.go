package main

func SayHello() string {
	return "Hello"
}

const (
	LEFT  = 0
	RIGHT = 1
	DOWN  = 2
	UP    = 3
)

type SnakePart struct {
	Direction int
	Next      *SnakePart
}

func (s *SnakePart) Len() int {
	if s == nil {
		return 0
	}

	return s.Next.Len() + 1
}

func (s *SnakePart) IsHead(snake *SnakePart) bool {
	if snake == nil {
		return true
	}

	return *s == *snake
}
