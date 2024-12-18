package oopIntro.Odev1;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",21,"Engin Demiroğ");
        Course course2 = new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",56,"Engin Demiroğ");
        Course course3 = new Course(3,"(2023) Yazılım Geliştirici Yetiştirme Kampı (Python & Selenium)",0,"Halit Enes Kalaycı");
        Course course4 = new Course(4,"Yazılım Geliştirici Yetiştirme Kampı (JavaScript)",75,"Engin Demiroğ");

        Course[] courses = {course1,course2,course3,course4};
        //System.out.println(courses.length);

        for(Course course:courses){
            System.out.println(course.courseName);
        }

        CourseManager courseManager = new CourseManager();
        courseManager.enroll(course1);
        courseManager.unenroll(course2);
		

	}

}
