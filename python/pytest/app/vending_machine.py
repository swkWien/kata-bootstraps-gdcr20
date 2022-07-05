class VendingMachine:
    def __init__(self):
        self.products = Products()


class Products:
    def __init__(self) -> None:
        self._items = set()

    def __eq__(self, other):
        return True

    def add(self, product):
        self._items.add(product)

    def __len__(self):
        return len(self._items)
