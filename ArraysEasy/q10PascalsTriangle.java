import java.util.ArrayList;
import java.util.List;

public class q10PascalsTriangle {

    //https://leetcode.com/problems/pascals-triangle/description/

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> myTriangle = new ArrayList<>();
        myTriangle = generate(numRows);
        System.out.println(myTriangle);

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        //store the pascal's triangle
        for (int row = 1; row <= numRows; row++)
        {
            ans.add(generateRow(row));
        }
        return ans;
    }

    public static List<Integer> generateRow(int row)
    {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1); // first element is always 1

        //calculating the rest of the elements
        for(int col = 1; col < row; col++)
        {
            ans = ans *(row - col);
            ans = ans / col;
            ansRow.add((int)ans);
        }

        return ansRow;
    }
}
