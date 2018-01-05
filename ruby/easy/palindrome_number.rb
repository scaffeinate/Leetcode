def is_palindrome(x)
  return (x >= 0) && (reverse(x) == x)
end

def reverse(x)
    res = 0
    while(x > 0)
      res = (res*10) + (x%10)
      x = (x/10).to_i
    end
    return res
end