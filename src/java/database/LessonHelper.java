/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author anton
 */
public class LessonHelper {
    
    Session session = null;
    public LessonHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public void addLesson(Lesson lesson) {
        try {
            Transaction tx = session.beginTransaction();
            tx.begin();
            session.save(lesson);
            tx.commit();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
