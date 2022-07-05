class VendingMachine:
    def __init__(self):
        self.products = Products()


class Products:
    def __init__(self) -> None:
        self._items = set()

    def __eq__(self, other):
        # TODO: complete if you want to
        return self._items == other._items

    def add(self, product):
        self._items.add(product)

    def __len__(self):
        return len(self._items)
