package database;
// Generated 18.03.2014 23:23:25 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Lesson generated by hbm2java
 */
public class Lesson  implements java.io.Serializable {


     private int id;
     private String name;
     private Date sdate;
     private Date fdate;

    public Lesson() {
    }

	
    public Lesson(int id) {
        this.id = id;
    }
    public Lesson(int id, String name, Date sdate, Date fdate) {
       this.id = id;
       this.name = name;
       this.sdate = sdate;
       this.fdate = fdate;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Date getSdate() {
        return this.sdate;
    }
    
    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }
    public Date getFdate() {
        return this.fdate;
    }
    
    public void setFdate(Date fdate) {
        this.fdate = fdate;
    }




}


