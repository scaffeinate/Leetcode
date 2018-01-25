class LRUCache

  =begin
    :type capacity: Integer
=end
    attr_accessor :map, :head, :tail, :capacity
    def initialize(capacity)
        @map = Hash.new
        @head = @tail = nil
        @capacity = capacity
    end


=begin
    :type key: Integer
    :rtype: Integer
=end
    def get(key)
        return -1 unless @map.has_key?(key)
        node = @map[key]
        move_node_to_front(node)
        return node.value
    end


=begin
    :type key: Integer
    :type value: Integer
    :rtype: Void
=end
    def put(key, value)
        if @map.has_key?(key)
            node = @map[key]
            node.value = value
            move_node_to_front(node)
        else
            node = ListNode.new(key, value)
            insert_node_at_front(node)
        end
    end
    
    def move_node_to_front(node)
        return if(node == @head || @head == @tail)
        node.prev.next = node.next
        if(node == @tail)
            @tail = @tail.prev
            @tail.next = nil
        else
            node.next.prev = node.prev
        end
        node.prev = nil
        push(node)
    end
    
    def insert_node_at_front(node)
        if @map.size >= capacity
            @map.delete(@tail.key)
            pop
        end
        @map[node.key] = node
        push(node)
    end

    def push(node)
        if @head.nil? && @tail.nil?
            @head = @tail = node
        else
            node.next = @head
            @head.prev = node
            @head = node
        end
    end
    
    def pop
        if @head == @tail
            @head = @tail = nil
        else
            @tail = @tail.prev
            @tail.next = nil
        end
    end
end

class ListNode
    attr_accessor :key, :value, :next, :prev
    def initialize(key, value)
        @key = key
        @value = value
    end
end

# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache.new(capacity)
# param_1 = obj.get(key)
# obj.put(key, value)