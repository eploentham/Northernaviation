/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objdb;

import object.BCompany;

/**
 *
 * @author eploentham
 */
public class BCompanyDB {
    public BCompany comp;
    private ConnectionInf conn;
    public BCompanyDB(ConnectionInf c){
        conn = c;
        initConfig();
    }
    private void initConfig(){
        comp = new BCompany();
        comp.AddrE="company_address_e";
        comp.AddrT="company_address_t";
        comp.Email="company_email";
        comp.Fax="company_Fax";
        comp.Id="company_id";
        comp.Logo="company_logo";
        comp.NameE="company_name_e";
        comp.NameT="company_name_t";
        comp.Tel="company_tel";
        comp.WebSite="company_website";
        comp.TaxId = "tax_id";
        comp.pk_field="company_id";
        comp.table="";
    }
}
