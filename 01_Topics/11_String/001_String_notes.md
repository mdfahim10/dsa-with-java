

# Java Strings — Complete Notes

````md
# Java Strings — DSA Notes

## 1. What is a String?

A String is a sequence of characters.

```java
String name = "Fahim";
````

Characters are stored with indexes starting from `0`.

```text
String:  F  a  h  i  m
Index:   0  1  2  3  4
```

---

# 2. String Input

Use `Scanner` to take String input.

### Single word

```java
Scanner sc = new Scanner(System.in);

String str = sc.next();
```

`next()` reads only one word.

Example:

```text
Input: Hello World
```

`next()` reads:

```text
Hello
```

### Complete line

```java
String str = sc.nextLine();
```

`nextLine()` reads the complete line including spaces.

Example:

```text
Input: Hello World
```

Result:

```text
"Hello World"
```

---

# 3. String Output

```java
String str = "Hello";

System.out.println(str);
```

Output:

```text
Hello
```

---

# 4. String Length — `length()`

`length()` returns the number of characters in a String.

```java
String str = "Hello";

System.out.println(str.length());
```

Output:

```text
5
```

### Important

The last index is always:

```text
length - 1
```

Example:

```text
String:  H  e  l  l  o
Index:   0  1  2  3  4
Length:  5
```

Therefore:

```java
str.length() - 1
```

gives the last index.

---

# 5. Accessing Characters — `charAt()`

`charAt(index)` returns the character at a particular index.

Syntax:

```java
str.charAt(index);
```

Example:

```java
String str = "Fahim";

System.out.println(str.charAt(0));
System.out.println(str.charAt(2));
```

Output:

```text
F
h
```

### Example

```text
String:  F  a  h  i  m
Index:   0  1  2  3  4
```

```java
str.charAt(2)
```

returns:

```text
h
```

### Return type

`charAt()` returns a `char`.

```java
char ch = str.charAt(2);
```

---

# 6. Traversing a String

A String can be traversed using a `for` loop.

```java
String str = "Fahim";

for(int i = 0; i < str.length(); i++) {
    System.out.println(str.charAt(i));
}
```

Output:

```text
F
a
h
i
m
```

### Pattern

```java
for(int i = 0; i < str.length(); i++) {
    // str.charAt(i)
}
```

This pattern is extremely important for String problems.

---

# 7. Reverse Traversal

To traverse a String from right to left:

```java
for(int i = str.length() - 1; i >= 0; i--) {
    System.out.print(str.charAt(i));
}
```

Example:

```text
HELLO
```

Output:

```text
OLLEH
```

---

# 8. String Concatenation

Strings can be joined using `+`.

```java
String first = "Hello";
String second = "World";

String result = first + " " + second;

System.out.println(result);
```

Output:

```text
Hello World
```

### Concatenating characters

```java
String output = "";

for(int i = 0; i < str.length(); i++) {
    output = output + str.charAt(i);
}
```

---

# 9. Palindrome

A palindrome is a String that reads the same from both directions.

Examples:

```text
MADAM
LEVEL
RACECAR
```

Not palindromes:

```text
HELLO
JAVA
```

## Logic

Compare:

```text
first ↔ last
second ↔ second-last
third ↔ third-last
```

Example:

```text
M A D A M
0 1 2 3 4

0 ↔ 4
1 ↔ 3
```

### Java Logic

```java
public static boolean isPalindrome(String str) {

    for(int i = 0; i < str.length() / 2; i++) {

        if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
            return false;
        }
    }

    return true;
}
```

### Important formula

```java
str.charAt(str.length() - 1 - i)
```

gets the character from the opposite side.

### Complexity

```text
Time  : O(n)
Space : O(1)
```

---

# 10. `substring()`

`substring()` extracts a part of a String.

## Form 1

```java
str.substring(start);
```

Starts from `start` and goes to the end.

Example:

```java
String str = "Hello";

System.out.println(str.substring(2));
```

Output:

```text
llo
```

---

## Form 2

```java
str.substring(start, end);
```

### Most important rule:

> Start is included, End is excluded.

Example:

```java
String str = "Hello";

System.out.println(str.substring(1, 4));
```

Output:

```text
ell
```

Indexes:

```text
H e l l o
0 1 2 3 4
```

Indexes `1, 2, 3` are included.

Index `4` is excluded.

Therefore:

```text
substring(1,4)
→ "ell"
```

Remember:

```text
[start, end)
```

---

# 11. Extracting a Substring Using Input

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter String: ");
String str = sc.nextLine();

System.out.print("Enter start index: ");
int start = sc.nextInt();

System.out.print("Enter end index: ");
int end = sc.nextInt();

System.out.println(str.substring(start, end));
```

---

# 12. Printing All Substrings

Every continuous part of a String is a substring.

For:

```text
abc
```

Substrings are:

```text
a
ab
abc
b
bc
c
```

### Logic

Use two loops:

```java
for(int i = 0; i < n; i++) {

    for(int j = i; j < n; j++) {

        System.out.println(str.substring(i, j + 1));
    }
}
```

### Why `j + 1`?

Because the end index of `substring()` is exclusive.

For:

```text
abc
```

When:

```text
i = 0
j = 0
```

we need:

```java
substring(0, 1)
```

which gives:

```text
a
```

Therefore:

```java
substring(i, j + 1)
```

### Number of substrings

For a String of length `n`:

```text
Total substrings = n × (n + 1) / 2
```

Example:

```text
n = 3

3 × 4 / 2 = 6
```

---

# 13. Longest String

Given an array of Strings, find the String with maximum length.

Example:

```text
["cat", "banana", "elephant", "java"]
```

Answer:

```text
elephant
```

### Logic

Maintain:

```java
String largest = "";
```

Then:

```java
for(int i = 0; i < arr.length; i++) {

    if(arr[i].length() > largest.length()) {
        largest = arr[i];
    }
}
```

### Pattern

For numbers:

```java
if(arr[i] > max)
```

For Strings:

```java
if(arr[i].length() > largest.length())
```

---

# 14. Longest Palindromic Substring — Brute Force

To find the longest palindromic substring:

```text
Generate every substring
        ↓
Check whether it is palindrome
        ↓
If palindrome
        ↓
Compare its length
        ↓
Store the longest
```

### Palindrome method

```java
public static boolean isPalindrome(String str) {

    for(int i = 0; i < str.length() / 2; i++) {

        if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
            return false;
        }
    }

    return true;
}
```

### Main logic

```java
int max = 0;
String longest = "";

for(int i = 0; i < str.length(); i++) {

    for(int j = i; j < str.length(); j++) {

        String current = str.substring(i, j + 1);

        if(isPalindrome(current)) {

            if(current.length() > max) {
                max = current.length();
                longest = current;
            }
        }
    }
}
```

### Complexity

Approximately:

```text
Time : O(n³)
Space: O(n)
```

This is a brute-force approach.

---

# 15. StringBuilder

## Why StringBuilder?

String is immutable.

That means repeatedly modifying a String can create new String objects.

Example:

```java
String str = "";

str = str + "A";
str = str + "B";
str = str + "C";
```

For repeated modifications, `StringBuilder` is more suitable.

---

# 16. Creating StringBuilder

```java
StringBuilder sb = new StringBuilder();
```

---

# 17. `append()`

`append()` adds data to the end of the StringBuilder.

```java
StringBuilder sb = new StringBuilder();

sb.append("Hello");
sb.append(" ");
sb.append("World");

System.out.println(sb);
```

Output:

```text
Hello World
```

---

# 18. StringBuilder + Loop

Instead of:

```java
String output = "";

for(int i = 0; i < str.length(); i++) {
    output = output + str.charAt(i);
}
```

Use:

```java
StringBuilder sb = new StringBuilder();

for(int i = 0; i < str.length(); i++) {
    sb.append(str.charAt(i));
}
```

Then:

```java
System.out.println(sb);
```

---

# 19. Reverse String Using StringBuilder

```java
StringBuilder sb = new StringBuilder();

for(int i = str.length() - 1; i >= 0; i--) {
    sb.append(str.charAt(i));
}

System.out.println(sb);
```

Example:

```text
Input:
Hello

Output:
olleH
```

---

# 20. `toString()`

Convert a StringBuilder into a String:

```java
String result = sb.toString();
```

Example:

```java
StringBuilder sb = new StringBuilder();

sb.append("Hello");

String result = sb.toString();
```

---

# 21. Convert First Letter of Every Word to Uppercase

Example:

```text
Input:
hi, I am Alex

Output:
Hi, I Am Alex
```

## Logic

A word starts:

1. At index `0`
2. Immediately after a space

```java
if(i == 0 || str.charAt(i - 1) == ' ') {
    ch = Character.toUpperCase(ch);
}
```

### Complete pattern

```java
StringBuilder sb = new StringBuilder();

for(int i = 0; i < str.length(); i++) {

    char ch = str.charAt(i);

    if(i == 0 || str.charAt(i - 1) == ' ') {
        ch = Character.toUpperCase(ch);
    }

    sb.append(ch);
}
```

---

# 22. String Compression

String compression replaces consecutive repeated characters with:

```text
character + frequency
```

Example:

```text
aaabbcccdd
```

becomes:

```text
a3b2c3d2
```

Breakdown:

```text
aaa → a3
bb  → b2
ccc → c3
dd  → d2
```

## Important

Only **consecutive** characters are counted.

Example:

```text
ababa
```

becomes:

```text
a1b1a1b1a1
```

It does NOT become:

```text
a3b2
```

---

# 23. String Compression Logic

```java
StringBuilder sb = new StringBuilder();

int i = 0;

while(i < str.length()) {

    char ch = str.charAt(i);
    int count = 1;

    while(i + 1 < str.length() &&
          str.charAt(i + 1) == ch) {

        count++;
        i++;
    }

    sb.append(ch);
    sb.append(count);

    i++;
}
```

Example:

```text
aaabbcccdd
```

Processing:

```text
a → count 3 → a3
b → count 2 → b2
c → count 3 → c3
d → count 2 → d2
```

Result:

```text
a3b2c3d2
```

---

# 24. Important String Patterns

## Pattern 1 — Traverse String

```java
for(int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
}
```

Use for:

* Character counting
* Searching
* Character modification
* Vowels
* Frequency
* etc.

---

## Pattern 2 — Reverse Traversal

```java
for(int i = str.length() - 1; i >= 0; i--) {
    char ch = str.charAt(i);
}
```

Use for:

* Reverse String
* Reverse traversal
* Comparing from the end

---

## Pattern 3 — Two-Side Comparison

```java
for(int i = 0; i < str.length() / 2; i++) {

    if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        return false;
    }
}
```

Use for:

* Palindrome
* Comparing characters from both ends

---

## Pattern 4 — Generate All Substrings

```java
for(int i = 0; i < n; i++) {

    for(int j = i; j < n; j++) {

        String current = str.substring(i, j + 1);
    }
}
```

Use for:

* All substrings
* Longest substring
* Palindromic substring
* Brute-force substring problems

---

## Pattern 5 — StringBuilder Construction

```java
StringBuilder sb = new StringBuilder();

for(...) {
    sb.append(...);
}
```

Use when:

* Building a String repeatedly
* Modifying characters
* Reverse String
* Compression
* Character transformations

---

# 25. Important Formulas / Rules

### Last index

```text
length - 1
```

### Opposite character

```java
str.charAt(str.length() - 1 - i)
```

### Substring

```java
str.substring(start, end)
```

Remember:

```text
start → included
end   → excluded
```

### Number of substrings

```text
n × (n + 1) / 2
```

---



# 26. Core String Mindset

When you see a String problem, first ask:

```text
1. Do I need to traverse every character?
        ↓
   for + charAt()

2. Do I need to compare both ends?
        ↓
   i and length - 1 - i

3. Do I need every possible substring?
        ↓
   two nested loops + substring()

4. Do I repeatedly build/modify a String?
        ↓
   StringBuilder

5. Do I need to count consecutive characters?
        ↓
   current character + counting loop
```

These patterns are more important than memorizing individual programs.

```
