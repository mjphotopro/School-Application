/*
 * Handles all events on the classroom report form
 */
package controller.ReportViewControllers;


import model.DataModel;
import view.ReportViews.ClassroomReportView;

public class ClassroomReportViewController extends ReportViewController {

    // Constructor
    public ClassroomReportViewController(DataModel dataModel) {
        super(dataModel);
        updateUI();
    }


    @Override
    protected void createView() {
        this.setView(new ClassroomReportView(this));
    }


}
