package views;

public class OneCourseView extends models.Observer {
    private models.Course model;
    private controllers.CourseController controller;

    public OneCourseView(models.Course model, controllers.CourseController controller) {
        this.setModel(model);
        this.setController(controller);
    }

    public void update() {
        this.show();
    }

    public void onCourseUpdate() {
        // Collects the data from the user
        String newCourseInfo = "SE3352 - Requirements Analysis";
        this.controller.updateModel(newCourseInfo);
    }

    public OneCourseView() {
    }

    public void show() {
        // Display or refresh
    }

    public models.Course getModel() {
        return this.model;
    }

    public void setModel(models.Course model) {
        if (this.model != null)
            this.model.dettach(this);

        this.model = model;
        this.model.attach(this);
    }

    public controllers.CourseController getController() {
        return this.controller;
    }

    public void setController(controllers.CourseController controller) {
        this.controller = controller;
    }
}
