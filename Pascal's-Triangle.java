import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> previous = new ArrayList<>();

        // initiate 
        previous.add(1);
        result.add(previous);

        // formating the required rows
        for (int i = 2; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // formating the current row
            row.add(1);
            for(int j=1;j<previous.size();j++) {
                row.add(previous.get(j-1) + previous.get(j));
            }
            row.add(1);
            
            // update the data
            result.add(row);
            previous = row;
        }

        return result;
    }
}
