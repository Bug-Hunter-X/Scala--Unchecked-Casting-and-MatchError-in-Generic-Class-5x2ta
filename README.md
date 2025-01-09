# Scala: Unchecked Casting and MatchError in Generic Class

This repository demonstrates a subtle bug in Scala related to unchecked type casting within a generic class. The bug arises when the `asInstanceOf` method is used without proper type handling, leading to potential `MatchError` exceptions at runtime.  The example showcases how using type parameters correctly and avoiding unchecked conversions ensures safer and more robust code.

## Problem

The original code uses `asInstanceOf[Int]` to handle different types of T. This casts the value to an Int irrespective of the actual type parameter T.  If the type parameter T is not Int, this will lead to `ClassCastException`  at runtime, or in this case if there's a match statement it can result in a `MatchError`. 

## Solution

The solution avoids `asInstanceOf` and uses pattern matching and type constraints to ensure type safety and handle different input scenarios without resorting to unsafe casting. This approach is more robust and avoids runtime exceptions.