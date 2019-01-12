// C99 preamble
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
// FIXME: implement MSVC compatibility!!

/// Like system(), but suppresses output.
void exec(const char* cmdline)
{
    // FIXME: implement MSVC compatibility!!
    FILE* fd = popen(cmdline, "r");
    char ch;
    do
    {
        ch = fgetc(fd);
    }
    while(ch != EOF);
    fclose(fd);
}

#ifdef __cplusplus
// C++11, line 4
#include <iostream>
#include <string>


int main(int argc, char** argv)
{
    std::cout << "He would explore the vast depths of the operating system:" << std::endl;

    // Let CMake compile this file, but this time in C.
    // See you in C-land!
    exec("cmake -S . -B build/");
    exec("cmake --build build/");

    const char* line5 =
#ifdef _WIN32
    "line5.exe"
#else
    "./line5"
#endif
    ;
    system(line5);
    return 0;
}

#else
// C99, line 5

int main(int argc, char** argv)
{
    puts("The dark, and scary, Kernel Lands.");
    // FIXME RUN LINE 6
    return 0;
}

#endif
