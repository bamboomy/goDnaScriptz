package genetic;
import java.util.ArrayList;
class Thought236 extends Thought{
private static ArrayList<Thought236> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 993.949145446601;
private double fd1 = 335.95107759689387;
private Thought fo0 = null;
private Thought fo1 = null;
Thought236 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought236 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought236 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought236 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought236 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought236 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought236 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought236 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought236 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought236 instance = new Thought236 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought236 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought236 instance = new Thought236 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought236 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought236 instance = new Thought236 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought236 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought236 instance = new Thought236 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought236 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought236 instance = new Thought236 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought236 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought236 instance = new Thought236 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought236 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought236 instance = new Thought236 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought236 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought236 instance = new Thought236 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought202.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 122.85202631209292;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
        Thought lo2 = Thought52.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    boolean lb3 = false;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld1;
    fb0 = !fb1;
    boolean lb4 = true;
    fd0 = fd1 + ld1;
    lb3 = lb4 || fb0;
    fd0 = fd1 + ld1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
    fd1 = ld1 + fd0;
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb3, lb4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, lb5, fb0, fb1, lb3);
}
    lb4 = lb5 || fb0;

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
    Output.points[2][3] += fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        double ld0 = 367.91346212370706;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ld0 = fd0 + fd1;
        Thought lo1 = Thought66.getInstance(ld0, fd0, fd1, ld0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
        Output.points[2][4] += fd1;
        if (ab4) {
            fb0 = ld0 < fd0;
            fd1 = ld0 - fd0;
            fb1 = !ab1;
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
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
if(fo1 != null){
          ad1 = fo1.m3();
}
        lb0 = ad2 > ad3;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
        ad2 = ad3 + ad4;
        lb0 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad3 = ad4 - fd0;
        }
    fd1 = ad1 + ad2;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
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
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought341.getInstance();
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ab1 = ad1 < ad2;
    boolean lb1 = true;
    ab1 = ad3 < ad4;
    ab2 = fd0 < fd1;

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
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
        double ld0 = 269.42832057410516;
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought296.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb0 = fb1 || fb0;
    Output.points[2][5] += ld0;
if(ao1 != null){
      ao1.m2(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    double ld2 = 805.1903126300243;
    ld0 = ld2 - fd0;
    fb0 = fd1 > ld0;

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
    double ld0 = 459.23850691340016;
    fb1 = fb0 || fb1;
    ad1 = ad2 - ad3;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb1 = true;
if(ao2 != null){
      lb1 = ao2.m2(ad4, fd0, fd1, ld0);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld0;
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao3 != null){
      ao3.m2(lb1, fb0, fb1, lb1);
}
    fb0 = ad1 < ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(ld0, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
    double ld2 = 919.7939177733281;
    Output.points[2][6] -= ad3;
    fb0 = fb1 && lb1;
    boolean lb3 = true;
    ad4 *= -1;

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
    ab2 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought91.getInstance(ao1, ao2, ao3, ao4);
    boolean lb1 = false;
    double ld2 = 538.545474318204;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2);
}
    fd0 *= -1;
    lb1 = fd1 > ld2;
    double ld3 = 180.15742826988696;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ld3, fd0, fd1, ld2);
}
    ld3 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fd0 = ao2.m3(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld2, ld3, fd0, fb1, lb1, ab1, ab2);
}
    fd1 *= -1;
    boolean lb4 = false;
if(ao2 != null){
      ab2 = ao2.m2(ld2, ld3, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb5 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, lb4, lb5, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    if (lb1) {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ld2 = ao3.m3(ld3, fd0, fd1, ld2);
}
        } else if (lb4) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld2);
}
        Thought lo6 = Thought211.getInstance();
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
    boolean lb0 = true;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Output.points[2][7] += fd0;
    Output.points[2][8] -= fd1;
    lb0 = ad1 > ad2;
    ab1 = ab2 && ab3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4);
}
    boolean lb1 = true;
    fd0 *= -1;

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
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb0, fb0, fb1);
}
    double ld1 = 636.5649537274536;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ld1 = fd0 - fd1;
    ld1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[3][0] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought332.getInstance(fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    Output.points[3][1] += fd0;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab4 = fd1 > fd0;
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;

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
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 780.8957161903819;
    Thought lo1 = Thought219.getInstance(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
    fb0 = ad2 > ad3;
    double ld2 = 382.0403450789512;
    ad3 = ad4 + fd0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld2, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld3 = 1.9358222378370877;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld2, ld3, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    double ld4 = 329.3633184028869;
    fb1 = fb0 && fb1;
    fb0 = ad2 > ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ld2, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;

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
    Thought lo0 = Thought343.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ad2 < ad3;
if(fo0 != null){
      fb1 = fo0.m2(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld1 = 249.34727146020344;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && ab1;
    Thought lo2 = Thought143.getInstance(ab2, ab3, ab4, fb0);
        fb1 = ad4 < fd0;
    ab1 = ab2 || ab3;
    boolean lb3 = true;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, ab4, fb0, fb1, lb3);
}
    ab1 = ab2 || ab3;
    ab4 = ad3 > ad4;
        Thought lo4 = Thought209.getInstance(fd0, fd1, ld1, ad1, fb0, fb1, lb3, ab1);
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      lb0 = ao1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    double ld3 = 814.9399187531376;
    lb1 = lb2 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld3);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 - ld3;
    fb1 = lb0 && lb1;
    boolean lb4 = true;
if(fo0 != null){
      ao4 = fo0.m4(lb2, lb4, fb0, fb1);
}
    boolean lb5 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld3, fd0, lb0, lb1, lb2, lb4);
}
    fd1 = ld3 + fd0;
    boolean lb6 = true;
if(fo1 != null){
      fo1.m2(fd1, ld3, fd0, fd1, lb5, lb6, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, lb0, lb1, lb2, lb4);
}

Thought.STACK_COUNTER++;
return lb5;
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
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    Output.points[3][2] -= ad3;
    Thought lo0 = Thought74.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fd0 < fd1;
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld1 = 119.57607882025981;
    fb1 = fb0 || fb1;
    boolean lb2 = true;
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ld1, ad1, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb2, fb0);
}
    Output.points[3][3] -= ad2;
    Thought lo3 = Thought329.getInstance(fo0, fo1, ao1, ao2);
    fb1 = ad3 > ad4;
    fd0 = fd1 + ld1;
    lb2 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ad1);
}
    double ld4 = 958.509480347997;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb5 = true;
if(ao1 != null){
      ao1.m2(lb2, lb5, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb2, lb5, fb0, fb1);
}
    lb2 = lb5 && fb0;

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
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    Thought lo0 = Thought7.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo2 = Thought210.getInstance(ab3, ab4, fb0, fb1);
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m1();
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
    fd0 = fd1 + fd0;
        boolean lb3 = true;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, lb3, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb1);
}
        lb3 = ab1 && ab2;

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
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[3][4] -= ad3;
    Thought lo0 = Thought360.getInstance(ad4, fd0, fd1, ad1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld1 = 792.5297546054214;
if(ao1 != null){
      ao1.m1();
}
    double ld2 = 596.8499569083018;
    ad4 = fd0 + fd1;
    ld1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    Output.points[3][5] -= ad4;
    ab4 = fb0 || fb1;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ld1, ld2, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        ab3 = ad1 < ad2;
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    boolean lb4 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld1, ld2, ad1, ad2);
}
    ab2 = ad3 > ad4;
if(ao1 != null){
      ao1.m2();
}
    fd0 = fd1 - ld1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld0 = 302.4522582212181;
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 < fd1;
        fb1 = ld0 > fd0;
        fb0 = fd1 < ld0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        fd1 *= -1;
        Thought lo1 = Thought323.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
        fb0 = fb1 || fb0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        boolean lb2 = false;
        boolean lb3 = true;
        Thought lo4 = Thought383.getInstance(fo0, fo1, fo0, fo1);
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
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        ab2 = fd0 > fd1;
    ab3 = fd0 < fd1;
    fd0 *= -1;
    ab4 = fd1 > fd0;
    boolean lb0 = true;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3();
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
    double ld0 = 399.868293640711;
    boolean lb1 = true;
    double ld2 = 118.60450334418412;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
    ld2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, ld2, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    fb0 = ad1 > ad2;
    Output.points[3][6] -= ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ld2 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    fb1 = ld0 > ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb3 = true;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = ld0 + ld2;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb3, fb0, fb1);
}
    lb1 = lb3 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb1, lb3, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld0, ld2, lb1, lb3, fb0, fb1);
}
    ad1 = ad2 - ad3;

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
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    ab4 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m3();
}
    boolean lb1 = false;
    ad4 = fd0 + fd1;
        fb0 = ad1 > ad2;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    boolean lb0 = true;

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
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld0 = 247.8571503668363;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    ad4 = fd0 - fd1;
    Thought lo2 = Thought176.getInstance(ld0, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
    ad4 = fd0 - fd1;
    ld0 = ad1 - ad2;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    double ld0 = 963.9935697383456;
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
if(ao2 != null){
      ao2.m2();
}
    boolean lb1 = false;
    boolean lb2 = false;
if(ao3 != null){
      ld0 = ao3.m3(ab3, ab4, fb0, fb1);
}
    boolean lb3 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, lb1, lb2, lb3, ab1);
}
    Thought lo4 = Thought258.getInstance(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    double ld0 = 244.07835565489367;
    fb0 = !fb1;
    ab1 = !ab2;
if(ao2 != null){
          ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad1 = ad2 - ad3;
    boolean lb1 = true;
    Thought lo2 = Thought206.getInstance(ad4, fd0, fd1, ld0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab3 = ab4 && fb0;
if(ao1 != null){
      fd0 = ao1.m3();
}
    double ld3 = 447.8990776170972;
    boolean lb4 = true;
    fd0 *= -1;
    fd1 *= -1;
if(ao2 != null){
      ld0 = ao2.m3(fb0, fb1, lb1, lb4);
}
    Thought lo5 = Thought302.getInstance(ao3, ao4, fo0, fo1, ld3, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    fb0 = ad4 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(ld0, ld3, ad1, ad2, fb1, lb1, lb4, ab1);
}
    ab2 = ad3 < ad4;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb1 = fd0 > fd1;

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
    double ld0 = 337.48888577882104;
    Thought lo1 = Thought243.getInstance(fo0, fo1, fo0, fo1);
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, fd0);
}
    fb0 = fb1 || fb0;
    double ld2 = 168.73798610527507;
    fb1 = fb0 || fb1;
    fd0 = fd1 + ld0;
    fb0 = fb1 && fb0;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0);
}
    ld2 = fd0 - fd1;
if(fo0 != null){
      ld0 = fo0.m3();
}
    ld2 = fd0 + fd1;
    ld0 = ld2 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb3, fb0);
}
    fb1 = fd1 > ld0;

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
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought113.getInstance(fo0, fo1, fo0, fo1);
    Thought lo3 = Thought132.getInstance(fd0, fd1, fd0, fd1);
    ab4 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = !lb0;
    fd1 = fd0 - fd1;
    double ld4 = 970.4670345663769;
    Thought lo5 = Thought188.getInstance(lb1, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4, ab4, fb0, fb1, lb0);
}
    lb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld4, ab1, ab2, ab3, ab4);
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
    ad2 = ad3 + ad4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld0 = 844.2030023800611;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ad1, ad2);
}
    ad3 = ad4 - fd0;
    double ld1 = 348.2651909938884;
        fb1 = fb0 && fb1;
    fd0 *= -1;
    double ld2 = 224.90448356423184;
    fd0 = fd1 - ld0;
    Thought lo3 = Thought310.getInstance(fo1, fo0, fo1, fo0, ld1, ld2, ad1, ad2);
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, ld2, ad1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        ld2 = ad1 + ad2;
        double ld4 = 178.79267337294147;
        fb0 = !fb1;
        boolean lb5 = false;
        boolean lb6 = true;
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
    ab1 = ab2 && ab3;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
        Thought lo0 = Thought300.getInstance(fo1, fo0, fo1, fo0);
    boolean lb1 = false;
    ab1 = ad3 < ad4;
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ab3 = ab4 || fb0;
    fb1 = ad1 > ad2;
    lb1 = ad3 < ad4;
if(fo1 != null){
      fd0 = fo1.m3();
}
    ab1 = fd1 < ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    double ld2 = 109.3847001813075;
    boolean lb3 = false;
    fb0 = ad4 > fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, fb1, lb1, lb3, ab1);
}
    Output.points[3][7] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, ad1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, lb3, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought326.getInstance(fd0, fd1, ld2, ad1);

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
    double ld0 = 537.8102458536034;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought236.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
    fb0 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    Output.points[3][8] += ld0;
    Thought lo2 = Thought2.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    boolean lb3 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1, lb3, fb0, fb1, lb3);
}
    ld0 *= -1;
    fb0 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb3, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ld0 = ao3.m3(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
}
if(ao4 != null){
      ao4.m2();
}
if(fo0 != null){
      lb3 = fo0.m2(fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb1, lb3, fb0, fb1);
}
    boolean lb4 = true;
    double ld5 = 69.26122997517484;
    lb3 = lb4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld5, fd0, fd1, ld0, fb1, lb3, lb4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb3, lb4, fb0);
}
    fb1 = ld5 < fd0;

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
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld0 = 204.09011157241454;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought155.getInstance(ad1, ad2, ad3, ad4);
    Output.points[4][0] += fd0;
    fd1 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    double ld2 = 873.0722429600644;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Output.points[4][1] -= ld0;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb3, fb0);
}
if(ao4 != null){
      ld2 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb3, fb0, fb1);
}
if(ao3 != null){
      lb3 = ao3.m2(fd0, fd1, ld0, ld2, fb0, fb1, lb3, fb0);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb3, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo4 = Thought285.getInstance(ad2, ad3, ad4, fd0);
    double ld5 = 452.8070313369968;
    fd0 *= -1;
    if (lb3) {
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd1, ld0, ld2, ld5);
}
        ad1 *= -1;
if(ao2 != null){
          fb0 = ao2.m2();
}
        Output.points[4][2] -= ad2;
        fb1 = !lb3;
if(ao3 != null){
          fb0 = ao3.m2(fb1, lb3, fb0, fb1);
}
        lb3 = fb0 || fb1;
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
    Thought lo0 = Thought44.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb1 = true;
    lb1 = fd1 > fd0;
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[4][3] += fd0;
if(ao3 != null){
      ao3.m1(fb0, fb1, lb1, ab1);
}
    fd1 *= -1;
    ab2 = fd0 > fd1;
    Output.points[4][4] -= fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ab4 = ad2 < ad3;
    ad4 *= -1;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    ab2 = ad1 < ad2;

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
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    Thought lo0 = Thought335.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    lb1 = fd1 < fd0;
    fd1 *= -1;
    fb0 = fb1 || lb1;
    double ld2 = 471.78673654053256;
    fb0 = !fb1;
    boolean lb3 = true;
    lb1 = lb3 || fb0;
    Thought lo4 = Thought291.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb1, lb1, lb3, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0, fb1, lb1, lb3, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        lb1 = fd1 < ld2;
if(fo0 != null){
          fo0.m1(fd0, fd1, ld2, fd0);
}
    fd1 = ld2 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
    double ld5 = 531.4747200516274;
    lb3 = fb0 && fb1;
    ld2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld5 = fd0 + fd1;
if(fo1 != null){
      ld2 = fo1.m3(lb1, lb3, fb0, fb1);
}
    lb1 = ld5 > fd0;

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
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
    double ld0 = 450.83199864045713;
    double ld1 = 332.55949130316964;
    double ld2 = 173.38394154916037;
    double ld3 = 907.1179362275537;
if(fo0 != null){
      ld1 = fo0.m3(ld2, ld3, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[4][5] -= ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld1 = fo0.m3(ld2, ld3, fd0, fd1);
}
    Thought lo4 = Thought201.getInstance(fo1, fo0, fo1, fo0, ld0, ld1, ld2, ld3);
    fb1 = fb0 && fb1;
    Output.points[4][6] += fd0;
    fb0 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[4][7] -= ld1;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    ld2 = ld3 + fd0;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ld2, fb0, fb1, lb5, fb0);
}
if(fo0 != null){
      fo0.m2(ld3, fd0, fd1, ld0, fb1, lb5, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb5);
}
    ld1 *= -1;

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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = lb1 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb0, lb1, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    lb0 = lb1 && fb0;
    Thought lo2 = Thought149.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
    Thought lo3 = Thought311.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
    fd1 = fd0 - fd1;
    double ld4 = 812.6634013998535;
    fb1 = !lb0;
    lb1 = ld4 > fd0;
    boolean lb5 = false;
    fd1 = ld4 - fd0;
    Output.points[4][8] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb5, fb0, fb1, lb0);
}
    Output.points[5][0] += ld4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m2(fd0, fd1, ld4, fd0);
}
    double ld6 = 386.96871145938223;
    lb1 = fd0 > fd1;

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
