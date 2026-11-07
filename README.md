# Java problem solving

![Tests](https://github.com/RakibsCraft/java-problem-solving/actions/workflows/tests.yml/badge.svg)

37 classic algorithm and data structure problems in Java that I'm working through, each checked by a JUnit 5 test suite. I'm using this repo to practise for technical interviews and to build on my Data Structures and Algorithms module at Maynooth University.

Each solution file has a notes section for the approach and its time and space complexity.

## How the repo works

Each problem has two files:

- `src/main/java/.../problems/<topic>/<Problem>.java` holds the problem statement and the solution.
- `src/test/java/.../problems/<topic>/<Problem>Test.java` holds the tests, including edge cases (empty input, negatives, duplicates, large input).

Tests for problems I haven't started are marked `@Disabled`, so the build stays green. GitHub Actions runs the full test suite on every push.

## Running the tests

You need Java 17 or later and Maven.

```bash
mvn test                        # run every enabled test
mvn test -Dtest=TwoSumTest      # run one problem's tests
```

In IntelliJ IDEA, open the folder as a Maven project and click the green run arrow next to any test class.

## Workflow for each problem

1. Read the problem statement in the Javadoc.
2. Delete the `@Disabled` line from its test class.
3. Write a solution until every test passes.
4. Fill in the "Your notes" section: approach, time complexity, space complexity.
5. Commit with a message like `Solve Two Sum with a hash map`.
