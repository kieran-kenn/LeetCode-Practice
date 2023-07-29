import re

def isPal(s):
    s =re.sub("[\W]", "", s)
    s = s.lower()
    for i in range(len(s)//2):
        if s[i] != s[-(i+1)]:
            return False
    return True
