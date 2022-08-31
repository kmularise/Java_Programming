package day5;
//객체배열
class Data{
    private int no;
    private int score;
    Data(){}
    Data(int no, int score){
        this.no = no;
        this.score = score;
    }

    void print(){
        System.out.println("no :"+no+" score :"+score);
    }
}

public class ObjectArray {
    public static void main(String[] args) {
        Data[] d = new Data [3];
        d[0] = new Data(1,90);
        d[1] = new Data(2,85);
        d[2] = new Data(3, 92);

        for(int i=0; i<d.length; i++){
            d[i].print();
        }

    }
}
