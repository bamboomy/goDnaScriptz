package genetic;
import java.util.ArrayList;
class Thought147 extends Thought{
private static ArrayList<Thought147> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 790.3977724941233;
private double fd1 = 482.96992417544567;
private Thought fo0 = null;
private Thought fo1 = null;
Thought147 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought147 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought147 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought147 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought147 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought147 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought147 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought147 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought147 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought147 instance = new Thought147 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought147 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought147 instance = new Thought147 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought147 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought147 instance = new Thought147 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought147 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought147 instance = new Thought147 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought147 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought147 instance = new Thought147 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought147 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought147 instance = new Thought147 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought147 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought147 instance = new Thought147 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought147 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought147 instance = new Thought147 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    fd0 *= -1;
    Output.points[6][2] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Output.points[6][3] -= fd1;
    double ld0 = 602.8270748611098;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought397.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 < ld0;
    fd0 = fd1 - ld0;
    fb1 = fd0 < fd1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld2 = 33.876014605501375;

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
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
    boolean lb0 = true;
    double ld1 = 936.408942501335;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld2 = 7.755126685105406;
if(fo1 != null){
          ab4 = fo1.m2(fb0, fb1, lb0, ab1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
}
        if (fb1) {
if(fo1 != null){
              lb0 = fo1.m2(ld1, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
            Thought lo3 = Thought118.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
if(fo0 != null){
              ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
            fd0 = fd1 - ld2;
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
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
    double ld0 = 907.5739593959961;
    boolean lb1 = true;
    ad2 *= -1;
    fb0 = ad3 > ad4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    Output.points[6][4] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought339.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
if(fo0 != null){
      fo0.m1(ld0, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    if (fb0) {
        fb1 = fd0 < fd1;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        lb1 = ad1 < ad2;
        Thought lo3 = Thought219.getInstance(ad3, ad4, fd0, fd1);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought290.getInstance();
    boolean lb1 = false;
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought231.getInstance(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[6][5] -= fd0;
    fb1 = fd1 > ad1;
    lb1 = !ab1;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    double ld3 = 860.9354463317487;
    boolean lb4 = true;
if(fo0 != null){
      ab1 = fo0.m2();
}
    ad3 *= -1;
        boolean lb5 = true;
    ab1 = !ab2;

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
    boolean lb0 = false;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, lb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb0 = !fb1;
    ad2 *= -1;
if(ao1 != null){
      fb0 = ao1.m2();
}
    fb1 = ad3 < ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought21.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    if (fb0) {
if(ao1 != null){
          ao1.m2(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought126.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
        Output.points[6][6] -= fd1;
        boolean lb2 = false;
        ad1 = ad2 - ad3;
        ad4 = fd0 + fd1;
        lb2 = ad1 < ad2;
        Output.points[6][7] -= ad3;
        fb0 = fb1 && lb2;
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
    ab2 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao2 != null){
      ab3 = ao2.m2(ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < fd0;
    double ld0 = 449.90869310453024;
    fd0 = fd1 - ld0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m1(fd1, ld0, fd0, fd1);
}
if(ao2 != null){
          ld0 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
        ab3 = ab4 || fb0;
if(ao2 != null){
          ao1 = ao2.m4();
}
        Thought lo1 = Thought316.getInstance(fb1, ab1, ab2, ab3);
        ab4 = fb0 || fb1;
        ab1 = fd1 < ld0;
        ab2 = fd0 < fd1;
        ab3 = ab4 && fb0;
        Thought lo2 = Thought77.getInstance(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
if(ao1 != null){
          ab4 = ao1.m2(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
        fd1 *= -1;
if(ao1 != null){
          ld0 = ao1.m3(ao2, ao3, ao4, fo0);
}
        Output.points[6][8] -= fd0;
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
        ab1 = !ab2;
if(ao2 != null){
      ab3 = ao2.m2(ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
          ao2.m1();
}
    ab3 = ab4 && fb0;
if(ao3 != null){
      fd1 = ao3.m3(fb1, lb0, ab1, ab2);
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
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought48.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[7][0] += fd0;
    Thought lo1 = Thought66.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
    fb0 = !fb1;
    lb2 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
    Output.points[7][1] -= fd1;
    lb2 = fd0 > fd1;

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
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought135.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fd1 = fo1.m3(lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    fd1 = fd0 + fd1;
    ab3 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    lb0 = !ab1;
        Output.points[7][2] -= fd1;
    ab2 = fd0 > fd1;
    double ld2 = 767.5957490424618;
    ab3 = ab4 || fb0;

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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    boolean lb2 = false;
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld3 = 513.868741839857;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, lb2, fb0);
}
    fb1 = !lb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld3, ad1, ad2, ad3, lb0, lb1, lb2, fb0);
}
    double ld4 = 882.8885934393383;
    fb1 = lb0 && lb1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought232.getInstance(ad2, ad3, ad4, fd0);
    double ld1 = 935.3575223037833;
    boolean lb2 = true;
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);
}
    ad2 = ad3 - ad4;
    boolean lb3 = true;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[7][3] -= ad1;
    boolean lb4 = true;
    lb3 = lb4 && ab1;
    ad2 = ad3 + ad4;
    boolean lb5 = true;
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, fb0, fb1, lb2, lb3);
}
    lb4 = lb5 || ab1;
    ab2 = !ab3;

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
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo0 = Thought69.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
    Output.points[7][4] += fd1;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    Thought lo1 = Thought303.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;

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
    double ld0 = 799.4147596038761;
    ld0 = ad1 - ad2;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad3 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ad4 = ao3.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
          ad2 = ao4.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        ld0 = ad1 - ad2;
if(fo0 != null){
          fb1 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
        double ld1 = 497.6548663729313;
        fb0 = ad2 < ad3;
        fb1 = ad4 < fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
          ao4 = fo0.m4(fd1, ld1, ld0, ad1);
}
        fb0 = fb1 && fb0;
        fb1 = ad2 < ad3;
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
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    ab1 = ab2 && ab3;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    Output.points[7][5] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = !fb0;
    fd1 *= -1;
    double ld1 = 490.82692970819113;
    ld1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    Output.points[7][6] -= ld1;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    ab4 = fb0 && fb1;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ad1);
}
    Thought lo2 = Thought32.getInstance();
    ad2 = ad3 - ad4;
    lb0 = fd0 < fd1;
    ld1 *= -1;

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
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    Thought lo1 = Thought152.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    fb0 = fd1 < fd0;
    Output.points[7][7] += fd1;
    double ld2 = 838.1861386462584;
    fb1 = ld2 < fd0;
    lb0 = fb0 && fb1;
    lb0 = !fb0;
    fb1 = !lb0;
    fb0 = fb1 && lb0;
    if (fb0) {
if(fo0 != null){
          fo0.m1(fd1, ld2, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ld2 = fo1.m3(fd0, fd1, ld2, fd0);
}
        boolean lb4 = false;
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
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    ab2 = fd0 > fd1;
    ab3 = fd0 > fd1;
    double ld0 = 998.7335306733086;
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought56.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
    ab4 = fd0 < fd1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
    if (ab3) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
        double ld2 = 481.64388847253343;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
}
        ld0 = fd0 + fd1;
        ld2 *= -1;
        fb1 = ld0 > fd0;
        Thought lo3 = Thought134.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fd1 *= -1;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    fb0 = ad3 > ad4;
        Thought lo1 = Thought14.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
if(fo0 != null){
      fo1 = fo0.m4();
}
        ad3 = ad4 + fd0;

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
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
    ad2 *= -1;
    Thought lo0 = Thought253.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 + ad3;
    ab1 = !ab2;
    boolean lb1 = false;
    ad4 = fd0 + fd1;
    ab2 = ad1 > ad2;
    Thought lo2 = Thought365.getInstance(ad3, ad4, fd0, fd1);
    ab3 = ad1 < ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab4 = !fb0;
if(fo0 != null){
      ad1 = fo0.m3();
}
    double ld3 = 351.631880902626;
    Thought lo4 = Thought306.getInstance(fb1, lb1, ab1, ab2);

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
    double ld0 = 25.682755808977934;
    Output.points[7][8] -= ld0;
    fb1 = fb0 || fb1;
    fd0 = fd1 - ld0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > fd0;
    double ld1 = 655.4103995225544;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    ld0 *= -1;
    ld1 = fd0 - fd1;
    ld0 = ld1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld1, fd0, fd1);
}
    ld0 *= -1;
    if (fb1) {
        for(int i0=0; i0<10; i0++){
if(ao3 != null){
              ao3.m3(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld0);
}
            Output.points[8][0] += ld1;
if(ao2 != null){
              fb0 = ao2.m2();
}
            fb1 = fb0 || fb1;
            Output.points[8][1] += fd0;
            double ld2 = 771.2289057905592;
            fb0 = fb1 || fb0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    boolean lb0 = false;
    lb0 = !fb0;
    Output.points[8][2] += fd0;
    fd1 = ad1 + ad2;
    fb1 = !lb0;
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    fd1 = fd0 + fd1;
    ab4 = fd0 < fd1;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    double ld0 = 548.7033867990822;
    fb0 = ld0 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought308.getInstance(ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
    ab2 = !ab3;
    ab4 = fd0 < fd1;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 && fb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        Output.points[8][3] += ld0;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
}
if(ao4 != null){
          ab1 = ao4.m2();
}
        ab2 = ab3 && ab4;
        Thought lo2 = Thought383.getInstance(fb0, fb1, ab1, ab2);
        ld0 *= -1;
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
    ad1 = ad2 - ad3;
    ab1 = !ab2;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    Thought lo0 = Thought180.getInstance(fo1, ao1, ao2, ao3);
    ad4 = fd0 - fd1;
    Output.points[8][4] += ad1;
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    fb0 = ad1 > ad2;
    Output.points[8][5] += ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 114.1117807422765;
        ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    double ld1 = 595.8213626332097;
    Output.points[8][6] += ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld0;
    fb0 = ld1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, ld1, fd0);
}
    Thought lo2 = Thought220.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0);
    Thought lo3 = Thought124.getInstance();
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld0;
    fb0 = ld1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld4 = 740.4755502066909;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fd0 = fd1 + fd0;
    if (ab1) {
        ab2 = !ab3;
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
        fd1 *= -1;
        ab2 = ab3 || ab4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        fb0 = fd1 > fd0;
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
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought48.getInstance();
    Output.points[8][7] += ad1;
        lb0 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
    Output.points[8][8] += ad4;
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
        double ld4 = 407.15661593242623;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld4, lb1, lb3, fb0, fb1);
}
        lb0 = !lb1;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb3, fb0, fb1, lb0);
}
        fd0 = fd1 + ld4;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, lb1, lb3, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        double ld5 = 901.7021779699165;
        boolean lb6 = false;
        lb6 = lb0 || lb1;
        ld5 = ad1 - ad2;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, ld5, ad1, ad2);
}
        ad3 = ad4 + fd0;
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
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    if (fb1) {
        ab1 = ab2 || ab3;
        ad2 *= -1;
        boolean lb0 = true;
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        ad1 = ad2 - ad3;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, lb0, lb1, ab1);
}
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        lb0 = !lb1;
        ab1 = ab2 || ab3;
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
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought107.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought101.getInstance(fo0, fo1, ao1, ao2);
    double ld2 = 214.40305766282836;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    fd1 = ld2 + fd0;
    Thought lo3 = Thought189.getInstance(fd1, ld2, fd0, fd1);
    ld2 = fd0 - fd1;
    fb0 = ld2 < fd0;
    fd1 = ld2 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1);
}
    boolean lb4 = true;
    Output.points[0][0] -= ld2;
if(ao3 != null){
      ao3.m3();
}
    fb0 = fb1 && lb4;
    fb0 = !fb1;
if(ao4 != null){
      ao4.m3(lb4, fb0, fb1, lb4);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0, fb0, fb1, lb4, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3(ld2, fd0, fd1, ld2, fb1, lb4, fb0, fb1);
}
    fd0 = fd1 + ld2;

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
    boolean lb0 = true;
    Thought lo1 = Thought192.getInstance(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
    boolean lb2 = false;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      lb2 = fo0.m2(fd0, fd1, ad1, ad2);
}
    Thought lo3 = Thought1.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
    Thought lo4 = Thought313.getInstance();
    fb0 = fb1 && lb0;
    lb2 = ad1 < ad2;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, lb2);
}
    fb0 = fb1 || lb0;
    ad3 *= -1;
    double ld5 = 378.69133828364;
    double ld6 = 685.0698586725406;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb0);
}
    Output.points[0][1] -= fd1;
    Thought lo7 = Thought203.getInstance(ld5, ld6, ad1, ad2, lb2, fb0, fb1, lb0);
    boolean lb8 = false;
    double ld9 = 877.7961016577068;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb2, lb8, fb0, fb1);
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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb0 = false;
        fd0 = fd1 + fd0;
    lb0 = !ab1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb0;
    ab1 = fd1 > fd0;
    fd1 *= -1;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
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
if(ao1 != null){
      ab2 = ao1.m2();
}
    ab3 = ad1 < ad2;
    ab4 = !fb0;
    Output.points[0][2] -= ad3;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m1(fb0, fb1, lb0, ab1);
}
    ad4 = fd0 - fd1;
    double ld1 = 5.579693842610459;
    boolean lb2 = false;
    ab1 = ld1 > ad1;
    ab2 = ad2 < ad3;
    ad4 = fd0 - fd1;
    boolean lb3 = false;
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb4 = false;
    lb0 = lb2 && lb3;
    double ld5 = 925.7272490519131;
if(ao2 != null){
      ld1 = ao2.m3(ld5, ad1, ad2, ad3, lb4, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ad4 = fd0 - fd1;
    Output.points[0][3] += ld1;

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
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fb0 = fd0 > fd1;
    Thought lo0 = Thought37.getInstance();
        fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        Thought lo1 = Thought18.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb2 = false;
        Output.points[0][4] -= fd0;

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
    Output.points[0][5] += fd1;
    fd0 *= -1;
    fd1 *= -1;
    Thought lo0 = Thought69.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    double ld1 = 797.0025025597587;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
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
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    Output.points[0][6] += fd1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3();
}
    lb1 = fd1 < fd0;
    boolean lb2 = true;
        double ld3 = 950.168817929217;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
        double ld4 = 725.7024062888281;
    lb1 = ld4 < fd0;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld3, ld4, fd0, fb0, fb1, lb0, lb1);
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
