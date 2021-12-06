import views.OneCourseView;

public class CourseAppEntryPoint {
    public static void main(String[] args) {
        models.Course m = new models.Course();
        views.OneCourseView v = new OneCourseView();

        controllers.CourseController c = new controllers.CourseController(m, v);

    }
}
