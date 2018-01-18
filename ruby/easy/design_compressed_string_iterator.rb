class StringIterator

=begin
    :type compressed_string: String
=end
    def initialize(compressed_string)
        @compressed_string = compressed_string
        @i = @count = 0
    end


=begin
    :rtype: Character
=end
    def next()
        return " " unless has_next()
        if(@count <= 0)
            @char = @compressed_string[@i]
            @i += 1
            @count = get_count()
        end
        @count -= 1
        return @char
    end


=begin
    :rtype: Boolean
=end
    def has_next()
        return @i < @compressed_string.length || @count > 0
    end

    private
    def get_count()
        count = 0
        while @i < @compressed_string.length
            c = @compressed_string[@i]
            break unless is_numeric(c)
            count = (count * 10) + get_value(c)
            @i += 1
        end
        return count
    end
    
    def is_numeric(c)
        return c >= '0' && c <= '9'
    end
    
    def get_value(c)
        return c.ord - '0'.ord
    end
end

# Your StringIterator object will be instantiated and called as such:
# obj = StringIterator.new(compressed_string)
# param_1 = obj.next()
# param_2 = obj.has_next()
