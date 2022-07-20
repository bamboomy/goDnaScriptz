package genetic;
import java.util.ArrayList;
class Thought294 extends Thought{
private static ArrayList<Thought294> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 742.9489827802901;
private double fd1 = 927.4469218864699;
private Thought fo0 = null;
private Thought fo1 = null;
Thought294 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought294 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought294 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought294 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought294 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought294 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought294 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought294 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought294 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought294 instance = new Thought294 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought294 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought294 instance = new Thought294 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought294 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought294 instance = new Thought294 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought294 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought294 instance = new Thought294 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought294 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought294 instance = new Thought294 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought294 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought294 instance = new Thought294 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought294 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought294 instance = new Thought294 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought294 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought294 instance = new Thought294 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
    fb1 = lb0 && fb0;
    double ld1 = 966.1653962938202;
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = lb0 && fb0;
    fd0 = fd1 + ld1;
    fb1 = lb0 || fb0;
    fd0 *= -1;
    fb1 = lb0 || fb0;
    double ld2 = 27.177259381358475;
if(fo1 != null){
      fo1.m3(fb1, lb0, fb0, fb1);
}
    boolean lb3 = false;
    boolean lb4 = false;
    boolean lb5 = true;
    lb0 = lb3 && lb4;
if(fo0 != null){
      lb5 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      lb4 = fo1.m2(fd0, fd1, ld1, ld2, lb5, fb0, fb1, lb0);
}
    lb3 = fd0 < fd1;
    lb4 = ld1 > ld2;
    lb5 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, lb3, lb4, lb5);
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
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        ab1 = fd1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        ab2 = fd1 > fd0;
        double ld0 = 30.019520639575717;
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
        Thought lo1 = Thought247.getInstance();
        ab4 = fd1 > ld0;
        fb0 = fd0 > fd1;
if(fo1 != null){
          fo1.m3(fb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
        ab1 = ab2 || ab3;
        ld0 = fd0 - fd1;
        ab4 = !fb0;
        fb1 = ld0 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        double ld2 = 673.8473731629365;
if(fo0 != null){
          fo0.m1(ld0, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
        }
    double ld3 = 158.69612009194762;
    fb0 = ld3 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo0 != null){
          ld3 = fo0.m3(fo1, fo0, fo1, fo0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    double ld0 = 445.40598419243514;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad3 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    double ld1 = 995.3194495427379;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = ad1 > ad2;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2);
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
    double ld0 = 710.7175396367933;
if(fo0 != null){
      ab2 = fo0.m2();
}
if(fo1 != null){
      ld0 = fo1.m3(ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 - ad3;
        ab1 = ad4 > fd0;
        ab2 = fd1 > ld0;
        ab3 = ad1 < ad2;
        ab4 = ad3 < ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, fb0, fb1, ab1, ab2);
}
        ab3 = ad2 > ad3;
        Thought lo1 = Thought172.getInstance(ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad1 = ad2 + ad3;
        boolean lb2 = false;
        ab2 = ad4 > fd0;
        fd1 = ld0 + ad1;
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
        }
    ld0 = ad1 - ad2;

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
        for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        Output.points[7][6] -= fd0;
        Output.points[7][7] -= fd1;
        double ld0 = 287.271631480135;
        ld0 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        Thought lo1 = Thought35.getInstance(fb1, fb0, fb1, fb0);
        fd1 = ld0 - fd0;
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
    Thought lo0 = Thought64.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
    ad2 = ad3 - ad4;
    if (fb1) {
        fb0 = !fb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          fb0 = ao1.m2(fd0, fd1, ad1, ad2);
}
        boolean lb1 = true;
        ad3 = ad4 - fd0;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
          ao1.m3();
}
        double ld2 = 80.78770254868145;
if(ao2 != null){
          ao2.m2(fb1, lb1, fb0, fb1);
}
        boolean lb3 = false;
        Output.points[7][8] += ad3;
        ad4 = fd0 - fd1;
        ld2 *= -1;
        Output.points[8][0] -= ad1;
        Thought lo4 = Thought114.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb1, lb3, fb0, fb1);
        fd1 = ld2 - ad1;
if(ao1 != null){
          ad2 = ao1.m3(ad3, ad4, fd0, fd1, lb1, lb3, fb0, fb1);
}
        lb1 = ld2 < ad1;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    Output.points[8][1] -= fd0;
    fd1 = fd0 + fd1;
    ab1 = !ab2;
    fd0 *= -1;
    Output.points[8][2] -= fd1;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
    ab3 = ab4 || fb0;
    fb1 = !lb0;
if(ao4 != null){
      fd0 = ao4.m3(ab1, ab2, ab3, ab4);
}
    double ld1 = 282.1984703924642;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0, fb0, fb1, lb0, ab1);
}
    ab2 = fd1 > ld1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      ld1 = fo0.m3(fo1, ao1, ao2, ao3);
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
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    double ld0 = 796.8313275553362;
    Output.points[8][3] -= ad3;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      ad4 = fo1.m3(ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought301.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ad1, fb1, ab1, ab2, ab3);
    ad2 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought380.getInstance(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 847.5610626365554;
    Output.points[8][4] += fd0;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2();
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    Thought lo0 = Thought273.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Output.points[8][5] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    Output.points[8][6] -= fd0;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}

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
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld0 = 413.78337765911374;
if(fo0 != null){
      fb1 = fo0.m2();
}
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought320.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
        boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
        double ld3 = 709.808726732396;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = ld3 < ld0;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        boolean lb4 = true;
if(fo0 != null){
          lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ld0);
}
        lb4 = ad1 < ad2;
        fb0 = fb1 && lb2;
if(fo0 != null){
          fo1 = fo0.m4();
}
        Output.points[8][7] += ad3;
        lb4 = ad4 > fd0;
        for(int i1=0; i1<10; i1++){
            fb0 = fd1 < ld3;
if(fo0 != null){
              fo1 = fo0.m4(fb1, lb2, lb4, fb0);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb1, lb2, lb4, fb0);
}
            double ld5 = 245.49317462950575;
if(fo0 != null){
              fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, lb2, lb4, fb0);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    ad1 *= -1;
    ad2 *= -1;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
    lb0 = !ab1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = ab3 || ab4;

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
    Output.points[8][8] += fd0;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 122.61127861469441;
    fb0 = ld0 > fd0;
    Thought lo1 = Thought147.getInstance(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    boolean lb2 = false;
    fd1 = ld0 + fd0;
    boolean lb3 = true;
    lb2 = lb3 && fb0;
    Thought lo4 = Thought38.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    fb1 = !lb2;
    Thought lo5 = Thought243.getInstance(lb3, fb0, fb1, lb2);
    ld0 = fd0 - fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    Output.points[0][0] += ad4;
    Thought lo0 = Thought282.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought213.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
        boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo1.m1();
}
    boolean lb3 = true;
    lb3 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(lb2, lb3, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb2, lb3, fb0, fb1);
}
if(ao3 != null){
      ad1 = ao3.m3(ad2, ad3, ad4, fd0, lb2, lb3, fb0, fb1);
}
    Thought lo4 = Thought52.getInstance(ao4, fo0, fo1, ao1, lb2, lb3, fb0, fb1);
    lb2 = fd1 < ad1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    double ld1 = 542.0331937866142;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0);
}
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo2 = Thought8.getInstance(ab4, fb0, fb1, lb0);
    fd1 = ld1 - fd0;
    Output.points[0][1] += fd1;
    ld1 *= -1;
    ab1 = fd0 > fd1;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought289.getInstance(fd0, fd1, ld1, fd0, lb0, ab1, ab2, ab3);
    ab4 = fd1 < ld1;
    fd0 = fd1 - ld1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld4 = 77.28156760860686;
if(ao1 != null){
      ab3 = ao1.m2(fd0, fd1, ld1, ld4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = fd0 > fd1;
        ab3 = ad1 < ad2;
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, ab1);
}
    double ld0 = 69.69409110424284;
    Output.points[0][2] += ad2;
    double ld1 = 352.29457130516255;
    ab2 = ab3 || ab4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > ld0;
if(ao1 != null){
      fo1 = ao1.m4(ld1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought248.getInstance(ao2, ao3, ao4, fo0);
    fb1 = !ab1;
if(fo1 != null){
      ld0 = fo1.m3(ld1, ad1, ad2, ad3);
}
    boolean lb3 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(ao1 != null){
      ao1.m1();
}
    ld1 = ad1 + ad2;
    ab1 = ab2 && ab3;
    boolean lb4 = true;
    Thought lo5 = Thought253.getInstance(ab3, ab4, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb3, lb4, ab1, ab2);
}

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
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
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1();
}
    double ld2 = 648.8513383527185;
    lb0 = lb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    Output.points[0][3] += ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb1, lb0, lb1, ab1);
}
    fd1 = ld2 - fd0;
        fd1 *= -1;
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ab1 = fo0.m2(ld2, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb3);
}
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 + ld2;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    lb0 = fd0 > fd1;
    boolean lb1 = true;
    lb1 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld2 = 172.59872833600988;
    boolean lb3 = false;
    lb3 = fb0 || fb1;
    lb0 = lb1 && lb3;
    Thought lo4 = Thought73.getInstance(fb0, fb1, lb0, lb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, lb3, fb0, fb1, lb0);
}
    Output.points[0][4] -= ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, lb1, lb3, fb0, fb1);
}

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    fb0 = !fb1;
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
        Output.points[0][5] -= ad2;
        ab1 = ad3 > ad4;
        fd0 = fd1 - ad1;
        ab2 = ab3 || ab4;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld1 = 56.83931063743459;
    Output.points[0][6] += fd0;
    boolean lb2 = false;
    fd1 = ld1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(lb0, lb2, fb0, fb1);
}
    lb0 = lb2 && fb0;
    ld1 *= -1;
    fd0 = fd1 + ld1;
    fb1 = !lb0;
    lb2 = fb0 && fb1;
    lb0 = lb2 || fb0;
    fb1 = lb0 || lb2;
    if (fb0) {
        fb1 = fd0 > fd1;
if(fo1 != null){
          lb0 = fo1.m2(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld0 = 881.1723937918406;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 || fb0;
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
if(ao1 != null){
          ld0 = ao1.m3();
}
if(ao3 != null){
          ao2 = ao3.m4(lb1, fb0, fb1, lb2);
}
if(ao4 != null){
          lb1 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb2, lb1);
}
        fb0 = fb1 || lb2;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld0, ad1, lb1, fb0, fb1, lb2);
}
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    double ld0 = 528.5095114401703;
    if (ab2) {
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(ao1 != null){
          ab3 = ao1.m2();
}
if(ao3 != null){
          ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
        ab2 = fd1 > ld0;
        Thought lo1 = Thought40.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
if(ao2 != null){
          ab1 = ao2.m2(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
        ld0 = fd0 - fd1;
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
        fb0 = ld0 < fd0;
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
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4);
}
    double ld0 = 793.4299044786625;
    ab2 = ab3 || ab4;
    ad4 = fd0 - fd1;
    boolean lb1 = false;
    boolean lb2 = true;
    Thought lo3 = Thought223.getInstance(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3);
    ab3 = !ab4;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo1.m1();
}
    boolean lb4 = true;
    lb2 = lb4 && ab1;
    ab2 = ab3 || ab4;
    ad4 = fd0 - fd1;
    boolean lb5 = false;
    Output.points[0][7] -= ld0;
    ad1 = ad2 + ad3;
    ab4 = ad4 > fd0;
    fb0 = fd1 > ld0;
    double ld6 = 201.233864401748;
    ld6 = ad1 + ad2;

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
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 569.4765498067624;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 < fd0;
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
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
    Thought lo0 = Thought112.getInstance(fd0, fd1, fd0, fd1);
    double ld1 = 789.9691382282217;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
    Thought lo2 = Thought198.getInstance();
    fd1 = ld1 + fd0;
    Thought lo3 = Thought55.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
}
    boolean lb4 = true;
    boolean lb5 = false;
    double ld6 = 401.13983251195;
    ab1 = ab2 || ab3;
    ld6 *= -1;
    ab4 = fb0 || fb1;
    lb4 = lb5 || ab1;
    ab2 = !ab3;

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
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = ad1 > ad2;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought130.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Output.points[0][8] -= ad3;
    fb0 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    double ld1 = 163.67002207462156;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb3 = false;
    fd1 = ld1 - ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fd1 = fo1.m3(lb0, lb2, lb3, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = ad4 > fd0;
    fd1 *= -1;
    lb0 = ld1 < ad1;
    boolean lb4 = false;
    lb2 = lb3 && lb4;
    boolean lb5 = true;
    boolean lb6 = false;
    ad2 *= -1;
    Thought lo7 = Thought162.getInstance(ad3, ad4, fd0, fd1, lb5, lb6, ab1, ab2);
    ab3 = ld1 < ad1;
    ab4 = !fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb2, lb3);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    double ld0 = 726.7041631918402;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb0 = fd1 < ld0;
    Thought lo1 = Thought89.getInstance();
    boolean lb2 = false;
    fd0 = fd1 - ld0;
if(ao1 != null){
      ao1.m3(fb0, fb1, lb2, fb0);
}
    fd0 *= -1;
    fb1 = !lb2;
    fd1 = ld0 + fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
}
    Output.points[1][0] -= ld0;
    fd0 = fd1 + ld0;
    fb1 = lb2 && fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought325.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb1 = ao2.m2(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao2.m1();
}
    double ld1 = 448.38067187336793;
    boolean lb2 = false;
    fb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb2, fb0, fb1);
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
    boolean lb0 = false;
    boolean lb1 = true;
    boolean lb2 = false;
    boolean lb3 = false;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb2, lb3, ab1);
}
    ab2 = ab3 && ab4;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1, lb3, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        lb0 = fd0 > fd1;
        lb1 = lb2 && lb3;
        ab1 = ab2 && ab3;
        boolean lb4 = false;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
        double ld5 = 723.2915263210098;
if(ao3 != null){
          ld5 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld5, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          ab3 = ao4.m2(ab4, fb0, fb1, lb4);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld5, fd0, fd1, ld5, lb0, lb1, lb2, lb3);
}
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ld5, fd0, ab1, ab2, ab3, ab4);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = true;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ao1.m3();
}
    ad1 *= -1;
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, lb0, lb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought135.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
    ad4 *= -1;
    double ld3 = 396.5982963600968;
    boolean lb4 = true;
    Thought lo5 = Thought236.getInstance(ao3, ao4, fo0, fo1, lb4, ab1, ab2, ab3);
    ab4 = ad4 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld3, ad1, ad2, ad3);
}
    boolean lb6 = false;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld3);
}
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld3;
    boolean lb7 = false;
if(ao2 != null){
      ao1 = ao2.m4();
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
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    Output.points[1][1] -= fd1;
    Thought lo1 = Thought38.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
    boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
    lb2 = fd1 < fd0;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb3 = fd1 < fd0;
    lb4 = !fb0;

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
      fb1 = fo0.m2();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Output.points[1][2] += fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    double ld0 = 948.0442470913979;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
    fb0 = fb1 && fb0;
    ld0 *= -1;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    Thought lo1 = Thought87.getInstance(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    Output.points[1][3] -= fd1;
    double ld2 = 90.25952205353364;
    boolean lb3 = true;
    ld0 *= -1;
    boolean lb4 = false;

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
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld0 = 232.82650242984533;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    fd0 = fd1 + ld0;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    fb0 = fb1 && lb1;
    double ld2 = 472.38767206347757;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo3 = Thought169.getInstance(fb1, lb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, lb1, fb0, fb1, lb1);
}
    double ld4 = 551.5588996789137;
    Output.points[1][4] += ld4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld2, fb0, fb1, lb1, fb0);
}
    ld4 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    ld2 = ld4 - fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
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
