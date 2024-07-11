package com.jspiders.PanCard;

import com.jspiders.PanCard.dao.panDao;
import com.jspiders.PanCard.dao.personDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args)
    {
        //System.out.println("Hello World!");
    	panDao.insertpan();
    	personDao.insertPerson(80);
        
    }
}
