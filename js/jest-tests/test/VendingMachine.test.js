import HelloWorld from '../src/HelloWorld';

function displayValue() {
  return "INSERT COIN";
}

test('it should return INSERT COIN if no coin was inserted', () => {
  expect(displayValue()).toEqual("INSERT COIN");
})

function insertCoin(coin) {
  return displayValue;
}

test('it should return "5" if Nickel was inserted', () => {
  let theDisplayValue = insertCoin("Nickel")
  expect(theDisplayValue()).toEqual("5");
})
