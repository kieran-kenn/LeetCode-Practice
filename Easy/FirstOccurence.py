def strStr(self, haystack, needle):
    """
    :type haystack: str
    :type needle: str
    :rtype: int
    """
    win_start = 0
    win_end = win_start + len(needle)
    for i in range(len(haystack)):
        try:
            if haystack[win_start:win_end] == needle:
                return win_start
        except:
            return -1
        win_start += 1;
        win_end += 1
    return -1