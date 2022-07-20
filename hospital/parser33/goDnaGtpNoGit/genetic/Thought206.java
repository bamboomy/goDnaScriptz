package genetic;
import java.util.ArrayList;
class Thought206 extends Thought{
private static ArrayList<Thought206> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 712.8739356393179;
private double fd1 = 393.71134065531635;
private Thought fo0 = null;
private Thought fo1 = null;
Thought206 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought206 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought206 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought206 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought206 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought206 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought206 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought206 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought206 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought206 instance = new Thought206 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought206 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought206 instance = new Thought206 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought206 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought206 instance = new Thought206 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought206 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought206 instance = new Thought206 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought206 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought206 instance = new Thought206 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought206 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought206 instance = new Thought206 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought206 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought206 instance = new Thought206 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought206 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought206 instance = new Thought206 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought212.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    Thought lo1 = Thought134.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    for(int i0=0; i0<10; i0++){
        Output.points[4][5] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 < fd1;
        boolean lb2 = false;
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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3(fd1, fd0, fd1, fd0);
}
        double ld0 = 536.4560946549497;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
        fd1 = ld0 - fd0;
        ab4 = !fb0;
        fb1 = ab1 && ab2;
        boolean lb1 = true;
        fd1 = ld0 + fd0;
        Thought lo2 = Thought89.getInstance();
        boolean lb3 = false;
        ab1 = fd1 < ld0;
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
    fb1 = fb0 && fb1;
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fd0 = fd1 + ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = ad1 > ad2;
    fb0 = ad3 < ad4;

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
    Thought lo0 = Thought118.getInstance(fo0, fo1, fo0, fo1);
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab2 = ad2 > ad3;
    ab3 = ab4 || fb0;
    fb1 = ad4 < fd0;
    ab1 = !ab2;
if(fo1 != null){
          fo0 = fo1.m4();
}
    Thought lo1 = Thought80.getInstance(ab3, ab4, fb0, fb1);
    double ld2 = 671.6192985085889;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, ab1, ab2, ab3, ab4);
}
    double ld3 = 45.74874619441943;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    double ld4 = 913.6716397884838;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld3, ld4, ad1, ad2);
}
    ab4 = fb0 && fb1;
    boolean lb5 = true;
if(fo1 != null){
      ad3 = fo1.m3();
}
    boolean lb6 = false;

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
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    Thought lo1 = Thought329.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo2 = Thought1.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    lb0 = fd1 < fd0;
    fb0 = fb1 && lb0;
    fb0 = fd1 > fd0;
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb3);
}
    Output.points[4][6] -= fd1;
    fb0 = fd0 < fd1;
    fb1 = !lb0;
    Thought lo4 = Thought17.getInstance(ao1, ao2, ao3, ao4);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 955.9151983871064;
    ld0 = ad1 - ad2;
    double ld1 = 342.13528597933794;
    ad2 = ad3 - ad4;
if(ao1 != null){
      ao1.m1(fd0, fd1, ld0, ld1);
}
    fb1 = ad1 < ad2;
    Thought lo2 = Thought283.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    fb0 = fb1 && fb0;
    boolean lb3 = false;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb4 = true;
    boolean lb5 = true;
    lb3 = !lb4;
if(ao3 != null){
      ao2 = ao3.m4(lb5, fb0, fb1, lb3);
}
    double ld6 = 819.5539958329394;

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
    ab2 = !ab3;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    double ld0 = 47.17815905803058;
    ld0 *= -1;
    ab2 = fd0 > fd1;
if(ao1 != null){
      ao1.m2(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ld0;
    boolean lb1 = false;
    lb1 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    lb1 = !ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
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
      ao2 = ao3.m4();
}
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(lb0, ab1, ab2, ab3);
}
    boolean lb1 = false;
    Thought lo2 = Thought123.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    boolean lb3 = false;
    fd0 = fd1 - ad1;
    boolean lb4 = false;
    ad2 *= -1;
    boolean lb5 = false;
    lb0 = ad3 > ad4;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ad1, ad2, ad3, lb1, lb3, lb4, lb5);
}
    boolean lb6 = false;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, lb6, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    double ld7 = 652.9840287199149;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
    ab4 = fb0 || fb1;
    ld7 = ad1 + ad2;
    lb0 = !lb1;
    double ld8 = 879.8504735946806;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ld7 = ld8 - ad1;

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
    fb0 = fb1 && fb0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    double ld0 = 486.5445474574745;
    fd0 = fd1 - ld0;
    Output.points[4][7] += fd0;
    fb0 = !fb1;
    fd1 = ld0 - fd0;

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
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought218.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    ab3 = fd1 < fd0;
    ab4 = fb0 && fb1;
    fd1 = fd0 + fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[4][8] += fd0;
if(fo0 != null){
      lb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
    ab1 = fd0 > fd1;
    Thought lo2 = Thought358.getInstance();
if(fo1 != null){
          fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
    Output.points[5][0] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    boolean lb3 = true;
    boolean lb4 = true;
    double ld5 = 746.4234492404231;
    Thought lo6 = Thought216.getInstance(fo0, fo1, fo0, fo1);

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
        fb1 = ad2 < ad3;
    fb0 = fb1 && fb0;
    Output.points[5][1] -= ad4;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[5][2] += ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[5][3] -= ad2;
    Thought lo1 = Thought234.getInstance(fb0, fb1, lb0, fb0);

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
    ad1 *= -1;
    ab1 = ad2 > ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    double ld0 = 350.9516867095647;
    boolean lb1 = false;
    fb0 = ad2 < ad3;
    fb1 = ad4 < fd0;
    boolean lb2 = false;
    fd1 *= -1;
if(fo0 != null){
      lb1 = fo0.m2(ld0, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
    lb2 = ab1 || ab2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ab3 = fd0 > fd1;
    double ld3 = 890.0713678378576;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld3, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ab4 = fb0 || fb1;

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
    boolean lb0 = false;
    Thought lo1 = Thought217.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought368.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    lb0 = !fb0;
    fb1 = lb0 && fb0;
    fb1 = fd1 < fd0;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Thought lo3 = Thought118.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Thought lo4 = Thought92.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = !fb0;
    Thought lo5 = Thought185.getInstance(fb1, lb0, fb0, fb1);
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb6 = false;

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
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    if (fb0) {
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fo0.m1(ad4, fd0, fd1, ad1);
}
        double ld1 = 838.5686754073148;
        lb0 = fb0 && fb1;
        Output.points[5][4] -= ad1;
        lb0 = ad2 < ad3;
        Output.points[5][5] -= ad4;
        fb0 = fb1 || lb0;
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld1, ad1, ad2);
}
        boolean lb2 = true;
        ad3 = ad4 + fd0;
        boolean lb3 = false;
        lb3 = lb0 || fb0;
        boolean lb4 = true;
if(fo0 != null){
          fb0 = fo0.m2();
}
        fd1 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(fb1, lb2, lb3, lb4);
}
        ld1 = ad1 - ad2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    Thought lo0 = Thought263.getInstance(ao2, ao3, ao4, fo0);
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;

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
    ab1 = ad1 > ad2;
    boolean lb0 = true;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(lb1, ab1, ab2, ab3);
}
    Output.points[5][6] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      lb1 = fo0.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
    ab1 = ad1 > ad2;
    ab2 = ad3 > ad4;
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m3(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    ab4 = fb0 || fb1;
    Thought lo2 = Thought171.getInstance();

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
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    Output.points[5][7] += fd1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    Output.points[5][8] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    boolean lb2 = true;
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, lb1, lb2, fb0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb1, lb2, fb0);
}
    double ld3 = 741.4670200853977;
    fb1 = fd0 < fd1;
    boolean lb4 = false;
    ld3 *= -1;

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
    fd0 *= -1;
    ab1 = fd1 < fd0;
    Output.points[6][0] += fd1;
    ab2 = fd0 > fd1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
    ab4 = fd1 > fd0;
    Thought lo0 = Thought118.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 > fd0;
    ab3 = ab4 || fb0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
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
    ad1 = ad2 + ad3;
    Thought lo0 = Thought257.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
        ad2 = ad3 - ad4;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
    double ld1 = 136.0588147669164;
    fb1 = !fb0;
    Output.points[6][1] += fd0;
    Output.points[6][2] += fd1;
    fb1 = ld1 > ad1;
    boolean lb2 = true;
    Thought lo3 = Thought327.getInstance(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);

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
    for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ab4 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fb1 = fo1.m2();
}
        Output.points[6][3] -= ad4;
        boolean lb0 = true;
        fd0 *= -1;
        double ld1 = 149.04428770582996;
        lb0 = ab1 || ab2;
        ab3 = ab4 && fb0;
if(fo0 != null){
          fd0 = fo0.m3(fb1, lb0, ab1, ab2);
}
        ab3 = ab4 || fb0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
        ab3 = ad4 > fd0;
        fd1 = ld1 + ad1;
        double ld2 = 755.8927144090953;
        ab4 = fb0 && fb1;
        ad1 = ad2 + ad3;
if(fo0 != null){
          lb0 = fo0.m2(ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
        ld2 = ad1 + ad2;
        double ld3 = 577.6663513662612;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, ld2, ld3);
}
        ab4 = ad1 > ad2;
if(fo1 != null){
          fo0 = fo1.m4();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
    double ld0 = 282.2212649464854;
    ld0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    ld0 = fd0 + fd1;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    lb1 = fb0 && fb1;
    fd0 = fd1 + ld0;
if(ao2 != null){
      lb1 = ao2.m2(fd0, fd1, ld0, fd0);
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
    fb1 = ad1 > ad2;
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo1.m1();
}
if(ao1 != null){
      ad3 = ao1.m3(fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
    fb0 = fb1 || fb0;
    fd0 *= -1;
    fd1 = ad1 + ad2;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fb1 = !fb0;
        ad1 = ad2 - ad3;
        boolean lb0 = false;
if(ao1 != null){
          fb0 = ao1.m2(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
        Output.points[6][4] += ad2;
        ad3 *= -1;
        boolean lb1 = true;
        lb1 = fb0 || fb1;
        ad4 = fd0 + fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ad1 = ad2 - ad3;
        lb0 = lb1 || fb0;
        fb1 = lb0 || lb1;
if(ao2 != null){
          ao2.m3(ad4, fd0, fd1, ad1);
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
    ab1 = fd0 > fd1;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    ab3 = ab4 || fb0;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fb1 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb0 = true;
        fd0 = fd1 - fd0;
    boolean lb1 = false;
    lb0 = lb1 && ab1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || lb1;
    fd1 = fd0 + fd1;
    Thought lo2 = Thought87.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ab1 = fd0 < fd1;
    ab2 = ab3 || ab4;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
        ab1 = ab2 || ab3;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
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
    Thought lo0 = Thought314.getInstance(ad1, ad2, ad3, ad4);
    Thought lo1 = Thought269.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[6][5] -= ad4;
    for(int i0=0; i0<10; i0++){
        double ld2 = 632.4790971995302;
        boolean lb3 = false;
        ab1 = !ab2;
        Thought lo4 = Thought317.getInstance(ab3, ab4, fb0, fb1);
        ad4 = fd0 - fd1;
        lb3 = !ab1;
        ld2 = ad1 - ad2;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = ld2 > ad1;
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
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fd1 *= -1;
    double ld1 = 362.69584045045957;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
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
    fd1 *= -1;
    Output.points[6][6] += fd0;
    Thought lo0 = Thought332.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
        ab4 = fd1 < fd0;
if(fo0 != null){
          fd1 = fo0.m3();
}
        Thought lo3 = Thought179.getInstance(fb0, fb1, lb2, lb1);
        }
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    Thought lo4 = Thought87.getInstance(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
    boolean lb5 = false;
    Output.points[6][7] += fd1;

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
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
    Output.points[6][8] -= ad4;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought94.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
if(fo1 != null){
      ad3 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Output.points[7][0] += ad4;
    Output.points[7][1] += fd0;
    Thought lo1 = Thought240.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);

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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = true;
    fd0 = fd1 + ad1;
    lb2 = ab1 || ab2;
    ad2 = ad3 + ad4;
        double ld3 = 82.36732967169361;
    ad4 *= -1;
    ab3 = ab4 && fb0;
    fd0 = fd1 - ld3;

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
    fb0 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Output.points[7][2] += fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    lb0 = fd0 > fd1;
    boolean lb2 = true;

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
    fb1 = !fb0;
if(ao2 != null){
          ao2.m1();
}
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    double ld1 = 790.4652928385264;
    ad3 = ad4 - fd0;
if(ao3 != null){
      fd1 = ao3.m3(fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ld1, ad1, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][3] += fd0;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb1 = false;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    if (lb0) {
        fd0 = fd1 - fd0;
        Output.points[7][4] -= fd1;
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
    for(int i0=0; i0<10; i0++){
        Output.points[7][5] -= ad1;
        double ld0 = 367.79561604409287;
        boolean lb1 = true;
        ad1 = ad2 - ad3;
if(ao2 != null){
          ad4 = ao2.m3();
}
        fd0 *= -1;
        Output.points[7][6] -= fd1;
        double ld2 = 361.24987994257214;
if(ao3 != null){
          ld0 = ao3.m3(ab1, ab2, ab3, ab4);
}
        Thought lo3 = Thought261.getInstance(ao4, fo0, fo1, ao1, ld2, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
if(ao2 != null){
          ao2.m3(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
        fb1 = lb1 || ab1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
        boolean lb4 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(ld2, ad1, ad2, ad3);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0);
}
        ld2 = ad1 - ad2;
if(ao4 != null){
          ad3 = ao4.m3();
}
        fb0 = !fb1;
        ad4 = fd0 + fd1;
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
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    Output.points[7][7] -= fd1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought395.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    double ld1 = 381.53633824731094;
    fd0 = fd1 - ld1;
        fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    Output.points[7][8] += ld1;
    double ld2 = 388.901041630789;
    fb1 = ld2 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ld2, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld2, fd0, lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb3, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd1 = fo1.m3(ld1, ld2, fd0, fd1);
}
    Output.points[8][0] += ld1;
    ld2 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
}
    ld1 = ld2 - fd0;
    fb1 = lb3 && fb0;
    Thought lo4 = Thought215.getInstance();
    fd1 = ld1 + ld2;
    Thought lo5 = Thought187.getInstance(fb1, lb3, fb0, fb1);
    lb3 = fb0 && fb1;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, fb0, fb1, lb3, fb0);
}
    boolean lb6 = true;

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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    double ld1 = 45.75630135102989;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
    ld1 = fd0 + fd1;
    fb0 = !fb1;
    lb0 = ld1 < fd0;
    fb0 = fd1 > ld1;
        fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    fb0 = fd0 > fd1;

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
