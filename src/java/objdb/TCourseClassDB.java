/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objdb;

import object.TCourseClass;

/**
 *
 * @author eploentham
 */
public class TCourseClassDB {
    public TCourseClass couc;
    private ConnectionInf conn;
    public TCourseClassDB(ConnectionInf c){
        conn =c;
        
    }
    private void initConfig(){
        couc = new TCourseClass();
        couc.Active="t_course_class_active";
        couc.ClassCode="class_code";
        couc.ClassId="class_id";
        couc.CouId="t_course_id";
        couc.EndDate="end_date";
        couc.Id="t_course_class_id";
        couc.InstructorId="instructor_id";
        couc.PlaneId="plane_id";
        couc.Remark="remark";
        couc.StartDate="start_date";
        couc.StatusPlane="status_plane";
        couc.pk_field="t_course_class_id";
        couc.table="t_course_class";
    }
}
