package genetic;
import java.util.ArrayList;
class Thought210 extends Thought{
private static ArrayList<Thought210> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 481.66182792998507;
private double fd1 = 156.5610531128301;
private Thought fo0 = null;
private Thought fo1 = null;
Thought210 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought210 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought210 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought210 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought210 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought210 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought210 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought210 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought210 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought210 instance = new Thought210 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought210 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought210 instance = new Thought210 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought210 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought210 instance = new Thought210 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought210 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought210 instance = new Thought210 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought210 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought210 instance = new Thought210 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought210 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought210 instance = new Thought210 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought210 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought210 instance = new Thought210 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought210 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought210 instance = new Thought210 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 620.8376875100754;
    boolean lb1 = true;
    ld0 = fd0 + fd1;
    Output.points[1][4] -= ld0;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fd0 = fo1.m3(lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 || fb1;
    fd0 *= -1;
    double ld3 = 269.85727425409647;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    lb1 = fd1 > ld0;
    lb2 = fb0 || fb1;
    Thought lo4 = Thought175.getInstance(ld3, fd0, fd1, ld0);

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
    double ld0 = 96.3355137161088;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    ld0 = fd0 + fd1;
    lb1 = ld0 < fd0;
    fd1 = ld0 + fd0;
    ab1 = !ab2;
    ab3 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought399.getInstance(ab4, fb0, fb1, lb1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ld0;
    Output.points[1][5] += fd0;
    fb1 = fd1 > ld0;
    Output.points[1][6] += fd0;
    lb1 = fd1 > ld0;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 131.80094334984932;
    ld0 *= -1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    double ld1 = 505.1923883855771;
    boolean lb2 = false;
    ld1 *= -1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb0, fb1, lb2, fb0);
}
    fb1 = ad1 > ad2;
if(fo0 != null){
      lb2 = fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
}
    fb1 = ld0 > ld1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
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
    ad2 = ad3 + ad4;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        Output.points[1][7] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
        Thought lo1 = Thought394.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
        double ld2 = 981.9043150252081;
        ab1 = ad1 > ad2;
if(fo1 != null){
          fo0 = fo1.m4();
}
        double ld3 = 48.170358713914844;
if(fo0 != null){
          ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
        Thought lo4 = Thought394.getInstance(fd1, ld2, ld3, ad1, ab4, fb0, fb1, lb0);
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        Output.points[1][8] += ad2;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought75.getInstance(ao1, ao2, ao3, ao4);
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought92.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
if(ao4 != null){
      ao4.m1();
}
    boolean lb3 = false;
if(fo0 != null){
      fd1 = fo0.m3(lb3, fb0, fb1, lb1);
}
    lb3 = fd0 > fd1;
    Thought lo4 = Thought83.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb3);
    fb0 = fd0 > fd1;
    boolean lb5 = true;
    Output.points[2][0] += fd0;
    boolean lb6 = true;
    boolean lb7 = true;
    fd1 *= -1;
    Thought lo8 = Thought342.getInstance(fd0, fd1, fd0, fd1, lb6, lb7, fb0, fb1);
    Thought lo9 = Thought248.getInstance(ao4, fo0, fo1, ao1, lb1, lb3, lb5, lb6);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld10 = 962.924536583945;
if(ao2 != null){
      ao2.m1(ld10, fd0, fd1, ld10);
}
    Thought lo11 = Thought169.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld10, fd0);
    fd1 = ld10 - fd0;
    fd1 = ld10 - fd0;
    fd1 = ld10 - fd0;
    fd1 = ld10 + fd0;

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
      fb0 = ao1.m2();
}
    Output.points[2][1] -= ad1;
    Thought lo0 = Thought386.getInstance(fb1, fb0, fb1, fb0);
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought154.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    ad2 = ad3 - ad4;
    Output.points[2][2] += fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3);
}
    fb1 = fb0 && fb1;
    Output.points[2][3] -= ad4;
    fb0 = fb1 && fb0;
    boolean lb2 = false;
    fd0 *= -1;
    Thought lo3 = Thought120.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    Output.points[2][4] -= ad1;
    double ld4 = 756.4665116572087;
    boolean lb5 = false;
    boolean lb6 = false;
    Output.points[2][5] -= ad1;
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
      ao2.m3(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought0.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    Thought lo1 = Thought27.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
    boolean lb2 = true;
        ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb2, lb3, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    lb2 = fd0 > fd1;
        lb3 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    if (ab1) {
        fd0 = fd1 + fd0;
if(ao3 != null){
          ab2 = ao3.m2(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          lb2 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb3, ab1, ab2, ab3);
}
if(ao3 != null){
          fd1 = ao3.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb3, ab1, ab2, ab3);
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
    Output.points[2][6] += ad1;
    Thought lo0 = Thought18.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    ab2 = fd1 < ad1;
    ad2 = ad3 + ad4;
    boolean lb1 = true;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
if(ao2 != null){
          ao1 = ao2.m4();
}
        ab1 = ab2 || ab3;
        Output.points[2][7] -= fd0;
        fd1 *= -1;
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
    Thought lo0 = Thought150.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    Output.points[2][8] -= fd0;
    double ld2 = 196.60740635153385;
    Output.points[3][0] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, fb0, fb1, lb1, fb0);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(ld2, fd0, fd1, ld2, fb0, fb1, lb1, lb3);
}
    Thought lo4 = Thought155.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb3);
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb1 = lb1 && lb3;
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}
        Thought lo5 = Thought376.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
        lb1 = !lb3;
if(fo1 != null){
          fo1.m3();
}
        Output.points[3][1] += ld2;
        boolean lb6 = false;
        } else {
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb1, lb3);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, fb0, fb1, lb1, lb3);
}
if(fo1 != null){
          fb0 = fo1.m2(ld2, fd0, fd1, ld2, fb1, lb1, lb3, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb3, fb0);
}
        fb1 = lb1 || lb3;
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
    ab2 = !ab3;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    ab4 = fd1 > fd0;
    fd1 *= -1;
    fb0 = fb1 && ab1;
    double ld0 = 192.25271482083195;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;

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
      fo0 = fo1.m4();
}
    Output.points[3][2] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought232.getInstance(fo1, fo0, fo1, fo0);
    double ld1 = 368.9652711484926;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
    fb1 = !ab1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    Output.points[3][3] += ld1;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb2, lb3);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ld1, ad1, ab1, ab2, ab3, ab4);
}
    boolean lb4 = true;
    ad2 = ad3 + ad4;
    ab4 = fb0 && fb1;
    boolean lb5 = true;
        lb2 = fd0 < fd1;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, lb3, lb4, lb5, ab1);
}
    if (ab2) {
        ad1 = ad2 - ad3;
        boolean lb6 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb7 = true;
        ab1 = ad4 > fd0;
        boolean lb8 = true;
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
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m1();
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought96.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    boolean lb1 = false;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    boolean lb2 = true;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
}
    fd0 = fd1 - fd0;
    lb2 = fd1 > fd0;
    fd1 = fd0 - fd1;
    double ld3 = 385.11699859651907;
    ld3 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb1, lb2, fb0);
}
    fd0 = fd1 + ld3;
    boolean lb4 = true;
    fb0 = !fb1;
        boolean lb5 = true;
    lb1 = lb2 || lb4;
    fd0 = fd1 + ld3;
    boolean lb6 = true;

Thought.STACK_COUNTER++;
return lb5;
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[3][4] += ad2;
    Thought lo0 = Thought183.getInstance(ad3, ad4, fd0, fd1);
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo1 = Thought180.getInstance(fb1, fb0, fb1, fb0);
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
    fb1 = fb0 && fb1;
    fd1 = ad1 + ad2;
    fb0 = ad3 > ad4;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad4 = fd0 + fd1;
if(ao3 != null){
      fb1 = ao3.m2(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    boolean lb2 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3();
}
    ab2 = !ab3;
    boolean lb0 = true;
if(ao2 != null){
      fd1 = ao2.m3(ab3, ab4, fb0, fb1);
}
    lb0 = fd0 > fd1;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought194.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, lb1, ab1);
    ab2 = ab3 && ab4;
    fd0 = fd1 + fd0;
    Output.points[3][5] += fd1;

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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ab2 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    if (ab3) {
        ad3 *= -1;
        boolean lb0 = false;
        ab3 = ad4 < fd0;
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          fd1 = ao2.m3(ab4, fb0, fb1, lb0);
}
        Output.points[3][6] -= ad1;
        ad2 *= -1;
        ab1 = ab2 || ab3;
        Thought lo1 = Thought24.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
        ad1 *= -1;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 99.03202448549888;
    fd0 = fd1 - ld0;
        fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = ld0 > fd0;
    Thought lo1 = Thought366.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Output.points[3][7] -= fd1;
    ld0 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ld0;
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
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
    ab4 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    Thought lo0 = Thought311.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    double ld1 = 518.2922778788202;
    boolean lb2 = false;
        ld1 = fd0 + fd1;
    boolean lb3 = false;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo4 = Thought38.getInstance(fo1, fo0, fo1, fo0);
    boolean lb5 = true;
    double ld6 = 31.79053898931849;
    ld6 *= -1;
    ab4 = fb0 || fb1;
    Output.points[3][8] += fd0;

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
    ad1 *= -1;
    lb0 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
    Output.points[4][0] += fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
        boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(lb0, lb1, fb0, fb1);
}
    lb0 = lb1 && fb0;
    boolean lb2 = false;
    double ld3 = 825.6184217112561;
    fb0 = ld3 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, lb1, lb2);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(ld3, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    ad4 *= -1;
    fd0 = fd1 + ld3;

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
    ab1 = !ab2;
    ab3 = ad1 < ad2;
    Thought lo0 = Thought367.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 639.1688061861207;
    ab2 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld1);
}
    ad1 = ad2 + ad3;
    ab3 = ab4 || fb0;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
    boolean lb3 = true;
    ab4 = fb0 && fb1;
    boolean lb4 = true;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    lb2 = !lb3;
    Thought lo5 = Thought245.getInstance();

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 > fd1;
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        fd1 = fd0 - fd1;
        boolean lb1 = true;
        Output.points[4][1] -= fd0;
        fb0 = fd1 > fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
        fd1 *= -1;
        fd0 *= -1;
        Output.points[4][2] += fd1;
        fb1 = fd0 < fd1;
        boolean lb2 = true;
        boolean lb3 = true;
        lb0 = !lb1;
        lb2 = fd0 < fd1;
        lb3 = fb0 || fb1;
        Output.points[4][3] += fd0;
        boolean lb4 = true;
        fd1 *= -1;
        boolean lb5 = false;
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
    Output.points[4][4] += ad2;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd1 *= -1;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad1 *= -1;
    fb0 = ad2 > ad3;
    Thought lo1 = Thought241.getInstance(ad4, fd0, fd1, ad1);
    fb1 = !lb0;
    for(int i0=0; i0<10; i0++){
        fb0 = ad2 < ad3;
if(ao1 != null){
          ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    ab1 = ab2 && ab3;
if(ao4 != null){
      ao4.m2(ab4, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
        double ld2 = 782.2508001945142;
if(ao1 != null){
      ld2 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0);
}
    fb1 = fd1 < ld2;
    Thought lo3 = Thought229.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(lb0, lb1, ab1, ab2);
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld2, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(ld2, fd0, fd1, ld2);
}
    boolean lb4 = false;
    fd0 = fd1 + ld2;

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
    Output.points[4][5] += ad1;
    Thought lo0 = Thought220.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    fd1 = ad1 + ad2;
    ab1 = ad3 < ad4;
    Thought lo1 = Thought250.getInstance();
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ad1;
    fb1 = ad2 > ad3;
    ad4 *= -1;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    boolean lb2 = false;
    fd1 = ad1 - ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld3 = 498.082605307305;
    ab2 = ad2 > ad3;

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
    fb1 = fd1 > fd0;
    double ld0 = 409.42805511741403;
    fd0 = fd1 + ld0;
        fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought97.getInstance(fo0, fo1, fo0, fo1);
    boolean lb3 = true;
    lb3 = fb0 || fb1;
    lb1 = !lb3;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb1, lb3);
}
    fb0 = fd0 > fd1;
    fb1 = ld0 < fd0;

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
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 && ab1;
    ab2 = fd0 > fd1;
    Thought lo2 = Thought215.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    fd0 *= -1;
    boolean lb3 = true;
    Thought lo4 = Thought242.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    lb0 = fd0 > fd1;
    double ld5 = 236.28363213690542;
    ld5 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        lb1 = !lb3;
        }
    boolean lb6 = true;
if(fo1 != null){
      ld5 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld5, fd0);
}
    lb6 = ab1 && ab2;
    ab3 = !ab4;

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
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought26.getInstance(fb0, fb1, fb0, fb1);
    ad1 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought177.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb2 = !fb0;
    fb1 = lb2 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
    Output.points[4][6] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
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
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    ab1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought129.getInstance(ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
    Output.points[4][7] -= fd1;
    ab3 = ab4 || fb0;
    ad1 *= -1;
    boolean lb2 = true;
    fb0 = fb1 && lb0;

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
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        fd1 *= -1;
        Thought lo1 = Thought209.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
        double ld2 = 433.90814172785167;
if(ao2 != null){
          ld2 = ao2.m3(lb0, fb0, fb1, lb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    ad3 = ad4 + fd0;
    Output.points[4][8] += fd1;
    Thought lo1 = Thought177.getInstance(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    lb2 = ad1 > ad2;
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    Thought lo3 = Thought129.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
    ad3 *= -1;
    double ld4 = 168.60242487420365;
    ad3 = ad4 - fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      ld4 = ao2.m3(fb0, fb1, lb0, lb2);
}
    ad1 = ad2 + ad3;
        fb0 = !fb1;
    boolean lb5 = true;
    Output.points[5][0] += ad4;
    Thought lo6 = Thought44.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld4, ad1, lb0, lb2, lb5, fb0);
    fb1 = ad2 < ad3;
    lb0 = !lb2;

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
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    Thought lo0 = Thought166.getInstance(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
    ab4 = fd0 > fd1;
    Output.points[5][1] += fd0;
    fb0 = fb1 && ab1;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ab2 = ab3 && ab4;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
    Thought lo1 = Thought311.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    ab1 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
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
    Thought lo0 = Thought86.getInstance();
    Output.points[5][2] -= ad2;
    ab2 = !ab3;
    ab4 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
    double ld1 = 413.3407395456905;
    ad4 = fd0 - fd1;
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao2.m3(ad4, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab1 = !ab2;
if(ao1 != null){
      ab3 = ao1.m2(ad2, ad3, ad4, fd0);
}
    ab4 = !fb0;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    double ld1 = 558.2079996220533;
    Thought lo2 = Thought251.getInstance(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
    fd1 *= -1;
    lb0 = fb0 && fb1;
    ld1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought170.getInstance(fo0, fo1, fo0, fo1);
    Output.points[5][3] += fd1;
if(fo0 != null){
      fo0.m3(ld1, fd0, fd1, ld1);
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    Output.points[5][4] -= ld1;
    Thought lo4 = Thought345.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb5);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[5][5] -= fd0;

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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3();
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 805.5868860614942;
    boolean lb1 = true;
    Thought lo2 = Thought95.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
    fb1 = lb1 && fb0;
    fb1 = fd0 < fd1;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, lb3, fb0, fb1);
}
    lb1 = ld0 < fd0;
    lb3 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    lb1 = fd0 > fd1;
    lb3 = fb0 && fb1;
    ld0 = fd0 + fd1;
    Output.points[5][6] -= ld0;
    double ld4 = 129.12159250894382;
    lb1 = lb3 && fb0;
    Thought lo5 = Thought297.getInstance();

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
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;
    lb0 = fb0 && fb1;
    lb0 = !fb0;
    fb1 = fd0 > fd1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    lb1 = !fb0;
    fb1 = !lb0;
    lb1 = fb0 || fb1;
    lb0 = lb1 || fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
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
