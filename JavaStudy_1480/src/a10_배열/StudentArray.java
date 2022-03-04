package a10_배열;

public class StudentArray {

	public static void main(String[] args) {
		Student[] students = new Student[5];
		students[0] = new Student("진선협", 1);
		students[1] = new Student("진면협", 4);
		students[2] = new Student("진점협", 3);
		students[3] = new Student("선선협", 1);
		students[4] = new Student("미선협", 2);
		
		int yearCount1 = 0;
		int yearCount2 = 0;
		int yearCount3 = 0;
		int yearCount4 = 0;
		String name1 = null;
		String name2 = null;
		String name3 = null;
		String name4 = null;
		/*
		 * 1학년: 2명(진선협, 선선협)
		 * 2학년: 1명(미선협)
		 * 3학년: 1명(진점협)
		 * 4학년: 1명(진면협)
		 */
		
		for(int i = 0; i < students.length; i++) {
			if (students[i].getStudentYear() == 4) {
				yearCount4++;
				if(name4 == null) {
					name4 = students[i].getStudentName()
				}
				
			}
			int studentYear = students[i].getStudentYear();
			if(studentYear == 1) {
				yearCount1++;
			}else if(studentYear == 2) {
			    yearCount2++;	    
			}else if(studentYear == 3) {
			    yearCount3++;			    
			}else if(studentYear == 4) {
			    yearCount4++;    
			    names4[i] = students[i].getStudentName();
			    
			for(int j = 0; j < names1.length; j++) {
				if(names1[j] == null) {
					continue;
				}
				name1 += name
			}
			}
		}
		
		System.out.println("1학년: " + yearCount1 + "명");
		System.out.println("2학년: " + yearCount2 + "명");
		System.out.println("3학년: " + yearCount3 + "명");
		System.out.println("4학년: " + yearCount4 + "명");
		
		}
		
	}
