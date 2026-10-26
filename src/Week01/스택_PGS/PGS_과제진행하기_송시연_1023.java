package Week01.스택_PGS;

// https://school.programmers.co.kr/learn/courses/30/lessons/176962
import java.util.*;

public class PGS_과제진행하기_송시연_1023 {
    public String[] solution(String[][] plans) {

        ArrayList<String> answer = new ArrayList<>();
        Stack<Remain> stack = new Stack<>();

        //0:name 1:start 2:playtime
        Arrays.sort(plans,(a,b) -> a[1].compareTo(b[1]));

        for(int i = 0; i < plans.length - 1; i++) {
            int nowTime = calculateTime(plans[i][1]);
            int nextTime = calculateTime(plans[i+1][1]);
            int playTime = Integer.parseInt(plans[i][2]);
            int interval = nextTime - nowTime;

            if(playTime > interval) { //과제를 못끝냄
                int remainTime = playTime - interval;
                stack.push(new Remain(plans[i][0], remainTime));
            }
            else {//과제를 끝냄
                answer.add(plans[i][0]);

                int freeTime = interval - playTime;

                while(!stack.isEmpty() && freeTime > 0) {
                    Remain remain = stack.peek();

                    if(freeTime >= remain.time) {
                        //멈춰둔 과제 끝내기
                        freeTime -= remain.time;
                        answer.add(remain.name);
                        stack.pop();
                    }
                    else {
                        //멈춰둔 과제 못끝냄
                        remain.time -= freeTime;
                        freeTime = 0;
                    }
                }
            }
        }

        answer.add(plans[plans.length - 1][0]);

        while(!stack.isEmpty()){
            answer.add(stack.pop().name);
        }

        return answer.toArray(new String[answer.size()]);
    }

    public int calculateTime(String time){
        String[] tmp = time.split(":");

        return Integer.parseInt(tmp[0]) * 60 + Integer.parseInt(tmp[1]);
    }
}

class Remain {
    String name;
    int time;

    public Remain(String name, int time) {
        this.name = name;
        this.time = time;
    }
}
