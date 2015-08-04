/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objdb;

import object.TCourseClassStudent;

/**
 *
 * @author eploentham
 */
public class TCourseClassStudentDB {
    public TCourseClassStudent coucs;
    private ConnectionInf conn;
    public TCourseClassStudentDB(ConnectionInf c){
        conn = c;
        initConfig();
    }
    private void initConfig(){
        coucs = new TCourseClassStudent();
        coucs.Active="t_course_class_student_active";
        coucs.ClassCode="class_code";
        coucs.ClassId="class_id";
        coucs.CouId="t_course_id";
        coucs.Id="t_class_student_id";
        coucs.StuId="student_id";
        coucs.coucId="t_course_class_id";
        coucs.pk_field="t_class_student_id";
        coucs.table="t_course_class_student";
        
    }
}
