export class Game {

    private isGameOver = false;

    public isRunning(): boolean {
        return !this.isGameOver
    }

    public gameOver(): void {
        this.isGameOver = true
    }
}
