# @param {String} s
# @return {Boolean}
def is_valid(s)
  map = { '(': ')', '{': '}', '[':']' };
  stack = []
  s.each_char do |c|
    if(map[c.to_sym])
      stack.push(c)
    else
      return false if(stack.empty? || map[stack.pop().to_sym] != c)
    end
  end
  return stack.empty?
end