import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PGS_주차요금계산_송시연_0923 {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> startTime = new HashMap<>();
        Map<String, Integer> totalTime = new HashMap<>();

        for (String record : records) {
            String[] information = record.split(" ");
            int time = convertMinute(information[0]);
            String carNumber = information[1];
            String status = information[2];

            if (status.equals("IN")) {
                startTime.put(carNumber, time);
            } else {
                int entranceTime = startTime.remove(carNumber);
                int parkingTime = time - entranceTime;

                totalTime.merge(carNumber, parkingTime, Integer::sum);
            }
        }

        int endOfDay = convertMinute("23:59");

        for (Map.Entry<String, Integer> entry : startTime.entrySet()) {
            String carNumber = entry.getKey();
            int parkingTime = endOfDay - entry.getValue();

            totalTime.merge(carNumber, parkingTime, Integer::sum);
        }

        List<String> carNumbers = new ArrayList<>(totalTime.keySet());
        Collections.sort(carNumbers);

        int[] answer = new int[carNumbers.size()];

        for (int i = 0; i < carNumbers.size(); i++) {
            int totalParkingTime = totalTime.get(carNumbers.get(i));
            answer[i] = calculate(fees, totalParkingTime);
        }

        return answer;
    }

    private int convertMinute(String time) {
        String[] tmp = time.split(":");
        int hour = Integer.parseInt(tmp[0]);
        int minute = Integer.parseInt(tmp[1]);

        return hour * 60 + minute;
    }

    private int calculate(int[] fees, int totalTime) {
        int baseTime = fees[0];
        int baseFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        if (totalTime <= baseTime) {
            return baseFee;
        }

        int excessTime = totalTime - baseTime;
        int units = (excessTime + unitTime - 1) / unitTime;

        return baseFee + units * unitFee;
    }
}
