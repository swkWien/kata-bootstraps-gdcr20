#


class TestRule1:
    def test_underpopulation(self):
        # create empty field
        field = [[0] * 10]*10
        field[5][5] = 1

        field[5][5] = 0

        assert field[5][5] == 0
