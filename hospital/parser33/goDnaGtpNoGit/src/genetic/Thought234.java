package genetic;
import java.util.ArrayList;
class Thought234 extends Thought{
private static ArrayList<Thought234> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 393.3576034665085;
private double fd1 = 959.4211419658991;
private Thought fo0 = null;
private Thought fo1 = null;
Thought234 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought234 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought234 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought234 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought234 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought234 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought234 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought234 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought234 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought234 instance = new Thought234 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought234 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought234 instance = new Thought234 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought234 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought234 instance = new Thought234 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought234 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought234 instance = new Thought234 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought234 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought234 instance = new Thought234 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought234 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought234 instance = new Thought234 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought234 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought234 instance = new Thought234 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought234 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought234 instance = new Thought234 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 740.9225434165435;
    fb1 = fb0 || fb1;
    ld0 = fd0 + fd1;
    fb0 = !fb1;
    Output.points[3][4] -= ld0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(ld0, fd0, fd1, ld0);
}
    boolean lb1 = false;
    fd0 = fd1 + ld0;
    lb1 = !fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
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
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought18.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    ab1 = !ab2;
if(fo1 != null){
      fo1.m3();
}
    Output.points[3][5] -= fd0;
    fd1 *= -1;
    fd0 *= -1;
    boolean lb3 = false;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    lb2 = fd1 > fd0;
    lb3 = !ab1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb0, lb2, lb3);
}
    ab1 = ab2 && ab3;
    Output.points[3][6] += fd0;
    if (ab4) {
        fb0 = fd1 > fd0;
        fd1 = fd0 + fd1;
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
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && fb0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo0.m3();
}
        fb1 = fb0 && fb1;
        fd0 = fd1 - ad1;
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
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought208.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
    ab3 = fd1 > ad1;
    ad2 = ad3 - ad4;
    ab4 = fd0 > fd1;
    Output.points[3][7] += ad1;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    Output.points[3][8] -= ad3;
if(fo1 != null){
      fo1.m2();
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
    Output.points[4][0] += fd1;
    fb0 = fb1 || fb0;
    double ld0 = 684.3536578209687;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo1 = Thought178.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ao1.m2(fd1, ld0, fd0, fd1);
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
    ad1 = ad2 - ad3;
    Thought lo0 = Thought2.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
    boolean lb1 = false;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = lb1 || fb0;
    boolean lb2 = true;
if(ao1 != null){
      ao1.m2(fb0, fb1, lb1, lb2);
}
    fb0 = !fb1;
    lb1 = ad2 < ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, lb1, lb2, fb0, fb1);
}
    lb1 = lb2 && fb0;
    boolean lb3 = true;
    boolean lb4 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb4, fb0, fb1, lb1);
}
    lb2 = lb3 || lb4;
    fb0 = !fb1;
    lb1 = ad1 < ad2;
if(ao3 != null){
      lb2 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    boolean lb5 = false;
    lb3 = lb4 && lb5;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
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
    fd0 *= -1;
    ab2 = ab3 || ab4;
if(ao2 != null){
      fb0 = ao2.m2();
}
    Thought lo0 = Thought355.getInstance(fb1, ab1, ab2, ab3);
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb1);
}
    Thought lo3 = Thought129.getInstance(ao4, fo0, fo1, ao1);
    lb2 = fd0 > fd1;
    ab1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
    boolean lb4 = true;
    ab4 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb0 = fb1 && lb1;
if(ao1 != null){
      fo1 = ao1.m4(lb2, lb4, ab1, ab2);
}
    if (ab3) {
        ab4 = fb0 || fb1;
        fd1 = fd0 + fd1;
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    Output.points[4][1] += ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = ad4 < fd0;
    Output.points[4][2] += fd1;
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    ab4 = fd0 > fd1;
if(ao3 != null){
      ao3.m3(ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
    Thought lo2 = Thought195.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
    ab4 = fb0 && fb1;
    ad3 *= -1;
    Output.points[4][3] -= ad4;
    lb0 = lb1 || ab1;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ab2 = ao2.m2();
}
    ad2 *= -1;
    Thought lo3 = Thought252.getInstance(ab3, ab4, fb0, fb1);
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb0, lb1, ab1, ab2);
}
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Output.points[4][4] += fd0;
    double ld4 = 830.7508429327099;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb1, ab1, ab2);
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
    fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;

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
    if (ab2) {
        ab3 = fd0 > fd1;
        ab4 = fd0 > fd1;
        double ld0 = 221.60664056823256;
        double ld1 = 701.1524848041571;
if(fo0 != null){
          fo1 = fo0.m4();
}
        } else if (fb0) {
        fb1 = ab1 || ab2;
if(fo1 != null){
          ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
        boolean lb2 = false;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb2, ab1);
}
        ab2 = fd0 < fd1;
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        } else {
        boolean lb3 = false;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          ab2 = fo0.m2();
}
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
        Thought lo4 = Thought105.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb3, ab1, ab2, ab3);
        ab4 = fb0 && fb1;
        Output.points[4][5] += fd1;
if(fo1 != null){
          lb3 = fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb3, ab1);
}
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
    ad1 = ad2 - ad3;
    fb1 = !fb0;
    double ld0 = 759.558314333911;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
    Output.points[4][6] += ad4;
    boolean lb2 = false;
    lb2 = fd0 > fd1;
    ld0 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, lb2);
}
    Thought lo3 = Thought321.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb2);
    fb0 = ld0 > ad1;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, fb1, lb1, lb2, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ld0, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    lb1 = ld0 < ad1;
    lb2 = ad2 > ad3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
        Thought lo4 = Thought76.getInstance();
    Thought lo5 = Thought318.getInstance(fb0, fb1, lb1, lb2);

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
    ad2 = ad3 + ad4;
    boolean lb0 = true;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    boolean lb2 = true;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
    ab1 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ab2 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = ad1 + ad2;
    ab3 = ab4 && fb0;
    Thought lo3 = Thought348.getInstance(fb1, lb0, lb1, lb2);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab4 = fo1.m2(ad2, ad3, ad4, fd0);
}
    Thought lo4 = Thought236.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    fb0 = fb1 || lb0;
    Output.points[4][7] -= ad4;

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
if(ao1 != null){
      fb0 = ao1.m2();
}
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fd0 = fd1 - fd0;
        fb0 = fb1 || lb0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        fb1 = fd1 < fd0;
        fd1 = fd0 - fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Output.points[4][8] += ad1;
    fb1 = ad2 < ad3;
    boolean lb0 = true;
    lb0 = ad4 > fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought178.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
    double ld2 = 86.41402554882491;

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
    fd1 = fd0 - fd1;
if(ao1 != null){
      ab1 = ao1.m2();
}
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    Thought lo0 = Thought89.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    Output.points[5][0] += fd1;
    ab1 = fd0 < fd1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
    ab3 = ab4 && fb0;
if(ao3 != null){
      ao3.m3(fb1, ab1, ab2, ab3);
}
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought299.getInstance(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb1);
    Thought lo3 = Thought8.getInstance(ao4, fo0, fo1, ao1);
    Thought lo4 = Thought38.getInstance(fd0, fd1, fd0, fd1);
    Thought lo5 = Thought31.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);

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
    double ld0 = 592.486090867529;
    Thought lo1 = Thought283.getInstance();
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m2(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    ld0 = ad1 - ad2;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    double ld2 = 700.4530934917705;
if(ao2 != null){
      ab1 = ao2.m2(ld0, ld2, ad1, ad2, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ad3 > ad4;
        boolean lb3 = false;
        fd0 = fd1 + ld0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb3, ab1, ab2, ab3);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
        double ld4 = 914.5242906435703;
        ld0 = ld2 - ad1;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0);
}
        fb0 = fd1 > fd0;
        fb1 = lb0 || fb0;
        Output.points[5][1] -= fd1;
        fb1 = lb0 && fb0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fb1 = lb0 || fb0;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
        Output.points[5][2] += fd0;
        boolean lb1 = true;
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
        fd0 = fd1 - fd0;
        double ld2 = 365.96236995093085;
        fb0 = fd0 > fd1;
        fb1 = ld2 > fd0;
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ld2, fd0, fd1, ld2);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Thought lo0 = Thought345.getInstance();
    double ld1 = 424.80799069367;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    Output.points[5][3] += ld1;
    Output.points[5][4] += fd0;
    boolean lb2 = false;
    ab2 = ab3 && ab4;
    fb0 = fd1 > ld1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb2, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = ld1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, lb2, ab1, ab2, ab3);
}
    ld1 = fd0 + fd1;
    ab4 = fb0 || fb1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[5][5] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo0.m2();
}
    Output.points[5][6] -= fd0;

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
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought112.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    Output.points[5][7] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb1;
    Output.points[5][8] += fd1;
    Output.points[6][0] -= ad1;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    boolean lb3 = false;
    ad2 = ad3 - ad4;
    double ld4 = 591.4033529955376;
    lb1 = !lb2;
if(fo1 != null){
      lb3 = fo1.m2(ad4, fd0, fd1, ld4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[6][1] += fd0;
    double ld5 = 739.2969776351393;
    fb0 = fd0 < fd1;
    fb1 = ld4 < ld5;
if(fo0 != null){
      ad1 = fo0.m3();
}
        ad2 = ad3 + ad4;

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
        ad2 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ab1 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 - ad4;
    fb1 = lb0 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = ad1 - ad2;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    double ld3 = 435.09379071436035;
    lb2 = ld3 < ad1;
    Thought lo4 = Thought236.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    ab1 = !ab2;
        ab3 = ab4 || fb0;
    double ld5 = 54.04113845713915;
    boolean lb6 = true;
    Output.points[6][2] -= fd0;

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
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    boolean lb1 = false;
    fb0 = fd0 > fd1;
    fb1 = !lb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought9.getInstance(fo1, ao1, ao2, ao3);

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
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ad1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    double ld0 = 315.5612244110161;
    Thought lo1 = Thought267.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
    for(int i0=0; i0<10; i0++){
        double ld2 = 286.6098904609394;
if(ao3 != null){
          ao2 = ao3.m4();
}
        Thought lo3 = Thought296.getInstance(fb1, fb0, fb1, fb0);
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2, fb1, fb0, fb1, fb0);
}
        Thought lo4 = Thought36.getInstance(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
        ad4 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        fb1 = fd0 > fd1;
        fb0 = ld2 < ld0;
        fb1 = ad1 > ad2;
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
        Thought lo5 = Thought266.getInstance(fo0, fo1, ao1, ao2, ld2, ld0, ad1, ad2);
        Thought lo6 = Thought360.getInstance();
if(ao3 != null){
          ao3.m1(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = ld2 < ld0;
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
    ab2 = fd1 > fd0;
    ab3 = !ab4;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ab1 = fd0 < fd1;
    ab2 = !ab3;
    Thought lo0 = Thought170.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        boolean lb1 = false;
        ab3 = !ab4;
if(ao1 != null){
          fd0 = ao1.m3();
}
if(ao2 != null){
          ao2.m2(fb0, fb1, lb1, ab1);
}
if(ao3 != null){
          ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        lb1 = fd1 < fd0;
        fd1 = fd0 - fd1;
        ab1 = ab2 && ab3;
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
        boolean lb2 = true;
        fd0 = fd1 - fd0;
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
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    double ld0 = 366.83045330016864;
    Thought lo1 = Thought223.getInstance(ao3, ao4, fo0, fo1);
    Thought lo2 = Thought127.getInstance(ad4, fd0, fd1, ld0);
    ab3 = ad1 < ad2;
    double ld3 = 206.55486642981325;
    Output.points[6][3] -= ad2;
    boolean lb4 = false;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ab4 = fb0 || fb1;
    lb4 = ld0 > ld3;
    ab1 = ab2 && ab3;
    boolean lb5 = false;
    ad1 *= -1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    ab3 = !ab4;
    fd1 *= -1;
    double ld6 = 28.197994967150397;
    ld0 = ld3 + ld6;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(lb4, lb5, ab1, ab2);
}

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Output.points[6][4] += fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    double ld1 = 854.1000711134741;
    lb0 = fd0 < fd1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, fd0, fd1);
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
    fd0 = fd1 - ld1;
    double ld2 = 576.7816103904568;
    Output.points[6][5] += ld2;
    fb0 = fb1 && lb0;
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 < fd1;
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
    double ld0 = 900.0879850293796;
    boolean lb1 = true;
    boolean lb2 = true;
    ld0 = fd0 + fd1;
    lb1 = lb2 || ab1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    double ld3 = 873.9971897602439;
    Output.points[6][6] -= ld0;
    ld3 = fd0 + fd1;
    fb1 = ld0 > ld3;
    fd0 *= -1;
    Output.points[6][7] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld3, fd0, fd1, lb1, lb2, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld3, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld0 *= -1;
    double ld4 = 651.9298931523712;
    for(int i0=0; i0<10; i0++){
        double ld5 = 545.3604761300594;
        ld0 = ld3 + ld4;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb1, lb2, ab1, ab2);
}
        Thought lo6 = Thought236.getInstance(fo0, fo1, fo0, fo1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
    boolean lb1 = false;
    lb0 = !lb1;
    ad1 = ad2 - ad3;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
        ad4 = fd0 + fd1;
    Output.points[6][8] += ad1;
    double ld3 = 605.6543037342246;

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
    ab1 = ad2 < ad3;
    ad4 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    ab2 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    Thought lo0 = Thought361.getInstance(fo1, fo0, fo1, fo0);

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
    fb1 = !fb0;
    fb1 = !fb0;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Output.points[7][0] += fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
if(ao2 != null){
      fb0 = ao2.m2();
}
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb0 = true;
    Output.points[7][1] += fd1;
    fb0 = fb1 || lb0;
    double ld1 = 48.906283122781154;
    double ld2 = 762.9623664747984;
    fb0 = !fb1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    double ld3 = 289.5779032918141;
    fb0 = ld2 < ld3;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, ld2, fb1, lb0, fb0, fb1);
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
    double ld0 = 323.38374517855107;
    fb0 = fb1 && fb0;
    ld0 = ad1 + ad2;
    double ld1 = 122.6869737260887;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld0, ld1, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    double ld2 = 376.4044879943878;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ld0 = ld1 - ld2;
    Output.points[7][2] += ad1;
    ad2 *= -1;
    double ld3 = 358.50641382529017;
    double ld4 = 316.1532208005059;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, ld3, ld4, ad1, fb0, fb1, fb0, fb1);
}
    double ld5 = 6.812685018078425;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[7][3] += ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = ad3 > ad4;
    fb1 = fb0 && fb1;

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
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Output.points[7][4] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    Output.points[7][5] -= fd1;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    ab1 = ab2 && ab3;
    Thought lo0 = Thought227.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    Output.points[7][6] += fd1;
    Output.points[7][7] -= fd0;
    boolean lb2 = true;
    fd1 *= -1;
    ab2 = fd0 < fd1;
    ab3 = ab4 || fb0;
    fb1 = fd0 < fd1;
    lb1 = lb2 && ab1;
    Thought lo3 = Thought158.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
if(fo0 != null){
      ao4 = fo0.m4();
}
    ab2 = ab3 && ab4;
    fb0 = fd0 > fd1;

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
    Thought lo0 = Thought41.getInstance(ab2, ab3, ab4, fb0);
    if (fb1) {
        ad1 *= -1;
        ab1 = ad2 < ad3;
        ad4 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
        boolean lb1 = false;
        } else if (ab4) {
        ad3 *= -1;
        if (fb0) {
            double ld2 = 202.52770619729182;
            fb1 = ab1 && ab2;
if(ao3 != null){
              ao3.m1(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
            boolean lb3 = true;
if(ao2 != null){
              lb3 = ao2.m2(ao3, ao4, fo0, fo1);
}
            Thought lo4 = Thought329.getInstance(ad3, ad4, fd0, fd1);
            Thought lo5 = Thought142.getInstance(ao1, ao2, ao3, ao4, ld2, ad1, ad2, ad3);
            ad4 = fd0 - fd1;
            for(int i0=0; i0<10; i0++){
                Thought lo6 = Thought81.getInstance();
if(fo1 != null){
                  fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
                Thought lo7 = Thought138.getInstance(ao1, ao2, ao3, ao4, ld2, ad1, ad2, ad3, fb0, fb1, lb3, ab1);
                ab2 = ab3 || ab4;
                double ld8 = 38.52214439318425;
if(fo1 != null){
                  fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb3, ab1);
}
                boolean lb9 = false;
}}}
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
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1();
}
    boolean lb0 = false;
        lb0 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    Thought lo1 = Thought282.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    double ld2 = 212.03313033571106;
    lb0 = ld2 < fd0;
    fb0 = fd1 < ld2;
    fb1 = !lb0;
    double ld3 = 41.99869358648205;
    boolean lb4 = false;
        ld3 *= -1;
    lb4 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(ld2, ld3, fd0, fd1, fb1, lb0, lb4, fb0);
}
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    double ld0 = 572.3568840227122;
    fb0 = ld0 < fd0;
    fb1 = !fb0;
    Thought lo1 = Thought260.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m3(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb1 = fd1 < ld0;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought242.getInstance(fb0, fb1, fb0, fb1);
    Thought lo3 = Thought173.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo4 = Thought239.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
            fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, fd0, fd1);
}
    fb1 = fb0 || fb1;
    Thought lo5 = Thought42.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 217.92946917073903;
    fb0 = !fb1;
    double ld1 = 671.6740407527756;
if(fo0 != null){
      fb0 = fo0.m2(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[7][8] += ld1;
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
if(fo1 != null){
      lb2 = fo1.m2(fd0, fd1, ld0, ld1);
}
        boolean lb3 = true;
    lb3 = !fb0;
    fb1 = lb2 || lb3;
    double ld4 = 702.2293073534795;
    Output.points[8][0] -= ld4;
    Thought lo5 = Thought24.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
    Output.points[8][1] += ld4;
    fb0 = fd0 > fd1;
    fb1 = lb2 && lb3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb6 = true;
if(fo0 != null){
      fo0.m2(lb6, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, ld4, fd0, lb3, lb6, fb0, fb1);
}
    fd1 *= -1;
    lb2 = lb3 || lb6;

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
