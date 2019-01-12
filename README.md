Degheio
=======
A joke program made for challenge 2 of University of Glasgow TechSoc's 2019 "Hacker Olympics".

> Ruby-Go-Perl: Make a Rube Goldberg type program, which incorporates as many programming languages as possible.

**This repo contains the state of the program as of the competition's deadline.
No further changes or bug fixes have been made; the Java and Love2D code are still mostly broken.**

## Sequence
Tested on Linux.
1. `start.sh` or `start.bat` print the 1st line and invoke Perl
2. `line2.pl` prints the 2nd line and invokes Python
3. `line3.py` prints the 3rd line, compiles line45.cc with a C++ compiler, then runs the C++ executable
4. The C++ executable prints the 4th line, calls CMake and recompiles `line45.cc` - but this time with a C compiler
5. The C executable prints the 5th line, then invokes Ruby
6. `line6.rb` prints the 6th line and launches runhaskell
7. `line7.hs` prints the 7th line, compiles a C# executable from `Line8.cs` and runs it with Mono
8. The C# executable prints two lines, compiles a Java .class from `Line9.java` and runs it
9. The java program prints two lines, then launches Love2D from the root folder
10. Finally, Love2D runs `main.lua`



