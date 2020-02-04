package source.pack1;

class Father {

}

public class A001 {

    public static class B001 {

    }

    public class C001 {

    }

    public void s1() {

        class D001 {

        }
        class E001 {

        }
    }

    public void s2() {

        class D001 {

        }
        class E001 {

        }
    }

    public void s3() {

        class F001 {

        }
        class G001 {

        }
    }

    public void s4() {

        new Father() {
            void m1() {
            }
        };
        new Father() {
            void m2() {
            }
        };
    }

    public void s5() {
        new Father() {
            void m1() {
            }
        };
        new Father() {
            void m2() {
            }
        };
    }  
}
