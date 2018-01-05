# @param {String[]} strs
# @return {String}
def longest_common_prefix(strs)
  res, len = "", 0
  return res if(strs.length == 0)
  len = strs[0].length
  strs.each do |str|
    len = [len, str.length].min
  end
  
  for i in 0..len
    strs.each do |str|
      return res if(str[i] != strs[0][i])
    end
    res += strs[0][i].to_s
  end
  return res
end