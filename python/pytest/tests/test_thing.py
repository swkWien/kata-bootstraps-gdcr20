from app.thing import Thing


def test_fail():
    thing = Thing("Albert")
    assert "Hello Albert!" == thing.return_hello_name()
