package codility;

public class KakaoTest2 {

	public static void main(String[] args) {
		
		String arg = "1D2S3T*"; //1S2D*3T(37), 1D2S#10S(9), 1D2S0T(3), 1S*2T*3S(23), 1D#2S*3S(5), 1T2D3D#(-4), 1D2S3T*(59)
		int result = solution(arg);
		System.out.println("result: "+result);
	}
	
	
	public static int solution(String arg) {
		
		String[] num = new String[3]; //점수(0~10사이의 정수)
		String[] bonus = new String[3]; //보너스(S,D,T)
		String[] option = {"","",""}; //옵션(*,#)
		int chance[] = new int[3]; // 총3번의 기회
		int score = 0;
		//boolean nest = arg.contains("*") & arg.contains("#");
		
		num = arg.split("[SDT](\\*)?(\\#)?");
		bonus = (arg.substring(1,arg.length())).split("(\\*)?(\\#)?\\d+|[^a-zA-Z]");
		option = (arg.substring(2,arg.length())).split("\\d+[SDT]"); //[a-zA-Z0-9]

		for( int i=0; i<3; i++ ) {
			chance[i] = getBonus(bonus[i], Integer.parseInt(num[i]));
			
			if ( option.length != 0 ) { //option이 있으면
				if( option.length > i ) {
					if( i>0 && "*".equals(option[i]) ) {
						chance[i-1] = getOption("*", chance[i-1]);
					}
					chance[i] = getOption(option[i], chance[i]);
				} else {
					break;
				}
			}
		}
		
		for( int j=0; j<chance.length; j++ ) {
			score += chance[j];
		}
		
		return score;
	}
	
	
	public static int getBonus(String bonus, int score) {
		
		switch( bonus ) {
			case "S":
				//score = score;
				break;
			case "D":
				score *= score;
				break;
			case "T":
				score *= score * score;
				break;
		}
		return score;
	}
	
	
	public static int getOption(String option, int score) {
		
		switch ( option ) {
			case "*":
				score = score * 2;
				break;
			case "#":
				score = score * (-1);
				/*if( nest ) {
					score = score * (-1) * 2;
					break;
				} else {
					score = score * (-1);
					break;
				}*/
		}
		return score;
	}
}


