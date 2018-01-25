class Vector2D
    attr_accessor :i, :j, :vec2d
    # @param {Integer[][]} vec2d
    def initialize(vec2d)
        @i = @j = 0
        @vec2d = vec2d
    end

    # @return {Boolean}
    def has_next
        if(@i < vec2d.length && @j >= @vec2d[@i].length)
            @j = 0
            @i += 1
            while @i < @vec2d.length && @vec2d[@i].empty?
                @i += 1
            end
        end
        return (@i < @vec2d.length) && (@j < @vec2d[@i].length)
    end

    # @return {Integer}
    def next
        res = @vec2d[@i][@j]
        @j += 1
        return res
    end
end

# Your Vector2D will be called like this:
# i, v = Vector2D.new(vec2d), []
# while i.has_next()
#    v << i.next
# end
