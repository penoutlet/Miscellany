import sys
import os
print("sys.argv",sys.argv)

os.chdir("C:\\Users\\14072\\Desktop\\")
print(os.getcwd())
# os.mkdir("C:\\Users\\14072\\Desktop\\CodeGud")
dir = os.listdir()
# prints all directories withincurrentone
print(dir)
print("CodeGud" in dir)
# os.rmdir("C:\\Users\\14072\\Desktop\\CodeGud")
print("CodeGud" in dir)

print(os.path.split("C:\\Users\\14072\\Desktop\\scripting.py"))
print(os.path.exists("C:\\Users\\14072\\Desktop\\scripting.py"))