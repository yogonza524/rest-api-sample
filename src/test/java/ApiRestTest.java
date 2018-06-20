/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.core.model.Proyecto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gonzalo
 */
public class ApiRestTest {
    
    private Gson g;
    
    public ApiRestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        g = new GsonBuilder().setPrettyPrinting().create();
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void consumerTest() throws UnirestException {
         HttpResponse<String> misApadrinados = Unirest.get("http://ec2-18-221-131-163.us-east-2.compute.amazonaws.com/api/all").asObject(String.class);
         
         assertNotNull(misApadrinados);
         
         String result = misApadrinados.getBody();
         
         int inicio = result.indexOf("[");
         int fin = result.indexOf("]") + 1;
         
         result = result.substring(inicio, fin);
         
//         System.out.println(result.substring(result.length() - 10));
         
         //Success
         
         Proyecto[] data = g.fromJson(result, Proyecto[].class);
         
         System.out.println(g.toJson(data[0].getNombreProyecto()));
     }
}
