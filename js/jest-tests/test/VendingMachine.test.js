import HelloWorld from '../src/HelloWorld';

class Nickel {
  get value() {
    return 5;
  }
}

class InsertCoin {
  get value() {
    return 'INSERT COIN';
  }
}

function displayValue() {
  return new InsertCoin().value;
}

function displayValueOfState(state) {
  return state.value.toString();
}

// Return type: { displayValue: Function, insertCoin: Function, ... }
function insertCoin(coin) {
  return () => displayValueOfState(coin);
}

test('it should return INSERT COIN if no coin was inserted', () => {
  expect(displayValue()).toEqual("INSERT COIN");
})

test('it should return "5" if Nickel was inserted', () => {
  const { displayValue } = insertCoin(new Nickel());
  expect(displayValue()).toEqual("5");
})

test('it should return "10" if 2 Nickels were inserted', () => {
  const { insertCoin: insertCoinFn } = insertCoin(new Nickel());
  const { displayValue } = insertCoinFn(new Nickel());

  expect(displayValue()).toEqual("10");
})
