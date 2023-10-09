/*
송아지 찾기
현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다. 현수의 위치와 송아 지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음 과 같은 방법으로 이동한다. 송아지는 움직이지 않고 제자리에 있다.
현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다. 최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성 하세요.

입력 설명
첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000 까지이다.

출력 설명
점프의 최소횟수를 구한다. 답은 1이상입니다.

입력 1)
5 14

출력 1)
3

입력 2)
1 100

출력 2)
21
*/

public class BFS2 {
  static int[] dir = new int[3];
  static int cow;
  
  public static void main (String args[]) {
     
    Scanner in = new Scanner(System.in);
    int cur = in.nextInt(); // 현수 위치
    cow = in.nextInt(); // 송아지 위치

    Node root = new Node(cur);

    dir[0] = 1;
    dir[1] = -1;
    dir[2] = 5;

    bfs2(root);
  }
  
  static void bfs2(int cur,int cow) {
    static int[] dir = {1,-1,5};
    static int[] ch;
    static Queue<Integer> queue = new LinkedList<>();
          ch = new int[10001];
          ch[cur] = 1;
          queue.offer(cur);
          int L = 0;
          while(!queue.isEmpty()){
              int len = queue.size();
              for(int i=0;i<len;i++){
                  int x = queue.poll();
                  if(x==cow){
                      System.out.println(L);
                      return;
                  }
                  for(int j=0;j<3;j++){
                      int nx = x+dir[j];
                      if(nx>=1 && nx<= 10000 && ch[nx]==0){
                          ch[nx] = 1;
                          queue.offer(nx);
                      }
                  }
              }
              L++;
          }
      }
  
}
