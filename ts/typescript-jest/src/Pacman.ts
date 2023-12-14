export default class Pacman {

    private lives: number;

    constructor() {
        this.lives = 3;
    }

    public getLives(): number {
        return this.lives;
    }
}
