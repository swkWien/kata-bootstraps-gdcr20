import {GameOfSnakeOrMaybeTron} from './GameOfSnakeOrMaybeTron'

describe('Game of Snake', () => {
    it('should return position of snake', () => {
        const gameOfSnakeOrMaybeTron = new GameOfSnakeOrMaybeTron([5, 5])
        const actualSnakeHeadPosition = gameOfSnakeOrMaybeTron.snakeHeadPosition
        const expectedSnakeHeadPosition = [5, 5]
        expect(actualSnakeHeadPosition).toEqual(expectedSnakeHeadPosition)
    })
})
