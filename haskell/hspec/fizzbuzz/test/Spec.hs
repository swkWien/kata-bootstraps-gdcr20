import Data.Matrix
import Test.Hspec
import Test.QuickCheck
import Lib (fizzBuzz)


data CellState = DEAD | ALIVE deriving (Eq, Show)

data Cell = Cell { state :: CellState } deriving (Eq, Show)

stateOf :: Cell -> CellState
stateOf(Cell{state=s}) = s


type Grid = Matrix Cell

cellOf :: Grid -> Int -> Int -> Cell
cellOf grid n m = getElem n m grid


main :: IO ()
main = hspec $ do
  describe "3->Fizz" $ do
    it "(excluding multiple of 5) multiple of 3 should be Fizz" $ do
      property $ \x -> x`mod`5==0 || fizzBuzz (x*3) == "Fizz"
  describe "5->Buzz" $ do
    it "(excluding multiple of 3) multiple of 5 should be Buzz" $ do
      property $ \x -> x`mod`3==0 || fizzBuzz (x*5) == "Buzz"
  describe "15->FizzBuzz" $ do
    it "multiple of 3 and 5 should be FizzBuzz" $ do
      property $ \x -> fizzBuzz (x*15) == "FizzBuzz"
  describe "other->shown" $ do
    it "if neither multiple of 3 nor 5 then number shall be shown" $ do
      property $ \x -> x`mod`3==0 || x`mod`5==0 || fizzBuzz x == show x
  describe "Cells have states" $ do
    it "A dead cell is dead" $ do
      (stateOf Cell{state=DEAD} ) `shouldBe` DEAD
    it "An alive cell is alive" $ do
      (stateOf Cell{state=ALIVE} ) `shouldBe` ALIVE
  describe "Grid has cells at position" $ do
    it "A at 1 1 " $ do
      let cell = Cell{state=DEAD}
      let grid = fromLists [ [cell] ]
      cellOf grid 1 1 `shouldBe` cell



--  describe "Grid has neighbours" $ do
--    it "A cell in the middle of 3x3 grid has no alive neighbours" $ do
--      let dead = Cell{state=DEAD}
--      let grid = fromLists [ [dead, dead, dead], [dead, dead, dead]], [dead, dead, dead]]]

