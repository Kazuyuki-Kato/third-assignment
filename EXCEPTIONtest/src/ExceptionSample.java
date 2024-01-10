public class ExceptionSample {
    public static void main(String[] args) {
        int[] scores = {225, 145, 260};
        int sum = scores[0] + scores[1] + scores[2] + scores[3];
        int avg = sum / scores.length;
        System.out.println("3種の合計:" + sum);
        System.out.println("3種の平均:" + avg);
    }
}