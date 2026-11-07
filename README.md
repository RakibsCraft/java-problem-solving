# Java problem solving

![Tests](https://github.com/RakibsCraft/java-problem-solving/actions/workflows/tests.yml/badge.svg)

My solutions to 37 classic algorithm and data structure problems in Java, each checked by a JUnit 5 test suite. I'm using this repo to practise for technical interviews and to build on my Data Structures and Algorithms module at Maynooth University.

Every solution file includes my notes on the approach I took and its time and space complexity.

## Progress

| # | Problem | Topic | Difficulty | Status |
|---|---|---|---|---|
| 1 | [Two Sum](src/main/java/io/github/rakibscraft/problems/arrays/TwoSum.java) | Arrays | Easy | Not started |
| 2 | [Maximum Subarray](src/main/java/io/github/rakibscraft/problems/arrays/MaximumSubarray.java) | Arrays | Medium | Not started |
| 3 | [Move Zeroes](src/main/java/io/github/rakibscraft/problems/arrays/MoveZeroes.java) | Arrays | Easy | Not started |
| 4 | [Product of Array Except Self](src/main/java/io/github/rakibscraft/problems/arrays/ProductExceptSelf.java) | Arrays | Medium | Not started |
| 5 | [Merge Intervals](src/main/java/io/github/rakibscraft/problems/arrays/MergeIntervals.java) | Arrays | Medium | Not started |
| 6 | [Best Time to Buy and Sell Stock](src/main/java/io/github/rakibscraft/problems/arrays/BestTimeToBuyStock.java) | Arrays | Easy | Not started |
| 7 | [Valid Palindrome](src/main/java/io/github/rakibscraft/problems/strings/ValidPalindrome.java) | Strings | Easy | Not started |
| 8 | [Valid Anagram](src/main/java/io/github/rakibscraft/problems/strings/ValidAnagram.java) | Strings | Easy | Not started |
| 9 | [Longest Substring Without Repeating Characters](src/main/java/io/github/rakibscraft/problems/strings/LongestSubstringWithoutRepeating.java) | Strings | Medium | Not started |
| 10 | [Group Anagrams](src/main/java/io/github/rakibscraft/problems/strings/GroupAnagrams.java) | Strings | Medium | Not started |
| 11 | [String Compression](src/main/java/io/github/rakibscraft/problems/strings/StringCompression.java) | Strings | Easy | Not started |
| 12 | [First Unique Character in a String](src/main/java/io/github/rakibscraft/problems/hashing/FirstUniqueCharacter.java) | Hashing | Easy | Not started |
| 13 | [Top K Frequent Elements](src/main/java/io/github/rakibscraft/problems/hashing/TopKFrequent.java) | Hashing | Medium | Not started |
| 14 | [Longest Consecutive Sequence](src/main/java/io/github/rakibscraft/problems/hashing/LongestConsecutiveSequence.java) | Hashing | Medium | Not started |
| 15 | [Valid Parentheses](src/main/java/io/github/rakibscraft/problems/stacks/ValidParentheses.java) | Stacks | Easy | Not started |
| 16 | [Daily Temperatures](src/main/java/io/github/rakibscraft/problems/stacks/DailyTemperatures.java) | Stacks | Medium | Not started |
| 17 | [Min Stack](src/main/java/io/github/rakibscraft/problems/stacks/MinStack.java) | Stacks | Medium | Not started |
| 18 | [Reverse Linked List](src/main/java/io/github/rakibscraft/problems/linkedlists/ReverseLinkedList.java) | Linked lists | Easy | Not started |
| 19 | [Merge Two Sorted Lists](src/main/java/io/github/rakibscraft/problems/linkedlists/MergeTwoSortedLists.java) | Linked lists | Easy | Not started |
| 20 | [Linked List Cycle](src/main/java/io/github/rakibscraft/problems/linkedlists/LinkedListCycle.java) | Linked lists | Easy | Not started |
| 21 | [Binary Search](src/main/java/io/github/rakibscraft/problems/searching/BinarySearch.java) | Binary search | Easy | Not started |
| 22 | [Search in Rotated Sorted Array](src/main/java/io/github/rakibscraft/problems/searching/SearchRotatedSortedArray.java) | Binary search | Medium | Not started |
| 23 | [Maximum Depth of Binary Tree](src/main/java/io/github/rakibscraft/problems/trees/MaxDepth.java) | Trees | Easy | Not started |
| 24 | [Invert Binary Tree](src/main/java/io/github/rakibscraft/problems/trees/InvertTree.java) | Trees | Easy | Not started |
| 25 | [Validate Binary Search Tree](src/main/java/io/github/rakibscraft/problems/trees/ValidateBST.java) | Trees | Medium | Not started |
| 26 | [Binary Tree Level Order Traversal](src/main/java/io/github/rakibscraft/problems/trees/LevelOrderTraversal.java) | Trees | Medium | Not started |
| 27 | [Number of Islands](src/main/java/io/github/rakibscraft/problems/graphs/NumberOfIslands.java) | Graphs | Medium | Not started |
| 28 | [Course Schedule](src/main/java/io/github/rakibscraft/problems/graphs/CourseSchedule.java) | Graphs | Medium | Not started |
| 29 | [Shortest Path in a Grid](src/main/java/io/github/rakibscraft/problems/graphs/ShortestPathInGrid.java) | Graphs | Medium | Not started |
| 30 | [Network Delay Time](src/main/java/io/github/rakibscraft/problems/graphs/NetworkDelayTime.java) | Graphs | Medium | Not started |
| 31 | [Climbing Stairs](src/main/java/io/github/rakibscraft/problems/dp/ClimbingStairs.java) | Dynamic programming | Easy | Not started |
| 32 | [Coin Change](src/main/java/io/github/rakibscraft/problems/dp/CoinChange.java) | Dynamic programming | Medium | Not started |
| 33 | [Longest Common Subsequence](src/main/java/io/github/rakibscraft/problems/dp/LongestCommonSubsequence.java) | Dynamic programming | Medium | Not started |
| 34 | [House Robber](src/main/java/io/github/rakibscraft/problems/dp/HouseRobber.java) | Dynamic programming | Medium | Not started |
| 35 | [Single Number](src/main/java/io/github/rakibscraft/problems/bits/SingleNumber.java) | Bit manipulation | Easy | Not started |
| 36 | [Counting Bits](src/main/java/io/github/rakibscraft/problems/bits/CountingBits.java) | Bit manipulation | Easy | Not started |
| 37 | [Power of Two](src/main/java/io/github/rakibscraft/problems/bits/PowerOfTwo.java) | Bit manipulation | Easy | Not started |

## How the repo works

Each problem has two files:

- `src/main/java/.../problems/<topic>/<Problem>.java` holds the problem statement and my solution.
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
5. Change its status in the table above to Solved, then commit with a message like `Solve Two Sum with a hash map`.
