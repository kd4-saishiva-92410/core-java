package Assign9Q2;
import java.util.*;
import Assign9Q2.*;

public class ProjectsOperations {
	
	public static int menulist() {
		Scanner sc= new Scanner(System.in);
		System.out.println("0.exit");
	    System.out.println("1. Add Dummy Data of Projects in the Set");
	    System.out.println("2. Input a Project from user and add in Set");
	    System.out.println("3. Display all Projects in Set");
	    System.out.println("4. Delete a Project by Id from Set");
	    System.out.println("5. Copy All Projects from Set to ArrayList");
	    System.out.println("6. Display all Projects from List");
	    System.out.println("7. Sort all Projects in List by cost");
	    System.out.println("8. Find project with Max team size");
	    System.out.print("Enter your choice: ");
	    return sc.nextInt();
	}
	
	public static HashSet<Project> addAllInSet() {
	    HashSet<Project> hset = new HashSet<>();
	    
	    // Add dummy projects to the set
	    hset.add(new Project(1, "Train Reservation System", 4, 5000000, "Java"));
	    hset.add(new Project(2, "Airline Reservation System", 3, 6000000, ".NET"));
	    hset.add(new Project(4, "Online Grocery Shop", 6, 3000000, "Java"));
	    hset.add(new Project(5, "Online Book Shop", 2, 3000000, ".NET"));
	    hset.add(new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"));
	    hset.add(new Project(6, "Bus Reservation System", 3, 3500000, "JS")); // Fixed duplicate ID
	    
	    return hset;
	}
	
	public static void addProjectFromUser(HashSet<Project> hset, Scanner sc) {
	    Project p1= new Project();
		System.out.print("Enter Project ID: ");
	    int id = sc.nextInt();
	    p1.setId(id);
	    sc.nextLine(); 
	    
	    System.out.print("Enter Project Title: ");
	    String title = sc.nextLine();
	    p1.setTitle(title);
	    
	    System.out.print("Enter Team Size: ");
	    int teamSize = sc.nextInt();
	    p1.setTeamSize(teamSize);
	    
	    System.out.print("Enter Project Cost: ");
	    double projectCost = sc.nextDouble();
	    p1.setProjectCost(projectCost);
	    
	    sc.nextLine(); 
	    System.out.print("Enter Technology: ");
	    String technology = sc.nextLine();
	    p1.setTechnology(technology);
	
	    if(hset.add(p1)) System.out.println("Added successfully ");
	    else System.out.println("Not Added as an Project with same Id already exists :"+id);
	   
	}
	
	
	public static void allProjectDisplay(HashSet<Project> hset) {
	
		hset.forEach(h->System.out.println(h.toString()));
		
	}
	
	public static void deleteProjectById(HashSet<Project> hset, Scanner sc) {
	    System.out.print("Enter Project ID to delete: ");
	    int idToDelete = sc.nextInt();
	    
	    Project dummy = new Project();
	    dummy.setId(idToDelete);
	    
	    if (hset.remove(dummy)) {
	        System.out.println("Project deleted successfully!");
	    } else {
	        System.out.println("Project not found!");
	    }
	}
	
	public static ArrayList<Project> copySetToArrayList(HashSet<Project> hset) {
	    return new ArrayList<>(hset);
	}
	public static void displayProjectsFromList(ArrayList<Project> list) {
	    for (Project p : list) {
	        System.out.println(p);
	    }
	}

	
	public static void sortProjectsByCost(ArrayList<Project> list) {
	    Collections.sort(list, new SortByCost());
	    System.out.println("Projects sorted by cost.");
	}
	
	
	
	public static void findProjectWithMaxTeamSize(ArrayList<Project> list) {
	    if (list.isEmpty()) {
	        System.out.println("No projects available,EmptyList!");
	        return;
	    }
	    
	    Project maxProject = list.get(0);
	    for (Project p : list) {
	        if (p.getTeamSize() > maxProject.getTeamSize()) {
	            maxProject = p;
	        }
	    }
	}
	

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    HashSet<Project> hset = addAllInSet();
	    ArrayList<Project> projectList = null;
	    
	    while (true) {
	        int choice = menulist();
	        
	        switch (choice) {
	            case 1:
	                hset = addAllInSet();
	                System.out.println("Dummy data added!");
	                break;
	                
	            case 2:
	                addProjectFromUser(hset, sc);
	                break;
	                
	            case 3:
	                allProjectDisplay(hset);
	                break;
	                
	            case 4:
	                deleteProjectById(hset, sc);
	                break;
	                
	            case 5:
	                projectList = copySetToArrayList(hset);
	                System.out.println("Copied to ArrayList!");
	                break;
	                
	            case 6:
	                if (projectList != null && !projectList.isEmpty()) {
	                    displayProjectsFromList(projectList);
	                } else {
	                    System.out.println("ArrayList is empty! .");
	                }
	                break;
	                
	            case 7:
	                if (projectList != null && !projectList.isEmpty()) {
	                    sortProjectsByCost(projectList);
	                } else {
	                    System.out.println("ArrayList is empty!.");
	                }
	                break;
	                
	            case 8:
	                if (projectList != null && !projectList.isEmpty()) {
	                    findProjectWithMaxTeamSize(projectList);
	                } else {
	                    System.out.println("ArrayList is empty! Copy projects first (Option 5).");
	                }
	                break;
	                
	            default:
	                System.out.println("Invalid choice! Exiting...");
	                sc.close();
	                return;
	        }
	    }
	}

}
