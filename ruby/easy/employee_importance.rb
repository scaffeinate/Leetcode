=begin
# Employee info
class Employee
    attr_accessor :id, :importance, :subordinates
    def initialize( id, importance, subordinates)
        # It's the unique id of each node.
        # unique id of this employee
        @id = id
        # the importance value of this employee
        @importance = importance
        # the id of direct subordinates
        @subordinates = subordinates
    end
end
=end
# @param {Employee} employees
# @param {Integer} id
# @return {Integer}
def get_importance(employees, id)
    employees_map = {}
    employees.each do |employee|
        emp_id = employee.id
        employees_map[emp_id] = Array.new unless employees_map.has_key?(emp_id)
        employees_map[emp_id] = employee
    end
    return compute_importance(id, employees_map)
end

def compute_importance(id, employees_map)
    return unless employees_map.has_key?(id)
    employee = employees_map[id]
    sum = employee.importance
    employee.subordinates.each do |subordinate|
        sum += compute_importance(subordinate, employees_map)
    end
    return sum
end
