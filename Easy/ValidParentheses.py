class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        for char in s:
            if char in "({[":
                stack.append(char)
            else:
                try:
                    open_val = stack.pop()
                except:
                    return False
                if open_val == "(" and char != ")":
                    return False
                elif open_val == "[" and char != "]":
                    return False
                elif open_val == "{" and char != "}":
                    return False
        if len(stack) == 0:
            return True
        else:
            return False
