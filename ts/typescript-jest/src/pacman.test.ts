/*
Pac-Man grows a tail every third bullet
Pac-Man grows two for each ghost
Pac-Man should not hit itself
The ghosts can also catch the tail
*/

class Pacman {
  public getTailLength(): number {
    return 0
  }

  eatBullet() {

  }
}

describe('Pac-Man grows a tail every third bullet', () => {

  it('Pac-Man initially does not have a tail', () => {
    const pacman = new Pacman()
    expect(pacman.getTailLength()).toEqual(0)
  })

  it('should not grow a tail after eating first bullet', () => {
    const pacman = new Pacman();

    pacman.eatBullet();

    expect(pacman.getTailLength()).toEqual(0)
  });
})
