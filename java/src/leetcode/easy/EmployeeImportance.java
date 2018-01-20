/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
       Map<Integer, Employee> empMap = new HashMap<>();
       for(Employee employee : employees) {
          empMap.put(employee.id, employee);
       }
       return getImportance(empMap, id);
    }

    private int getImportance(Map<Integer, Employee> empMap, int id) {
        Employee employee = empMap.get(id);
        int sum = employee.importance;
        for(Integer subId : employee.subordinates) {
            sum += getImportance(empMap, subId);
        }
        return sum;
    }
}
