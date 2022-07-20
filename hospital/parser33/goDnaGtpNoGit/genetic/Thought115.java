package genetic;
import java.util.ArrayList;
class Thought115 extends Thought{
private static ArrayList<Thought115> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 805.4933957170206;
private double fd1 = 162.5352943431945;
private Thought fo0 = null;
private Thought fo1 = null;
Thought115 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought115 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought115 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought115 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought115 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought115 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought115 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought115 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought115 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought115 instance = new Thought115 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought115 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought115 instance = new Thought115 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought115 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought115 instance = new Thought115 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought115 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought115 instance = new Thought115 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought115 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought115 instance = new Thought115 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought115 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought115 instance = new Thought115 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought115 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought115 instance = new Thought115 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought115 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought115 instance = new Thought115 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
          fo1.m1();
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought268.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fb0 = !fb1;
    lb1 = fd1 > fd0;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    double ld2 = 672.8956691537923;
    lb1 = fd0 < fd1;
    boolean lb3 = true;
    ld2 = fd0 - fd1;
    ld2 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
    fd1 *= -1;
    ld2 = fd0 + fd1;

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
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fb1 = ab1 && ab2;
    fd1 *= -1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought100.getInstance(fo0, fo1, fo0, fo1);
    ab4 = fb0 && fb1;
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
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
    ad1 = ad2 + ad3;
    ad4 *= -1;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    fb1 = fd0 < fd1;
    Output.points[2][3] += ad1;
    fb0 = ad2 < ad3;
    Thought lo0 = Thought346.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
    Output.points[2][4] -= ad1;
    boolean lb1 = true;
    ad2 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought272.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
    ad1 *= -1;
    if (fb0) {
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
    fd1 = ad1 + ad2;
    Thought lo1 = Thought202.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    lb0 = !ab1;
    ab2 = ab3 && ab4;
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
    boolean lb2 = false;
    Thought lo3 = Thought325.getInstance();
    double ld4 = 872.8839803344154;
    Output.points[2][5] += fd0;
    fd1 = ld4 - ad1;
    Output.points[2][6] += ad2;
    ad3 *= -1;
    double ld5 = 992.6822862830693;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ld4 < ld5;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, lb0, lb2, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb2 = fo1.m2(fd0, fd1, ld4, ld5);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;

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
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    lb0 = fd1 > fd0;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    double ld1 = 393.1439933661969;
    Thought lo2 = Thought27.getInstance(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1);
    fb1 = fd0 < fd1;
    boolean lb3 = true;
    if (lb0) {
        lb3 = ld1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao1 != null){
          ao1.m3(fb0, fb1, lb0, lb3);
}
        boolean lb4 = true;
        boolean lb5 = false;
        } else if (fb0) {
        fb1 = fd1 > ld1;
        boolean lb6 = true;
        fd0 = fd1 + ld1;
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
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 952.4554953171905;
if(ao1 != null){
      fb0 = ao1.m2(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    double ld1 = 757.0318839608225;
    ad3 = ad4 - fd0;
    double ld2 = 921.8254340754678;
    fd0 *= -1;
    boolean lb3 = false;
    boolean lb4 = true;
    lb4 = fb0 || fb1;
    boolean lb5 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb3, lb4, lb5, fb0);
}
    boolean lb6 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo7 = Thought362.getInstance(fd1, ld0, ld1, ld2);
    fb0 = fb1 && lb3;
    lb4 = lb5 || lb6;
    Output.points[2][7] -= ad1;
    fb0 = fb1 || lb3;
    boolean lb8 = true;
    Thought lo9 = Thought289.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    lb4 = lb5 && lb6;
if(fo1 != null){
      fo1.m3();
}
    if (lb8) {
        double ld10 = 330.11878655510407;
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
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    Output.points[2][8] += fd1;
    ab1 = ab2 && ab3;
    boolean lb0 = true;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    double ld1 = 603.5354442811456;
if(ao2 != null){
      ao2.m1(fd0, fd1, ld1, fd0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo2 = Thought334.getInstance(ab3, ab4, fb0, fb1);
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, lb0, ab1, ab2, ab3);
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
    ab1 = ad1 > ad2;
    ab2 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ab2 && ab3;
    boolean lb0 = false;
    double ld1 = 528.6206347806195;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    fd1 *= -1;
    Output.points[3][0] -= ld1;
    ab3 = ad1 < ad2;
    Output.points[3][1] -= ad3;
    ab4 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld1);
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought10.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought321.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    if (fb1) {
if(fo1 != null){
          fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb2 = true;
        Thought lo3 = Thought90.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fb1 = fd0 < fd1;
        } else {
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        double ld4 = 645.007417526208;
        Thought lo5 = Thought359.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0);
if(fo0 != null){
          fb0 = fo0.m2();
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 35.49148664324455;
        double ld1 = 643.6497686367469;
    ld0 = ld1 + fd0;
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    fd1 *= -1;
    if (ab2) {
        ld0 = ld1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0, ab3, ab4, fb0, fb1);
}
        Output.points[3][2] -= fd1;
        Thought lo2 = Thought366.getInstance(ld0, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
        } else if (fb0) {
        ld0 = ld1 + fd0;
        boolean lb3 = false;
        fd1 *= -1;
        ld0 *= -1;
        boolean lb4 = true;
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb3, lb4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        if (ab1) {
if(fo1 != null){
              ld1 = fo1.m3(fd0, fd1, ld0, ld1);
}
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
if(fo0 != null){
              fo1 = fo0.m4();
}
            ab2 = ab3 || ab4;
            Thought lo5 = Thought314.getInstance(fb0, fb1, lb3, lb4);
            Thought lo6 = Thought356.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, ab1, ab2, ab3, ab4);
            Thought lo7 = Thought151.getInstance(fd0, fd1, ld0, ld1, fb0, fb1, lb3, lb4);
            fd0 = fd1 - ld0;
}}
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
        Output.points[3][3] -= ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
        ad1 = ad2 - ad3;
    fb1 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ad1, ad2, ad3);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought297.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[3][4] += fd0;
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ad4 = fd0 - fd1;
    boolean lb1 = false;
    lb1 = ad1 < ad2;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
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
    ab1 = ab2 && ab3;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought21.getInstance();
    boolean lb1 = false;
    ab3 = ab4 && fb0;
    Output.points[3][5] -= fd1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb1 = !ab1;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought366.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought135.getInstance(fb0, fb1, fb0, fb1);
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought308.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought40.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
if(ao3 != null){
      ao2 = ao3.m4();
}
        boolean lb3 = false;
if(ao4 != null){
      fd1 = ao4.m3(fb0, fb1, lb3, fb0);
}
    fb1 = lb3 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, lb3, fb0, fb1);
}
    Thought lo4 = Thought230.getInstance(fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb3);
    double ld5 = 768.0063733844041;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb3, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    ld5 *= -1;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld5, fd0, fd1);
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
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fb1 = !fb0;
    if (fb1) {
if(ao1 != null){
          fo1 = ao1.m4();
}
        fb0 = fb1 && fb0;
        fb1 = fd0 < fd1;
        fb0 = ad1 < ad2;
        ad3 *= -1;
        ad4 = fd0 + fd1;
        boolean lb0 = true;
if(ao2 != null){
          ao2.m3(fb0, fb1, lb0, fb0);
}
        fb1 = ad1 > ad2;
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
    ab2 = fd0 > fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fd0 *= -1;
    boolean lb0 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
    ab1 = ab2 && ab3;
    boolean lb2 = true;
    fd0 = fd1 - fd0;
    ab3 = ab4 || fb0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld4 = 384.9446272005712;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld4, fd0, fd1, ld4, lb2, lb3, ab1, ab2);
}
    fd0 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][6] += ad1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    double ld0 = 273.2482842021195;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    ab4 = fd0 > fd1;
    boolean lb1 = true;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
}
    boolean lb2 = false;
    ab3 = ad4 > fd0;
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m2(ab3, ab4, fb0, fb1);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    boolean lb1 = false;
    Thought lo2 = Thought137.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
    lb0 = fd1 < fd0;
    if (lb1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        double ld3 = 716.307562387426;
        fb0 = fb1 && lb0;
        lb1 = !fb0;
        if (fb1) {
            Output.points[3][7] += ld3;
            Thought lo4 = Thought364.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
            fd1 = ld3 - fd0;
            fd1 *= -1;
            Thought lo5 = Thought199.getInstance();
if(fo1 != null){
              fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
            ld3 *= -1;
}}
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
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    ab1 = fd0 < fd1;
    double ld1 = 435.11234685079063;
    ab2 = ab3 && ab4;
    Thought lo2 = Thought110.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = ld1 > fd0;
    ab3 = ab4 && fb0;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
    boolean lb4 = true;
    ab4 = fb0 || fb1;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought360.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
    Output.points[3][8] += fd1;
    boolean lb3 = false;
    double ld4 = 646.2811034962853;
    lb2 = ld4 < ad1;
    lb3 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld4, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      lb3 = fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb1);
}
    lb2 = fd1 < ld4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb3 = ad1 < ad2;
    ad3 *= -1;
    ad4 *= -1;
    fd0 *= -1;
    fb0 = fd1 > ld4;
    fb1 = ad1 > ad2;
    Output.points[4][0] += ad3;

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
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Output.points[4][1] += fd1;
    boolean lb0 = true;
        lb0 = ab1 && ab2;
    Thought lo1 = Thought342.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo0 != null){
      ab3 = fo0.m2();
}
    fd0 *= -1;
    ab4 = fb0 && fb1;
    lb0 = ab1 || ab2;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ad1;
        double ld2 = 965.3231563029495;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb3, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    double ld0 = 83.80987865169266;
    double ld1 = 893.2796587899333;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld0);
}
    fb0 = ld1 < fd0;
    fd1 = ld0 + ld1;
    boolean lb2 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1);
}
    boolean lb3 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      lb3 = ao3.m2(fb0, fb1, lb2, lb3);
}
    boolean lb4 = true;
    lb4 = !fb0;
    fb1 = fd0 < fd1;
    Output.points[4][2] += ld0;
    double ld5 = 648.91683899862;
    double ld6 = 464.48108860711125;
    lb2 = ld1 < ld5;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld6, fd0, fd1, ld0, lb3, lb4, fb0, fb1);
}
    double ld7 = 781.2603183120756;
if(ao3 != null){
      ao3.m3(ld1, ld5, ld6, ld7, lb2, lb3, lb4, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, lb2, lb3, lb4);
}
    fb0 = fb1 && lb2;
    lb3 = !lb4;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 + ld0;
    boolean lb8 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    fb1 = ad2 > ad3;
    Output.points[4][3] -= ad4;
if(ao2 != null){
      ao2.m3(fd0, fd1, ad1, ad2);
}
    double ld0 = 343.2643170899998;
    boolean lb1 = true;
    ad2 *= -1;
    lb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
    boolean lb2 = false;
    ad1 *= -1;
    ad2 *= -1;
if(ao3 != null){
      ao3.m2();
}
    double ld3 = 316.07132259361026;
if(fo0 != null){
      ao4 = fo0.m4(lb1, lb2, fb0, fb1);
}
    ad2 *= -1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb1, lb2, fb0, fb1);
}
    double ld4 = 769.8426260580645;
    boolean lb5 = false;
    ld0 *= -1;
    ld3 *= -1;
    lb1 = ld4 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb2, lb5, fb0, fb1);
}
    if (lb1) {
        double ld6 = 336.4143672901086;
        lb2 = fd0 < fd1;
        lb5 = ld6 > ld0;
}
Thought.STACK_COUNTER++;
return ld4;
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
    if (ab2) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
        ab1 = fd1 < fd0;
        boolean lb0 = false;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        Thought lo1 = Thought226.getInstance(fd1, fd0, fd1, fd0);
        fd1 *= -1;
        double ld2 = 568.5850367264273;
        ab1 = ab2 || ab3;
        double ld3 = 359.69502153954136;
        ab4 = !fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, ld3, fd0, fd1);
}
        for(int i0=0; i0<10; i0++){
if(ao2 != null){
              ao1 = ao2.m4();
}
            fb1 = !lb0;
            ld2 = ld3 - fd0;
}}
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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 + ad2;
    boolean lb0 = true;
    Output.points[4][4] += ad3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, ab1);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2);
}
    double ld1 = 314.0979736841377;
    double ld2 = 755.9426600533095;
    Thought lo3 = Thought96.getInstance(ad3, ad4, fd0, fd1);
    ld1 = ld2 + ad1;
    ab2 = ab3 && ab4;
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ld2);
}

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        }
    fd0 = fd1 - fd0;
    Thought lo0 = Thought337.getInstance();
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    double ld1 = 603.5737256216495;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[4][5] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld1 = fd0 + fd1;
        ld1 = fd0 + fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fb1 = fb0 && fb1;

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
    Thought lo0 = Thought87.getInstance();
    fd0 = fd1 - fd0;
    double ld1 = 37.03876708331392;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
}
    double ld2 = 704.803787025866;
    ab4 = fb0 || fb1;

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
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    Output.points[4][6] += fd0;
    Thought lo0 = Thought341.getInstance();
    Thought lo1 = Thought268.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Output.points[4][7] -= ad4;
    fd0 = fd1 + ad1;

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
    ad2 = ad3 + ad4;
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    Output.points[4][8] -= ad3;
        ad4 = fd0 - fd1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld0 = 863.7121206479604;
    ab4 = ad1 > ad2;
    ad3 *= -1;
        boolean lb1 = false;

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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
if(ao4 != null){
      fd0 = ao4.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought324.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = ad1 - ad2;
if(ao4 != null){
      ao4.m2(fb1, fb0, fb1, fb0);
}
    double ld0 = 240.720486950131;
    fb1 = fb0 && fb1;
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;

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
    ab2 = ab3 || ab4;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
    ab2 = fd0 > fd1;
    ab3 = ab4 && fb0;
    fb1 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    ab4 = !fb0;
    fd0 *= -1;
    fb1 = fd1 < fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(lb0, ab1, ab2, ab3);
}
    Output.points[5][0] += fd0;

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
    ad2 = ad3 + ad4;
    Thought lo0 = Thought120.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
    ad3 = ad4 - fd0;
    Thought lo1 = Thought195.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
    ad4 = fd0 - fd1;
    boolean lb2 = true;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    double ld3 = 911.6849624825525;
    lb2 = !ab1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    ld3 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = !lb2;
if(fo1 != null){
      fd1 = fo1.m3(ld3, ad1, ad2, ad3);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld3);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
if(fo1 != null){
      ad1 = fo1.m3();
}
if(ao1 != null){
      fb1 = ao1.m2(lb2, ab1, ab2, ab3);
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
    Output.points[5][1] += fd0;
    boolean lb0 = false;
    lb0 = fd1 > fd0;
    Output.points[5][2] -= fd1;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    boolean lb3 = true;
    lb1 = !lb2;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fd0 > fd1;
    boolean lb1 = false;
    Output.points[5][3] += fd0;
    fd1 *= -1;
    double ld2 = 274.17870794642386;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    lb3 = ld2 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld2, fd0, fd1);
}
    boolean lb4 = true;
    fb0 = ld2 < fd0;

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
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
            fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought326.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    Output.points[5][4] -= fd0;

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
