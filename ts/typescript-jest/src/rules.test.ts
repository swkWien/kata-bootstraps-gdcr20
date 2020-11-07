function applyRules(cs: CellState, neighbourCount: number, cb: (nextCellState: CellState) => void) {
    // TODO finish, not related to TDA
    cb(CellState.Dead)
}

enum CellState {
    Alive, Dead
}

it('a cell without neighbours dies', (cb) => {
    // 1. start rules
    applyRules(CellState.Alive, 0, (nextCellState) => {
        expect(nextCellState).toEqual(CellState.Dead);
        cb();
    })
})

class Cell {
    constructor(private state: CellState) {
    }

    public update(newState: CellState) {
        this.state = newState;
    }

    public print(printer: (nextCellState: CellState) => void) {
        printer(this.state);
    }

}

it('a cell updates itself', (cb) => {
    // 2. what is callback for rules
    const cell = new Cell(CellState.Alive)
    cell.update(CellState.Dead)
    cell.print((nextCellState) => {
        expect(nextCellState).toEqual(CellState.Dead);
        cb();
    })
})

class Grid {
    private cell: Cell;
    public countLivingNeighboursAt(x: number, y: number, cb: (neighboursCount: number) => void) {
        cb(0)
    }

    public put(x: number, y: number, cell: Cell) {
        this.cell = cell;
    }

    public eachCell(body: (c: Cell) => void) {
        body(this.cell)

    }
}

it('counts neighbours', cb => {
    // 3. where do neighbours come from
    const grid = new Grid();

    grid.countLivingNeighboursAt(0, 0, (neighboursCount: number) => {
        expect(neighboursCount).toEqual(0)
        cb()
    });
})

// 4. what is callback of countNeighboursAt

it('grid should contain cells', cb => {
    const grid = new Grid();
    const cell = new Cell(CellState.Alive);
    grid.put(0, 0, cell);

    grid.eachCell((c: Cell) => {
        expect(c).toBe(cell);
        cb()
    });
})
