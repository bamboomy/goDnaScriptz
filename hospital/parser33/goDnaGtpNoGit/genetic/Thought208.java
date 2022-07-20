package genetic;
import java.util.ArrayList;
class Thought208 extends Thought{
private static ArrayList<Thought208> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 775.0361737557337;
private double fd1 = 724.7058882292587;
private Thought fo0 = null;
private Thought fo1 = null;
Thought208 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought208 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought208 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought208 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought208 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought208 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought208 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought208 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought208 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought208 instance = new Thought208 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought208 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought208 instance = new Thought208 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought208 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought208 instance = new Thought208 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought208 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought208 instance = new Thought208 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought208 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought208 instance = new Thought208 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought208 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought208 instance = new Thought208 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought208 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought208 instance = new Thought208 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought208 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought208 instance = new Thought208 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    Output.points[2][0] += fd0;
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 > fd0;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
        lb0 = !fb0;
        fd0 *= -1;
        double ld1 = 564.6576647481884;
        fb1 = fd0 < fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
        fd0 *= -1;
        fb0 = fd1 < ld1;
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
    ab1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought246.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
    boolean lb1 = true;
    ab2 = !ab3;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb1, ab1);
}
    ab2 = !ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 + fd0;
    boolean lb2 = false;
        double ld3 = 243.73550537792906;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, lb2, ab1);
}
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb5 = false;

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
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
    Output.points[2][1] -= ad3;
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 || fb1;
if(fo1 != null){
          fo1.m2();
}
        Thought lo0 = Thought171.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
        ad3 = ad4 + fd0;
        fb0 = fb1 && fb0;
if(fo1 != null){
          fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        double ld1 = 750.1958454934538;
        fb1 = fb0 && fb1;
        Thought lo2 = Thought234.getInstance(fo0, fo1, fo0, fo1);
        boolean lb3 = true;
        }
    for(int i1=0; i1<10; i1++){
        boolean lb4 = false;
        Thought lo5 = Thought278.getInstance(fd0, fd1, ad1, ad2);
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
    double ld0 = 558.0218814471377;
    ld0 = ad1 + ad2;
    double ld1 = 668.4033390165706;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m1();
}
    double ld2 = 274.43677671312366;
    Output.points[2][2] -= ad3;
    ab1 = ab2 || ab3;
if(fo1 != null){
      ad4 = fo1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        double ld3 = 683.0901889142688;
        double ld4 = 386.0250424266903;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        if (ab4) {
            fb0 = fb1 && ab1;
if(fo1 != null){
              ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ld4, ld0, ld1);
}
            ld2 = ad1 - ad2;
if(fo1 != null){
              fo0 = fo1.m4();
}
if(fo0 != null){
              fo0.m1(ab2, ab3, ab4, fb0);
}
            } else if (fb1) {
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
    fb0 = fd1 < fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[2][3] -= fd1;
    fd0 = fd1 - fd0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    double ld0 = 455.52716630428677;
    double ld1 = 197.45357385401712;
    fb1 = ld1 > fd0;
    fb0 = !fb1;
    fb0 = fb1 || fb0;

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
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    ad2 *= -1;
    fb1 = fb0 && fb1;
    ad3 = ad4 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld1 = 981.8681563657697;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd1, ld1, ad1, ad2, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb1 = ao1.m2(ad3, ad4, fd0, fd1);
}
    ld1 *= -1;
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m3();
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought296.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
        fd0 *= -1;
    boolean lb1 = true;
    ab2 = ab3 && ab4;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    fb0 = fb1 && lb1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb1;
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
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
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    Thought lo0 = Thought188.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m3(ab2, ab3, ab4, fb0);
}
    Output.points[2][4] -= fd1;
    boolean lb1 = false;
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fb1 = lb1 && ab1;
    ab2 = fd1 > ad1;
    ab3 = ad2 < ad3;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb1);
}
    double ld2 = 476.57080612483094;
    double ld3 = 689.3716453820889;
    double ld4 = 799.0418999133738;
if(ao2 != null){
      ld3 = ao2.m3(ld4, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, lb1, ab1);
}
    double ld5 = 487.5708346733337;
if(ao2 != null){
      ld2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb6 = true;
if(ao1 != null){
      ao1.m3(ld3, ld4, ld5, ad1);
}
    Thought lo7 = Thought208.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    ab1 = !ab2;

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
    lb0 = !fb0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2();
}
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought247.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    boolean lb2 = false;
    lb0 = lb2 || fb0;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb2, fb0);
}
    double ld3 = 693.6745475133071;
    double ld4 = 464.1946302792274;

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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[2][5] -= fd0;
    ab1 = fd1 < fd0;
    ab2 = !ab3;
    ab4 = fd1 > fd0;
    double ld0 = 381.73693335278665;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    fb0 = !fb1;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = ab1 && ab2;
    ld0 = fd0 - fd1;
    ld0 *= -1;
    Output.points[2][6] += fd0;
    boolean lb1 = false;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3();
}
    boolean lb0 = true;
    fb0 = ad2 > ad3;
    boolean lb1 = true;
    ad4 *= -1;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
    Output.points[2][7] -= fd0;
    lb1 = fd1 > ad1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, lb2, fb0);
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
    ab1 = !ab2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab3 = fo0.m2(ad2, ad3, ad4, fd0);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      ab2 = fo1.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = false;
    Thought lo1 = Thought255.getInstance(ad1, ad2, ad3, ad4);

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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fb0 || fb1;
if(ao3 != null){
      fd0 = ao3.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought382.getInstance(ao4, fo0, fo1, ao1);
    fd0 *= -1;
    fb0 = fd1 < fd0;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    Output.points[2][8] -= fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb1, fb0);
}
    double ld2 = 554.7832097945874;
    fb1 = ld2 < fd0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, ld2, fd0, fd1, lb1, fb0, fb1, lb1);
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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    double ld0 = 185.17207132541589;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    ld0 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld0, ad1, ad2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought196.getInstance();
if(ao4 != null){
      ld0 = ao4.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd0 *= -1;
    fb1 = fd1 > ld0;
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 > ld0;
        Output.points[3][0] -= ad1;
        ad2 = ad3 - ad4;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Output.points[3][1] -= fd1;
    Output.points[3][2] -= fd0;
        fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought201.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    boolean lb2 = true;
    boolean lb3 = false;
        double ld4 = 621.2725612604205;
    ld4 = fd0 + fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought85.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought88.getInstance(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
    Output.points[3][3] += ad3;
    boolean lb2 = false;
    ad4 *= -1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, lb2, ab1, ab2, ab3);
}
        double ld3 = 135.26412921605245;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2);
}
    for(int i0=0; i0<10; i0++){
        boolean lb4 = false;
        ab3 = fd0 < fd1;
        ld3 = ad1 + ad2;
        ab4 = fb0 && fb1;
        ad3 = ad4 + fd0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld3, ad1, ad2);
}
        boolean lb5 = false;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
}
Thought.STACK_COUNTER++;
return lb2;
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
    double ld0 = 37.73595357028214;
    boolean lb1 = false;
    Thought lo2 = Thought2.getInstance();
    Output.points[3][4] -= ld0;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb1, fb0);
}
    fd0 = fd1 - ld0;
    Thought lo3 = Thought341.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
    fd1 *= -1;
    lb1 = ld0 > fd0;
        boolean lb4 = true;
    lb4 = fd1 > ld0;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(ld0, fd0, fd1, ld0, fb1, lb1, lb4, fb0);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb4, fb0);
}
    Thought lo5 = Thought289.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    fb1 = fd0 < fd1;
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld0 *= -1;
    boolean lb7 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb4, lb6, lb7);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb1, lb4);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = fd1 < fd0;
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        ab4 = fd0 > fd1;
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        Thought lo1 = Thought199.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
          lb0 = fo1.m2();
}
        ab1 = fd1 < fd0;
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
    fb0 = fb1 || fb0;
    fb1 = ad1 > ad2;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought96.getInstance(fb1, fb0, fb1, fb0);
    double ld1 = 1.826213803621802;
    Output.points[3][5] += ad2;
    for(int i0=0; i0<10; i0++){
        fb1 = ad3 < ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, fb0, fb1, fb0, fb1);
}
        }
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld2 = 188.74965029625588;
    Output.points[3][6] -= fd0;
    fb0 = fd1 < ld1;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fb1 = ld2 < ad1;
    boolean lb3 = true;
    Thought lo4 = Thought153.getInstance(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb3);
    Output.points[3][7] -= ad2;
    fb0 = fb1 || lb3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 + fd0;
    fb0 = !fb1;
    lb3 = fb0 || fb1;
    lb3 = fb0 || fb1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    double ld0 = 259.3301621309937;
    ab1 = ab2 || ab3;
    Output.points[3][8] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
if(fo0 != null){
      ad3 = fo0.m3(ab4, fb0, fb1, ab1);
}
    ab2 = ad4 > fd0;
    double ld1 = 967.6653737303009;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        Output.points[4][0] += fd0;

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
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought15.getInstance();
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fb1 = !lb0;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;

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
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 81.96003728794584;
    Output.points[4][1] += ld0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld0;
    fb0 = fb1 || fb0;
    double ld1 = 650.8975515507922;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 652.6316466297695;
    double ld1 = 180.27809487321022;
    ld0 = ld1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab1 = fd1 < ld0;
    boolean lb2 = true;
if(ao2 != null){
      ab1 = ao2.m2(ld1, fd0, fd1, ld0);
}
    ld1 *= -1;
    ab2 = fd0 < fd1;
    Output.points[4][2] -= ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld0);
}
    boolean lb3 = false;
if(ao3 != null){
      ab2 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    double ld4 = 981.222874766179;
    lb2 = ld1 < ld4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ld1, lb3, ab1, ab2, ab3);
}
    if (ab4) {
        double ld5 = 345.4312703297178;
        fb0 = !fb1;
        lb2 = lb3 && ab1;
        ab2 = ld1 > ld4;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    if (ab3) {
        } else {
if(ao2 != null){
          ad1 = ao2.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
        ab2 = fd1 < ad1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
        ab1 = ad2 > ad3;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
        ab2 = ab3 || ab4;
        for(int i0=0; i0<10; i0++){
            fb0 = ad2 < ad3;
            fb1 = ab1 || ab2;
            if (ab3) {
                Output.points[4][3] -= ad4;
                boolean lb0 = false;
                ab3 = ab4 || fb0;
                fd0 = fd1 - ad1;
}}}
Thought.STACK_COUNTER++;
return ad2;
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    double ld0 = 615.5795539148812;
    ld0 = fd0 + fd1;
    double ld1 = 94.37290037791625;
if(fo0 != null){
      fo0.m2();
}
    fb1 = fb0 || fb1;
    boolean lb2 = true;
    ld0 = ld1 - fd0;
    lb2 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0, fb0, fb1, lb2, fb0);
}
    double ld3 = 596.0099278009025;
    boolean lb4 = false;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought387.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought236.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    double ld2 = 552.1127015825906;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 *= -1;
    ld2 *= -1;

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
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    Output.points[4][4] += ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ad1);
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
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    Thought lo0 = Thought232.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    Output.points[4][5] -= ad1;
    fb0 = ad2 > ad3;
    Output.points[4][6] -= ad4;
    if (fb1) {
        Output.points[4][7] += fd0;
        fd1 = ad1 - ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && ab1;
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
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    Output.points[4][8] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 + fd0;
    double ld2 = 503.89627592085463;
    Thought lo3 = Thought259.getInstance(ao2, ao3, ao4, fo0);
    fb0 = fb1 && lb0;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld2, fd0);
}
    lb1 = fb0 && fb1;
    fd1 *= -1;
    boolean lb4 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2);
}
if(ao2 != null){
      fd0 = ao2.m3();
}

Thought.STACK_COUNTER++;
return ao3;
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
    Thought lo0 = Thought94.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
if(ao1 != null){
      fb0 = ao1.m2(ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
    double ld2 = 588.9589337957593;
    boolean lb3 = false;
    ld2 *= -1;
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    lb3 = ad2 < ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb0 = !fb1;
    Thought lo4 = Thought59.getInstance(lb1, lb3, fb0, fb1);
    fd0 = fd1 - ld2;
    Output.points[5][0] += ad1;
    Output.points[5][1] -= ad2;
    double ld5 = 577.9338913982299;
    ad2 = ad3 + ad4;
    lb1 = fd0 < fd1;
    lb3 = !fb0;
    Output.points[5][2] += ld2;

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
    ab2 = !ab3;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Output.points[5][3] += fd0;
    double ld0 = 824.35758402321;
if(ao2 != null){
      ao2.m1(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
    Thought lo2 = Thought54.getInstance(ao3, ao4, fo0, fo1);
    Output.points[5][4] += ld0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
    ab2 = ab3 && ab4;
    Thought lo3 = Thought93.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
    if (fb0) {
        fb1 = lb1 || ab1;
        ab2 = !ab3;
        double ld4 = 192.62326448581356;
        Thought lo5 = Thought333.getInstance();
        ld4 = ld0 - fd0;
if(ao1 != null){
          fd1 = ao1.m3(ab4, fb0, fb1, lb1);
}
        double ld6 = 598.940339115632;
        ab1 = !ab2;
        ab3 = ld4 > ld6;
        ld0 *= -1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld4, ld6, ab4, fb0, fb1, lb1);
}
if(ao1 != null){
          ld0 = ao1.m3(fd0, fd1, ld4, ld6, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, ab1);
}
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][5] += ad1;
    double ld0 = 625.8688047295084;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought24.getInstance(ao1, ao2, ao3, ao4);
    boolean lb2 = false;
    lb2 = ad4 < fd0;
if(fo0 != null){
      fo0.m3(fd1, ld0, ad1, ad2);
}
    boolean lb3 = false;
    ad3 = ad4 - fd0;
    fd1 = ld0 + ad1;
    lb3 = ad2 > ad3;
    for(int i0=0; i0<10; i0++){
        ab1 = !ab2;
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
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
          fo1.m3();
}
    fd0 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    Output.points[5][6] -= fd0;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, lb2, fb0);
}
    fb1 = !lb0;
    double ld3 = 376.5450153384399;
        Output.points[5][7] -= fd0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ld3, fd0, fd1, ld3);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 904.015570349635;
    fb0 = !fb1;
    Thought lo1 = Thought95.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
        fb0 = fd1 < ld0;
if(fo1 != null){
          fo0 = fo1.m4();
}
    Output.points[5][8] -= fd0;
    Output.points[6][0] -= fd1;
    Output.points[6][1] -= ld0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = ld0 < fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
    Thought lo2 = Thought292.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld0, fd0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    boolean lb3 = true;
if(fo1 != null){
      lb3 = fo1.m2();
}
    ld0 *= -1;
    Thought lo4 = Thought56.getInstance(fb0, fb1, lb3, fb0);
    fd0 *= -1;

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
    fb0 = !fb1;
    fb0 = !fb1;
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 589.6961944043438;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought93.getInstance(fo0, fo1, fo0, fo1);
    ld0 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
    fb0 = fd0 > fd1;
    ld0 *= -1;
    fb1 = lb1 && fb0;

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
