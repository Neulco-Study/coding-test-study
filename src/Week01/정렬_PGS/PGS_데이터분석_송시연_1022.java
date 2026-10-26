package Week01.정렬_PGS;

// https://school.programmers.co.kr/learn/courses/30/lessons/250121
import java.util.*;

public class PGS_데이터분석_송시연_1022 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        int ext_index = getIndex(ext);
        ArrayList<int[]> tmp = new ArrayList<>();

        for(int i = 0; i < data.length; i++) {
            if(data[i][ext_index] < val_ext) {
                tmp.add(data[i]);
            }
        }

        int sort_index = getIndex(sort_by);
        tmp.sort((a, b) -> Integer.compare(a[sort_index], b[sort_index]));

        return tmp.toArray(new int[tmp.size()][]);
    }

    public int getIndex(String sort_by) {
        switch(sort_by){
            case "code": return 0;
            case "date" : return 1;
            case "maximum" : return 2;
            case "remain" : return 3;
            default: return -1;
        }
    }
}
