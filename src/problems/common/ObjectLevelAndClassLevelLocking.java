package problems.common;

public class ObjectLevelAndClassLevelLocking {

    public static void main(String[] args) {
        ObjectLevelAndClassLevelLocking obj  = new ObjectLevelAndClassLevelLocking();
        obj.t1.start();
        obj.t2.start();
        obj.t3.start();
        obj.t4.start();

    }

    Thread t1 = new Thread(() ->{
        System.out.println(Thread.currentThread().getName());
        synchronized(this){
            System.out.println("in block" + Thread.currentThread().getName() + "start");
            System.out.println("in block" + Thread.currentThread().getName() + "end");
        }
    });
    Thread t2 = new Thread(() ->{
        System.out.println(Thread.currentThread().getName());
        synchronized(this){
            System.out.println("in block" + Thread.currentThread().getName() + "start");
            System.out.println("in block" + Thread.currentThread().getName() + "end");
        }
    });

    Thread t3 = new Thread(() ->{
        System.out.println(Thread.currentThread().getName());
        synchronized(ObjectLevelAndClassLevelLocking.class){
            System.out.println("in block" + Thread.currentThread().getName() + "start");
            System.out.println("in block" + Thread.currentThread().getName() + "end");
        }
    });

    Thread t4 = new Thread(() ->{
        System.out.println(Thread.currentThread().getName());
        synchronized(ObjectLevelAndClassLevelLocking.class){
            System.out.println("in block" + Thread.currentThread().getName() + "start");
            System.out.println("in block" + Thread.currentThread().getName() + "end");
        }
    });


}





