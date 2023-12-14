describe('Pacman', () => {

    it('should have only two lives after dying once.', () => {
        const pacman = new Pacman();

        pacman.die();

        expect(pacman.getLives()).toBe(2);
    });
});