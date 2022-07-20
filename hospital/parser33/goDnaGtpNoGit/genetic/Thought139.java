package genetic;
import java.util.ArrayList;
class Thought139 extends Thought{
private static ArrayList<Thought139> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 453.31454033709497;
private double fd1 = 770.7136532048562;
private Thought fo0 = null;
private Thought fo1 = null;
Thought139 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought139 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought139 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought139 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought139 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought139 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought139 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought139 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought139 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought139 instance = new Thought139 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought139 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought139 instance = new Thought139 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought139 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought139 instance = new Thought139 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought139 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought139 instance = new Thought139 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought139 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought139 instance = new Thought139 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought139 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought139 instance = new Thought139 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought139 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought139 instance = new Thought139 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought139 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought139 instance = new Thought139 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 660.3629766821163;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ld0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 = fd0 - fd1;
    double ld1 = 597.2519438740818;
if(fo0 != null){
      fb0 = fo0.m2(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld2 = 678.5019220544714;
    Thought lo3 = Thought117.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb4 = true;
    ld0 *= -1;
    Thought lo5 = Thought369.getInstance(ld1, ld2, fd0, fd1);
    ld0 = ld1 - ld2;

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
    fd1 = fd0 - fd1;
    if (ab2) {
        ab3 = ab4 && fb0;
        Thought lo0 = Thought223.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        } else {
        fd0 *= -1;
        ab1 = !ab2;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        ab1 = fd1 < fd0;
        boolean lb1 = false;
        ab1 = !ab2;
        boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        boolean lb3 = true;
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
        Thought lo4 = Thought174.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
if(fo1 != null){
          lb3 = fo1.m2(fo0, fo1, fo0, fo1);
}
        ab1 = ab2 || ab3;
        ab4 = fb0 && fb1;
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
        boolean lb0 = false;
    Output.points[8][4] -= ad2;
    ad3 = ad4 - fd0;
    double ld1 = 351.7240130512681;
    lb0 = fb0 && fb1;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
    ad2 *= -1;
    lb0 = ad3 < ad4;
    boolean lb3 = true;

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
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    Thought lo1 = Thought222.getInstance();
    ad2 *= -1;
    Thought lo2 = Thought100.getInstance(ab4, fb0, fb1, lb0);
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    ab1 = ad2 < ad3;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
        ad4 = fd0 - fd1;
        Output.points[8][5] += ad1;
        ab1 = ab2 && ab3;
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb3);
}
        ad1 = ad2 + ad3;
        for(int i1=0; i1<10; i1++){
            lb0 = ad4 > fd0;
            Thought lo4 = Thought241.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
            fd1 = ad1 + ad2;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
              fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
            if (fb0) {
                ad1 *= -1;
                fb1 = lb3 || lb0;
}}}
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
    double ld0 = 353.6708287107059;
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = true;
    if (lb1) {
        fb0 = fb1 || lb1;
        fd1 = ld0 + fd0;
        double ld2 = 335.91901181681044;
if(ao3 != null){
          fd0 = ao3.m3(fb0, fb1, lb1, fb0);
}
        fb1 = fd1 < ld2;
        boolean lb3 = true;
        ld0 *= -1;
if(ao4 != null){
          lb3 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld2, ld0, lb1, fb0, fb1, lb3);
}
        boolean lb4 = true;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld2, ld0, lb4, lb1, fb0, fb1);
}
        lb3 = fd0 > fd1;
        Output.points[8][6] -= ld2;
        lb4 = ld0 > fd0;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb3);
}
        double ld5 = 29.386473330947315;
        lb4 = fd0 > fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ao4.m1(ld2, ld5, ld0, fd0);
}
        boolean lb6 = false;
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
    Thought lo0 = Thought173.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    double ld2 = 494.16776026072955;
    lb1 = ad4 > fd0;
    fd1 = ld2 + ad1;
    fb0 = ad2 < ad3;
    fb1 = ad4 > fd0;
    boolean lb3 = false;
    fd1 *= -1;
    Thought lo4 = Thought5.getInstance(ld2, ad1, ad2, ad3, lb1, lb3, fb0, fb1);

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
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb1 = ab1 && ab2;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb1 = false;
    Output.points[8][7] -= fd1;
    fd0 *= -1;
    ab1 = !ab2;
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    Thought lo3 = Thought333.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb1, lb2, ab1, ab2);
    ab3 = ab4 && fb0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);
}
    double ld4 = 490.9341665468163;
    boolean lb5 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, lb5, ab1, ab2, ab3);
}
    ab4 = fd1 > ld4;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
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
      ao1.m1(ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    Output.points[8][8] += fd1;
    lb0 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab1 = ad3 < ad4;
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb0;
    Thought lo1 = Thought208.getInstance(ab1, ab2, ab3, ab4);
    fd0 = fd1 - ad1;

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
    fd1 *= -1;
    Output.points[0][0] -= fd0;
    boolean lb0 = false;
    Thought lo1 = Thought141.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fd1 = fd0 - fd1;
    Thought lo2 = Thought275.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    lb0 = fb0 && fb1;
    Output.points[0][1] -= fd0;
    Output.points[0][2] -= fd1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
        Output.points[0][3] -= fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[0][4] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    Thought lo0 = Thought189.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
        boolean lb1 = true;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2();
}
    ab2 = fd1 > fd0;
    fd1 = fd0 - fd1;
    ab3 = fd0 > fd1;
    Thought lo3 = Thought141.getInstance(ab4, fb0, fb1, lb1);
        Thought lo4 = Thought212.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
        ab4 = fd0 > fd1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, lb1, lb2, ab1);
}
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab4 = fb0 && fb1;
    fd0 = fd1 + fd0;
    Thought lo7 = Thought363.getInstance(fd1, fd0, fd1, fd0);
    lb1 = !lb2;
if(fo1 != null){
      lb5 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(lb6, ab1, ab2, ab3);
}
    double ld8 = 682.4614882058229;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = false;
    boolean lb1 = false;
    Thought lo2 = Thought147.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
    double ld3 = 603.5265643043589;
    lb0 = lb1 && fb0;
    ad3 = ad4 + fd0;
    boolean lb4 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb4);
}
    fb0 = fb1 && lb0;
    double ld5 = 913.7295584843052;
    fd0 = fd1 - ld3;
    double ld6 = 376.8983989709991;
    ld5 = ld6 - ad1;
    lb1 = lb4 || fb0;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab3 = ad2 > ad3;
    boolean lb0 = true;
        ab3 = !ab4;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = lb0 && ab1;
    ab2 = ad4 < fd0;
if(fo1 != null){
          fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ad3 *= -1;
    boolean lb1 = true;
    double ld2 = 497.4018522425554;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, ld2, ad1, ad2);
}
    ad3 *= -1;

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
    boolean lb0 = false;
    Thought lo1 = Thought11.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 = fd0 - fd1;
    Output.points[0][5] -= fd0;
    fd1 = fd0 - fd1;
    lb0 = fb0 || fb1;
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(lb0, lb2, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
    fd0 = fd1 + fd0;
    lb0 = lb2 || fb0;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb2, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, lb2, fb0);
}
    boolean lb3 = false;
    fd0 *= -1;
    Output.points[0][6] += fd1;
    fb0 = fb1 && lb0;
    lb2 = !lb3;
    fd0 = fd1 + fd0;
    if (fb0) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fb1 = fd1 < fd0;
if(ao4 != null){
          lb0 = ao4.m2(fd1, fd0, fd1, fd0);
}
        double ld4 = 362.7142703586956;
        double ld5 = 629.1867661278108;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][7] += ad2;
    fb0 = ad3 > ad4;
    if (fb1) {
        boolean lb0 = false;
        Output.points[0][8] += fd0;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
        double ld1 = 391.5358355116912;
        lb0 = !fb0;
        double ld2 = 208.1990315487047;
        fb1 = lb0 || fb0;
        boolean lb3 = false;
        double ld4 = 786.5351700555985;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              ld1 = fo1.m3();
}
if(ao1 != null){
              ld2 = ao1.m3(fb0, fb1, lb0, lb3);
}
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld4, ad1, ad2, ad3, fb0, fb1, lb0, lb3);
}
            double ld5 = 727.2989410547366;
            }
        fb0 = fb1 || lb0;
        Thought lo6 = Thought234.getInstance(ad4, fd0, fd1, ld1, lb3, fb0, fb1, lb0);
if(ao2 != null){
          ld2 = ao2.m3(ao3, ao4, fo0, fo1, lb3, fb0, fb1, lb0);
}
        boolean lb7 = false;
        Output.points[1][0] += ld4;
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    fd0 = fd1 - fd0;
    ab3 = !ab4;
    fb0 = fd1 < fd0;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
    fb1 = ab1 && ab2;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab3 = fd0 > fd1;
    Output.points[1][1] -= fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
    fd0 *= -1;
if(ao4 != null){
      ab4 = ao4.m2(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}

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
    ab2 = !ab3;
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
        boolean lb1 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, lb0, ab1, ab2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fd0 *= -1;
        Thought lo2 = Thought255.getInstance(fd1, ad1, ad2, ad3);
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
        fb0 = fb1 || lb0;
    boolean lb1 = false;
    double ld2 = 276.53257660275705;
if(fo0 != null){
          fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
    lb1 = fd0 > fd1;
    double ld3 = 442.4681364631188;
    ld2 *= -1;
        fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
}
    ld3 = fd0 + fd1;
    ld2 *= -1;
    ld3 *= -1;
    fd0 = fd1 - ld2;
    lb1 = ld3 < fd0;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, ld3, fd0, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    boolean lb0 = true;
    lb0 = ab1 && ab2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      ab3 = fo1.m2();
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
    fb1 = ad3 < ad4;
    double ld0 = 974.2458297012985;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;

Thought.STACK_COUNTER++;
return ad1;
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
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(lb0, ab1, ab2, ab3);
}
    ab4 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
    fd0 *= -1;
    fd1 *= -1;
    boolean lb1 = true;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 - ad3;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought137.getInstance();
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought199.getInstance(fb1, fb0, fb1, fb0);
    fd0 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld2 = 290.33075511262166;
    Output.points[1][2] -= fd0;
    fb1 = fd1 > ld2;
    fb0 = fd0 < fd1;
    Thought lo3 = Thought285.getInstance(ld2, fd0, fd1, ld2, fb1, fb0, fb1, fb0);
    fd0 = fd1 - ld2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld2, fd0);
}
    fb1 = fd1 > ld2;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fb0 = ao4.m2(fb1, fb0, fb1, fb0);
}
    ld2 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld2;

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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    Thought lo0 = Thought312.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
    fb1 = fb0 && fb1;
    ad4 *= -1;
    fd0 *= -1;
    fb0 = fd1 > ad1;
    fb1 = fb0 && fb1;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought280.getInstance();
    boolean lb2 = true;
    Output.points[1][3] -= fd0;
    boolean lb3 = true;
if(fo0 != null){
      ao4 = fo0.m4(lb2, lb3, fb0, fb1);
}
    Thought lo4 = Thought156.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, lb2, lb3, fb0, fb1);
    ad4 = fd0 - fd1;
    double ld5 = 435.0758952810027;
    ld5 *= -1;
if(ao4 != null){
      ao4.m1(ad1, ad2, ad3, ad4, lb2, lb3, fb0, fb1);
}
    Thought lo6 = Thought176.getInstance(fo0, fo1, ao1, ao2, lb2, lb3, fb0, fb1);

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
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = fd0 < fd1;
    boolean lb0 = true;
if(ao1 != null){
      ab1 = ao1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought279.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    Thought lo2 = Thought72.getInstance();
    ab2 = ab3 || ab4;
    boolean lb3 = true;
    fd0 = fd1 - fd0;
    ab4 = !fb0;
    boolean lb4 = false;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, lb3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb4, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb3, lb4, ab1, ab2);
}
    ab3 = fd1 < fd0;
    Thought lo5 = Thought368.getInstance(ao4, fo0, fo1, ao1);
    ab4 = !fb0;
    Output.points[1][4] += fd1;
        double ld6 = 49.73185520019821;
    boolean lb7 = true;
    for(int i0=0; i0<10; i0++){
        ld6 = fd0 - fd1;
        boolean lb8 = true;
if(ao2 != null){
          ld6 = ao2.m3(fd0, fd1, ld6, fd0);
}
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
    ab1 = ab2 && ab3;
    if (ab4) {
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fb0 = fo1.m2();
}
        Thought lo0 = Thought150.getInstance(fb1, ab1, ab2, ab3);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
        double ld1 = 235.5149280594906;
        ab2 = ab3 && ab4;
        fb0 = ad3 > ad4;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld1, ad1, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
        boolean lb2 = false;
}
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
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        Output.points[1][5] -= fd1;
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
        fb1 = lb0 && fb0;
        fb1 = fd0 > fd1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        Output.points[1][6] += fd0;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        lb0 = fd0 < fd1;
if(fo1 != null){
          fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        fd1 = fd0 + fd1;
        fb0 = fd0 < fd1;
        double ld1 = 949.196758835929;
        ld1 = fd0 - fd1;
if(fo1 != null){
          fo1.m2(ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
        lb0 = fd0 < fd1;
        ld1 = fd0 - fd1;
        }
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
    boolean lb3 = false;
    boolean lb4 = true;

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
    ab1 = fd0 < fd1;
    double ld0 = 147.22626538735784;
    ab2 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    ab3 = !ab4;
    boolean lb1 = true;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      ab4 = fo1.m2();
}
    fb0 = fd1 < ld0;
    boolean lb2 = false;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ld0 = fd0 - fd1;
    fb0 = fb1 || lb1;
if(fo1 != null){
      lb2 = fo1.m2(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
    boolean lb3 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    lb3 = fd0 > fd1;
    boolean lb4 = false;
    lb4 = ld0 < fd0;

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
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
        fb0 = fb1 || lb0;
    fb0 = fd1 < ad1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    fd1 *= -1;

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
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    ab4 = fd0 > fd1;
    ad1 *= -1;
    fb0 = !fb1;
    lb0 = ab1 && ab2;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        double ld1 = 477.63485397070025;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        if (lb0) {
            boolean lb2 = false;
            lb0 = ab1 && ab2;
            ab3 = ad2 > ad3;
            ad4 = fd0 - fd1;
}}
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
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[1][7] -= fd0;
    Thought lo0 = Thought43.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m3();
}
if(ao1 != null){
      ao1.m1(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        double ld1 = 313.62552109319887;
        fb1 = fd0 > fd1;
        fb0 = ld1 < fd0;
if(ao2 != null){
          fd1 = ao2.m3(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
        fd0 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        Thought lo2 = Thought4.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
          ao1.m2(fd1, ld1, fd0, fd1);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
        boolean lb3 = false;
        double ld4 = 289.6319774710551;
        double ld5 = 714.1608254132609;
        ld4 = ld5 - fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 946.0002891677441;
    double ld1 = 990.711740764106;
    fb1 = !fb0;
    ld0 = ld1 - ad1;
    boolean lb2 = true;
if(ao2 != null){
      fb0 = ao2.m2();
}
    if (fb1) {
        lb2 = ad2 > ad3;
if(ao3 != null){
          ad4 = ao3.m3(fb0, fb1, lb2, fb0);
}
        Thought lo3 = Thought153.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1, fb1, lb2, fb0, fb1);
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
}
        Output.points[1][8] -= fd0;
        Thought lo4 = Thought387.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb2, fb0);
        fb1 = lb2 && fb0;
        Thought lo5 = Thought7.getInstance(ao2, ao3, ao4, fo0);
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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 || ab3;
        ab4 = !fb0;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        boolean lb0 = true;
        fd0 = fd1 + fd0;
if(ao2 != null){
          ao2.m2();
}
        fb0 = fb1 || lb0;
        Thought lo1 = Thought156.getInstance(ab1, ab2, ab3, ab4);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
    Output.points[2][0] += fd1;
    boolean lb0 = true;
    ab4 = fb0 && fb1;
    lb0 = ab1 || ab2;
    double ld1 = 229.89130719936634;
    ld1 = ad1 - ad2;
    Thought lo2 = Thought392.getInstance(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
    ad3 = ad4 + fd0;
    lb0 = ab1 || ab2;
    fd1 *= -1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
    fb1 = fd0 > fd1;
    double ld0 = 922.5239932951074;
    Thought lo1 = Thought184.getInstance(ld0, fd0, fd1, ld0);
    boolean lb2 = false;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    boolean lb4 = true;
    lb2 = lb3 && lb4;
if(fo0 != null){
      fb0 = fo0.m2();
}
    Thought lo5 = Thought66.getInstance(fb1, lb2, lb3, lb4);
    fd1 *= -1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, lb4, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, lb4, fb0, fb1);
}
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought92.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    Thought lo1 = Thought314.getInstance();
if(fo1 != null){
          fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    Thought lo2 = Thought19.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;

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
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3();
}
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;

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
