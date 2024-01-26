package rajdeep;

public class Custom_ArrayList {

    private int[] arr;
    private static int default_size=10;
    private int size=0;

    public Custom_ArrayList(){
        arr=new int[default_size];
    }

    public Custom_ArrayList(int size){
        arr=new int[size];
    }

    public void add(int data) {
        if (size == arr.length) {
            resize();
        }
        arr[size] = data;
        size++;
    }


    private void resize() {
        int temp[]=new int[2*size];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
    }

    public void remove(int index){
        if(index<0||index>=size){
            System.out.println("Invalid index");
        }
        else{
            for(int i=index;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            size--;
        }
    }

    public String toString(){
        String str="[";
        for(int i=0;i<size;i++){
            str=str+arr[i];
            if(i<size-1){
                str=str+",";
            }
        }
        str=str+"]";
        return str;
    }

    public static void main(String[] args) {
        Custom_ArrayList list=new Custom_ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }
}
