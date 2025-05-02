class Solution {
    public int compareVersion(String version1, String version2) {
        String[] version1Arr = version1.split("\\.");
        String[] version2Arr = version2.split("\\.");
        int len = Math.max(version1Arr.length,version2Arr.length);

        for(int i=0;i<len;i++){
            int v1Number = i<version1Arr.length ? Integer.parseInt(version1Arr[i]) : 0;
            int v2Number = i<version2Arr.length ? Integer.parseInt(version2Arr[i]) : 0;

            if(v1Number<v2Number){
                return -1;
            }
            if(v1Number>v2Number){
                return 1;
            }
        }

        return 0;
    }
}
