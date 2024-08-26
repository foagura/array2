import java.util.ArrayList;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(1);
        scores.add(5);
        scores.add(10);
        scores.add(15);

        System.out.println(scores.get(0));
        System.out.println(scores.get(1));
        System.out.println(scores.get(2));
        System.out.println(scores.get(3));

        /*　ArrayListを使用する場合下記のように記述　*/
        /*　ArrayList<データ型> 名前 = new ArrayList<データ型>();　*/
        /*　下記の用に右辺のデータ型は省略もできる　*/
        /*　ArrayList<データ型> 名前 = new ArrayList<>();　*/
    }
}