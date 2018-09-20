/*
 * 기능개발 (스택/큐)
 */ 
class Solution {
    
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
    	Queue<Integer> queue = new LinkedList<>();
 		int cnt = 1;
 		
 		for (int i = 0; i < progresses.length; i++) {
 			int workDay = (int) Math.ceil(((double) (100 - progresses[i]) / speeds[i])); //7,3,9
 			queue.add(workDay);
 		}
 		
		int workDay = queue.poll();
		while( !queue.isEmpty() ) {
            if(workDay >= queue.peek()){
            	queue.poll();
            	cnt++;
            }else{
            	workDay = queue.poll();
            	list.add(cnt);
            	cnt = 1;
            }
        }
		list.add(cnt);
        
		int[] answer = new int[list.size()];
        for(int j=0; j<list.size(); j++){
        	answer[j] = list.get(j);
        	System.out.println(answer[j]);
        }
 		
		return answer;
    }
}
