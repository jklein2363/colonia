package colonia.model;

import java.util.Set;

public class Colony {

    private String Name;
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    private Set<String> jobs;
    public Set<String> getJobs() {
        return jobs;
    }

    public void setJobs(Set<String> jobs) {
        this.jobs = jobs;
    }
}
