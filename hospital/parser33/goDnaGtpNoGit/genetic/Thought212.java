package genetic;
import java.util.ArrayList;
class Thought212 extends Thought{
private static ArrayList<Thought212> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 107.33715956289242;
private double fd1 = 620.9715483051591;
private Thought fo0 = null;
private Thought fo1 = null;
Thought212 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought212 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought212 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought212 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought212 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought212 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought212 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought212 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought212 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought212 instance = new Thought212 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought212 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought212 instance = new Thought212 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought212 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought212 instance = new Thought212 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought212 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought212 instance = new Thought212 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought212 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought212 instance = new Thought212 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought212 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought212 instance = new Thought212 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought212 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought212 instance = new Thought212 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought212 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought212 instance = new Thought212 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought208.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb1 = fd1 < fd0;
    fd1 *= -1;
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 *= -1;
    lb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    Output.points[0][5] -= fd1;

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
    double ld0 = 521.6746961604009;
    ld0 = fd0 - fd1;
    double ld1 = 986.9464886616573;
    double ld2 = 867.6553257338046;
    Thought lo3 = Thought93.getInstance(fo0, fo1, fo0, fo1, ld0, ld1, ld2, fd0, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, ld2, ab3, ab4, fb0, fb1);
}
    boolean lb4 = false;
        lb4 = fd0 > fd1;
        double ld5 = 853.3310684552081;
    ab1 = ab2 || ab3;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[0][6] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
          fo1.m3();
}
    fb1 = ad3 > ad4;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    fb0 = fd1 > ad1;
    fb1 = !fb0;
    Thought lo0 = Thought251.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought215.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    boolean lb2 = false;
    fb0 = fb1 && lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 > ad1;

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
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
        fb0 = ad4 < fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
        boolean lb0 = true;
        boolean lb1 = true;
        boolean lb2 = true;
        double ld3 = 276.910702781527;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ld3 *= -1;
        boolean lb5 = false;
        ad1 *= -1;
        double ld6 = 591.9245082078845;
        for(int i1=0; i1<10; i1++){
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
    fb0 = fb1 && fb0;
    fd0 *= -1;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Output.points[0][7] -= fd1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
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
    Thought lo0 = Thought227.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    boolean lb1 = false;
    ad2 = ad3 + ad4;
    Output.points[0][8] -= fd0;
    double ld2 = 943.3194168525124;
    fb0 = fb1 && lb1;
    fd0 = fd1 - ld2;
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
    boolean lb3 = false;
    Thought lo4 = Thought310.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld2, ad1);
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fb0, fb1, lb1, lb3);
}
    double ld5 = 436.1020026640315;
    Thought lo6 = Thought62.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb3);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, ld5, fb0, fb1, lb1, lb3);
}
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb3);
}
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb0 = ad4 < fd0;
    fb1 = lb1 && lb3;

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
      ao1.m3(fd1, fd0, fd1, fd0);
}
    double ld0 = 853.6517953019231;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    Output.points[1][0] -= ld0;
    boolean lb1 = true;
    Output.points[1][1] -= fd0;
    boolean lb2 = false;
    Thought lo3 = Thought282.getInstance(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
    lb1 = lb2 || ab1;
if(ao4 != null){
      ao3 = ao4.m4(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb1, lb2, ab1);
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
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb0 = ad1 > ad2;
    Output.points[1][2] -= ad3;
    Output.points[1][3] += ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    fb1 = ab1 && ab2;
    for(int i0=0; i0<10; i0++){
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
    boolean lb0 = false;
        fd1 *= -1;
    lb0 = fb0 || fb1;
    double ld1 = 386.40692565111414;
    boolean lb2 = true;
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb4 = false;
if(fo0 != null){
      lb0 = fo0.m2(lb2, lb3, lb4, fb0);
}
    ld1 = fd0 + fd1;
    fb1 = lb0 && lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, lb3, lb4, fb0, fb1);
}
    fd0 = fd1 + ld1;
    Thought lo5 = Thought145.getInstance(fd0, fd1, ld1, fd0, lb0, lb2, lb3, lb4);
    fd1 = ld1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fd0 *= -1;
    lb3 = fd1 < ld1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + ld1;
    fd0 *= -1;

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
    fd0 *= -1;
    Output.points[1][4] += fd1;
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought87.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    ab3 = fd0 > fd1;
    boolean lb1 = false;
    Thought lo2 = Thought175.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    lb1 = fd0 < fd1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    boolean lb3 = true;
    double ld4 = 940.1981037076617;
    ld4 = fd0 + fd1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld5 = 874.3290592350604;
    fb0 = !fb1;
    lb1 = !lb3;
    double ld6 = 788.7646315367818;
    ld4 *= -1;
    double ld7 = 181.02126593450603;
if(fo0 != null){
      fo1 = fo0.m4(ld5, ld6, ld7, fd0);
}
    fd1 = ld4 - ld5;
    double ld8 = 616.5747342365394;
    ab1 = ld6 > ld7;
    ab2 = ab3 && ab4;
    fb0 = ld8 < fd0;

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
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    Thought lo1 = Thought34.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fb0 = fd0 > fd1;
    double ld2 = 773.6488284171053;
if(fo1 != null){
      fo1.m2();
}
    ld2 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    boolean lb3 = true;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld2, ad1, lb3, fb0, fb1, lb0);
}
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb3);
}
    fb0 = ad2 > ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = !lb0;
    lb3 = fb0 && fb1;
    Thought lo4 = Thought208.getInstance(ad4, fd0, fd1, ld2);
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m1(lb3, fb0, fb1, lb0);
}
    fd0 = fd1 + ld2;
    ad1 = ad2 + ad3;
    double ld5 = 527.4304841125805;
    double ld6 = 622.4120993755772;
    Output.points[1][5] -= ad2;
    Thought lo7 = Thought127.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb3, fb0, fb1, lb0);
    lb3 = ld2 < ld5;

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
    ab2 = !ab3;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = fd0 > fd1;
    ad1 = ad2 - ad3;
    if (fb0) {
        double ld1 = 216.22868761588163;
        fb1 = lb0 && ab1;
        double ld2 = 43.637548292668015;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought97.getInstance(ao1, ao2, ao3, ao4);
    Output.points[1][6] -= fd1;
    fb1 = fd0 > fd1;
    fb0 = !fb1;
    fb0 = !fb1;
    fb0 = !fb1;
    Output.points[1][7] += fd0;
    double ld1 = 10.58233600913526;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, fd0);
}
    fb0 = !fb1;

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
    fb1 = ad1 > ad2;
    ad3 = ad4 - fd0;
    boolean lb0 = true;
    boolean lb1 = true;
    fd1 = ad1 + ad2;
    double ld2 = 57.45452849463234;
    double ld3 = 261.1187373251242;
    lb0 = lb1 && fb0;
    double ld4 = 772.6309185066505;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld4, ad1, ad2, ad3);
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
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought160.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
if(ao3 != null){
      ab3 = ao3.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ab1 = ab2 && ab3;
    fd0 = fd1 - fd0;
    ab4 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb1 = ab1 && ab2;
if(ao3 != null){
      ao3.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    ab3 = ab4 && fb0;
if(ao4 != null){
      fd1 = ao4.m3();
}
    Output.points[1][8] -= fd0;
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;

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
    Thought lo0 = Thought71.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
    fd1 *= -1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    double ld1 = 306.5327434412411;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ad4 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ld1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1, fb1, ab1, ab2, ab3);
}
    Output.points[2][0] -= ad2;
    ad3 = ad4 - fd0;
    ab4 = !fb0;
    for(int i0=0; i0<10; i0++){
        fd1 = ld1 + ad1;
if(ao2 != null){
          ao2.m3(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    Output.points[2][1] += fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 *= -1;
    fd1 = fd0 - fd1;

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
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    ab1 = fd0 > fd1;
    ab2 = ab3 || ab4;
    double ld1 = 650.6215774769219;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
}
    boolean lb2 = false;
    ab1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ld1 < fd0;
    lb0 = lb2 || ab1;
    Thought lo3 = Thought233.getInstance(fo1, fo0, fo1, fo0);
    boolean lb4 = true;
    fd1 = ld1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
    Thought lo5 = Thought118.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
    Output.points[2][2] += fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    for(int i0=0; i0<10; i0++){
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
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = ad1 > ad2;
    Output.points[2][3] -= ad3;
    fb1 = ad4 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    double ld0 = 336.33947918978083;
    fb0 = fb1 && fb0;
    boolean lb1 = true;
    ad2 = ad3 + ad4;
    Output.points[2][4] += fd0;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m2();
}
    if (ab3) {
        fd0 *= -1;
        Output.points[2][5] += fd1;
        boolean lb0 = true;
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 - ad1;
        Output.points[2][6] -= ad2;
if(fo0 != null){
          fo0.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
        } else {
        Thought lo1 = Thought188.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
        Output.points[2][7] -= ad1;
        if (ab1) {
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1);
}
            ad2 = ad3 - ad4;
            ab2 = fd0 > fd1;
}}
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
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    double ld2 = 283.7694816972334;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
}
    ld2 = fd0 - fd1;
if(ao2 != null){
      ao2.m2();
}
    Thought lo3 = Thought256.getInstance(lb1, fb0, fb1, lb0);
    Thought lo4 = Thought128.getInstance(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
    Output.points[2][8] += fd0;
if(ao1 != null){
      ao1.m3(fd1, ld2, fd0, fd1, lb1, fb0, fb1, lb0);
}
    ld2 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb0);
}
    ld2 = fd0 - fd1;
    boolean lb5 = true;
    boolean lb6 = false;
    ld2 = fd0 - fd1;
    ld2 = fd0 - fd1;
    boolean lb7 = true;
    lb1 = lb5 || lb6;
    lb7 = fb0 || fb1;
    lb0 = lb1 && lb5;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Output.points[3][0] -= ld2;
if(ao1 != null){
      ao1.m1(fd0, fd1, ld2, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought343.getInstance(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    boolean lb1 = false;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
    double ld2 = 289.22643734085347;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad4 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(ld2, ad1, ad2, ad3);
}
    fb0 = ad4 < fd0;
    fb1 = lb1 && fb0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, ld2, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(ao4 != null){
      fd1 = ao4.m3();
}
    ld2 = ad1 + ad2;
    fb1 = ad3 < ad4;
if(fo0 != null){
      fo0.m3(lb1, fb0, fb1, lb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ad1, fb0, fb1, lb1, fb0);
}
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb3);
}
    fb0 = fb1 && lb1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, lb3, fb0, fb1, lb1);
}
if(ao1 != null){
      lb3 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = ld2 < ad1;

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
if(ao2 != null){
          fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 *= -1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    fd0 *= -1;
    Output.points[3][1] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
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
    ab2 = !ab3;
    double ld0 = 435.03354996610705;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    ad1 *= -1;
    ab2 = !ab3;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought213.getInstance(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought99.getInstance(ab4, fb0, fb1, ab1);
    Output.points[3][2] -= ad3;
    ad4 = fd0 + fd1;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    double ld3 = 642.0322296466836;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    ld3 = ad1 - ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Output.points[3][3] += ad4;
    fd0 *= -1;
    boolean lb4 = true;
    fd1 = ld0 + ld3;
    ad1 *= -1;
    boolean lb5 = false;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
    lb0 = fd0 > fd1;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    lb0 = lb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    boolean lb2 = true;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb2, fb0, fb1);
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
    fd0 = fd1 - fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    Output.points[3][4] -= fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    ab4 = fb0 && fb1;
    Output.points[3][5] -= fd1;
    lb0 = fd0 < fd1;
    lb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought268.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);

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
    ad2 *= -1;
    double ld0 = 985.5677314418392;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[3][6] += fd1;
    double ld1 = 649.6868069285285;
    Output.points[3][7] -= ld0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = ld1 > ad1;
    double ld2 = 585.2103039537353;
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 < fd1;
        fb0 = ld0 < ld1;
if(fo0 != null){
          fo0.m1(ld2, ad1, ad2, ad3);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
          fo0.m1();
}
        fb1 = fb0 && fb1;
        ld1 *= -1;
        Output.points[3][8] -= ld2;
        boolean lb3 = false;
if(fo0 != null){
          fo1 = fo0.m4(lb3, fb0, fb1, lb3);
}
        Thought lo4 = Thought180.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb3, fb0);
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, ld0, ld1, lb3, fb0, fb1, lb3);
}
        ld2 *= -1;
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
    ab2 = !ab3;
    double ld0 = 391.05423254243914;
    ab4 = fb0 && fb1;
    ab1 = !ab2;
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    double ld1 = 804.0981011667844;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld1 = ad1 + ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought305.getInstance(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2);
if(fo0 != null){
      fo0.m1();
}
    ad3 = ad4 - fd0;
    fd1 = ld0 + ld1;
    double ld3 = 733.7766971864957;
    double ld4 = 218.8390045690216;
    ld3 *= -1;
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
    double ld5 = 20.777214935111843;
    ld4 = ld5 - ad1;
    Output.points[4][0] -= ad2;
    ab3 = ad3 > ad4;

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
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
        lb0 = fb0 && fb1;
    double ld1 = 464.1747502860179;
    lb0 = ld1 > fd0;
if(ao1 != null){
      ao1.m2(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    ld1 = fd0 + fd1;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      lb0 = ao1.m2(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
    double ld2 = 584.8427526896826;
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao2 != null){
      ld2 = ao2.m3(fb1, lb0, fb0, fb1);
}
    boolean lb3 = false;
    Output.points[4][1] -= fd0;
    Thought lo4 = Thought273.getInstance(ao3, ao4, fo0, fo1, fd1, ld1, ld2, fd0, lb0, lb3, fb0, fb1);
    lb0 = fd1 < ld1;
if(ao2 != null){
      ao1 = ao2.m4(ld2, fd0, fd1, ld1, lb3, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, lb3, fb0, fb1, lb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
        ad2 = ad3 + ad4;
        fb0 = !fb1;
        } else {
        fb0 = fb1 || fb0;
        fd0 = fd1 - ad1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ad2 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        fb0 = fb1 && fb0;
        fd0 *= -1;
        double ld0 = 982.4789295388812;
if(ao4 != null){
          ao4.m1(fb1, fb0, fb1, fb0);
}
        Thought lo1 = Thought56.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
        Output.points[4][2] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fo0.m1(ld0, ad1, ad2, ad3);
}
        Thought lo2 = Thought33.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0);
        fb1 = fb0 || fb1;
        fb0 = fb1 && fb0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought184.getInstance(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    ab1 = fd1 < fd0;
    fd1 *= -1;
    Output.points[4][3] -= fd0;
    ab2 = ab3 && ab4;
    fb0 = fd1 < fd0;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb3 = false;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, lb1, lb2, lb3);
}
    boolean lb5 = false;
if(fo1 != null){
      lb4 = fo1.m2(fd0, fd1, fd0, fd1, lb5, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = false;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    Output.points[4][4] -= fd1;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      lb1 = ao4.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 > ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, lb0, lb1, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb2 = true;
    ab1 = fd1 > ad1;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    Thought lo3 = Thought85.getInstance();
    ad4 *= -1;
    Thought lo4 = Thought1.getInstance(ab2, ab3, ab4, fb0);
    fd0 = fd1 + ad1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb2);
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
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    lb0 = !fb0;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    boolean lb2 = false;
    Output.points[4][5] -= fd1;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, lb2, lb3);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    Thought lo4 = Thought57.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);

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
        fd0 = fd1 - fd0;
            fd1 = fd0 - fd1;
    double ld1 = 181.33847232161932;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4();
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
