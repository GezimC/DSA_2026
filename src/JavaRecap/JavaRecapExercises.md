# Java Recap – Programming Exercises

All exercises must be implemented **as methods**.  
Use the `main()` method only to **test the methods** you implement.

---

## 1. Even or Odd

Create a method that checks whether a number is even.

**Method Signature**

```java
boolean isEven(int number);
```

**Input**

`number = 4`

**Output**

`true`

---

## 2. Largest of Three Numbers

Create a method that returns the largest of three integers.

**Method Signature**

```java
int findLargest(int a, int b, int c);
```

**Input**

`a = 3, b = 9, c = 5`

**Output**

`9`

---

## 3. Multiplication Table

Create a method that prints the multiplication table of a number from **1 to 10**.

**Method Signature**

```java
void printMultiplicationTable(int number);
```

**Example Output**

For `number = 5`

```
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
```

---

## 4. Sum from 1 to N

Create a method that calculates the sum of numbers from **1 to N**.

**Method Signature**

```java
int sumToN(int n);
```

**Input**

`n = 5`

**Output**

`15`

Explanation

```
1 + 2 + 3 + 4 + 5 = 15
```

---

## 5. Count Digits

Create a method that counts the number of digits in an integer.

**Method Signature**

```java
int countDigits(int number);
```

**Input**

`number = 12345`

**Output**

`5`

---

## 6. Reverse a Number

Create a method that reverses an integer.

**Method Signature**

```java
int reverseNumber(int number);
```

**Input**

`number = 1234`

**Output**

`4321`

---

## 7. Factorial

Create a method that calculates the factorial of a number.

**Method Signature**

```java
int factorial(int n);
```

**Input**

`n = 5`

**Output**

`120`

Explanation

```
5! = 5 × 4 × 3 × 2 × 1
```

---

## 8. Prime Number Check

Create a method that checks if a number is prime.

**Method Signature**

```java
boolean isPrime(int n);
```

**Input**

`n = 7`

**Output**

`true`

---

## 9. Largest Element in an Array

Create a method that finds the largest element in an integer array.

**Method Signature**

```java
int findLargest(int[] array);
```

**Input**

`[3, 8, 2, 10, 5]`

**Output**

`10`

---

## 10. Average of Array Elements

Create a method that calculates the average value of elements in an integer array.

**Method Signature**

```java
double calculateAverage(int[] array);
```

**Input**

`[2, 4, 6, 8]`

**Output**

`5.0`

---

## 11. Count Even Numbers in Array

Create a method that counts how many even numbers exist in an integer array.

**Method Signature**

```java
int countEvenNumbers(int[] array);
```

**Input**

`[1, 2, 3, 4, 6]`

**Output**

`3`

---

## 12. Count Occurrences in Array

Create a method that counts how many times a given number appears in an array.

**Method Signature**

```java
int countOccurrences(int[] array, int target);
```

**Input**

Array: `[1, 2, 3, 2, 2, 5]`  
Target: `2`

**Output**

`3`

---

## 13. Reverse an Array

Create a method that reverses the elements of an integer array.

**Method Signature**

```java
int[] reverseArray(int[] array);
```

**Input**

`[1, 2, 3, 4]`

**Output**

`[4, 3, 2, 1]`

---

## 14. Search Element in Array

Create a method that returns the index of a number in an array.  
If the element is not found, return `-1`.

**Method Signature**

```java
int findIndex(int[] array, int target);
```

**Input**

Array: `[5, 3, 7, 9]`  
Target: `7`

**Output**

`2`

---

## 15. Palindrome String

Create a method that checks whether a string is a palindrome.

**Method Signature**

```java
boolean isPalindrome(String text);
```

**Input**

`"madam"`

**Output**

`true`

---

## 16. Check if Array is Sorted

Create a method that checks whether an integer array is sorted in ascending order.

**Method Signature**

```java
boolean isSorted(int[] array);
```

**Input**

`[1, 2, 3, 4, 5]`

**Output**

`true`

---

# Matrix Exercises

For the following exercises assume a **2D integer matrix**.

---

## 17. Sum of Each Row

Create a method that calculates the sum of each row in a matrix.

**Method Signature**

```java
int[] rowSums(int[][] matrix);
```

Example Matrix

```
1 2 3
4 5 6
```

Output

```
Row 1 sum = 6
Row 2 sum = 15
```

---

## 18. Sum of Each Column

Create a method that calculates the sum of each column in a matrix.

**Method Signature**

```java
int[] columnSums(int[][] matrix);
```

Example Matrix

```
1 2 3
4 5 6
```

Output

```
Column 1 sum = 5
Column 2 sum = 7
Column 3 sum = 9
```

---

## 19. Search Element in Matrix

Create a method that searches for a number in a matrix and returns its position.

**Method Signature**

```java
int[] findElement(int[][] matrix, int target);
```

**Output**

Return `{row, column}` or `{-1, -1}` if not found.

---

## 20. Diagonal Elements

Create a method that returns the diagonal elements of a square matrix.

**Method Signature**

```java
int[] getDiagonal(int[][] matrix);
```

Example Matrix

```
1 2 3
4 5 6
7 8 9
```

Output

```
[1, 5, 9]
```

---

## 21. Symmetric Matrix

Create a method that checks whether a matrix is symmetric.

**Method Signature**

```java
boolean isSymmetric(int[][] matrix);
```

A matrix is symmetric if

```
matrix[i][j] == matrix[j][i]
```

Example

```
1 2 3
2 5 6
3 6 9
```

Output

`true`