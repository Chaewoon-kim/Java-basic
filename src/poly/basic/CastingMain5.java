package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child(); //부모는 자식을 품을 수 있지만, 자식의 메서드에 접근하지는 못함.
        System.out.println("parent2 호출");
        call(parent2);

    }

    //instanceof
    private static void call(Parent parent){
        parent.parentMethod();
        //Child 인스턴스인 경우 childMethod()실행
        if(parent instanceof Child)
            /*parent에 Child 메서드가 있다면(인스턴스에 childMethod가 있다면 = instanceof). 여기서는 parent2*/{
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child)parent;
            child.childMethod();
        }

    }
}
