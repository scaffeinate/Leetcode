class Base7 {
    public String convertToBase7(int num) {
        if (num == 0) { return "0"; }
        StringBuilder builder = new StringBuilder();
        int abs = Math.abs(num);
        while(abs > 0) {
            builder.insert(0, (abs % 7));
            abs /= 7;
        }
        return (num < 0) ? builder.insert(0, "-").toString() : builder.toString();
    }
}
