# @param {Integer[]} candies
# @return {Integer}
def distribute_candies(candies)
    set = Set.new
    candies.each do |candy|
        set.add(candy)
    end
    return (set.length > (candies.length/2)) ? (candies.length/2) : set.length
end
