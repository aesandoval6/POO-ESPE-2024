package ec.edu.espe.POOExamUnit1.model;

import com.google.gson.Gson;

/**
 *
 * @author G406
 */
public class Picture {
    private int id;
    private String name;
    private String author;
    private String deliveredDate;

    public Picture(int id, String name, String author, String deliveredDate) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.deliveredDate = deliveredDate;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the deliveredDate
     */
    public String getDeliveredDate() {
        return deliveredDate;
    }

    /**
     * @param deliveredDate the deliveredDate to set
     */
    public void setDeliveredDate(String deliveredDate) {
        this.deliveredDate = deliveredDate;
    }

    @Override
    public String toString() {
        return "Picture{" + "id=" + id + ", name=" + name + ", author=" + author + ", deliveredDate=" + deliveredDate + '}';
    }
    
    public String toStringJSON() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
