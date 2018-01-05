# @param {Integer} x
# @return {Integer}
def reverse(x)
  n, res = x.abs, 0
  while(n > 0)
    res = (res * 10) + (n%10)
    n = (n/10).to_i
  end
  return res > ((2 ** 31) - 1) ? 0 : (x < 0) ? -res : res
end