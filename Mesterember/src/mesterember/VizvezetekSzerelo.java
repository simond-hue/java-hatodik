package mesterember;

public class VizvezetekSzerelo extends MesteremberA {
    private int tapasztalatiEvek;

    public VizvezetekSzerelo(String nev, int napiDij, int tapasztalatiEvek) {
        super(nev, napiDij);
        this.tapasztalatiEvek = tapasztalatiEvek;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " --- %d évnyi tapasztalat\n",this.tapasztalatiEvek);
    }

    @Override
    public boolean MunkaVallal(int param) {
        if(param-1 == 0){
            return false;
        }
        else if(param-1 == 30){
            return false;
        }
        else{
            if(!super.foglaltNapok[param-1] 
            && !super.foglaltNapok[param-2]
            && !super.foglaltNapok[param]){
                for(int i = param-2; i<param+1; i++){
                    super.foglaltNapok[i] = true;
                }
                return true;
            }
            else{
                return false;
            }
        }
    }
}
