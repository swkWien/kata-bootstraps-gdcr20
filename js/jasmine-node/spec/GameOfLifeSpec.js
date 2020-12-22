const GameOfLife = require('../src/GameOfLife');


describe('game of life', () => {
    describe('initialized field', () => {
      it('returns the field', () => {

        let = gameOfLife = new GameOfLife(4,4);
        gameOfLife.setLivingCell(0,0);
        expect(gameOfLife.getBoardCell(0,0)).toEqual(true);
      });
    });
    describe('relive dead cell', () => {
        it('neighbor must have state', () => {
  
          let = gameOfLife = new GameOfLife(4,4);
          gameOfLife.setLivingCell(1,0);
          gameOfLife.setLivingCell(0,1);
          gameOfLife.setLivingCell(1,1);
          
          expect(gameOfLife.countLivingNeighbors(0,0)).toEqual(3);
        });
      });
  });
  