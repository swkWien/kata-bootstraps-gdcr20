import Pacman from './Pacman';

describe('Maze', () => {

    it('should contain pacman', () => {
        const pacman = new Pacman();
        const maze = new Maze({pacman});

        expect(maze.contains(pacman)).toBe(true);
    });
});
