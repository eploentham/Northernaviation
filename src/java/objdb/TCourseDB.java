/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objdb;

import object.TCourse;

/**
 *
 * @author eploentham
 */
public class TCourseDB {
    public TCourse cou;
    private ConnectionInf conn;
    public TCourseDB(ConnectionInf c){
        conn = c;
        initConfif();
    }
    private void initConfif(){
        cou = new TCourse();
        cou.Active="t_course_active";
        cou.CouId="course_id";
        cou.CouPeriod="course_period";
        cou.EndDate="end_date";
        cou.Id="t_course_id";
        cou.InstructorId="instructor_id";
        cou.StartDate="start_date";
        cou.pk_field="t_course_id";
        cou.table="t_course";
    }
}
