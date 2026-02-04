package in.zerp.tournament;

import java.util.*;
class Arena{
    public final String name;
    public final Address address;
    public final int capacity;
    private List<Audiance> audiances;
    protected ShuttleCock shuttleCock;

    public Arena(Address address, List<Audiance> audiances, int capacity, String name, ShuttleCock shuttleCock) {
        this.address = address;
        this.audiances = audiances;
        this.capacity = capacity;
        this.name = name;
        this.shuttleCock = shuttleCock;
    }

    public List<Audiance> getAudiances() {
        return audiances;
    }

    public void setAudiances(List<Audiance> audiances) {
        this.audiances = audiances;
    }
    
}
