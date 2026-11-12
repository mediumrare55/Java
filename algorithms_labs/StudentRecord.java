public class StudentRecord implements Comparable<StudentRecord> {
    private final String name;
    private final int grade;
    private final int group;

    public StudentRecord(String name, int grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public int compareTo(StudentRecord other) {
        if (group != other.group) {
            return Integer.compare(group, other.group);
        }
        if (grade != other.grade) {
            return Integer.compare(other.grade, grade);
        }
        return name.compareTo(other.name);
    }
}
