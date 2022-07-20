package genetic;
import java.util.ArrayList;
class Thought397 extends Thought{
private static ArrayList<Thought397> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 421.2148577686325;
private double fd1 = 158.67198604991128;
private Thought fo0 = null;
private Thought fo1 = null;
Thought397 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought397 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought397 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought397 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought397 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought397 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought397 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought397 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought397 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought397 instance = new Thought397 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought397 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought397 instance = new Thought397 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought397 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought397 instance = new Thought397 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought397 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought397 instance = new Thought397 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought397 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought397 instance = new Thought397 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought397 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought397 instance = new Thought397 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought397 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought397 instance = new Thought397 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought397 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought397 instance = new Thought397 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3();
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[4][8] -= fd1;
    Thought lo0 = Thought1.getInstance(fd0, fd1, fd0, fd1);
    Output.points[5][0] -= fd0;
    fd1 = fd0 - fd1;
        ab1 = ab2 && ab3;
    Thought lo1 = Thought313.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab4 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = false;
    fd1 *= -1;
    lb2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    double ld3 = 533.6688761596871;
    if (ab4) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, ab1);
}
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
        boolean lb4 = false;
if(fo1 != null){
          fo1.m3(ld3, fd0, fd1, ld3);
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
    Thought lo0 = Thought137.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    fd1 *= -1;
    double ld1 = 906.6393369188211;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    ld1 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd1 = ld1 - ad1;
    boolean lb2 = false;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(ld1, ad1, ad2, ad3, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought164.getInstance(fo0, fo1, fo0, fo1);
    lb2 = fb0 && fb1;
if(fo0 != null){
      lb2 = fo0.m2(ad4, fd0, fd1, ld1);
}
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
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
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    double ld0 = 334.1717015305714;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ad3 = ad4 + fd0;
    boolean lb1 = true;
    boolean lb2 = false;
    ab1 = fd1 > ld0;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ld0);
}
    double ld3 = 521.3310879267464;

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
    fb1 = fd1 > fd0;
    Thought lo0 = Thought352.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    Output.points[5][1] += fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fb0 || fb1;
    Output.points[5][2] += fd0;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
}
    lb1 = fd0 > fd1;
    if (fb0) {
        boolean lb2 = false;
        fb0 = fd0 < fd1;
        fb1 = !lb2;
        lb1 = fb0 || fb1;
        lb2 = fd0 > fd1;
        for(int i0=0; i0<10; i0++){
if(ao3 != null){
              fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
            fd1 = fd0 - fd1;
if(ao2 != null){
              ao2.m3(fd0, fd1, fd0, fd1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][3] -= ad1;
    Thought lo0 = Thought378.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2();
}
    if (fb0) {
        fb1 = fb0 && fb1;
        fd1 = ad1 + ad2;
        Thought lo1 = Thought118.getInstance(fb0, fb1, fb0, fb1);
        fb0 = fb1 || fb0;
        boolean lb2 = true;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, lb2, fb0, fb1);
}
        ad1 *= -1;
        double ld3 = 549.39733353776;
        Thought lo4 = Thought230.getInstance(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
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
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + fd0;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
    Thought lo0 = Thought341.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
if(ao4 != null){
      fd0 = ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought254.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
    fd1 = fd0 + fd1;
    ab2 = !ab3;
    boolean lb2 = true;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
    double ld0 = 699.1119375792836;
    ad2 = ad3 - ad4;
    ab1 = fd0 < fd1;
    ld0 = ad1 - ad2;
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
    ad3 *= -1;
    ab2 = !ab3;
    Thought lo1 = Thought154.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb2 = false;

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
    boolean lb0 = true;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    Output.points[5][4] += fd1;
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 < fd1;
        fd0 = fd1 + fd0;
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        fd1 = fd0 - fd1;
        boolean lb1 = false;
        fb0 = !fb1;
        Thought lo2 = Thought397.getInstance(fd0, fd1, fd0, fd1, lb1, lb0, fb0, fb1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    Thought lo0 = Thought29.getInstance(fo1, fo0, fo1, fo0);
    fb1 = !ab1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
    boolean lb1 = true;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[5][5] += fd1;
    double ld2 = 483.65435276235655;
    double ld3 = 830.79853290673;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, ab1, ab2);
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
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > ad1;
    double ld1 = 269.25750712573137;
    ad1 *= -1;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    double ld3 = 225.25219224709627;
    lb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        ld1 = ld3 - ad1;
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        }
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[5][6] -= ld1;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb0);
}
    Output.points[5][7] += ld3;
    Thought lo4 = Thought288.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
    Thought lo5 = Thought22.getInstance(fd0, fd1, ld1, ld3, lb2, fb0, fb1, lb0);

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
    ad1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fb0 = ad2 > ad3;
        fb1 = ab1 && ab2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        Output.points[5][8] -= ad1;
        double ld0 = 360.83547741094225;
        Output.points[6][0] += ad1;
        boolean lb1 = false;
        boolean lb2 = false;
        ab1 = ad2 < ad3;
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
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    if (fb0) {
        fb1 = !fb0;
        Thought lo0 = Thought196.getInstance(ao3, ao4, fo0, fo1);
        Output.points[6][1] -= fd0;
        boolean lb1 = true;
        double ld2 = 114.48275380464801;
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
    fb0 = fb1 || fb0;
    ad2 = ad3 - ad4;
if(ao1 != null){
      ao1.m3(fd0, fd1, ad1, ad2);
}
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    fb1 = fb0 && fb1;
    fb0 = ad1 < ad2;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    Output.points[6][2] -= ad3;
    ad4 = fd0 - fd1;
    boolean lb1 = true;
    Thought lo2 = Thought142.getInstance();
    ad1 *= -1;
if(ao2 != null){
          ad2 = ao2.m3(lb0, lb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    if (fb1) {
        Thought lo3 = Thought30.getInstance(ad4, fd0, fd1, ad1, lb0, lb1, fb0, fb1);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, lb1, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ao2.m2(ad2, ad3, ad4, fd0);
}
        boolean lb4 = true;
        Thought lo5 = Thought380.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
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
    fd1 *= -1;
    if (ab2) {
        ab3 = !ab4;
if(ao1 != null){
          fd0 = ao1.m3();
}
        boolean lb0 = true;
        } else {
        Thought lo1 = Thought65.getInstance(fb0, fb1, ab1, ab2);
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
          ao1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
        Output.points[6][3] += fd0;
        Thought lo2 = Thought282.getInstance(ao1, ao2, ao3, ao4);
        ab3 = fd1 < fd0;
        fd1 *= -1;
        ab4 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
if(ao1 != null){
          ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        ab2 = ab3 && ab4;
        Thought lo3 = Thought216.getInstance();
if(fo1 != null){
          fo1.m3(fb0, fb1, ab1, ab2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
}
    Output.points[6][4] -= fd1;
    ab2 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    ab3 = ad3 > ad4;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought250.getInstance();
        fd1 *= -1;
if(fo0 != null){
          fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
        fd1 = fd0 + fd1;
        fb0 = !fb1;
        Output.points[6][5] -= fd0;
        double ld1 = 167.3452754209006;
        fd0 *= -1;
        Thought lo2 = Thought129.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        boolean lb3 = true;
        Output.points[6][6] -= fd0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb3, fb0);
}
        Thought lo4 = Thought110.getInstance(fo0, fo1, fo0, fo1);
        fb1 = lb3 || fb0;
        fb1 = fd1 < ld1;
        boolean lb5 = true;
        lb3 = fd0 > fd1;
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
    ab2 = !ab3;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab4 = fb0 && fb1;
    ab1 = fd1 < fd0;
    ab2 = fd1 < fd0;
    fd1 *= -1;
    Output.points[6][7] -= fd0;
    ab3 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 461.1109497096273;
if(fo0 != null){
      fo0.m3(ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = ld0 - fd0;
    fd1 = ld0 - fd0;
    if (ab4) {
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ad4 *= -1;
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    double ld0 = 455.19232206984265;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 739.8085428265979;
    Output.points[6][8] -= ld0;
    fb1 = ld1 > ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld1, ad1);
}
    ad2 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    ld0 = ld1 - ad1;
    fb1 = ad2 > ad3;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
    Thought lo3 = Thought90.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
    fb1 = lb2 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3, fb1, lb2, fb0, fb1);
}
    lb2 = ad4 > fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
    boolean lb4 = true;
    fd1 *= -1;
    ld0 = ld1 - ad1;

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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    lb0 = !ab1;
if(fo0 != null){
      ab2 = fo0.m2(ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought74.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought161.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, lb2, ab1);
    ad1 *= -1;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    lb4 = !ab1;
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3);
}
    ab2 = !ab3;

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
    fb0 = fd0 < fd1;
        fb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
        Thought lo0 = Thought229.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fd1 = fd0 - fd1;
    Output.points[7][0] += fd0;
    fd1 *= -1;
    fb1 = fd0 < fd1;
    Output.points[7][1] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
if(ao4 != null){
          lb0 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
        fb1 = ad3 > ad4;
        lb0 = fb0 && fb1;
        boolean lb1 = false;
        lb0 = lb1 || fb0;
        boolean lb2 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        boolean lb3 = true;
        for(int i1=0; i1<10; i1++){
            Thought lo4 = Thought137.getInstance(fd0, fd1, ad1, ad2);
            ad3 *= -1;
            lb3 = fb0 || fb1;
}}
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
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    Thought lo1 = Thought322.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 920.0524951175753;
        ld2 *= -1;
    boolean lb3 = true;
        double ld4 = 411.86348354171145;
    double ld5 = 393.5897598278938;
    Thought lo6 = Thought59.getInstance(lb0, lb3, ab1, ab2);
    Output.points[7][2] += ld4;
    ab3 = ld5 > fd0;
    fd1 = ld2 - ld4;
    ld5 *= -1;
    ab4 = fb0 || fb1;
    fd0 = fd1 - ld2;
    boolean lb7 = true;
    lb0 = lb3 || lb7;
    boolean lb8 = false;
    Thought lo9 = Thought155.getInstance(ao1, ao2, ao3, ao4, ld4, ld5, fd0, fd1, lb8, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(ld2, ld4, ld5, fd0, ab4, fb0, fb1, lb0);
}
    Thought lo10 = Thought307.getInstance(ao1, ao2, ao3, ao4, lb3, lb7, lb8, ab1);
    ab2 = ab3 && ab4;
    fb0 = fd1 < ld2;
    boolean lb11 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    boolean lb1 = true;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m3();
}
    fd0 = fd1 + ad1;
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb1, lb0, lb1, ab1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 270.75020553404664;
    boolean lb1 = false;
    Output.points[7][3] += ld0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld0;
    lb1 = fb0 && fb1;
    lb1 = fb0 && fb1;
    lb1 = fb0 || fb1;
    Thought lo2 = Thought175.getInstance(fd0, fd1, ld0, fd0);
    fd1 *= -1;
    lb1 = !fb0;
    if (fb1) {
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
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab4 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    boolean lb1 = true;

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
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
    fb1 = fb0 || fb1;
    fd1 = ad1 - ad2;
    fb0 = ad3 < ad4;
    fb1 = fb0 || fb1;
    fd0 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3();
}
    double ld0 = 828.0057054147862;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
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
    Thought lo0 = Thought360.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    double ld1 = 263.79999719711174;
    ad3 = ad4 - fd0;
    if (fb1) {
        Thought lo2 = Thought30.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fb0 = fo1.m2(ld1, ad1, ad2, ad3);
}
        fb1 = ab1 && ab2;
        ab3 = ab4 || fb0;
        fb1 = ad4 < fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo1.m3();
}
        } else {
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
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought127.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
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
    boolean lb0 = false;
    Thought lo1 = Thought104.getInstance(fb0, fb1, lb0, fb0);
    fb1 = ad1 < ad2;
    ad3 = ad4 + fd0;
    boolean lb2 = false;
    double ld3 = 737.7461271373546;
    Thought lo4 = Thought177.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld3, ad1, lb0, lb2, fb0, fb1);
    lb0 = ad2 > ad3;
    Output.points[7][4] -= ad4;
    lb2 = fd0 < fd1;
    fb0 = ld3 < ad1;
    fb1 = ad2 < ad3;
    lb0 = ad4 > fd0;
    boolean lb5 = true;
    fd1 = ld3 + ad1;
    ad2 = ad3 - ad4;
    lb2 = !lb5;
    Thought lo6 = Thought266.getInstance(fd0, fd1, ld3, ad1, fb0, fb1, lb0, lb2);
    lb5 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, lb0, lb2, lb5, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ad2 = ad3 + ad4;
    Thought lo7 = Thought47.getInstance(fd0, fd1, ld3, ad1);
    Thought lo8 = Thought41.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
    fb1 = fd1 < ld3;

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
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab1 = ab2 || ab3;
    Thought lo0 = Thought198.getInstance(ab4, fb0, fb1, ab1);
    ab2 = ab3 && ab4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > fd0;
    ab4 = fb0 && fb1;
    Output.points[7][5] += fd1;
    double ld1 = 26.435043442532653;
    boolean lb2 = true;
    Output.points[7][6] += ld1;
    double ld3 = 595.5171265904528;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ld3 = ao4.m3(fd0, fd1, ld1, ld3, lb2, ab1, ab2, ab3);
}
        }
    Output.points[7][7] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb2);
}
    for(int i1=0; i1<10; i1++){
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        boolean lb5 = false;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld1, ld3, fd0);
}
        boolean lb6 = false;
        double ld7 = 985.4611473407056;
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
    Thought lo0 = Thought152.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    ab2 = fd1 > ad1;
if(fo1 != null){
      fo1.m3();
}
    Thought lo1 = Thought44.getInstance(ab3, ab4, fb0, fb1);
    ad2 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ad1;
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo3 = Thought24.getInstance(ad2, ad3, ad4, fd0);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
    Output.points[7][8] -= fd0;
    lb2 = fd1 > ad1;
if(ao1 != null){
      ao1.m2(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb2, ab1);
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
        boolean lb0 = true;
    fd1 = fd0 - fd1;
    double ld1 = 595.4904018094119;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fd1 = ld1 - fd0;
    double ld2 = 1.7934042784862172;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 && fb0;
    Thought lo3 = Thought205.getInstance(fd0, fd1, ld1, ld2);
    Output.points[8][0] += fd0;
    fb1 = fd1 < ld1;
    lb0 = ld2 < fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
}
    Thought lo4 = Thought202.getInstance();
if(fo0 != null){
      ld1 = fo0.m3(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
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
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    double ld1 = 673.3142659314485;
    double ld2 = 306.65506191033666;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = ld1 < ld2;
    fd0 = fd1 + ld1;
    boolean lb4 = true;
if(fo0 != null){
      fb0 = fo0.m2(ld2, fd0, fd1, ld1);
}
    fb1 = lb0 || lb3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1);
}
    double ld5 = 843.7208180607188;
    Output.points[8][1] -= ld2;
    lb4 = fb0 || fb1;
    Thought lo6 = Thought17.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb3, lb4, fb0);
}
    ld5 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld1, ld2, ld5, fd0, fb1, lb0, lb3, lb4);
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
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought128.getInstance(fo0, fo1, fo0, fo1);
    Output.points[8][2] -= fd1;
    boolean lb2 = true;
    lb0 = lb2 && fb0;
    double ld3 = 802.3852627538744;
    fb1 = lb0 && lb2;
    fb0 = fb1 || lb0;
    double ld4 = 309.2040433043971;
if(fo1 != null){
      fo0 = fo1.m4(ld3, ld4, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld3, ld4, fd0, fd1);
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
}
