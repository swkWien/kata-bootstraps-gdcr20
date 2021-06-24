import {GameOfSnakeOrMaybeTron} from './GameOfSnakeOrMaybeTron'

describe('Game of Snake', () => {
    it('should return position of snake 5/5', () => {
        const gameOfSnakeOrMaybeTron = new GameOfSnakeOrMaybeTron([5, 5])
        const actualSnakeHeadPosition = gameOfSnakeOrMaybeTron.snakeHeadPosition
        const expectedSnakeHeadPosition = [5, 5]
        expect(actualSnakeHeadPosition).toEqual(expectedSnakeHeadPosition)
    })
    it('should return position of snake 10/10', () => {
        const gameOfSnakeOrMaybeTron = new GameOfSnakeOrMaybeTron([10, 10])
        const actualSnakeHeadPosition = gameOfSnakeOrMaybeTron.snakeHeadPosition
        const expectedSnakeHeadPosition = [10, 10]
        expect(actualSnakeHeadPosition).toEqual(expectedSnakeHeadPosition)
    })

})
