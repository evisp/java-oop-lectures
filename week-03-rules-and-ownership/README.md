# Week 3. Rules and ownership

[Objects that refuse](https://evisp.github.io/java-oop-course/01-objects-and-state/objects-that-refuse/) — the constructor becomes a gate. Bad data in, no object out.

[What belongs to whom](https://evisp.github.io/java-oop-course/01-objects-and-state/what-belongs-to-whom/) — `final` for what never changes, `static` for what belongs to the class.

Two kinds of no: `withdraw` returns `false` when there is not enough money, and
throws when the amount is negative. Return a value for outcomes the caller
should expect, throw for situations the caller should have prevented.

`Account` now issues its own number, so the constructor no longer takes one.
The counter resets when the program restarts, which will matter in week 11.