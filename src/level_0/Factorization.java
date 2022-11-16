package level_0;

import java.util.*;

public class Factorization {
	public int[] factorization(int n) {
		int[] answer;
		Set<Integer> factors = new HashSet<>();
		int divisor = 2;
		
		while (n > 1) {
			if (isPrime(n)) {
				factors.add(n);
				break;
			}
			
			if (n % divisor == 0) {
				factors.add(divisor);
				n /= divisor;
			} else if (n % divisor != 0) {
				divisor = nextPrime(divisor);
			}
		}
		answer = factors.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(answer);
		
		return answer;
	}

	private boolean isPrime(int number) {
		boolean prime = true;

		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				prime = false;
			}
		}
		return prime;
	}

	private int nextPrime(int number) {
		int index = number + 1;

		while (!isPrime(index)) {
			index++;
		}
		return index;
	}
}
