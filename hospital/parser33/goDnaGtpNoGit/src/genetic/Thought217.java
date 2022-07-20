package genetic;
import java.util.ArrayList;
class Thought217 extends Thought{
private static ArrayList<Thought217> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 984.6997516698146;
private double fd1 = 390.00797543213605;
private Thought fo0 = null;
private Thought fo1 = null;
Thought217 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought217 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought217 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought217 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought217 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought217 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought217 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought217 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought217 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought217 instance = new Thought217 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought217 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought217 instance = new Thought217 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought217 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought217 instance = new Thought217 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought217 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought217 instance = new Thought217 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought217 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought217 instance = new Thought217 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought217 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought217 instance = new Thought217 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought217 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought217 instance = new Thought217 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought217 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought217 instance = new Thought217 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
        fd0 *= -1;
    boolean lb0 = true;
    double ld1 = 186.55374158245758;
    lb0 = !fb0;
    fd0 = fd1 + ld1;
    Output.points[8][4] += fd0;
    boolean lb2 = true;
    Output.points[8][5] -= fd1;
if(fo0 != null){
      fo0.m2(ld1, fd0, fd1, ld1, fb0, fb1, lb0, lb2);
}
    fd0 = fd1 + ld1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
    if (fb0) {
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
        fd1 = ld1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, lb2, fb0);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    if (ab1) {
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
        ab2 = ab3 || ab4;
        double ld1 = 155.32579326109928;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
          fo1.m3();
}
        fd1 = ld1 + fd0;
        boolean lb2 = false;
        fb0 = fd1 < ld1;
        fb1 = lb2 || lb0;
        boolean lb3 = false;
        fd0 *= -1;
        Output.points[8][6] -= fd1;
        Output.points[8][7] -= ld1;
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
      fo0.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    ad2 *= -1;
    fb1 = ad3 > ad4;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought304.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    boolean lb1 = false;
    boolean lb2 = true;
    boolean lb3 = true;
    lb1 = fd0 < fd1;
    lb2 = lb3 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb4 = true;
    Thought lo5 = Thought234.getInstance(ad1, ad2, ad3, ad4);
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo6 = Thought194.getInstance();
    boolean lb7 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, lb2);
}
    boolean lb8 = false;
    fd0 *= -1;
    lb3 = lb4 || lb7;
    lb8 = fd1 < ad1;
    boolean lb9 = true;

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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought390.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
    ab3 = ad1 < ad2;
    ad3 = ad4 - fd0;
    Thought lo1 = Thought214.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    double ld2 = 649.5425335142577;
    boolean lb3 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    Output.points[8][8] -= fd1;
    ld2 *= -1;
    ad1 = ad2 + ad3;
    Output.points[0][0] += ad4;
if(fo1 != null){
      lb3 = fo1.m2(fd0, fd1, ld2, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld4 = 639.4163551194754;
    fd0 *= -1;
    Thought lo5 = Thought172.getInstance();
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ld4, ad1, ad2, ad3, fb1, lb3, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      ld4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb3 = ab1 && ab2;
    Output.points[0][1] += ad1;

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
    fb1 = !fb0;
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb0 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
    fb1 = !lb0;
    fd1 *= -1;
    fb0 = !fb1;
    double ld1 = 30.860664628491193;
    ld1 = fd0 + fd1;
    boolean lb2 = false;
    ld1 *= -1;
    lb0 = lb2 && fb0;
    fb1 = fd0 < fd1;
    lb0 = ld1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    lb2 = ld1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb2);
}
    fd1 *= -1;
    Output.points[0][2] -= ld1;

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
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    Output.points[0][3] -= ad3;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
          ad2 = ao3.m3();
}
if(ao4 != null){
      ad3 = ao4.m3(fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    double ld1 = 632.5596642192205;

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
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought127.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb1 = true;
    ab1 = ab2 && ab3;
    Thought lo2 = Thought244.getInstance(fd0, fd1, fd0, fd1);
    Thought lo3 = Thought133.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
if(ao4 != null){
      fd0 = ao4.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(ab4, fb0, fb1, lb1);
}
    Thought lo4 = Thought0.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
}
    Output.points[0][4] -= fd1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
if(ao4 != null){
      ao4.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > ad1;
    boolean lb0 = true;
    Thought lo1 = Thought258.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, ab1, ab2, ab3);
}
    fd1 = ad1 - ad2;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, lb2, lb3);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    boolean lb4 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb2, lb3, lb4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, lb2, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
    double ld5 = 14.06051882159652;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld5, fd0, fd1);
}
    Thought lo6 = Thought149.getInstance();
    lb1 = !lb2;
    Output.points[0][5] += ld5;
    fd0 = fd1 - ld5;
    boolean lb7 = true;
    lb3 = lb4 || lb7;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb1, lb2);
}
    fd0 = fd1 - ld5;
    Output.points[0][6] -= fd0;

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
    Thought lo0 = Thought171.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld1 = 407.9966669103226;
    Thought lo2 = Thought154.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ab3 = ld1 < fd0;
    ab4 = fd1 < ld1;
    Thought lo3 = Thought42.getInstance(fd0, fd1, ld1, fd0);
    Thought lo4 = Thought284.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
    boolean lb5 = true;
    double ld6 = 893.8032553489401;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld1 = ld6 - fd0;
    ab4 = fd1 > ld1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb5, ab1);
}
    Thought lo7 = Thought162.getInstance(fo1, fo0, fo1, fo0, ld6, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
    fb1 = ld6 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ld6, fd0, lb5, ab1, ab2, ab3);
}
    fd1 *= -1;

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
    fb1 = !fb0;
    Output.points[0][7] += ad1;
    double ld0 = 448.90617174995174;
    fb1 = ad1 < ad2;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought310.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    Thought lo2 = Thought160.getInstance();
    double ld3 = 819.2496162850434;
    ad3 = ad4 - fd0;
    fb1 = fd1 > ld0;
    boolean lb4 = false;
    Thought lo5 = Thought246.getInstance(lb4, fb0, fb1, lb4);
    fb0 = !fb1;
    boolean lb6 = true;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    ab2 = ab3 && ab4;
    Thought lo0 = Thought299.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    ab3 = !ab4;
    double ld1 = 684.8337980060903;
    fb0 = ad2 < ad3;
    Thought lo2 = Thought171.getInstance(ad4, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
    Thought lo3 = Thought369.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    boolean lb1 = false;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought355.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
        for(int i0=0; i0<10; i0++){
        lb0 = lb1 || lb2;
        fb0 = !fb1;
        boolean lb4 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 469.25263871719096;
    Thought lo1 = Thought337.getInstance();
    Output.points[0][8] -= ad1;
    fb1 = ad2 < ad3;
    Thought lo2 = Thought82.getInstance(fb0, fb1, fb0, fb1);
        fb0 = ad4 > fd0;
    fd1 = ld0 - ad1;
    fb1 = fb0 && fb1;
    fb0 = ad2 < ad3;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ld0;
        Thought lo3 = Thought158.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
        ad1 = ad2 - ad3;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ld0, ad1);
}
        boolean lb4 = true;
        fb0 = ad2 < ad3;
        ad4 = fd0 - fd1;
if(ao1 != null){
          ld0 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
        fb1 = fd0 < fd1;
        boolean lb5 = true;
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
    double ld0 = 960.7003319924568;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ld0 = fd0 - fd1;
    double ld1 = 202.24170895056966;
    ab2 = ld0 < ld1;
    ab3 = ab4 || fb0;
    fd0 = fd1 + ld0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ld1 = fd0 - fd1;
    ab4 = ld0 < ld1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld0, ld1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fd1, ld0, ld1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb2, ab1, ab2, ab3);
}
    ab4 = fd1 < ld0;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    Thought lo3 = Thought106.getInstance(ld1, fd0, fd1, ld0);
    fb1 = lb2 && ab1;
    ld1 = fd0 + fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    double ld0 = 406.5462211769419;
    ad3 *= -1;
    ab3 = ad4 < fd0;
    boolean lb1 = false;
if(ao1 != null){
      fd1 = ao1.m3();
}
    Output.points[1][0] -= ld0;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    lb1 = !ab1;
    ab2 = ad1 < ad2;
    ab3 = ad3 < ad4;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1, ab4, fb0, fb1, lb1);
}
    double ld2 = 685.1309540059966;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb1);
}
    Thought lo3 = Thought109.getInstance(ao4, fo0, fo1, ao1);
    ab1 = ab2 && ab3;
    for(int i0=0; i0<10; i0++){
        double ld4 = 414.1329011363732;
        fd0 = fd1 + ld4;
        ld0 = ld2 + ad1;
        ab4 = ad2 < ad3;
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
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
}
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought223.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);

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
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    if (fb0) {
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1);
}
        fb0 = !fb1;
        boolean lb0 = false;
        lb0 = fd0 > fd1;
        ab1 = !ab2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
    double ld0 = 293.4280222330795;
if(fo0 != null){
      ad1 = fo0.m3();
}
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    if (fb0) {
if(fo1 != null){
          ad2 = fo1.m3(fb1, lb1, fb0, fb1);
}
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
        double ld2 = 806.6970177270155;
        boolean lb3 = true;
        boolean lb4 = false;
        double ld5 = 62.723406177586654;
        lb4 = lb1 || fb0;
        boolean lb6 = false;
        fb0 = !fb1;
        double ld7 = 584.9280219476244;
        double ld8 = 34.19894753952359;
        lb3 = !lb4;
if(fo0 != null){
          fo1 = fo0.m4(ld5, ld7, ld8, ld0, lb6, lb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, lb4, lb6, lb1);
}
        boolean lb9 = true;
        ad1 = ad2 + ad3;
        Output.points[1][1] -= ad4;
        fd0 = fd1 + ld2;
        lb1 = fb0 && fb1;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld0 = 159.95999751349373;
    ld0 *= -1;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    ad3 = ad4 - fd0;
    ab1 = fd1 < ld0;
    ad1 = ad2 + ad3;
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;

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
    for(int i0=0; i0<10; i0++){
        Output.points[1][2] -= fd1;
        fd0 = fd1 - fd0;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought104.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          ao2.m3();
}
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
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought361.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[1][3] += fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4);
}
    Thought lo1 = Thought66.getInstance(ad4, fd0, fd1, ad1);
    boolean lb2 = true;
    lb2 = ad2 < ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 && lb2;
    ad3 = ad4 - fd0;
    Thought lo3 = Thought356.getInstance();
if(ao4 != null){
      fd1 = ao4.m3(fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, lb2, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 708.735189897273;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(fd0, fd1, ld0, fd0);
}
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ld0 = ao3.m3();
}
if(ao4 != null){
      fd0 = ao4.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1, fb1, lb1, ab1, ab2);
}
    Thought lo2 = Thought351.getInstance(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
        fd0 = fd1 + ld0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    double ld3 = 184.49468481343712;
    ld3 = fd0 + fd1;
    ld0 = ld3 + fd0;
    fd1 = ld0 + ld3;

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
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ab2 = ad1 < ad2;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
if(fo1 != null){
          ab3 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m2(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb0, ab1, ab2);
}
        }
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab4 = ad2 > ad3;
    Output.points[1][4] -= ad4;
    fd0 = fd1 + ad1;

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
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        Output.points[1][5] += fd0;
        fb0 = fb1 || fb0;
        Thought lo0 = Thought99.getInstance();
        double ld1 = 620.9281614109409;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        Output.points[1][6] += fd0;
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
}
        fb1 = !lb2;
        double ld3 = 872.747357331384;
        ld1 *= -1;
        Thought lo4 = Thought131.getInstance(ld3, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
        boolean lb5 = true;
        fb0 = fb1 || lb2;
        Thought lo6 = Thought373.getInstance(fo0, fo1, fo0, fo1, lb5, fb0, fb1, lb2);
        boolean lb7 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ld3 = fo0.m3(fd0, fd1, ld1, ld3);
}
        lb5 = !lb7;
        fd0 = fd1 - ld1;
        if (fb0) {
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab1 = ab2 && ab3;
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo0.m2();
}
        ab1 = ab2 || ab3;
        fd1 *= -1;
if(fo1 != null){
          fo1.m3(ab4, fb0, fb1, ab1);
}
        ab2 = fd0 > fd1;
        ab3 = ab4 && fb0;
        fd0 *= -1;
        boolean lb0 = false;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
        boolean lb1 = true;
        boolean lb2 = false;
        lb2 = ab1 && ab2;
        double ld3 = 587.107402828566;
        ab3 = fd0 > fd1;
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
    Thought lo0 = Thought248.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    fd0 *= -1;
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    double ld3 = 99.30371022605758;
    fd0 *= -1;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fd1 = fo0.m3(lb1, lb2, lb4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3, fb1, lb1, lb2, lb4);
}
    Output.points[1][7] += ad4;
    double ld5 = 558.1648405489974;
    boolean lb6 = true;

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
        ad2 *= -1;
    boolean lb0 = true;
    ab1 = ad3 > ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    Thought lo1 = Thought385.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 - fd1;
    boolean lb2 = true;
    Output.points[1][8] += ad1;
    boolean lb3 = true;
    ab4 = !fb0;
    ad2 = ad3 + ad4;
    fb1 = fd0 < fd1;
    lb0 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
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
if(ao1 != null){
      ao1.m1();
}
    double ld0 = 562.7449127540783;
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ld0 *= -1;
    Output.points[2][0] += fd0;
    fd1 = ld0 - fd0;
    fd1 *= -1;
    ld0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought184.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fd0 *= -1;
    fb0 = fd1 > ad1;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
        Output.points[2][1] -= ad2;
    fb0 = fb1 && fb0;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought28.getInstance(ad4, fd0, fd1, ad1);
    ad2 *= -1;
    fb1 = ad3 < ad4;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m2();
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
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought154.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    ab3 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought231.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
        ab4 = fd1 < fd0;
if(fo1 != null){
          fd1 = fo1.m3();
}
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab4 = ao2.m2(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
    boolean lb0 = true;
    fb0 = !fb1;
    boolean lb1 = true;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    lb0 = !lb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo2 = Thought387.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    double ld3 = 234.80252170820427;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = lb0 || fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    fd0 = fd1 - fd0;
    double ld1 = 67.48014078497091;
    Thought lo2 = Thought394.getInstance(lb0, fb0, fb1, lb0);

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
    double ld0 = 159.5544162267686;
    fb1 = fd0 > fd1;
    ld0 = fd0 + fd1;
    Thought lo1 = Thought99.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought230.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
    ld0 = fd0 - fd1;
    ld0 *= -1;
    Output.points[2][2] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
if(fo0 != null){
      lb3 = fo0.m2();
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
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought101.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
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
