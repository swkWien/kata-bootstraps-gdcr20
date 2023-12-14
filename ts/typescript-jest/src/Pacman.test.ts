import Pacman from './Pacman';

describe('Pacman', () => {

    it('should have 3 lives on start', () => {
        const expectedLives = 3;

        const pacman = new Pacman();

        expect(pacman.getLives()).toBe(expectedLives);
    });
});
