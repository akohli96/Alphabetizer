# Alphabetizer

 Alphabetizer simply alphabetizes :smile:

## Introduction

   It sorts an input string and removes non-alphabetic characters.

## Technical aspects

Programming language : Java
Continuous integration : Travis-CI
Build automation : Gradle

## Core algorithm

All the core logic can be found in the [core directory](https://github.com/akohli96/Alphabetizer/tree/master/src/main/java/core)
but essentially inbuilt java features are used to sanitize the input before running it through a comparator.

### Thought process

#### Why streams?
I really enjoy using streams for the functional programming perspective and generally increased readabiliy.
However, since there is a lot of articles like [this](https://jaxenter.com/java-performance-tutorial-how-fast-are-the-java-8-streams-118830.html) and [this](https://blog.overops.com/benchmark-how-java-8-lambdas-and-streams-can-make-your-code-5-times-slower/) I wanted to avoid using them.
I decided to take matters in my own hands and used [JMH](https://openjdk.java.net/projects/code-tools/jmh/) to performance test it.
I found that [streams were faster(marginally)](https://github.com/akohli96/Alphabetizer/blob/master/src/main/resources/performance.txt) so I went ahead and used steams.

#### Why Character over char?
The ```java Character class``` is an object where is ```char``` is simply a primitive meaning that using primitives would be less computationally exception.
However, using simply ```java char``` I would not be able to use streams without converting them to Characters.
Well, even if I did not use streams the inbuilt libraries would not allow for sorting chars as per the use case implying I would have to spin out my own sorting algorithm essentially reinventing the wheel which I did not want to do either.
Hence, Character>char.

## How do I build and run it?

```
bash
git clone https://github.com/akohli96/Alphabetizer.git
cd Alphabetizer
./gradlew clean build #This should build it
java -jar build/libs/Alphabetizer.jar 'input1' 'input2'
```