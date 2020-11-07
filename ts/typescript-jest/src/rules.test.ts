function applyRules(cs: CellState, neighbourCount: number, cb: (nextCellState: CellState) => void) {
    // TODO finish, not related to TDA
    cb(CellState.Dead)
}

enum CellState {
    Alive, Dead
}

it('a cell without neighbours dies', (cb) => {
    applyRules(CellState.Alive, 0, (nextCellState) => {
        expect(nextCellState).toEqual(CellState.Dead);
        cb();
    })
})

class Cell {
    constructor(private state: CellState){}
    public update(newState: CellState) {
        this.state = newState;
    }
    public print(printer: (nextCellState: CellState) => void) {
        // printer(this.state);
    }

}

it('a cell updates itself', (cb) => {
    const cell = new Cell(CellState.Alive)
    cell.update(CellState.Dead)
    cell.print((nextCellState) => {
        expect(nextCellState).toEqual(CellState.Dead);
        cb();
    })
})
