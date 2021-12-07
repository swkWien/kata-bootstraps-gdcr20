import {Direction} from './direction'
import {Game} from "./game";

describe('games', () => {
    it('should be running', () => {
        const game = new Game();

        expect(game.isRunning()).toBe(true)
    })
    it('should not be running if gameOver was called on it', () => {
        const game = new Game();
        game.gameOver();
        expect(game.isRunning()).toBe(false)
    })
})

describe('snake', () => {
    it('should have direction', () => {
        const snake = new Snake();

        expect(snake.direction).toBe(Direction.left);
    })
})
