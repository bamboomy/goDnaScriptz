package genetic;
import java.util.ArrayList;
class Thought396 extends Thought{
private static ArrayList<Thought396> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 480.7202517693556;
private double fd1 = 339.86453201902395;
private Thought fo0 = null;
private Thought fo1 = null;
Thought396 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought396 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought396 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought396 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought396 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought396 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought396 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought396 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought396 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought396 instance = new Thought396 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought396 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought396 instance = new Thought396 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought396 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought396 instance = new Thought396 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought396 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought396 instance = new Thought396 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought396 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought396 instance = new Thought396 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought396 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought396 instance = new Thought396 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought396 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought396 instance = new Thought396 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought396 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought396 instance = new Thought396 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    Thought lo2 = Thought312.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = lb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought385.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo1 != null){
          fo0 = fo1.m4();
}
    fd1 = fd0 - fd1;
    fb1 = lb0 && lb1;
    fb0 = fb1 || lb0;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    Thought lo0 = Thought269.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
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
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    fb1 = ad1 < ad2;
    ad3 = ad4 + fd0;
    fb0 = fb1 || fb0;
    double ld0 = 298.94300690953764;
    boolean lb1 = true;
    Output.points[1][4] -= fd0;
    fd1 = ld0 - ad1;
    double ld2 = 46.03351620693721;
    boolean lb3 = false;
    ad1 = ad2 - ad3;
if(fo1 != null){
      lb3 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, lb3);
}
    fb0 = ad4 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ld2, ad1, ad2, fb1, lb1, lb3, fb0);
}
    boolean lb4 = true;
    double ld5 = 987.3335442632306;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb1);
}
    lb3 = fd1 > ld0;
    lb4 = !fb0;
    ld2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ld5, ad1, ad2, ad3);
}
    if (fb1) {
        lb1 = ad4 < fd0;
        lb3 = lb4 && fb0;
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
    ab1 = ab2 || ab3;
    ab4 = ad1 < ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    Thought lo0 = Thought242.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought62.getInstance(fo1, fo0, fo1, fo0);
    fd1 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    ab3 = ab4 || fb0;

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
    double ld0 = 455.10509453213047;
    fb1 = fb0 && fb1;
    fd0 = fd1 + ld0;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
    fb0 = ld0 > fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo1 = Thought50.getInstance(fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought209.getInstance(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
        boolean lb3 = true;
    fd0 = fd1 - ld0;
    boolean lb4 = true;
    boolean lb5 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb4, lb5, fb0, fb1);
}
    lb3 = lb4 && lb5;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
    fb1 = fb0 || fb1;
if(ao2 != null){
      fb0 = ao2.m2(ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
    fb0 = fd1 < ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    if (fb1) {
        boolean lb0 = false;
        boolean lb1 = true;
if(ao2 != null){
          ao2.m1();
}
if(ao4 != null){
          ao3 = ao4.m4(lb0, lb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, lb0, lb1, fb0, fb1);
}
        lb0 = ad2 > ad3;
if(fo0 != null){
          ao4 = fo0.m4(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
}
        lb1 = ad2 > ad3;
        fb0 = !fb1;
        lb0 = ad4 > fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb0);
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
    boolean lb0 = false;
    ab1 = fd1 > fd0;
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab4 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
        if (fb1) {
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
        lb0 = fd1 > fd0;
        Output.points[1][5] -= fd1;
        ab1 = fd0 < fd1;
if(fo0 != null){
          fd0 = fo0.m3(ab2, ab3, ab4, fb0);
}
        Output.points[1][6] -= fd1;
        boolean lb1 = true;
        boolean lb2 = false;
        fd0 *= -1;
        fd1 *= -1;
        double ld3 = 365.2491860958862;
        ab4 = ld3 > fd0;
        double ld4 = 200.16193742680653;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld3, ld4, fb0, fb1, lb1, lb2);
}
        lb0 = !ab1;
if(fo1 != null){
          fo1.m1(fd0, fd1, ld3, ld4, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb1, lb2, lb0);
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
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    boolean lb0 = true;
    ad3 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m2(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
        Thought lo1 = Thought284.getInstance();
        ab1 = fd1 > ad1;
        ab2 = ab3 || ab4;
        fb0 = fb1 || lb0;
        boolean lb2 = false;
        Output.points[1][7] -= ad2;
        double ld3 = 78.68646252729073;
        lb0 = !ab1;
        ab2 = ad2 > ad3;
        Thought lo4 = Thought391.getInstance(ab3, ab4, fb0, fb1);
        lb2 = ad4 > fd0;
        Thought lo5 = Thought239.getInstance(ao2, ao3, ao4, fo0, fd1, ld3, ad1, ad2, lb0, ab1, ab2, ab3);
if(ao1 != null){
          fo1 = ao1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb2);
}
        boolean lb6 = false;
        double ld7 = 103.42200526117557;
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
    fb1 = fb0 && fb1;
    if (fb0) {
        fb1 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 + fd0;
        } else {
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        boolean lb0 = true;
        Output.points[1][8] -= fd0;
if(fo1 != null){
          fo1.m3();
}
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
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
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    double ld0 = 974.8548114153892;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    fd1 = ld0 - fd0;
    if (ab1) {
        Thought lo2 = Thought31.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
        ld0 = fd0 + fd1;
        boolean lb3 = false;
        ab1 = ab2 && ab3;
        ab4 = fb0 && fb1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
        lb3 = lb1 && ab1;
        double ld4 = 123.2124742691305;
        ab2 = !ab3;
        ld0 *= -1;
        double ld5 = 820.5741468466978;
        Output.points[2][0] -= ld0;
if(fo0 != null){
          ab4 = fo0.m2();
}
        double ld6 = 837.8628836736547;
        fb0 = !fb1;
        double ld7 = 892.6680742712184;
        lb3 = !lb1;
        ld7 = ld0 + fd0;
        Output.points[2][1] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(ab1, ab2, ab3, ab4);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = !lb1;
    fb0 = !fb1;
    lb0 = lb1 && fb0;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld2 = 70.54891080478954;
    fb1 = !lb0;
        fd0 *= -1;
    lb1 = fd1 < ld2;
    Thought lo3 = Thought35.getInstance(ad1, ad2, ad3, ad4);
    Output.points[2][2] -= fd0;
    fb0 = fb1 || lb0;

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
    ad1 = ad2 + ad3;
    Output.points[2][3] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ab3 = ad4 < fd0;
    Output.points[2][4] -= fd1;
    ab4 = fb0 && fb1;
    Output.points[2][5] -= ad1;
    ad2 = ad3 - ad4;
    Thought lo0 = Thought279.getInstance(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
    Output.points[2][6] += ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
    ab2 = ad4 < fd0;
    ab3 = fd1 > ad1;
    boolean lb2 = false;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought148.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb4 = false;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fb0 = fo0.m2();
}
    double ld5 = 901.6773139945669;
    ad4 = fd0 - fd1;

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
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    double ld0 = 401.47975908294336;
    boolean lb1 = true;
    lb1 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fb1 = ao4.m2(ld0, fd0, fd1, ld0);
}
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2();
}
    lb1 = !lb2;
    fd1 *= -1;
    double ld3 = 161.89468174080085;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb1, lb2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ld3, fd0, fd1, fb0, fb1, lb1, lb2);
}
    Thought lo4 = Thought253.getInstance(ld0, ld3, fd0, fd1, fb0, fb1, lb1, lb2);
    ld0 = ld3 + fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb1, lb2, fb0);
}
    boolean lb5 = false;
    Thought lo6 = Thought358.getInstance(ao1, ao2, ao3, ao4);
    fb0 = !fb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    Output.points[2][7] += fd0;
    fd1 = ad1 - ad2;
    double ld0 = 681.7687735242263;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 - ad1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad2 *= -1;
    fb1 = ad3 > ad4;
    fd0 = fd1 + ld0;
    fb0 = fb1 || fb0;
    double ld1 = 241.72401274266437;

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
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    fd1 *= -1;
    ab2 = fd0 > fd1;
    boolean lb0 = false;
    Thought lo1 = Thought327.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Output.points[2][8] += fd0;
    ab4 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb2 = false;
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1);
}
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(lb3, ab1, ab2, ab3);
}
    double ld4 = 229.71033351799048;
    ab4 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld4, fd0, fd1, ld4, fb0, fb1, lb0, lb2);
}
    lb3 = !ab1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, lb2, lb3);
}
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld4, fd0, fd1, ld4);
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
    ab2 = ad2 > ad3;
    Thought lo0 = Thought93.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
    ad2 *= -1;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      ad3 = fo1.m3(ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
          ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
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
    fb0 = !fb1;
    boolean lb0 = true;
    fd0 *= -1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = fd0 > fd1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb1, fb0);
}
    Thought lo2 = Thought41.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
    fd0 = fd1 - fd0;
    double ld3 = 679.2179094725036;
    fb1 = !lb0;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(ld3, fd0, fd1, ld3, fb0, fb1, lb0, lb1);
}
    fb0 = fd0 > fd1;
    Thought lo4 = Thought238.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fb1 = !lb0;
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld3, fd0);
}
    Thought lo6 = Thought315.getInstance(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1);
    Thought lo7 = Thought372.getInstance();

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 && ab2;
    fd0 = fd1 - fd0;
    double ld0 = 576.6093211511823;
    boolean lb1 = false;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, fd0);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      ld0 = fo1.m3(fb1, lb1, ab1, ab2);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
    boolean lb2 = false;
    Thought lo3 = Thought332.getInstance(fd1, ld0, fd0, fd1, lb2, ab1, ab2, ab3);

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    ad4 *= -1;
if(fo1 != null){
      fo1.m1();
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
    Output.points[3][0] += ad2;
    ad3 = ad4 + fd0;
    ab2 = !ab3;
    ab4 = fd1 > ad1;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo0.m2(fb1, ab1, ab2, ab3);
}
    ab4 = ad4 > fd0;
    fb0 = fd1 > ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought351.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
    ab2 = fd0 > fd1;
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 || lb0;
    fd0 = fd1 + fd0;
    Output.points[3][1] += fd1;
    fd0 *= -1;
    boolean lb1 = true;
    lb1 = !fb0;
    double ld2 = 670.3996195100525;
    double ld3 = 773.1066970101631;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld3, fd0, fd1, ld2);
}
    fb1 = lb0 || lb1;
    Thought lo4 = Thought122.getInstance();
    fb0 = fb1 || lb0;
if(fo1 != null){
      lb1 = fo1.m2(fb0, fb1, lb0, lb1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ld3, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
    Thought lo5 = Thought200.getInstance(ld3, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
if(fo1 != null){
      ld3 = fo1.m3(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, ld3);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld2, ld3, fd0);
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
    Thought lo0 = Thought222.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    double ld2 = 141.40217291935792;
    lb1 = ad2 > ad3;
    boolean lb3 = false;
    ad4 = fd0 + fd1;
    Output.points[3][2] -= ld2;
if(ao4 != null){
      lb3 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb3);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld2, ad1, ad2, fb0, fb1, lb1, lb3);
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb3, fb0, fb1, lb1);
}
    ad3 = ad4 + fd0;
    boolean lb4 = true;
    lb3 = fd1 < ld2;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    ab1 = ab2 || ab3;
    fd1 = fd0 + fd1;
    ab4 = fd0 > fd1;
    fd0 *= -1;
    double ld0 = 64.09453036297572;
    Thought lo1 = Thought196.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, fd0);
}
    boolean lb2 = true;

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
    ab1 = ad1 > ad2;
    if (ab2) {
if(ao2 != null){
          ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao1 != null){
          ad2 = ao1.m3();
}
if(ao2 != null){
          ad3 = ao2.m3(ab3, ab4, fb0, fb1);
}
        ab1 = ad4 < fd0;
if(ao3 != null){
          ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
        ad4 = fd0 + fd1;
if(ao2 != null){
          ad1 = ao2.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
        fd1 = ad1 - ad2;
        Thought lo0 = Thought126.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
          ab3 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ad1;
        ab4 = fb0 && fb1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        ab1 = ab2 || ab3;
        ab4 = fb0 && fb1;
if(fo0 != null){
          ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
        ad2 *= -1;
        fb0 = ad3 < ad4;
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought183.getInstance(fd0, fd1, fd0, fd1);
    Output.points[3][3] -= fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb1 = false;
    fd0 *= -1;
    lb1 = fb0 && fb1;
    Thought lo2 = Thought111.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);

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
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd0 *= -1;
    if (ab4) {
        fb0 = fd1 > fd0;
        if (fb1) {
            ab1 = fd1 > fd0;
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
            ab2 = fd0 > fd1;
if(fo1 != null){
              ab3 = fo1.m2();
}
            ab4 = !fb0;
            fb1 = !ab1;
if(fo0 != null){
              fd0 = fo0.m3(ab2, ab3, ab4, fb0);
}
            fd1 = fd0 + fd1;
            fd0 = fd1 - fd0;
if(fo1 != null){
              fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
            fd0 = fd1 - fd0;
            Output.points[3][4] -= fd1;
if(fo0 != null){
              fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
            ab2 = !ab3;
            ab4 = fd1 > fd0;
            Output.points[3][5] -= fd1;
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
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
        boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(lb0, lb1, fb0, fb1);
}
    lb0 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
    if (lb1) {
        fd1 = ad1 - ad2;
        fb0 = fb1 && lb0;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
        Thought lo2 = Thought185.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m1();
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    ab4 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb0 = ad2 > ad3;
    boolean lb1 = false;
    lb1 = ab1 && ab2;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb2 = false;

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
    Thought lo0 = Thought182.getInstance();
    fd0 *= -1;
    fb0 = fd1 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    Output.points[3][6] += fd1;
    Output.points[3][7] += fd0;
    Output.points[3][8] += fd1;
    fb0 = fb1 && lb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
    fd0 *= -1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
if(ao1 != null){
      fb0 = ao1.m2();
}
    double ld0 = 3.420924446796508;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    ld0 = ad1 - ad2;
    ad3 *= -1;
    Thought lo2 = Thought177.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
    Output.points[4][0] -= ad1;
        fb1 = lb1 && fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    if (ab1) {
if(ao1 != null){
          fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Thought lo0 = Thought32.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        Output.points[4][1] += fd0;
        fd1 *= -1;
        boolean lb1 = true;
        fd0 = fd1 - fd0;
if(fo1 != null){
          ab3 = fo1.m2(fd1, fd0, fd1, fd0);
}
        double ld2 = 399.6600824707081;
if(ao1 != null){
          ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0);
}
        fd1 = ld2 - fd0;
        boolean lb3 = false;
if(ao1 != null){
          fo1 = ao1.m4();
}
        ab4 = fb0 || fb1;
        fd1 = ld2 - fd0;
        fd1 = ld2 - fd0;
        lb1 = fd1 < ld2;
        lb3 = !ab1;
        ab2 = fd0 < fd1;
        double ld4 = 49.695425747984686;
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
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
    ad3 *= -1;
    fb1 = ad4 > fd0;
    Output.points[4][2] += fd1;
    ab1 = ab2 || ab3;
    ad1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    if (ab2) {
if(ao4 != null){
          ao3 = ao4.m4(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ab1 = fo0.m2(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
        ad4 = fd0 - fd1;
        ad1 = ad2 - ad3;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        if (fb1) {
            ab1 = ab2 || ab3;
            ab4 = ad4 < fd0;
            double ld0 = 427.6088168133357;
            fb0 = fb1 && ab1;
if(ao4 != null){
              fd0 = ao4.m3(fd1, ld0, ad1, ad2);
}
            ad3 *= -1;
            Output.points[4][3] += ad4;
            ab2 = ab3 || ab4;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ad1);
}
            fb0 = ad2 < ad3;
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
    fb1 = !fb0;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    Thought lo1 = Thought90.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, lb2, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m1();
}
    lb0 = fd1 > fd0;
if(fo1 != null){
      lb2 = fo1.m2(lb3, fb0, fb1, lb0);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, lb3, fb0, fb1);
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
    fb0 = fb1 || fb0;
    Thought lo0 = Thought288.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    Output.points[4][4] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought157.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 717.2311742882596;
    fb1 = !fb0;
    ld0 *= -1;
    fb1 = fd0 < fd1;
    double ld1 = 793.831836056415;
    ld0 = ld1 - fd0;
    double ld2 = 779.186472118226;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ld2, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    ld0 *= -1;
    Output.points[4][5] -= ld1;
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = ld2 < fd0;
    Output.points[4][6] -= fd1;
    ld0 *= -1;
    Output.points[4][7] -= ld1;
    ld2 *= -1;
    fd0 = fd1 + ld0;
    ld1 *= -1;
        fb0 = ld2 < fd0;
    Thought lo3 = Thought252.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
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
}
