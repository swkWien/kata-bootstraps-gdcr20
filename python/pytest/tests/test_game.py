"""
# Constraint: Test-List
* Use first minutes to create list of acceptance test cases
* Start each TDD cycle with at least three tests (paper), then chose one

Gregor's Ideensammlung
Testen, dass die Zelle erkennt, dass sie maximal 8 Nachbarn hat.
Doppelte Nachbarzählung vermeiden.
Randgebiet erkennen vom Grid.
Erkennen, ob Nachbarzelle lebt oder nicht (brauchen wir für's Zählen).
Wie lange bleibt die Info "Zelle ist tot" erhalten? Maximal eine Runde zurück.

Wer ist mein Nachbar?
Was ist mein nächster Zustand (=Regel prüfen)?

Spezialfall: testen, wie sich Regeln verhalten, wenn man sie mit Extremwerten füttert.

Was gibt Funktion "evolve" zurück?
current_cell - Funktion (count neigbors, apply rules) -> next_cell

Spezialfall: was passiert mit dem Grid?

*Diskussion über mögliche Zugänge"

Wir entscheiden, mit "evolve" zu beginnen.
"""
import pytest


def test_evolve_revives_dead_cell_if_it_has_exactly_three_living_neighbors():
    """Eine tote Zelle mit genau drei lebenden Nachbarn wird in der
    Folgegeneration neu geboren.
    """
    assert evolve(is_alive=False, n_neighbors=3) is True


@pytest.mark.skip
def test_evolve_kills_living_cell_if_it_has_less_than_two_living_neighbors():
    """Lebende Zellen mit weniger als zwei lebenden Nachbarn sterben in der Folgegeneration an Einsamkeit.
    """
    assert evolve(is_alive=True, n_neighbors=1) is False
    # TODO: more than one assert okay for us?
    assert evolve(is_alive=True, n_neighbors=0) is False


@pytest.mark.skip
def test_evolve_keeps_alive_cell_if_it_has_two_or_three_living_neighbors():
    """Eine lebende Zelle mit zwei oder drei lebenden Nachbarn bleibt in der Folgegeneration am Leben.
    """
    assert evolve(is_alive=True, n_neighbors=2) is True
    # TODO: more than one assert okay for us?
    assert evolve(is_alive=True, n_neighbors=3) is True


# TODO: continue other cases in the same fashion
