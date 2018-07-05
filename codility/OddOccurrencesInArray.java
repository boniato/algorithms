public int solution(int[] A) {
      Set valSet = new HashSet<>(); //Set: There is no sequences(order) and no duplicate values

      for (int val : A) {
        if (valSet.contains(val) == false) {
              valSet.add(val);
              continue;
          }

          valSet.remove(val);
      }

      Iterator iter = valSet.iterator();
      int res = (int)iter.next();
      return res;
}
