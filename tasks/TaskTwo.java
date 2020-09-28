import java.util.*;

public class TaskTwo {
  
    public int solutionTwo(int a, int b) {

        List<Integer> listA = new ArrayList<Integer>();
        String firstInt = Integer.toString(a);
        int[] firstArray = new int[firstInt.length()];
        for (int i = 0; i < firstInt.length(); i++) {
            Integer n = firstInt.charAt(i) - '0';
            listA.add(n);
        }
        Collections.reverse(listA);

        List<Integer> listB = new ArrayList<Integer>();
        String secondInt = Integer.toString(b);
        int[] secondArray = new int[secondInt.length()];
        for (int i = 0; i < secondInt.length(); i++) {
            Integer n = secondInt.charAt(i) - '0';
            listB.add(n);
        }
        Collections.reverse(listB);

        List<Integer> answerArray = new ArrayList<Integer>();

        if (listA.size() >= listB.size()) {
            for (int i = 0; i <= listA.size() - listB.size(); i++) {
                listB.add(0);
            }
            for (int n = 0; n <= listA.size() - 1; n++) {
                if (n + 1 <= listB.size()) {
                    answerArray.add(listA.get(n) + listB.get(n));
                }
            }

        } else {
            for (int i = 0; i <= listB.size() - listA.size(); i++) {
                listA.add(0);
                listA.add(0);
            }
            for (int n = 0; n <= listB.size() - 1; n++) {
                if (n + 1 <= listA.size()) {
                    answerArray.add(listB.get(n) + listA.get(n));
                }
            }
        }

        Collections.reverse(answerArray);
        StringBuffer sb = new StringBuffer();
        for (int n : answerArray) {
            sb.append(n);
        }
        int answer = Integer.parseInt(sb.toString());

        return answer;
    }

}
