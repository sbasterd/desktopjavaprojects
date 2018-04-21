import com.deitel.datastructures.EmptyListException;
import com.deitel.datastructures.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list=new List<>("integerList");
        list.insertAtFront(-1);
        list.print();
        list.insertAtFront(0);
        list.print();
        list.insertAtFront(1);
        list.print();
        list.insertAtFront(5);
        list.print();
        list.insertAtFront(10);
        list.print();
        list.insertAtFront(-4);
        list.print();
        try {
            int removedItem=list.removeFromFront();
            System.out.printf("%n%d Removed %n",removedItem);
            list.print();

            removedItem=list.removeFromFront();
            System.out.printf("%n%d Removed %n",removedItem);
            list.print();

            removedItem=list.removeFromBack();
            System.out.printf("%n%d Removed %n",removedItem);
            list.print();

            removedItem=list.removeFromBack();
            System.out.printf("%n%d Removed %n",removedItem);
            list.print();
        }catch (EmptyListException e){
            e.printStackTrace();
        }
    }
}
