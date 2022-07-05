// Session #1 / Kata
// Vending Machine
// see all details Vending Machine Kata 
// products: 
// * Cola - 1 $
// * Chips - 0,50 $
// * Candy - 0,65 $
// valid coins: 
// * Penny - 1 cent
// * Nickel - 5 cents
// * Dime - 10 cents
// * Quarter - 25 cents
//
// Display: "INSERT COIN", if one is inserted, show the value of the coin and update the current amount of money
// Select product: if enough money has been inserted, present the product and display "THANK YOU" for 5 seconds
// Make change: return the amount of money, that hasn't been used
// Return coins button: return the placed coins and display "INSERT COIN"
// Sold out: if product is out of stock, display "SOLD OUT" for 5 seconds
// Exact change only: display "EXACT CHANGE ONLY" if the machine is not able to give chance.


// import default from modules
import HelloWorld from '../src/HelloWorld';
import VendingMachine from '../src/VendingMachine';

// Write ES6 mocha tests with Chai assertions
describe('Hello World', () => {
  it('should return "Hello World!"', () => {
    expect(HelloWorld()).to.equal('Hello World!');
  });
});

describe('Intialized vending machine knows about status', () => {
  it('initiate vending machine', () => {
    const machine = new VendingMachine();
    expect(machine).is.not.undefined;
  })
  it('status message asks for coins', () => {
    const machine = new VendingMachine();
    const status_message = machine.status()  // TODO: later introduce status class?
    expect(status_message).to.equal('ask for coins');
  })
})
