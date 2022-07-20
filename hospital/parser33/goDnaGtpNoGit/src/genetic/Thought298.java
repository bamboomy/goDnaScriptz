package genetic;
import java.util.ArrayList;
class Thought298 extends Thought{
private static ArrayList<Thought298> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 934.795214023675;
private double fd1 = 707.4315685087871;
private Thought fo0 = null;
private Thought fo1 = null;
Thought298 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought298 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought298 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought298 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought298 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought298 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought298 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought298 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought298 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought298 instance = new Thought298 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought298 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought298 instance = new Thought298 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought298 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought298 instance = new Thought298 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought298 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought298 instance = new Thought298 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought298 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought298 instance = new Thought298 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought298 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought298 instance = new Thought298 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought298 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought298 instance = new Thought298 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought298 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought298 instance = new Thought298 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        lb0 = fb0 || fb1;
        for(int i1=0; i1<10; i1++){
            boolean lb1 = true;
            lb1 = lb0 && fb0;
            fb1 = fd0 > fd1;
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb1, lb0, fb0, fb1);
}
            lb1 = lb0 && fb0;
            double ld2 = 304.7813965822812;
            Thought lo3 = Thought107.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
              fo0.m2(fd0, fd1, ld2, fd0);
}
            fb1 = !lb1;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
            }
        }
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1();
}
    Thought lo4 = Thought399.getInstance(fb1, fb0, fb1, fb0);
    Thought lo5 = Thought344.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb6 = false;
    Thought lo7 = Thought280.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 757.4322544411309;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[2][7] += ld0;
    ab3 = fd0 > fd1;
    double ld1 = 464.5533760132786;
if(fo1 != null){
      ld0 = fo1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ld1 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(ld1, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    ld1 *= -1;
    fd0 = fd1 - ld0;
    ld1 = fd0 + fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = ld1 < fd0;
    fb0 = fb1 || ab1;
    ab2 = fd1 < ld0;
    ab3 = ab4 || fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || lb0;
    double ld1 = 374.67158550458004;
    fd0 *= -1;
    fb0 = fd1 > ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    if (fb1) {
        fd0 = fd1 - ld1;
        double ld2 = 797.6003595197182;
        double ld3 = 462.8373149029864;
        boolean lb4 = false;
if(fo1 != null){
          fo1.m3();
}
        ld3 *= -1;
if(fo0 != null){
          ld1 = fo0.m3(lb4, lb0, fb0, fb1);
}
        Thought lo5 = Thought204.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb4, lb0, fb0, fb1);
        fd0 *= -1;
        } else if (lb0) {
        } else if (fb0) {
        Output.points[2][8] -= ad1;
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        fb0 = fb1 || ab1;
    Output.points[3][0] += fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    double ld0 = 468.16642855359623;
    Thought lo1 = Thought380.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
if(ao4 != null){
      fd1 = ao4.m3(ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb2, fb0);
}
    boolean lb3 = true;
    boolean lb4 = true;
    double ld5 = 418.4720873232519;
    ld5 = fd0 - fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    ld5 = fd0 - fd1;
    Thought lo6 = Thought262.getInstance(ld0, ld5, fd0, fd1);
    ld0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    fb0 = fb1 && fb0;
    fb1 = ad3 > ad4;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought56.getInstance();
if(ao1 != null){
      ao1.m3(fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
    fb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
    fb0 = !fb1;
    fb0 = fd1 < ad1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    Thought lo0 = Thought265.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    double ld1 = 718.0169427999874;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    boolean lb2 = false;
    Output.points[3][1] -= ld1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
    boolean lb3 = false;
if(fo1 != null){
          fo1.m1();
}
    ld1 = fd0 + fd1;
if(ao1 != null){
      ao1.m1(ab4, fb0, fb1, lb2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, lb3, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb2);
}
    lb3 = fd1 < ld1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
    Output.points[3][2] -= ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
    double ld1 = 561.6759203227894;
    ab4 = ad2 > ad3;
    fb0 = ad4 > fd0;
    fb1 = fd1 > ld1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
    fd0 = fd1 - ld1;
    Thought lo3 = Thought6.getInstance();

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[3][3] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    if (lb0) {
        if (lb1) {
            fb0 = fd1 > fd0;
            fd1 = fd0 + fd1;
            Thought lo2 = Thought118.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
            fd0 = fd1 - fd0;
            Thought lo3 = Thought164.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
            Thought lo4 = Thought77.getInstance(fo0, fo1, fo0, fo1);
}}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought204.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought306.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    boolean lb2 = false;
    double ld3 = 436.85151446793583;
if(fo1 != null){
      ld3 = fo1.m3(fd0, fd1, ld3, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, ld3, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
}
    fd0 = fd1 + ld3;
    ab4 = fd0 < fd1;
    fb0 = !fb1;
    ld3 = fd0 - fd1;
    lb2 = !ab1;
    Thought lo4 = Thought63.getInstance();
    ab2 = ab3 && ab4;
    fb0 = ld3 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb2, ab1, ab2);
}
    ab3 = ab4 && fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
    double ld2 = 571.3482936185153;
    fb1 = ad3 > ad4;
    double ld3 = 215.45566148746292;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld3, lb0, lb1, fb0, fb1);
}
    Thought lo4 = Thought335.getInstance(ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
    fd0 *= -1;
    boolean lb5 = true;
    lb0 = lb1 && lb5;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      lb5 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld6 = 398.7423397889599;
    boolean lb7 = true;
    Thought lo8 = Thought244.getInstance(fd0, fd1, ld2, ld3);

Thought.STACK_COUNTER++;
return lb7;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    double ld0 = 928.8742027849619;
    boolean lb1 = false;
    lb1 = ab1 && ab2;
    ad1 = ad2 + ad3;
    boolean lb2 = false;
if(fo0 != null){
      ad4 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, fb1, lb1, lb2, ab1);
}
    ad2 *= -1;
    Thought lo3 = Thought18.getInstance(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    double ld4 = 280.8393590621394;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb1, lb2, ab1, ab2);
}
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld4 = ad1 + ad2;
    if (ab3) {
}
Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    lb0 = fb0 || fb1;
    double ld1 = 110.43811854735887;
    lb0 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        double ld2 = 281.58233907656523;
        lb0 = ld1 < fd0;
        fd1 = ld2 + ld1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld2, ld1);
}
        fb0 = fd0 < fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ld1, fd0, fd1);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
        fb1 = lb0 || fb0;
        Output.points[3][4] -= ld2;
        fb1 = !lb0;
        Thought lo3 = Thought170.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld2, fb1, lb0, fb0, fb1);
}
        Thought lo4 = Thought355.getInstance(ld1, fd0, fd1, ld2, lb0, fb0, fb1, lb0);
if(fo0 != null){
          ld1 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought65.getInstance();
    fd1 *= -1;
    double ld1 = 840.7012434335186;
    fb1 = ld1 < ad1;
    boolean lb2 = false;
    ad2 = ad3 + ad4;
    lb2 = fd0 > fd1;
    Thought lo3 = Thought56.getInstance(fb0, fb1, lb2, fb0);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3, fb1, lb2, fb0, fb1);
}
    ad4 = fd0 + fd1;
if(ao1 != null){
      lb2 = ao1.m2(ld1, ad1, ad2, ad3, fb0, fb1, lb2, fb0);
}
    double ld4 = 661.1033347875791;
    ad3 = ad4 - fd0;
    fd1 = ld1 - ld4;
    double ld5 = 430.4088204814941;
    boolean lb6 = true;
    for(int i0=0; i0<10; i0++){
        Output.points[3][5] -= ld5;
        ad1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb2, lb6);
}
        fb0 = !fb1;
        ad2 *= -1;
        ad3 *= -1;
        lb2 = lb6 && fb0;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    if (ab4) {
        fd0 = fd1 - fd0;
        Output.points[3][6] += fd1;
        fb0 = fb1 && ab1;
        Thought lo0 = Thought230.getInstance();
        } else {
if(fo0 != null){
          ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
        double ld1 = 116.40643676297819;
        boolean lb2 = true;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1, fb0, fb1, lb2, ab1);
}
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
        Output.points[3][7] += fd1;
        fb1 = ld1 > fd0;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, lb2, ab1, ab2, ab3);
}
        fd1 = ld1 + fd0;
if(ao1 != null){
          ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd1, ld1, fd0, fd1);
}
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = fd1 < ad1;
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
        Thought lo0 = Thought240.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao3.m2(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    Thought lo1 = Thought113.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
    ab3 = !ab4;
    double ld2 = 419.1779381415529;
    fb0 = ad3 < ad4;
    Thought lo3 = Thought150.getInstance(ao2, ao3, ao4, fo0);
    fb1 = fd0 < fd1;
    double ld4 = 252.5174670647537;
if(ao1 != null){
      fo1 = ao1.m4(ld2, ld4, ad1, ad2);
}
    ad3 = ad4 - fd0;
    boolean lb5 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld2, ld4, ad1, ad2);
}
    lb5 = ad3 < ad4;
    double ld6 = 561.1102371617699;
    double ld7 = 766.3016077910912;
    Thought lo8 = Thought341.getInstance();
    boolean lb9 = true;

Thought.STACK_COUNTER++;
return lb9;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][8] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought93.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    Output.points[4][0] += fd1;
    double ld1 = 280.7986698087529;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    double ld2 = 628.2074555173359;

Thought.STACK_COUNTER++;
return ld2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3();
}
    ab1 = ab2 || ab3;
    boolean lb0 = false;
    Output.points[4][1] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    if (lb0) {
        ab1 = ab2 && ab3;
        fd0 *= -1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m1(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb0;
        ab1 = ab2 || ab3;
        ab4 = fd1 < fd0;
        fb0 = fb1 || lb0;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    double ld1 = 309.7937103214278;
    ld1 = ad1 + ad2;
    if (fb0) {
        fb1 = lb0 && fb0;
        Output.points[4][2] += ad3;
        Thought lo2 = Thought338.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
        ad4 *= -1;
        } else if (lb0) {
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        fb0 = fb1 || lb0;
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad1 = ad2 + ad3;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ab1 = ab2 && ab3;
    ab4 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m3(ab4, fb0, fb1, lb0);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + ad1;
    boolean lb1 = false;
    ad2 = ad3 - ad4;
    boolean lb2 = true;
        lb1 = fd0 < fd1;
    double ld3 = 652.8556847309635;
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return ld3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    Thought lo0 = Thought134.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        for(int i0=0; i0<10; i0++){
            fb1 = fb0 || fb1;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
              fd1 = ao4.m3();
}
            fb0 = fd0 > fd1;
if(fo0 != null){
              fo0.m1(fb1, fb0, fb1, fb0);
}
            fd0 *= -1;
            fd1 *= -1;
            fd0 = fd1 + fd0;
if(fo1 != null){
              fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
            Thought lo1 = Thought321.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
            Output.points[4][3] += fd1;
}}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 152.8228941727466;
    ad1 = ad2 - ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fo1.m2(fd0, fd1, ld0, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought52.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fd0 = fd1 - ld0;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    Output.points[4][4] -= fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought22.getInstance(ao2, ao3, ao4, fo0);
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought133.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      fd0 = ao1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    Thought lo2 = Thought342.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    Output.points[4][5] += fd1;
    double ld3 = 778.2723495407171;
if(fo1 != null){
      fo1.m3(ld3, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
    double ld4 = 893.1157489435415;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ld4 < fd0;
    ab4 = fb0 || fb1;
        fd1 = ld3 - ld4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld3, ld4, fd0);
}
    ab1 = !ab2;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld3, ld4, fd0);
}
if(ao1 != null){
      ab4 = ao1.m2();
}
        fb0 = fb1 && ab1;
    boolean lb5 = false;
if(ao2 != null){
      fd1 = ao2.m3(ab1, ab2, ab3, ab4);
}
    fb0 = ld3 < ld4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought219.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    double ld1 = 691.7755356604644;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    double ld2 = 451.8931218412835;
    ab1 = ab2 || ab3;
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ld1);
}
    ld2 = ad1 + ad2;
    Thought lo3 = Thought41.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
if(ao3 != null){
      ao3.m3();
}
    Thought lo4 = Thought234.getInstance(ab4, fb0, fb1, ab1);

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Output.points[4][6] += fd0;
    Thought lo0 = Thought10.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb1 = false;
    Output.points[4][7] += fd1;
    Thought lo2 = Thought277.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = lb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought213.getInstance();
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    ab2 = !ab3;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    ab3 = ab4 && fb0;
    fb1 = fd1 < fd0;
    lb0 = ab1 && ab2;
    ab3 = !ab4;
    boolean lb1 = true;
    Thought lo2 = Thought213.getInstance();
    if (ab4) {
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought104.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fb1 = fd1 > ad1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    Thought lo1 = Thought317.getInstance(fo0, fo1, fo0, fo1);

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ad2 = ad3 + ad4;
if(fo1 != null){
          ab3 = fo1.m2(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ad4 = fd0 + fd1;
    Thought lo0 = Thought10.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fb0 && fb1;
    fd0 = fd1 - ad1;
    Thought lo1 = Thought194.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    if (ab3) {
        ab4 = !fb0;
        Output.points[4][8] -= fd1;
        Output.points[5][0] -= ad1;
        fb1 = !ab1;
        ab2 = !ab3;
        ad2 = ad3 + ad4;
if(fo1 != null){
          ab4 = fo1.m2(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
        ab3 = ad3 > ad4;
        ab4 = fb0 || fb1;
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fb1 = fd0 > fd1;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
        fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = fb0 || fb1;
    Output.points[5][1] += fd0;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    double ld0 = 424.5382331624775;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought345.getInstance();
    fb0 = fb1 && fb0;
if(ao1 != null){
      ld0 = ao1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
    lb2 = !fb0;
    fd0 = fd1 + ld0;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought369.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    fd1 *= -1;
    double ld2 = 334.19234237685043;
if(ao1 != null){
      ld2 = ao1.m3(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb1);
}
    Output.points[5][2] += ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 || lb1;
    ad2 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
    fb1 = ld2 > ad1;

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    lb0 = fd0 > fd1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    if (fb1) {
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
if(ao2 != null){
          ao1 = ao2.m4();
}
        Output.points[5][3] -= fd1;
        fd0 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(lb0, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
        double ld1 = 819.4213155532767;
        Output.points[5][4] += fd0;
        ab4 = !fb0;
if(ao4 != null){
          fd1 = ao4.m3(ld1, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
        ab3 = ab4 && fb0;
        double ld2 = 580.5207543536881;
        Output.points[5][5] -= ld2;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb0, ab1, ab2);
}
        fd1 *= -1;
}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    Thought lo1 = Thought189.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
    Output.points[5][6] -= ad3;
    double ld2 = 353.1048309577669;
    Thought lo3 = Thought74.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
        fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb1 = !lb0;
    fd0 *= -1;
    Thought lo1 = Thought157.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = !lb0;
    fb0 = fd0 > fd1;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;
    lb0 = fd0 < fd1;
    boolean lb2 = false;
    Output.points[5][7] -= fd0;
    lb2 = fb0 || fb1;
    lb0 = lb2 && fb0;
    fb1 = fd1 < fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[5][8] -= fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought308.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought112.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[6][0] += fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        boolean lb2 = false;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb1 = lb2 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought293.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fb1 || fb0;
    fd1 *= -1;
    Output.points[6][1] -= fd0;
    fb1 = fd1 < fd0;
    double ld1 = 48.70885179355896;
    fb0 = fd0 < fd1;
    fb1 = ld1 > fd0;
    fd1 = ld1 + fd0;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld1 = fd0 - fd1;
    fb0 = !fb1;
    fb0 = ld1 < fd0;
    Output.points[6][2] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    double ld2 = 925.8101833115477;
    boolean lb3 = true;
    boolean lb4 = false;
    Thought lo5 = Thought34.getInstance(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, lb4, fb0, fb1, lb3);
if(fo0 != null){
      lb4 = fo0.m2(ld1, ld2, fd0, fd1, fb0, fb1, lb3, lb4);
}
    ld1 = ld2 + fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb3, lb4);
}
    fd1 = ld1 - ld2;
    fb0 = fb1 && lb3;
        boolean lb6 = false;
    fd0 = fd1 - ld1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
