# @param {Integer} row_index
# @return {Integer[]}
def get_row(row_index)
    return construct_row(0, row_index, [1])
end

def construct_row(index, row_index, row)
    return row if(index == row_index)
    level = [1]
    for i in 0..row.length-1
        level.push((i == row.length-1) ? 1 : (row[i]+row[i+1]));
    end
    return construct_row(index+1, row_index, level)
end
