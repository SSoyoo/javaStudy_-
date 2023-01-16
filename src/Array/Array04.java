package Array;

public class Array04 {

	public static void main(String[] args) {
		//시험점수의 평균
		
		int [] students = {100,95,90,89,93};
		int sum =0;
		for(int i= 0; i<students.length ;i++) {
			sum+=students[i];
		}
		
		System.out.println("시험점수의 평균:"+sum/(float)students                                                                                                                                                                                                                                                                                                                                                                                                                                                                                .length);
	}

}
