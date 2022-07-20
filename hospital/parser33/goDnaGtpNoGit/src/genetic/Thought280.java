package genetic;
import java.util.ArrayList;
class Thought280 extends Thought{
private static ArrayList<Thought280> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 747.6846353677876;
private double fd1 = 88.91964159840218;
private Thought fo0 = null;
private Thought fo1 = null;
Thought280 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought280 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought280 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought280 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought280 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought280 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought280 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought280 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought280 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought280 instance = new Thought280 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought280 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought280 instance = new Thought280 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought280 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought280 instance = new Thought280 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought280 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought280 instance = new Thought280 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought280 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought280 instance = new Thought280 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought280 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought280 instance = new Thought280 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought280 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought280 instance = new Thought280 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought280 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought280 instance = new Thought280 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    double ld0 = 276.24869761646545;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    fb0 = !fb1;
    Output.points[0][7] -= ld0;
    fd0 = fd1 - ld0;
    boolean lb1 = true;
    fd0 = fd1 - ld0;
    Output.points[0][8] -= fd0;
    boolean lb2 = true;
    double ld3 = 6.412164870782076;

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
    Output.points[1][0] += fd0;
    Output.points[1][1] += fd1;
    Thought lo0 = Thought211.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought186.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    ab3 = fd0 < fd1;
    ab4 = !fb0;
    double ld2 = 825.5152706061781;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ld2;
    Thought lo3 = Thought304.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m2(fd0, fd1, ld2, fd0);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    boolean lb4 = false;
    ld2 = fd0 - fd1;
    ld2 *= -1;
    ab4 = fb0 || fb1;

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
if(fo0 != null){
      ad2 = fo0.m3();
}
    Thought lo1 = Thought9.getInstance(lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
    Thought lo3 = Thought219.getInstance(fo1, fo0, fo1, fo0);
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb4 = true;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m2(lb2, lb4, fb0, fb1);
}
    fd1 = ad1 + ad2;
    lb0 = ad3 > ad4;

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
    ad1 *= -1;
    ad2 = ad3 - ad4;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    ab4 = ad3 > ad4;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ad1;
    ad2 *= -1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought17.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);

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
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
    double ld0 = 214.33459849694947;
        ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
    fb1 = ld0 > fd0;
    fb0 = !fb1;
    boolean lb1 = false;
    lb1 = !fb0;
    fb1 = fd1 > ld0;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(lb1, lb2, fb0, fb1);
}
    lb1 = !lb2;
    double ld3 = 215.11547987937018;
    fb0 = ld3 < fd0;
    fd1 *= -1;
    boolean lb4 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld3, fd0, fd1, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4(ld0, ld3, fd0, fd1, lb4, fb0, fb1, lb1);
}
    Thought lo5 = Thought216.getInstance(fo1, ao1, ao2, ao3, lb2, lb4, fb0, fb1);
    Output.points[1][2] -= ld0;
    ld3 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd0 *= -1;
    if (lb1) {
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
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    Thought lo1 = Thought342.getInstance(ad2, ad3, ad4, fd0);
    Output.points[1][3] -= fd1;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fb0 = ao1.m2();
}
    double ld2 = 60.03638980714535;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb3);
}
    fb0 = fb1 || lb0;
if(ao4 != null){
      lb3 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2, fb0, fb1, lb0, lb3);
}
    ad1 *= -1;
    if (fb0) {
        double ld4 = 848.6502049451152;
if(ao4 != null){
          ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb1, lb0, lb3, fb0);
}
        fd0 *= -1;
        boolean lb5 = false;
        fb0 = fb1 || lb5;
        Thought lo6 = Thought306.getInstance(fo0, fo1, ao1, ao2, lb0, lb3, fb0, fb1);
        if (lb5) {
            lb0 = lb3 || fb0;
            fb1 = fd1 < ld4;
            boolean lb7 = true;
if(ao3 != null){
              ld2 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
              ao2.m1(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
              ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld4, ld2);
}
if(ao3 != null){
              ao2 = ao3.m4();
}
            boolean lb8 = false;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
    ab3 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought314.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fd0 = fd1 + fd0;
    Thought lo1 = Thought187.getInstance(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    ab4 = !fb0;
    fb1 = fd0 < fd1;
    fd0 *= -1;
    ab1 = ab2 && ab3;
    boolean lb2 = true;
if(fo1 != null){
      ab3 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    ab4 = fb0 || fb1;

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
    double ld0 = 854.8680245499571;
if(ao1 != null){
      ad1 = ao1.m3();
}
    ab1 = !ab2;
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    Output.points[1][4] -= ad3;
    ab1 = ad4 < fd0;
    ab2 = fd1 > ld0;
    ab3 = ab4 && fb0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ld0;
if(ao3 != null){
      ab4 = ao3.m2(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    ab4 = !fb0;
    fd0 = fd1 + ld0;
    fb1 = lb1 || ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad1 = ad2 - ad3;

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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    fd0 = fd1 + fd0;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1();
}
    Output.points[1][5] -= fd1;
    Thought lo1 = Thought326.getInstance(fb0, fb1, lb0, fb0);
    fd0 = fd1 - fd0;
    fb1 = lb0 && fb0;
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb2, fb0);
}
    fb1 = lb0 && lb2;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
    double ld3 = 736.447751513339;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
}
    fd0 = fd1 - ld3;
    double ld4 = 96.02681931437783;
    Output.points[1][6] -= ld4;
    fd0 = fd1 - ld3;
    fb0 = ld4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(ld3, ld4, fd0, fd1);
}
        lb0 = lb2 && fb0;
        Thought lo5 = Thought211.getInstance(fo0, fo1, fo0, fo1, ld3, ld4, fd0, fd1);
        fb1 = ld3 > ld4;
        lb0 = fd0 < fd1;
if(fo0 != null){
          fo0.m1();
}
        lb2 = ld3 < ld4;
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
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    boolean lb0 = true;
    lb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    lb1 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    double ld2 = 360.41162472975844;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = !fb0;
    fb1 = !lb0;
    fd0 *= -1;
    if (fb0) {
        fb1 = fd1 < ad1;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb1 = false;
        ad2 = ad3 - ad4;
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
        Thought lo3 = Thought107.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo4 = Thought195.getInstance(lb0, fb0, fb1, lb1);
        boolean lb5 = true;
        lb2 = lb5 && lb0;
        ad1 = ad2 - ad3;
        } else {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
                  fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    double ld0 = 597.3227866391956;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ld0 = ad1 + ad2;
    ab1 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    ab2 = !ab3;
if(fo1 != null){
      fo1.m1();
}
    fd1 = ld0 - ad1;
    ad2 = ad3 + ad4;
    boolean lb1 = false;
    ab3 = fd0 < fd1;
    Thought lo2 = Thought39.getInstance(ab4, fb0, fb1, lb1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[1][7] += ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0);
}
    lb1 = ad1 < ad2;
    boolean lb3 = true;
    lb3 = ad3 < ad4;
    fd0 *= -1;
    boolean lb4 = false;

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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fd0 *= -1;
    Output.points[1][8] -= fd1;
    boolean lb0 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Output.points[2][0] -= fd0;
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    boolean lb2 = false;
if(fo1 != null){
      lb2 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
    lb2 = fd1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fb1 = ao4.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      lb0 = fo0.m2();
}
    boolean lb3 = true;
if(fo1 != null){
      lb1 = fo1.m2(lb2, lb3, fb0, fb1);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, lb2, lb3);
}
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    for(int i0=0; i0<10; i0++){
        lb2 = !lb3;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought209.getInstance(ad2, ad3, ad4, fd0);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
        boolean lb2 = false;
    lb1 = fd0 > fd1;
    lb2 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(lb3, fb0, fb1, lb1);
}
    if (lb2) {
        fd1 = ad1 + ad2;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb3, fb0, fb1, lb1);
}
        ad1 *= -1;
        lb2 = !lb3;
        fb0 = ad2 > ad3;
        ad4 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb1, lb1, lb2, lb3);
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
    ab1 = ab2 && ab3;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought354.getInstance(ao2, ao3, ao4, fo0);
    Thought lo1 = Thought306.getInstance(fd0, fd1, fd0, fd1);
    ab2 = ab3 || ab4;
    boolean lb2 = true;
    ab4 = fb0 && fb1;
    double ld3 = 395.1641141699235;
    lb2 = ld3 < fd0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, ld3, fd0, fd1);
}
if(fo0 != null){
      ld3 = fo0.m3();
}
    Output.points[2][1] -= fd0;
    ab1 = fd1 < ld3;
    Thought lo4 = Thought188.getInstance(ab2, ab3, ab4, fb0);
    fb1 = !lb2;
    fd0 *= -1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, ld3, fd0, fd1, ab4, fb0, fb1, lb2);
}
    Thought lo5 = Thought372.getInstance(ld3, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb2, ab1);
}
    Thought lo6 = Thought309.getInstance(ao4, fo0, fo1, ao1);
    Output.points[2][2] += fd1;
    ab2 = ld3 < fd0;
    ab3 = ab4 || fb0;
    fd1 = ld3 - fd0;
    boolean lb7 = true;

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
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    Output.points[2][3] += ad4;
    Thought lo1 = Thought23.getInstance(fd0, fd1, ad1, ad2);
    ab4 = ad3 > ad4;
    if (fb0) {
        Output.points[2][4] -= fd0;
        fb1 = !lb0;
        fd1 = ad1 - ad2;
        ad3 *= -1;
        ab1 = ab2 && ab3;
        Output.points[2][5] -= ad4;
        ab4 = fb0 || fb1;
        lb0 = fd0 < fd1;
        ad1 = ad2 - ad3;
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1();
}
    Thought lo0 = Thought197.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    boolean lb1 = false;
    Output.points[2][6] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 < fd1;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);
}
    boolean lb3 = false;
    if (lb2) {
        boolean lb4 = false;
        lb2 = fd1 > fd0;
        lb3 = fd1 < fd0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        Output.points[2][7] += fd0;
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
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    boolean lb0 = true;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2();
}
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(lb0, lb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, lb1, ab1, ab2);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought2.getInstance(fd0, fd1, fd0, fd1);
    lb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb3 = false;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo4 = Thought55.getInstance(ab1, ab2, ab3, ab4);
    Thought lo5 = Thought278.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
    lb3 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[2][8] -= ad2;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb1 = fb0 || fb1;
        fb0 = ad3 > ad4;
        fd0 = fd1 + ad1;
        Output.points[3][0] -= ad2;
        }
    ad3 = ad4 - fd0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fd1 *= -1;
    double ld0 = 634.5083837543415;
    Thought lo1 = Thought54.getInstance(ld0, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    boolean lb2 = false;
    Output.points[3][1] += ld0;
    lb2 = !fb0;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    for(int i1=0; i1<10; i1++){
if(fo0 != null){
          fb1 = fo0.m2(lb2, lb3, fb0, fb1);
}
if(fo1 != null){
          lb2 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, lb3, fb0, fb1, lb2);
}
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ld0, ad1, lb3, fb0, fb1, lb2);
}
        ad2 = ad3 - ad4;
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
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    Output.points[3][2] -= ad1;
    double ld0 = 144.36615082999663;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 649.0591384839817;
    Output.points[3][3] += ld1;
if(fo0 != null){
      ab3 = fo0.m2(ad1, ad2, ad3, ad4);
}
    ab4 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2);
}
    fb1 = ab1 || ab2;
    Thought lo2 = Thought227.getInstance();
    ab3 = ad3 < ad4;
    Thought lo3 = Thought129.getInstance(ab4, fb0, fb1, ab1);
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb4 = false;
    Thought lo5 = Thought267.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo6 = Thought9.getInstance(ld1, ad1, ad2, ad3);
    if (lb4) {
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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo0 = Thought172.getInstance(fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
    double ld1 = 810.7185401514721;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld1;
if(ao3 != null){
      ao3.m1(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
        Thought lo2 = Thought102.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
    ld1 = fd0 + fd1;
    Output.points[3][4] -= ld1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
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
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    ad1 *= -1;
    fb0 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought316.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
    fb0 = fd1 < ad1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo1 = Thought57.getInstance(fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought184.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
    fb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fb0 = fb1 || fb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    Thought lo0 = Thought87.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought153.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    ab4 = !fb0;
    boolean lb2 = false;
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    double ld3 = 894.39569462017;
    lb2 = ld3 < fd0;
    fd1 *= -1;
    boolean lb4 = true;
    lb4 = ld3 > fd0;
    Thought lo5 = Thought396.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld3, fd0, fd1, lb2, lb4, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ld3, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ld3;
    double ld6 = 597.121685614539;
if(ao4 != null){
      lb2 = ao4.m2(fo0, fo1, ao1, ao2, lb4, ab1, ab2, ab3);
}
    ld6 *= -1;
    ab4 = fd0 < fd1;
    ld3 = ld6 + fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
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
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought236.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    Thought lo2 = Thought386.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
if(ao4 != null){
      ad1 = ao4.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fd1 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb1, ab1, ab2);
}
            ab3 = ad1 < ad2;
            ad3 = ad4 + fd0;
            double ld3 = 613.6674702428339;
            ab4 = fb0 || fb1;
            double ld4 = 43.63285494612208;
            lb1 = ab1 || ab2;
            ab3 = ad4 < fd0;
if(ao4 != null){
              fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
            ab4 = ld3 > ld4;
            fb0 = fb1 && lb1;
            for(int i1=0; i1<10; i1++){
                ab1 = ab2 || ab3;
}}}
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
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        fb0 = fd1 > fd0;
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fd1 = fo1.m3();
}
        boolean lb0 = true;
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        fb0 = !fb1;
        fd0 = fd1 + fd0;
        Thought lo1 = Thought153.getInstance(lb0, fb0, fb1, lb0);
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        boolean lb2 = false;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
        fd0 = fd1 + fd0;
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
    if (ab1) {
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        Output.points[3][5] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        } else if (ab1) {
        boolean lb0 = true;
        Thought lo1 = Thought322.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        fd0 = fd1 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
        } else if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
        boolean lb2 = true;
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
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld0 = 165.47067046215224;
    double ld1 = 351.0592803879249;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
    Thought lo2 = Thought2.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ad1);
    if (fb0) {
if(fo0 != null){
          fb1 = fo0.m2();
}
        fb0 = !fb1;
        } else {
        boolean lb3 = true;
if(fo1 != null){
          lb3 = fo1.m2(fb0, fb1, lb3, fb0);
}
        boolean lb4 = true;
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
    if (ab1) {
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        boolean lb0 = false;
        fb0 = !fb1;
        Output.points[3][6] -= fd1;
        lb0 = !ab1;
        ab2 = ad1 > ad2;
if(fo0 != null){
          fo0.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        lb0 = ad1 > ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        ad3 = ad4 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        double ld1 = 187.2327460712106;
        ld1 *= -1;
        } else {
        ad2 = ad3 + ad4;
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
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    Thought lo0 = Thought219.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    Thought lo2 = Thought254.getInstance(ao1, ao2, ao3, ao4);
    fd0 *= -1;
    double ld3 = 980.4091378630643;
    fd0 = fd1 + ld3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld3, fd0, fd1);
}
    lb1 = ld3 > fd0;
if(ao1 != null){
      ao1.m3();
}
    fd1 = ld3 - fd0;
    boolean lb4 = true;

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
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = ad2 > ad3;
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = ad4 > fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    double ld2 = 88.41323327542814;
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, lb3, fb0, fb1, lb0);
}
    ld2 *= -1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    fd0 = fd1 + ld2;
    lb1 = lb3 || fb0;
    if (fb1) {
        lb0 = lb1 || lb3;
        Output.points[3][7] += ad1;
        for(int i0=0; i0<10; i0++){
            fb0 = !fb1;
            boolean lb4 = false;
if(ao4 != null){
              ao4.m1(fo0, fo1, ao1, ao2, lb4, lb0, lb1, lb3);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
            boolean lb5 = true;
            lb3 = ad2 < ad3;
if(ao3 != null){
              ao3.m2(ad4, fd0, fd1, ld2);
}
            fb0 = fb1 || lb4;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought303.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    ab2 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[3][8] -= fd1;
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
        Thought lo1 = Thought278.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
if(ao1 != null){
          fd1 = ao1.m3();
}
        fd0 = fd1 + fd0;
if(ao2 != null){
          ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
        ab4 = fd1 > fd0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        ab1 = !ab2;
        fd0 *= -1;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
if(fo1 != null){
          ab3 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
    Output.points[4][0] += ad4;
    fd0 = fd1 - ad1;
    Output.points[4][1] += ad2;
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    double ld0 = 39.47642390854741;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought207.getInstance(fd1, ld0, ad1, ad2);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    double ld2 = 270.25000549374323;
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld3 = 146.54021712747712;
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld0, ld2, ld3, ad1, ab1, ab2, ab3, ab4);
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
    Thought lo0 = Thought65.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    Thought lo2 = Thought14.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
    fb0 = !fb1;
    Output.points[4][2] += fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    lb1 = !fb0;
        fb1 = fd1 < fd0;
    lb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    Thought lo3 = Thought3.getInstance(fo0, fo1, fo0, fo1);
    boolean lb4 = false;
    fd0 = fd1 - fd0;
    lb1 = lb4 || fb0;
    Output.points[4][3] += fd1;
    Thought lo5 = Thought30.getInstance(fd0, fd1, fd0, fd1);
    fb1 = !lb1;
    fd0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
    double ld0 = 348.7176581050305;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = ld0 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    lb1 = fd1 < ld0;

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
if(fo0 != null){
      fo0.m2();
}
        fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 615.3101870256697;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > fd0;
    double ld1 = 893.2810886382007;
    Thought lo2 = Thought59.getInstance(fo0, fo1, fo0, fo1);
    fb0 = !fb1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld0, ld1, fd0);
}
    Thought lo3 = Thought111.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
    Output.points[4][4] += fd1;
if(fo1 != null){
      fo1.m1();
}
    boolean lb4 = false;
    ld0 = ld1 - fd0;
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
}
