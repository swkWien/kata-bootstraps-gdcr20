class OurMap {

    getSize(): ISize {
        return {width: 5, height: 5}
    }

}

class MapGenerator {
    createMap(): OurMap {
        return new OurMap();
    }    
}

interface ISize {
    width: number;
    height: number;
}

describe('MapGenerator', () => {

    it('should create map instance', () => {
        const mapGenerator = new MapGenerator();

        const map = mapGenerator.createMap();

        expect(map).toBeInstanceOf(OurMap)
    });

    it('should create default Map [5,5]', () => {
        const mapGenerator = new MapGenerator();

        const map = mapGenerator.createMap();

        expect(map.getSize()).toEqual({width: 5, height: 5});
    });

});
