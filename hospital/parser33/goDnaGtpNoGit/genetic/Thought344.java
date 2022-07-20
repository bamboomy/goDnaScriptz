package genetic;
import java.util.ArrayList;
class Thought344 extends Thought{
private static ArrayList<Thought344> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 947.9997950187536;
private double fd1 = 278.65305826022404;
private Thought fo0 = null;
private Thought fo1 = null;
Thought344 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought344 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought344 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought344 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought344 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought344 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought344 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought344 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought344 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought344 instance = new Thought344 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought344 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought344 instance = new Thought344 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought344 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought344 instance = new Thought344 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought344 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought344 instance = new Thought344 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought344 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought344 instance = new Thought344 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought344 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought344 instance = new Thought344 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought344 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought344 instance = new Thought344 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought344 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought344 instance = new Thought344 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought269.getInstance(fd1, fd0, fd1, fd0);
    double ld1 = 466.49546176210436;
    double ld2 = 396.2488614826121;
    Output.points[7][7] += ld2;
    fd0 = fd1 - ld1;
    Thought lo3 = Thought248.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1);
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb4 = ld2 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, ld2, fd0, lb4, fb0, fb1, lb4);
}
    Thought lo5 = Thought242.getInstance(fd1, ld1, ld2, fd0, fb0, fb1, lb4, fb0);
    fd1 = ld1 + ld2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb4, fb0, fb1);
}
    fd0 = fd1 - ld1;
    lb4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
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
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
    ab1 = ab2 && ab3;
        ab4 = fd1 > fd0;
    boolean lb0 = true;
    Thought lo1 = Thought302.getInstance();
    Thought lo2 = Thought185.getInstance(ab4, fb0, fb1, lb0);
    double ld3 = 357.33164852340894;

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
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
    Output.points[7][8] += ad4;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    fb0 = fb1 || lb0;
        fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m1();
}
    fb0 = !fb1;
    boolean lb1 = true;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought250.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    boolean lb1 = false;
    Output.points[8][0] -= fd0;
    Output.points[8][1] -= fd1;
if(fo1 != null){
      ad1 = fo1.m3();
}
    ab3 = ab4 || fb0;
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 + fd1;
        ad1 = ad2 - ad3;
    Output.points[8][2] += ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
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
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        fb1 = fd1 > fd0;
if(ao3 != null){
          ao2 = ao3.m4();
}
        boolean lb1 = true;
        Output.points[8][3] -= fd1;
if(fo0 != null){
          ao4 = fo0.m4(lb1, lb0, fb0, fb1);
}
        boolean lb2 = true;
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
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    ad1 = ad2 + ad3;
    if (fb1) {
        ad4 *= -1;
        fd0 *= -1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
if(ao1 != null){
          lb0 = ao1.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
        fb1 = !lb0;
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
    Thought lo0 = Thought160.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fb1 = ab1 && ab2;
    Thought lo1 = Thought36.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    ab3 = !ab4;
    fb0 = fd0 < fd1;
    fb1 = ab1 || ab2;
    boolean lb2 = false;
        ab2 = ab3 && ab4;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2();
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
    ab1 = ab2 && ab3;
    ab4 = ad1 < ad2;
    double ld0 = 171.87452556086566;
    fb0 = ad2 > ad3;
    for(int i0=0; i0<10; i0++){
        double ld1 = 29.180455276266002;
        Output.points[8][4] -= ad3;
if(ao2 != null){
          ao2.m1(fb1, ab1, ab2, ab3);
}
        boolean lb2 = true;
        boolean lb3 = true;
if(ao3 != null){
          ab2 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
        Thought lo4 = Thought392.getInstance(ld0, ad1, ad2, ad3, lb2, lb3, ab1, ab2);
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
    fb0 = fb1 && fb0;
    double ld0 = 776.8242694251367;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[8][5] += fd0;
    fb0 = fb1 && fb0;
    fd1 *= -1;
    double ld1 = 807.8159441632536;
    fb1 = !fb0;
        fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(ld0, ld1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = true;
    ld0 = ld1 + fd0;
    fd1 = ld0 - ld1;
    boolean lb3 = false;
    Thought lo4 = Thought211.getInstance(lb3, fb0, fb1, lb2);

Thought.STACK_COUNTER++;
return lb3;
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
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    ab3 = fd1 < fd0;
    ab4 = !fb0;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 119.62307315814624;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    ld0 = ad1 - ad2;
    Output.points[8][6] += ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ld0);
}
    double ld1 = 942.2266238467179;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      ad4 = fo1.m3();
}
    fb0 = fb1 || fb0;
    fd0 = fd1 - ld0;
if(fo0 != null){
      ld1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb2, fb0);
}
    Output.points[8][7] += fd1;

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
if(fo1 != null){
      ab2 = fo1.m2(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Output.points[8][8] += ad2;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad3 = ad4 + fd0;
if(fo1 != null){
          fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
        ad3 *= -1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ad4 = fd0 + fd1;
        boolean lb0 = false;
        boolean lb1 = false;
        ad1 = ad2 + ad3;
}
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
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
}
    fd1 = fd0 + fd1;
        double ld2 = 885.5557061156375;
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld4 = 440.955357689685;
if(ao4 != null){
      ao3 = ao4.m4(ld2, ld4, fd0, fd1);
}
    double ld5 = 995.6316638786492;

Thought.STACK_COUNTER++;
return lb3;
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
    fb1 = ad1 < ad2;
    Thought lo0 = Thought85.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m3();
}
    Thought lo1 = Thought344.getInstance(fb0, fb1, fb0, fb1);
    fb0 = ad4 > fd0;
    fb1 = fd1 > ad1;
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
    Output.points[0][0] -= ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
    boolean lb2 = true;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;
    fb0 = fb1 || lb2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
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
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && ab1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    ab3 = !ab4;
    Output.points[0][1] -= fd1;
    fb0 = fd0 > fd1;
    double ld0 = 655.8476339673681;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = ld0 > fd0;
    fd1 *= -1;

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
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    Thought lo1 = Thought218.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2);
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
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
        fb1 = fb0 || fb1;
        fb0 = fb1 || fb0;
        Output.points[0][2] += fd1;
        Output.points[0][3] += fd0;
        fd1 *= -1;
        fd0 *= -1;
        fb1 = fd1 > fd0;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought269.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    ab1 = ab2 || ab3;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld1 = 642.956284329725;
    fd0 = fd1 + ld1;
    ab3 = ab4 || fb0;
    fd0 = fd1 + ld1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    Thought lo3 = Thought156.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
    fb0 = ld1 > fd0;

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
      fo0.m3();
}
    fb0 = ad1 < ad2;
    Thought lo0 = Thought64.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    double ld1 = 103.96448515370139;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought387.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
if(fo0 != null){
      fo0.m2();
}
    boolean lb3 = true;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb3, fb0, fb1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    fd1 = ad1 - ad2;
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 || fb1;
        lb0 = ab1 && ab2;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        lb0 = ad1 < ad2;
        ad3 *= -1;
        boolean lb1 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
        }
    fb0 = fb1 && lb0;
    ab1 = ab2 || ab3;
    Thought lo2 = Thought245.getInstance(fo1, fo0, fo1, fo0);
    ad4 = fd0 + fd1;
    Thought lo3 = Thought191.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    Output.points[0][4] += ad3;
    ad4 = fd0 - fd1;
    boolean lb4 = false;
    ab3 = ad1 > ad2;
    Output.points[0][5] += ad3;

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
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao3 != null){
      fd0 = ao3.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb1 = !fb0;
    fb1 = fb0 || fb1;

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
    double ld0 = 312.9735149849199;
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    double ld1 = 178.05877807346536;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld1, ad1);
}
    ad2 = ad3 - ad4;
    fb0 = fb1 && fb0;
    boolean lb2 = false;
    double ld3 = 949.213229172762;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ld0 = ao2.m3();
}
    ld1 = ld3 + ad1;
    Thought lo4 = Thought132.getInstance(fb0, fb1, lb2, fb0);
    fb1 = lb2 || fb0;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, lb2, fb0, fb1);
}
    boolean lb5 = false;
    lb2 = lb5 && fb0;
    ld0 *= -1;
    ld1 = ld3 + ad1;
    boolean lb6 = true;
if(ao3 != null){
          ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb2, lb5);
}
    double ld7 = 947.202936001775;
    fd0 *= -1;
    lb6 = fd1 > ld0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb2, lb5);
}
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb0 = true;
    Thought lo1 = Thought22.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    Thought lo2 = Thought250.getInstance();
    fd0 = fd1 + fd0;
    lb0 = fd1 < fd0;
    boolean lb3 = false;
    lb3 = ab1 || ab2;
    ab3 = !ab4;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(lb0, lb3, ab1, ab2);
}
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb4 = true;
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, lb0, lb3, lb4, ab1);
}
    ab2 = !ab3;
    ab4 = fd1 < fd0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb3);
}
    lb4 = fd1 > fd0;
    Output.points[0][6] -= fd1;
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    double ld5 = 808.6960276774631;
    Thought lo6 = Thought68.getInstance(ao3, ao4, fo0, fo1);

Thought.STACK_COUNTER++;
return ld5;
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
    ad2 *= -1;
    ab1 = ad3 < ad4;
if(ao1 != null){
      ao1.m3(fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    boolean lb1 = false;
    double ld2 = 997.3538078904362;
if(ao2 != null){
          ab3 = ao2.m2();
}
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, lb0, lb1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    double ld0 = 394.8031987016996;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought122.getInstance(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld2 = 770.7041458731013;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 918.120755913297;
if(fo0 != null){
      fb0 = fo0.m2(ld0, ld2, ld3, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ld3);
}
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb4 = fd0 < fd1;
    fb0 = fb1 || lb4;
    ld0 = ld2 - ld3;
    boolean lb5 = false;
if(fo0 != null){
      fo0.m3(lb5, fb0, fb1, lb4);
}
if(fo1 != null){
      lb5 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, fb0, fb1, lb4, lb5);
}
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld0, fb0, fb1, lb4, lb5);
}
    double ld6 = 992.7120466507655;
    ld2 = ld3 - ld6;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb4, lb5);
}
    fd0 = fd1 + ld0;
    ld2 = ld3 + ld6;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld2);
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
    boolean lb0 = true;
    double ld1 = 273.25732719200846;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = ld1 - fd0;
    ab1 = !ab2;
    fd1 = ld1 + fd0;
    fd1 = ld1 - fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, lb2, lb0, ab1);
}
if(fo1 != null){
          ab2 = fo1.m2(ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, lb2, lb0, ab1, ab2);
}
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
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought212.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    fb0 = !fb1;
    boolean lb1 = false;
    double ld2 = 595.6033836802801;
    Output.points[0][7] += ld2;
if(fo0 != null){
      ad1 = fo0.m3();
}
    lb1 = ad2 > ad3;
    ad4 *= -1;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    Output.points[0][8] += fd1;
    lb1 = !fb0;
    double ld3 = 362.55836369690206;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = lb1 || fb0;
if(fo0 != null){
      fo0.m3(ld2, ld3, ad1, ad2);
}
    fb1 = ad3 > ad4;
    lb1 = fd0 < fd1;
    boolean lb4 = false;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ld3, ad1, ad2);
}
    fb0 = fb1 && lb1;
    lb4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2();
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
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    boolean lb1 = false;
    Thought lo2 = Thought128.getInstance(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = ad3 > ad4;
    if (fb1) {
        lb0 = lb1 || ab1;
        ab2 = !ab3;
        ab4 = fd0 < fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
        double ld3 = 640.4763623976305;
        Thought lo4 = Thought367.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ad1);
        fb0 = fb1 && lb0;
        lb1 = ad2 < ad3;
        Output.points[1][0] += ad4;
        for(int i0=0; i0<10; i0++){
            boolean lb5 = false;
            fd0 *= -1;
if(fo0 != null){
              fo1 = fo0.m4();
}
            fd1 = ld3 - ad1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought315.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought103.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo2 = Thought7.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    Output.points[1][1] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb1 = fd0 < fd1;

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
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ad1 *= -1;
    Thought lo0 = Thought12.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fd1 *= -1;
    ad1 *= -1;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb1 = true;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
}
    fd1 *= -1;
    ad1 = ad2 + ad3;
    boolean lb2 = true;
    Output.points[1][2] += ad4;
    lb1 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
    double ld0 = 733.2641894793194;
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
if(ao1 != null){
      ab3 = ao1.m2();
}
    fd1 *= -1;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
    ab4 = fb0 || fb1;
    boolean lb2 = false;
    lb1 = ld0 > fd0;
    fd1 = ld0 - fd0;
    lb2 = !ab1;
    boolean lb3 = false;
    fd1 = ld0 - fd0;
    double ld4 = 698.2598783802101;
if(ao2 != null){
      ao2.m1(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld4, fd0, lb2, lb3, ab1, ab2);
}
    fd1 = ld0 - ld4;
    ab3 = ab4 || fb0;
    boolean lb5 = false;

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
    ab1 = ab2 && ab3;
    Thought lo0 = Thought144.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
    ad1 *= -1;
    Thought lo1 = Thought21.getInstance(fo1, ao1, ao2, ao3);
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
    ab1 = !ab2;
    Thought lo2 = Thought264.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
if(ao4 != null){
      ao4.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = ad2 < ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    ad2 = ad3 - ad4;
    Output.points[1][3] += fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;

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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 710.748261388592;
if(fo0 != null){
      fo0.m1();
}
    ld0 = fd0 + fd1;
    ld0 *= -1;
    fb1 = !fb0;
    fb1 = fd0 < fd1;

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
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Output.points[1][4] -= fd0;
    double ld0 = 24.791413712975274;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld0, fd0);
}
        Thought lo2 = Thought285.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
    ld0 *= -1;
    double ld3 = 669.648311235236;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
    boolean lb4 = true;
    fb0 = ld3 > fd0;
    fd1 = ld0 - ld3;
    double ld5 = 775.2625162976402;
    ld5 = fd0 + fd1;
    Thought lo6 = Thought99.getInstance(fo0, fo1, fo0, fo1, ld0, ld3, ld5, fd0, fb1, lb1, lb4, fb0);
    fb1 = fd1 > ld0;

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
    double ld0 = 690.1676488959403;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
        Thought lo1 = Thought42.getInstance(ld0, fd0, fd1, ld0);
    fd0 = fd1 - ld0;
    Output.points[1][5] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    Output.points[1][6] -= ld0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
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
}
