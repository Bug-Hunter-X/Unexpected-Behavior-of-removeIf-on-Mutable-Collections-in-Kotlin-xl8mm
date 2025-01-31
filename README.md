# Unexpected Behavior of removeIf on Mutable Collections in Kotlin

This repository demonstrates an uncommon bug in Kotlin related to the `removeIf` function used with mutable lists and maps.  The core issue is that modifying the collection during iteration with `removeIf` can lead to elements being skipped or unexpected results.

The `Bug.kt` file shows the unexpected behavior.  The `BugSolution.kt` file provides a solution using an iterator and manual removal.

## How to Reproduce

1. Clone this repository.
2. Open `Bug.kt` and run the `main` function.
3. Observe the unexpected output.

## Solution

The `BugSolution.kt` file demonstrates a solution.  The solution avoids modifying the collection during iteration by creating an explicit iterator and removing elements manually using `remove` method.