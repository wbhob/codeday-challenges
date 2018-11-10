# Morse Code

## CodeDay Fall 2018 Advanced Computing Challenges

### ATLANTA, GA

## Introduction

Morse Code was invented as a way to communicate using the telegraph, which worked by closing a circuit to send the message through electrical cables. Since they couldn't send exact words, a system of dots and dashes was invented. Your task is to implement an encoder/decoder of Morse Code.

## Task

You can find a table of Morse Code values here: [https://en.wikipedia.org/wiki/Morse_code#/media/File:International_Morse_Code.svg](https://en.wikipedia.org/wiki/Morse_code#/media/File:International_Morse_Code.svg). That document also contains some information about differentiating between words and characters.

Your implementation should both encode and decode a message.

Hints:

- The drivers will represent a space between characters one space, and a space between words as three spaces
- You will need some way to split the entire encoded string up into "characters" for the decoder, simply checking the next set of *n* characters could yield errors (such as with "h" and "i" since looking at the first two characters would simply yield and "i").