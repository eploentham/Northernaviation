/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objdb;

import object.BClass;

/**
 *
 * @author eploentham
 */
public class BClassDB {
    public BClass cla;
    private ConnectionInf conn;
    public BClassDB(ConnectionInf c){
        conn = c;        
        initConfig();
    }
    private void initConfig(){
        cla = new BClass();
        cla.Active="class_active";
        cla.Code="class_code";
        cla.Description="description";
        cla.Id="class_id";
        cla.NameE="class_name_e";
        cla.NameT="class_name_t";
        cla.Remark="remark";
        cla.pk_field="class_id";
        cla.table="b_class";
    }
}
