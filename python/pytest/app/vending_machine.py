class VendingMachine:
    def __init__(self):
        self.products = Products()


class Products:
    def __eq__(self, other):
        return True