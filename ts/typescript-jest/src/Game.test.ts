import  Game from './Game'

describe('Game of Life', () => {
  it('should start with an empty universe', () => {
    const game = new Game();
    // const emptyUniverse = new Universe();
    expect(game.getUniverse()).toEqual(undefined);
  })

  it('should ', () => {
    const game = new Game();
    game.createUniverse(1, 1);
    expect(game.getUniverse().height).toEqual(1);
    expect(game.getUniverse().width).toEqual(1);
  })
})

