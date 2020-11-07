function applyRules(cs: CellState, neighbourCount: number, cb: (nextCellState: CellState) => void) {
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
