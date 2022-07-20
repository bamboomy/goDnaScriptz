package genetic;
import java.util.ArrayList;
class Thought281 extends Thought{
private static ArrayList<Thought281> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 33.68554412480138;
private double fd1 = 430.8751535227502;
private Thought fo0 = null;
private Thought fo1 = null;
Thought281 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought281 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought281 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought281 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought281 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought281 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought281 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought281 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought281 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought281 instance = new Thought281 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought281 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought281 instance = new Thought281 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought281 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought281 instance = new Thought281 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought281 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought281 instance = new Thought281 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought281 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought281 instance = new Thought281 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought281 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought281 instance = new Thought281 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought281 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought281 instance = new Thought281 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought281 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought281 instance = new Thought281 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
        if (lb0) {
            Thought lo1 = Thought381.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
            Thought lo2 = Thought239.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
            fb0 = fd1 > fd0;
if(fo0 != null){
              fo0.m1();
}
if(fo1 != null){
              fd1 = fo1.m3(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
            fd0 *= -1;
if(fo0 != null){
              fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
            lb0 = fb0 || fb1;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        fb1 = fd1 > fd0;
        boolean lb0 = false;
        lb0 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ab1 = fd1 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        ab2 = ab3 && ab4;
        double ld1 = 548.8934528530983;
        fd0 = fd1 + ld1;
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[4][5] += fd1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      ad1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought374.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > ad1;
        ad2 *= -1;
    Thought lo1 = Thought148.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    boolean lb2 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
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
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    boolean lb1 = true;
    Thought lo2 = Thought23.getInstance(fo1, fo0, fo1, fo0);
    fd1 = ad1 + ad2;
    boolean lb3 = false;

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
    double ld0 = 284.567530546301;
    fb0 = ld0 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
        for(int i0=0; i0<10; i0++){
        double ld1 = 784.8533495891876;
        fb1 = fb0 && fb1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ld0);
}
        fd0 = fd1 + ld1;
        fb0 = fb1 && fb0;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
        boolean lb2 = true;
        fb0 = fb1 || lb2;
        ld0 = fd0 + fd1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
}
        fb1 = ld1 > ld0;
if(fo1 != null){
          fo1.m1(fd0, fd1, ld1, ld0, lb2, fb0, fb1, lb2);
}
        fb0 = !fb1;
if(ao1 != null){
          lb2 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb2, fb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    Output.points[4][6] -= ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    double ld0 = 415.6578324432224;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    ld0 = ad1 + ad2;
    ad3 = ad4 + fd0;
    fd1 = ld0 - ad1;
    Output.points[4][7] -= ad2;
    fb1 = fb0 || fb1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        Output.points[4][8] += fd1;
if(ao1 != null){
          fd0 = ao1.m3();
}
        fd1 = fd0 + fd1;
if(ao2 != null){
          fd0 = ao2.m3(ab1, ab2, ab3, ab4);
}
        fb0 = fd1 < fd0;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
        Thought lo0 = Thought274.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        fd1 = fd0 - fd1;
        double ld1 = 284.03266338824506;
        fb1 = ab1 || ab2;
        Output.points[5][0] -= ld1;
        boolean lb2 = true;
        ab2 = ab3 || ab4;
        Thought lo3 = Thought380.getInstance(fd0, fd1, ld1, fd0);
        fd1 = ld1 - fd0;
        fb0 = fd1 > ld1;
        fd0 *= -1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][1] -= ad1;
    ad2 *= -1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought131.getInstance(ab2, ab3, ab4, fb0);
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        fd0 *= -1;
        Thought lo1 = Thought314.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
        ab3 = !ab4;
        ad4 *= -1;
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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb1 = !lb0;
if(fo0 != null){
          fo0.m1();
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, fb0);
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    Output.points[5][2] -= fd1;
    fb0 = fb1 && ab1;
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        double ld0 = 549.2616612342957;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ld0 > fd0;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && lb0;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    fd1 = ad1 + ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    lb1 = ad4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3();
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
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ad1 *= -1;
    ab2 = ad2 > ad3;
        boolean lb0 = true;
    ad4 = fd0 - fd1;
    Thought lo1 = Thought215.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    Thought lo2 = Thought63.getInstance(fd0, fd1, ad1, ad2, fb1, lb0, ab1, ab2);
    boolean lb3 = true;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || lb3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Thought lo0 = Thought95.getInstance(ao1, ao2, ao3, ao4);
    double ld1 = 210.23247065869992;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0);
}
    fb1 = fd1 > ld1;
    fd0 = fd1 + ld1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    Thought lo2 = Thought265.getInstance(fb1, fb0, fb1, fb0);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    Output.points[5][3] -= fd0;
    fd1 = ld1 + fd0;
    Thought lo3 = Thought169.getInstance(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld4 = 285.85280689486245;

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
    ad1 *= -1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    double ld0 = 290.7610057269801;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = ad4 < fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ad1, ad2, ad3);
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
    Output.points[5][4] -= fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Output.points[5][5] -= fd1;
    Thought lo0 = Thought398.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought347.getInstance();
    double ld2 = 139.55241244299455;
    ld2 = fd0 - fd1;
if(fo1 != null){
      ld2 = fo1.m3(ab2, ab3, ab4, fb0);
}
    boolean lb3 = false;

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
    ad2 = ad3 + ad4;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    double ld0 = 904.5812711371992;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
    ld0 = ad1 - ad2;
    ab3 = ab4 || fb0;
    fb1 = ad3 > ad4;
    lb1 = !ab1;
    fd0 = fd1 - ld0;
    ab2 = ad1 > ad2;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Output.points[5][6] += fd1;
    ld0 = ad1 + ad2;
    for(int i0=0; i0<10; i0++){
        double ld2 = 695.9566623657495;
        lb1 = !ab1;
        }
    ad3 = ad4 + fd0;

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
    Thought lo0 = Thought355.getInstance(fd0, fd1, fd0, fd1);
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    double ld2 = 154.7934907844959;
    boolean lb3 = false;
    lb3 = fb0 || fb1;
    lb1 = lb3 && fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb1, lb3, fb0);
}
    Output.points[5][7] -= ld2;
    fb1 = fd0 < fd1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, lb1, lb3, fb0, fb1);
}
    lb1 = fd1 > ld2;
    Output.points[5][8] -= fd0;
    double ld4 = 580.3226464233068;
    lb3 = fb0 && fb1;
    lb1 = !lb3;
    fb0 = fd0 > fd1;
    ld2 = ld4 + fd0;
    fb1 = fd1 > ld2;
if(fo1 != null){
      fo1.m1(ld4, fd0, fd1, ld2, lb1, lb3, fb0, fb1);
}
    lb1 = !lb3;
    Thought lo5 = Thought380.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb3);
    ld4 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 786.8740902144182;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    Output.points[6][0] -= ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, lb1, ab1, ab2);
}
    fd1 = ld0 + fd0;
    Thought lo2 = Thought15.getInstance(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
    if (lb1) {
        ld0 = fd0 + fd1;
        ab1 = ld0 < fd0;
        double ld3 = 762.7821399021902;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        boolean lb4 = true;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        double ld5 = 362.8289850439584;
        boolean lb6 = true;
        fb0 = ld0 > fd0;
        fd1 = ld3 + ld5;
        ld0 *= -1;
        fb1 = fd0 < fd1;
        lb4 = lb6 && lb1;
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
    for(int i0=0; i0<10; i0++){
        double ld0 = 907.2962261357637;
        double ld1 = 707.3099300649478;
if(fo0 != null){
          ld1 = fo0.m3(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 + ld0;
        ld1 *= -1;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        Output.points[6][1] += fd1;
        fb1 = fb0 || fb1;
        boolean lb2 = false;
if(fo0 != null){
          fo0.m1();
}
if(fo0 != null){
          fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m3();
}
    Thought lo0 = Thought55.getInstance(fb1, ab1, ab2, ab3);
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought69.getInstance(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb2, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought82.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    ab4 = !fb0;
if(fo0 != null){
      fo0.m2();
}
    fb1 = ad3 > ad4;

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
    Thought lo0 = Thought175.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    Thought lo2 = Thought386.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
    boolean lb3 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb1);
}
    boolean lb4 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb3, lb4, fb0, fb1);
}
    Output.points[6][2] += fd0;
    lb1 = fd1 > fd0;
    lb3 = lb4 || fb0;
        fb1 = !lb1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    lb3 = lb4 && fb0;
if(ao2 != null){
      ao2.m2();
}
    boolean lb5 = false;
    fb0 = fb1 || lb1;

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
    double ld0 = 115.04196947759355;
    boolean lb1 = false;
if(ao1 != null){
      ld0 = ao1.m3(fb0, fb1, lb1, fb0);
}
        fb1 = lb1 && fb0;
    double ld2 = 200.1250730365589;
    fb1 = ld2 < ad1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
if(ao1 != null){
      ao1.m2(fd1, ld0, ld2, ad1, fb0, fb1, lb1, fb0);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, fb1, lb1, fb0, fb1);
}
    boolean lb3 = true;
    lb1 = !lb3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ld0);
}
    ld2 = ad1 - ad2;
    boolean lb4 = true;
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ld2, ad1);
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
    fd0 *= -1;
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      ab1 = ao3.m2(ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = fd0 > fd1;
    boolean lb0 = false;
    lb0 = ab1 && ab2;
    fd0 *= -1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      lb0 = ao3.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    double ld1 = 67.29470622799431;
    fb0 = fb1 && lb0;
    ab1 = ld1 > fd0;
    fd1 = ld1 + fd0;
    fd1 *= -1;
    double ld2 = 9.24286417633164;
    ab2 = ld1 > ld2;
    ab3 = ab4 || fb0;
    fd0 = fd1 - ld1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ab4 = !fb0;
if(ao2 != null){
      ad3 = ao2.m3();
}
    double ld1 = 265.01685527380243;
if(ao3 != null){
      ad3 = ao3.m3(fb1, lb0, ab1, ab2);
}
    ad4 = fd0 + fd1;
    ab3 = ab4 && fb0;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    Thought lo0 = Thought326.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    double ld1 = 653.5014292951374;
    ld1 *= -1;
    fd0 *= -1;
    Thought lo2 = Thought374.getInstance(fo1, fo0, fo1, fo0);
    boolean lb3 = true;
    fb0 = fd1 < ld1;
    fd0 = fd1 - ld1;
    fd0 = fd1 - ld1;
    boolean lb4 = true;
    fb0 = !fb1;
    Thought lo5 = Thought32.getInstance(fd0, fd1, ld1, fd0);
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    lb4 = fb0 && fb1;
    lb3 = lb4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = lb3 && lb4;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb3, lb4);
}
    Thought lo6 = Thought241.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb0, fb1, lb3, lb4);
if(fo1 != null){
      fo1.m3(fd0, fd1, ld1, fd0, fb0, fb1, lb3, lb4);
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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ab2 && ab3;
    fd1 = fd0 + fd1;
    ab4 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    ab1 = !ab2;
    double ld0 = 779.9095353688755;
    boolean lb1 = false;
    boolean lb2 = true;
    ab1 = ab2 || ab3;
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ab4 = ld0 > fd0;
    boolean lb3 = false;
    fd1 = ld0 + fd0;
    ab4 = !fb0;
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
    boolean lb4 = false;

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
      ad1 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought76.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    Output.points[6][3] += fd1;
    ad1 = ad2 - ad3;
        fb1 = fb0 && fb1;
    ad4 = fd0 + fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
    fb1 = !fb0;
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = false;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad1 = fo0.m3(lb1, lb2, lb3, fb0);
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
        ab1 = ad2 > ad3;
    ad4 *= -1;
    double ld0 = 952.9588616330665;
    double ld1 = 179.75786620143768;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ld0 < ld1;
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || ab1;
        double ld2 = 814.4241571176763;
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fd1 = ld2 - ld0;
        fb1 = ab1 && ab2;
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
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = fd1 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[6][4] += fd0;
    Output.points[6][5] += fd1;
if(fo1 != null){
      fb1 = fo1.m2();
}
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought145.getInstance(lb0, fb0, fb1, lb0);
        Output.points[6][6] += fd0;
        boolean lb2 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb2);
}
if(ao1 != null){
          lb0 = ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb2, lb0);
}
        Output.points[6][7] += fd1;
        fb0 = fd0 > fd1;
        fd0 = fd1 - fd0;
        fd1 *= -1;
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
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    Output.points[6][8] -= ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    ad2 = ad3 - ad4;
        fb0 = !fb1;
    double ld1 = 95.89916473775328;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld1);
}
    Thought lo2 = Thought179.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
if(ao1 != null){
      ao1.m1();
}
    lb0 = fd0 < fd1;
    fb0 = ld1 > ad1;
    ad2 *= -1;
if(ao2 != null){
      ad3 = ao2.m3(fb1, lb0, fb0, fb1);
}
    ad4 = fd0 + fd1;

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
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    Thought lo0 = Thought129.getInstance(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
    Thought lo1 = Thought21.getInstance(ao1, ao2, ao3, ao4);
    Thought lo2 = Thought75.getInstance(fd1, fd0, fd1, fd0);
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought342.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
    boolean lb4 = false;
    ab2 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb4 = fd0 > fd1;
    double ld5 = 495.57356258518786;
    boolean lb6 = false;
    lb6 = ab1 && ab2;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb7 = true;
if(ao2 != null){
      ao1 = ao2.m4(ld5, fd0, fd1, ld5);
}
    lb4 = fd0 < fd1;
    ld5 = fd0 - fd1;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    ab2 = !ab3;
    if (ab4) {
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          fd0 = ao4.m3(fb0, fb1, ab1, ab2);
}
        Thought lo0 = Thought293.getInstance(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
if(ao4 != null){
          ao3 = ao4.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
        for(int i0=0; i0<10; i0++){
            Thought lo1 = Thought389.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
            ab3 = ab4 && fb0;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
            Thought lo2 = Thought362.getInstance(ad2, ad3, ad4, fd0);
if(ao3 != null){
              ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
            ad4 *= -1;
            fb1 = ab1 && ab2;
            fd0 = fd1 - ad1;
if(ao3 != null){
              ao2 = ao3.m4();
}
}}
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
      fo0.m1(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    double ld0 = 930.6486397519249;
    double ld1 = 420.4810594663961;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3(ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fb0 = !fb1;
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 || fb1;
        boolean lb2 = true;
    lb2 = fb0 && fb1;
    boolean lb3 = false;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb3, lb4, fb0);
}
    double ld5 = 645.4292176515479;
    ld0 = ld1 + ld5;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb1, lb2, lb3, lb4);
}
    double ld6 = 947.5473693391338;
    double ld7 = 659.3954396567433;
    boolean lb8 = true;

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
    Thought lo0 = Thought125.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    Output.points[7][0] += fd0;
    fb1 = fb0 && fb1;
    fd1 *= -1;
    double ld1 = 699.7815205846175;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
    double ld3 = 238.23904249999683;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    lb2 = ld1 < ld3;
    boolean lb4 = true;
    boolean lb5 = true;
    fd0 *= -1;
    double ld6 = 686.0670387769411;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, ld3, ld6);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld3);
}
    ld6 = fd0 - fd1;

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
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    boolean lb0 = false;
        double ld1 = 521.1307972274286;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    double ld2 = 742.6523889685931;
    lb0 = ld2 > fd0;
    Thought lo3 = Thought40.getInstance(fd1, ld1, ld2, fd0, fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
    fb1 = !lb0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    fd1 = ld1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb4 = true;
    boolean lb5 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, ld2, fd0);
}
    boolean lb6 = true;
    fd1 = ld1 - ld2;
    fd0 = fd1 - ld1;
    boolean lb7 = false;
    ld2 = fd0 - fd1;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1);
}
    Thought lo8 = Thought390.getInstance();
if(fo0 != null){
      lb0 = fo0.m2(lb4, lb5, lb6, lb7);
}
    boolean lb9 = true;
    ld2 *= -1;

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
