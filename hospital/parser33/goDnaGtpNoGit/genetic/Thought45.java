package genetic;
import java.util.ArrayList;
class Thought45 extends Thought{
private static ArrayList<Thought45> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 159.3173510654636;
private double fd1 = 971.0306727491225;
private Thought fo0 = null;
private Thought fo1 = null;
Thought45 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought45 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought45 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought45 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought45 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought45 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought45 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought45 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought45 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    double ld1 = 597.7642575304324;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
}
    fb0 = fb1 && lb0;
    double ld3 = 194.4846739096007;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[7][2] += ld1;
if(fo1 != null){
      ld3 = fo1.m3(fd0, fd1, ld1, ld3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld3);
}
    lb2 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[7][3] += fd0;
    lb0 = !lb2;
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(lb0, lb2, fb0, fb1);
}
    double ld4 = 636.0049002716711;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ld3, ld4, fd0, lb2, fb0, fb1, lb0);
}
    Output.points[7][4] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld3, ld4, fd0, lb2, fb0, fb1, lb0);
}
    lb2 = !fb0;
    Thought lo5 = Thought140.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb2, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ld1 + ld3;
if(fo0 != null){
      fb1 = fo0.m2(ld4, fd0, fd1, ld1);
}
    boolean lb6 = true;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld0 = 859.3162019339586;
    boolean lb1 = true;
    boolean lb2 = true;
    lb1 = !lb2;
    fd0 = fd1 - ld0;
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
    boolean lb3 = false;
    ab4 = ld0 > fd0;

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
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    Thought lo1 = Thought100.getInstance(lb0, fb0, fb1, lb0);
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = ad1 > ad2;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb0, lb2, fb0, fb1);
}
    ad1 = ad2 + ad3;
    lb0 = lb2 && fb0;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
    Output.points[7][5] += ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
    lb3 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    boolean lb4 = true;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
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
    double ld0 = 190.82580269000314;
    boolean lb1 = true;
if(fo0 != null){
      ld0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
    Output.points[7][6] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
    ab1 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ld0;
    Thought lo2 = Thought72.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
    ab3 = !ab4;
    ad1 = ad2 - ad3;
    Output.points[7][7] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld0;
    double ld3 = 396.5642989421383;
    ld3 = ad1 - ad2;
    Output.points[7][8] -= ad3;

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
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    fb0 = fd1 > fd0;
    Thought lo1 = Thought232.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
    fb1 = lb0 || fb0;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      fd0 = ao3.m3(fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought90.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    fd1 *= -1;
    Thought lo3 = Thought128.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = !lb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
    Thought lo4 = Thought318.getInstance(fd1, fd0, fd1, fd0);
    lb0 = !fb0;
    double ld5 = 693.8473239511711;
    fb1 = !lb0;
    fd0 = fd1 + ld5;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld5, fd0, fd1);
}
if(fo1 != null){
      ld5 = fo1.m3();
}
    Output.points[8][0] -= fd0;

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
    fb1 = ad1 > ad2;
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ad1 = ad2 - ad3;
    double ld0 = 604.8508095594711;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought217.getInstance(ao1, ao2, ao3, ao4);
    ad3 *= -1;
            Output.points[8][1] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
    ad2 = ad3 + ad4;
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
}
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb3 = true;
    ad3 *= -1;
    Output.points[8][2] += ad4;
if(ao2 != null){
      ao2.m1(fd0, fd1, ld0, ad1);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[8][3] += fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    double ld0 = 657.4354949504025;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld1 = 506.437093871619;

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
    ab1 = !ab2;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0);
}
    boolean lb1 = true;
    ab1 = fd1 < ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    ab2 = fd1 < ad1;
    ad2 = ad3 + ad4;
    Output.points[8][4] -= fd0;
    boolean lb2 = true;
    ab2 = !ab3;
if(ao3 != null){
      fd1 = ao3.m3();
}
    Thought lo3 = Thought195.getInstance(ab4, fb0, fb1, lb0);
    lb1 = lb2 || ab1;
    ad1 = ad2 + ad3;
    ab2 = !ab3;
    boolean lb4 = true;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 - ad4;
    double ld5 = 603.5604409877636;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld5, lb0, lb1, lb2, lb4);
}
    ab1 = ad1 > ad2;
    ad3 *= -1;

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
    fb1 = fd0 > fd1;
    double ld0 = 332.7415017490308;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought286.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld0 = fd0 + fd1;
    fb1 = !fb0;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    fb1 = fb0 && fb1;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
    ld0 = fd0 - fd1;
    Thought lo3 = Thought130.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
    fb1 = fd0 < fd1;
    lb2 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb4 = false;
    fb0 = fb1 || lb2;
    lb4 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, lb2, lb4);
}
    fb0 = fb1 || lb2;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Output.points[8][5] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
        fd0 = fd1 - fd0;
    double ld1 = 535.7834610296675;
    ab4 = fb0 && fb1;
    lb0 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 || fb1;
    boolean lb2 = true;
    lb0 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
    ab1 = fd0 > fd1;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    ab2 = ab3 || ab4;
    Thought lo3 = Thought66.getInstance();
if(fo0 != null){
      fo0.m3(fb0, fb1, lb0, lb2);
}
    ab1 = fd0 < fd1;
    boolean lb4 = true;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
}
    double ld5 = 903.2043916580775;
    double ld6 = 386.76628843275665;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fb0 = !fb1;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    double ld1 = 479.2674857244701;
    if (fb0) {
        fb1 = ad4 > fd0;
        lb0 = fb0 && fb1;
        double ld2 = 97.64989791435046;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
        fd1 *= -1;
        fb0 = !fb1;
        ld2 *= -1;
        ld1 = ad1 - ad2;
        Thought lo3 = Thought32.getInstance(fo0, fo1, fo0, fo1);
        double ld4 = 389.4031685097524;
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
    Thought lo0 = Thought258.getInstance(ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ab2 = ad3 > ad4;
    ab3 = fd0 > fd1;
    ab4 = ad1 < ad2;
    Thought lo1 = Thought44.getInstance();
    fb0 = !fb1;
    boolean lb2 = true;
if(fo0 != null){
      lb2 = fo0.m2(ab1, ab2, ab3, ab4);
}
    fb0 = ad3 < ad4;
    fb1 = lb2 || ab1;
    if (ab2) {
        Thought lo3 = Thought50.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
        lb2 = ab1 && ab2;
        ab3 = ad3 < ad4;
        Output.points[8][6] += fd0;
if(fo1 != null){
          fd1 = fo1.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb2);
}
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
    Output.points[8][7] += fd0;
    double ld0 = 166.2104613247143;
    boolean lb1 = false;
    Thought lo2 = Thought358.getInstance(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb1);
    double ld3 = 770.2638887992824;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    double ld4 = 349.5264712939235;
if(fo0 != null){
      ld3 = fo0.m3(ld4, fd0, fd1, ld0);
}
    Thought lo5 = Thought338.getInstance(fo1, ao1, ao2, ao3, ld3, ld4, fd0, fd1);
    if (fb0) {
        boolean lb6 = false;
        fb0 = !fb1;
        double ld7 = 630.2538879105106;
        boolean lb8 = false;
        lb6 = lb8 && lb1;
        fb0 = fb1 && lb6;
        boolean lb9 = false;
        double ld10 = 650.3121372585845;
        ld7 = ld10 - ld0;
        ld3 = ld4 + fd0;
        fd1 *= -1;
        boolean lb11 = true;
if(ao4 != null){
          ao4.m1();
}
        Thought lo12 = Thought19.getInstance(lb8, lb9, lb11, lb1);
        boolean lb13 = false;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld7, ld10, ld0, ld3, lb1, fb0, fb1, lb6);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Output.points[8][8] -= fd0;
    Thought lo0 = Thought180.getInstance(ao3, ao4, fo0, fo1);
    fd1 *= -1;
    fb0 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    double ld1 = 964.9996804348089;
    boolean lb2 = true;
    Thought lo3 = Thought372.getInstance();
    fb0 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb2, fb0, fb1);
}
    double ld4 = 651.8774684024381;
    Output.points[0][0] += fd0;
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ld4, ad1, ad2, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 || lb2;
    ad3 = ad4 - fd0;
    fb0 = fb1 || lb2;
if(ao4 != null){
      ao4.m3(fd1, ld1, ld4, ad1, fb0, fb1, lb2, fb0);
}
    ad2 = ad3 - ad4;
    fb1 = fd0 < fd1;
    ld1 = ld4 - ad1;
    boolean lb5 = false;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, lb2, lb5, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      lb2 = ao4.m2(ad2, ad3, ad4, fd0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fd0 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2();
}
if(ao1 != null){
      fd1 = ao1.m3(ab1, ab2, ab3, ab4);
}
        boolean lb1 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
        ab4 = fd0 < fd1;
    fb0 = fd0 < fd1;
    double ld2 = 834.4364887124116;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, fb1, lb0, lb1, ab1);
}
    ab2 = !ab3;
    if (ab4) {
        fb0 = fb1 || lb0;
        boolean lb3 = true;
        lb0 = fd0 < fd1;
        boolean lb4 = false;
if(ao1 != null){
          ld2 = ao1.m3(fd0, fd1, ld2, fd0, lb0, lb1, ab1, ab2);
}
        Thought lo5 = Thought277.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
        boolean lb6 = false;
        lb3 = !lb4;
        lb6 = lb0 && lb1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        Output.points[0][1] += fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
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
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo0 = Thought152.getInstance(ab1, ab2, ab3, ab4);
    ad3 = ad4 - fd0;
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    Thought lo1 = Thought165.getInstance(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    ab4 = fb0 || fb1;
    ab1 = ad3 > ad4;
    for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
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
    double ld0 = 892.2459151049434;
    boolean lb1 = false;
    Thought lo2 = Thought388.getInstance(lb1, fb0, fb1, lb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      lb1 = fo0.m2(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    if (lb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
        fb0 = fb1 && lb1;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
          fo0.m1();
}
        fb0 = fd0 < fd1;
        Thought lo3 = Thought261.getInstance(fb1, lb1, fb0, fb1);
        ld0 = fd0 + fd1;
        } else if (lb1) {
        ld0 = fd0 - fd1;
        ld0 *= -1;
        fd0 = fd1 + ld0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
        double ld4 = 526.6190470222439;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
        } else if (fb1) {
        boolean lb5 = true;
        ld0 = fd0 + fd1;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    Output.points[0][2] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    lb0 = lb1 || ab1;
    Output.points[0][3] += fd0;
    Output.points[0][4] -= fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb0;
    Thought lo2 = Thought218.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
    boolean lb3 = false;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb3);
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    Thought lo0 = Thought289.getInstance(fd0, fd1, ad1, ad2);
    fb1 = fb0 && fb1;
    ad3 = ad4 + fd0;
    fb0 = fd1 > ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    double ld1 = 738.4886077241064;
    Thought lo2 = Thought339.getInstance();
    ld1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
    boolean lb3 = true;
    boolean lb4 = true;
    lb3 = ad4 > fd0;
    fd1 = ld1 - ad1;
    boolean lb5 = false;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb4, lb5, fb0, fb1);
}
    lb3 = ld1 < ad1;
    double ld6 = 486.1694140398876;
    Output.points[0][5] -= ad1;
    boolean lb7 = false;
    ad2 = ad3 - ad4;

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
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 712.9776077826103;
    fd0 = fd1 - ld1;
    Output.points[0][6] -= ad1;
    Output.points[0][7] -= ad2;
    ad3 = ad4 + fd0;
    ab3 = ab4 && fb0;
    fb1 = lb0 && ab1;
    ab2 = ab3 && ab4;
    fd1 = ld1 - ad1;
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);
}
    double ld2 = 786.0107236289549;

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
    fb0 = fb1 && fb0;
        Thought lo0 = Thought382.getInstance();
    fb1 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought304.getInstance(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
    lb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    lb1 = fb0 && fb1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    lb1 = !fb0;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
          fd0 = ao2.m3(fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    double ld0 = 340.94165636740183;
    double ld1 = 726.1918195130216;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, ld1, ad1, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought292.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
    Thought lo3 = Thought191.getInstance(ao2, ao3, ao4, fo0);
    boolean lb4 = false;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
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
    ab1 = !ab2;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab3 = ab4 && fb0;
    fb1 = !ab1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    double ld0 = 603.5097350791898;
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
    ld0 = fd0 - fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought39.getInstance(fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
    Output.points[0][8] += fd1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    lb2 = ld0 > fd0;
    ab1 = fd1 < ld0;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, fd0, fd1);
}
    double ld3 = 663.7583815457265;
    ld0 = ld3 - fd0;
    Output.points[1][0] -= fd1;

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
    ab1 = ad2 < ad3;
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    double ld0 = 226.15038981005048;
    ab4 = ad4 < fd0;
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
      ao3.m3(fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
    ab2 = fd1 > ld0;
    boolean lb2 = false;
    Thought lo3 = Thought211.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, ad1, ad2, fb1, lb1, lb2, ab1);
}
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd1 = ao2.m3(ld0, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    ld0 = ad1 - ad2;
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    lb2 = ab1 && ab2;

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
    fd1 *= -1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought97.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fd0 *= -1;

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
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 959.7671239845286;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
    Output.points[1][1] += fd1;
    ld0 = fd0 - fd1;
    Thought lo1 = Thought271.getInstance(fo0, fo1, fo0, fo1);
    ab4 = fb0 && fb1;
    boolean lb2 = false;
    double ld3 = 490.9270718660075;
    boolean lb4 = true;
    lb2 = !lb4;
        for(int i0=0; i0<10; i0++){
        ld0 = ld3 - fd0;
if(fo0 != null){
          fd1 = fo0.m3(ld0, ld3, fd0, fd1);
}
        ld0 *= -1;
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
    fb0 = ad2 < ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    fb1 = ad3 < ad4;
    double ld0 = 31.685099772996335;
    ad4 = fd0 - fd1;
    Thought lo1 = Thought95.getInstance();
    fb0 = ld0 < ad1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Output.points[1][2] += ad2;
    boolean lb2 = true;
    Output.points[1][3] += ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
    ad1 *= -1;
    fb0 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    ad4 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
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
    double ld0 = 978.4419550556937;
    double ld1 = 791.8327302557508;
    ab1 = ab2 && ab3;
    Thought lo2 = Thought69.getInstance(ld0, ld1, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    ab2 = ld0 > ld1;
    boolean lb3 = true;
    ab2 = ab3 && ab4;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb3, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
}
    lb3 = ab1 || ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb3);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 - ad3;
    boolean lb4 = false;
if(fo0 != null){
      ab1 = fo0.m2(ad4, fd0, fd1, ld0);
}
    Output.points[1][4] -= ld1;
    ab2 = ab3 && ab4;
    fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
    boolean lb5 = false;

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
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 107.51278505761745;
if(fo1 != null){
      fo1.m2();
}
    fb1 = ld0 > fd0;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(lb1, fb0, fb1, lb1);
}
    fd1 *= -1;
    fb0 = fb1 || lb1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
        lb1 = !fb0;
        fd0 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(ao4 != null){
          lb1 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        ld0 = fd0 - fd1;
        fb1 = lb1 || fb0;
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
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    fb0 = ad4 < fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = ad1 + ad2;
        fb1 = !lb0;
        fb0 = ad3 < ad4;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
        boolean lb1 = true;
        double ld2 = 436.2579361185342;
        Thought lo3 = Thought391.getInstance();
        }
    Thought lo4 = Thought263.getInstance(fb1, lb0, fb0, fb1);
    Thought lo5 = Thought317.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    fb1 = ad2 > ad3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    Thought lo6 = Thought264.getInstance(ao1, ao2, ao3, ao4);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 || ab4;
    fd1 = fd0 - fd1;
if(ao3 != null){
      fb0 = ao3.m2();
}
if(ao4 != null){
      fd0 = ao4.m3(fb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    ab4 = fb0 || fb1;
    Output.points[1][5] += fd0;
    ab1 = fd1 < fd0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    boolean lb0 = true;
    ab2 = fd1 < fd0;
if(ao4 != null){
      ao4.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
    Thought lo3 = Thought251.getInstance(fo0, fo1, ao1, ao2, lb0, lb1, lb2, ab1);
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    ab2 = fd0 > fd1;
    fd0 = fd1 + fd0;
    ab3 = fd1 < fd0;

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
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought288.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
    lb0 = !ab1;
    ab2 = ad3 > ad4;
if(fo0 != null){
      fo0.m3();
}
    fd0 *= -1;
    boolean lb2 = true;
    ab2 = ab3 || ab4;
    boolean lb3 = true;
if(ao1 != null){
      fo1 = ao1.m4(ab4, fb0, fb1, lb0);
}
    lb2 = lb3 || ab1;
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb2);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, lb3, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;

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
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    Output.points[1][6] -= fd1;
    Output.points[1][7] -= fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought268.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[1][8] += fd0;
    Thought lo1 = Thought15.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);

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
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought3.getInstance(fd0, fd1, fd0, fd1);
    Thought lo2 = Thought330.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m3(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Output.points[2][0] += fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
    Output.points[2][1] += fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    lb1 = fd1 < fd0;
    Thought lo2 = Thought265.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought275.getInstance();
    double ld4 = 832.2260502347997;
    double ld5 = 445.48823107539624;
    boolean lb6 = true;
if(fo0 != null){
      fo0.m3(lb6, fb0, fb1, lb0);
}
    Thought lo7 = Thought108.getInstance(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld4, lb1, lb6, fb0, fb1);
    ld5 = fd0 + fd1;
    ld4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld5, fd0, fd1, ld4, lb0, lb1, lb6, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb6);
}
    fb0 = fb1 && lb0;
    boolean lb8 = false;
    lb1 = !lb6;
    lb8 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
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
