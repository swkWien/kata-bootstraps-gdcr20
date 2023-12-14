describe('Game', () => {

    it('should end once pacman died three times', () => {
        const game = new Game();
        const pacman = game.getPacman();

        pacman.die();
        pacman.die();
        pacman.die();

        expect(game.getState()).toBe('ENDED');
    });
});