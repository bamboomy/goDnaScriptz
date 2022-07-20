package genetic;
import java.util.ArrayList;
class Thought30 extends Thought{
private static ArrayList<Thought30> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 899.1377949706582;
private double fd1 = 489.9747656477588;
private Thought fo0 = null;
private Thought fo1 = null;
Thought30 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought30 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought30 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought30 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought30 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought30 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought30 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought30 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought30 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = false;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    double ld1 = 14.80355089144144;
    fd0 *= -1;
    Thought lo2 = Thought100.getInstance();
if(fo0 != null){
      fo0.m1(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    fb1 = ld1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    lb0 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
    boolean lb3 = false;
    Thought lo4 = Thought163.getInstance(fb0, fb1, lb0, lb3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb0, fb1, lb0, lb3);
}
    fd0 *= -1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      lb3 = fo1.m2(fd1, ld1, fd0, fd1, fb0, fb1, lb0, lb3);
}
    fb0 = !fb1;
    boolean lb5 = true;

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
    Thought lo0 = Thought396.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    double ld1 = 34.6797404128661;
    Thought lo2 = Thought209.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m3(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    ld1 = fd0 + fd1;
if(fo0 != null){
      ld1 = fo0.m3(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m2(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld1 = fd0 + fd1;

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
    fb1 = ad1 > ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    ad4 *= -1;
    double ld0 = 9.640043101458733;
    fb0 = !fb1;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3);
}
    fb0 = fb1 && fb0;

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
    Output.points[3][1] -= ad1;
    ad2 = ad3 + ad4;
    ab2 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            ab3 = ad1 > ad2;
            ad3 *= -1;
            boolean lb0 = false;
            ab3 = ad4 > fd0;
            boolean lb1 = false;
if(fo1 != null){
              fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
            Output.points[3][2] += fd0;
if(fo0 != null){
              ab3 = fo0.m2();
}
            fd1 *= -1;
            ab4 = ad1 < ad2;
if(fo0 != null){
              fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
              ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
}}
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
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Output.points[3][3] -= fd0;
    boolean lb0 = false;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    double ld1 = 108.77191535354534;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
    lb0 = fd1 < ld1;
    fd0 = fd1 + ld1;
    Thought lo2 = Thought208.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
    boolean lb3 = false;
    double ld4 = 591.9499752923164;
    Output.points[3][4] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      lb3 = fo1.m2();
}
    Output.points[3][5] += ld1;
    boolean lb5 = true;
    lb5 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, lb3, lb5);
}
if(ao3 != null){
      ld4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ld4, fb0, fb1, lb0, lb3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(ao2 != null){
      ao2.m2(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought130.getInstance(ao3, ao4, fo0, fo1);
    boolean lb1 = true;
if(ao1 != null){
      ao1.m2(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      lb1 = ao2.m2();
}
    fb0 = fb1 && lb1;
    fb0 = fb1 || lb1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb1, fb0);
}
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = ad1 > ad2;
    fb0 = !fb1;
    ad3 = ad4 - fd0;
    lb1 = fb0 && fb1;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 && fb1;
    ad1 = ad2 - ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3();
}
    ab1 = ab2 && ab3;
    Output.points[3][6] += fd0;
    double ld0 = 38.50982191742232;
    ab4 = fb0 || fb1;
    double ld1 = 416.4011512512029;
    ld1 = fd0 - fd1;
    ab1 = !ab2;
    ld0 = ld1 - fd0;
    fd1 = ld0 + ld1;
    Output.points[3][7] += fd0;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao2.m2(fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ld0, ld1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = ld0 + ld1;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ab2 = ao2.m2(fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
}
        ab1 = fd0 < fd1;
        Output.points[3][8] += ld0;
        ab2 = ld1 > fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought194.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
    fb0 = fb1 || ab1;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    ab2 = ab3 || ab4;
    Output.points[4][0] -= ad3;
    fb0 = ad4 > fd0;

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
    double ld0 = 138.92978002960143;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ld0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought81.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    double ld2 = 145.02832340215298;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld0 = ld2 - fd0;
if(fo1 != null){
      fo1.m3(fd1, ld0, ld2, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld2, fd0);
}
    boolean lb3 = true;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = lb3 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb3, fb0, fb1);
}
    lb3 = fd1 > ld0;
    Thought lo4 = Thought151.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0, fb0, fb1, lb3, fb0);
    boolean lb5 = true;
    fb0 = ld2 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld2, fd0, fb1, lb3, lb5, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb3, lb5, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
return lb3;
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
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    Thought lo1 = Thought63.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab4 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fd0 = fd1 + fd0;
    fb1 = lb0 && ab1;
    double ld2 = 471.98314196944835;
    ab2 = ab3 || ab4;
    double ld3 = 618.9020919638265;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    Output.points[4][1] -= ld3;
    Thought lo4 = Thought355.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld3, ab1, ab2, ab3, ab4);

Thought.STACK_COUNTER++;
return fb0;
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
    fb0 = fb1 && fb0;
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 - fd1;
    Thought lo0 = Thought254.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fb0 = fo1.m2();
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    Thought lo0 = Thought399.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || ab1;
        Thought lo1 = Thought134.getInstance(fo1, fo0, fo1, fo0);
        ab2 = ab3 && ab4;
}
Thought.STACK_COUNTER++;
return fb0;
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
    Thought lo0 = Thought98.getInstance(fd0, fd1, fd0, fd1);
    double ld1 = 529.6626950967766;
    ld1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1);
}
    boolean lb2 = true;
    fd0 = fd1 + ld1;
    double ld3 = 913.7629318580002;
    fb0 = ld3 < fd0;
    fb1 = fd1 < ld1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld4 = 49.17387823347033;
if(ao4 != null){
      ld3 = ao4.m3(lb2, fb0, fb1, lb2);
}
    Thought lo5 = Thought387.getInstance(fo0, fo1, ao1, ao2, ld4, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
if(ao3 != null){
      ld3 = ao3.m3(ld4, fd0, fd1, ld1, fb1, lb2, fb0, fb1);
}
    Output.points[4][2] -= ld3;
    lb2 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
return fb0;
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
    boolean lb0 = true;
    boolean lb1 = true;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
        Thought lo2 = Thought98.getInstance(ad2, ad3, ad4, fd0);
    Output.points[4][3] -= fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    Output.points[4][4] += fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m2(lb0, lb1, fb0, fb1);
}
    Output.points[4][5] -= fd1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(fd0, fd1, ad1, ad2, lb0, lb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb1, fb0, fb1);
}
    lb0 = ad3 > ad4;
    lb1 = fd0 > fd1;
    fb0 = ad1 < ad2;
    Thought lo3 = Thought160.getInstance(ao3, ao4, fo0, fo1);

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
    ab1 = !ab2;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    ab3 = !ab4;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    if (fb1) {
        Output.points[4][6] -= fd0;
if(ao3 != null){
          ao2 = ao3.m4();
}
        ab1 = ab2 && ab3;
        fd1 *= -1;
        fd0 = fd1 + fd0;
if(fo0 != null){
          ao4 = fo0.m4(ab4, fb0, fb1, ab1);
}
}
Thought.STACK_COUNTER++;
return ab2;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    boolean lb1 = true;
    boolean lb2 = false;
    boolean lb3 = true;
if(ao2 != null){
      ab1 = ao2.m2(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || lb1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, lb2, lb3, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad4 = fd0 + fd1;
    Output.points[4][7] += ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(ao4 != null){
      ad4 = ao4.m3();
}
    boolean lb4 = true;
    boolean lb5 = true;
    boolean lb6 = false;
if(fo0 != null){
      lb6 = fo0.m2(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ad1;
    ad2 *= -1;
    fb0 = fb1 && lb0;

Thought.STACK_COUNTER++;
return lb1;
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
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fb1 = !lb0;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = lb0 && fb0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 = fd0 - fd1;
        fb0 = fd0 > fd1;
        fb1 = fd0 > fd1;
        lb0 = !lb1;
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
          lb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        }
    fd1 = fd0 + fd1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought150.getInstance(fd1, fd0, fd1, fd0);
    ab2 = ab3 && ab4;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
    fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    if (ab2) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        fd0 *= -1;
        fd1 = fd0 - fd1;
        lb1 = !ab1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        Thought lo2 = Thought235.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
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
    Thought lo0 = Thought339.getInstance(fo1, fo0, fo1, fo0);
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    Thought lo1 = Thought248.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    Output.points[4][8] -= fd0;
    fb0 = fd1 > ad1;
if(fo0 != null){
      fb1 = fo0.m2();
}
    Thought lo2 = Thought50.getInstance(fb0, fb1, fb0, fb1);
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb3, fb0);
}
    fb1 = fd0 > fd1;
    lb3 = fb0 || fb1;
    Thought lo4 = Thought222.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
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
    double ld0 = 404.24420003621776;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought113.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
        ld0 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[5][0] -= ad4;
    fd0 *= -1;
    fd1 = ld0 - ad1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m2(fb1, fb0, fb1, fb0);
}
    Output.points[5][1] -= fd0;
    Thought lo0 = Thought210.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(ao2 != null){
      fb1 = ao2.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    double ld1 = 814.5028904202037;
    Thought lo2 = Thought216.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fd0 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad1 = ad2 - ad3;
    double ld0 = 889.4857758234217;
    Output.points[5][2] += ad3;
    Thought lo1 = Thought138.getInstance(ad4, fd0, fd1, ld0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[5][3] -= ld0;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(lb2, fb0, fb1, lb2);
}
    Thought lo3 = Thought47.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
if(ao3 != null){
      fb1 = ao3.m2(fd0, fd1, ld0, ad1, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb2, fb0);
}
    Output.points[5][4] += ad2;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb4 = false;
    Thought lo5 = Thought356.getInstance(ad4, fd0, fd1, ld0);
    ad1 *= -1;
    ad2 = ad3 + ad4;
    Thought lo6 = Thought92.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
    ad2 = ad3 + ad4;
    boolean lb7 = true;
    if (lb7) {
        fd0 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    boolean lb0 = true;
    double ld1 = 904.6067824610416;
if(ao1 != null){
      ab3 = ao1.m2();
}
    double ld2 = 381.7389615896452;
    ld1 = ld2 + fd0;
    fd1 = ld1 + ld2;
    double ld3 = 606.1926647642184;
if(ao2 != null){
      ld3 = ao2.m3(ab4, fb0, fb1, lb0);
}
    ab1 = fd0 < fd1;
    ld1 *= -1;
    Output.points[5][5] += ld2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld3, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ld2, ld3, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ld1 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    boolean lb4 = true;
    ld2 = ld3 - fd0;
    boolean lb5 = true;
    lb4 = lb5 || ab1;
    Output.points[5][6] += fd1;
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || lb0;
    lb4 = lb5 && ab1;
    Thought lo6 = Thought85.getInstance(ld1, ld2, ld3, fd0);
    Thought lo7 = Thought377.getInstance(ao2, ao3, ao4, fo0, fd1, ld1, ld2, ld3);
    fd0 *= -1;
    fd1 = ld1 + ld2;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad2 *= -1;
if(ao2 != null){
      ao2.m2();
}
    lb0 = ad3 < ad4;
    Thought lo1 = Thought332.getInstance(ab1, ab2, ab3, ab4);
    boolean lb2 = true;
    fd0 = fd1 - ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb2, ab1, ab2);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    boolean lb3 = true;
if(ao3 != null){
      ao3.m2(fd0, fd1, ad1, ad2);
}
    ab2 = ad3 < ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    boolean lb4 = false;
    boolean lb5 = false;
    ad3 = ad4 + fd0;
    boolean lb6 = false;
    lb6 = fd1 > ad1;
if(ao4 != null){
      ab1 = ao4.m2();
}
    Output.points[5][7] += ad2;
    double ld7 = 369.15361094204;
    Output.points[5][8] += ad2;

Thought.STACK_COUNTER++;
return ad3;
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
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb0 = true;
    fd0 *= -1;
    Output.points[6][0] += fd1;
    double ld1 = 308.60692420907935;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, lb0, lb2, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb2, lb3);
}
    fb0 = !fb1;
    lb0 = lb2 && lb3;
    Output.points[6][1] += ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
    Output.points[6][2] += fd0;
    boolean lb4 = true;
    Thought lo5 = Thought310.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
    lb4 = !fb0;
        fb1 = !lb0;
    ld1 *= -1;
    double ld6 = 392.0928017981558;
if(fo0 != null){
      fo1 = fo0.m4();
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
    Thought lo0 = Thought113.getInstance(ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    Output.points[6][3] -= fd1;
    Output.points[6][4] -= fd0;
    fd1 = fd0 + fd1;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought396.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    Output.points[6][5] += fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    ab3 = fd0 > fd1;
    ab4 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Thought lo2 = Thought117.getInstance(ab1, ab2, ab3, ab4);
    boolean lb3 = false;
    ab4 = fb0 || fb1;
    lb3 = !ab1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought159.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought114.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    fb0 = ad3 > ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    fb1 = ad3 > ad4;
    fb0 = !fb1;
    Thought lo2 = Thought329.getInstance();
    fd0 = fd1 + ad1;
    Thought lo3 = Thought138.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd1 = ad1 + ad2;
    fb0 = fb1 && fb0;
    ad3 = ad4 + fd0;
    Thought lo4 = Thought64.getInstance(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    double ld5 = 849.8270163423551;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 < ad4;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab2 = fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought347.getInstance(ab3, ab4, fb0, fb1);
    ad2 *= -1;
    ad3 = ad4 + fd0;
    double ld1 = 254.43079870036024;
    Thought lo2 = Thought328.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    double ld3 = 127.12567949038612;
    double ld4 = 603.396586506893;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ld1 > ld3;
if(fo0 != null){
      fo1 = fo0.m4(ld4, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    double ld0 = 19.925898985401993;
    fd0 = fd1 - ld0;
if(ao1 != null){
      fd0 = ao1.m3();
}
    Output.points[6][6] -= fd1;
    double ld1 = 421.8461795489695;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 < ld1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ad4 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fb0 = ao4.m2(fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    fd0 *= -1;
    lb0 = fd1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb0);
}
        boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb1, lb2, ab1, ab2);
}
    Thought lo3 = Thought254.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);

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
    ab1 = ad1 > ad2;
    Output.points[6][7] += ad3;
    double ld0 = 284.26718402631485;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    fb0 = !fb1;
    boolean lb2 = false;
    lb1 = lb2 || ab1;
    Thought lo3 = Thought301.getInstance(fo1, ao1, ao2, ao3);
    boolean lb4 = true;
    Output.points[6][8] -= ad4;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, ad1);
}
    ad2 *= -1;
    boolean lb5 = false;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}

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
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 365.1065581977253;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = ld0 < fd0;
    Thought lo1 = Thought379.getInstance(fd1, ld0, fd0, fd1);
    Thought lo2 = Thought283.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
    double ld3 = 916.8307866430958;
    fb1 = fb0 && fb1;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd1 > fd0;
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb0;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
    lb0 = lb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
}
