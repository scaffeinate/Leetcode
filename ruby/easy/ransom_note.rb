# @param {String} ransom_note
# @param {String} magazine
# @return {Boolean}
def can_construct(ransom_note, magazine)
    map = {}
    ransom_note.each_char do |c|
        map[c] = map[c] ? (map[c] + 1) : 1
    end
    magazine.each_char do |c|
        map[c] = map[c] - 1 if map[c]
        map.delete(c) if map[c] == 0
    end
    return map.length == 0
end
