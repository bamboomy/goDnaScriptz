package genetic;
import java.util.ArrayList;
class Thought66 extends Thought{
private static ArrayList<Thought66> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 963.8273486183858;
private double fd1 = 472.6367331301399;
private Thought fo0 = null;
private Thought fo1 = null;
Thought66 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought66 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought66 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought66 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought66 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought66 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought66 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought66 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought66 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought66 instance = new Thought66 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought66 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought66 instance = new Thought66 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought66 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought66 instance = new Thought66 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought66 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought66 instance = new Thought66 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought66 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought66 instance = new Thought66 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought66 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought66 instance = new Thought66 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought66 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought66 instance = new Thought66 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought66 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought66 instance = new Thought66 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
    Output.points[7][1] += fd1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    if (fb1) {
        boolean lb0 = false;
        } else if (fb0) {
        fd1 = fd0 + fd1;
        fb1 = fb0 && fb1;
        double ld1 = 794.7243017777944;
if(fo1 != null){
          ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
          fo0.m2();
}
if(fo1 != null){
          fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        } else if (fb0) {
        fb1 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb2 = true;
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
    double ld0 = 335.3722233011141;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought99.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
    ab1 = fd1 > ld0;
    Output.points[7][2] -= fd0;
if(fo1 != null){
      fo1.m3();
}
        if (ab2) {
        boolean lb2 = false;
        boolean lb3 = true;
        ab1 = !ab2;
        boolean lb4 = true;
        ab2 = fd1 > ld0;
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, lb2, lb3, lb4, ab1);
}
        ab2 = fd1 > ld0;
        boolean lb5 = true;
        ab2 = ab3 || ab4;
        if (fb0) {
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb1, lb2, lb3, lb4);
}
            fd1 = ld0 - fd0;
if(fo0 != null){
              lb5 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
            fb0 = fb1 && lb2;
if(fo1 != null){
              lb3 = fo1.m2(fo0, fo1, fo0, fo1);
}
            fd1 = ld0 - fd0;
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
    fb1 = fb0 && fb1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2();
}
    fb0 = fd1 > ad1;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 + ad4;
if(fo0 != null){
          fd0 = fo0.m3(fb1, lb0, fb0, fb1);
}
        Output.points[7][3] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
        boolean lb1 = true;
        fd0 = fd1 + ad1;
        ad2 *= -1;
if(fo1 != null){
          fo1.m2(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb1);
}
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0);
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
    Output.points[7][4] -= ad2;
    if (ab2) {
        ad3 *= -1;
        ab3 = ab4 && fb0;
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        Thought lo0 = Thought235.getInstance();
        ad1 *= -1;
        ad2 *= -1;
        boolean lb1 = true;
        boolean lb2 = false;
if(fo1 != null){
          fo1.m1(ab4, fb0, fb1, lb1);
}
        Thought lo3 = Thought284.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
        for(int i0=0; i0<10; i0++){
            ab4 = ad1 < ad2;
if(fo1 != null){
              fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb2);
}
            boolean lb4 = false;
            double ld5 = 96.2607040061627;
            boolean lb6 = true;
            double ld7 = 491.1936535267138;
if(fo0 != null){
              ld5 = fo0.m3(fo1, fo0, fo1, fo0, lb1, lb2, ab1, ab2);
}
if(fo1 != null){
              ld7 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
              fo0 = fo1.m4(ad1, ad2, ad3, ad4);
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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
        Thought lo0 = Thought247.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought322.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    fd0 = fd1 - fd0;
    double ld3 = 189.5674001975775;
    boolean lb4 = true;

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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
    double ld1 = 319.6945656111046;
    Output.points[7][5] -= ad1;
    ad2 = ad3 + ad4;
    lb0 = fb0 || fb1;
    Thought lo2 = Thought130.getInstance(fo1, ao1, ao2, ao3);
        Thought lo3 = Thought167.getInstance(fd0, fd1, ld1, ad1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    Thought lo4 = Thought245.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(lb0, fb0, fb1, lb0);
}
    Thought lo5 = Thought148.getInstance(fo1, ao1, ao2, ao3, fd1, ld1, ad1, ad2, fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
if(ao4 != null){
      ao4.m2(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
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
    ab1 = ab2 || ab3;
    boolean lb0 = false;
    ab3 = fd0 < fd1;
    ab4 = !fb0;
    fb1 = lb0 || ab1;
    ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
}
    fd0 *= -1;
    Thought lo1 = Thought321.getInstance(fo1, ao1, ao2, ao3);
    ab2 = !ab3;
    Thought lo2 = Thought224.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ab4 = ao4.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
    fd0 = fd1 + fd0;
    boolean lb3 = true;
    fd1 = fd0 + fd1;
    ab1 = ab2 && ab3;
    double ld4 = 750.8452714771632;
    ab4 = fb0 && fb1;
    Output.points[7][6] += ld4;
    lb0 = lb3 && ab1;
    double ld5 = 710.1706406376246;
    ld5 *= -1;
    double ld6 = 10.033763986561341;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld6, fd0, fd1, ld4, ab2, ab3, ab4, fb0);
}
    fb1 = ld5 > ld6;
    Thought lo7 = Thought379.getInstance(fd0, fd1, ld4, ld5, lb0, lb3, ab1, ab2);

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
    Thought lo0 = Thought164.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    boolean lb1 = true;
    lb1 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao4.m1(ad1, ad2, ad3, ad4);
}
    ab1 = fd0 < fd1;
    ad1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    ab2 = fd1 < ad1;
    ad2 = ad3 - ad4;
    ab3 = !ab4;
if(ao4 != null){
      ao4.m2();
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || lb1;
        Thought lo2 = Thought153.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb0, fb1, lb1, ab1);
}
        ab2 = !ab3;
        boolean lb3 = false;
        ab3 = ab4 || fb0;
if(fo0 != null){
          fo0.m2(ad3, ad4, fd0, fd1, fb1, lb3, lb1, ab1);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
    boolean lb0 = true;
    fb0 = !fb1;
    Thought lo1 = Thought301.getInstance(fo0, fo1, fo0, fo1);
    double ld2 = 243.18684530148025;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld2, fd0);
}
    Thought lo3 = Thought43.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
    ld2 = fd0 - fd1;
    ld2 *= -1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || ab1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 302.13492769028323;
        boolean lb1 = true;
        fb0 = fb1 || lb1;
        fd0 = fd1 + ld0;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
    ad4 *= -1;
    fd0 *= -1;
    fb1 = !fb0;
        fd1 = ad1 + ad2;
    fb1 = ad3 > ad4;
    Output.points[7][7] -= fd0;
    fb0 = fd1 > ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ad2 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    ad1 = ad2 + ad3;
    Output.points[7][8] -= ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    lb0 = ad3 < ad4;
    Output.points[8][0] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fd1 = ad1 - ad2;
    fb1 = ad3 < ad4;
    fd0 = fd1 - ad1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = ab2 || ab3;
    Output.points[8][1] += ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ab2 && ab3;
    ad1 = ad2 - ad3;
    ab4 = ad4 > fd0;
    fb0 = fd1 < ad1;
    fb1 = lb0 || ab1;
    double ld1 = 703.4870670509489;
if(fo0 != null){
      ad1 = fo0.m3(ab2, ab3, ab4, fb0);
}
    ad2 *= -1;

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
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    fb0 = fb1 || lb0;
    double ld1 = 939.3949357984919;
    fd0 = fd1 - ld1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > ld1;
    boolean lb2 = true;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb0);
}
    Output.points[8][2] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
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
    boolean lb0 = false;
    ad1 = ad2 + ad3;
    lb0 = ad4 < fd0;
    double ld1 = 452.75683869557497;
    fd0 = fd1 + ld1;
    fb0 = fb1 || lb0;
if(ao1 != null){
      fb0 = ao1.m2(fb1, lb0, fb0, fb1);
}
    ad1 = ad2 - ad3;
    boolean lb2 = true;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1, lb0, lb2, fb0, fb1);
}
    lb0 = !lb2;

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
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought244.getInstance(ao1, ao2, ao3, ao4);
    Thought lo1 = Thought10.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(ab4, fb0, fb1, ab1);
}
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ab1 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = ad4 > fd0;
    ab1 = ab2 && ab3;
    Thought lo0 = Thought192.getInstance(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    Output.points[8][3] += fd1;
    Output.points[8][4] += ad1;
    ab2 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
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
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    double ld1 = 861.7101901020042;
    ld1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
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
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    boolean lb1 = false;
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        lb1 = lb2 || ab1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        ab2 = !ab3;
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
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = ad1 > ad2;
    fb1 = fb0 && fb1;
    fb0 = ad3 < ad4;
    fb1 = fb0 && fb1;
            fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
    boolean lb1 = true;
    lb1 = ad3 > ad4;
    if (fb0) {
        fb1 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
        boolean lb2 = false;
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
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought159.getInstance(fb1, ab1, ab2, ab3);
    double ld1 = 775.0283874847808;
    double ld2 = 444.3504525151993;
    boolean lb3 = false;
    ab3 = ad3 < ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ld2, ad1, ab4, fb0, fb1, lb3);
}
    Thought lo4 = Thought283.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || lb3;
    Thought lo5 = Thought374.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab4 = fd1 < ld1;
    fb0 = !fb1;
if(fo1 != null){
      ld2 = fo1.m3(ad1, ad2, ad3, ad4);
}
    Output.points[8][5] -= fd0;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, ld2, ad1);
}
    lb6 = ab1 && ab2;
    boolean lb7 = false;
    boolean lb8 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = ad2 < ad3;

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
          fd0 = ao2.m3(fb1, fb0, fb1, fb0);
}
    Output.points[8][6] -= fd1;
    double ld0 = 810.9317520540228;
    boolean lb1 = true;
    Thought lo2 = Thought69.getInstance(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
    fb1 = lb1 || fb0;
    fd0 = fd1 + ld0;
    fb1 = fd0 < fd1;
    boolean lb3 = true;
if(ao1 != null){
      lb1 = ao1.m2(ld0, fd0, fd1, ld0, lb3, fb0, fb1, lb1);
}
if(ao2 != null){
      lb3 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb3);
}
    fd0 = fd1 - ld0;
    Output.points[8][7] += fd0;
    double ld4 = 919.5830081868149;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    boolean lb5 = true;
    boolean lb6 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld4, fd0);
}
    lb5 = fd1 < ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld4, fd0, fd1, ld0);
}
    lb6 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        boolean lb7 = false;
        ld4 = fd0 - fd1;
        ld0 = ld4 + fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = ad1 < ad2;
if(ao1 != null){
      ad3 = ao1.m3();
}
    ad4 *= -1;
    double ld0 = 142.75388603485405;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ad1 < ad2;
        fb0 = fb1 && fb0;
        fb1 = ad3 > ad4;
if(ao4 != null){
          ao4.m2(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought222.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
        fb0 = ad2 < ad3;
        Thought lo2 = Thought235.getInstance(ao3, ao4, fo0, fo1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Output.points[8][8] -= fd1;
    fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
    fd1 *= -1;
    double ld1 = 880.4975575784858;
if(ao2 != null){
      ao1 = ao2.m4(ld1, fd0, fd1, ld1);
}
    ab2 = ab3 || ab4;
    boolean lb2 = true;
    double ld3 = 528.0147868980838;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld1);
}
    fb0 = fb1 || lb0;
    boolean lb4 = true;
if(ao2 != null){
      ao2.m1();
}
    lb2 = ld3 > fd0;
    lb4 = ab1 && ab2;
    fd1 = ld1 + ld3;
    ab3 = ab4 || fb0;
    fd0 = fd1 - ld1;
    boolean lb5 = true;
    fb0 = ld3 < fd0;
if(ao3 != null){
      ao3.m3(fb1, lb0, lb2, lb4);
}
    Thought lo6 = Thought167.getInstance(ao4, fo0, fo1, ao1, fd1, ld1, ld3, fd0, lb5, ab1, ab2, ab3);
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, ld3, fd0, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, lb2, lb4, lb5, ab1);
}
    ab2 = ld1 < ld3;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Output.points[0][0] -= fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ad1;
    ad2 = ad3 - ad4;
    ab2 = fd0 > fd1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought200.getInstance();
if(ao2 != null){
      ao2.m1(ab3, ab4, fb0, fb1);
}
    Output.points[0][1] -= fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = ad2 > ad3;
    fb1 = ab1 || ab2;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    boolean lb1 = true;
    ab2 = !ab3;
    ab4 = fb0 && fb1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > fd0;
    double ld0 = 925.9068664323687;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb0 = fd1 < ld0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought250.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb1 = fo1.m2(ld0, fd0, fd1, ld0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        ab3 = ab4 || fb0;
        Output.points[0][2] += fd0;
        boolean lb0 = true;
        fb0 = fb1 && lb0;
if(fo0 != null){
          fd1 = fo0.m3();
}
if(fo0 != null){
          fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
        Output.points[0][3] -= fd0;
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        double ld1 = 200.1117132570261;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
        ld1 = fd0 + fd1;
        lb0 = ab1 && ab2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
        for(int i1=0; i1<10; i1++){
            ab3 = fd0 < fd1;
            ld1 = fd0 + fd1;
            ab4 = fb0 || fb1;
            Thought lo2 = Thought277.getInstance();
            ld1 = fd0 - fd1;
if(fo1 != null){
              ld1 = fo1.m3(lb0, ab1, ab2, ab3);
}
            ab4 = fb0 && fb1;
}}
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
    fb0 = ad2 < ad3;
    fb1 = !fb0;
    boolean lb0 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = ad1 > ad2;
    Thought lo1 = Thought265.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    ad2 *= -1;
    lb0 = fb0 || fb1;
    double ld2 = 484.89850113198355;
    Output.points[0][4] += ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m3();
}
    ld2 = ad1 - ad2;
    double ld3 = 196.80780142434534;
    ad2 = ad3 + ad4;
    lb0 = fb0 || fb1;

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
    ab1 = ab2 || ab3;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m2(ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    lb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      ab1 = fo0.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    ab1 = fd0 < fd1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    double ld3 = 577.6000952925466;
    ld3 *= -1;
        Thought lo4 = Thought191.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fd0 = fd1 + ld3;
    ab2 = ab3 || ab4;
    fb0 = ad1 < ad2;

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
    fd1 *= -1;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought189.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fd1 = fd0 + fd1;
    boolean lb2 = true;
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1, fb1, lb0, lb2, fb0);
}
    fd0 *= -1;

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
    Output.points[0][5] += ad2;
    boolean lb0 = false;
    fb0 = ad3 < ad4;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
    lb0 = lb1 || fb0;
    fb1 = lb0 && lb1;
    fb0 = !fb1;
    lb0 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    lb1 = fb0 || fb1;
if(ao2 != null){
      ad4 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(lb0, lb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
    Output.points[0][6] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
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
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought375.getInstance(ao2, ao3, ao4, fo0);
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
    ab3 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    ab4 = fd0 < fd1;
    Output.points[0][7] += fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    ab1 = ab2 || ab3;
    fd1 = ad1 + ad2;
    Output.points[0][8] -= ad3;
    ab4 = ad4 > fd0;
    Output.points[1][0] -= fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m2(fb0, fb1, ab1, ab2);
}
    double ld0 = 572.2292385885369;
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought204.getInstance(fo1, ao1, ao2, ao3);
    ab4 = fb0 && fb1;
if(ao4 != null){
      ad1 = ao4.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, ad1, ad2);
}
    double ld2 = 452.0246505823964;
        boolean lb3 = true;
if(ao4 != null){
      ao4.m2();
}
if(fo0 != null){
      ad2 = fo0.m3(lb3, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Thought lo4 = Thought341.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb3, ab1, ab2, ab3);
if(ao4 != null){
      ao4.m2(ld0, ld2, ad1, ad2, ab4, fb0, fb1, lb3);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought237.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fb1 = !fb0;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    lb1 = fb0 || fb1;
    Thought lo2 = Thought68.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Output.points[1][1] -= fd0;
    boolean lb3 = true;
    fd1 = fd0 + fd1;
    boolean lb4 = true;

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
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought323.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
    boolean lb3 = true;
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;

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
