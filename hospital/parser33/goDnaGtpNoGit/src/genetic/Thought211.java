package genetic;
import java.util.ArrayList;
class Thought211 extends Thought{
private static ArrayList<Thought211> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 471.833284951234;
private double fd1 = 458.4264135976586;
private Thought fo0 = null;
private Thought fo1 = null;
Thought211 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought211 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought211 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought211 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought211 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought211 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought211 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought211 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought211 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought211 instance = new Thought211 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought211 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought211 instance = new Thought211 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought211 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought211 instance = new Thought211 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought211 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought211 instance = new Thought211 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought211 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought211 instance = new Thought211 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought211 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought211 instance = new Thought211 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought211 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought211 instance = new Thought211 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought211 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought211 instance = new Thought211 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought271.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
        fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 660.7727469752522;

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
    Thought lo0 = Thought364.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought127.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
    boolean lb2 = true;
    ab3 = fd0 > fd1;
    Thought lo3 = Thought229.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 + fd0;
    ab4 = fb0 || fb1;
    lb2 = ab1 || ab2;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    Output.points[5][7] += fd0;

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
    double ld0 = 839.8947191353101;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ld0 = ad1 - ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought207.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    boolean lb2 = true;
    fb0 = ad4 > fd0;

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
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
        ab2 = !ab3;
    if (ab4) {
if(fo0 != null){
          fo0.m2(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
        Output.points[5][8] -= ad3;
        ad4 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb0 = false;
        boolean lb1 = false;
        lb0 = !lb1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
        Output.points[6][0] += ad3;
        ab1 = ad4 > fd0;
        boolean lb2 = false;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2();
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought202.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fd1 *= -1;
    fb1 = fd0 > fd1;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought240.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 *= -1;
    Output.points[6][1] += fd0;

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
    Thought lo0 = Thought261.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought317.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
    boolean lb2 = false;
if(fo1 != null){
      lb2 = fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb2, fb0);
}
    fb1 = ad1 < ad2;
    lb2 = !fb0;
    ad3 *= -1;
    fb1 = lb2 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, lb2, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, lb2, fb0, fb1);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      lb2 = ao3.m2(ad1, ad2, ad3, ad4);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
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
    double ld0 = 741.4839389199317;
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      ao2.m3(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought199.getInstance(fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
    boolean lb2 = true;
    ld0 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = ld0 > fd0;
    fd1 = ld0 + fd0;
    if (fb1) {
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld0, fd0, fd1);
}
        ld0 = fd0 + fd1;
        lb2 = ld0 < fd0;
        ab1 = ab2 && ab3;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
        ab4 = fd0 < fd1;
if(ao4 != null){
          ao3 = ao4.m4();
}
        ld0 *= -1;
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb2, ab1, ab2);
}
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
        lb2 = fd1 > ld0;
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
    ad2 *= -1;
    if (ab1) {
if(ao1 != null){
          ad3 = ao1.m3(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
        fb1 = ad2 < ad3;
        ad4 = fd0 + fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        boolean lb1 = true;
        lb1 = lb0 && ab1;
        boolean lb2 = true;
        boolean lb3 = false;
        lb0 = ab1 || ab2;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
        } else if (fb1) {
        boolean lb4 = true;
        lb4 = ad1 < ad2;
if(ao1 != null){
          lb0 = ao1.m2(ad3, ad4, fd0, fd1);
}
        ad1 = ad2 - ad3;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
        ab1 = ab2 || ab3;
        ad2 = ad3 - ad4;
        fd0 = fd1 + ad1;
        ab4 = ad2 > ad3;
        ad4 = fd0 - fd1;
        if (fb0) {
            fb1 = !lb4;
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
boolean m2() throws CountDownExc {
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
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    Output.points[6][2] -= fd1;
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld2 = 21.12747668916728;
    fd0 = fd1 - ld2;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld2, fd0);
}

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ab4 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld0 = 233.5145093821412;
    ab1 = ab2 && ab3;
    boolean lb1 = true;
    boolean lb2 = false;
    ld0 = fd0 + fd1;
    boolean lb3 = false;
    double ld4 = 382.0798793521719;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo5 = Thought287.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[6][3] += ld0;
    ld4 *= -1;
    lb3 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(ld0, ld4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld4, fd0, fd1);
}
    ld0 = ld4 - fd0;
if(fo0 != null){
      fo0.m3();
}
    fd1 = ld0 - ld4;
        double ld6 = 412.4536679162045;

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
    ad1 = ad2 - ad3;
    Thought lo0 = Thought96.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fd1 = ad1 + ad2;
    double ld1 = 235.6344009624045;
    Thought lo2 = Thought111.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    double ld3 = 601.2862286852787;
    boolean lb4 = true;
    Thought lo5 = Thought323.getInstance(fo0, fo1, fo0, fo1, ld1, ld3, ad1, ad2);
    boolean lb6 = true;
    Output.points[6][4] -= ad3;
    Thought lo7 = Thought187.getInstance();
        ad4 = fd0 + fd1;
    ld1 = ld3 - ad1;
if(fo0 != null){
      fo0.m1(lb4, lb6, fb0, fb1);
}
    lb4 = lb6 || fb0;
    fb1 = lb4 || lb6;
    ad2 = ad3 + ad4;

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
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
if(fo1 != null){
      ab4 = fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
    double ld0 = 457.80822695579286;
    boolean lb1 = true;

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
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 + fd0;
    Output.points[6][5] += fd1;
    Thought lo1 = Thought109.getInstance(fb1, lb0, fb0, fb1);
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    double ld2 = 694.809952814327;
    fd0 = fd1 + ld2;

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
    fb0 = ad2 > ad3;
    Output.points[6][6] -= ad4;
    fd0 = fd1 + ad1;
    Thought lo0 = Thought51.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
        Thought lo1 = Thought274.getInstance(ad3, ad4, fd0, fd1);
    Thought lo2 = Thought158.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
    boolean lb3 = false;
    double ld4 = 717.2685572880715;
    fb0 = !fb1;
    lb3 = fb0 || fb1;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ld4 = ao3.m3();
}
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(ao4 != null){
      lb3 = ao4.m2(fb0, fb1, lb3, fb0);
}
    fb1 = lb3 && fb0;
    fd0 = fd1 + ld4;
    Thought lo5 = Thought333.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb3, fb0, fb1);
    lb3 = !fb0;

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
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb0 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    lb0 = ab1 || ab2;
    Output.points[6][7] += fd1;
    ab3 = fd0 < fd1;
    Output.points[6][8] += fd0;
    boolean lb1 = false;
    boolean lb2 = true;
    Output.points[7][0] += fd1;
    ab2 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    ab3 = ab4 || fb0;
    Thought lo3 = Thought331.getInstance();
if(ao2 != null){
      fb1 = ao2.m2(lb0, lb1, lb2, ab1);
}
    double ld4 = 934.1751602347217;
if(ao3 != null){
      ld4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld4, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld4, fd0, fd1, fb1, lb0, lb1, lb2);
}
    ab1 = ab2 && ab3;
    Output.points[7][1] += ld4;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
}
    lb2 = ab1 || ab2;

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
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ab2 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought340.getInstance();
if(ao1 != null){
      ad4 = ao1.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ab3 = ao1.m2(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb1 = false;
    ab1 = !ab2;
    Thought lo2 = Thought78.getInstance(ad3, ad4, fd0, fd1);
    boolean lb3 = true;
    ab2 = ad1 < ad2;
    Thought lo4 = Thought363.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
if(ao4 != null){
      ao4.m2();
}
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, lb1);
}
    Output.points[7][2] += ad1;
        lb3 = !ab1;
    double ld5 = 400.7664426492442;

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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    if (fb0) {
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fb0 = fd1 < fd0;
        Thought lo0 = Thought193.getInstance();
        fd1 = fd0 - fd1;
if(fo1 != null){
          fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
        fd0 = fd1 + fd0;
        Output.points[7][3] -= fd1;
        boolean lb1 = true;
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
    Thought lo0 = Thought358.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought241.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[7][4] += fd1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fb1 = !ab1;
if(fo0 != null){
      fd0 = fo0.m3();
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought223.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    ad4 = fd0 - fd1;
    fb1 = ad1 > ad2;
    boolean lb1 = true;
    lb1 = !fb0;
    Thought lo2 = Thought56.getInstance(fo0, fo1, fo0, fo1);
    fb1 = ad3 > ad4;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ad1;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    Output.points[7][5] -= ad4;
    boolean lb0 = true;
    double ld1 = 70.87796048136838;
if(fo0 != null){
      lb0 = fo0.m2(ad4, fd0, fd1, ld1);
}
    double ld2 = 743.2642087432582;
    ab1 = !ab2;
    ab3 = ld2 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    ab4 = fd1 > ld1;
    boolean lb3 = false;
    ab4 = !fb0;
    Output.points[7][6] += ld2;
    ad1 = ad2 - ad3;
    double ld4 = 766.2366844741881;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb0, lb3, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ld1, ld2, ld4, ad1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, lb0, lb3, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        Output.points[7][7] += ld1;
        lb0 = lb3 || ab1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
    fb1 = fb0 && fb1;
        boolean lb0 = false;
    fd1 *= -1;
    lb0 = !fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = !lb0;
    Thought lo1 = Thought51.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    fb0 = fb1 && lb0;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3();
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
    fb1 = !fb0;
    Thought lo0 = Thought97.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    fb0 = fb1 && lb1;
    Thought lo2 = Thought89.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb1);
}
    fb0 = ad3 > ad4;
    fd0 = fd1 - ad1;
    boolean lb3 = true;
    fb0 = ad2 < ad3;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, lb1, lb3, fb0);
}
    double ld4 = 970.3799568719668;
    ad3 = ad4 + fd0;
    fb1 = fd1 > ld4;
    lb1 = !lb3;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ld4, ad1, ad2, ad3);
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
    boolean lb0 = true;
    Thought lo1 = Thought122.getInstance();
    fd1 *= -1;
    fd0 = fd1 + fd0;
    ab1 = ab2 || ab3;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    double ld3 = 341.1649862222015;
    Thought lo4 = Thought29.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld3, fd0, lb0, lb2, ab1, ab2);
    ab3 = fd1 < ld3;
    boolean lb5 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld3, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo6 = Thought387.getInstance(ao4, fo0, fo1, ao1, lb0, lb2, lb5, ab1);
    ab2 = ab3 && ab4;

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
    ab2 = !ab3;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    Thought lo0 = Thought65.getInstance(ao2, ao3, ao4, fo0);
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ao1.m3();
}
    ad1 = ad2 - ad3;
    double ld2 = 106.31644162808463;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    lb1 = ab1 || ab2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought156.getInstance(ld2, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb1);
}
        ad4 = fd0 - fd1;
        Output.points[7][8] -= ld2;
        ad1 *= -1;
        ad2 = ad3 - ad4;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2);
}
        boolean lb4 = true;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld2, ad1);
}
        lb1 = !ab1;
        boolean lb5 = true;
        }
    double ld6 = 205.88965884224916;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Output.points[8][0] += fd0;
    fb0 = fd1 > fd0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
    lb0 = fd1 > fd0;
    Output.points[8][1] -= fd1;
    fd0 *= -1;
    Output.points[8][2] += fd1;
    double ld2 = 761.1162779483117;
    lb1 = fb0 || fb1;
    ld2 = fd0 - fd1;
    Thought lo3 = Thought119.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb0, lb1, fb0, fb1);
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, fd0, fd1, lb0, lb1, fb0, fb1);
}
    double ld4 = 10.576473383503174;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    boolean lb0 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = lb0 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[8][3] -= fd0;
    ab2 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          ab3 = fo0.m2(ab4, fb0, fb1, lb0);
}
        Thought lo1 = Thought78.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
        }
    fd1 = fd0 + fd1;
    double ld2 = 146.31006883456192;
    fb0 = ld2 > fd0;
    fd1 = ld2 - fd0;
    fd1 = ld2 + fd0;
    fd1 = ld2 - fd0;
    fb1 = fd1 < ld2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    ld2 *= -1;
    ab1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought127.getInstance(ld2, fd0, fd1, ld2);

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m2();
}
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        Output.points[8][4] -= ad3;
        lb0 = ad4 < fd0;
        }
    double ld1 = 834.0120867988634;
    fd0 = fd1 - ld1;
    Thought lo2 = Thought325.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
    Output.points[8][5] += fd0;
    Thought lo3 = Thought351.getInstance(fd1, ld1, ad1, ad2, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    ad3 *= -1;
    fb0 = fb1 && lb0;
    boolean lb4 = true;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
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
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    Output.points[8][6] -= ad4;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2();
}
    ab4 = fd0 > fd1;
    double ld1 = 339.06422556603655;
    ld1 *= -1;
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    Output.points[8][7] -= fd1;
    double ld2 = 458.4000792716842;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb3);
}
    ld1 = ld2 - ad1;

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
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    for(int i0=0; i0<10; i0++){
        Output.points[8][8] += fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        double ld1 = 80.04475968597441;
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
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought272.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought164.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought64.getInstance(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    fb1 = ad4 < fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld3 = 63.7731607760181;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb4 = true;
    lb4 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld3, ad1, ad2, ad3);
}
    boolean lb5 = true;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld3, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ad2 = ao4.m3(lb5, fb0, fb1, lb4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb5, fb0, fb1, lb4);
}
    double ld6 = 195.0108229939693;
    boolean lb7 = false;
    ld3 *= -1;
    lb5 = lb7 && fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = lb4 && lb5;
if(fo1 != null){
          fo0 = fo1.m4(ld6, ad1, ad2, ad3, lb7, fb0, fb1, lb4);
}
        if (lb5) {
            boolean lb8 = false;
            lb5 = !lb7;
            fb0 = fb1 || lb8;
            lb4 = ad4 > fd0;
            if (lb5) {
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
    fb1 = fd0 > fd1;
    if (ab1) {
        Output.points[0][0] -= fd0;
        } else if (ab2) {
        boolean lb0 = false;
        Thought lo1 = Thought339.getInstance(fd1, fd0, fd1, fd0);
        fd1 = fd0 + fd1;
        ab2 = ab3 && ab4;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
        fd0 = fd1 - fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
if(ao3 != null){
          ab2 = ao3.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        lb0 = ad1 < ad2;
        double ld1 = 951.8375038600645;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
        fb0 = fd1 > ld1;
        fb1 = ad1 > ad2;
        Output.points[0][1] += ad3;
        lb0 = ab1 || ab2;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld1);
}
        ab3 = ab4 || fb0;
if(ao1 != null){
          fo1 = ao1.m4();
}
        Output.points[0][2] += ad1;
        Thought lo2 = Thought149.getInstance(fb1, lb0, ab1, ab2);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        lb0 = ab1 || ab2;
if(ao2 != null){
          fd1 = ao2.m3(ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          ad4 = ao3.m3(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
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
    Output.points[0][3] += fd1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    double ld0 = 801.0910958961983;
    Thought lo1 = Thought190.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
        fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought1.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fb0 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb3 = false;
    lb3 = !fb0;
    fb1 = lb3 || fb0;
    double ld4 = 107.35195963954335;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, ld4, lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb3 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(ld0, ld4, fd0, fd1);
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
    Output.points[0][4] -= fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought188.getInstance();
    fb0 = fd0 < fd1;
        fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    double ld1 = 195.0395074595895;
if(fo1 != null){
      fb1 = fo1.m2(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    double ld2 = 739.3902126243763;
    fb0 = fb1 && lb0;
    fb0 = ld2 < fd0;
    fb1 = lb0 && fb0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    double ld3 = 642.3384158677859;
    lb0 = fb0 && fb1;
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
