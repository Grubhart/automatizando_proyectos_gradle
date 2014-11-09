package com.manning.gia.todo.model;


/**
 * Created by Grubhart on 05/11/2014.
 */
public class ToDoItem implements Comparable<ToDoItem>{


    private Long id;
    private String name;
    private boolean completed;
    private String algo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToDoItem)) return false;

        ToDoItem toDoItem = (ToDoItem) o;

        if (completed != toDoItem.completed) return false;
        if (id != null ? !id.equals(toDoItem.id) : toDoItem.id != null) return false;
        if (name != null ? !name.equals(toDoItem.name) : toDoItem.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (completed ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", completed=" + completed +
                '}';
    }

    @Override
    public int compareTo(ToDoItem o) {
        return 0;
    }
}
