package genetic;
import java.util.ArrayList;
class Thought325 extends Thought{
private static ArrayList<Thought325> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 430.9241164862505;
private double fd1 = 859.594398533302;
private Thought fo0 = null;
private Thought fo1 = null;
Thought325 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought325 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought325 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought325 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought325 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought325 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought325 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought325 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought325 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought325 instance = new Thought325 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought325 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought325 instance = new Thought325 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought325 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought325 instance = new Thought325 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought325 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought325 instance = new Thought325 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought325 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought325 instance = new Thought325 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought325 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought325 instance = new Thought325 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought325 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought325 instance = new Thought325 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought325 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought325 instance = new Thought325 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    for(int i0=0; i0<10; i0++){
        }
    fd0 *= -1;
    Thought lo0 = Thought168.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    boolean lb2 = true;
    double ld3 = 147.9461230940313;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    lb1 = lb2 && fb0;
    boolean lb4 = true;
    Thought lo5 = Thought145.getInstance(ld3, fd0, fd1, ld3);
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
    fd1 *= -1;
    ab2 = ab3 && ab4;
    fd0 = fd1 - fd0;
    Output.points[4][3] += fd1;
    fd0 = fd1 + fd0;
    double ld0 = 625.078628597378;
    fb0 = fb1 && ab1;
    fd0 = fd1 + ld0;
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
    Thought lo2 = Thought282.getInstance();
    fd1 = ld0 + fd0;
    ab1 = !ab2;
    boolean lb3 = true;
    ab2 = fd1 < ld0;
    ab3 = fd0 > fd1;
    ab4 = ld0 < fd0;

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
    boolean lb0 = false;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    fb0 = ad4 < fd0;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    lb0 = fd0 > fd1;
    Thought lo1 = Thought94.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
    Output.points[4][4] += fd0;
    fd1 = ad1 - ad2;
    fb1 = ad3 > ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > ad1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    if (fb1) {
        Output.points[4][5] -= ad1;
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
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ab2 && ab3;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m2(ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
    Thought lo0 = Thought365.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    ab1 = fd0 > fd1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought76.getInstance(fo0, fo1, fo0, fo1);
    fd1 *= -1;
    boolean lb3 = false;
    double ld4 = 359.8287006518614;
    double ld5 = 713.9374029485182;
    Output.points[4][6] -= ld4;
    lb1 = ld5 < ad1;
        lb3 = ab1 || ab2;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld4, ld5, ad1);
}
if(fo0 != null){
      ab4 = fo0.m2();
}
    fb0 = fb1 || lb1;
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb3, lb6, ab1, ab2);
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
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
        fb1 = fd1 > fd0;
    Thought lo0 = Thought234.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought136.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    Output.points[4][7] += fd1;
    fd0 *= -1;
    double ld2 = 878.6194422045943;
    Output.points[4][8] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2);
}
if(ao1 != null){
          fb0 = ao1.m2();
}
if(ao3 != null){
          ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;
    fd0 = fd1 - ld2;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1, fb0, fb1, lb3, fb0);
}
if(ao3 != null){
      ao3.m1(ld2, fd0, fd1, ld2, fb1, lb3, fb0, fb1);
}
    fd0 *= -1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought38.getInstance(ao2, ao3, ao4, fo0);
    fb1 = ad1 < ad2;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    boolean lb2 = false;
    lb1 = lb2 && fb0;
    Output.points[5][0] += ad1;
    double ld3 = 563.6123062151553;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld3;
    boolean lb4 = true;
if(ao2 != null){
      ao1 = ao2.m4();
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
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb1 = !ab1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    if (fb0) {
        Thought lo1 = Thought145.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
        boolean lb2 = false;
        boolean lb3 = false;
        boolean lb4 = false;
        fd0 = fd1 + fd0;
        lb0 = ab1 && ab2;
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
    ad2 = ad3 + ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Output.points[5][1] += fd1;
    fb0 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        fb1 = ad3 > ad4;
    ab1 = fd0 > fd1;
    Thought lo0 = Thought239.getInstance(ad1, ad2, ad3, ad4);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
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
    fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought370.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    double ld1 = 658.7975851389444;
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 < fd1;
    Thought lo2 = Thought354.getInstance(ld1, fd0, fd1, ld1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    Thought lo3 = Thought323.getInstance();
        fd1 = ld1 - fd0;
    boolean lb4 = true;
    Output.points[5][2] += fd1;
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb4, lb5, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb4, lb5, fb0, fb1);
}
    boolean lb6 = false;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld1, fd0, lb4, lb5, lb6, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb4, lb5, lb6);
}
    fd1 = ld1 - fd0;
    fd1 = ld1 - fd0;
    fd1 = ld1 + fd0;

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
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ab1 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
    ab3 = fd0 > fd1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fd0 = fo1.m3();
}
    boolean lb0 = true;
    boolean lb1 = true;
    double ld2 = 262.8682552134961;
    Thought lo3 = Thought334.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, lb0, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, ab1, ab2);
}
    double ld4 = 276.5457603089277;
        double ld5 = 479.02305277435437;
    boolean lb6 = false;
    Thought lo7 = Thought365.getInstance(fo0, fo1, fo0, fo1);
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(ld4, ld5, fd0, fd1);
}
    Thought lo8 = Thought228.getInstance(fo0, fo1, fo0, fo1, ld2, ld4, ld5, fd0);
    ab4 = fd1 > ld2;

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
        fb0 = ad2 < ad3;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, fb0);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
    lb0 = fd0 > fd1;
    boolean lb2 = true;
    lb1 = !lb2;
        fb0 = !fb1;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, lb0, lb1, lb2, fb0);
}
    fb1 = !lb0;
    boolean lb3 = true;
    fd0 *= -1;
    fd1 *= -1;
    double ld4 = 707.4486462759413;
    lb1 = ld4 > ad1;
    double ld5 = 626.8787640524718;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;

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
    if (ab2) {
        boolean lb0 = true;
        ab2 = ad1 > ad2;
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
        ab3 = ad2 > ad3;
        ab4 = ad4 < fd0;
        fb0 = fd1 > ad1;
        Output.points[5][3] += ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo0.m2();
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
if(ao2 != null){
      ao2.m2(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    double ld0 = 233.64350507713576;
    fd0 = fd1 - ld0;
    fb1 = fd0 > fd1;
    boolean lb1 = true;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    fb0 = fd0 < fd1;
    ld0 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
        Thought lo2 = Thought350.getInstance(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb1);
    boolean lb3 = false;
if(ao2 != null){
      lb3 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    fb0 = !fb1;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
if(ao2 != null){
      lb1 = ao2.m2();
}
    double ld4 = 565.9010774047042;
    ld4 *= -1;
    fd0 = fd1 + ld0;
    lb3 = ld4 > fd0;

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
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 980.0458000414894;
    Thought lo1 = Thought86.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = ad3 > ad4;
    fd0 = fd1 - ld0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
    Output.points[5][4] += ad1;
    ad2 *= -1;
    fb0 = fb1 && fb0;
    boolean lb2 = true;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ld0 = ad1 + ad2;
if(ao2 != null){
      fb0 = ao2.m2(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
    double ld3 = 422.22740081048113;
    fb1 = lb2 && fb0;
if(ao2 != null){
      ao2.m1();
}
    fb1 = ld3 < ad1;
    boolean lb4 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
        } else {
if(ao1 != null){
          fd1 = ao1.m3(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 - fd0;
        fb1 = ab1 || ab2;
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
                Thought lo0 = Thought292.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
        fd1 = fd0 + fd1;
        double ld1 = 44.89621160878818;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab2 = ab3 && ab4;
    double ld0 = 634.0399448397209;
if(ao1 != null){
      ao1.m3(ld0, ad1, ad2, ad3);
}
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
}
    ad2 = ad3 - ad4;
    double ld1 = 922.3725792612341;
    fb0 = ad4 < fd0;
    fb1 = !ab1;
    boolean lb2 = false;
    Thought lo3 = Thought291.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    boolean lb4 = false;
    ab4 = fd1 > ld0;
    double ld5 = 542.7438292272262;
    ld1 *= -1;
    fb0 = ld5 > ad1;
    fb1 = lb2 || lb4;
    ab1 = ad2 < ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ld1, ld5, ad1, ad2, lb2, lb4, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 + fd0;

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
    fb1 = fb0 && fb1;
    Output.points[5][5] -= fd0;
    fb0 = fd1 < fd0;
    Thought lo0 = Thought86.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
        double ld2 = 450.8523680254028;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb3 = fb0 && fb1;
    lb1 = !lb3;
    ld2 = fd0 + fd1;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, lb3, lb4, fb0, fb1);
}
    fd0 = fd1 + ld2;
    fd0 = fd1 - ld2;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld2, fd0, lb1, lb3, lb4, fb0);
}
    boolean lb5 = false;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    double ld0 = 896.8017118535812;
    fb0 = fb1 || ab1;
    Output.points[5][6] += ld0;
    ab2 = fd0 > fd1;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    Thought lo1 = Thought166.getInstance();
    fd1 = ld0 + fd0;
if(fo0 != null){
          ab4 = fo0.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    Output.points[5][7] -= fd1;
    fb1 = ld0 < fd0;
    double ld2 = 213.89537704164042;
    ab1 = ab2 || ab3;
    Thought lo3 = Thought109.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, ab4, fb0, fb1, ab1);
    boolean lb4 = true;

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
    boolean lb0 = true;
    double ld1 = 635.3326030569466;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    Output.points[5][8] += fd0;
    fd1 = ld1 - ad1;
    double ld2 = 684.3556194563175;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb3);
}
    fb0 = fb1 && lb0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          lb3 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo1.m1(ad1, ad2, ad3, ad4);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
    boolean lb0 = true;
    Thought lo1 = Thought194.getInstance();
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    Thought lo2 = Thought369.getInstance(ab4, fb0, fb1, lb0);
    double ld3 = 776.4169220464495;
    ad2 = ad3 + ad4;
    ab1 = ab2 || ab3;
    boolean lb4 = true;
    Thought lo5 = Thought272.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ad1, ab3, ab4, fb0, fb1);
    boolean lb6 = false;
    boolean lb7 = false;
    lb0 = ad2 > ad3;
    lb4 = lb6 && lb7;

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
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    double ld1 = 393.21154189856895;
if(ao2 != null){
      lb0 = ao2.m2(ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    ld1 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
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
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m1(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Output.points[6][0] -= ad3;
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb1 = ao3.m2(ad1, ad2, ad3, ad4);
}
    if (fb0) {
        Thought lo0 = Thought298.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
        ad3 = ad4 - fd0;
if(ao2 != null){
          fd1 = ao2.m3();
}
if(ao4 != null){
          ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
        ad1 = ad2 + ad3;
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    fd0 *= -1;
    ab1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought350.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought173.getInstance(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    ab4 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought20.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought249.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    boolean lb4 = false;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    boolean lb5 = true;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    boolean lb6 = true;
    Output.points[6][1] += fd0;

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
    ab1 = ad1 < ad2;
    ab2 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    double ld0 = 750.6432542516212;
    boolean lb1 = true;
    Thought lo2 = Thought57.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb3 = true;
    fd1 = ld0 - ad1;
    boolean lb4 = false;
if(ao4 != null){
      ad2 = ao4.m3(lb4, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][2] += fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd0 *= -1;
        fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    double ld1 = 658.7023476120936;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0);
}
    fb1 = lb0 && fb0;
    fb1 = fd1 < ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    Thought lo2 = Thought112.getInstance();
    lb0 = fd1 > ld1;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb3, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb3, fb0, fb1, lb0);
}
    if (lb3) {
if(fo0 != null){
          fb0 = fo0.m2(fd1, ld1, fd0, fd1, fb1, lb0, lb3, fb0);
}
if(fo1 != null){
          ld1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb3, fb0);
}
        Thought lo4 = Thought285.getInstance(fo0, fo1, fo0, fo1);
        fd0 = fd1 - ld1;
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
    Thought lo0 = Thought175.getInstance(fd1, fd0, fd1, fd0);
    double ld1 = 766.5055596505044;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    Output.points[6][3] += fd1;
    ab1 = ld1 > fd0;
    ab2 = !ab3;
    ab4 = fd1 < ld1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    ab1 = ab2 && ab3;

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
    ad2 = ad3 + ad4;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    boolean lb1 = false;
    lb1 = fd0 > fd1;
    fb0 = ad1 < ad2;
    fb1 = lb0 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    fb0 = ad3 > ad4;
    Output.points[6][4] -= fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb0, lb1, fb0);
}
    fb1 = ad4 > fd0;
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought112.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
    double ld3 = 576.7692815623222;
    lb0 = lb1 && fb0;
    boolean lb4 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;

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
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      ab4 = fo0.m2();
}
        fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
    Thought lo0 = Thought143.getInstance(ab1, ab2, ab3, ab4);
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought174.getInstance(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    ad4 = fd0 + fd1;
    ab1 = ab2 || ab3;
    ab4 = ad1 > ad2;
    Thought lo2 = Thought223.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
    Output.points[6][5] -= ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 + ad3;
    ab3 = ab4 && fb0;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
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
      fd0 = ao1.m3();
}
if(ao2 != null){
      ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought395.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(lb0, lb1, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
    double ld0 = 636.2111781314304;
    Output.points[6][6] += ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
              ao1.m3(ld0, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    fb0 = fd1 < ld0;
    double ld1 = 302.77963921387743;
    boolean lb2 = true;
    fb0 = fb1 || lb2;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3);
}
    double ld3 = 387.50233009712434;
if(ao1 != null){
      ao1.m2();
}
    Thought lo4 = Thought275.getInstance(fb1, lb2, fb0, fb1);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 || lb2;
    ld0 = ld1 + ld3;

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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = fb1 && ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ab2 = ao3.m2(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    if (ab3) {
        boolean lb0 = false;
        fd1 = fd0 - fd1;
        Thought lo1 = Thought231.getInstance();
        fd0 = fd1 + fd0;
if(ao3 != null){
          fd1 = ao3.m3(ab3, ab4, fb0, fb1);
}
        Thought lo2 = Thought52.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
if(ao2 != null){
          ao2.m1(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
        ab1 = fd0 < fd1;
        ab2 = !ab3;
        fd0 = fd1 + fd0;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
        fd1 *= -1;
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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[6][7] -= ad4;
        ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
    double ld0 = 602.7586765686115;
    ab2 = ad4 > fd0;
    Output.points[6][8] += fd1;
    ab3 = ab4 && fb0;
    fb1 = !ab1;
    ab2 = ld0 < ad1;
    Output.points[7][0] -= ad2;

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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
    Thought lo2 = Thought108.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      lb0 = fo0.m2();
}
    lb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    lb0 = !lb1;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, lb1);
}
    boolean lb3 = true;
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb3, lb4, fb0, fb1);
}
    lb0 = fd0 < fd1;
    lb1 = lb3 || lb4;
    Thought lo5 = Thought124.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);

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
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    double ld0 = 332.27506834730065;
    fd0 *= -1;
    fd1 = ld0 + fd0;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd1 < fd0;
        fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought220.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd1 *= -1;
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
}
