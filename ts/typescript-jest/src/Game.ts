class Universe {

}

export default class Game {
  constructor () {

  }
  getUniverse() {
    return undefined;
  }
  createUniverse(height: number, width: number): Universe {
    return new Universe(height, width);
  }
}

