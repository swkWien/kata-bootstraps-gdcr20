describe('Coin', () => {
    it('should have value', () => {
        const coin = new Coin(5);

        expect(coin.value).toBe(5);
    });
});
