package DynamicProgramming;

import java.util.HashMap;

/*
* count the number of ways to move thru 6*9 grid
* */
public class GridTraveler {

    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        int rows= 6;
        int cols =9;
        System.out.println("number of way is "+gridTraveler(rows,cols,map));
        System.out.println("number of way is "+gridTraveler(1,1,map));
        System.out.println("number of way is "+gridTraveler(2,3,map));
        System.out.println("number of way is "+gridTraveler(3,2,map));
        System.out.println("number of way is "+gridTraveler(18,18,map));
        //System.out.println("number of way is "+gridTraveler(18,18));
    }
    //using recursion (time complexity of 2^row+cols)
    public static int gridTraveler(int row, int column){
        if(row ==1 &&column ==1)return 1;

        if(row ==0 ||column ==0)return 0;

        return gridTraveler(row-1,column) +gridTraveler(row,column-1);
    }
    //using memoization
    public static int gridTraveler(int row, int column,HashMap<String,Integer> map){
        String key = row +","+column;
        // are args in memo
        if(map.containsKey(key)) return map.get(key);

        if(row ==1 && column ==1)return 1;

        if(row ==0 ||column ==0)return 0;

        int result = gridTraveler(row-1,column,map) +gridTraveler(row,column-1,map);
        map.put(key,result);
        return map.get(key);
    }
}
