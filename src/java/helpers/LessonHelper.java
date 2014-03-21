/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helpers;

import database.HibernateUtil;
import database.Lesson;
import java.util.List;
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
    }
    
    public void addLesson(Lesson lesson) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            tx.begin();
            session.save(lesson);
            tx.commit();
            session.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Lesson> loadLessonList() {
        List<Lesson> lessonList = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Lesson");
            lessonList = (List<Lesson>)q.list();
            session.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return lessonList;
    }
    
    
}
