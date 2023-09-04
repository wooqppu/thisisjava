package day05.exam01;

public class ArrayCopyExam {

	public static void main(String[] args) {
		int[] oldIntArray = {10,20,30};
		int[] newIntArray = new int[3];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];

		}
		// 배열 복사가 아닌 배열의 참조 번지 복사
		int[] newIntArray2 = oldIntArray; // ---> 잘못된 복사 방법 // 복사한 개체의 값을 바꾸면 같이 영향을 받음
		oldIntArray[0] = 100;
		for(int i=0; i<newIntArray2.length; i++) {
			System.out.println(newIntArray2[i]);
		}
		for(int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i]);
		}
		// String 배열
		String[] oldstrArray = {"java", "array", "copy"};
		String[] newstrArray1 = oldstrArray;
		System.out.println(newstrArray1[2]);
		String[] newstrArray2 = new String[5];
		//{null,null,null,null,null}
		for(int i=0; i<oldstrArray.length; i++) {
			//newstrArray2[0] = "java"
			//newstrArray2[1] = "array"
			//newstrArray2[2] = "copy"
			newstrArray2[i] = oldstrArray[i];
		}
		for(int i=0; i<newstrArray2.length; i++) {
			System.out.println(newstrArray2[i]);
		}
		
		System.out.println("----------------------------");
		int[] oldnums = {10,20,30};
		int[] newnums = new int[5];
		System.arraycopy(oldnums, 0, newnums, 0, 3); // 10 20 30 0 0
//		for(int i=0; i<newnums.length; i++) {
//			System.out.println(newnums[i] + " ");
//		}
		
		for(int i : newnums) {
			System.out.print(i + " ");
		} 
		String[] str2 = {"a", "b", "c", "d", "e"};
		for(String s: str2) {
			System.out.println(s);
		}
		
		int[] scores = {95,71,84,93,87};
		int sum = 0;
		for (int i : scores) {
			sum = sum + i;
		}
		System.out.println("합계는 : " + sum);
	}

}
