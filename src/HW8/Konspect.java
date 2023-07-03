package HW8;

public class Konspect {
    private String subjectName;
    private String studentName;
    private int pageCount;
    private int year;
    private String coverColor;
    private String educationalInstitution;

    // Конструктор класса
    public Konspect(String subjectName, String studentName, int pageCount, int year, String coverColor, String educationalInstitution) {
        this.subjectName = subjectName;
        this.studentName = studentName;
        this.pageCount = pageCount;
        this.year = year;
        this.coverColor = coverColor;
        this.educationalInstitution = educationalInstitution;
    }

    // Геттеры и сеттеры для полей класса
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public String getEducationalInstitution() {
        return educationalInstitution;
    }

    public void setEducationalInstitution(String educationalInstitution) {
        this.educationalInstitution = educationalInstitution;
    }
}
