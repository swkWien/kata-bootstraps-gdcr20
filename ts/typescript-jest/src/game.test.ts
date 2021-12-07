describe('games', () => {
    it('should be running', () => {
        const game = new Game();

        expect(game.isRunning()).toBe(true)
    })
})
