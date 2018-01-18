# @param {String[]} list1
# @param {String[]} list2
# @return {String[]}
def find_restaurant(list1, list2)
    map,res = {}, []
    min_index_sum = (list1.length + list2.length)
    list1.each_with_index do |l, i|
        map[l] = i
    end
    list2.each_with_index do |l, i|
        min_index_sum = [min_index_sum, (map[l] + i)].min if map[l]
    end
    
    list2.each_with_index do |l,i|
        res.push(l) if map[l] && ((map[l] + i) == min_index_sum)
    end
    return res
end
