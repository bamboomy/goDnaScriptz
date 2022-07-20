package genetic;
import java.util.ArrayList;
class Thought201 extends Thought{
private static ArrayList<Thought201> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 268.25475422101533;
private double fd1 = 325.67625936560427;
private Thought fo0 = null;
private Thought fo1 = null;
Thought201 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought201 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought201 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought201 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought201 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought201 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought201 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought201 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought201 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought201 instance = new Thought201 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought201 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought201 instance = new Thought201 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought201 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought201 instance = new Thought201 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought201 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought201 instance = new Thought201 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought201 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought201 instance = new Thought201 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought201 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought201 instance = new Thought201 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought201 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought201 instance = new Thought201 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought201 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought201 instance = new Thought201 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 671.7767101722192;
    fb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 < fd1;
    Output.points[7][2] -= ld0;
    fb0 = fd0 < fd1;
    ld0 = fd0 + fd1;
    boolean lb1 = false;
    Thought lo2 = Thought10.getInstance(ld0, fd0, fd1, ld0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    double ld3 = 709.6156144241551;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    if (lb1) {
        fb0 = fb1 || lb1;
        fb0 = ld0 > ld3;
        fb1 = fd0 < fd1;
        boolean lb4 = true;
        ld0 *= -1;
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
    fd1 = fd0 + fd1;
    double ld0 = 919.2131398521659;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    if (ab1) {
        double ld1 = 775.4420724208646;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ld1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
        boolean lb2 = false;
if(fo0 != null){
          ld1 = fo0.m3(ld0, fd0, fd1, ld1, fb0, fb1, lb2, ab1);
}
        double ld3 = 914.7642529547383;
        ld3 = ld0 - fd0;
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        lb2 = fd1 > ld1;
        boolean lb4 = true;
if(fo0 != null){
          lb4 = fo0.m2(ld3, ld0, fd0, fd1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb0 = !fb1;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
        ad3 = ad4 - fd0;
    boolean lb1 = true;
    Output.points[7][3] -= fd1;
    lb0 = !lb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
    ad1 = ad2 - ad3;
    Output.points[7][4] += ad4;

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
    if (ab2) {
        ad1 = ad2 - ad3;
        boolean lb0 = false;
        } else {
        ad4 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ab3 = ad1 > ad2;
        ad3 *= -1;
        ab4 = ad4 < fd0;
        double ld1 = 135.778430848789;
        fb0 = fd0 > fd1;
        ld1 = ad1 - ad2;
        boolean lb2 = false;
        ad3 *= -1;
        boolean lb3 = false;
if(fo1 != null){
          ab4 = fo1.m2(ad4, fd0, fd1, ld1);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought150.getInstance();
    fb0 = fb1 || fb0;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    double ld2 = 358.2506924294553;
    boolean lb3 = false;
    ld2 = fd0 - fd1;
    double ld4 = 165.06972769821581;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld2, ld4, fd0, fd1, lb1, lb3, fb0, fb1);
}
    double ld5 = 241.51757687795953;
    boolean lb6 = true;
if(ao2 != null){
      lb1 = ao2.m2(ld2, ld4, ld5, fd0, lb3, lb6, fb0, fb1);
}
    lb1 = fd1 > ld2;
    boolean lb7 = false;
    ld4 = ld5 + fd0;
    fd1 *= -1;
if(ao3 != null){
      lb3 = ao3.m2(ao4, fo0, fo1, ao1, lb6, lb7, fb0, fb1);
}
    lb1 = lb3 || lb6;
    Output.points[7][5] -= ld2;

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
    Thought lo0 = Thought277.getInstance(ao2, ao3, ao4, fo0);
    boolean lb1 = true;
    boolean lb2 = true;
    double ld3 = 736.914740057275;
    lb2 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld3, ad1, ad2);
}
    fb0 = !fb1;
    lb1 = lb2 || fb0;
    fb1 = lb1 && lb2;
    double ld4 = 415.2502502125753;
    fb0 = fb1 && lb1;
    ad2 = ad3 - ad4;
        boolean lb5 = false;
    Thought lo6 = Thought203.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld3, ld4);
if(ao1 != null){
      fo1 = ao1.m4();
}
    lb2 = !lb5;
    if (fb0) {
        boolean lb7 = true;
if(ao2 != null){
          ad1 = ao2.m3(fb0, fb1, lb7, lb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, lb2, lb5, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought212.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    Thought lo1 = Thought24.getInstance(fd1, fd0, fd1, fd0);
    ab1 = fd1 < fd0;
    ab2 = ab3 || ab4;
    double ld2 = 639.1310620086938;
    fb0 = fb1 || ab1;
    boolean lb3 = false;
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld2, fd0);
}
    ab1 = ab2 || ab3;
    fd1 = ld2 - fd0;
    ab4 = fd1 > ld2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb4 = false;
    boolean lb5 = false;
if(ao1 != null){
      ab3 = ao1.m2(ab4, fb0, fb1, lb3);
}
    lb4 = fd0 > fd1;
if(ao2 != null){
      ld2 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0, lb5, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld2, fd0, fd1, lb3, lb4, lb5, ab1);
}
    ld2 = fd0 - fd1;

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
    ab1 = ab2 && ab3;
    boolean lb0 = false;
    ab3 = ad1 < ad2;
    ab4 = ad3 < ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fd0 *= -1;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;

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
    fb0 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 750.5269914868551;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    ld0 *= -1;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[7][6] -= fd1;
    Output.points[7][7] += ld0;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld0;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0);
}
    Output.points[7][8] += fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m2();
}
    lb2 = fb0 && fb1;
    fd0 = fd1 - ld0;
    boolean lb3 = false;

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
    fd1 = fd0 - fd1;
    Output.points[8][0] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    boolean lb0 = true;
    ab4 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 && ab4;
    double ld1 = 577.9846545758426;
    boolean lb2 = true;
    fd0 = fd1 + ld1;
    fd0 = fd1 + ld1;
    Thought lo3 = Thought176.getInstance(fd0, fd1, ld1, fd0);
    fd1 = ld1 + fd0;
    double ld4 = 284.5484481861804;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld4);
}
    fd0 = fd1 + ld1;
    Thought lo5 = Thought359.getInstance();
    fb0 = ld4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb2, ab1);
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
    fb0 = !fb1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    fb0 = !fb1;
    double ld0 = 409.37651209827527;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
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
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    Output.points[8][1] -= ad4;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3();
}
    Thought lo1 = Thought101.getInstance(lb0, ab1, ab2, ab3);
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    double ld2 = 446.73294078287455;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    Thought lo3 = Thought273.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2();
}
        ad4 = fd0 + fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    double ld0 = 443.89763667699737;
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd1 = ld0 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb0 = ao2.m2(fd1, ld0, fd0, fd1);
}
    fb1 = !fb0;
    double ld1 = 687.3835678976975;
    fb1 = ld0 > ld1;
    double ld2 = 637.5910297953515;
    Thought lo3 = Thought81.getInstance(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld0);
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[8][2] -= ld1;
if(ao3 != null){
      ao3.m2(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(ld1, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[8][3] += ad1;
    boolean lb0 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && lb0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb1 = false;
    fb0 = fb1 || lb0;
if(ao1 != null){
      ao1.m2();
}
    Output.points[8][4] += ad4;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m2(lb1, fb0, fb1, lb0);
}
        }
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m3(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
    for(int i1=0; i1<10; i1++){
        ad1 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1);
}
        double ld2 = 402.6197057234364;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    if (lb0) {
if(ao2 != null){
          ab1 = ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
        boolean lb1 = true;
if(ao3 != null){
          fd0 = ao3.m3();
}
if(fo0 != null){
          ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb0);
}
        ab1 = ab2 && ab3;
        fd1 = fd0 - fd1;
        ab4 = fb0 || fb1;
        lb1 = lb0 && ab1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = fd0 - fd1;
        boolean lb2 = false;
        fb0 = fd0 < fd1;
        Thought lo3 = Thought231.getInstance(ao1, ao2, ao3, ao4, fb1, lb1, lb2, lb0);
        Output.points[8][5] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
if(ao1 != null){
          ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fd0 = fo1.m3();
}
if(ao1 != null){
          fd1 = ao1.m3(ab2, ab3, ab4, fb0);
}
        fb1 = lb1 && lb2;
        Thought lo4 = Thought295.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
        double ld5 = 150.7378617428892;
        ld5 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    double ld0 = 691.0349784078489;
    ad1 = ad2 + ad3;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(ld0, ad1, ad2, ad3);
}
    fb0 = ad4 < fd0;
    boolean lb1 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, ad1, ad2);
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
double m3() throws CountDownExc {
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
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought106.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb3 = true;
    Thought lo4 = Thought352.getInstance();
if(fo0 != null){
      fd0 = fo0.m3(lb0, lb2, lb3, fb0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb2, lb3);
}
    Output.points[8][6] += fd1;
    fb0 = fd0 < fd1;
    fb1 = !lb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb2, lb3, fb0, fb1);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;

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
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    double ld0 = 870.1263007351077;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = ab1 || ab2;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = ab1 || ab2;
    boolean lb2 = true;
    ld0 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = lb1 && lb2;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
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
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    double ld0 = 127.72003358104556;
    double ld1 = 461.7536853477401;
    for(int i0=0; i0<10; i0++){
        double ld2 = 992.3158402017167;
        ad3 = ad4 + fd0;
        double ld3 = 374.920553877951;
        boolean lb4 = false;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld3);
}
        lb4 = fb0 || fb1;
if(fo0 != null){
          lb4 = fo0.m2();
}
        fb0 = fb1 || lb4;
        boolean lb5 = true;
if(fo0 != null){
          fo1 = fo0.m4(lb5, fb0, fb1, lb4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, ad1, ad2, lb5, fb0, fb1, lb4);
}
        double ld6 = 234.4417443096942;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb5, fb0, fb1, lb4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m2(fd1, ld2, ld3, ld6);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2);
}
        lb5 = fb0 || fb1;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    Thought lo0 = Thought262.getInstance();
    Output.points[8][7] -= ad2;
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
}
    double ld1 = 597.5792059310502;
    fb0 = fb1 || ab1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = ld1 + ad1;
    Thought lo2 = Thought166.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    ab2 = ab3 || ab4;
    fb0 = fd1 > ld1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fb0 = !fb1;
    double ld1 = 176.1072581778861;
    Output.points[8][8] += ld1;
    lb0 = fd0 > fd1;
    boolean lb2 = true;
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
    ld1 = fd0 - fd1;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb2 = !fb0;
    fd1 = ld1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1, fb1, lb0, lb2, fb0);
}
    fb1 = lb0 || lb2;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb2);
}
    Thought lo3 = Thought197.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
    double ld4 = 767.9056476342059;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ld4, fd0, fd1, ld1);
}
    ld4 = fd0 - fd1;
    ld1 = ld4 - fd0;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ad4 = fd0 - fd1;
    Thought lo0 = Thought332.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ad3 = ad4 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    Output.points[0][0] += fd1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    ad1 *= -1;

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
    fd0 = fd1 + fd0;
    ab1 = ab2 || ab3;
    ab4 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
    ab3 = !ab4;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = !ab1;
if(ao3 != null){
      fd1 = ao3.m3(ab2, ab3, ab4, fb0);
}
        boolean lb0 = false;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    Output.points[0][1] -= fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    ab2 = ab3 || ab4;

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
    Thought lo0 = Thought72.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought85.getInstance(fo1, ao1, ao2, ao3);
    fd1 *= -1;
if(ao4 != null){
      ao4.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    ab3 = ab4 && fb0;
    Output.points[0][2] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4();
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
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    Thought lo2 = Thought283.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    Thought lo3 = Thought159.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
    Thought lo4 = Thought286.getInstance(fo0, fo1, fo0, fo1);
    Thought lo5 = Thought170.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb6 = false;
    double ld7 = 359.69857353572064;
    Output.points[0][3] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      ld7 = fo1.m3();
}
    Thought lo8 = Thought309.getInstance(fb0, fb1, lb0, lb1);

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
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
        if (lb0) {
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        ab1 = ab2 && ab3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4();
}
        for(int i0=0; i0<10; i0++){
            ab3 = ab4 || fb0;
            for(int i1=0; i1<10; i1++){
                double ld2 = 336.17793891147227;
                fb1 = lb1 || lb0;
                }
            Output.points[0][4] += fd0;
            ab1 = ab2 && ab3;
            fd1 *= -1;
            Thought lo3 = Thought360.getInstance(ab4, fb0, fb1, lb1);
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
    Thought lo0 = Thought64.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
        fb0 = ad1 > ad2;
    Thought lo1 = Thought373.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
    fb1 = ad3 < ad4;
    Output.points[0][5] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
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
    ab2 = !ab3;
if(fo0 != null){
      ab4 = fo0.m2();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, ab1, ab2, ab3);
}
    double ld0 = 932.5416189074398;
    Thought lo1 = Thought121.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    double ld2 = 725.4335702252869;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld2 = fo1.m3(ad1, ad2, ad3, ad4);
}
    ab4 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld2, ad1, ad2);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3();
}
    ab1 = ad3 < ad4;
    fd0 *= -1;
    fd1 = ld0 - ld2;
    Output.points[0][6] += ad1;
    boolean lb3 = false;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
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
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    Thought lo1 = Thought89.getInstance(fd0, fd1, fd0, fd1);
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      fd0 = ao3.m3(lb2, fb0, fb1, lb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
if(ao3 != null){
      lb2 = ao3.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    fb0 = fb1 && lb0;
    Thought lo3 = Thought112.getInstance(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb0);
        Thought lo4 = Thought101.getInstance(ao2, ao3, ao4, fo0);
    lb2 = !fb0;
    if (fb1) {
        double ld5 = 857.7816525105603;
        lb0 = ld5 > fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
    fb0 = fb1 && fb0;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
    Thought lo0 = Thought210.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 && fb1;

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
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought128.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld2 = 730.95996778422;
if(fo0 != null){
      ao4 = fo0.m4(lb0, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb3 = true;
    fd1 *= -1;
    double ld4 = 720.0672732229698;
    ld2 *= -1;
        lb3 = !ab1;
if(ao1 != null){
      fo1 = ao1.m4(ld4, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ld4 = ao2.m3(ao3, ao4, fo0, fo1, fb1, lb0, lb3, ab1);
}
    boolean lb5 = false;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + ld2;
    ab1 = ab2 || ab3;

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
if(ao1 != null){
      ab1 = ao1.m2(ad2, ad3, ad4, fd0);
}
    ab2 = fd1 < ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
          ab3 = ao2.m2();
}
    Thought lo0 = Thought256.getInstance(ab4, fb0, fb1, ab1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    Output.points[0][7] -= ad4;
    ab3 = ab4 && fb0;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought184.getInstance(ao3, ao4, fo0, fo1);
    ab2 = ab3 || ab4;

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
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    Output.points[0][8] -= fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 724.5130641376857;
    Output.points[1][0] += ld0;
    Output.points[1][1] -= fd0;
    double ld1 = 886.5963040662978;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    ld1 = fd0 + fd1;
    fb0 = !fb1;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, fd0, fd1, lb2, fb0, fb1, lb2);
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
    double ld0 = 798.1228601658601;
    Thought lo1 = Thought281.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    fb1 = fd1 < ld0;
    Output.points[1][2] += fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2();
}
    fd1 *= -1;
    Thought lo2 = Thought338.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought97.getInstance(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb4 = false;
    fb0 = fd1 < ld0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    lb4 = fd1 > ld0;
    fb0 = fb1 || lb4;

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
    boolean lb0 = false;
    fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    Output.points[1][3] -= fd1;
    Output.points[1][4] -= fd0;
    boolean lb2 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
    double ld3 = 559.8287289145138;
    lb1 = ld3 < fd0;
    lb2 = fd1 < ld3;
    fb0 = !fb1;
    lb0 = lb1 || lb2;
    fb0 = fb1 || lb0;
    boolean lb4 = false;
    double ld5 = 871.1867414430419;
    boolean lb6 = false;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ld5 = fd0 - fd1;

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
