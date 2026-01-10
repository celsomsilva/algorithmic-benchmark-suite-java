# Binary Search

## Problem

Given a sorted array, determine whether a target value exists and return its position.

## Invariant

At each iteration, if the target exists, it must be inside the interval:

[start, end]

This interval shrinks monotonically.

## Implementation Notes

- Indices are controlled explicitly.
- The midpoint is computed using a bit shift instead of division by 2.
- No helper methods or abstractions are used.
- The implementation mirrors classical Pascal and C versions.

## Edge Cases Covered

- Empty array
- Single-element array
- Target not present
- Target at boundaries

## Benchmark Observations

Binary search shows logarithmic behavior.  
The benchmark is intended to show trends, not micro-optimizations.

