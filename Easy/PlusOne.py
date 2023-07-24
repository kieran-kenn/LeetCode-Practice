def plusOne(digits):
    """
    :type digits: List[int]
    :rtype: List[int]
    """
    carry = 0
    for i in range(len(digits)-1, -1, -1):
        if(i == len(digits)-1):
            digits[i] += 1
            if digits[i] > 9:
                digits[i] = 0
                carry = 1
            else:
                return digits
        else:
            digits[i] += carry
            carry = 0
            if digits[i] > 9:
                digits[i] = 0
                carry = 1
    if(carry == 1):
        return [1] + digits
    return digits
