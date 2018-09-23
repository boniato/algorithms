import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] record) {
      Map<String, Object> events = null;
      Map<String, Object> nickMap = new HashMap<>();
      List<Map<String, Object>> eventsList = new ArrayList<>();

      for (int i=0; i<record.length; i++) {
    	 String[] tempArr = new String[3];
         tempArr = record[i].split(" ");

         String status = tempArr[0];
         String uid = tempArr[1];
         String nickname = tempArr.length < 3 ? "" : tempArr[2];

         if(status.equals("Enter") || status.equals("Leave")) {
        	events = new HashMap<>();
        	events.put(uid, status);
        	eventsList.add(events);
         }
         
         if(status.equals("Enter") || status.equals("Change")) {
            nickMap.put(uid, nickname);
         }
      }
         
      String[] answer = new String[eventsList.size()];
      for(int j=0; j<eventsList.size(); j++) {
    	  Iterator<String> eventsIterator = eventsList.get(j).keySet().iterator();
    	  String eventsKey = eventsIterator.next();
    	  
    	  Iterator<String> keyIterator = nickMap.keySet().iterator();
    	  while (keyIterator.hasNext()) {
	          String key = keyIterator.next();
	          
	          if(eventsKey.equals(key)) {	
	        	  String nickName = (String) nickMap.get(key);
	        	  if("Enter".equals(eventsList.get(j).get(eventsKey))) {
	        		  answer[j] = nickName + "님이 들어왔습니다.";
	        		  continue;
	        	  }if("Leave".equals(eventsList.get(j).get(eventsKey))) {
	        		  answer[j] = nickName + "님이 나갔습니다.";
	        		  continue; 
	        	  }
	          }
    	  }
	          
      }
      return answer;
    }
}
