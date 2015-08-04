/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objdb;

import object.BEmployee;

/**
 *
 * @author eploentham
 */
public class BEmployeeDB {
    public BEmployee emp;
    private ConnectionInf conn;
    public BEmployeeDB(ConnectionInf c){
        conn = c;
        initConfig();
    }
    private void initConfig(){
        emp = new BEmployee();
        emp.Active="emp_active";
        emp.CompId="company_id";
        emp.DepartId="depart_id";
        emp.Holiday="emp_holiday";
        emp.Id="emp_id";
        emp.NameE="emp_name_e";
        emp.NameT="emp_name_t";
        emp.NickName="emp_nickname";
        emp.Password="emp_password";
        emp.Pid="pid";
        emp.Position="emp_position";
        emp.Privilege="emp_privilege";
        emp.RealDay="emp_realday";
        emp.Ssn="emp_ssn";
        emp.TimeRule="emp_timerule";
        emp.Type="emp_type";
        emp.UserName="emp_username";
        emp.WorkType="emp_work_type";
        emp.pk_field="emp_id";
        emp.table="b_employee";
    }
}
