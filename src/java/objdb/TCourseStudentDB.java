/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objdb;

import object.TCourseStudent;

/**
 *
 * @author eploentham
 */
public class TCourseStudentDB {
    public TCourseStudent cous;
    private ConnectionInf conn;
    public TCourseStudentDB(ConnectionInf c){
        conn=c;
        initConfig();
    }
    private void initConfig(){
        cous = new TCourseStudent();
        cous.Active="t_course_student_active";
        cous.CouCode="course_code";
        cous.CouId="t_course_id";
        cous.Id="course_student_id";
        cous.StuId="t_student_id";
        cous.pk_field="course_student_id";
        cous.table="t_course_student";
    }
}
