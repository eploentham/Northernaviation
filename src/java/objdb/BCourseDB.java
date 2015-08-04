/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objdb;

import object.BCourse;

/**
 *
 * @author eploentham
 */
public class BCourseDB {
    public BCourse cou;
    private ConnectionInf conn;
    public BCourseDB(ConnectionInf c){
        conn = c;
        initConfif();
    }
    private void initConfif(){
        cou = new BCourse();
        cou.Active="course_active";
        cou.Code="course_code";
        cou.Description="description";
        cou.Id="course_id";
        cou.NameE="course_name_e";
        cou.NameT="course_name_t";
        cou.Remark="remark";
        cou.pk_field="course_id";
        cou.table="b_course";
    }
}
