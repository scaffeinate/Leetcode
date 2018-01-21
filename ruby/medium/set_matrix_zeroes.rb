# @param {Integer[][]} matrix
# @return {Void} Do not return anything, modify matrix in-place instead.
def set_zeroes(matrix)
    return if matrix.length == 0
    first_row_zero, first_column_zero = false, false
    for i in 0..matrix[0].length-1
        first_row_zero = true if matrix[0][i] == 0
    end
    
    for i in 0..matrix.length-1
        first_column_zero = true if matrix[i][0] == 0
    end
    
    for i in 1..matrix.length-1
        for j in 1..matrix[i].length-1
            if(matrix[i][j] == 0)
                matrix[0][j] = 0
                matrix[i][0] = 0
            end
        end
    end
    
    for i in 1..matrix[0].length-1
        nullify_column(matrix, i) if matrix[0][i] == 0
    end
    
    for i in 1..matrix.length-1
        nullify_row(matrix, i) if matrix[i][0] == 0
    end
    nullify_row(matrix, 0) if first_row_zero
    nullify_column(matrix, 0) if first_column_zero
end

def nullify_row(matrix, row)
    for i in 0..matrix[row].length-1
        matrix[row][i] = 0
    end
end

def nullify_column(matrix, col)
    for i in 0..matrix.length-1
        matrix[i][col] = 0
    end
end
