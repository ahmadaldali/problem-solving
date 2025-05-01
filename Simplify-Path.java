class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        String result = "";
        ArrayList<Boolean> shouldSkip = new ArrayList<>();
      
        for(int i=parts.length - 1; i >=0 ;i--){
            String part = parts[i];
            switch (part) {
                case "":
                    break;
                case ".":
                    break;
                case "..":
                    shouldSkip.add(true);
                    break;
                default:
                if (shouldSkip.size() > 0) {
                    shouldSkip.remove(0);
                } else {
                    result = "/" + part + result;   
                }
            }
        }
        
        return result == "" ? "/" : result;
    }
}
