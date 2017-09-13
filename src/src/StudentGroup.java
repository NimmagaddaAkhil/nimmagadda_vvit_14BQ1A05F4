import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students.length!=0)
			return students;
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		try
		{
			if(students!=NULL)
				this.students=students;
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Illegal Argument Exception");
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try{
			if(index>=0 && index<students.length)
				return students[index];
		   }
		catch(IllegalArgumentException e)
		{
			System.out.println("Illegal Argument Exception");
		}

		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try{
			if(index>=0 && index<students.length)
				 students[index]=student;
		   }
		catch(IllegalArgumentException e)
		{
			System.out.println("Illegal Argument Exception");
		}
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		try{
			if(index>=0 && index<students.length)
				 System.out.println();
		   }
		catch(IllegalArgumentException e)
		{
			System.out.println("Illegal Argument Exception");
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		try{
			if(students==NULL)
				throw IllegalArgumentException;
		}catch(IllelegalArgumentException e)
		 {
			System.out.println("IllegalArgumentException");
		 }
		for(int i=0;i<students.length;i++)
		{
			if(students[i].compareTo(student)==0)
				break;

		}
		try{
			if()
		   }
		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		Student s[]=new Student[students.length];
		for(Student student:students)
		{
			if(student.getAvgMark()==max)
				s[i++]=student;
		}
		return s;
		
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		double max=0.0;
		int i=0;
		for(Student student:students)
		{
			if(student.getAvgMark()>max)
				max=student.getAvgMark();
		}
		Student s[]=new Student[students.length];
		for(Student student:students)
		{
			if(student.getAvgMark()==max)
				s[i++]=student;
		}
		return s;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		try{
			if(student==NULL)
				throw new IllegalArgumentException("e");
		   }catch(IllegalFormatException e)
		    {
		       System.out.println("IllegalFormatException");
		    }
		for(int i=0;i<students.length;i++){
			if(students[i]==student)
			{
				return students[i+1];
				
			}
		}
		return null;
	}
}
