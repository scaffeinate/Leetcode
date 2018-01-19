public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        Set<Integer> counter = new HashSet<Integer>();
        for(int i=0;i<candies.length;i++) {
            counter.add(candies[i]);
        }
        return (counter.size() <= (candies.length/2)) ? counter.size() : (candies.length/2);
    }
}
