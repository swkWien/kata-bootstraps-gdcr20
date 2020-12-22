class GameOfLife {
    
    constructor(x,y){
        this._board = this.generateBoard(x,y);
    }

    generateBoard(x,y){
        const board = new Array(y);
        for (var i = 0; i < y; i++) {
            board[i] = new Array(x);
          }
        return board;
    }
    
    setLivingCell(x,y) {
        this._board[y][x] = true;
    }

    getBoardCell(x,y){
        return this._board[y][x];
    }

  }
  
  module.exports = GameOfLife;
  