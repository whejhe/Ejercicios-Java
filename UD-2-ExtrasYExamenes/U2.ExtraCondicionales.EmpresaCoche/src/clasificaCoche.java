/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class clasificaCoche {
    
    public int clasificaCoche(Coche c){
        
        if(c.isElectrico()==true || (c.getPotencia()>150 && c.getAniosAntiguedad()<3)){
            return 1;
        }else if(c.getAniosAntiguedad()>=3 || c.getAniosAntiguedad()<=5 && c.getPotencia()>100 && (c.isABS()==true || c.isAirbag()==true)){
            return 2;
        }else{
            return 3;
        }
      
    }
    
}
