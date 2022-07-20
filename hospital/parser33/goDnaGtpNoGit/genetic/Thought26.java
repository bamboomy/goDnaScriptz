package genetic;
import java.util.ArrayList;
class Thought26 extends Thought{
private static ArrayList<Thought26> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 88.83523488257171;
private double fd1 = 580.4712418229024;
private Thought fo0 = null;
private Thought fo1 = null;
Thought26 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought26 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought26 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought26 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought26 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought26 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought26 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought26 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought26 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd1 < fd0;
    Thought lo0 = Thought5.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 || fb0;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    Thought lo2 = Thought16.getInstance(fd1, fd0, fd1, fd0);
    boolean lb3 = true;
        boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb3 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb5 = true;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3();
}
    lb4 = fd1 > fd0;
    Thought lo6 = Thought281.getInstance(lb5, fb0, fb1, lb1);
    fd1 = fd0 + fd1;
    Thought lo7 = Thought246.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb3, lb4, lb5, fb0);
    fb1 = lb1 || lb3;
    lb4 = fd0 < fd1;
    lb5 = fb0 || fb1;
    lb1 = lb3 && lb4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb5, fb0, fb1, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, lb4, lb5, fb0);
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
        double ld0 = 481.18447412394215;
    ld0 *= -1;
        ab2 = fd0 < fd1;
    boolean lb1 = true;
    double ld2 = 728.8687412003825;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ld2 = fd0 + fd1;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld0);
}
    ab2 = !ab3;

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
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
    lb1 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    Output.points[1][1] -= ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    lb0 = lb1 || fb0;
    Output.points[1][2] -= ad3;
    fb1 = ad4 > fd0;
    boolean lb2 = false;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo4 = Thought306.getInstance(lb0, lb1, lb2, lb3);

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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    double ld1 = 993.2435950593596;
    boolean lb2 = false;
    ad3 = ad4 - fd0;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ld1;
    Thought lo3 = Thought199.getInstance(fo0, fo1, fo0, fo1);
    boolean lb4 = false;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
    Thought lo5 = Thought349.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);

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
    fb1 = fd0 < fd1;
    fb0 = !fb1;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    lb0 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m2(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + fd0;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
    double ld1 = 396.9551962004478;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    fb1 = ld1 > fd0;
    lb0 = fd1 < ld1;
    Output.points[1][3] -= fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld1, fd0, fd1);
}
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        lb2 = fb0 && fb1;
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
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
    boolean lb0 = false;
    fb0 = ad3 > ad4;
    fb1 = lb0 && fb0;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb2 = false;
if(ao3 != null){
      fd0 = ao3.m3(lb2, fb0, fb1, lb0);
}
    if (lb1) {
        lb2 = fd1 > ad1;
        ad2 = ad3 - ad4;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
        ad3 = ad4 + fd0;
if(ao3 != null){
          ao3.m3(fd1, ad1, ad2, ad3, lb2, fb0, fb1, lb0);
}
        lb1 = lb2 || fb0;
        fb1 = lb0 || lb1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb0);
}
        lb1 = !lb2;
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
    ab2 = !ab3;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
    Output.points[1][4] -= fd1;
    boolean lb0 = false;
    ab3 = ab4 || fb0;
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
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
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb1 = false;
    lb0 = lb1 || ab1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, lb0, lb1, ab1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = ad1 > ad2;
        ad3 = ad4 + fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, lb1, ab1, ab2);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ab3 = fd1 > ad1;
        ab4 = ad2 < ad3;
        fb0 = !fb1;
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
          lb0 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
          lb1 = ao2.m2();
}
        boolean lb2 = true;
if(ao4 != null){
          ao3 = ao4.m4(lb1, ab1, ab2, ab3);
}
        fd1 = ad1 + ad2;
        ad3 = ad4 - fd0;
        ab4 = fd1 < ad1;
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
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    Output.points[1][5] += fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld1 = 778.1436714617324;
    fb1 = lb0 || fb0;
    Thought lo2 = Thought379.getInstance(ld1, fd0, fd1, ld1);
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fd1 < ld1;

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
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        ab1 = ab2 || ab3;
        } else {
        fd1 *= -1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        Output.points[1][6] += fd1;
        fd0 = fd1 + fd0;
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m1(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fb1 = fo0.m2();
}
if(fo1 != null){
          fd1 = fo1.m3(lb0, ab1, ab2, ab3);
}
        Thought lo1 = Thought265.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
        Thought lo2 = Thought28.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
        Thought lo3 = Thought16.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
        fd0 = fd1 - fd0;
if(fo0 != null){
          fd1 = fo0.m3(ab2, ab3, ab4, fb0);
}
        boolean lb4 = true;
        Output.points[1][7] -= fd0;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb4, ab1);
}
        Output.points[1][8] -= fd1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fb0 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    double ld0 = 68.91107224085617;
    Thought lo1 = Thought200.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    fb0 = fb1 && lb2;
    Thought lo3 = Thought24.getInstance(fd0, fd1, ld0, ad1, fb0, fb1, lb2, fb0);
    boolean lb4 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb2, lb4, fb0);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][0] += ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab1 = fd0 > fd1;
    ad1 *= -1;
    boolean lb0 = true;
    ab1 = !ab2;
if(fo1 != null){
      fo1.m2();
}
    ad2 *= -1;
    Thought lo1 = Thought82.getInstance(ab3, ab4, fb0, fb1);
    ad3 = ad4 - fd0;
    lb0 = !ab1;
    double ld2 = 722.4947232418226;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 - ad4;

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
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        Thought lo1 = Thought94.getInstance(fd1, fd0, fd1, fd0);
        }
    boolean lb2 = false;
    boolean lb3 = true;
    double ld4 = 26.432243375369154;
    lb3 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld4, fd0, fd1, ld4);
}
if(ao3 != null){
      fd0 = ao3.m3();
}
    fb0 = fd1 < ld4;
    fb1 = lb0 || lb2;
    for(int i1=0; i1<10; i1++){
        fd0 = fd1 - ld4;
        lb3 = fd0 > fd1;
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, lb0, lb2);
}
        ld4 *= -1;
        lb3 = fd0 < fd1;
        fb0 = ld4 < fd0;
        fd1 *= -1;
        Thought lo5 = Thought66.getInstance(fo1, ao1, ao2, ao3, ld4, fd0, fd1, ld4, fb1, lb0, lb2, lb3);
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ld4, fd0, fb0, fb1, lb0, lb2);
}
}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[2][1] -= ad1;
    ad2 *= -1;
    ad3 *= -1;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
    if (fb0) {
        ad3 = ad4 - fd0;
        fd1 = ad1 + ad2;
        boolean lb0 = true;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
        ad1 *= -1;
if(ao2 != null){
          ao2.m2();
}
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
        for(int i0=0; i0<10; i0++){
}}
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
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ab3 = fd0 > fd1;
    boolean lb1 = false;
    boolean lb2 = true;
    ab2 = fd0 > fd1;
    boolean lb3 = false;
    fd0 = fd1 + fd0;
    ab2 = !ab3;
    boolean lb4 = true;
    fd1 *= -1;
    ab3 = ab4 && fb0;
    fd0 *= -1;

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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ad3 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = ad3 > ad4;
    Thought lo0 = Thought202.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
    double ld1 = 661.2830335196215;
    ad2 *= -1;
if(ao4 != null){
      ab4 = ao4.m2(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb2 = false;
    Output.points[2][2] += ld1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
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
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb0 = fb0 || fb1;
    lb0 = fd1 > fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m1();
}
    double ld1 = 455.0184615908523;
if(fo0 != null){
      fo0.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;
    ld1 = fd0 - fd1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    ab4 = fd0 > fd1;
    fd0 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    double ld1 = 736.3934233528387;
    double ld2 = 281.32016382176533;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = ld2 > fd0;
        ab3 = !ab4;
    double ld3 = 661.4961153040638;
    fb0 = !fb1;
    double ld4 = 509.0824490949626;
if(fo0 != null){
      lb0 = fo0.m2(ld4, fd0, fd1, ld1);
}
    ld2 *= -1;
    ld3 = ld4 + fd0;
    boolean lb5 = false;
    lb5 = ab1 || ab2;
    boolean lb6 = true;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
    fb1 = ad1 > ad2;
    Thought lo0 = Thought334.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    boolean lb1 = true;
    lb1 = !fb0;
        boolean lb2 = true;
if(fo1 != null){
      fo1.m2();
}
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
    fd1 *= -1;
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(lb1, lb2, fb0, fb1);
}
    lb1 = !lb2;
    Thought lo3 = Thought366.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
    boolean lb4 = true;
    boolean lb5 = false;
    Thought lo6 = Thought208.getInstance(fd0, fd1, ad1, ad2, lb4, lb5, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, lb4, lb5);
}
    Output.points[2][3] += ad3;
    fb0 = ad4 > fd0;

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
    ab2 = ab3 && ab4;
    double ld0 = 879.5804294609206;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
    ab2 = ab3 && ab4;
    Output.points[2][4] -= ad2;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ld0 = fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought225.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 + ld0;
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    boolean lb3 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(lb1, lb3, ab1, ab2);
}
    ad4 *= -1;
    ab3 = fd0 > fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    double ld0 = 17.65214316951344;
    fd0 = fd1 - ld0;
    fb1 = fd0 < fd1;
    boolean lb1 = false;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
    double ld3 = 571.8730685246769;
    fb0 = ld3 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, ld3, fd0, fb1, lb1, lb2, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, lb2, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    Output.points[2][5] += ld0;
    Thought lo4 = Thought4.getInstance(ld3, fd0, fd1, ld0);
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld0);
}
        fb1 = lb1 || lb2;
if(ao1 != null){
          ld3 = ao1.m3();
}
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb1, lb2);
}
        double ld5 = 201.2925975873803;
        ld3 = fd0 + fd1;
        fb0 = ld5 > ld0;
        fb1 = lb1 && lb2;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought225.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = !fb1;
    fd0 = fd1 - ad1;
    boolean lb1 = true;
    ad2 *= -1;
    double ld2 = 975.8228137475895;
    ad2 = ad3 - ad4;
    lb1 = !fb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Thought lo0 = Thought26.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        }
if(fo1 != null){
      fo1.m3();
}
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    ab1 = !ab2;
if(ao1 != null){
      ab3 = ao1.m2(ab4, fb0, fb1, lb1);
}
    boolean lb2 = true;
    fd1 = fd0 - fd1;
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld3 = 950.152422685543;
    fb0 = fb1 || lb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 < ad4;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought136.getInstance(ao2, ao3, ao4, fo0);
    fd0 = fd1 - ad1;
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    Output.points[2][6] -= fd1;
    lb1 = ad1 > ad2;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
if(ao1 != null){
      ab1 = ao1.m2();
}
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb1, lb1, ab1, ab2);
}
    ab3 = ad3 > ad4;
    Thought lo2 = Thought393.getInstance(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb1);
    ad3 = ad4 + fd0;
    ab1 = !ab2;
    fd1 *= -1;
    Thought lo3 = Thought40.getInstance(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
    Thought lo4 = Thought255.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    if (fb0) {
        fb1 = !fb0;
        boolean lb0 = true;
        fd1 = fd0 + fd1;
        double ld1 = 270.7302767489089;
if(fo0 != null){
          fo1 = fo0.m4();
}
        Thought lo2 = Thought324.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        ld1 = fd0 - fd1;
        for(int i0=0; i0<10; i0++){
            Thought lo3 = Thought33.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
            }
        Thought lo4 = Thought149.getInstance(fo0, fo1, fo0, fo1);
        double ld5 = 57.37145731340932;
        double ld6 = 507.0997834598353;
        Thought lo7 = Thought230.getInstance(ld1, ld5, ld6, fd0);
        Thought lo8 = Thought62.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ld5, ld6);
if(fo1 != null){
          fo0 = fo1.m4();
}
        double ld9 = 767.7334951697756;
        Output.points[2][7] += ld9;
        fb1 = !lb0;
        fd0 = fd1 + ld1;
        ld5 = ld6 - ld9;
        Thought lo10 = Thought180.getInstance(fb0, fb1, lb0, fb0);
        fb1 = fd0 < fd1;
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
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    double ld1 = 450.57582882764257;
    fb0 = fb1 || lb0;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld2 = 404.13746048165837;
    boolean lb3 = true;
    ld1 *= -1;
    ld2 = fd0 + fd1;
    ld1 = ld2 + fd0;
    Thought lo4 = Thought326.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld2, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1);
}
    ld1 = ld2 - fd0;
if(fo1 != null){
      fd1 = fo1.m3();
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
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    ad1 *= -1;
    boolean lb0 = true;
    fb0 = !fb1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    Output.points[2][8] -= ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld1 = 151.03102908808185;
    ad4 *= -1;
    fd0 = fd1 - ld1;
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    ld1 = ad1 - ad2;
    Output.points[3][0] -= ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = false;
    boolean lb3 = true;

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
    ab1 = !ab2;
    boolean lb0 = false;
    ab2 = ab3 || ab4;
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb0 = ad1 > ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad3 = fo1.m3(ab3, ab4, fb0, fb1);
}
    lb0 = ad4 < fd0;
    fd1 = ad1 - ad2;
    Thought lo1 = Thought261.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
    fd0 *= -1;
    fd1 = ad1 - ad2;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb2 = !ab1;

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
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    double ld0 = 886.3494738991719;
    ld0 *= -1;
    fd0 = fd1 - ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = ld0 - fd0;
    Output.points[3][1] += fd1;
    fb1 = ld0 < fd0;

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
    boolean lb0 = false;
    boolean lb1 = false;
    ad1 *= -1;
if(ao1 != null){
      ao1.m3(lb0, lb1, fb0, fb1);
}
    boolean lb2 = true;
    ad2 *= -1;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb0, lb1, lb2, fb0);
}
    Output.points[3][2] += ad2;
    boolean lb3 = true;
    boolean lb4 = true;

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
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    double ld1 = 160.44794526733537;
    Output.points[3][3] -= ld1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
}
    boolean lb2 = true;

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
    boolean lb0 = true;
    ad1 *= -1;
    if (ab1) {
        boolean lb1 = true;
        ad2 = ad3 + ad4;
if(ao1 != null){
          fd0 = ao1.m3();
}
        Thought lo2 = Thought280.getInstance(ab1, ab2, ab3, ab4);
        boolean lb3 = false;
        ab4 = fd1 > ad1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb3);
}
if(ao2 != null){
          fd1 = ao2.m3(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb1);
}
        fd0 = fd1 + ad1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        ad2 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          ao4 = fo0.m4();
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
    fd0 = fd1 - fd0;
    fd1 *= -1;
            boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
    Thought lo1 = Thought158.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb2 = true;
    lb2 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
    Output.points[3][4] += fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 > fd1;

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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    double ld0 = 38.480389434857216;
    Thought lo1 = Thought393.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ld0 > fd0;
    fb0 = fb1 && fb0;
    fd1 = ld0 - fd0;
    Thought lo2 = Thought259.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld3 = 360.83891709213987;
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, ld3);
}
    fd0 = fd1 - ld0;
    ld3 *= -1;
    boolean lb4 = true;
        boolean lb5 = false;
    fd0 = fd1 - ld0;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0);
}
    lb5 = fb0 || fb1;
    lb4 = ld3 < fd0;

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
    double ld0 = 492.7883637008553;
    fb1 = fb0 || fb1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(lb1, fb0, fb1, lb1);
}
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    ld0 *= -1;
    Output.points[3][5] += fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    Output.points[3][6] -= ld0;
    fb0 = fb1 && lb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    double ld2 = 189.77671916539077;
    fb1 = ld2 < fd0;
    lb1 = fd1 > ld0;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[3][7] += fd0;
    fb0 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld0);
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2);
}
    Output.points[3][8] -= fd0;
    fb1 = lb1 || fb0;

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
