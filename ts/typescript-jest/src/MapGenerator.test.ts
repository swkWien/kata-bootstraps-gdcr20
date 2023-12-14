class OurMap {

}

class MapGenerator {
    createMap(): OurMap {
        return new OurMap();
    }
}

describe('MapGenerator', () => {

    it('should create map instance', () => {
        const mapGenerator = new MapGenerator();

        const map = mapGenerator.createMap();

        expect(map).toBeInstanceOf(OurMap)
    });


});