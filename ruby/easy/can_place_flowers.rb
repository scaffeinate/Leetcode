# @param {Integer[]} flowerbed
# @param {Integer} n
# @return {Boolean}
def can_place_flowers(flowerbed, n)
    for i in 0..flowerbed.length-1
        if ((flowerbed[i] == 0) && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0))
            flowerbed[i] = 1
            n -= 1
        end
    end
    return n <= 0
end
