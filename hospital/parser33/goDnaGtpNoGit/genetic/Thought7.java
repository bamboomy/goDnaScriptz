package genetic;
import java.util.ArrayList;
class Thought7 extends Thought{
private static ArrayList<Thought7> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 442.2253034925726;
private double fd1 = 100.52858040882266;
private Thought fo0 = null;
private Thought fo1 = null;
Thought7 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought7 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought7 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought7 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought7 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought7 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought7 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought7 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought7 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
        boolean lb0 = false;
    Thought lo1 = Thought288.getInstance();
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought288.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    double ld3 = 907.3470158131706;
    fd0 = fd1 - ld3;
    fd0 = fd1 + ld3;
    double ld4 = 381.81649628139076;
if(fo0 != null){
      ld4 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, ld4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ld4);
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
    Thought lo0 = Thought7.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        boolean lb1 = true;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    lb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 - fd1;
    Output.points[7][8] += fd0;
    ab1 = fd1 < fd0;
    ab2 = fd1 < fd0;
    Output.points[8][0] += fd1;
    ab3 = fd0 < fd1;
    boolean lb2 = false;
    ab3 = ab4 && fb0;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, lb2, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb1, lb1, lb2, ab1);
}
    Thought lo3 = Thought168.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    double ld4 = 104.33394213207372;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    lb0 = ad1 > ad2;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    lb0 = lb1 && fb0;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad4 = fd0 + fd1;
    ad1 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      ad2 = fo1.m3(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb1, lb2, fb0, fb1);
}
    boolean lb3 = false;
    lb0 = lb1 && lb2;
    double ld4 = 208.95415790200835;
    lb3 = !fb0;
    fb1 = ad4 < fd0;

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
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    Thought lo1 = Thought101.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb0, ab1);
}
    ad4 = fd0 - fd1;
    ab2 = ab3 || ab4;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought244.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought144.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m2();
}
    fb0 = fd1 < fd0;
    fb1 = !fb0;
if(ao2 != null){
      ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought153.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      ao3.m1(fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
    fb0 = fd1 > fd0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fb1 = !lb3;
    Thought lo4 = Thought122.getInstance();
    boolean lb5 = true;
if(ao4 != null){
      ao3 = ao4.m4(lb5, fb0, fb1, lb3);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb5, fb0, fb1, lb3);
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
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    fb1 = !fb0;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    ad3 = ad4 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
    fd1 = ad1 + ad2;
    fb1 = ad3 < ad4;

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
    double ld0 = 40.71625542676108;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought288.getInstance(ld0, fd0, fd1, ld0);
    double ld2 = 823.3902787027288;
    boolean lb3 = false;
    ab1 = ab2 || ab3;
    ab4 = ld2 < fd0;
    boolean lb4 = false;
    Thought lo5 = Thought22.getInstance(fo1, ao1, ao2, ao3, fd1, ld0, ld2, fd0);
    Output.points[8][1] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    ld0 *= -1;
    boolean lb6 = true;
if(ao1 != null){
      fo1 = ao1.m4(ab3, ab4, fb0, fb1);
}
    lb3 = lb4 || lb6;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = ld2 < fd0;
    lb3 = fd1 < ld0;
if(ao1 != null){
      ao1.m1(ld2, fd0, fd1, ld0, lb4, lb6, ab1, ab2);
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
    Thought lo0 = Thought171.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
    boolean lb1 = false;
    ab1 = ab2 && ab3;
    ab4 = ad2 < ad3;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fb1 = ad4 > fd0;
    fd1 = ad1 + ad2;
    Thought lo2 = Thought18.getInstance(ad3, ad4, fd0, fd1);
    lb1 = ad1 < ad2;
    ab1 = ab2 || ab3;
    ab4 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m3();
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb1, ab1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
    double ld3 = 566.8509682489818;
    Output.points[8][2] += ld3;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ld3;
    if (fb0) {
        fb1 = !lb1;
        Thought lo4 = Thought152.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
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
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 < fd1;
        Thought lo0 = Thought356.getInstance(fd0, fd1, fd0, fd1);
    boolean lb1 = false;
    double ld2 = 797.1086342469467;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
    lb1 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    Output.points[8][3] += ld2;
    fb1 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    Output.points[8][4] += fd0;
    fb1 = !lb1;
    fb0 = fd1 > ld2;
    double ld3 = 756.9406474737002;
    Thought lo4 = Thought373.getInstance(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
    boolean lb5 = true;
    boolean lb6 = false;
    Thought lo7 = Thought249.getInstance(ld3, fd0, fd1, ld2, lb1, lb5, lb6, fb0);
    fb1 = ld3 > fd0;
    boolean lb8 = true;
    Thought lo9 = Thought219.getInstance(fo0, fo1, fo0, fo1, lb1, lb5, lb6, lb8);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(ld2, ld3, fd0, fd1);
}
    lb1 = !lb5;
    Output.points[8][5] -= ld2;

Thought.STACK_COUNTER++;
return lb6;
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
    boolean lb0 = true;
        ab1 = ab2 || ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    ab2 = fd1 > fd0;
    ab3 = fd1 > fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab4 = fo0.m2(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought168.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = true;
        fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb1 = lb0 && lb2;
    ab1 = !ab2;
    ab3 = !ab4;
    fd0 *= -1;
    boolean lb3 = false;
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
    ad1 *= -1;
    fb1 = ad2 < ad3;
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    Output.points[8][6] -= fd1;
    Output.points[8][7] -= ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
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
    ab1 = ad1 < ad2;
    ab2 = ad3 > ad4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ab3 = ab4 || fb0;
    Output.points[8][8] += ad4;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
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
    Thought lo0 = Thought140.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    Thought lo1 = Thought53.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd1 < fd0;
    Thought lo2 = Thought72.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        fb1 = fb0 && fb1;
        fd1 *= -1;
        fb0 = fd0 < fd1;
if(ao4 != null){
          ao3 = ao4.m4();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1);
}
    double ld0 = 584.1818959117252;
    ad4 *= -1;
    fd0 = fd1 + ld0;

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
    fd1 = fd0 + fd1;
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Output.points[0][0] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    ab3 = fd0 < fd1;
    Thought lo0 = Thought81.getInstance(ab4, fb0, fb1, ab1);
    fd0 = fd1 + fd0;
    boolean lb1 = true;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = lb1 || ab1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb1, ab1, ab2);
}
    boolean lb2 = false;
    double ld3 = 683.8726273785218;
    ab2 = !ab3;
    fd0 = fd1 - ld3;
    ab4 = !fb0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 - ld3;
    boolean lb4 = true;
if(ao3 != null){
      ao3.m3(fd0, fd1, ld3, fd0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 728.0421387981486;
    ld0 = ad1 + ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
        ad1 = ad2 - ad3;
        ab2 = ab3 || ab4;
    fb0 = ad4 > fd0;
    Thought lo1 = Thought22.getInstance();
    fd1 = ld0 - ad1;
    ad2 = ad3 + ad4;
    boolean lb2 = false;
    double ld3 = 546.3111594350818;
    fb0 = fb1 && lb2;
    ad4 *= -1;
    boolean lb4 = false;
if(ao1 != null){
      ao1.m1(lb4, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld3, lb2, lb4, ab1, ab2);
}
    Output.points[0][1] -= ad1;
    double ld5 = 401.15068460026845;
    Thought lo6 = Thought226.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    fd0 = fd1 + ld0;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought365.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
    Thought lo2 = Thought340.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[0][2] += fd1;
    Thought lo3 = Thought9.getInstance(fb1, lb0, fb0, fb1);
    fd0 *= -1;
    Thought lo4 = Thought319.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    double ld5 = 298.91326874903456;

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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    double ld0 = 566.0375297901764;
    fb1 = ld0 < fd0;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !ab1;

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
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    Output.points[0][3] += fd1;
    Thought lo0 = Thought191.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fb1 = fb0 || fb1;
    Output.points[0][4] -= fd0;
    Output.points[0][5] += fd1;
    double ld1 = 612.8814072936066;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[0][6] -= fd0;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    double ld2 = 860.7886768821538;
    fb0 = fb1 || fb0;
    Thought lo3 = Thought127.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought367.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ab4 = ad3 > ad4;
    fd0 = fd1 - ad1;
    ad2 *= -1;
    Thought lo1 = Thought200.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
    ad1 = ad2 + ad3;
    ab3 = ad4 > fd0;
    ab4 = fb0 || fb1;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[0][7] -= fd1;
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought213.getInstance();
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
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
    fb1 = fb0 && fb1;
    fb0 = ad1 < ad2;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = ad3 < ad4;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = lb1 || fb0;
    fd0 = fd1 - ad1;
        ad2 = ad3 - ad4;
    fb1 = fd0 > fd1;
    Thought lo2 = Thought325.getInstance(ao1, ao2, ao3, ao4);

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
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 > fd0;
    Thought lo0 = Thought42.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    ab3 = fd1 > fd0;
    ab4 = fd1 < fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > fd0;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fb0 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, ab1, ab2, ab3);
}
    double ld1 = 696.9137069620921;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0, fb0, fb1, lb2, ab1);
}
    ab2 = fd1 < ld1;
    fd0 = fd1 + ld1;
    ab3 = fd0 > fd1;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb1, lb2, ab1, ab2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = ad1 > ad2;
    ab4 = ad3 < ad4;
    Output.points[0][8] -= fd0;
    fd1 = ad1 + ad2;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = !fb1;
if(fo1 != null){
      ab1 = fo1.m2(ad3, ad4, fd0, fd1);
}
    ab2 = ad1 < ad2;
    ab3 = !ab4;
    boolean lb0 = true;
    ab4 = ad3 < ad4;
    double ld1 = 637.7734917082465;
    fb0 = fb1 || lb0;
    Thought lo2 = Thought105.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1);
    ad1 = ad2 - ad3;
    ad4 *= -1;
    boolean lb3 = true;
    if (lb3) {
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
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb0 = !fb1;
    double ld0 = 287.85858422984535;
    ld0 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 < fd0;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab4 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    double ld0 = 796.1138195405937;
    fb0 = ld0 < fd0;
    fb1 = fd1 < ld0;
    ab1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = ld0 > fd0;

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
    boolean lb0 = true;
    if (lb0) {
        fb0 = ad1 < ad2;
        fb1 = !lb0;
        ad3 = ad4 + fd0;
        fb0 = fd1 > ad1;
        Output.points[1][0] -= ad2;
        double ld1 = 533.154124171579;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
}
        fb0 = fb1 && lb2;
        Thought lo3 = Thought193.getInstance();
        ad3 *= -1;
        boolean lb4 = true;
        ad4 *= -1;
        lb4 = lb0 || fb0;
        fd0 *= -1;
        double ld5 = 962.2348895482429;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb2, lb4, lb0);
}
        } else if (lb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld0 = 215.69446187290058;
    ad2 = ad3 - ad4;
    ab2 = fd0 > fd1;
    ld0 = ad1 - ad2;
    ab3 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1);
}
    double ld1 = 632.8662889485811;
    ad1 = ad2 + ad3;
    boolean lb2 = false;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ab4 = ld1 > ad1;

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
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, fb0);
}
    Output.points[1][1] -= fd1;
    Output.points[1][2] += fd0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    Output.points[1][3] -= fd1;
    lb0 = fb0 || fb1;
    lb0 = fd0 > fd1;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    double ld2 = 325.85848133973127;
    lb0 = lb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0, fb1, lb0, lb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, lb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0);
}
        fb1 = !lb0;
        lb1 = fd1 < ld2;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld2, fd0);
}
        if (fb0) {
            Thought lo3 = Thought309.getInstance(ao2, ao3, ao4, fo0, fd1, ld2, fd0, fd1);
if(ao1 != null){
              fo1 = ao1.m4();
}
            boolean lb4 = true;
}}
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
    ad1 = ad2 + ad3;
if(ao1 != null){
      ao1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    ad4 = fd0 - fd1;
        fb1 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 104.34028251507523;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb1 = false;
    fd0 = fd1 + ld0;
    boolean lb2 = true;
    Thought lo3 = Thought9.getInstance(ad1, ad2, ad3, ad4);

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
    ab2 = ab3 || ab4;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought204.getInstance();
    fb0 = fd0 > fd1;
if(ao1 != null){
      ao1.m2(fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
    double ld1 = 451.85457737960695;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
    double ld3 = 745.6316860326172;
    fd0 *= -1;
if(ao2 != null){
      lb2 = ao2.m2(fd1, ld1, ld3, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb2;
    double ld4 = 399.9304063998339;
    ab1 = fd0 < fd1;
    ab2 = !ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ab1 = ao3.m2(ld1, ld3, ld4, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld1, ld3, ld4, fd0);
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
    boolean lb0 = true;
    ad1 = ad2 - ad3;
    if (lb0) {
        double ld1 = 18.305506547376382;
        ad3 = ad4 + fd0;
if(ao2 != null){
          fd1 = ao2.m3();
}
if(ao4 != null){
          ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
        fb0 = ld1 > ad1;
        Thought lo2 = Thought276.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
        ab3 = fd1 > ld1;
        ab4 = fb0 || fb1;
        lb0 = ab1 || ab2;
        } else {
if(ao3 != null){
          ao3.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        Output.points[1][4] += fd1;
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
    Thought lo0 = Thought85.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    Thought lo1 = Thought62.getInstance(fo0, fo1, fo0, fo1);
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd0 < fd1;
    Thought lo2 = Thought357.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;

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
    fb1 = fd0 < fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought118.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought301.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
    lb2 = fd0 > fd1;
    Thought lo3 = Thought387.getInstance(fo1, fo0, fo1, fo0);
    Thought lo4 = Thought314.getInstance(fd0, fd1, fd0, fd1);
    Thought lo5 = Thought286.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Thought lo6 = Thought176.getInstance();
    Output.points[1][5] -= fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    boolean lb7 = true;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = false;
    fd1 = fd0 + fd1;
    double ld4 = 564.3118185229968;
    boolean lb5 = true;
    Thought lo6 = Thought93.getInstance(ld4, fd0, fd1, ld4);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0);
}
    lb0 = lb1 || lb2;
if(fo1 != null){
      fo1.m2();
}
    lb3 = fd1 < ld4;
if(fo0 != null){
      fd0 = fo0.m3(lb5, fb0, fb1, lb0);
}
    double ld7 = 303.23963925230925;
    fd0 = fd1 - ld4;
    ld7 = fd0 - fd1;

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
