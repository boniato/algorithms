/**
* https://school.programmers.co.kr/learn/courses/30/lessons/43165
* 문제 설명
* n개의 음이 아닌 정수들이 있습니다. 이 정수들을 순서를 바꾸지 않고 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
* 사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.
*
* 1. 처음에 올 수 있는 숫자는 +1, -1이고, +1을 선택했다고 가정하고
* 2. 그 다음에도 +1, -1이 올 수 있다.
* 3. 이렇게 모든 경우의 수를 탐색하여 target이 되는 값을 찾아 나서면 된다.
**/

class TargetNumber {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
        return answer;
    }

    private void dfs(int sum, int idx, int[] numbers, int target) {
        if (idx == numbers.length && sum == target) {
            answer++;
            return;
        }
        if (idx >= numbers.length) {
            return;
        }
        dfs(sum + numbers[idx], idx + 1, numbers, target);
        dfs(sum - numbers[idx], idx + 1, numbers, target);
    }
}
