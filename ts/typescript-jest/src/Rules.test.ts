describe('Rules', () => {
    it('should win if no coins are left', () => {
        const rules = new Rules();
        const rule = new Rule();

        rules.addRule(rule);

        const currentRules = rules.list();
        expect(currentRules.length).toBe(1);
    });
});