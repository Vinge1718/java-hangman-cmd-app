# HANGMAN CMD-LINE APP

## About

- This project is aimed at demonstrating a test dependent development process.

## Rules of the Game:
* The computer chooses a word and player tries to guess what it is one letter at a time.
* The computer prints number of asterisks(\*) equivalent to the number of letters in the word.
* If the guessing player suggests a letter that occurs in the word, the computer fills in the blanks with that letter in the right places.
* If the word does not contain the suggested letter, the computer draws one element of a hangman’s gallows.
* As the game progresses, a segment of the gallows and of a victim is added for every suggested letter not in the word.
* If the completed hangman’s gallows is drawn then the player loses.
* Otherwise, if all the right letters are guessed before this then the player wins.


## Contributors

- [Vinge1718](https://github.com/Vinge1718)

## Built with
- [Java](http://www.oracle.com/technetwork/java/index.html)

## Setup
- Clone or downlad repo from [Here](https://github.com/Vinge1718/java-hangman-cmd-app)
- from the parent directory, run `$ gradle compileJava`.
- In a separate tab in the console, navigate to the build directory: `$ cd build/classes/main`.
- Then to start the game run `$ java App`.

## Licensing
All the work included has been dedicated to the public domain by waiving all of my rights to the work, under
copyright law, including all related and neighboring rights, to the extent allowed by law.
You can copy, modify, distribute and perform the work, even for commercial
purposes, all without asking permission.
