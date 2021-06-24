import each from 'jest-each'
import {GameOfSnakeOrMaybeTron} from './GameOfSnakeOrMaybeTron'

describe('Game of Snake', () => {
    each([
        [5, 5],
        [10, 10],
        [null, null]
    ]).test('should return position of snake %d/%d',
        (theFirstDimension: number, theSecondDimension: number) => {
            const theSnakeHeadPosition = [theFirstDimension, theSecondDimension]
            const gameOfSnakeOrMaybeTron = new GameOfSnakeOrMaybeTron(theSnakeHeadPosition)
            const actualSnakeHeadPosition = gameOfSnakeOrMaybeTron.snakeHeadPosition
            expect(actualSnakeHeadPosition).toEqual(theSnakeHeadPosition)
        })

    it('should move snake to the right', () => {
        const gameOfSnakeOrMaybeTron = new GameOfSnakeOrMaybeTron([1, 1])
        gameOfSnakeOrMaybeTron.moveSnakeHeadPosition()
        const actualSnakeHeadPosition = gameOfSnakeOrMaybeTron.snakeHeadPosition
        expect(actualSnakeHeadPosition).toStrictEqual([2, 1])
    })
})
