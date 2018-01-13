# @param {String} num
# @return {Boolean}
def is_strobogrammatic(num)
    map = { :"0" => "0", :"1" => "1", :"8" => "8", :"6" => "9", :"9" => "6" }
    upside_down = ""
    num.each_char do |c|
        upside_down = (map[c.to_sym] ? map[c.to_sym] : "") + upside_down
    end
    return num == upside_down
end
