package ru.job4j.condition;

public class Max {

        public static int max(int left, int right) {
            return (left >= right) ? left : right;
        }

        public static int max(int n1, int n2, int n3) {
            return max(max(n1, n2), n3);
        }

        public static int max(int n1, int n2, int n3, int n4) {
            return max(max(n1, n2, n3), n4);
        }

}
