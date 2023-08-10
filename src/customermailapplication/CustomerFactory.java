/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customermailapplication;

/**
 *
 * @author PAktobchawa
 */
public class CustomerFactory {
    public static Customer createCustomer(String type) {
        switch(type) {
            case "1":
                return new RegularCustomer();

            case "2":
                return new MountainCustomer();

            case "3":
                return new DelinquentCustomer();
                
            default:
                return null;
        }
    }
}
