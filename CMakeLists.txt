# Compiles the executable for line 5

cmake_minimum_required(VERSION 3.0)
project(line5 C) #< Set C, otherwise CMake will try to compile C++!

# Compile and run line 5
add_executable(line5
    line45.c
)
set_target_properties(line5 PROPERTIES
    LINKER_LANGUAGE C
    RUNTIME_OUTPUT_DIRECTORY "${PROJECT_SOURCE_DIR}" #< !!
)
