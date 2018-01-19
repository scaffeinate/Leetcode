class ConvertANumberToHexadecimal {
    public String toHex(int num) {
        if(num == 0) return "0";
        char[] mappings = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder builder = new StringBuilder();
        while(num != 0) {
            int i = num & 0xF;
            builder.insert(0, mappings[i]);
            num >>>= 4;
        }
        return builder.toString();
    }
}
