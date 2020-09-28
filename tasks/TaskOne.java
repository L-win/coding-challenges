
public class TaskOne {

    public void solution(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int answer = sum / arr.length;
    }
}
