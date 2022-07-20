package genetic;
import java.util.ArrayList;
class Thought348 extends Thought{
private static ArrayList<Thought348> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 879.6754609989439;
private double fd1 = 461.50878800026305;
private Thought fo0 = null;
private Thought fo1 = null;
Thought348 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought348 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought348 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought348 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought348 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought348 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought348 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought348 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought348 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought348 instance = new Thought348 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought348 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought348 instance = new Thought348 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought348 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought348 instance = new Thought348 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought348 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought348 instance = new Thought348 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought348 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought348 instance = new Thought348 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought348 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought348 instance = new Thought348 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought348 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought348 instance = new Thought348 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought348 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought348 instance = new Thought348 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Output.points[3][2] -= fd1;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fb0 = fb1 || fb0;
        fb1 = fd1 > fd0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fd1 = fd0 - fd1;
        for(int i1=0; i1<10; i1++){
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
    boolean lb0 = false;
    Thought lo1 = Thought356.getInstance(fo0, fo1, fo0, fo1);
    lb0 = fd0 > fd1;
    double ld2 = 365.37052064685315;
    ld2 = fd0 + fd1;
    ab1 = !ab2;
    Output.points[3][3] -= ld2;
    ab3 = fd0 < fd1;
    double ld3 = 666.0385107642569;
if(fo0 != null){
      fo0.m2(ld2, ld3, fd0, fd1);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1);
}
    double ld4 = 600.0882489563537;
if(fo1 != null){
      ld2 = fo1.m3();
}
    ld3 = ld4 + fd0;
    fd1 = ld2 - ld3;

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
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought54.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
    lb0 = ad3 > ad4;
    Thought lo2 = Thought297.getInstance(fo0, fo1, fo0, fo1);
    fb0 = !fb1;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, ad1, ad2);
}
    fb0 = ad3 < ad4;
    fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
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
    ad1 *= -1;
    double ld0 = 83.00282656321346;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
    ad1 *= -1;
    Thought lo2 = Thought230.getInstance(lb1, ab1, ab2, ab3);
    ab4 = ad2 > ad3;
    Thought lo3 = Thought222.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
    ad1 *= -1;
    ab2 = ad2 < ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
    lb1 = ad2 > ad3;
    ab1 = !ab2;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb4 = false;
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb6 = false;
    lb1 = !lb4;

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
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m1();
}
    fb1 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 164.63355447646893;
    ld0 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ld0 = fd0 - fd1;
    Thought lo1 = Thought54.getInstance(ld0, fd0, fd1, ld0);
    Thought lo2 = Thought262.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
    fd1 = ld0 - fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
    ld0 = fd0 - fd1;

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
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought17.getInstance(fb0, fb1, lb0, fb0);
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    Output.points[3][4] -= ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought336.getInstance(ao3, ao4, fo0, fo1);
    fb1 = fd0 > fd1;
    lb0 = ad1 > ad2;
    ad3 *= -1;
if(ao1 != null){
      ao1.m2(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 > ad3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
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
    Thought lo0 = Thought30.getInstance();
if(ao1 != null){
      fd1 = ao1.m3(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Output.points[3][5] += fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    ab3 = fd1 < fd0;
    ab4 = fb0 || fb1;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
        double ld2 = 976.165099610512;
    boolean lb3 = true;
    boolean lb4 = false;
    lb4 = ab1 || ab2;
    ab3 = ld2 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb5 = true;
    fd1 = ld2 - fd0;
    ab3 = fd1 < ld2;
    Thought lo6 = Thought88.getInstance(fd0, fd1, ld2, fd0);
    ab4 = fd1 > ld2;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[3][6] -= fd1;
    boolean lb0 = true;
    Thought lo1 = Thought226.getInstance();
    lb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
    fd1 = ad1 + ad2;
    fb1 = ad3 < ad4;
        lb0 = !ab1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
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
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 > fd1;
    boolean lb1 = true;
    Output.points[3][7] += fd0;
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 + fd1;
    fb0 = fb1 || lb0;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    Output.points[3][8] -= fd0;

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
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    fd0 *= -1;
    Thought lo0 = Thought226.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
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
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fd1 = ad1 + ad2;
    fb1 = fb0 || fb1;
    fb0 = ad3 > ad4;
    fd0 = fd1 - ad1;
    Thought lo0 = Thought247.getInstance();
if(fo0 != null){
      ad2 = fo0.m3(fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought70.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    lb1 = fb0 || fb1;
    ad4 *= -1;
    double ld3 = 469.5067257244903;
if(fo0 != null){
      ad4 = fo0.m3(lb1, fb0, fb1, lb1);
}
    fb0 = fd0 < fd1;

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
    Thought lo0 = Thought178.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    boolean lb1 = true;
    fd0 = fd1 - ad1;
    boolean lb2 = false;
    Output.points[4][0] -= ad2;
    Output.points[4][1] -= ad3;
if(fo1 != null){
      ab3 = fo1.m2(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
    Thought lo3 = Thought230.getInstance(fo0, fo1, fo0, fo1);
    if (ab4) {
        fb0 = ad2 < ad3;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 880.2084709525142;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
    fb0 = fb1 && fb0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Output.points[4][2] += fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought45.getInstance(fo0, fo1, ao1, ao2);
    Output.points[4][3] += fd0;
    fd1 = ld0 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, fd0, fd1);
}
    fb0 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      ld0 = fo0.m3();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    boolean lb1 = false;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = ad1 > ad2;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    lb0 = ad4 < fd0;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    Thought lo3 = Thought306.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
    lb0 = lb1 || lb2;
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ao3.m2();
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
        ab1 = fd0 < fd1;
    double ld0 = 870.7079820247565;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought152.getInstance(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
    double ld2 = 874.4038975654444;
    ab1 = ab2 || ab3;
    ab4 = ld2 > fd0;
    fb0 = fb1 || ab1;
    Thought lo3 = Thought199.getInstance(fd1, ld0, ld2, fd0, ab2, ab3, ab4, fb0);
    Output.points[4][4] += fd1;
    fb1 = ab1 && ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    ld0 = ld2 - fd0;

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
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab3 = ab4 && fb0;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    fb1 = !ab1;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    boolean lb0 = true;
        ab1 = !ab2;
if(ao2 != null){
      ad2 = ao2.m3();
}
    ab3 = ad3 > ad4;
if(ao3 != null){
      fd0 = ao3.m3(ab4, fb0, fb1, lb0);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
    Output.points[4][5] += fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought241.getInstance();
    fb0 = fb1 && lb0;
    boolean lb2 = true;

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
    ab2 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    Output.points[4][6] -= fd0;
    fd1 = fd0 - fd1;
    double ld0 = 360.42063402746066;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ab1 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(fd1, ld0, fd0, fd1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought309.getInstance();
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    double ld1 = 740.8377837784693;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    double ld2 = 460.285098149139;
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
    fd1 = ld1 + ld2;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld1;
    fb0 = !fb1;
    ld2 *= -1;
    ad1 *= -1;
    ad2 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 < ad4;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ld1, ld2, ad1, ad2);
}
    ad3 *= -1;
    fb0 = ad4 > fd0;
    if (fb1) {
        fb0 = fd1 > ld1;
        boolean lb3 = false;
        fb0 = !fb1;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = ab1 || ab2;
    boolean lb0 = true;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
    double ld1 = 818.9337579594809;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Output.points[4][7] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    ad4 *= -1;
    fd0 = fd1 - ld1;

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
    boolean lb0 = false;
    Output.points[4][8] += fd0;
    boolean lb1 = true;
    double ld2 = 770.9326845155159;
    boolean lb3 = false;
    fd0 = fd1 - ld2;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, lb1, lb3, fb0, fb1);
}
    Output.points[5][0] -= fd1;
    ld2 = fd0 + fd1;
    ld2 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    lb0 = lb1 && lb3;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld2, fd0);
}
    fb0 = fb1 && lb0;
    lb1 = fd1 < ld2;
    boolean lb4 = true;
    Thought lo5 = Thought191.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0);
    lb3 = lb4 && fb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo6 = Thought219.getInstance(fb1, lb0, lb1, lb3);
    lb4 = fb0 || fb1;
    lb0 = fd1 > ld2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, lb1, lb3, lb4, fb0);
}
    boolean lb7 = false;
    fb0 = fd1 < ld2;
    Thought lo8 = Thought233.getInstance(fd0, fd1, ld2, fd0, fb1, lb0, lb1, lb3);

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
        Output.points[5][1] -= ad1;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 - ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd1 = ad1 - ad2;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
    fb0 = fb1 && ab1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb0 = false;
if(ao3 != null){
      ao3.m2(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    ab2 = fd1 > fd0;
if(ao3 != null){
      ao3.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    lb0 = fd0 > fd1;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    fb0 = fd1 < fd0;
    fb1 = !lb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld2 = 350.0557178873807;
    fd0 = fd1 - ld2;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld2, fd0);
}
    double ld3 = 124.47563136782351;

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
    ab2 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
        boolean lb0 = false;
    Thought lo1 = Thought337.getInstance();
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
}
    Output.points[5][2] += fd1;
    ad1 = ad2 - ad3;
    Thought lo2 = Thought393.getInstance(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
    Thought lo3 = Thought154.getInstance(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
    lb0 = !ab1;
    Output.points[5][3] += ad2;
    ad3 = ad4 + fd0;
    ab2 = !ab3;
    Thought lo4 = Thought259.getInstance(ao1, ao2, ao3, ao4);
    ab4 = fd1 < ad1;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ad1;
    ad2 = ad3 + ad4;

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
    fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    boolean lb1 = false;
if(fo0 != null){
      lb0 = fo0.m2();
}
if(fo1 != null){
          fo1.m1(lb1, fb0, fb1, lb0);
}
    double ld2 = 768.7519613770331;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb0);
}
    boolean lb3 = false;
    fd1 *= -1;
    Thought lo4 = Thought64.getInstance(ld2, fd0, fd1, ld2, lb1, lb3, fb0, fb1);
    double ld5 = 700.7917985912629;
    lb0 = lb1 || lb3;
    boolean lb6 = false;
    Thought lo7 = Thought90.getInstance(fo1, fo0, fo1, fo0, lb6, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb1 = fo0.m2(ld5, fd0, fd1, ld2);
}
    double ld8 = 904.5619312711859;
    boolean lb9 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld5, ld8, fd0, fd1);
}
if(fo0 != null){
      ld2 = fo0.m3();
}
    lb3 = !lb6;

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
    ab1 = !ab2;
    ab3 = fd1 > fd0;
    Thought lo0 = Thought296.getInstance(ab4, fb0, fb1, ab1);
    boolean lb1 = false;
    ab1 = ab2 || ab3;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    ab4 = fd0 < fd1;
    fb0 = fb1 || lb1;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    lb1 = ab1 && ab2;
    fd0 *= -1;
    boolean lb2 = true;
    boolean lb3 = false;
    ab1 = !ab2;
    double ld4 = 686.2548135915282;
    ab3 = !ab4;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    fb0 = !fb1;
    boolean lb2 = true;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    lb1 = fd0 > fd1;
    lb2 = fb0 && fb1;
    Thought lo3 = Thought52.getInstance(ad1, ad2, ad3, ad4);
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb0, lb1, lb2, fb0);
}
    boolean lb4 = false;
    fb0 = !fb1;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, lb0, lb1, lb2, lb4);
}
    ad4 *= -1;

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
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fb0 = ad4 > fd0;
    fb1 = fd1 > ad1;
    double ld0 = 190.71921624648854;
    boolean lb1 = false;
    ad1 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
if(fo1 != null){
      lb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
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
      ao2.m2();
}
if(ao3 != null){
      fb1 = ao3.m2(fb0, fb1, fb0, fb1);
}
    if (fb0) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        double ld0 = 382.1269485604765;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
        double ld1 = 130.3817758959762;
        if (fb1) {
            fb0 = fb1 || fb0;
            fb1 = !fb0;
            fb1 = fd0 > fd1;
if(fo1 != null){
              fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
            Thought lo2 = Thought304.getInstance(fo0, fo1, ao1, ao2);
            Thought lo3 = Thought28.getInstance(ld0, ld1, fd0, fd1);
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ld1, fd0, fd1);
}
            fb1 = !fb0;
if(ao4 != null){
              ao3 = ao4.m4();
}
            ld0 = ld1 - fd0;
if(fo0 != null){
              fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
            fb0 = fb1 || fb0;
if(fo1 != null){
              fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
            fb1 = ld0 > ld1;
            fd0 *= -1;
if(fo0 != null){
              fd1 = fo0.m3(ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
            boolean lb4 = false;
            ld0 = ld1 + fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    double ld0 = 178.66418125439327;
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld0);
}
    fb1 = fb0 || fb1;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    boolean lb1 = true;
    Output.points[5][4] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb1 = !fb0;
        ad4 *= -1;
    fd0 = fd1 + ld0;

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
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
        fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    if (fb1) {
        boolean lb1 = true;
        lb1 = lb0 || ab1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Output.points[5][5] += fd0;
        fb1 = fd1 < fd0;
if(ao3 != null){
          ao3.m2(fd1, fd0, fd1, fd0, lb1, lb0, ab1, ab2);
}
        boolean lb2 = false;
        Thought lo3 = Thought192.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
        fb1 = !lb1;
        lb2 = fd1 < fd0;
        lb0 = ab1 && ab2;
        double ld4 = 892.013489836727;
if(ao2 != null){
          ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
        ab4 = fd0 < fd1;
        ld4 *= -1;
        fb0 = !fb1;
if(ao1 != null){
          fd0 = ao1.m3(fd1, ld4, fd0, fd1);
}
if(ao2 != null){
          lb1 = ao2.m2(ao3, ao4, fo0, fo1, ld4, fd0, fd1, ld4);
}
        lb2 = lb0 || ab1;
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
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb0 = ad2 > ad3;
if(ao4 != null){
      ab1 = ao4.m2(ab2, ab3, ab4, fb0);
}
    ad4 = fd0 + fd1;
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Output.points[5][6] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fb0 = fb1 || lb0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        ab1 = !ab2;
    ab3 = fd0 > fd1;
    ab4 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo1 = Thought102.getInstance(fb0, fb1, lb0, ab1);
        Output.points[5][7] += ad3;
    ab2 = ab3 && ab4;

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
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought204.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
    Thought lo2 = Thought377.getInstance(fb0, fb1, lb1, fb0);
    Thought lo3 = Thought187.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
    fd1 *= -1;
    lb1 = fd0 < fd1;

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
    double ld0 = 559.386666467021;
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    Thought lo1 = Thought133.getInstance(fd0, fd1, ld0, fd0);
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = fd1 > ld0;
    Thought lo2 = Thought270.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
    double ld3 = 151.2226975339775;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1();
}
    boolean lb4 = false;
    Thought lo5 = Thought135.getInstance(lb4, fb0, fb1, lb4);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3, fb0, fb1, lb4, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fd1, ld0, ld3, fd0, fb1, lb4, fb0, fb1);
}
    Output.points[5][8] += fd1;
    Output.points[6][0] -= ld0;
        boolean lb6 = false;
    lb4 = ld3 > fd0;
    boolean lb7 = false;
    lb6 = fd1 > ld0;

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
      fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb0;
    Thought lo1 = Thought239.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    fb1 = !lb0;
        Thought lo2 = Thought36.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = !fb1;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m3();
}
    boolean lb4 = false;
        lb0 = !lb3;
if(fo0 != null){
      fo1 = fo0.m4(lb4, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb3, lb4, fb0, fb1);
}
    double ld5 = 964.1781027177913;
if(fo0 != null){
      ld5 = fo0.m3(fd0, fd1, ld5, fd0, lb0, lb3, lb4, fb0);
}
    Thought lo6 = Thought344.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, lb3, lb4);
    boolean lb7 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb7 = fd1 > ld5;
    fd0 = fd1 - ld5;
    fd0 *= -1;
    boolean lb8 = false;

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
