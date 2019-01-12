#!/usr/bin/env python3
import subprocess as sp
import platform
if __name__ == '__main__':
    print("He was happy, but deep inside he felt like something was wrong.")
    if 'Windows' in platform.system():
        script = 'line3.bat'
    else:
        script = 'line3.sh'
    sp.run(script)

