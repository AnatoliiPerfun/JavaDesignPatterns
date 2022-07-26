package Patterns.AdditionalPatterns.Serializable;

import java.io.IOException;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/26/2022 - 4:13 PM
 */
public class SerializationTest {

    public static void main(String[] args) {
        String fileName="employee.ser";
        Employee emp = new Employee();
        emp.setId(100);
        emp.setName("Tolik");
        emp.setSalary(50000);

        //serialize to file
        try {
            SerializationUtil.serialize(emp, fileName);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Employee empNew = null;
        try {
            empNew = (Employee) SerializationUtil.deserialize(fileName);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        System.out.println("emp Object::"+emp);
        System.out.println("empNew Object::"+empNew);
    }

}
