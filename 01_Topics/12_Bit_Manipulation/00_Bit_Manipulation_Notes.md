# Java DSA --- Bit Manipulation Complete Notes

> **Purpose:** Complete revision notes for the Bit Manipulation chapter,
> following the exact topic order from the lecturer's course. Topics
> already covered are included along with the remaining topics so this
> file can be used as a complete chapter reference.

------------------------------------------------------------------------

# 1. Introduction to Bit Manipulation

Bit Manipulation means working directly with the **binary representation
of numbers** using bitwise operators.

A number is stored internally as bits:

``` text
0 or 1
```

For example:

``` text
5 = 101₂
```

Bit Manipulation is useful because many operations can be performed very
efficiently by directly changing or checking bits.

## Common uses

-   Checking odd/even
-   Getting a particular bit
-   Setting a bit
-   Clearing a bit
-   Updating a bit
-   Checking powers of 2
-   Counting set bits
-   XOR-based problems
-   Efficient multiplication/division by powers of 2
-   Fast exponentiation

------------------------------------------------------------------------

# 2. Binary Number System

Binary uses only two digits:

``` text
0 and 1
```

Each position represents a power of 2.

Example:

``` text
1011₂
```

From right to left:

``` text
Position:  3  2  1  0
Bit:       1  0  1  1
```

Therefore:

``` text
1 × 2³ = 8
0 × 2² = 0
1 × 2¹ = 2
1 × 2⁰ = 1
----------------
           11
```

So:

``` text
1011₂ = 11₁₀
```

## Bit positions

Bit positions start from the **rightmost bit at 0**.

Example:

``` text
13 = 1101

Position:  3 2 1 0
Bit:       1 1 0 1
```

Therefore:

``` text
bit 0 = 1
bit 1 = 0
bit 2 = 1
bit 3 = 1
```

------------------------------------------------------------------------

# 3. Bitwise Operators

Java provides these main bitwise operators:

  Operator   Name                   Basic idea
  ---------- ---------------------- ---------------------------------
  `&`        AND                    Both bits must be `1`
  `|`        OR                     At least one bit must be `1`
  `^`        XOR                    Bits must be different
  `~`        NOT / 1's complement   Flip every bit
  `<<`       Left Shift             Shift bits left
  `>>`       Signed Right Shift     Shift bits right, preserve sign
  `>>>`      Unsigned Right Shift   Shift right, fill with `0`

------------------------------------------------------------------------

# 4. Binary AND --- `&`

AND compares two bits.

## Truth table

  A   B   A & B
  --- --- -------
  0   0   0
  0   1   0
  1   0   0
  1   1   1

### Memory trick

> **AND = both must be 1.**

## Example

``` text
5 = 101
3 = 011

  101
& 011
-----
  001
```

Therefore:

``` text
5 & 3 = 1
```

Java:

``` java
System.out.println(5 & 3);
```

Output:

``` text
1
```

## Main use

AND is heavily used for:

-   Checking a bit
-   Clearing a bit
-   Creating bit masks
-   Odd/even checking

------------------------------------------------------------------------

# 5. Binary OR --- `|`

OR compares two bits.

## Truth table

  A   B   A \| B
  --- --- --------
  0   0   0
  0   1   1
  1   0   1
  1   1   1

### Memory trick

> **OR = if either bit is 1, result is 1.**

## Example

``` text
5 = 101
3 = 011

  101
| 011
-----
  111
```

Therefore:

``` text
5 | 3 = 7
```

Java:

``` java
System.out.println(5 | 3);
```

Output:

``` text
7
```

## Main use

OR is especially useful for **setting a bit**.

------------------------------------------------------------------------

# 6. Binary XOR --- `^`

XOR means **Exclusive OR**.

The result is `1` when the two bits are **different**.

## Truth table

  A   B   A \^ B
  --- --- --------
  0   0   0
  0   1   1
  1   0   1
  1   1   0

### Memory trick

> **XOR = different → 1, same → 0.**

## Example

``` text
5 = 101
3 = 011

  101
^ 011
-----
  110
```

Therefore:

``` text
5 ^ 3 = 6
```

## Important XOR properties

### Property 1

``` text
x ^ x = 0
```

Example:

``` text
5 ^ 5 = 0
```

### Property 2

``` text
x ^ 0 = x
```

Example:

``` text
5 ^ 0 = 5
```

### Property 3 --- XOR is reversible

``` text
a ^ b ^ b = a
```

because:

``` text
b ^ b = 0
a ^ 0 = a
```

### Property 4 --- Order can be changed

XOR is associative and commutative:

``` text
a ^ b ^ c
```

can be rearranged without changing the final result.

## Why XOR is important in DSA

Suppose:

``` text
2, 3, 4, 3, 2
```

XOR all values:

``` text
2 ^ 3 ^ 4 ^ 3 ^ 2
```

Pairs cancel:

``` text
(2 ^ 2) ^ (3 ^ 3) ^ 4
= 0 ^ 0 ^ 4
= 4
```

This idea is used in problems such as finding the unique number when
every other number appears twice.

------------------------------------------------------------------------

# 7. Binary 1's Complement / NOT --- `~`

The bitwise NOT operator is:

``` java
~
```

It flips every bit:

``` text
0 → 1
1 → 0
```

Therefore:

> **Bitwise NOT performs the 1's complement operation.**

## Example

For a simplified 4-bit representation:

``` text
5 = 0101

~5:
    1010
```

In Java, however, an `int` has **32 bits**.

So:

``` text
5 =
00000000 00000000 00000000 00000101
```

After NOT:

``` text
11111111 11111111 11111111 11111010
```

This represents:

``` text
-6
```

Therefore:

``` java
System.out.println(~5);
```

Output:

``` text
-6
```

## Useful shortcut

For Java integers:

``` text
~n = -(n + 1)
```

Examples:

``` text
~5  = -6
~10 = -11
~0  = -1
~(-1) = 0
```

------------------------------------------------------------------------

# 8. 2's Complement

2's complement is used to represent negative integers.

## How to find 2's complement

1.  Find the 1's complement.
2.  Add `1`.

Example: 5 using 4 bits.

``` text
5 = 0101
```

### Step 1 --- 1's complement

``` text
0101
↓↓↓↓
1010
```

### Step 2 --- Add 1

``` text
  1010
+ 0001
------
  1011
```

So the 2's complement of `0101` is:

``` text
1011
```

In a signed 4-bit system, this represents `-5`.

## Java and 2's complement

Java uses 2's-complement representation for signed integer types.

This is why:

``` text
~5 = -6
```

because NOT gives the 1's complement, and the 2's complement would be
one more:

``` text
~5 + 1 = -5
```

------------------------------------------------------------------------

# 9. Binary Left Shift --- `<<`

The left shift operator is:

``` java
<<
```

It moves bits to the left.

Syntax:

``` java
number << positions
```

## Example

``` text
5 = 0101
```

Shift left by 1:

``` text
0101 << 1
= 1010
```

Therefore:

``` text
5 << 1 = 10
```

Shift left by 2:

``` text
0101 << 2
= 10100
```

Therefore:

``` text
5 << 2 = 20
```

## Shortcut for positive numbers

``` text
n << k = n × 2^k
```

Examples:

``` text
5 << 1 = 5 × 2 = 10
5 << 2 = 5 × 4 = 20
5 << 3 = 5 × 8 = 40
```

## Java

``` java
System.out.println(5 << 2);
```

Output:

``` text
20
```

------------------------------------------------------------------------

# 10. Binary Right Shift --- `>>`

The signed right shift operator is:

``` java
>>
```

It shifts bits to the right.

For positive numbers, zeroes are added on the left.

## Example

``` text
5 = 0101

5 >> 1

0101
  ↓
0010
```

Therefore:

``` text
5 >> 1 = 2
```

Shift by 2:

``` text
0101 >> 2 = 0001
```

Therefore:

``` text
5 >> 2 = 1
```

## Shortcut for positive numbers

``` text
n >> k ≈ n / 2^k
```

For integer arithmetic, the fractional part is discarded.

Examples:

``` text
20 >> 1 = 10
20 >> 2 = 5
20 >> 3 = 2
```

## Important: negative numbers

`>>` is a **signed** right shift. It preserves the sign by filling the
left side with the sign bit.

This is why it differs from `>>>`.

------------------------------------------------------------------------

# 11. Unsigned Right Shift --- `>>>`

Java also provides:

``` java
>>>
```

It always fills the left side with `0`.

## Difference

  Operator   Meaning                Left side fill
  ---------- ---------------------- ----------------
  `>>`       Signed right shift     Sign bit
  `>>>`      Unsigned right shift   `0`

For positive numbers:

``` text
>> and >>> generally give the same result
```

The difference is important for negative numbers.

Example:

``` java
int x = -8;

System.out.println(x >> 2);
System.out.println(x >>> 2);
```

`>>` keeps the negative sign.

`>>>` inserts zeroes and can produce a large positive number.

------------------------------------------------------------------------

# 12. Check if Odd or Even

Every even number has a binary representation ending in `0`.

Every odd number ends in `1`.

Examples:

``` text
2 = 10
4 = 100
6 = 110
8 = 1000
```

Even → last bit `0`.

``` text
1 = 1
3 = 11
5 = 101
7 = 111
```

Odd → last bit `1`.

## Why `n & 1` works

`1` in binary has only the last bit set:

``` text
...0001
```

Example:

``` text
5 = 0101
1 = 0001

  0101
& 0001
------
  0001
```

Result `1` → odd.

For 6:

``` text
6 = 0110
1 = 0001

  0110
& 0001
------
  0000
```

Result `0` → even.

## Java

``` java
if ((n & 1) == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

### Memory rule

``` text
n & 1 == 0 → Even
n & 1 == 1 → Odd
```

------------------------------------------------------------------------

# 13. Get ith Bit

Goal:

> Find whether the bit at position `i` is `0` or `1`.

Bit positions start from `0` at the right.

Example:

``` text
5 = 101

Position:  2 1 0
Bit:       1 0 1
```

Therefore:

``` text
bit 0 = 1
bit 1 = 0
bit 2 = 1
```

## Step 1 --- Create a mask

Use:

``` java
1 << i
```

Why?

Because it puts a `1` exactly at position `i`.

``` text
1 << 0 = 001
1 << 1 = 010
1 << 2 = 100
1 << 3 = 1000
```

## Step 2 --- AND with the number

``` java
number & (1 << i)
```

This selects the target bit.

## Step 3 --- Shift it back

``` java
(number & (1 << i)) >> i
```

## Formula

``` java
int bit = (number & (1 << i)) >> i;
```

## Example

Get bit 2 of 5:

``` text
5 = 101
1 << 2 = 100

  101
& 100
-----
  100

100 >> 2 = 001
```

Answer:

``` text
1
```

## Memory trick

``` text
1 << i → target the bit
&      → check/select it
>> i   → bring it to position 0
```

------------------------------------------------------------------------

# 14. Set ith Bit

Goal:

> Make the ith bit `1`.

Whether the bit was already `1` or was `0`, after the operation it
becomes `1`.

## Example

``` text
5 = 101
```

Set bit 1:

``` text
101
 ↓
111
```

Create mask:

``` text
1 << 1 = 010
```

Use OR:

``` text
  101
| 010
-----
  111
```

Result:

``` text
7
```

## Formula

``` java
int result = number | (1 << i);
```

## Why OR?

At the target position:

``` text
0 | 1 = 1
1 | 1 = 1
```

So the target bit is always forced to `1`.

### Memory

``` text
Set ith Bit → OR with (1 << i)
```

------------------------------------------------------------------------

# 15. Clear ith Bit

Goal:

> Make the ith bit `0`.

## Example

``` text
5 = 101
```

Clear bit 2:

``` text
101
 ↓
001
```

Create mask:

``` text
1 << 2 = 100
```

Invert it:

``` text
~100
```

This gives a mask with `0` at the target position and `1` elsewhere.

Then:

``` text
  101
& 011
-----
  001
```

## Formula

``` java
int result = number & ~(1 << i);
```

## Why?

At the target position:

``` text
1 & 0 = 0
0 & 0 = 0
```

So it is guaranteed to become `0`.

### Memory

``` text
Clear ith Bit → AND with ~(1 << i)
```

------------------------------------------------------------------------

# 16. Update ith Bit

Goal:

> Change the ith bit to a specified value, `0` or `1`.

Inputs:

``` text
number
i       → bit position
newBit  → 0 or 1
```

## Strategy

1.  Clear the ith bit.
2.  Put the new bit into the ith position.

### Step 1 --- Clear

``` java
number & ~(1 << i)
```

### Step 2 --- Shift the new bit

``` java
newBit << i
```

### Step 3 --- OR

``` java
(number & ~(1 << i)) | (newBit << i)
```

## Formula

``` java
int result = (number & ~(1 << i)) | (newBit << i);
```

## Example

Change bit 1 of 5 to 1:

``` text
5 = 101
```

Clear bit 1:

``` text
101 → 101
```

Then:

``` text
1 << 1 = 010
```

OR:

``` text
101
010
---
111
```

Result:

``` text
7
```

### Important coding detail

Use:

``` java
newBit << i
```

not:

``` java
newBit << 1
```

because `i` is the position being updated.

------------------------------------------------------------------------

# 17. Clear Last i Bits

Goal:

> Make the last `i` bits equal to `0`.

Example:

``` text
15 = 1111
```

Clear last 2 bits:

``` text
1111
  ↓↓
1100
```

Result:

``` text
1100 = 12
```

## Build the mask

### Step 1

``` java
1 << i
```

For `i = 2`:

``` text
0100
```

### Step 2

Subtract 1:

``` text
0100 - 0001 = 0011
```

Now the last 2 bits are `1`.

### Step 3

Invert:

``` text
~0011 = ...1100
```

Now the last 2 bits are `0`.

### Step 4

AND with number.

## Formula

``` java
int mask = ~((1 << i) - 1);
int result = number & mask;
```

Or directly:

``` java
int result = number & (~((1 << i) - 1));
```

## Memory pattern

``` text
1 << i
   ↓
1 followed by i zeros

- 1
   ↓
last i bits become 1

~
   ↓
last i bits become 0

&
   ↓
clear last i bits
```

------------------------------------------------------------------------

# 18. Clear Range of Bits

Goal:

> Clear all bits from position `i` through position `j`.

Example:

``` text
number = 15

15 = 1111

Position:  3 2 1 0
Bit:       1 1 1 1
```

Clear bits `1` through `2`.

Expected:

``` text
1001
```

Result:

``` text
9
```

## Required mask

We need:

``` text
1 0 0 1
```

That means:

-   Bits after the range → `1`
-   Range `i...j` → `0`
-   Bits before the range → `1`

## Build the left part

Start with all 1s:

``` java
~0
```

Shift left by `j + 1`:

``` java
(~0) << (j + 1)
```

This creates:

``` text
111...1100...00
```

with the lower `j + 1` bits equal to `0`.

## Build the right part

``` java
(1 << i) - 1
```

creates `i` ones at the right.

For `i = 1`:

``` text
1 << 1 = 10
10 - 1 = 01
```

## Combine them

``` java
int a = (~0) << (j + 1);
int b = (1 << i) - 1;

int mask = a | b;
```

Then:

``` java
int result = number & mask;
```

## Complete formula

``` java
int a = (~0) << (j + 1);
int b = (1 << i) - 1;
int mask = a | b;

int result = number & mask;
```

### Example

For:

``` text
number = 15
i = 1
j = 2
```

Mask becomes:

``` text
1001
```

Then:

``` text
  1111
& 1001
------
  1001
```

Result:

``` text
9
```

------------------------------------------------------------------------

# 19. Check if a Number is a Power of 2

A positive number is a power of 2 if it contains **exactly one set
bit**.

Examples:

``` text
1  = 0001
2  = 0010
4  = 0100
8  = 1000
16 = 10000
```

Each has exactly one `1`.

Non-powers:

``` text
3  = 0011
5  = 0101
6  = 0110
10 = 1010
```

They have more than one set bit.

## Important trick

For a positive power of 2:

``` text
n & (n - 1) = 0
```

### Example: 8

``` text
8 = 1000
7 = 0111

  1000
& 0111
------
  0000
```

Therefore 8 is a power of 2.

### Example: 6

``` text
6 = 0110
5 = 0101

  0110
& 0101
------
  0100
```

Not zero → not a power of 2.

## Java

``` java
public static boolean isPowerOfTwo(int n) {
    return n > 0 && (n & (n - 1)) == 0;
}
```

### Why `n > 0`?

Without it:

``` text
0 & (-1) = 0
```

but `0` is not a power of 2.

So always include:

``` java
n > 0
```

### Memory trick

> **Power of 2 → only one set bit → `n & (n - 1) == 0`.**

------------------------------------------------------------------------

# 20. Count Set Bits in a Number

A **set bit** is a bit whose value is `1`.

Example:

``` text
13 = 1101
```

Number of set bits:

``` text
3
```

because:

``` text
1 1 0 1
↑ ↑   ↑
```

## Method 1 --- Check every bit

We can repeatedly inspect the last bit:

``` java
while (n > 0) {
    count += n & 1;
    n = n >> 1;
}
```

Example:

``` text
13 = 1101

last bit → 1
shift    → 110

last bit → 0
shift    → 11

last bit → 1
shift    → 1

last bit → 1
shift    → 0
```

Count:

``` text
1 + 0 + 1 + 1 = 3
```

## Java

``` java
public static int countSetBits(int n) {

    int count = 0;

    while (n > 0) {
        count += n & 1;
        n = n >> 1;
    }

    return count;
}
```

------------------------------------------------------------------------

# 21. Efficient Set-Bit Counting --- `n & (n - 1)`

There is a more efficient trick.

``` java
n = n & (n - 1);
```

This operation removes the **rightmost set bit**.

## Example

``` text
n = 12

12 = 1100
11 = 1011

  1100
& 1011
------
  1000
```

The rightmost `1` was removed:

``` text
1100 → 1000
```

Again:

``` text
1000
0111
----
0000
```

Two operations were needed, so 12 has two set bits.

## Efficient code

``` java
public static int countSetBits(int n) {

    int count = 0;

    while (n > 0) {
        n = n & (n - 1);
        count++;
    }

    return count;
}
```

### Why this is efficient

The loop runs once for each **set bit**, rather than once for every bit
position.

Complexity:

``` text
O(number of set bits)
```

------------------------------------------------------------------------

# 22. Fast Exponentiation

Fast Exponentiation calculates:

``` text
x^n
```

more efficiently than multiplying `x` by itself `n` times.

## Normal approach

For:

``` text
x^5
```

we could do:

``` text
x × x × x × x × x
```

This takes `O(n)` multiplications.

Fast exponentiation reduces this to:

``` text
O(log n)
```

multiplications.

------------------------------------------------------------------------

# 23. Binary idea behind Fast Exponentiation

The key is to look at the exponent in binary.

Example:

``` text
5 = 101₂
```

Therefore:

``` text
x^5 = x^(4 + 1)
```

So:

``` text
x^5 = x^4 × x
```

Instead of multiplying five times.

We repeatedly:

1.  Check whether the current exponent bit is `1`.
2.  If it is, multiply the answer by the current base.
3.  Square the base.
4.  Divide the exponent by 2 using right shift.

------------------------------------------------------------------------

# 24. Fast Exponentiation Algorithm

Suppose we want:

``` text
x^n
```

Initialize:

``` java
ans = 1
```

Then while `n > 0`:

### Step 1 --- Check if n is odd

``` java
if ((n & 1) != 0)
```

If yes:

``` java
ans = ans * x;
```

### Step 2 --- Square the base

``` java
x = x * x;
```

### Step 3 --- Divide exponent by 2

``` java
n = n >> 1;
```

Repeat.

------------------------------------------------------------------------

# 25. Fast Exponentiation Example

Calculate:

``` text
2^5
```

Initial:

``` text
x = 2
n = 5
ans = 1
```

### Iteration 1

``` text
5 = 101
```

Last bit is `1`:

``` text
ans = 1 × 2 = 2
```

Square:

``` text
x = 2 × 2 = 4
```

Shift:

``` text
n = 5 >> 1 = 2
```

### Iteration 2

``` text
n = 2 = 10
```

Last bit is `0`.

Don't multiply answer.

Square:

``` text
x = 4 × 4 = 16
```

Shift:

``` text
n = 2 >> 1 = 1
```

### Iteration 3

``` text
n = 1 = 01
```

Last bit is `1`.

``` text
ans = 2 × 16 = 32
```

Square:

``` text
x = 16 × 16
```

Shift:

``` text
n = 1 >> 1 = 0
```

Stop.

Answer:

``` text
32
```

------------------------------------------------------------------------

# 26. Fast Exponentiation Code

For basic integer practice:

``` java
public static long fastPower(long x, int n) {

    long ans = 1;

    while (n > 0) {

        if ((n & 1) != 0) {
            ans = ans * x;
        }

        x = x * x;
        n = n >> 1;
    }

    return ans;
}
```

Example:

``` java
System.out.println(fastPower(2, 5));
```

Output:

``` text
32
```

## Complexity

Normal exponentiation:

``` text
O(n)
```

Fast exponentiation:

``` text
O(log n)
```

This is a major improvement.

------------------------------------------------------------------------

# 27. Fast Exponentiation --- Important Pattern

Memorize the conceptual pattern:

``` text
while exponent > 0

    if exponent is odd
        answer *= base

    base *= base

    exponent >>= 1
```

The bitwise version:

``` java
if ((n & 1) != 0)
n = n >> 1
```

So fast exponentiation combines several Bit Manipulation ideas you've
already learned.

------------------------------------------------------------------------

# 28. Quick Reference --- Bit Masks

The most important mask is:

``` java
1 << i
```

It creates:

``` text
...0001000...
       ↑
       i
```

Examples:

``` text
1 << 0 = 0001
1 << 1 = 0010
1 << 2 = 0100
1 << 3 = 1000
```

## Common masks

### Set ith bit

``` java
1 << i
```

### Clear ith bit

``` java
~(1 << i)
```

### Clear last i bits

``` java
~((1 << i) - 1)
```

### Keep last i bits

``` java
(1 << i) - 1
```

------------------------------------------------------------------------

# 29. Quick Reference --- Bit Operations

  Task                       Formula
  -------------------------- ------------------------------------
  Check odd/even             `(n & 1)`
  Get ith bit                `(n & (1 << i)) >> i`
  Set ith bit                `n \| (1 << i)`
  Clear ith bit              `n & ~(1 << i)`
  Update ith bit             `(n & ~(1 << i)) \| (newBit << i)`
  Clear last i bits          `n & (~((1 << i) - 1))`
  Power of 2                 `n > 0 && (n & (n - 1)) == 0`
  Remove rightmost set bit   `n & (n - 1)`
  Check last bit             `n & 1`

------------------------------------------------------------------------

# 30. Important Bit Manipulation Patterns

## Pattern 1 --- Check a bit

``` java
(number & (1 << i))
```

## Pattern 2 --- Set a bit

``` java
number | (1 << i)
```

## Pattern 3 --- Clear a bit

``` java
number & ~(1 << i)
```

## Pattern 4 --- Update a bit

``` java
(number & ~(1 << i)) | (newBit << i)
```

## Pattern 5 --- Remove rightmost set bit

``` java
number & (number - 1)
```

## Pattern 6 --- Check power of 2

``` java
number > 0 && (number & (number - 1)) == 0
```

## Pattern 7 --- Check odd/even

``` java
number & 1
```

------------------------------------------------------------------------

# 31. Common Mistakes

## Mistake 1 --- Forgetting that bit positions start at 0

For:

``` text
1010
```

positions are:

``` text
Position: 3 2 1 0
Bit:      1 0 1 0
```

Not:

``` text
4 3 2 1
```

------------------------------------------------------------------------

## Mistake 2 --- Using `1` instead of `i`

For updating:

``` java
newBit << i
```

not:

``` java
newBit << 1
```

The position must come from `i`.

------------------------------------------------------------------------

## Mistake 3 --- Confusing set and clear

``` text
Set   → OR
Clear → AND + NOT
```

Remember:

``` text
Set   → |
Clear → &
```

with the appropriate mask.

------------------------------------------------------------------------

## Mistake 4 --- Forgetting parentheses

Write:

``` java
(number & (1 << i))
```

instead of relying on uncertain operator precedence.

For example:

``` java
int bit = (number & (1 << i)) >> i;
```

is clear and safe to read.

------------------------------------------------------------------------

## Mistake 5 --- Treating `~` like a normal positive binary inversion

Java integers are fixed-width signed values, so:

``` java
~5
```

is:

``` text
-6
```

not simply the decimal value of a short binary string such as `010`.

------------------------------------------------------------------------

# 32. How to Approach a Bit Manipulation Question

When you see a Bit Manipulation problem, ask:

### Question 1

> Which bit position am I interested in?

If position `i`:

``` java
1 << i
```

### Question 2

> Do I need to check it?

Use:

``` java
&
```

### Question 3

> Do I need to make it 1?

Use:

``` java
|
```

### Question 4

> Do I need to make it 0?

Use:

``` java
& ~(1 << i)
```

### Question 5

> Do I need to replace it with another value?

Clear it first, then OR the new bit.

### Question 6

> Do I need to remove the rightmost 1?

Use:

``` java
n & (n - 1)
```

------------------------------------------------------------------------

# 33. Practice Questions --- Suggested Order

After finishing the theory, practice in this order:

### Level 1 --- Basic

1.  Check whether a number is odd or even using `&`.
2.  Get the ith bit.
3.  Set the ith bit.
4.  Clear the ith bit.
5.  Update the ith bit.

### Level 2 --- Masks

6.  Clear the last `i` bits.
7.  Clear a range of bits.
8.  Get the last `i` bits.
9.  Set a range of bits.

### Level 3 --- Bit Tricks

10. Check if a number is a power of 2.
11. Count set bits.
12. Find the unique number using XOR.
13. Find whether two numbers have different bits.
14. Find the rightmost set bit.

### Level 4 --- Advanced application

15. Fast exponentiation.
16. XOR-based array problems.
17. Problems involving masks and subsets.

------------------------------------------------------------------------

# 34. Final One-Page Revision

``` text
BIT MANIPULATION

&  → AND
     Both 1 → 1

|  → OR
     Any 1 → 1

^  → XOR
     Different → 1
     Same → 0

~  → NOT
     Flip bits
     ~n = -(n + 1)

<< → Left Shift
     n × 2^k (for positive n)

>> → Signed Right Shift
     roughly n / 2^k for positive n

>>> → Unsigned Right Shift
      fills left side with 0

--------------------------------

ODD / EVEN
n & 1
0 → even
1 → odd

--------------------------------

MASK
1 << i
→ puts 1 at position i

--------------------------------

GET ith BIT
(n & (1 << i)) >> i

--------------------------------

SET ith BIT
n | (1 << i)

--------------------------------

CLEAR ith BIT
n & ~(1 << i)

--------------------------------

UPDATE ith BIT
(n & ~(1 << i)) | (newBit << i)

--------------------------------

CLEAR LAST i BITS
n & (~((1 << i) - 1))

--------------------------------

CLEAR RANGE i TO j

int a = (~0) << (j + 1);
int b = (1 << i) - 1;
int mask = a | b;

result = n & mask;

--------------------------------

POWER OF 2
n > 0 && (n & (n - 1)) == 0

--------------------------------

REMOVE RIGHTMOST SET BIT
n & (n - 1)

--------------------------------

COUNT SET BITS
Repeatedly:
n = n & (n - 1)

--------------------------------

FAST EXPONENTIATION

while (n > 0) {

    if ((n & 1) != 0)
        ans *= x;

    x *= x;
    n >>= 1;
}

Time: O(log n)
```

------------------------------------------------------------------------


# Key Takeaway

Do not memorize Bit Manipulation as a collection of random formulas.

Understand the central idea:

``` text
1 << i
   ↓
create a mask
   ↓
use &, |, ^, or ~
   ↓
inspect or modify selected bits
```

Once masks become comfortable, most basic Bit Manipulation problems
become much easier.
