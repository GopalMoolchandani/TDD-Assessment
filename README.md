# String Calculator Kata

This repo contains a TDD implementation of the String Calculator kata in Java using JUnit.

## How to run
- Build with Maven:
  mvn test

## TDD process
I followed small, incremental tests:
1. empty string -> 0
2. single number
3. two numbers comma separated
4. any amount of numbers
5. allow newline separators
6. custom delimiter `//;`
7. negative numbers throw with list of negatives

Commits are frequent and demonstrate evolution. See commit history for details.

## Features
- Supports comma and newline default separators
- Supports custom single-char and bracketed multi-char delimiters
- Throws `IllegalArgumentException` listing all negative numbers

Screenshot of test runner

<img width="1709" height="478" alt="image" src="https://github.com/user-attachments/assets/d4bb0b5f-04e6-49e6-aa7c-e745a9d2ca03" />

