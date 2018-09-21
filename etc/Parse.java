		String str = "789";
		int num = 123;
		
		//int to String
		String str1 = String.valueOf(num);
		String str2 = Integer.toString(num);
		String str3 = "" + num;
		
		System.out.println( str1 + " | " + str2 + " | " + str3 ); //123 | 123 | 123
		
		
		//String to int
		int num1 = Integer.parseInt(str);
		int num2 = Integer.valueOf(str);
		int num3 = Optional.of(str).map(Integer::valueOf).get(); //자바 8의 Optional을 이용하여 String을 int로 변환
		
		System.out.println( num1 + " | " + num2 + " | " + num3 ); //789 | 789 | 789
		
		
		// null 체크 할 때, 아래와 같이 삼항연산을 이용하여 null 처리를 할 때가 있다.
		int intVal = (str == null) ? -1 : Integer.parseInt(str);
		
		String strVal = null;
		
		//그러나 위와 같은 처리를 자바8에서 Optional의 ofNullabledm을 사용하여 null 여부를 판단하여 처리할 수 있다.
		int value = Optional.ofNullable(strVal).map(Integer::valueOf).orElse(-1);
		
		//만약 String 값이 null이면, NPE를 내지 않고 대신에 -1을 리턴합니다.
		System.out.println("return: " + value); //return: -1
