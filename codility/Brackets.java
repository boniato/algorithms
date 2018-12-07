package codility;

import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		String str1 = "{[()()]}";
		String str2 = "([)()]";
		System.out.println(solution(str1));

	}

	public static int solution(String S) {
		Stack<Character> stack = new Stack<>();

		for (int i=0; i < S.length(); i++) {
			char charS = S.charAt(i);

			if (charS == '(' || charS == '{' || charS == '[') { //If charS is previous brace, push it to stack
				stack.push(charS);
			} else { //If charS is rear(뒤) brace, pop front brace and compare it with rear brace
				if (stack.isEmpty())
					break;

				char popBrace = stack.pop();

				if (popBrace != '(' && charS == ')')
					break;
				if (popBrace != '{' && charS == '}')
					break;
				if (popBrace != '[' && charS == ']')
					break;
			}
		}

		if (!stack.isEmpty())
			return 0;

		return 1;
	}

}
