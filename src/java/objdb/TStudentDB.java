/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objdb;

import object.TStudent;

/**
 *
 * @author eploentham
 */
public class TStudentDB {
    public TStudent stu;
    private ConnectionInf conn;
    public TStudentDB(ConnectionInf c){
        conn =c;
        
    }
    private void initConfig(){
        stu = new TStudent();
        stu.Active="student_active";
        stu.BirthDay="birthday";
        stu.Id="student_id";
        stu.LastNameE="student_lastname_e";
        stu.LastNameT="student_lastname_t";
        stu.NameE="student_name_e";
        stu.NameT="student_name_t";
        stu.PrefixName="prefix_name";
        stu.Remark="remark";
        stu.pk_field="student_id";
        stu.table="t_student";
    }
}
