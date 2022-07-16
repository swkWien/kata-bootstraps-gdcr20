"""
Diamond Kata

Besprechung:
- Wer kennt das Diamond Kata?

http://claysnow.co.uk/recycling-tests-in-tdd/

> PrintDiamond('A')

A

> PrintDiamond('B')

 A
B B
 A

> PrintDiamond('C')

  A
 B B
C   C
 B B
  A
"""
import pytest


def diamond(letter: str):

    if letter == "A":
        return [letter]

    predecessor = previous_letter(letter)
    return [predecessor, letter, predecessor]


# @pytest.mark.work_in_progress
def test_diamond_function_with_input_letter_B_returns_string_list_in_proper_order():
    input_letter = "B"
    actual_diamond = diamond(input_letter)
    assert actual_diamond == ["A", "B", "A"]


"""
Test evolution

def test_diamond_function_with_input_letter_B_returns_string_list_in_proper_order():
    input_letter = "B"
    actual_diamond = diamond(input_letter)
    assert actual_diamond == ["A", "B", "A"]

def test_diamond_function_with_input_letter_B_returns_string_list_in_proper_order():
    input_letter = "B"
    actual_diamond = diamond(input_letter)
    assert actual_diamond == ["A", "B", "A"]  # NOTE: supersedes below
    assert len(actual_diamond) == 3
    assert Counter(actual_diamond)["A"] == 2 and Counter(actual_diamond)["B"] == 1

def test_diamond_function_with_input_letter_B_returns_string_list_of_len_3_that_includes_A_twice_AND_B_once():
    input_letter = "B"
    actual_diamond = diamond(input_letter)
    assert len(actual_diamond) == 3
    assert all(isinstance(line, str) for line in actual_diamond)  # NOTE: Duplication
    assert Counter(actual_diamond)["A"] == 2 and Counter(actual_diamond)["B"] == 1

def test_diamond_function_with_input_letter_B_returns_string_list_of_len_3_that_includes_A_twice():
    input_letter = "B"
    actual_diamond = diamond(input_letter)
    assert len(actual_diamond) == 3
    assert all(isinstance(line, str) for line in actual_diamond)
    assert Counter(actual_diamond)["A"] == 2

def test_diamond_function_with_input_letter_B_returns_string_list_of_len_3_that_includes_A_at_least_once():
    input_letter = "B"
    actual_diamond = diamond(input_letter)
    assert len(actual_diamond) == 3
    assert all(isinstance(line, str) for line in actual_diamond)
    assert "A" in actual_diamond  # NOTE: one or more

def test_diamond_function_with_input_letter_B_returns_string_list_of_len_3():
    input_letter = "B"
    actual_diamond = diamond(input_letter)
    assert len(actual_diamond) == 3
    assert all(isinstance(line, str) for line in actual_diamond)

def test_diamond_function_with_input_letter_B_returns_something_of_len_3():
    input_letter = "B"
    actual_diamond = diamond(input_letter)
    assert len(actual_diamond) == 3

def test_diamond_function_with_input_letter_B():
    input_letter = "B"
    expected_diamond = ["B"]  # <-- to be updated, to be recycled
    assert diamond(input_letter) == expected_diamond

# END Test for A

def test_diamond_function_with_input_letter_A_returns_diamond_A():
    input_letter = "A"
    expected_diamond = ["A"]
    assert diamond(input_letter) == expected_diamond

def test_diamond_function_returns_string_A():
    input_letter = "A"
    expected_diamond = "A"
    assert diamond(input_letter) == expected_diamond

def test_diamond_function_returns_string_A():
    assert diamond("A") == "A"

def test_diamond_function_returns_string_of_len_one():
    # NOTE: forgot check for str
    assert len(diamond("A")) == 1

def test_diamond_function_returns_string():
    assert isinstance(diamond("A"), str)

def test_diamond_function_accepts_parameter():
    assert diamond("A") is None

def test_diamond_function_exists():
    assert diamond() is None


"""


def previous_letter(letter):
    return chr(ord(letter) - 1)


def test_diamond_function_with_input_letter_A_returns_diamond_A():
    input_letter = "A"
    expected_diamond = ["A"]
    assert diamond(input_letter) == expected_diamond
