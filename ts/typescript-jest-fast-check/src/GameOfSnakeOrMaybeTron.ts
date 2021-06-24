export class GameOfSnakeOrMaybeTron {

    public snakeHeadPosition = []
    // tslint:disable-next-line:no-empty
    constructor(initialSnakeHeadPosition: number[]) {
        this.snakeHeadPosition = initialSnakeHeadPosition
    }

    public moveSnakeHeadPosition() {
        this.snakeHeadPosition = [2, 1]
    }
}
