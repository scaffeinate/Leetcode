# @param {String} moves
# @return {Boolean}
def judge_circle(moves)
    pos = [0, 0]
    moves.each_char do |move|
        case(move)
            when 'U'
                pos[1] -= 1
            when 'D'
                pos[1] += 1
            when 'L'
                pos[0] -= 1
            when 'R'
                pos[0] += 1
        end
    end
    return pos[0] == 0 && pos[1] == 0
end
