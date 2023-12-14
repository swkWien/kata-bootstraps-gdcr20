/*
Pac-Man grows a tail every third bullet
Pac-Man grows two for each ghost
Pac-Man should not hit itself
The ghosts can also catch the tail
*/

class Pacman {
  private foodCount = 0;

  public getTailLength(): number {
    return Math.floor(this.foodCount / 3);
  }

  eatBullet() {
    ++this.foodCount;
  }

  eatGhost() {
    this.foodCount += 6
  }
}

let pacman: Pacman

beforeEach(() => {
  pacman = new Pacman()
});

describe('Pac-Man grows a tail every third bullet', () => {

  it('Pac-Man initially does not have a tail', () => {
    expect(pacman.getTailLength()).toEqual(0)
  })

  it('should not grow a tail after eating first bullet', () => {

    eatBullets(1)

    expect(pacman.getTailLength()).toEqual(0)
  });

  it('should not grow a tail after eating the second bullet', () => {

    eatBullets(2)

    expect(pacman.getTailLength()).toEqual(0);
  });

  it('should grow tail length of one after eating third bullet', () => {

    eatBullets(3)
    expect(pacman.getTailLength()).toEqual(1);
  });

  it('should grow tail length of two after eating 6th bullet', () => {

    eatBullets(6)

    expect(pacman.getTailLength()).toEqual(2);
  });

  function eatBullets(amount: number) {
    for (let i = 0; i < amount; i++) {
      pacman.eatBullet();
    }
  }
})

describe('Pac-Man grows two for each ghost', () => {

  it('should grow tail by two after eating one ghost', () => {

    pacman.eatGhost()

    expect(pacman.getTailLength()).toEqual(2);
  });

  it('should grow tail by four after eating two ghosts', () => {

    pacman.eatGhost()
    pacman.eatGhost()

    expect(pacman.getTailLength()).toEqual(4);
  });

});

describe('Pac-Man should not hit itself', () => {




});
