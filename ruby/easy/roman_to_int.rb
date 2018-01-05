def roman_to_int(s)
  map = { 'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000 }
  res = 0
  for i in 0..s.length-1
    if(i < s.length-1 and map[:"#{s[i]}"] < map[:"#{s[i+1]}"])
      res -= map[:"#{s[i]}"]
    else
      res += map[:"#{s[i]}"]
    end
  end
  return res
end

p roman_to_int("MCMXCVI")