import each from 'jest-each'
import {GameOfSnakeOrMaybeTron} from './GameOfSnakeOrMaybeTron'

describe('Game of Snake', () => {
    each([
        [5, 5],
        [10, 10],
    ]).test('should return position of snake %d/%d',
        (theFirstDimension: number, theSecondDimension: number) => {
            const theSnakeHeadPosition = [theFirstDimension, theSecondDimension]
            const gameOfSnakeOrMaybeTron = new GameOfSnakeOrMaybeTron(theSnakeHeadPosition)
            const actualSnakeHeadPosition = gameOfSnakeOrMaybeTron.snakeHeadPosition
            expect(actualSnakeHeadPosition).toEqual(theSnakeHeadPosition)
        })

})
