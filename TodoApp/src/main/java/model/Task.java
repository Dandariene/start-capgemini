package model;

import java.util.Date;

public class Task {

    private int id;
    private int idProject;
    private String name;
    private String description;
    private String notes;
    private boolean conpleted;
    private Date deadline;
    private Date createdAt;
    private Date updateAt;

    public Task(int id, int idProject, String nome, String description, String notes, boolean conpleted, Date deadline, Date createdAt, Date updateAt) {
        this.id = id;
        this.idProject = idProject;
        this.name = name;
        this.description = description;
        this.notes = notes;
        this.conpleted = conpleted;
        this.deadline = deadline;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }
    
    public Task(){
        this.createdAt = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isConpleted() {
        return conpleted;
    }

    public void setConpleted(boolean conpleted) {
        this.conpleted = conpleted;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", idProject=" + idProject + ", nome=" + name + ", description=" + description + ", notes=" + notes + ", conpleted=" + conpleted + ", deadline=" + deadline + ", createdAt=" + createdAt + ", updateAt=" + updateAt + '}';
    }

}
