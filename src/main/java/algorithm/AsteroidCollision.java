package algorithm;

import java.util.Stack;

public class AsteroidCollision {


    public static void main(String[] args) {

        int[] asteroids = new int[]{-2, -1, 1, 2};

        AsteroidCollision asteroidCollision = new AsteroidCollision();
        int[] leftAsteroids = asteroidCollision.asteroidCollision(asteroids);

        for (int leftAsteroid : leftAsteroids) {
            System.out.print(leftAsteroid + ", ");
        }
    }

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> asteroidStack = new Stack<Integer>();
        for (int asteroid : asteroids) {

            while (true) {
                if (asteroidStack.isEmpty()) {
                    asteroidStack.push(asteroid);
                    break;
                }

                int last = asteroidStack.pop();
                if (last < 0 || asteroid > 0) {
                    asteroidStack.push(last);
                    asteroidStack.push(asteroid);
                    break;
                } else {
                    int absAsteroid = Math.abs(asteroid);
                    if (last == absAsteroid) {
                        break;
                    } else if (last > absAsteroid) {
                        asteroidStack.push(last);
                        break;
                    }
                }
            }
        }

        int[] retVal = new int[asteroidStack.size()];
        for (int i = asteroidStack.size() - 1; i >= 0; i--) {
            retVal[i] = asteroidStack.pop();
        }

        return retVal;
    }
}
