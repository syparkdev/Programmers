package level_0;

public class Triangle2 {
    public int triangle2(int[] sides) {
        return Math.min(sides[0], sides[1]) * 2 - 1;
    }
}