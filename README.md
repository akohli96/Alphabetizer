# Alphabetizer

 Alphabetizer simply alphabetizes :smile:

## Introduction

   It sorts an input string and removes non-alphabetic characters.

## Technical aspects

Programming language : Java

Continuous integration : Travis-CI

Build automation : Gradle

## Core algorithm

All the server.core logic can be found in the [server.core directory](https://github.com/akohli96/Alphabetizer/tree/master/src/main/java/server.core)
but essentially inbuilt java features are used to sanitize the input before running it through a comparator.

### Thought process

#### Why streams?
I really enjoy using streams for the functional programming perspective and generally increased readabiliy.
However, since there is a lot of articles like [this](https://jaxenter.com/java-performance-tutorial-how-fast-are-the-java-8-streams-118830.html) and [this](https://blog.overops.com/benchmark-how-java-8-lambdas-and-streams-can-make-your-code-5-times-slower/) I wanted to avoid using them.
I decided to take matters in my own hands and used [JMH](https://openjdk.java.net/projects/code-tools/jmh/) to performance test it.
I found that [streams were faster(marginally)](https://github.com/akohli96/Alphabetizer/blob/master/src/main/resources/performance.txt) so I went ahead and used steams.

#### Why Character over char?
The ```Character class``` is an object where is ```char``` is simply a primitive meaning that using primitives would be less computationally exception.
However, using simply ```char``` I would not be able to use streams without converting them to Characters.
Well, lets pretend I did not use streams. Even then I would not be able to use the inbuilt libraries would not allow for sorting characters as per the use case. I did think of the below
``` java
Arays.sort(charArray)
```
but that would not take into account case insensitivity and comparators do not work with primitives. I could have built my own sorting algorithm that could store additional information in a hashmap of whether something is capital or not and then do a final write on the return but that would bring me into [premature optimization](https://stackify.com/premature-optimization-evil/) teritory which I wanted to avoid.

Hence, Character>char.

## How do I build and run it?

```bash
git clone https://github.com/akohli96/Alphabetizer.git
cd Alphabetizer
./gradlew clean build 
./gradlew runServer
./gradlew runClient --args="'InputString' 'AnotherString'" #Different window
```
