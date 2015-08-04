/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objdb;

import object.BPlane;

/**
 *
 * @author eploentham
 */
public class BPlaneDB {
    public BPlane pla;
    private ConnectionInf conn;
    public BPlaneDB(ConnectionInf c){
        conn =c;
        initConfig();
    }
    private void initConfig(){
        pla = new BPlane();
        pla.Active="plane_active";
        pla.Brand="brand";
        pla.Code="plane_code";
        pla.Description="description";
        pla.Id="plane_id";
        pla.Model="model";
        pla.Name="plane_name";
        pla.PlaneType="plane_type";
        pla.Remark="remark";
        pla.pk_field="plane_id";
        pla.table="b_plane";
    }
}
