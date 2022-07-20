package genetic;
import java.util.ArrayList;
class Thought383 extends Thought{
private static ArrayList<Thought383> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 69.23867499418274;
private double fd1 = 498.85053828463856;
private Thought fo0 = null;
private Thought fo1 = null;
Thought383 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought383 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought383 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought383 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought383 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought383 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought383 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought383 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought383 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought383 instance = new Thought383 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought383 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought383 instance = new Thought383 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought383 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought383 instance = new Thought383 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought383 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought383 instance = new Thought383 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought383 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought383 instance = new Thought383 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought383 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought383 instance = new Thought383 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought383 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought383 instance = new Thought383 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought383 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought383 instance = new Thought383 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    double ld1 = 398.57163337342723;
    Output.points[3][6] += ld1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4();
}
    fb0 = fd0 > fd1;
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
    double ld2 = 452.4140301554745;
    ld1 *= -1;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1, lb3, fb0, fb1, lb0);
}
    lb3 = fb0 && fb1;
    Thought lo4 = Thought12.getInstance(ld2, fd0, fd1, ld1, lb0, lb3, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb3, fb0, fb1);
}
    lb0 = ld2 < fd0;
    lb3 = fb0 || fb1;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    Output.points[3][7] += fd1;
    boolean lb2 = true;
    Thought lo3 = Thought140.getInstance(lb0, lb1, lb2, ab1);
    Thought lo4 = Thought319.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);

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
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Output.points[3][8] -= ad1;
    ad2 *= -1;
    Output.points[4][0] += ad3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;

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
      fo0.m2(ad2, ad3, ad4, fd0);
}
    Output.points[4][1] += fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ad3 > ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            ad3 *= -1;
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
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    fd1 *= -1;
    Output.points[4][2] += fd0;
    fd1 = fd0 + fd1;
    if (fb1) {
if(ao3 != null){
          fd0 = ao3.m3(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
        fd1 = fd0 - fd1;
        fd0 *= -1;
        boolean lb2 = false;
        Thought lo3 = Thought85.getInstance(ao4, fo0, fo1, ao1, lb2, lb0, lb1, fb0);
        Output.points[4][3] += fd1;
        fb1 = fd0 < fd1;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
        double ld4 = 980.6177466666071;
        Thought lo5 = Thought169.getInstance(fd0, fd1, ld4, fd0);
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
    boolean lb0 = true;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3();
}
    fd0 *= -1;
if(ao1 != null){
      ao1.m1(lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
    ad1 *= -1;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
}
    Output.points[4][4] -= fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    lb0 = ad1 > ad2;
    lb1 = fb0 || fb1;
    ad3 = ad4 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fd1 = ao3.m3(ad1, ad2, ad3, ad4);
}
    lb0 = !lb1;
    fd0 = fd1 - ad1;
    fb0 = ad2 < ad3;
    fb1 = ad4 > fd0;
    boolean lb2 = false;
    Thought lo3 = Thought179.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);

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
    ab1 = fd1 > fd0;
if(ao2 != null){
      ao2.m2();
}
    Thought lo0 = Thought136.getInstance(ab2, ab3, ab4, fb0);
    Output.points[4][5] -= fd1;
    fb1 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fb0 = ao3.m2(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo2 = Thought322.getInstance(fd0, fd1, fd0, fd1);
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;

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
    ad2 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m3(ab1, ab2, ab3, ab4);
}
        ad1 = ad2 + ad3;
        fb0 = ad4 > fd0;
        boolean lb0 = true;
        Thought lo1 = Thought111.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, ab1, ab2);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb1 = !fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, lb1);
}
    double ld3 = 549.1388587841726;
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld3, fd0, fd1, lb1, lb2, fb0, fb1);
}
    lb0 = lb1 && lb2;
    if (fb0) {
        fb1 = !lb0;
        lb1 = lb2 || fb0;
        double ld4 = 352.8559797811843;
        fb1 = !lb0;
        Output.points[4][6] += ld4;
        ld3 = fd0 + fd1;
        ld4 = ld3 + fd0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
        Thought lo5 = Thought56.getInstance(fo0, fo1, fo0, fo1);
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
    ab2 = fd0 > fd1;
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab3 = fd1 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 170.62910550684833;
    ld0 = fd0 + fd1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    boolean lb0 = false;
    ad1 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
    Output.points[4][7] -= ad2;
    fb1 = ad3 < ad4;
    Output.points[4][8] += fd0;
    double ld1 = 159.33058472903755;
    fd0 *= -1;
    fd1 = ld1 + ad1;
    boolean lb2 = true;
    ad2 *= -1;
    if (lb0) {
        Thought lo3 = Thought323.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb0);
        } else {
if(fo1 != null){
          ld1 = fo1.m3(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ld1, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
}
        Thought lo4 = Thought244.getInstance();
        ad4 *= -1;
}
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
    double ld0 = 775.515881822927;
if(fo0 != null){
      ad1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    double ld1 = 864.062897011225;
    double ld2 = 946.6416566768362;
    double ld3 = 852.7487829709727;
    fb0 = !fb1;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld2, ld3, ad1, ad2, lb4, ab1, ab2, ab3);
}
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb6 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb4, lb5, lb6, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ld0 < ld1;
    ab3 = ab4 && fb0;
    ld2 = ld3 + ad1;
    fb1 = ad2 > ad3;
    Thought lo7 = Thought109.getInstance(ad4, fd0, fd1, ld0);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    boolean lb0 = false;
    fb0 = fd0 < fd1;
    fb1 = lb0 && fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || fb0;
if(ao1 != null){
      fb1 = ao1.m2();
}
    lb0 = fd0 > fd1;
    boolean lb1 = false;
    Thought lo2 = Thought193.getInstance(lb1, fb0, fb1, lb0);

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
    fb0 = fb1 && fb0;
    double ld0 = 852.894000484439;
    fb1 = ld0 > ad1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Output.points[5][0] += ad4;
    Thought lo1 = Thought218.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    fd0 = fd1 + ld0;
    fb0 = ad1 < ad2;
    ad3 *= -1;
    if (fb1) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m2(ad4, fd0, fd1, ld0);
}
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
        boolean lb2 = false;
        fd1 *= -1;
        boolean lb3 = false;
if(ao2 != null){
          ao1 = ao2.m4();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought197.getInstance(ab1, ab2, ab3, ab4);
    fd0 *= -1;
    double ld2 = 895.2224503271502;
    fd0 = fd1 + ld2;
    fd0 = fd1 - ld2;
    fd0 = fd1 - ld2;
    fb0 = !fb1;
    lb0 = ab1 && ab2;
    ab3 = fd0 > fd1;
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, lb0, ab1, ab2, ab3);
}
    boolean lb3 = true;
    Thought lo4 = Thought387.getInstance(fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
    fd1 = ld2 + fd0;
    Thought lo5 = Thought32.getInstance(ao1, ao2, ao3, ao4, lb0, lb3, ab1, ab2);
    ab3 = ab4 && fb0;
    Thought lo6 = Thought71.getInstance(fo0, fo1, ao1, ao2);
    boolean lb7 = false;
if(ao3 != null){
      ao3.m1(fd1, ld2, fd0, fd1);
}
    double ld8 = 393.7508357210021;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ld2, ld8, fd0, fd1);
}
    if (fb0) {
        fb1 = ld2 > ld8;
if(ao3 != null){
          ao3.m1();
}
        lb0 = lb3 && lb7;
if(fo0 != null){
          ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
        fb0 = fd0 > fd1;
        boolean lb9 = false;
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
    ab1 = !ab2;
    ad1 *= -1;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought54.getInstance(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
    boolean lb1 = false;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;

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
    Output.points[5][1] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 502.6893998480424;
        fd0 *= -1;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
        } else {
if(fo0 != null){
          fb1 = fo0.m2(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 + ld0;
        fd0 = fd1 + ld0;
        Thought lo1 = Thought321.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        Thought lo2 = Thought342.getInstance(fd1, ld0, fd0, fd1);
        fb0 = ld0 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
        fb1 = ld0 > fd0;
if(fo0 != null){
                  fb0 = fo0.m2();
}
        fb1 = fb0 || fb1;
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
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    if (ab3) {
        boolean lb0 = false;
        ab3 = ab4 && fb0;
        boolean lb1 = false;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
        ab1 = !ab2;
        Output.points[5][2] -= fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        double ld2 = 245.03074445266378;
        lb0 = ld2 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 336.0690373764723;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 = ld0 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    double ld1 = 536.759543942427;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 926.8295550244758;
    boolean lb1 = true;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab1 = !ab2;
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1);
}
    ab3 = ab4 && fb0;
    fb1 = lb1 && ab1;
    ab2 = ld0 < ad1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    ab3 = fd1 > ld0;
    double ld2 = 347.1953559376158;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}
    ab4 = ad4 > fd0;

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
if(ao1 != null){
      ao1.m2();
}
    fb1 = fb0 && fb1;
    fd0 *= -1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought156.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    double ld1 = 352.5473457038035;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld1 = fd0 + fd1;
    Thought lo2 = Thought12.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ld1 = fd0 + fd1;
    boolean lb3 = false;
    boolean lb4 = true;
    Thought lo5 = Thought299.getInstance(ld1, fd0, fd1, ld1);
    lb4 = fd0 < fd1;
    boolean lb6 = false;
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
    lb6 = ld1 < fd0;
    fd1 *= -1;

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
    fb1 = ad2 > ad3;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    double ld0 = 748.6770339323973;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld1 = 997.6879434857245;
    boolean lb2 = true;
    fb0 = !fb1;
    ld1 = ad1 - ad2;
if(ao3 != null){
      ao3.m3(lb2, fb0, fb1, lb2);
}
    ad3 = ad4 + fd0;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, ld1, ad1, fb1, lb2, fb0, fb1);
}
    lb2 = !fb0;
    fb1 = ad2 > ad3;
    lb2 = fb0 && fb1;
    lb2 = !fb0;
    boolean lb3 = true;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld0, fb0, fb1, lb2, lb3);
}
    fb0 = !fb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    double ld0 = 819.4274870171593;
    fb1 = fd0 > fd1;
    ld0 = fd0 + fd1;
    double ld1 = 269.4164884287917;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m3(ld0, ld1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, ld1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3();
}
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld0, ld1, fd0, fd1, fb0, fb1, lb2, ab1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ad1;
    ab1 = !ab2;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    ad1 = ad2 + ad3;
    boolean lb1 = true;
    ad4 = fd0 - fd1;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
    ab2 = fd0 < fd1;
    Output.points[5][3] -= ad1;
    Thought lo3 = Thought157.getInstance();
    if (ab3) {
        ad2 *= -1;
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
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        fd1 *= -1;

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
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    Output.points[5][4] -= fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld1 = 266.4792991615509;
    Thought lo2 = Thought95.getInstance();
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
    ld1 = fd0 - fd1;

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
    fb1 = fb0 && fb1;
    double ld0 = 213.90657813205533;
    Thought lo1 = Thought356.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        Thought lo2 = Thought359.getInstance(fo0, fo1, fo0, fo1);
    ad2 = ad3 + ad4;
    boolean lb3 = false;
    fd0 = fd1 + ld0;
    boolean lb4 = true;
    double ld5 = 435.4126655997408;
    boolean lb6 = true;
    ld5 = ad1 - ad2;
    lb4 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld5);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld7 = 926.3738836730944;
if(fo0 != null){
      lb6 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb3, lb4);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld5, lb6, fb0, fb1, lb3);
}
    lb4 = lb6 && fb0;
    if (fb1) {
if(fo0 != null){
          lb3 = fo0.m2(ld7, ad1, ad2, ad3, lb4, lb6, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, lb4, lb6, fb0);
}
        ad4 = fd0 + fd1;
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
    Output.points[5][5] += ad1;
    Thought lo0 = Thought111.getInstance(fo0, fo1, fo0, fo1);
    ab1 = ad2 > ad3;
    ad4 *= -1;
    fd0 *= -1;
    Thought lo1 = Thought288.getInstance(fd1, ad1, ad2, ad3);
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ab3 = ab4 && fb0;
    fb1 = ad2 < ad3;
    ad4 = fd0 + fd1;
    boolean lb2 = true;
    boolean lb3 = false;
    Thought lo4 = Thought70.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb3, ab1, ab2);
}
    ad1 *= -1;
    ab3 = ab4 || fb0;
    fb1 = lb2 || lb3;
    double ld5 = 404.8585533041553;
    Output.points[5][6] -= ad1;
    ab1 = ad2 < ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld5, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    if (fb1) {
if(fo0 != null){
          fo0.m2(ad4, fd0, fd1, ld5, lb2, lb3, ab1, ab2);
}
        Output.points[5][7] += ad1;
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
        lb3 = !ab1;
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
    Thought lo0 = Thought280.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld1 = 572.5764436626298;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    double ld2 = 717.178456100136;
    Output.points[5][8] -= ld1;
    fb0 = fb1 && fb0;
    boolean lb3 = false;
    fb0 = fb1 && lb3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought18.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    Thought lo1 = Thought280.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    ad1 = ad2 + ad3;
    fb0 = !fb1;
    fb0 = !fb1;
if(ao2 != null){
      ao2.m1(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m1(ad2, ad3, ad4, fd0);
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
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    double ld2 = 354.2714265768798;
    ld2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0);
}
    fd1 *= -1;
    lb0 = lb1 && ab1;
    boolean lb3 = true;
    ab1 = ld2 < fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld2, fd0, fd1, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2, ab4, fb0, fb1, lb0);
}
    lb1 = !lb3;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ld2;
    boolean lb4 = false;
    Output.points[6][0] += fd0;
    fb0 = fb1 || lb0;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        boolean lb1 = true;
        Thought lo2 = Thought234.getInstance(ad4, fd0, fd1, ad1);
        lb1 = ab1 || ab2;
        ab3 = ab4 && fb0;
        fb1 = ad2 > ad3;
        ad4 = fd0 + fd1;
        Thought lo3 = Thought70.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
if(fo0 != null){
          fo0.m3();
}
        fd0 = fd1 - ad1;
        ad2 = ad3 + ad4;
        double ld4 = 639.2087560921635;
        Thought lo5 = Thought26.getInstance(lb0, lb1, ab1, ab2);
        ab3 = ab4 || fb0;
if(fo1 != null){
          ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld4, ad1, fb1, lb0, lb1, ab1);
}
        Thought lo6 = Thought25.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
        Thought lo7 = Thought345.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, lb1, ab1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought42.getInstance(fd0, fd1, fd0, fd1);
    boolean lb2 = false;
    fd0 = fd1 - fd0;
    Thought lo3 = Thought285.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m2();
}
    fd1 *= -1;
    lb2 = fb0 && fb1;
    fd0 *= -1;
    Thought lo4 = Thought152.getInstance(lb0, lb2, fb0, fb1);

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
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    boolean lb2 = false;
    fd0 = fd1 + fd0;
    Output.points[6][1] += fd1;
    lb0 = lb1 || lb2;
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb0;
        fd1 = fd0 - fd1;
    lb1 = lb2 && fb0;
    double ld3 = 758.2512030693605;
    ld3 = fd0 + fd1;
    Thought lo4 = Thought86.getInstance(ld3, fd0, fd1, ld3);

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
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[6][2] += fd1;
    boolean lb0 = false;
    Output.points[6][3] += fd0;
    Output.points[6][4] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought85.getInstance(fb1, lb0, fb0, fb1);
    lb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
    lb0 = !fb0;

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
