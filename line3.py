#!/usr/bin/env python3
import os
import subprocess as sp
import platform
import shutil

def find_program(*programs):
    """Returns the path to the first program in PATH with a name in `programs`.
    Returns None on failure."""
    for prog in programs:
        val = shutil.which(prog)
        if val:
            return val
    return None
    

if __name__ == '__main__':
    print("So one day, he decided to go and find out who he really was.")

    self_dir = os.path.abspath(os.path.dirname(__file__))
    is_win = 'Windows' in platform.system()

    # Compile line45.cc for C++ to get the executable for line 4
    src_path = os.path.join(self_dir, 'line45.cc')
    exe_name = 'line4.exe' if is_win else 'line4'
    exe_path = os.path.join(self_dir, exe_name)

    gcc_like = find_program('g++', 'clang++', 'cxx')
    if gcc_like:
        cmd = [gcc_like, '-o', exe_path, src_path]
    else:
        msvc_like = find_program('cl', 'clang-cl')
        if msvc_like:
            cmd = [msvc_like, '/EHsc', src_path, '/link', '/out:' + exe_path]
        else:
            raise RuntimeError("Can't find a C++ compiler")

    compiled_ok = sp.run(cmd).returncode == 0

    # Run the compiled executable for line 4
    if compiled_ok:
        sp.run(exe_path)
    else:
        raise RuntimeError('Could not compile line4')


