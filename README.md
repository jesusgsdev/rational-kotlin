### Rational Numbers

Your task is to implement a class Rational representing rational numbers. A rational number is a number expressed as a ratio n/d , where n (numerator) and d (denominator) are integer numbers, except that d cannot be zero. Examples of rational numbers are 1/2, 2/3, 117/1098, and 2/1 (which we can alternatively written simply as 2). Rational numbers are represented exactly, without rounding or approximation, which gives them the advantage compared to floating-point numbers.


Your task it to model the behavior of rational numbers, including allowing them to be added, subtracted, multiplied, divided and compared. All arithmetic and comparison operations must be available for rationals: +, -, *, /, ==, <, >= etc.


The *Rational* class should contain a numerator and denominator which might be unlimited numbers, so use java.util.BigInteger class for storing them.


The rational numbers must be compared due to their "normalized" forms: for example, 1/2 should be equal to 2/4, or 117/1098 to 13/122. The string representation of a rational must be also given in the normalized form.


You need to support two ways to create rationals. The first one is to convert a string representation to a rational directly, like in "1/2".toRational(). Converting an integer number should also be possible, and 1 should be used as denominator by default: "23".toRational() is the same as "23/1".toRational().


The alternative way to create a rational is to use divBy infix function like in 1 divBy 2. The receiver and the argument might be of types Int, Long, or BigInteger.

#### Examples

All the following expressions must be evaluated to true:

- `(-2 divBy 4).toString() == "-1/2"`
- `(2 divBy 1).toString() == "2"`
- `"117/1098".toRational().toString() == "13/122"`

- `"1/2".toRational() - "1/3".toRational() == "1/6".toRational()`
- `"1/2".toRational() + "1/3".toRational() == "5/6".toRational()`

- `-(1 divBy 2) == (-1 divBy 2)`

- `(1 divBy 2) * (1 divBy 3) == "1/6".toRational()`
- `(1 divBy 2) / (1 divBy 4) == "2".toRational()`

- `(1 divBy 2) < (2 divBy 3)`
- `(1 divBy 2) in (1 divBy 3)..(2 divBy 3)`

- `"912016490186296920119201192141970416029".toBigInteger() divBy
            "1824032980372593840238402384283940832058".toBigInteger() == 1 divBy 2`