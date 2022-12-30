package Challenges;

import lombok.Getter;

@Getter
public class Rotate {
    public static void main(String[] args) {
        int num_array[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(num_array);
    }

    public static void rotate(int[][] matrix) {
        System.out.println(matrix[0][0] + "" + matrix[0][1] + "" + matrix[0][2]);
        System.out.println(matrix[1][0] + "" + matrix[1][1] + "" + matrix[1][2]);
        System.out.println(matrix[2][0] + "" + matrix[2][1] + "" + matrix[2][2]);
        System.out.println("Rotated");
        System.out.println(matrix[2][0] + "" + matrix[1][0] + "" + matrix[0][0]);
        System.out.println(matrix[2][1] + "" + matrix[1][1] + "" + matrix[0][1]);
        System.out.println(matrix[2][2] + "" + matrix[1][2] + "" + matrix[0][2]);
    }
}
