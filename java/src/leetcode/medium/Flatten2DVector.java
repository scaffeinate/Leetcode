public class Vector2D implements Iterator<Integer> {

    private int i = 0, j = 0;
    private List<List<Integer>> vec2d;
    
    public Vector2D(List<List<Integer>> vec2d) {
        this.vec2d = vec2d;
    }

    @Override
    public Integer next() {
        Integer res = this.vec2d.get(i).get(j);
        j++;
        return res;
    }

    @Override
    public boolean hasNext() {
        if(i < vec2d.size() && j >= vec2d.get(i).size()) {
            j = 0; i++;
            while(i < vec2d.size() && vec2d.get(i).isEmpty()) {
                i++;
            }
        }
        return (i < vec2d.size()) && (j < vec2d.get(i).size());
    }
}

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D i = new Vector2D(vec2d);
 * while (i.hasNext()) v[f()] = i.next();
 */
