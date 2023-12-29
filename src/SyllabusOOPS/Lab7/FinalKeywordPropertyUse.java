package SyllabusOOPS.Lab7;
class finalVariableProperty{
    final  int a = 61;
}
final class unInheritedClass{
    int roll = 61;
}
//class trying extends unInheritedClass{
//    int roll = 61;
//}
class methodFinal{
    public final void unInheritedMethod(int b){
        int c = 61;
        System.out.println(b+c);
    }
}
class methofFinalUse extends methodFinal{
//    public void unInheritedMethod(int b){
//        System.out.println(b);
//    }
}
public class FinalKeywordPropertyUse {
    public static void main(String[] args) {
        finalVariableProperty x = new finalVariableProperty();
//        x.a = 61;
        System.out.println(x.a);
        methodFinal z = new methodFinal();
        z.unInheritedMethod(61);
    }
}

