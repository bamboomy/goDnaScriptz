package genetic;
import java.util.ArrayList;
class Thought380 extends Thought{
private static ArrayList<Thought380> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 296.4102637996984;
private double fd1 = 961.3198431337648;
private Thought fo0 = null;
private Thought fo1 = null;
Thought380 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought380 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought380 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought380 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought380 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought380 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought380 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought380 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought380 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought380 instance = new Thought380 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought380 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought380 instance = new Thought380 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought380 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought380 instance = new Thought380 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought380 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought380 instance = new Thought380 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought380 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought380 instance = new Thought380 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought380 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought380 instance = new Thought380 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought380 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought380 instance = new Thought380 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought380 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought380 instance = new Thought380 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 607.4566890682984;
    double ld1 = 798.2984376696986;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
    lb2 = lb3 || fb0;
    fb1 = lb2 && lb3;
if(fo0 != null){
      fb0 = fo0.m2(ld1, fd0, fd1, ld0);
}
    Output.points[1][1] += ld1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb1 = fd1 > ld0;
if(fo1 != null){
      fo1.m2(lb2, lb3, fb0, fb1);
}
    lb2 = ld1 < fd0;
    fd1 = ld0 - ld1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, lb3, fb0, fb1, lb2);
}
    lb3 = fb0 && fb1;
    Thought lo4 = Thought59.getInstance(fd0, fd1, ld0, ld1, lb2, lb3, fb0, fb1);
    boolean lb5 = false;
    lb2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, lb5, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
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
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab2 = !ab3;
    ab4 = !fb0;
    Output.points[1][2] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fb1, ab1, ab2, ab3);
}
    Output.points[1][3] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    Output.points[1][4] -= fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld0 = 101.39413422255396;
    boolean lb1 = false;
    fb0 = ld0 > fd0;
    boolean lb2 = true;
    fd1 = ld0 - fd0;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought252.getInstance(ld0, fd0, fd1, ld0);
    fd0 = fd1 - ld0;

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
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought219.getInstance();
    fb0 = !fb1;
    Thought lo1 = Thought202.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    boolean lb2 = true;
    ad4 *= -1;
    Output.points[1][5] += fd0;
    fd1 = ad1 + ad2;
    boolean lb3 = true;
if(fo1 != null){
      lb3 = fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb2, lb3);
}
    Output.points[1][6] -= ad1;

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
    ad2 = ad3 + ad4;
    ab1 = fd0 < fd1;
    ab2 = ad1 < ad2;
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    boolean lb2 = false;
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
    Thought lo3 = Thought28.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb4 = false;
    boolean lb5 = true;
    double ld6 = 797.1945153406847;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, lb2, lb4);
}
    lb5 = ab1 || ab2;
    Thought lo7 = Thought106.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld6, ad1, ab3, ab4, fb0, fb1);
    lb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld6, lb1, lb2, lb4, lb5);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    double ld8 = 962.7933954981305;
    boolean lb9 = true;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
        Thought lo0 = Thought187.getInstance(fd0, fd1, fd0, fd1);
        double ld1 = 22.486416851933168;
        ld1 = fd0 - fd1;
        fb0 = fb1 && fb0;
        fb1 = fb0 || fb1;
        fb0 = !fb1;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
        fb1 = fb0 || fb1;
if(ao2 != null){
          ao1 = ao2.m4();
}
        fd0 *= -1;
        fb0 = fd1 < ld1;
if(ao3 != null){
          ao3.m3(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ld1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        boolean lb2 = false;
        boolean lb3 = false;
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
    ad1 = ad2 + ad3;
    ad4 *= -1;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought386.getInstance();
    lb1 = !fb0;
    ad1 = ad2 + ad3;
    Output.points[1][7] += ad4;
        fb1 = !lb0;
    fd0 = fd1 + ad1;
if(ao1 != null){
      lb1 = ao1.m2(fb0, fb1, lb0, lb1);
}
    Output.points[1][8] -= ad2;
    Thought lo3 = Thought261.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, lb0, lb1, fb0);
}
    fb1 = lb0 && lb1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
        ad3 *= -1;
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
    Output.points[2][0] += fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
        Thought lo1 = Thought10.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    lb0 = ab1 || ab2;
    boolean lb2 = false;
    double ld3 = 815.7271501687768;
if(fo0 != null){
      ld3 = fo0.m3();
}
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld3, fd0, fb1, lb0, lb2, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(fd1, ld3, fd0, fd1, ab3, ab4, fb0, fb1);
}
    if (lb0) {
        boolean lb4 = true;
        boolean lb5 = false;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, lb5, lb0, lb2, ab1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, ad1, ad2);
}
    Output.points[2][1] += ad3;
    ab3 = ad4 > fd0;
    Output.points[2][2] += fd1;
    ab4 = fb0 && fb1;
    boolean lb0 = true;
    lb0 = ad1 > ad2;
    boolean lb1 = false;
    Output.points[2][3] -= ad3;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    Output.points[2][4] += fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = ab2 && ab3;
    double ld2 = 970.4979404984618;
    ab4 = fd0 > fd1;
if(ao3 != null){
      ld2 = ao3.m3(fb0, fb1, lb0, lb1);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
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
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought354.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[2][5] += fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd1 < fd0;
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld1 = 760.8228168150397;
    double ld2 = 468.8838593942305;
    ld2 = fd0 - fd1;
    fb0 = ld1 < ld2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld2, fb1, fb0, fb1, fb0);
}
    Output.points[2][6] -= fd0;
    Thought lo3 = Thought215.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fd1 = ld1 + ld2;
    boolean lb4 = true;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld5 = 345.7841652990591;
    double ld6 = 589.0746303189865;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought382.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought101.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb2 = false;
    boolean lb3 = false;
    lb3 = ab1 || ab2;
if(fo1 != null){
          fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    lb2 = lb3 || ab1;
        double ld4 = 518.8620952363189;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo5 = Thought322.getInstance(fd1, ld4, fd0, fd1, fb1, lb2, lb3, ab1);
    ld4 = fd0 + fd1;
    ab2 = ab3 || ab4;
    Thought lo6 = Thought334.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb3);
    boolean lb7 = true;
    Thought lo8 = Thought187.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0);
}
    lb7 = fd1 > ld4;
    ab1 = fd0 < fd1;
if(fo1 != null){
      ab2 = fo1.m2();
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
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ad1 - ad2;
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    ad3 *= -1;
    boolean lb1 = false;
    lb0 = ad4 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        Thought lo1 = Thought312.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
          fo1.m3();
}
        boolean lb2 = false;
if(fo0 != null){
          fo0.m1(lb0, lb2, ab1, ab2);
}
        Thought lo3 = Thought80.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
        double ld4 = 551.8142168449975;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb0, lb2, ab1, ab2);
}
        Thought lo5 = Thought53.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        fd1 *= -1;
        lb0 = !lb2;
        ab1 = ab2 && ab3;
        double ld6 = 429.1249411917837;
        ab4 = fb0 || fb1;
if(fo0 != null){
          ld4 = fo0.m3(ld6, ad1, ad2, ad3);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld4);
}
        double ld7 = 114.53014564339162;
        if (lb0) {
            lb2 = ab1 || ab2;
            boolean lb8 = true;
if(fo0 != null){
              ld6 = fo0.m3();
}
if(fo0 != null){
              fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
            boolean lb9 = true;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld7, ad1, ad2, ad3, fb0, fb1, lb8, lb9);
}
if(fo0 != null){
              fo1 = fo0.m4(ad4, fd0, fd1, ld4, lb0, lb2, ab1, ab2);
}
            ab3 = ab4 || fb0;
if(fo1 != null){
              ld6 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb8, lb9, lb0);
}
}}
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(ao4 != null){
      ao4.m2(lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought95.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
    Thought lo3 = Thought381.getInstance(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    double ld4 = 58.9406367282388;
    ld4 *= -1;
        double ld5 = 607.708567174917;
if(ao3 != null){
      ao2 = ao3.m4(ld5, fd0, fd1, ld4);
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
    boolean lb0 = false;
    fb0 = !fb1;
    ad2 *= -1;
    lb0 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m2();
}
    ad1 = ad2 - ad3;
    Thought lo1 = Thought266.getInstance(fb1, lb0, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    ad2 *= -1;
    fb0 = fb1 && lb0;
    fb0 = fb1 && lb0;
    ad3 = ad4 + fd0;
    fb0 = fd1 < ad1;
    fb1 = !lb0;
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao3.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ad4 = fd0 + fd1;
    fb1 = ad1 < ad2;
    lb0 = fb0 && fb1;
    ad3 *= -1;
        Thought lo2 = Thought317.getInstance(ad4, fd0, fd1, ad1);
    Output.points[2][7] += ad2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo0 = Thought206.getInstance();
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    Output.points[2][8] -= fd1;
    double ld1 = 946.7019420055694;
    Output.points[3][0] -= ld1;
    double ld2 = 614.1999830066403;
    Thought lo3 = Thought202.getInstance(ld2, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
    Output.points[3][1] += ld2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    boolean lb4 = true;

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
    ab1 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    ab3 = !ab4;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, ab1, ab2, ab3);
}
    double ld0 = 275.87667437370015;
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    double ld1 = 778.1327577678849;
    ld1 *= -1;
    double ld2 = 137.42986945100412;
if(fo0 != null){
      ld2 = fo0.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb1 = !ab1;
    ld1 *= -1;
    boolean lb3 = false;
    ld2 = ad1 - ad2;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    Thought lo0 = Thought324.getInstance(fd1, fd0, fd1, fd0);
    fb1 = fd1 < fd0;
    Thought lo1 = Thought185.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    double ld2 = 635.4918165168518;

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
    fd0 = fd1 - fd0;
    ab1 = !ab2;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = fd0 > fd1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    double ld1 = 361.0453582723142;
if(fo1 != null){
      ab3 = fo1.m2(ld1, fd0, fd1, ld1);
}
    Thought lo2 = Thought303.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
    fd1 = ld1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(ld1, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    ld1 = fd0 - fd1;
    Thought lo3 = Thought80.getInstance();
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought268.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    ad4 *= -1;
    fb0 = !fb1;
        fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
    fb1 = fd1 > ad1;
    Thought lo1 = Thought269.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
}
    Output.points[3][2] += ad1;
    double ld2 = 354.99376611613883;
    fb0 = ad1 < ad2;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
    fd1 = ld2 - ad1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 677.4003875470734;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
if(fo0 != null){
      ab4 = fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought186.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1);
}
    fb1 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
      ao2.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    Output.points[3][3] += fd1;
    if (lb0) {
        boolean lb1 = false;
if(ao3 != null){
          lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb0);
}
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb0);
}
        fd0 = fd1 - fd0;
        fb0 = !fb1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, lb0, fb0, fb1);
}
if(ao4 != null){
          lb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          lb0 = ao3.m2(fd1, fd0, fd1, fd0);
}
        double ld2 = 674.5803978650865;
        double ld3 = 459.9122083985157;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld2);
}
if(ao4 != null){
          fb0 = ao4.m2();
}
        fb1 = lb1 && lb0;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb1, lb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
    boolean lb0 = false;
    fd0 *= -1;
    boolean lb1 = false;
    lb0 = fd1 > ad1;
        Thought lo2 = Thought399.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
    lb1 = fd0 > fd1;
    double ld3 = 108.81180459735012;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, lb1);
}
    double ld4 = 666.6123131771323;
    Output.points[3][4] -= ld3;
    boolean lb5 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld4, ad1, ad2, ad3, lb5, fb0, fb1, lb0);
}
    lb1 = ad4 < fd0;
if(ao3 != null){
      ao3.m1(fd1, ld3, ld4, ad1, lb5, fb0, fb1, lb0);
}
    Output.points[3][5] += ad2;
    lb1 = ad3 > ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb5, fb0, fb1, lb0);
}
    Output.points[3][6] += fd0;

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
    ab2 = ab3 && ab4;
    Thought lo0 = Thought64.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld1 = 742.1976589211985;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
if(ao2 != null){
      ao2.m2(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab4 = fb0 && fb1;
    ld1 = fd0 + fd1;
    ab1 = ab2 && ab3;
    boolean lb2 = false;
if(ao2 != null){
      ao2.m3(ld1, fd0, fd1, ld1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
    ab2 = fd1 < ad1;
    boolean lb0 = false;
    ab2 = !ab3;
    boolean lb1 = false;
    Thought lo2 = Thought239.getInstance(ab3, ab4, fb0, fb1);
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
    ab4 = fd1 > ad1;
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
    Output.points[3][7] += fd1;
    ab1 = ab2 || ab3;
    Output.points[3][8] += ad1;
    ab4 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb3 = false;
if(ao2 != null){
      ao2.m2(ad4, fd0, fd1, ad1);
}
    double ld4 = 462.385164691717;
    double ld5 = 773.9249388915578;
    ab2 = ab3 && ab4;
    Thought lo6 = Thought108.getInstance(ao3, ao4, fo0, fo1, ld5, ad1, ad2, ad3);

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    Thought lo0 = Thought249.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[4][0] += fd1;
    fd0 = fd1 - fd0;
    double ld2 = 136.93651387560521;
    fd0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld2, fd0, fd1);
}
    ld2 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
    Thought lo3 = Thought112.getInstance();
    lb1 = fb0 || fb1;
    lb1 = fd0 > fd1;
    Output.points[4][1] -= ld2;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb1, fb0);
}
    double ld4 = 306.7634374267634;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, ld4, fd0, fb1, lb1, fb0, fb1);
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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[4][2] -= fd1;
    Output.points[4][3] -= fd0;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    ab4 = fd1 > fd0;
    Output.points[4][4] -= fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    ab4 = fd0 < fd1;
    Output.points[4][5] += fd0;
    boolean lb2 = true;
    Thought lo3 = Thought107.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    double ld4 = 427.89688133880605;
    double ld5 = 833.3642250374681;
    ab4 = ld5 > fd0;
if(fo0 != null){
      fb0 = fo0.m2();
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought350.getInstance(fb0, fb1, fb0, fb1);
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    boolean lb1 = false;
    ad4 = fd0 + fd1;
    boolean lb2 = false;
    Output.points[4][6] -= ad1;
    lb1 = lb2 || fb0;
    ad2 *= -1;

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
    ab2 = !ab3;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    fd0 *= -1;
    ab1 = ab2 || ab3;
    fd1 *= -1;
    double ld1 = 34.64353590044165;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m1();
}
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
    if (fb1) {
        Output.points[4][7] -= fd0;
        boolean lb0 = true;
        fd1 = fd0 - fd1;
if(ao3 != null){
          lb0 = ao3.m2(fb0, fb1, lb0, fb0);
}
        fd0 = fd1 - fd0;
        fd1 *= -1;
        boolean lb1 = true;
        boolean lb2 = false;
        if (lb2) {
if(ao4 != null){
              fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
}}
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
    fb1 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    Thought lo0 = Thought290.getInstance(ad4, fd0, fd1, ad1);
    fb0 = ad2 < ad3;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    lb1 = !ab1;
    fd1 = fd0 - fd1;
    Thought lo2 = Thought14.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    boolean lb3 = true;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    lb0 = !lb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb3, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao3.m2();
}
if(ao4 != null){
      ad2 = ao4.m3(ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        ab1 = !ab2;
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
        ad2 *= -1;
        ad3 *= -1;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + fd0;
    Output.points[4][8] -= fd1;
    boolean lb0 = true;
        double ld1 = 431.25339012054684;
if(fo1 != null){
      fo1.m2(lb0, fb0, fb1, lb0);
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
    boolean lb0 = false;
    Thought lo1 = Thought43.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
        Thought lo2 = Thought310.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought284.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb4 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    lb4 = !fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb4, fb0);
}
    boolean lb5 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb4);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb5, fb0, fb1, lb0);
}
    lb4 = lb5 && fb0;

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
    fd1 *= -1;
    Output.points[5][0] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    lb0 = !lb1;
    fb0 = !fb1;
    Thought lo2 = Thought357.getInstance();
    Thought lo3 = Thought191.getInstance(lb0, lb1, fb0, fb1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
    Thought lo4 = Thought81.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
    fb1 = lb0 || lb1;
    fb0 = fd1 < fd0;
    Thought lo5 = Thought171.getInstance(fo1, fo0, fo1, fo0);
    Thought lo6 = Thought206.getInstance(fd1, fd0, fd1, fd0);
    boolean lb7 = false;
    fb0 = fd1 < fd0;
    boolean lb8 = false;
    fb0 = fb1 && lb0;
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
