class LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder builder = new StringBuilder();
        S = S.replaceAll("-", "");
        if(S.isEmpty()) {
            return "";
        }
        
        int mod = (S.length() % K);
        if(mod > 0) {
            builder.append(S.substring(0, mod));
        }
        while(mod < S.length()) {
            if(mod > 0) {
                builder.append("-");
            }
            builder.append(S.substring(mod, mod+K));
            mod += K;
        }
        return builder.toString().toUpperCase();
    }
}
