package controle;

import java.util.List;
import java.util.Map;

public class School {

	// all teachers of a school
	private List<Teacher> teachers;

	/**
	 * Given a teacher's name, list all his lessons.
	 * 
	 * @param teacherName
	 *            the teacher's name, whose lessons should be listed. If null,
	 *            returns an empty list.
	 * 
	 * @return List<Lesson> empty, if no existent teacher matched with the given
	 *         name, or empty, if the teacher has no lessons, otherwise a list
	 *         with all lessons of the teacher.
	 */
	public List<Lesson> getLessons(String teacherName) {
		// TODO
		return null;
	}

	/**
	 * Lists all students of a given lesson.
	 * 
	 * @param lessonName
	 *            the lesson's name, If null, returns an empty list.
	 * 
	 * @return List<Student> empty, if no existent lesson matched with the given
	 *         name, or empty, if the lesson has not students, otherwise a list
	 *         with all students of the lesson.
	 */
	public List<Student> getStudents(String lessonName) {
		// TODO
		return null;
	}

	/**
	 * Finds all classmates of a given student, that is, all other students with
	 * whom the given student attends lessons with.
	 * 
	 * @param student
	 *            a student to have the classmates listed. If null, returns an
	 *            empty list.
	 * 
	 * @return List<Student> empty, if the given student has no classmates,
	 *         otherwise a list containing all classmates of the student.
	 */
	public List<Student> classmates(Student student) {
		// TODO
		return null;
	}

	/**
	 * For each lesson of the school, finds all students that have failed, that
	 * is, the ones that have not achieved the minimum grade established for the
	 * lesson.
	 * 
	 * The lessons, which all students have been approved, should not be shown
	 * in the returning map.
	 * 
	 * @return Map<Lesson, List<Student>> empty, if all students of the school
	 *         have been approved, or empty, if the school has no lessons,
	 *         otherwise a map containing all students that have failed, indexed
	 *         by lesson.
	 */
	public Map<Lesson, List<Student>> failed() {
		// TODO
		return null;
	}

	/**
	 * Lists, in descending order, the ranking of teachers calculated by the
	 * arithmetic mean of the grades of all their students. That is, the first
	 * place of the ranking goes to the teacher, whose arithmetic mean of the
	 * sum of the grades of all his students (considering all the teacher's
	 * lessons) is the highest among all teachers.
	 * 
	 * Only teachers, whose students have been graded, should appear in the
	 * ranking.
	 * 
	 * @return Set<Teacher> empty, if there are no teachers in the school yet,
	 *         or empty, if all teachers have no students/lessons yet, otherwise
	 *         a set containing teachers ordered by the arithmetic mean of the
	 *         sum of the grades of their students.
	 */
	public List<Teacher> teachersRanking() {
		// TODO
		return null;
	}

	public static class Person {
		private String name;
	}

	public static class Teacher extends Person {
		// all lessons of a teacher
		private List<Lesson> lessons;
	}

	public static class Student extends Person {
		// only one grade per lesson
		private Map<Lesson, Double> grades;
	}

	public static class Lesson {
		private String name;

		private Teacher teacher;

		// the minimum grade for a student to be approved in the lesson
		private Double minimumGrade;

		private List<Student> students;
	}

}
