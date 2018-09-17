package com.taurus.workwithpoi.excel;

import net.sf.excelutils.ExcelException;
import net.sf.excelutils.ExcelUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Kelvin Yeung on 2018/8/28.
 */
public class ExcelUtilsDemo {

    public static void main(String[] arg){

        String path = ExcelException.class.getClassLoader().getResource("").getPath();
        System.out.println("path:"+path);

        Employee kelvin = new Employee("Kelvin","9527",20000d);

        List<Object> details = new ArrayList();
        Employee e1 = new Employee("employee01","001",10000d);
        Employee e2 = new Employee("employee02","002",10000d);
        Employee e3 = new Employee("employee03","003",10000d);
        Employee e4 = new Employee("employee04","004",10000d);
        Employee e5 = new Employee("employee05","005",10000d);
        details.add(new Object[]{kelvin,e1,e2,e3,e4,e5});



        ExcelUtils.addValue("printDate","2018-12-31");
        ExcelUtils.addValue("user",kelvin);
        ExcelUtils.addValue("list",details);

        String template = path+"template/template.xlsx";

        try{
            ExcelUtils.export(template,new FileOutputStream(path+"excelUtils-demo.xlsx"));
        }catch (ExcelException e){

            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }


    }
}
