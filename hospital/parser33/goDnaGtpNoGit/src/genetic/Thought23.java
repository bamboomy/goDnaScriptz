package genetic;
import java.util.ArrayList;
class Thought23 extends Thought{
private static ArrayList<Thought23> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 781.0321539445259;
private double fd1 = 145.19159374633492;
private Thought fo0 = null;
private Thought fo1 = null;
Thought23 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought23 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought23 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought23 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought23 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought23 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought23 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought23 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought23 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought263.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought237.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        boolean lb3 = true;
        fd1 *= -1;
        fb0 = fd0 > fd1;
        fb1 = !lb3;
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[8][8] -= fd0;
    boolean lb0 = true;
    Thought lo1 = Thought238.getInstance(fd1, fd0, fd1, fd0);
    Thought lo2 = Thought359.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    if (ab1) {
        Thought lo3 = Thought18.getInstance(ab2, ab3, ab4, fb0);
        Thought lo4 = Thought235.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        Thought lo5 = Thought7.getInstance(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
        double ld6 = 942.7283614465306;
        Thought lo7 = Thought127.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld6, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld6, fd0, fd1);
}
        ab4 = !fb0;
        Output.points[0][0] += ld6;
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb8 = true;
        fb0 = fd0 < fd1;
        Thought lo9 = Thought218.getInstance(fb1, lb8, lb0, ab1);
        ab2 = ab3 && ab4;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ld6, fd0, fd1, ld6, fb0, fb1, lb8, lb0);
}
        Thought lo10 = Thought4.getInstance(fd0, fd1, ld6, fd0, ab1, ab2, ab3, ab4);
        boolean lb11 = true;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb8);
}
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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = ad1 < ad2;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    fb1 = ad2 > ad3;
    double ld0 = 876.1420938159916;
        double ld1 = 488.82529482708514;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2();
}
    fb0 = fd1 > ld0;
    fb1 = ld1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;

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
    Thought lo0 = Thought240.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought338.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    Thought lo3 = Thought89.getInstance(ad4, fd0, fd1, ad1);
    ab1 = !ab2;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb2);
}
    Thought lo4 = Thought384.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    Output.points[0][1] += ad4;
    fd0 *= -1;
    boolean lb5 = true;
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, lb2, lb5, ab1);
}
    ab2 = ad4 < fd0;
    fd1 = ad1 + ad2;

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
    Thought lo0 = Thought294.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fd0 *= -1;
    fd1 *= -1;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    Thought lo1 = Thought127.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    Thought lo0 = Thought134.getInstance();
    ad3 = ad4 - fd0;
if(ao3 != null){
          ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ad2 = ao3.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = ad1 > ad2;
    fb0 = ad3 < ad4;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
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
    ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    double ld0 = 187.52488225322756;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought253.getInstance(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0);
    Thought lo2 = Thought392.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought353.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);

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
    ab1 = ad1 > ad2;
    ab2 = ad3 < ad4;
    fd0 = fd1 + ad1;
    Output.points[0][2] += ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab3 = ad3 < ad4;
if(ao2 != null){
      ab4 = ao2.m2(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    ad1 = ad2 + ad3;
    Thought lo0 = Thought368.getInstance(fb0, fb1, ab1, ab2);
    ad4 = fd0 + fd1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought344.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    if (ab1) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        ab2 = ad3 > ad4;
        ab3 = ab4 && fb0;
if(ao4 != null){
          fb1 = ao4.m2(fd0, fd1, ad1, ad2);
}
        ab1 = ab2 || ab3;
        ab4 = ad3 < ad4;
        fb0 = fd0 > fd1;
        for(int i0=0; i0<10; i0++){
            boolean lb2 = true;
            ad1 = ad2 + ad3;
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
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    if (fb0) {
        Thought lo0 = Thought47.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
        fb1 = fb0 && fb1;
        Thought lo1 = Thought270.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
        fb0 = fb1 && fb0;
        fb1 = fd1 > fd0;
        fb0 = fb1 || fb0;
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
    boolean lb0 = false;
    lb0 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    ab3 = ab4 || fb0;
        fd0 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1();
}
    boolean lb1 = false;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, lb2, fb0);
}
    ad1 = ad2 - ad3;
    boolean lb3 = true;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb2, lb3, fb0, fb1);
}
    ad3 = ad4 + fd0;
    Thought lo4 = Thought236.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, lb2, lb3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
    Thought lo5 = Thought143.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    double ld6 = 107.8718854868948;
    fb1 = !lb0;
    ad4 = fd0 + fd1;
    ld6 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb1 = lb2 || lb3;
    double ld7 = 215.92261230581877;
    boolean lb8 = false;
    boolean lb9 = false;
    ld7 = ad1 - ad2;
if(fo1 != null){
      fo1.m1(lb8, lb9, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, lb1, lb2, lb3);
}

Thought.STACK_COUNTER++;
return lb8;
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
      ab2 = fo0.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought161.getInstance(fd0, fd1, ad1, ad2);
    Output.points[0][3] += ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad2 = fo0.m3(ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought270.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
    double ld2 = 827.4645348612945;
    ab4 = ld2 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb3 = true;
    boolean lb4 = false;
    ab1 = fd1 < ld2;
    ad1 = ad2 - ad3;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[0][4] += fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    Output.points[0][5] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
    double ld1 = 767.9797113916261;
    Output.points[0][6] -= fd0;
    fd1 = ld1 - fd0;

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
    fb0 = fb1 || fb0;
    double ld0 = 58.32125394022195;
    fb1 = ld0 < ad1;
    ad2 *= -1;
    boolean lb1 = true;
    ad3 *= -1;
if(ao2 != null){
      ao2.m2(ad4, fd0, fd1, ld0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    double ld2 = 786.2878821168371;
    Thought lo3 = Thought325.getInstance();
    lb1 = fb0 || fb1;
if(ao3 != null){
      ao3.m1(lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    double ld4 = 536.8029168699161;
    for(int i0=0; i0<10; i0++){
        Output.points[0][7] += ad3;
        Thought lo5 = Thought214.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
if(ao3 != null){
          ao2 = ao3.m4(ld2, ld4, ad1, ad2, fb0, fb1, lb1, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
    double ld0 = 385.64525344779895;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
    boolean lb1 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
    double ld2 = 69.5798226404849;
    double ld3 = 922.0668354919577;
    ld3 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(lb1, ab1, ab2, ab3);
}
    boolean lb4 = true;
    ab3 = ab4 || fb0;
    fb1 = !lb1;
    Output.points[0][8] += fd0;
    lb4 = ab1 || ab2;
    ab3 = fd1 < ld0;
    boolean lb5 = false;
    ld2 *= -1;
        Output.points[1][0] += ld3;
    ab3 = fd0 > fd1;
    ld0 = ld2 - ld3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought323.getInstance(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
    ab4 = ad4 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fb1 && ab1;
    ab2 = fd1 > ad1;
    ab3 = ad2 < ad3;
    Thought lo1 = Thought157.getInstance(fo1, ao1, ao2, ao3);
    Output.points[1][1] -= ad4;
    Output.points[1][2] += fd0;
if(ao4 != null){
      fd1 = ao4.m3(ad1, ad2, ad3, ad4);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    Output.points[1][3] += fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    if (fb0) {
        fb1 = fb0 && fb1;
        fd0 = fd1 - fd0;
        fb0 = !fb1;
        boolean lb0 = false;
        lb0 = fb0 || fb1;
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
    Output.points[1][4] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought125.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    double ld1 = 732.0461383961273;
    Thought lo2 = Thought12.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;
    boolean lb3 = true;
    ab2 = ld1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb4 = true;
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb3, lb4);
}
        ab1 = !ab2;
    ld1 *= -1;
    ab3 = fd0 < fd1;
    boolean lb5 = false;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    fb0 = !fb1;
    Output.points[1][5] += ad3;
    ad4 *= -1;
    Thought lo0 = Thought242.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
if(fo1 != null){
          lb1 = fo1.m2(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    double ld2 = 809.9161851725711;

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
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    double ld1 = 684.2409292123547;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ld1);
}
    boolean lb2 = false;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab4 = !fb0;
if(fo0 != null){
      fo0.m1();
}
    Output.points[1][6] += fd1;
    Output.points[1][7] += ld1;
    fb1 = !lb0;
    Thought lo3 = Thought201.getInstance(lb2, ab1, ab2, ab3);
    Thought lo4 = Thought45.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, ad1, ad2, lb2, ab1, ab2, ab3);
}
    Output.points[1][8] -= ad3;
    ab4 = !fb0;

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
    fd1 *= -1;
            fb1 = !fb0;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 && fb0;
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo0 = Thought200.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    Output.points[2][0] -= fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    boolean lb1 = true;

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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 *= -1;
    ad1 = ad2 - ad3;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
if(ao3 != null){
      ao3.m3();
}
    ad2 = ad3 + ad4;
if(ao4 != null){
      fb1 = ao4.m2(lb0, fb0, fb1, lb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought105.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
    fd0 = fd1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought70.getInstance(fd1, fd0, fd1, fd0);
    ab3 = ab4 || fb0;
    Thought lo2 = Thought104.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(ao4 != null){
      fd0 = ao4.m3();
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb3);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 && lb3;
    ab1 = ab2 || ab3;
    fd1 = fd0 - fd1;
    boolean lb4 = true;
    ab3 = fd0 < fd1;
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    Thought lo5 = Thought208.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);

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
    Output.points[2][1] += ad1;
    boolean lb0 = true;
    double ld1 = 156.38631665232774;
    Thought lo2 = Thought164.getInstance();
    Output.points[2][2] -= ad1;
if(ao1 != null){
      ao1.m1(ab1, ab2, ab3, ab4);
}
    double ld3 = 629.0012950575835;
    fb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
    double ld4 = 573.9276305234938;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, ld3, ld4, fb1, lb0, ab1, ab2);
}
    boolean lb5 = false;
    if (ab2) {
        } else {
if(ao2 != null){
          ao2.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
        lb0 = !lb5;
        ab1 = !ab2;
        boolean lb6 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
        Thought lo7 = Thought239.getInstance(ao3, ao4, fo0, fo1);
        for(int i0=0; i0<10; i0++){
if(ao2 != null){
              ao1 = ao2.m4(fd0, fd1, ld1, ld3);
}
            fb1 = !lb6;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld4, ad1, ad2, ad3);
}
}}
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
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3();
}
    Thought lo0 = Thought395.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought189.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought272.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;

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
        boolean lb0 = false;
    lb0 = fd1 > fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought153.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[2][3] -= fd1;
if(fo1 != null){
      ab1 = fo1.m2();
}
    double ld2 = 759.6964914053245;
if(fo0 != null){
      ld2 = fo0.m3(ab2, ab3, ab4, fb0);
}
        fb1 = !lb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ld2;
    fb1 = fd0 > fd1;
    ld2 = fd0 - fd1;
    Thought lo3 = Thought104.getInstance(fo0, fo1, fo0, fo1);
    Output.points[2][4] -= ld2;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld2, fd0);
}
    Thought lo4 = Thought350.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
if(fo1 != null){
      lb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
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
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fb0 = fd0 < fd1;
    Thought lo0 = Thought383.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought77.getInstance(fo1, fo0, fo1, fo0);
    fb1 = ad1 < ad2;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    fb1 = ad2 < ad3;
    Output.points[2][5] -= ad4;
    fb0 = fd0 > fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    double ld2 = 237.01382395953186;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb3, fb0, fb1);
}
    Thought lo4 = Thought106.getInstance(fd0, fd1, ld2, ad1, lb3, fb0, fb1, lb3);
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld2;
    fb0 = !fb1;
    lb3 = ad1 > ad2;
    boolean lb5 = false;

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
    ad2 = ad3 - ad4;
    Output.points[2][6] += fd0;
    double ld0 = 290.76069772773445;
    double ld1 = 75.65863207448444;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, ld0, ld1, ad1);
}
    Thought lo2 = Thought171.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    fb1 = ab1 && ab2;
    ab3 = fd1 < ld0;

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
    Thought lo0 = Thought270.getInstance();
    Output.points[2][7] -= fd1;
    fb1 = !fb0;
    Thought lo1 = Thought151.getInstance(fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    boolean lb3 = false;
    lb2 = lb3 || fb0;
    Thought lo4 = Thought159.getInstance(fd1, fd0, fd1, fd0);
    double ld5 = 47.57975287774782;
    fd0 *= -1;
    double ld6 = 297.8008473513473;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld5, ld6);
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
if(ao1 != null){
      ad1 = ao1.m3();
}
        ad2 *= -1;
    ad3 = ad4 - fd0;
    boolean lb0 = false;
    lb0 = fd1 < ad1;
    Thought lo1 = Thought281.getInstance(fb0, fb1, lb0, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    double ld2 = 949.5003722519451;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld2, ad1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    boolean lb3 = true;
    ad2 *= -1;
if(ao4 != null){
          ad3 = ao4.m3(fo0, fo1, ao1, ao2, lb0, lb3, fb0, fb1);
}
    ad4 = fd0 + fd1;
    double ld4 = 72.37121906536899;
    boolean lb5 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    lb0 = lb3 || lb5;
    ld2 *= -1;
    double ld6 = 203.42749470486692;
    Thought lo7 = Thought175.getInstance(ld4, ld6, ad1, ad2);
    double ld8 = 392.0207281988186;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ab3 = ao4.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    ab3 = ab4 || fb0;
    Thought lo0 = Thought367.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    fb0 = !fb1;
    lb1 = !ab1;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        ab2 = fd0 < fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
        double ld2 = 429.05861208318424;
if(ao4 != null){
          ao4.m1();
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
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought224.getInstance(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
    Output.points[2][8] += ad1;
    boolean lb1 = false;
    ad2 = ad3 - ad4;
    lb1 = !ab1;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab1 = fd0 > fd1;
    boolean lb3 = true;
    ad1 = ad2 + ad3;
    double ld4 = 790.6528339385643;
if(ao2 != null){
      ab1 = ao2.m2(ad3, ad4, fd0, fd1);
}
    ab2 = ab3 && ab4;
    ld4 = ad1 + ad2;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      lb3 = fo0.m2(fo1, ao1, ao2, ao3, ld4, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
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
    Thought lo0 = Thought33.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    Thought lo2 = Thought371.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld3 = 930.8102545225048;
    Output.points[3][0] += fd0;
    fd1 = ld3 - fd0;
    fd1 = ld3 + fd0;
    double ld4 = 749.0034485799773;
    Thought lo5 = Thought171.getInstance();
    Thought lo6 = Thought95.getInstance(fb0, fb1, lb1, fb0);
    fd0 = fd1 - ld3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld3, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld3, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    ld4 *= -1;
    fb1 = lb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld3, ld4, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld3, ld4, fd0);
}
    Thought lo7 = Thought34.getInstance();
    lb1 = fd1 < ld3;
    fb0 = !fb1;
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb1, fb0);
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
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[3][1] -= fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    double ld1 = 249.03640715636053;
    Output.points[3][2] += ld1;
    Output.points[3][3] -= fd0;
    fd1 = ld1 + fd0;
    double ld2 = 567.8981018195541;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ld2);
}
    lb0 = !fb0;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
}
    fd0 = fd1 + ld1;
    fb0 = fb1 || lb0;

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
    boolean lb0 = true;
    boolean lb1 = true;
    double ld2 = 113.05098548128568;
    boolean lb3 = false;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(lb1, lb3, lb4, fb0);
}
    fb1 = fd0 > fd1;
    Thought lo5 = Thought86.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, lb0, lb1, lb3, lb4);
    double ld6 = 424.13189529487613;
if(fo1 != null){
      fo0 = fo1.m4(ld6, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
    lb3 = lb4 || fb0;
    Output.points[3][4] += ld6;
    fb1 = fd0 < fd1;
    lb0 = ld2 > ld6;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, lb3, lb4, fb0);
}
    boolean lb7 = true;
    fd0 = fd1 + ld2;
    fb0 = ld6 < fd0;
    fd1 *= -1;

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
