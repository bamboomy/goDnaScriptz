package genetic;
import java.util.ArrayList;
class Thought165 extends Thought{
private static ArrayList<Thought165> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 106.2238255376417;
private double fd1 = 306.5234052578196;
private Thought fo0 = null;
private Thought fo1 = null;
Thought165 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought165 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought165 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought165 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought165 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought165 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought165 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought165 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought165 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought165 instance = new Thought165 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought165 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought165 instance = new Thought165 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought165 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought165 instance = new Thought165 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought165 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought165 instance = new Thought165 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought165 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought165 instance = new Thought165 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought165 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought165 instance = new Thought165 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought165 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought165 instance = new Thought165 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought165 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought165 instance = new Thought165 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0.m3();
}
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    double ld1 = 357.8730351011876;
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
    Output.points[4][6] -= ld1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
        fb0 = fb1 || lb0;
    double ld2 = 824.9114952107931;
    fb0 = !fb1;
    Thought lo3 = Thought298.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, lb0, fb0, fb1, lb0);
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(ld1, ld2, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = ld2 > fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd1 = fo1.m3(ld1, ld2, fd0, fd1);
}
        ld1 *= -1;
        fb1 = lb0 || fb0;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
        fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    double ld1 = 692.4986893415595;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld1, fd0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
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
    ad1 *= -1;
    fb1 = !fb0;
    double ld0 = 20.333834248146186;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought325.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = !fb0;
if(fo1 != null){
      ad2 = fo1.m3(fb1, fb0, fb1, fb0);
}
    double ld2 = 193.6439198700371;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld2, ad1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought140.getInstance(ad2, ad3, ad4, fd0);
    Thought lo4 = Thought155.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ld2, ad1);
    double ld5 = 491.7916280880624;
    boolean lb6 = false;
    ad1 = ad2 + ad3;
    double ld7 = 79.59864750866292;
    boolean lb8 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad3 = fo1.m3(lb8, fb0, fb1, lb6);
}
    lb8 = fb0 || fb1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, lb6, lb8, fb0, fb1);
}
if(fo1 != null){
      ld5 = fo1.m3(ld7, ad1, ad2, ad3, lb6, lb8, fb0, fb1);
}
    lb6 = ad4 < fd0;

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
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab3 = !ab4;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    fb1 = ad3 < ad4;
    Thought lo0 = Thought343.getInstance();
    boolean lb1 = false;
    double ld2 = 494.89198746050437;
if(fo1 != null){
      fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 - fd1;
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
    fd0 *= -1;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    double ld1 = 553.1273649302983;
    boolean lb2 = false;
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0, lb0, lb2, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ld1, fd0, fd1, ld1, lb0, lb2, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, lb0, lb2, fb0, fb1);
}
    lb0 = !lb2;
    Output.points[4][7] += fd0;
    fd1 = ld1 + fd0;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(fd1, ld1, fd0, fd1);
}
    boolean lb4 = true;

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
    ad1 *= -1;
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Thought lo2 = Thought25.getInstance();
if(ao1 != null){
      lb0 = ao1.m2(lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, lb3, fb0, fb1, lb0);
}
    ad2 = ad3 - ad4;
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, lb3, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
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
      ao1 = ao2.m4();
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    double ld0 = 236.92584115050767;
    fb1 = ld0 > fd0;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    Output.points[4][8] += fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
    ab2 = ld0 > fd0;
    ab3 = fd1 > ld0;
    fd0 = fd1 - ld0;
    ab4 = fd0 < fd1;
    ld0 *= -1;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    boolean lb1 = false;
    Thought lo2 = Thought61.getInstance(fd1, ld0, fd0, fd1);
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
    double ld3 = 845.4072394874444;

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
    Output.points[5][0] += ad2;
    Output.points[5][1] += ad3;
if(ao1 != null){
      ao1.m3();
}
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao2.m3(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ad1;
    ab4 = fb0 && fb1;
    boolean lb0 = true;
if(ao3 != null){
      ao3.m3(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
    Output.points[5][2] -= fd1;
    Output.points[5][3] -= ad1;
    ab4 = ad2 < ad3;
    ad4 = fd0 - fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
    double ld1 = 638.0518783863777;

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
    Output.points[5][4] += fd0;
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    double ld1 = 687.8364436076066;
    fd0 = fd1 + ld1;
    fb0 = fb1 && lb0;
    fb0 = fb1 && lb0;
    fd0 = fd1 - ld1;
    Thought lo2 = Thought15.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
    fb0 = fd1 > ld1;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, fb0, fb1);
}
    fd1 = ld1 - fd0;
    if (lb0) {
        fd1 = ld1 - fd0;
        fd1 = ld1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
        lb0 = fd0 < fd1;
        fb0 = fb1 || lb0;
        ld1 *= -1;
        Thought lo3 = Thought90.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
        fb1 = !lb0;
        fb0 = fb1 && lb0;
        boolean lb4 = false;
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
    boolean lb0 = false;
    lb0 = ab1 || ab2;
    for(int i0=0; i0<10; i0++){
        double ld1 = 445.3519070712393;
        boolean lb2 = false;
        double ld3 = 823.2815758751824;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb4 = false;
        ab1 = !ab2;
        double ld5 = 681.3559970278227;
        boolean lb6 = true;
        boolean lb7 = false;
if(fo1 != null){
          fo0 = fo1.m4(ld3, ld5, fd0, fd1);
}
        Thought lo8 = Thought237.getInstance(fo0, fo1, fo0, fo1, ld1, ld3, ld5, fd0);
        }
if(fo0 != null){
      fo0.m1();
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(lb0, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
    boolean lb9 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb10 = false;
    lb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    lb9 = !lb10;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb9, lb10);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    boolean lb0 = false;
    if (fb0) {
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          ad2 = fo0.m3();
}
        boolean lb1 = false;
        ad3 = ad4 + fd0;
        fb0 = fb1 && lb1;
if(fo0 != null){
          fo1 = fo0.m4(lb0, fb0, fb1, lb1);
}
        Output.points[5][5] -= fd1;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Output.points[5][6] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    ab1 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    ab1 = ab2 && ab3;
    ad1 = ad2 + ad3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought109.getInstance();
if(ao1 != null){
      ao1.m1(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    double ld1 = 44.15693775191797;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought55.getInstance(ao2, ao3, ao4, fo0);
    fb1 = fd0 > fd1;

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
    fb1 = fb0 || fb1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao2.m3(ad4, fd0, fd1, ad1);
}
    boolean lb0 = true;
    if (lb0) {
        double ld1 = 901.9520068586444;
        fb0 = ad1 > ad2;
        ad3 *= -1;
        fb1 = !lb0;
        Thought lo2 = Thought278.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
        Thought lo3 = Thought230.getInstance();
if(ao1 != null){
          ao1.m2(fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
        boolean lb4 = false;
        fd0 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld1, ad1, ad2, lb4, lb0, fb0, fb1);
}
        boolean lb5 = false;
if(ao4 != null){
          ad3 = ao4.m3(fo0, fo1, ao1, ao2, lb4, lb5, lb0, fb0);
}
if(ao3 != null){
          ad4 = ao3.m3(ao4, fo0, fo1, ao1);
}
        fd0 *= -1;
        Thought lo6 = Thought381.getInstance(fd1, ld1, ad1, ad2);
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
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(ao1 != null){
      ab1 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    double ld1 = 419.73729170118094;
    ld1 = fd0 + fd1;
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
    fd0 = fd1 - ld1;
    Thought lo2 = Thought141.getInstance(fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
    lb0 = fd1 < ld1;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    Thought lo3 = Thought301.getInstance(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
    fd0 = fd1 - ld1;
    ab4 = !fb0;
    Thought lo4 = Thought162.getInstance(ao2, ao3, ao4, fo0);
    fb1 = lb0 && ab1;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, fd0, fd1);
}
    boolean lb5 = false;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
}
    fd0 *= -1;
    ab2 = fd1 > ld1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ab2 = ao4.m2(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought337.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao3.m2(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ad1 = ad2 + ad3;
    ab3 = !ab4;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fb0 = ao4.m2(ad4, fd0, fd1, ad1);
}
    fb1 = ab1 && ab2;
    ad2 = ad3 + ad4;

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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld0 = 237.9453576387807;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought292.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
if(fo1 != null){
      fo1.m2();
}
    fb1 = fb0 && fb1;
    fd1 *= -1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ld0 < fd0;
    fd1 = ld0 - fd0;
    Thought lo2 = Thought319.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
    Output.points[5][7] += ld0;
        boolean lb3 = false;
    boolean lb4 = true;
    lb4 = fd0 > fd1;
    fb0 = ld0 > fd0;
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1, fb1, lb3, lb4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb3, lb4, fb0);
}
    ld0 *= -1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld0 = 995.9444935825286;
    ld0 *= -1;
    boolean lb1 = true;
    boolean lb2 = true;
    Output.points[5][8] -= fd0;
if(fo1 != null){
      fo1.m3(fd1, ld0, fd0, fd1);
}
    double ld3 = 313.2278883358051;
    Thought lo4 = Thought252.getInstance(fo0, fo1, fo0, fo1, ld0, ld3, fd0, fd1);
    ld0 = ld3 - fd0;
    fd1 = ld0 - ld3;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = ld0 + ld3;
    boolean lb5 = true;
    Output.points[6][0] -= fd0;

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
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > ad1;
        boolean lb0 = true;
        fb0 = !fb1;
if(fo0 != null){
          lb0 = fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        double ld1 = 88.66783158221061;
        Thought lo2 = Thought274.getInstance(fd0, fd1, ld1, ad1);
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought93.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    Thought lo2 = Thought227.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    ad1 = ad2 - ad3;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = !lb1;
    ab1 = ad4 < fd0;
    Output.points[6][1] += fd1;
    Output.points[6][2] += ad1;
    ab2 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      lb1 = fo0.m2(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought174.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    double ld2 = 174.9150523956158;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld2, fd0, fd1, fb0, fb1, lb1, fb0);
}
    Thought lo3 = Thought327.getInstance(fo1, ao1, ao2, ao3, fb1, lb1, fb0, fb1);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ld2, fd0, fd1, ld2);
}
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld2, fd0);
}
    lb1 = !fb0;
    fd1 = ld2 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = ld2 + fd0;
    fb1 = !lb1;
    if (fb0) {
        boolean lb4 = true;
        fd1 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
if(ao1 != null){
      ao1.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 211.0138900481215;
    ad3 = ad4 - fd0;
    double ld1 = 953.6637093293365;
    Output.points[6][3] -= fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ld1, ad1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Output.points[6][4] -= fd1;
    fb1 = fb0 || fb1;
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    Output.points[6][5] += ld0;
    boolean lb3 = false;
    boolean lb4 = true;
if(ao1 != null){
      lb2 = ao1.m2(ld1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    boolean lb5 = true;
    boolean lb6 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ld1 = ad1 - ad2;
    lb3 = lb4 || lb5;
if(ao3 != null){
      lb6 = ao3.m2(fb0, fb1, lb2, lb3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb4, lb5, lb6, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = true;
    Thought lo3 = Thought251.getInstance(fd1, fd0, fd1, fd0, lb0, lb1, lb2, ab1);
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 < fd0;

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
    ab2 = ad1 > ad2;
    boolean lb0 = true;
    ab2 = ad3 > ad4;
    fd0 = fd1 + ad1;
    ab3 = ad2 > ad3;
    Thought lo1 = Thought126.getInstance(ao1, ao2, ao3, ao4);
    ad4 = fd0 + fd1;
    ab4 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    boolean lb2 = true;
    ab4 = ad2 > ad3;
    fb0 = ad4 > fd0;
    if (fb1) {
if(fo1 != null){
          lb0 = fo1.m2();
}
        lb2 = !ab1;
if(ao1 != null){
          ao1.m1(ab2, ab3, ab4, fb0);
}
        double ld3 = 525.1168144780756;
        fd0 = fd1 - ld3;
        fb1 = lb0 || lb2;
        if (ab1) {
if(ao2 != null){
              ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
}}
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
    Thought lo0 = Thought168.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[6][6] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    lb1 = !fb0;

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
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3();
}
    boolean lb0 = false;
    Thought lo1 = Thought172.getInstance(ab2, ab3, ab4, fb0);
    boolean lb2 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb3, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = lb0 || lb2;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
    Thought lo4 = Thought283.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld5 = 309.0777481415313;
    ab4 = fb0 && fb1;
    double ld6 = 111.02653386459079;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld5, ld6, fd0, fd1);
}
    ld5 *= -1;
if(fo1 != null){
      lb0 = fo1.m2();
}
    boolean lb7 = true;
    Output.points[6][7] += ld6;

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
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    double ld1 = 374.247451936647;
    Thought lo2 = Thought105.getInstance(lb0, fb0, fb1, lb0);
    fd0 = fd1 - ld1;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb3);
}
if(fo1 != null){
          fo1.m3(fd0, fd1, ld1, ad1, lb0, fb0, fb1, lb3);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fb1 = fd1 > ad1;
    double ld0 = 724.9519625519847;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo1 != null){
      ab1 = fo1.m2();
}
if(fo0 != null){
      fd1 = fo0.m3(ab2, ab3, ab4, fb0);
}
    double ld1 = 575.3423976565396;
    Output.points[6][8] += ld0;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1, ab4, fb0, fb1, ab1);
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
    Thought lo0 = Thought381.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    if (fb1) {
        Thought lo1 = Thought87.getInstance();
        double ld2 = 51.53180176590159;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        fb0 = ld2 > fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
}
        double ld3 = 787.3945224799974;
        fb1 = ld2 > ld3;
if(ao1 != null){
          ao1.m3(fd0, fd1, ld2, ld3, fb0, fb1, fb0, fb1);
}
        boolean lb4 = false;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb4, fb0, fb1, lb4);
}
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
        fb1 = !lb4;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb1 = false;
    double ld2 = 727.770056796423;
if(ao4 != null){
      ad3 = ao4.m3(fb0, fb1, lb0, lb1);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb0);
}
    lb1 = ad2 < ad3;
    boolean lb3 = false;
    lb3 = fb0 || fb1;

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
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab1 = ab2 && ab3;
    double ld0 = 633.8416500657221;
if(ao2 != null){
      ab4 = ao2.m2(fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ld0 = ao4.m3(fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought368.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
    ab2 = !ab3;
    ab4 = fd1 > ld0;
if(ao3 != null){
      fb0 = ao3.m2(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    fd1 = ld0 - fd0;
    Thought lo2 = Thought259.getInstance(ao3, ao4, fo0, fo1);
    ab3 = fd1 > ld0;
    Output.points[7][0] += fd0;
    fd1 = ld0 + fd0;
    ab4 = fd1 < ld0;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
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
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m2(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fb0 = ad1 < ad2;
    Output.points[7][1] -= ad3;
    fb1 = ad4 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
    ab4 = ad4 > fd0;
if(ao4 != null){
      ao4.m1(fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;

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
    fd1 *= -1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought207.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
        boolean lb1 = true;
    lb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    Thought lo2 = Thought396.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fb1 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4();
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
    double ld0 = 573.6938961554215;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    Thought lo2 = Thought217.getInstance(fb0, fb1, lb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
    Thought lo3 = Thought367.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
    Thought lo4 = Thought161.getInstance(fo0, fo1, fo0, fo1);
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    Output.points[7][2] -= ld0;
    fb0 = fd0 < fd1;
    fb1 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    lb1 = ld0 < fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    ld0 = fd0 + fd1;
        Output.points[7][3] -= ld0;
    double ld6 = 438.36167594798616;
    double ld7 = 464.17544105032937;

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
    fb1 = fd1 > fd0;
    double ld0 = 198.6888247150192;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fb0 && fb1;
    Output.points[7][4] += fd1;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought95.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 + fd0;
    fb1 = fd1 < ld0;
    fd0 *= -1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(lb2, fb0, fb1, lb2);
}
    fb0 = !fb1;
    lb2 = ld0 < fd0;

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
