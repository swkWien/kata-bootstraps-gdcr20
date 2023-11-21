# Dojo 2023-11-21

## Notizen aus der P&P-Runde

Was ist außen?
    - Spielersicht?
    - Brauchen wir gleich user control?
    - Oder läuft das Spiel auch von alleine?

Outside in ist schwer, weil:
    - es tut sich ohne input etwas
    - Blöcke sind random
    - wenn man nur Output testet, weiß man nicht, wann ein Tick vorbei ist.
    - Wenn wir Game Loop testen, sind wir nicht mehr ganz außen.

Wo kommt der Output raus?

Vorschlag: erster Test 
    Spiel startet
    warten (wie lang?)
    Game Over taucht auf
    
Oder testen wir Tick für Tick?
    Spiel startet
    tick
    Blockposition verändert

Woher wissen wir, wann ein Tick vorbei ist?

Idee: DisplayDriver schreiben, Anweisungen, die dann gerendert werden würden, werden getestet. Wie/Wohin gerendert wird, ist egal. Wir testen das Interface (wie es angesteuert wird), nicht die Ausgabe an sich.
    Aber dann brauchen wir ein TD um zu sehen, wie/ob Funktionen aufgerufen werden.

Idee: wir lassen das rendern weg, und testen nur die game loop.


Was lassen wir weg um das System zu vereinfachen?
    random Blöcke
    rendern
    Geschwindigkeit - bei jedem Tick ist eine Bewegung & ein Kommando möglich
    Level
    Farbe von Blöcken
    
## Definitionen

- Spielfeld: rechteckiger Raster aus Quadraten, Quadrat ist besetzt oder nicht besetzt. Höhe/Breite sollte beliebig sein
- sobald Block nicht mehr auf Spielfeld passt, ist Game Over
- Block: ein Quadrat groß
    
Was können wir nicht weglassen?
    - Game
    - Game startet
    - Block fällt
    - Block ist gefallen
    
Vorschläge für Tests:
    - Game startet. Assert, dass ein leeres Spielfeld da ist.
    - Game startet. Es passiert etwas. Assert, dass ein Block im Spielfeld ist. (in der obersten Reihe)
    - Game startet. Es passiert etwas (tick/advanceBlock). Block ist im Spielfeld. Es passiert noch was (tick/advanceBlock). Ein Block ist woanders als vorher (zweite Reihe von oben)
    
Einfacheres Beispiel zum Ausprobieren: http-Service, node/js/express, weil man da ein genau vorgegebenes interface hat (send/response), und kann sich mehr auf das Innere testen
    Ist der server dann gemocked? Ist das noch ohne Mocks?
