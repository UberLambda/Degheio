// C preamble
#include <stdio.h>
#include <stdlib.h>

#ifdef __cplusplus // C++, line 4
#include <iostream>

int main(int argc, char** argv)
{
    std::cout << "He would explore the vast depths of the operating system," << std::endl;

    // Let CMake compile this file, but this time in C. CMake will print line 5 and start line 6.
    system("cmake .");
    system("cmake --build .");
    return 0;
}


#else // C, line 6

// TODO IMPLEMENT


#endif
