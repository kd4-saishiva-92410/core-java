package Assign9Q2;
import java.util.*;

public class Project {
    private int id;
    private String title;
    private int teamSize;
    private double projectCost;
    private String technology;

    // Default constructor
    public Project() {
    }

    // Parameterized constructor
    public Project(int id, String title, int teamSize, double projectCost, String technology) {
        this.id = id;
        this.title = title;
        this.teamSize = teamSize;
        this.projectCost = projectCost;
        this.technology = technology;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public double getProjectCost() {
        return projectCost;
    }

    public String getTechnology() {
        return technology;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void setProjectCost(double projectCost) {
        this.projectCost = projectCost;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
    
    
    @Override
    public boolean equals(Object o) {
		if(this==o||this==null) return false;
		else if(!(o instanceof Project)) return false;
    	Project p=(Project)o;
    	if(this.getId()==p.getId()) return true;
    	else return false;
    	
    }

	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", teamSize=" + teamSize + ", projectCost=" + projectCost
				+ ", technology=" + technology + "]";
	}
    
	@Override
	public int hashCode() {
	    return Integer.hashCode(id);
	}
    
    
    
    
}