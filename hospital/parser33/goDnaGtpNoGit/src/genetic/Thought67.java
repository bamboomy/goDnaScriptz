package genetic;
import java.util.ArrayList;
class Thought67 extends Thought{
private static ArrayList<Thought67> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 925.1591655468508;
private double fd1 = 599.4199009043019;
private Thought fo0 = null;
private Thought fo1 = null;
Thought67 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought67 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought67 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought67 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought67 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought67 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought67 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought67 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought67 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought341.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    if (ab2) {
        boolean lb0 = true;
        double ld1 = 985.6589879439415;
        Thought lo2 = Thought178.getInstance(ld1, fd0, fd1, ld1);
        ab2 = ab3 && ab4;
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
          ld1 = fo1.m3();
}
        fb0 = fb1 || lb0;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb0, ab1);
}
            boolean lb3 = true;
            Thought lo4 = Thought80.getInstance(fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
            fb0 = fb1 && lb3;
            Thought lo5 = Thought385.getInstance(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
            Output.points[1][2] -= ld1;
            Thought lo6 = Thought292.getInstance(fo1, fo0, fo1, fo0);
            double ld7 = 17.308158287317948;
            ab4 = fb0 || fb1;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2();
}
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    fd0 *= -1;
    Thought lo1 = Thought6.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;

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
    ab2 = ab3 || ab4;
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
    fb1 = !ab1;
    ad1 = ad2 + ad3;
    ab2 = ad4 > fd0;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    double ld0 = 54.68637836002183;
    ad2 = ad3 - ad4;
        if (ab1) {
        ab2 = !ab3;
        boolean lb1 = false;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        ab3 = ab4 && fb0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    double ld1 = 617.2073970164234;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
}
    lb0 = fd1 > ld1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    fb0 = fd1 < ld1;
    boolean lb2 = false;
    fd0 *= -1;
    Output.points[1][3] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb2);
}
    fb0 = ld1 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1, fb1, lb0, lb2, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ld1, fd0, fd1, ld1, fb1, lb0, lb2, fb0);
}
    boolean lb3 = true;
    double ld4 = 695.9972753161491;
    boolean lb5 = true;
    lb5 = !fb0;
    fb1 = ld4 > fd0;
    double ld6 = 154.6468374590471;
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, lb0, lb2, lb3, lb5);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd1 = ld1 + ld4;

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
    Thought lo0 = Thought52.getInstance(ad1, ad2, ad3, ad4);
    boolean lb1 = false;
    boolean lb2 = false;
    Thought lo3 = Thought347.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
    lb1 = ad3 > ad4;
    Output.points[1][4] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(lb2, fb0, fb1, lb1);
}
    boolean lb4 = false;
    lb2 = !lb4;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
}
    double ld5 = 402.2647241986682;
    lb4 = fb0 && fb1;

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
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Output.points[1][5] -= fd0;
    fd1 *= -1;
    ab1 = ab2 && ab3;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought146.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
    ab2 = fd1 < fd0;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = fd0 + fd1;
    ab2 = !ab3;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ab4 = ao4.m2(fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
    ab2 = !ab3;
    boolean lb2 = false;
    double ld3 = 174.99501913871308;

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
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    ad3 *= -1;
    fb0 = fb1 || ab1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb0 = true;
if(ao1 != null){
      ao1.m2(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ab2 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    lb0 = ad2 < ad3;

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
    Output.points[1][6] += fd1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 < fd0;
    fd1 *= -1;
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo0 != null){
      fd0 = fo0.m3();
}
    ab4 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought305.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
    boolean lb1 = true;
    ab2 = !ab3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld2 = 310.4643201971671;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
    lb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
          fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, fb1, lb1, ab1, ab2);
}
    double ld3 = 685.9717921685912;
    double ld4 = 133.92662547925417;
    Output.points[1][7] -= ld3;
    double ld5 = 142.48235290761548;

Thought.STACK_COUNTER++;
return ab3;
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
    Thought lo1 = Thought266.getInstance(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
    boolean lb2 = true;
    fd0 = fd1 + ad1;
    boolean lb3 = true;
    double ld4 = 225.8031547697601;
    double ld5 = 587.5493296668477;
if(fo0 != null){
      ld5 = fo0.m3(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ad1 *= -1;
    lb0 = ad2 < ad3;
    lb2 = ad4 > fd0;
    double ld6 = 39.94126408933132;
    lb3 = fb0 || fb1;
    Thought lo7 = Thought19.getInstance(fd0, fd1, ld4, ld5);
    ld6 = ad1 - ad2;
    Thought lo8 = Thought61.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo9 = Thought304.getInstance(lb0, lb2, lb3, fb0);
    ld4 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld5, ld6, ad1, ad2, fb1, lb0, lb2, lb3);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld4, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb0);
}
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb3 = fo1.m2(ld5, ld6, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld4);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 236.4553418430412;
if(fo1 != null){
      ad1 = fo1.m3();
}
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
    fb0 = fd1 > ld0;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    double ld1 = 232.70878363913295;
    boolean lb2 = true;
    boolean lb3 = true;
    ab3 = ab4 || fb0;
    fb1 = lb2 && lb3;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    double ld4 = 975.2508265904102;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    fd1 *= -1;
    fd0 *= -1;
    lb0 = fb0 || fb1;
    boolean lb1 = true;
    lb0 = fd1 < fd0;
    Thought lo2 = Thought231.getInstance(ao2, ao3, ao4, fo0);
    lb1 = fd1 < fd0;
    double ld3 = 526.1389721271481;
    Thought lo4 = Thought55.getInstance(fd0, fd1, ld3, fd0);
    fd1 *= -1;
    fb0 = !fb1;
    Thought lo5 = Thought334.getInstance(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld3);
if(ao4 != null){
      ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld3, fd0, fb1, lb0, lb1, fb0);
}
if(ao1 != null){
      ao1.m3(fd1, ld3, fd0, fd1, fb1, lb0, lb1, fb0);
}
    ld3 = fd0 + fd1;

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
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    Thought lo0 = Thought20.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    boolean lb1 = false;
    lb1 = ad2 < ad3;
    fb0 = fb1 || lb1;
    Thought lo2 = Thought154.getInstance();
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    boolean lb3 = true;
    fb0 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb1, lb3, fb0);
}
    ad4 *= -1;
    fb1 = lb1 && lb3;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb1, lb3);
}
    ad3 *= -1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb1, lb3, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb1 = lb3 || fb0;
    boolean lb4 = true;
    Thought lo5 = Thought91.getInstance(fb0, fb1, lb1, lb3);

Thought.STACK_COUNTER++;
return lb4;
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
    fd0 = fd1 + fd0;
    double ld0 = 130.03813746764345;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    double ld1 = 12.969733078741072;
    double ld2 = 412.916630675741;
    double ld3 = 887.6695665991001;
if(ao2 != null){
      fb1 = ao2.m2(ld2, ld3, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ld0 *= -1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld4 = 639.5781546875827;
    fb0 = fb1 || ab1;
if(ao2 != null){
      ao1 = ao2.m4(ld1, ld2, ld3, ld4);
}
    ab2 = !ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1);
}
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao3.m3();
}
    ab4 = fb0 && fb1;
if(ao4 != null){
      ld2 = ao4.m3(ab1, ab2, ab3, ab4);
}
    fb0 = ld3 < ld4;
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
}
    ld2 = ld3 - ld4;
    Output.points[1][8] -= fd0;

Thought.STACK_COUNTER++;
return ab1;
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
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Output.points[2][0] += fd0;
    fb1 = ab1 && ab2;
    fd1 *= -1;
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    double ld1 = 702.4573801191839;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
    ad3 = ad4 - fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ld1 = ao2.m3(ad1, ad2, ad3, ad4);
}
    Thought lo4 = Thought17.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1);
    if (ab4) {
        boolean lb5 = false;
        Output.points[2][1] += ad2;
        Thought lo6 = Thought140.getInstance();
        double ld7 = 169.50583290551197;
        Output.points[2][2] -= ad2;
        boolean lb8 = true;
if(ao2 != null){
          ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb5, lb8, lb0, lb2);
}
if(ao2 != null){
          ld7 = ao2.m3(ld1, ad1, ad2, ad3, lb3, ab1, ab2, ab3);
}
        ad4 = fd0 - fd1;
        ab4 = ld7 > ld1;
}
Thought.STACK_COUNTER++;
return lb0;
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
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fb0 = !fb1;
    double ld0 = 546.4349122045157;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    Output.points[2][3] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb1);
}
    if (lb2) {
        fd1 *= -1;
        Output.points[2][4] -= ld0;
        fb0 = fb1 && lb1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        lb2 = fb0 && fb1;
        boolean lb3 = true;
if(fo0 != null){
          fo0.m3(ld0, fd0, fd1, ld0);
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought394.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought26.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought16.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought354.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = !ab3;
    ab4 = fd1 < fd0;

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
    boolean lb1 = true;
    double ld2 = 573.5816538831979;
if(fo0 != null){
      ld2 = fo0.m3(ad1, ad2, ad3, ad4);
}
    Thought lo3 = Thought157.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1);
    ad2 = ad3 + ad4;
if(fo0 != null){
          fo1 = fo0.m4();
}
    boolean lb4 = true;
    double ld5 = 303.4562005584688;

Thought.STACK_COUNTER++;
return ad4;
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
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    Thought lo1 = Thought45.getInstance(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
    Output.points[2][5] -= ad3;
    ad4 = fd0 + fd1;
    Thought lo2 = Thought210.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    double ld3 = 703.9010632502177;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ld3, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    fb0 = ld3 > ad1;
    fb1 = ad2 > ad3;
    lb0 = ad4 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3);
}
    ab1 = ab2 && ab3;
    double ld4 = 447.71924125804156;
    ad3 = ad4 + fd0;
if(fo0 != null){
      ab4 = fo0.m2();
}
    fd1 *= -1;

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
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
        fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 938.0435271908913;
    boolean lb1 = false;
    ld0 *= -1;

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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Output.points[2][6] += ad4;
    double ld1 = 987.8028788100088;
    ad4 *= -1;
    fd0 = fd1 + ld1;
    lb0 = fb0 || fb1;
    Output.points[2][7] += ad1;
    Thought lo2 = Thought18.getInstance();
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
    double ld3 = 4.369321378968075;
        Output.points[2][8] -= ad4;
    Thought lo4 = Thought172.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ld3, fb0, fb1, lb0, fb0);
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][0] += fd1;
    boolean lb0 = true;
    Thought lo1 = Thought223.getInstance(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
    Output.points[3][1] -= fd0;
    ab4 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    boolean lb3 = true;
    Thought lo4 = Thought313.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    lb2 = fd0 < fd1;
    boolean lb5 = false;
    lb3 = lb5 || ab1;
    fd0 = fd1 + fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad1 = ad2 - ad3;
    ab2 = ad4 < fd0;
    ab3 = ab4 || fb0;
    fb1 = ab1 && ab2;
    fd1 *= -1;
        boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    Thought lo1 = Thought269.getInstance(ad2, ad3, ad4, fd0);
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 962.3000888418572;
    Output.points[3][2] += ld0;
    boolean lb1 = false;
    fb0 = !fb1;
    double ld2 = 852.0044296566649;
    lb1 = fb0 || fb1;
    ld2 = fd0 - fd1;
    lb1 = fb0 && fb1;
    ld0 = ld2 - fd0;
    lb1 = fb0 || fb1;
    Thought lo3 = Thought142.getInstance(lb1, fb0, fb1, lb1);
    Thought lo4 = Thought238.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0, fb0, fb1, lb1, fb0);

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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    if (fb0) {
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        double ld0 = 254.2620210178916;
        Thought lo1 = Thought87.getInstance(fd0, fd1, ld0, fd0);
        if (ab4) {
            fb0 = fb1 && ab1;
            double ld2 = 931.8174783702752;
if(fo0 != null){
              ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld0);
}
if(fo1 != null){
              fo1.m1();
}
            ab3 = fd0 > fd1;
            boolean lb3 = false;
            ab3 = !ab4;
            boolean lb4 = false;
            Thought lo5 = Thought350.getInstance(ab4, fb0, fb1, lb3);
            lb4 = !ab1;
            double ld6 = 17.56672952375332;
            ab2 = !ab3;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld6, ld0, fd0, ab4, fb0, fb1, lb3);
}
            if (lb4) {
                fd1 = ld2 + ld6;
}}}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 869.9100077090022;
    boolean lb1 = true;
    ld0 = ad1 - ad2;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
    Output.points[3][3] -= ld0;
    fb0 = fb1 && lb1;
    ad1 = ad2 + ad3;
    Output.points[3][4] += ad4;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    fd1 = ld0 + ad1;
    ad2 = ad3 + ad4;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[3][5] += fd0;
    fd1 *= -1;
    lb1 = lb2 && fb0;
    Output.points[3][6] += ld0;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb3 = false;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
if(fo1 != null){
      ab2 = fo1.m2();
}
    Thought lo0 = Thought372.getInstance(ab3, ab4, fb0, fb1);
    ab1 = ad4 < fd0;
    ab2 = ab3 && ab4;
    fb0 = fd1 > ad1;
    fb1 = ad2 > ad3;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    boolean lb1 = true;
        lb1 = !ab1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, lb1, ab1, ab2);
}
    double ld2 = 900.4136952730283;
    ab3 = ab4 && fb0;
    boolean lb3 = false;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb3);
}
    ld2 = ad1 - ad2;
    Output.points[3][7] -= ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[3][8] -= fd0;
    ab1 = fd1 < ld2;
    double ld4 = 771.4400887296032;
    boolean lb5 = true;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 283.1384785210277;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1);
}
        Thought lo1 = Thought85.getInstance(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
    boolean lb2 = false;
    fb0 = fb1 || lb2;
    double ld3 = 873.4220897381191;
    Thought lo4 = Thought126.getInstance();
    fb0 = ld3 < fd0;
    fd1 = ld0 - ld3;
    Output.points[4][0] += fd0;
    Thought lo5 = Thought144.getInstance(fb1, lb2, fb0, fb1);
    Output.points[4][1] -= fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld0, ld3, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld3, fd0, fd1, fb0, fb1, lb2, fb0);
}
        double ld6 = 293.4968950423279;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, lb2, fb0, fb1);
}
    boolean lb7 = false;
    lb2 = !lb7;
    ld3 = ld6 + fd0;
    fd1 = ld0 - ld3;
    ld6 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
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
    ad2 *= -1;
    ad3 *= -1;
    fb0 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd1 = ao4.m3(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    lb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, lb1, fb0, fb1);
}
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 506.0780956046265;
    Output.points[4][2] -= ld0;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    Output.points[4][3] += ld0;
if(ao2 != null){
      ab4 = ao2.m2();
}
    fd0 = fd1 + ld0;
        fd0 *= -1;
    fd1 = ld0 + fd0;
    boolean lb1 = true;
    Output.points[4][4] += fd1;
    ld0 = fd0 + fd1;
    ab4 = ld0 > fd0;
    double ld2 = 925.9966692508829;
if(ao3 != null){
      fd0 = ao3.m3(fb0, fb1, lb1, ab1);
}
    fd1 *= -1;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, ld0, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld0 *= -1;
    ld2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, ld2, lb1, ab1, ab2, ab3);
}
    boolean lb3 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    ad1 *= -1;
    Output.points[4][5] += ad2;
    boolean lb0 = true;
    Output.points[4][6] += ad3;
    Output.points[4][7] += ad4;
    boolean lb1 = true;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab2 = !ab3;
    ab4 = !fb0;
    boolean lb3 = true;
    fd0 = fd1 - ad1;
    fb0 = ad2 < ad3;
    fb1 = !lb0;
    ad4 = fd0 - fd1;
    lb1 = lb2 && lb3;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    ab1 = ab2 && ab3;
    fd1 = ad1 + ad2;
    boolean lb4 = false;
    double ld5 = 749.6925236164514;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ab3 = ao3.m2();
}
    ab4 = fb0 && fb1;
if(ao4 != null){
      fd1 = ao4.m3(lb0, lb1, lb2, lb3);
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
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    double ld1 = 476.6133346263088;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld1 = fd0 + fd1;
    double ld3 = 490.02389397897855;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m2(ld1, ld3, fd0, fd1);
}
    boolean lb4 = true;
    ld1 = ld3 - fd0;

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
    fb1 = fd1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought178.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 + fd1;
    fd0 *= -1;
    double ld1 = 62.03639712523837;
    Thought lo2 = Thought70.getInstance(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
    fd1 = ld1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld1;
    fd0 = fd1 + ld1;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 || fb1;
    fd0 = fd1 - ld1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld1, fd0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    Thought lo1 = Thought338.getInstance(fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
    fd0 = fd1 - fd0;
    double ld2 = 481.8225219695731;

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
