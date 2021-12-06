package controllers;

public class CourseController {
    models.Course model;
    views.OneCourseView view;

    public CourseController(models.Course model, views.OneCourseView view) {
        this.model = model;
        this.view = view;
        this.view.setController(this);

        view.show();
    }

    public void updateModel(String courseNameNumber) {
        // Split the name from the number
        String courseName = "";
        String courseNumber = "";

        model.setCourseName(courseName);
        model.setCourseNumber(courseNumber);

        view.show();
    }

}
