# Week 4. Collections

[Many objects](https://evisp.github.io/java-oop-course/01-objects-and-state/many-objects/) — `ManyAccountsApp`. A list of objects is a list of arrows.

[Objects that own other objects](https://evisp.github.io/java-oop-course/01-objects-and-state/owning-objects/) — `Customer` owns a private list and never hands it out.

`ownerName` has left `Account`, because `Customer` now owns that fact and two
copies of one fact will eventually disagree.

`withdrawFrom` finds the right account and asks it. No arithmetic, no balance
rules. That is the whole module in one method.