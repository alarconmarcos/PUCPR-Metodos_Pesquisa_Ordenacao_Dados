public class No {
    private Integer info;
    private No prox;

    public No() {
        info = null;
        prox = null;
    }

    public void setInfo(int info){
        this.info = info;
    }

    public void setProx(No prox){
        this.prox = prox;
    }
    
    public No getProx(){
        return this.prox;
    }

    public Integer getInfo(){
        return this.info;
    }
}
