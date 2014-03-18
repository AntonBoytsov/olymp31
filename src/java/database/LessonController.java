/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author anton
 */
@ManagedBean
@SessionScoped
public class LessonController {

    /**
     * Creates a new instance of LessonController
     */
    private LessonHelper helper;
    private String name;
    private Date sdate, fdate;
    
    public LessonController() {
        
        helper = new LessonHelper();
        
    }
    
    private void addLesson() {
        Lesson lesson = new Lesson();
        lesson.setName(getName());
        lesson.setSdate(getSdate());
        lesson.setFdate(getFdate());
        helper.addLesson(lesson);
    }
    
    public void submit() {
        addLesson();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sdate
     */
    public Date getSdate() {
        return sdate;
    }

    /**
     * @param sdate the sdate to set
     */
    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    /**
     * @return the fdate
     */
    public Date getFdate() {
        return fdate;
    }

    /**
     * @param fdate the fdate to set
     */
    public void setFdate(Date fdate) {
        this.fdate = fdate;
    }
    
    
}
