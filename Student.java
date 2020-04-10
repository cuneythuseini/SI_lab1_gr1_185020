class Student {
	private String index;
	private String firstName;
	private String lastName;
	private List<Integer> labPoints = new ArrayList<Integer>();

    public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.labPoints = labPoints;
    }
//TODO constructor

	//TODO seters & getters

	public double getAverage() {
		//TODO
        int total = 0;
        for (int iter : labPoints) {
            total += iter;
        }
        return (total / (double) labPoints.size());
	}

	public boolean hasSignature() {
		//TODO
        if(labPoints.size() > 8) {
            return true;
        } else {
            return false;
        }
	}

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Integer> getLabPoints() {
        return labPoints;
    }

    public void setLabPoints(List<Integer> labPoints) {
        this.labPoints = labPoints;
    }
}
class Course {
    List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void showInfos(Student student) {
        System.out.println("Index: " + student.getIndex());
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Lab Points: " + student.getLabPoints());
        System.out.println("Average: " + student.getAverage());
        System.out.println("Has Signature: " + student.hasSignature());
    }
}