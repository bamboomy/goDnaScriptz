package genetic;
import java.util.ArrayList;
class Thought135 extends Thought{
private static ArrayList<Thought135> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 114.13582623929962;
private double fd1 = 479.1522067224419;
private Thought fo0 = null;
private Thought fo1 = null;
Thought135 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought135 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought135 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought135 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought135 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought135 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought135 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought135 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought135 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought135 instance = new Thought135 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought135 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought135 instance = new Thought135 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought135 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought135 instance = new Thought135 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought135 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought135 instance = new Thought135 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought135 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought135 instance = new Thought135 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought135 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought135 instance = new Thought135 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought135 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought135 instance = new Thought135 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought135 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought135 instance = new Thought135 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[2][4] += fd0;
    Output.points[2][5] -= fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    lb0 = fb0 || fb1;
    lb0 = fd1 > fd0;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    lb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    if (fb0) {
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
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
      fd1 = fo0.m3();
}
    fd0 *= -1;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
    ab4 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
}
    Thought lo2 = Thought45.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    double ld3 = 926.0038626707365;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb0, lb1, ab1);
}
    ab2 = !ab3;
    double ld4 = 132.4770999729941;
    Thought lo5 = Thought38.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(ld3, ld4, fd0, fd1);
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
    boolean lb0 = true;
    ad1 = ad2 - ad3;
    fb0 = !fb1;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      lb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
        Output.points[2][6] += fd0;
    Thought lo1 = Thought142.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    double ld2 = 311.754614299081;
    fb0 = ad1 > ad2;
    if (fb1) {
        boolean lb3 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, lb0, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        } else {
        lb0 = ad3 < ad4;
        fb0 = fb1 && lb0;
        fd0 *= -1;
        fd1 *= -1;
        ld2 = ad1 - ad2;
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
      ab2 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m1();
}
    ad4 = fd0 - fd1;
    Thought lo0 = Thought156.getInstance(ab4, fb0, fb1, ab1);
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ad1 < ad2;
    ab2 = ab3 && ab4;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;

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
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    boolean lb0 = true;
    lb0 = fd1 > ad1;
    if (fb0) {
        ad2 *= -1;
        Output.points[2][7] -= ad3;
        ad4 = fd0 + fd1;
        boolean lb1 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, lb0);
}
if(ao3 != null){
          ad1 = ao3.m3(ao4, fo0, fo1, ao1);
}
        ad2 *= -1;
        Thought lo2 = Thought222.getInstance(ad3, ad4, fd0, fd1);
        ad1 = ad2 + ad3;
        ad4 *= -1;
        fb0 = !fb1;
        Output.points[2][8] += fd0;
        boolean lb3 = true;
        lb1 = fd1 < ad1;
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
    ab2 = fd1 > fd0;
    ab3 = ab4 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
    ab4 = fb0 && fb1;
    double ld0 = 35.22496598025222;
    double ld1 = 847.2758250029635;
if(fo0 != null){
      ab1 = fo0.m2(ld1, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    fb0 = ld1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Output.points[3][0] -= fd1;
if(fo0 != null){
      fb1 = fo0.m2(ld0, ld1, fd0, fd1);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Output.points[3][1] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    double ld0 = 560.284003998534;
    ld0 *= -1;
    ab1 = ab2 || ab3;
    boolean lb1 = true;
    ab3 = ab4 || fb0;
    fb1 = lb1 || ab1;
    ab2 = ad1 < ad2;
    ab3 = ad3 > ad4;

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
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 617.2261059482298;
    Thought lo1 = Thought16.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    lb2 = ld0 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = true;
if(fo0 != null){
      lb3 = fo0.m2(fb0, fb1, lb2, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1, fb0, fb1, lb2, lb3);
}
    Output.points[3][2] -= ld0;
    Thought lo4 = Thought284.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb3);
    fd0 *= -1;
    boolean lb5 = true;
    lb5 = fd1 < ld0;
    fb0 = fb1 && lb2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        }
    ab1 = fd0 < fd1;
    double ld1 = 150.34632938821935;
    ab2 = ld1 > fd0;
    ab3 = ab4 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
    ab2 = ab3 || ab4;
    fb0 = ld1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ld1 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ld1, fd0);
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
    if (fb1) {
        double ld0 = 660.210313454634;
        Thought lo1 = Thought82.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
if(fo1 != null){
          fo0 = fo1.m4();
}
        double ld2 = 164.44106490137466;
        double ld3 = 353.1497489147643;
        Thought lo4 = Thought358.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(fo1 != null){
          fo1.m1(fd1, ld0, ld2, ld3, fb0, fb1, fb0, fb1);
}
        fb0 = ad1 > ad2;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        Thought lo5 = Thought107.getInstance(ad3, ad4, fd0, fd1);
        fb1 = ld0 > ld2;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        if (fb1) {
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought81.getInstance(ab2, ab3, ab4, fb0);
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
    fd1 *= -1;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
    fb1 = ab1 || ab2;
    ab3 = ad2 > ad3;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    double ld1 = 302.7738199727745;
    ad1 *= -1;
    Thought lo2 = Thought339.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
}
    fb1 = ad3 > ad4;
    ab1 = ab2 && ab3;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought341.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fb0 = !fb1;
    lb1 = fd0 < fd1;
    double ld2 = 400.585831560678;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ld2 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
        Output.points[3][3] += fd0;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0);
}
        fd1 = ld2 + fd0;
        fd1 = ld2 + fd0;
        boolean lb3 = false;
if(ao1 != null){
          fo1 = ao1.m4(fd1, ld2, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2);
}
        fb0 = !fb1;
        double ld4 = 44.34841741425114;
        Thought lo5 = Thought347.getInstance();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = ad2 < ad3;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    ad3 = ad4 + fd0;
    boolean lb1 = true;
    Output.points[3][4] -= fd1;
    lb0 = ad1 > ad2;
    lb1 = ad3 < ad4;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    boolean lb2 = false;
    boolean lb3 = false;
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, lb3, fb0, fb1);
}
    lb0 = lb1 || lb2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Thought lo0 = Thought249.getInstance(ao1, ao2, ao3, ao4);
    ab1 = fd0 > fd1;
    boolean lb1 = false;
    ab1 = ab2 || ab3;
    fd0 *= -1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo3 = Thought166.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 - fd1;
    boolean lb4 = true;
    fd0 *= -1;
    double ld5 = 481.58629394648653;
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ld5;
    Thought lo6 = Thought211.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld5, fd0, lb1, lb2, lb4, ab1);

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
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 - ad4;
    double ld0 = 209.90178442918145;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ad4 > fd0;
    Output.points[3][5] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[3][6] += ld0;
    ab1 = !ab2;
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    boolean lb2 = true;
    Output.points[3][7] -= fd0;
    fd1 *= -1;
    double ld3 = 128.8710181465;
    ld0 = ld3 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m1();
}
    fd1 = ld0 + ld3;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb1);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
    double ld1 = 234.45768282284402;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought52.getInstance(fd1, ld1, fd0, fd1);
    Output.points[3][8] -= ld1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3();
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb3);
}
    Thought lo4 = Thought285.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb0, lb3);
    double ld5 = 466.4129584210791;
    fb0 = fb1 && lb0;
    lb3 = ld5 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld1, ld5, fd0, fb1, lb0, lb3, fb0);
}
    fd1 = ld1 + ld5;
    fb1 = lb0 && lb3;
    double ld6 = 410.6710062369582;
    ld6 = fd0 - fd1;
    double ld7 = 70.90699024124953;
    Thought lo8 = Thought9.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb3);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = ld1 < ld5;

Thought.STACK_COUNTER++;
return ld6;
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
    double ld0 = 588.761996369175;
    Thought lo1 = Thought322.getInstance(fd0, fd1, ld0, fd0);
    ab2 = fd1 > ld0;
    fd0 = fd1 + ld0;
    ab3 = ab4 || fb0;
    boolean lb2 = true;
        for(int i0=0; i0<10; i0++){
        Output.points[4][0] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
        fb0 = fb1 && lb2;
        ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
        boolean lb3 = false;
if(fo0 != null){
          fo0.m2();
}
        double ld4 = 950.9919100331124;
        lb3 = ld4 > ld0;
        lb2 = ab1 || ab2;
        ab3 = fd0 < fd1;
        ab4 = fb0 && fb1;
        Output.points[4][1] += ld4;
if(fo1 != null){
          ld0 = fo1.m3(lb3, lb2, ab1, ab2);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld4, ld0, fd0, ab3, ab4, fb0, fb1);
}
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
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[4][2] -= ad1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 274.70477318993187;
    Thought lo1 = Thought59.getInstance(fo1, fo0, fo1, fo0);
    fb0 = !fb1;
    Output.points[4][3] -= ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 && fb0;
    fb1 = ld0 > ad1;
    ad2 = ad3 + ad4;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    double ld2 = 566.1695064719521;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    boolean lb3 = true;
    Output.points[4][4] -= ld2;
if(fo0 != null){
      fo0.m3();
}
    if (lb3) {
        Thought lo4 = Thought3.getInstance(fb0, fb1, lb3, fb0);
        boolean lb5 = true;
        fb0 = fb1 && lb5;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb3, fb0, fb1, lb5);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, ld2, lb3, fb0, fb1, lb5);
}
        boolean lb6 = true;
        lb6 = ad1 < ad2;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb5);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          lb6 = fo0.m2(ad3, ad4, fd0, fd1);
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
    ab1 = !ab2;
    Thought lo1 = Thought208.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Thought lo2 = Thought305.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
    fd0 *= -1;
    boolean lb3 = true;
        lb3 = fd1 < ad1;
    Output.points[4][5] -= ad2;

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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
    double ld0 = 272.586970958755;
    double ld1 = 766.6962849695159;
    Thought lo2 = Thought245.getInstance(fo1, ao1, ao2, ao3);
    fb1 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(ld1, fd0, fd1, ld0);
}
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld0);
}
    double ld4 = 610.5369039953539;
    fb0 = fb1 || lb3;
    fb0 = ld1 > ld4;
    fb1 = lb3 || fb0;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(ao1 != null){
      fb1 = ao1.m2(lb3, fb0, fb1, lb3);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, ld1, ld4, fb0, fb1, lb3, fb0);
}
    fb1 = lb3 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ld1, fb1, lb3, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb3, fb0, fb1, lb3);
}
if(ao3 != null){
      ld4 = ao3.m3(ao4, fo0, fo1, ao1);
}
    Output.points[4][6] += fd0;
    fd1 *= -1;
    fb0 = fb1 || lb3;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ld1, ld4, fd0);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Output.points[4][7] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 *= -1;
if(ao4 != null){
      ao4.m1(fb1, fb0, fb1, fb0);
}
    Output.points[4][8] += ad1;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
if(fo0 != null){
          fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    lb0 = fd1 > ad1;
    double ld1 = 233.36330001066452;
    ad1 *= -1;
    fb0 = fb1 && lb0;
    boolean lb2 = false;
        for(int i0=0; i0<10; i0++){
        lb2 = ad2 < ad3;
        fb0 = fb1 || lb0;
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
    ab2 = ab3 && ab4;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    boolean lb0 = true;
    fd1 *= -1;
    lb0 = ab1 && ab2;
    boolean lb1 = true;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    boolean lb2 = false;
    fd1 *= -1;
    fd0 = fd1 - fd0;

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
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 || ab3;
    Thought lo0 = Thought211.getInstance(ad2, ad3, ad4, fd0);
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    fb0 = fb1 || ab1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo1 = Thought118.getInstance(ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    ab4 = ad2 > ad3;
    fb0 = ad4 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    boolean lb2 = true;
    fd0 = fd1 - ad1;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    lb2 = ad2 < ad3;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb3 = false;
    ab4 = !fb0;
    ad4 *= -1;
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 < fd1;
        ad1 *= -1;
        Thought lo4 = Thought0.getInstance(ad2, ad3, ad4, fd0);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    Thought lo0 = Thought242.getInstance(fb1, fb0, fb1, fb0);
    Output.points[5][0] += fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    Output.points[5][1] += fd0;
    Thought lo1 = Thought340.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    lb2 = fb0 || fb1;
    Thought lo3 = Thought171.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    double ld4 = 75.60236482844525;
    Thought lo5 = Thought189.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0);
    fd1 = ld4 - fd0;
    lb2 = fd1 > ld4;
    Output.points[5][2] -= fd0;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m3(fb0, fb1, lb2, fb0);
}
    fb1 = lb2 || fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld4, fd0, fd1, fb1, lb2, fb0, fb1);
}
    boolean lb6 = true;
    lb2 = !lb6;
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld4, fb0, fb1, lb2, lb6);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    ab1 = ab2 || ab3;
    boolean lb0 = false;
    boolean lb1 = false;
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
        Output.points[5][3] -= fd1;
        double ld3 = 621.5192678445145;
if(fo1 != null){
          ld3 = fo1.m3();
}
if(fo0 != null){
          fo0.m3(ab1, ab2, ab3, ab4);
}
        boolean lb4 = true;
        ab4 = fb0 || fb1;
        fd0 = fd1 + ld3;
        for(int i1=0; i1<10; i1++){
            lb4 = lb0 || lb1;
            boolean lb5 = true;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, lb1, lb2, ab1, ab2);
}
            ab3 = fd1 < ld3;
            ab4 = fb0 || fb1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 686.1626704226203;
    Output.points[5][4] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + ad1;
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[5][5] -= ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    fb0 = !fb1;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    lb1 = fb0 && fb1;
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, ld0, ad1);
}
    Thought lo2 = Thought336.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    if (fb0) {
if(fo1 != null){
          fb1 = fo1.m2();
}
        lb1 = fd1 < ld0;
        fb0 = ad1 < ad2;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
        Output.points[5][6] -= ld0;
if(fo0 != null){
          fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
        Output.points[5][7] -= fd0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
        Output.points[5][8] -= fd1;
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
    ab1 = !ab2;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ab3 = ad3 < ad4;
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
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
      ao1.m2(fb1, fb0, fb1, fb0);
}
    double ld0 = 519.992870136039;
    Output.points[6][0] += ld0;
    boolean lb1 = true;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
    double ld2 = 565.8224775211398;
if(ao1 != null){
      lb1 = ao1.m2(fd0, fd1, ld0, ld2, fb0, fb1, lb1, fb0);
}
    double ld3 = 65.66061583790832;
    fb1 = !lb1;
    boolean lb4 = false;
    boolean lb5 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb4, lb5, fb0, fb1);
}
    lb1 = lb4 || lb5;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;

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
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fb1 = ad1 > ad2;
    fb0 = fb1 && fb0;
    ad3 = ad4 - fd0;
    double ld0 = 660.5875729510868;
    boolean lb1 = true;
    Thought lo2 = Thought148.getInstance(fd0, fd1, ld0, ad1);
    if (fb0) {
        fb1 = lb1 || fb0;
        fb1 = !lb1;
        for(int i0=0; i0<10; i0++){
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
            }
        } else if (fb0) {
        fd1 = ld0 + ad1;
        Thought lo3 = Thought276.getInstance();
        ad2 = ad3 + ad4;
        } else {
        fb1 = fd0 < fd1;
if(ao1 != null){
          ld0 = ao1.m3(lb1, fb0, fb1, lb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    Output.points[6][1] -= fd1;
    fb0 = fd0 > fd1;
    fb1 = ab1 && ab2;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    ab2 = !ab3;
    double ld1 = 246.5412764885617;
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    fb1 = lb0 && ab1;
    fd1 *= -1;
    ab2 = ld1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, fd0, fd1);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1);
}
    Thought lo2 = Thought195.getInstance();

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
    ad2 *= -1;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(lb0, ab1, ab2, ab3);
}
    ab4 = ad3 > ad4;
    fd0 = fd1 + ad1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
if(ao2 != null){
      ab2 = ao2.m2(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);
}
    boolean lb1 = false;
    double ld2 = 568.0744285014259;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad3 = ad4 + fd0;
    boolean lb3 = true;
    boolean lb4 = false;
    boolean lb5 = false;
    lb5 = ab1 || ab2;
    if (ab3) {
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld2, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          ld2 = fo0.m3();
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
    Thought lo0 = Thought267.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    double ld1 = 185.8703272786937;
    fb0 = ld1 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd1 = ld1 + fd0;
    Output.points[6][2] += fd1;
    fb1 = !fb0;
    Output.points[6][3] += ld1;
    Thought lo2 = Thought75.getInstance(fd0, fd1, ld1, fd0);
    Output.points[6][4] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
        double ld3 = 595.2158159283143;

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
    Output.points[6][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[6][6] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought51.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fd1 *= -1;
    fb1 = fd0 < fd1;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought372.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    lb2 = !fb0;

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
    Thought lo0 = Thought98.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought82.getInstance(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fd1 = fd0 - fd1;
    Output.points[6][7] -= fd0;
    Thought lo3 = Thought214.getInstance(fo0, fo1, fo0, fo1);
    fd1 = fd0 - fd1;
    boolean lb4 = false;
if(fo0 != null){
      lb4 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo5 = Thought257.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb4, fb0, fb1);
}
    boolean lb6 = true;
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
}
