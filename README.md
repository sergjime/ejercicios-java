# Nanakyu

Es un proyecto para iniciación en la programación con java. Hay una serie de ejercicios para desarrollar.

Para poder comprobar la validez de los ejercicios es necesario ir activando los correspondientes tests, y lanzar la ejecución de los tests de maven. Por defecto ningún test está activado, según se vayan completando las katas se deben ir activando y ampliando los tests.

## Katas

Las katas se describiran en ingles, ya que es el idioma más habitual en la documentación de código.

### Free urinals

In men's public toilets with urinals, there is this unwritten rule that you leave at least one urinal free between you and the next person peeing. For example if their are 3 urinals and one person is already peeing in the left one, you will choose the urinal on the right and not the one in the middle. That means that a maximum of 3 people can pee at the same time on public toilets with 5 urinals when following this rule (Only 2 if the first person pees into urinal 2 or 4).

#### Your task:

You need to write a function that returns the maximum of free urinals as an integer according to the unwritten rule.

#### Input

A String containing 1s and 0s (Example: `10001`) (1 <= Length <= 20): A one stands for a taken urinal and a zero for a free one.

#### Examples

`10001` returns 1 (10101) 
`1001` returns 0 (1001) 
`00000` returns 3 (10101) 
`0000` returns 2 (1001) 
`01000` returns 1 (01010 or 01001)

### Note

When their is already a mistake in the input string (for example `011`), then return `-1`

## Drying potatoes

All we eat is water and dry matter.

John bought potatoes: their weight is 100 kilograms. Potatoes contain water and dry matter.

The water content is 99 percent of the total weight. He thinks they are too wet and puts them in an oven - at low temperature - for them to lose some water.

At the output the water content is only 98%.

What is the total weight in kilograms (water content plus dry matter) coming out of the oven?

He finds 50 kilograms and he thinks he made a mistake: "So much weight lost for such a small change in water content!"

Can you help him?

Write function `potatoes` with

- int parameter `p0` - initial percent of water-
- int parameter `w0` - initial weight -
- int parameter `p1` - final percent of water -

`potatoes`should return the final weight coming out of the oven `w1` truncated as an int.

### Example:

`potatoes(99, 100, 98) --> 50`

## Sum of triangular numbers

Your task is to return the sum of Triangular Numbers up-to-and-including the `nth` Triangular Number.

Triangular Number: "any of the series of numbers (1, 3, 6, 10, 15, etc.) obtained by continued summation of the natural numbers 1, 2, 3, 4, 5, etc."

```
[01]
02 [03]
04 05 [06]
07 08 09 [10]
11 12 13 14 [15]
16 17 18 19 20 [21]
```

e.g. If `4` is given: `1 + 3 + 6 + 10 = 20`.

Triangular Numbers cannot be negative so return 0 if a negative number is given.

## Odd or Even

Given a list of numbers, determine whether the sum of its elements is odd or even.

Give your answer as a string matching `"odd"` or `"even"`.

If the input array is empty consider it as: `[0]` (array with a zero).

## Example:

```
odd_or_even([0])          ==  "even"
odd_or_even([0, 1, 4])    ==  "odd"
odd_or_even([0, -1, -5])  ==  "even"
```

Have fun!

## Looking for a benefector

The accounts of the "Fat to Fit Club (FFC)" association are supervised by John as a volunteered accountant. The association is funded through financial donations from generous benefactors. John has a list of the first `n` donations: `[14, 30, 5, 7, 9, 11, 15]` He wants to know how much the next benefactor should give to the association so that the average of the first `n + 1` donations should reach an average of `30`. After doing the math he found `149`. He thinks that he made a mistake. Could you help him?

if `dons = [14, 30, 5, 7, 9, 11, 15]` then `new_avg(dons, 30) --> 149`

The function `new_avg(arr, navg)` should return the expected donation (rounded up to the next integer) that will permit to reach the average `navg`.

Should the last donation be a non positive number `(<= 0)` John wants us to throw an IllegalArgumentException, so that he clearly sees that his expectations are not great enough.

Notes:

- all donations and `navg` are numbers (integers or floats), `arr` can be empty.
- See examples below and "Test Samples" to see which return is to be done.

```
new_avg([14, 30, 5, 7, 9, 11, 15], 92) should return 645
new_avg([14, 30, 5, 7, 9, 11, 15], 2) should raise an IllegalArgumentException
```

## Alphabetical Addition

Your task is to add up letters to one letter.

The function will be given an array of single character Strings, each one being a letter to add.

## Notes:

- Letters will always be lowercase.
- Letters can overflow (see second to last example of the description)
- If no letters are given, the function should return `'z'`

## Examples:

```java
addLetters("a", "b", "c") = "f"
addLetters("a", "b") = "c"
addLetters("z") = "z"
addLetters("z", "a") = "a"
addLetters("y", "c", "b") = "d" // notice the letters overflowing
addLetters() = "z"
```

## FizzBuzz

Imagine the scene. You are eleven years old, and in the five minutes before the end of the lesson, your Maths teacher decides he should make his class more “fun” by introducing a “game”. He explains that he is going to point at each pupil in turn and ask them to say the next number in sequence, starting from one. The “fun” part is that if the number is divisible by three, you instead say “Fizz” and if it is divisible by five you say “Buzz”. So now your maths teacher is pointing at all of your classmates in turn, and they happily shout “one!”, “two!”, “Fizz!”, “four!”, “Buzz!”… until he very deliberately points at you, fixing you with a steely gaze… time stands still, your mouth dries up, your palms become sweatier and sweatier until you finally manage to croak “Fizz!”. Doom is avoided, and the pointing finger moves on.

So of course in order to avoid embarassment infront of your whole class, you have to get the full list printed out so you know what to say. Your class has about 33 pupils and he might go round three times before the bell rings for breaktime. Next maths lesson is on Thursday. Get coding!

Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz “.

Sample output:

```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz...
etc up to 100
```

## CsvTable

Write a function to create a table from CSV data.

The input to the function is a list of strings. Each string is formatted as a CSV record. Here’s an example for a possible input:

```
Name;Street;City;Age
Peter Pan;Am Hang 5;12345 Einsam;42
Maria Schmitz;Kölner Strase 45;50123 Köln;43
Paul Meier;Münchener Weg 1;87654 München;65
```

In the input a semicolon separates values within a line. More complicated features of CSV (e.g. delimiters within a value) need not be implemented. The input always is correctly formatted; no validation necessary.

The output should be the data formatted as an “ASCII table”. The first record is interpreted as a header line. A separator line should follow the header line. The column width follows the longest value in a column (which includes the header). Here’s an example output for the above input:

```
Name         |Street          |City         |Age|
-------------+----------------+-------------+---+
Peter Pan    |Am Hang 5       |12345 Einsam |42 |
Maria Schmitz|Kölner Strase 45|50123 Köln   |43 |
Paul Meier   |Münchener Weg 1 |87654 München|65 |
```

## RomanNumbers

Write a program that shows the decimal number corresponding to a Roman number. For example:

- "I" => 1    
- "II" => 2    
- "IV" => 4    
- "IX" => 9    
- "XLII" => 42    
- "XCIX" => 99    
- "MMXIII" => 2013    

For this program we will only validate Roman numerals in the range of "I" to "MMM".

| Roman digit    | I   | V   | X   | L   | C   | D   | M    |
| -------------- | --- | --- | --- | --- | --- | --- | ---- |
| Decimal values | 1   | 5   | 10  | 50  | 100 | 500 | 1000 |

## HappyNumbers

A number is "happy" if the long sum of the square of its digits results in 1.

For example:

```
7 -> 7^2 = 49 -> 4^2 + 9^2 = 97 -> 9^2 + 7^2 = 130 -> 1^2 + 3^2 + 0^2 = 10 -> 1^2 + 0^2 = 119 -> 1^2 + 9^2 = 82 -> 8^2 + 2^2 = 68 -> 6^2 + 8^2 = 100 -> 1^2 + 0^2 + 0^2 = 1
```

Not all numbers are happy; For example, 6 is not.

## BowlingCounter

Create a program, which, given a valid sequence of rolls for one line of American Ten-Pin Bowling, produces the total score for the game. Here are some things that the program will not do:

- We will not check for valid rolls.
- We will not check for correct number of rolls and frames.
- We will not provide scores for intermediate frames.

Depending on the application, this might or might not be a valid way to define a complete story, but we do it here for purposes of keeping the kata light. I think you’ll see that improvements like those above would go in readily if they were needed for real.

We can briefly summarize the scoring for this form of bowling:

- Each game, or “line” of bowling, includes ten turns, or “frames” for the bowler.
- In each frame, the bowler gets up to two tries to knock down all the pins.
- If in two tries, he fails to knock them all down, his score for that frame is the total number of pins knocked down in his two tries.
- If in two tries he knocks them all down, this is called a “spare” and his score for the frame is ten plus the number of pins knocked down on his next throw (in his next turn).
- If on his first try in the frame he knocks down all the pins, this is called a “strike”. His turn is over, and his score for the frame is ten plus the simple total of the pins knocked down in his next two rolls.
- If he gets a spare or strike in the last (tenth) frame, the bowler gets to throw one or two more bonus balls, respectively. These bonus throws are taken as part of the same turn. If the bonus throws knock down all the pins, the process does not repeat: the bonus throws are only used to calculate the score of the final frame.
- The game score is the total of all frame scores.

More info on the rules at: [How to Score for Bowling](http://www.topendsports.com/sport/tenpin/scoring.htm)

# Reglas generales

Es necesario ejecutar al menos todos los test que se exponen en el proyecto. También es recomendable tener una cobertura de test del 100% del código.

Al ejecutar un **mvn clean test**, se generan varios informes:

- **target/site/pmd.html** muestra errores en la calidad del código.

- **target/site/cpd.html** muestra bloques de código duplicados.

- **target/site/jacoco/index.htm** muestra la cobertura del código por paquetes y clases.
