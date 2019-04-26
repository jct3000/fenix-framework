import pt.ist.fenixframework.Atomic;
// classe consiste numa booleano que faz de tag
public class PersonalData {
    // variables
    boolean personal_tag;
    // Constructor
    public PersonalData() {
        this.personal_tag = true;
    }
    
    // setters getters
    @Atomic
    public void makeprivate() {
        if( personal_tag != true) {
            personal_tag = true;
        }
        
    }
    
    @Atomic
    public void makepublic() {
        if( personal_tag != false) {
            personal_tag = false;
        }
        
    }
    
    public boolean ispublic() {
        return personal_tag;
    }
    
}
