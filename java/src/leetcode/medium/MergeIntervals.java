/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> inputs) {
        List<Interval> results = new ArrayList<Interval>();
  
          if(inputs.isEmpty()) return results;

          Collections.sort(inputs, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
              return i1.start - i2.start;
            }
          });

          Interval interval = inputs.get(0);
          for(int i = 1; i < inputs.size(); i++) {
            Interval next = inputs.get(i);
            if(next.start <= interval.end) {
              interval.end = Math.max(interval.end, next.end);
            } else {
              results.add(interval);
              interval = next;
            }
          }

          results.add(interval);
          return results;
    }
}
