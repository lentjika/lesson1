package lesson4;

import java.util.Random;
import java.util.Scanner;

public class lesson4 {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        InitMap();
        PrintMap();
        while (true) {
            HumanTurn();
            PrintMap();
            if (CheckWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (IsMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            PrintMap();
            if (CheckWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (IsMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    static void InitMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void PrintMap() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void HumanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!IsCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static boolean IsCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!IsCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
    }

    public static boolean CheckWin(char dot) {
        int x_count = 0;
        int y_count = 0;
        int xy_count = 0;
        int yx_count = 0;
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                if (map[x][y] == dot) {
                    y_count++;
                    if (x == y)
                        xy_count++;
                    if (x == SIZE - 1 - y)
                        yx_count++;
                }
                if (map[y][x] == dot)
                    x_count++;
            }
            if (y_count == SIZE || x_count == SIZE)
                return true;
            y_count = 0;
            x_count = 0;
        }
        if(xy_count == SIZE || yx_count== SIZE)
            return true;
        return false;
    }

    public static boolean IsMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}


