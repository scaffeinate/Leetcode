# The is_bad_version API is already defined for you.
# @param {Integer} version
# @return {boolean} whether the version is bad
# def is_bad_version(version):

# @param {Integer} n
# @return {Integer}
def first_bad_version(n)
    return binary_search(1, n)
end

def binary_search(start, stop)
    return start if start > stop
    middle = (start + stop)/2
    if(is_bad_version(middle))
        return binary_search(start, middle-1)
    else
        return binary_search(middle+1, stop)
    end
end
