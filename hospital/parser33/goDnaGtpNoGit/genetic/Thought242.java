package genetic;
import java.util.ArrayList;
class Thought242 extends Thought{
private static ArrayList<Thought242> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 386.07014298818257;
private double fd1 = 388.68040359840217;
private Thought fo0 = null;
private Thought fo1 = null;
Thought242 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought242 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought242 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought242 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought242 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought242 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought242 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought242 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought242 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought242 instance = new Thought242 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought242 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought242 instance = new Thought242 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought242 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought242 instance = new Thought242 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought242 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought242 instance = new Thought242 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought242 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought242 instance = new Thought242 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought242 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought242 instance = new Thought242 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought242 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought242 instance = new Thought242 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought242 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought242 instance = new Thought242 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 432.9175679864015;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3();
}
    Output.points[2][8] += fd0;
    boolean lb2 = true;
    fd1 = ld0 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb2, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb1, lb2, fb0, fb1);
}
    lb1 = fd0 > fd1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      lb2 = fo0.m2(ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}
    double ld3 = 21.67540937713624;
    ld3 = fd0 - fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    lb1 = ld0 > ld3;
    double ld4 = 908.5552468412822;
    lb2 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb5 = true;
    fb0 = fb1 && lb1;
    lb2 = !lb5;

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
    Thought lo0 = Thought178.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld1 = 342.0948788519384;
if(fo1 != null){
      fb0 = fo1.m2(ld1, fd0, fd1, ld1);
}
    Output.points[3][0] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    double ld2 = 331.4805704510084;
    fb1 = ld2 < fd0;
    ab1 = fd1 > ld1;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = false;
    boolean lb4 = true;
    ld2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, lb3, lb4, ab1, ab2);
}
    fd0 = fd1 - ld1;

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
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 > ad1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought40.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    ad4 = fd0 + fd1;

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
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ad1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ad2 = ad3 + ad4;
    Thought lo0 = Thought249.getInstance(fo1, fo0, fo1, fo0);
    Output.points[3][1] -= fd0;
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;

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
    Thought lo0 = Thought136.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m2();
}
    fb1 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought351.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        fb0 = fd0 < fd1;
        fd0 = fd1 + fd0;
        fb1 = fb0 || fb1;
        double ld2 = 57.33173908492792;
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          fd0 = ao2.m3(fb0, fb1, fb0, fb1);
}
        Output.points[3][2] -= fd1;
        boolean lb3 = true;
        Thought lo4 = Thought264.getInstance(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, lb3, fb0, fb1, lb3);
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
    double ld0 = 367.46560074568407;
    fb1 = !fb0;
    fb1 = ad1 > ad2;
    ad3 *= -1;
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    Output.points[3][3] += ad4;
    fd0 = fd1 - ld0;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[3][4] += ad1;
    boolean lb1 = false;
    fb0 = !fb1;
    ad2 *= -1;
    Thought lo2 = Thought325.getInstance(ao1, ao2, ao3, ao4);
    Thought lo3 = Thought112.getInstance(ad3, ad4, fd0, fd1);
    boolean lb4 = false;
    double ld5 = 631.6570519700778;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, ld5, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      lb1 = ao1.m2(lb4, fb0, fb1, lb1);
}
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, lb4, fb0, fb1, lb1);
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
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ab4 = fd0 < fd1;
    Thought lo0 = Thought174.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought132.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
if(ao4 != null){
      ao4.m2();
}
    fb0 = fb1 && ab1;
    Output.points[3][5] += fd0;
    fd1 = fd0 - fd1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m2(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought80.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    fd0 = fd1 - fd0;
    ab2 = fd1 > fd0;

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
    Thought lo0 = Thought32.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    ad2 = ad3 + ad4;
    fd0 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3);
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ad1, ad2, ad3);
}
    Thought lo2 = Thought160.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
    ad2 *= -1;
    Output.points[3][6] -= ad3;

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
    double ld0 = 60.86919242601039;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    ld0 = fd0 + fd1;
    Thought lo2 = Thought81.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
    double ld3 = 477.5025079206325;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
    double ld4 = 556.737702227067;
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    ld4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ld0, ld3, ld4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld3, ld4);
}
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3, fb0, fb1, lb1, fb0);
}
    if (fb1) {
        ld4 = fd0 - fd1;
        double ld5 = 600.5275241387166;
if(fo1 != null){
          lb1 = fo1.m2(ld5, ld0, ld3, ld4, fb0, fb1, lb1, fb0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 - fd1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought44.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb1 = false;
    double ld2 = 901.8718355532382;
    lb1 = ab1 || ab2;
    double ld3 = 241.6648344526994;
if(fo0 != null){
      ab3 = fo0.m2();
}
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, lb1);
}
    ld3 = fd0 - fd1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
    ld3 = fd0 + fd1;
    boolean lb4 = false;
if(fo1 != null){
          fo1.m2(ld2, ld3, fd0, fd1, ab4, fb0, fb1, lb1);
}
    ld2 = ld3 + fd0;
    lb4 = fd1 < ld2;
    ld3 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
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
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[3][7] += fd0;
    Thought lo1 = Thought197.getInstance(fd1, ad1, ad2, ad3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    lb0 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    Thought lo2 = Thought278.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
    ad2 *= -1;
    lb0 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = fb0 || fb1;
    Thought lo3 = Thought139.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    fb0 = fb1 || lb0;
    for(int i0=0; i0<10; i0++){
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
    boolean lb0 = false;
    lb0 = !ab1;
    boolean lb1 = true;
    ad1 = ad2 - ad3;
    double ld2 = 586.7687346037884;
    ad3 = ad4 - fd0;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ld2, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld2;
if(fo0 != null){
      ab2 = fo0.m2();
}
    boolean lb3 = false;
    Thought lo4 = Thought161.getInstance(ab2, ab3, ab4, fb0);
    ad1 = ad2 - ad3;
    fb1 = lb0 && lb1;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1, lb3, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Output.points[3][8] += ad2;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1, lb0, lb1, lb3, ab1);
}
    ab2 = ld2 < ad1;
    double ld5 = 42.70338188896575;

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
    double ld0 = 764.3246446095117;
    fb0 = ld0 < fd0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought379.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    Output.points[4][0] -= fd1;
    fb1 = ld0 < fd0;
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    for(int i0=0; i0<10; i0++){
        double ld2 = 432.5077910421067;
        boolean lb3 = false;
        Thought lo4 = Thought386.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
          lb3 = ao4.m2(fd0, fd1, ld2, ld0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld2, ld0);
}
        Thought lo5 = Thought128.getInstance();
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
    fb0 = ad1 > ad2;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m1(fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    boolean lb2 = true;
    double ld3 = 934.102435963348;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb0);
}
    lb1 = fd1 < ld3;
if(ao1 != null){
      lb2 = ao1.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    if (lb2) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          fd0 = ao2.m3(fd1, ld3, ad1, ad2);
}
        ad3 = ad4 - fd0;
        lb2 = fb0 || fb1;
        lb0 = lb1 && lb2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld3, ad1, ad2);
}
if(ao3 != null){
          ao3.m1();
}
if(ao4 != null){
          ad3 = ao4.m3(fb0, fb1, lb0, lb1);
}
        ad4 = fd0 - fd1;
        lb2 = fb0 || fb1;
        boolean lb4 = false;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
    Thought lo0 = Thought57.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought310.getInstance(fo0, fo1, ao1, ao2);
    ab4 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    Output.points[4][1] += fd1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    Output.points[4][2] -= fd0;
    fb0 = fb1 || ab1;
    Thought lo2 = Thought40.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    Output.points[4][3] += fd0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    double ld3 = 202.51136018165687;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld3, fd0);
}
    Thought lo4 = Thought305.getInstance(fo1, ao1, ao2, ao3, fd1, ld3, fd0, fd1);
    if (ab2) {
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    boolean lb0 = false;
    ad1 *= -1;
    ad2 = ad3 - ad4;
        boolean lb1 = true;
    ab3 = fd0 < fd1;
    ab4 = !fb0;
if(ao2 != null){
      ao2.m1();
}
    ad1 = ad2 + ad3;
    Thought lo2 = Thought317.getInstance(fb1, lb0, lb1, ab1);
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    ad4 *= -1;
    lb0 = fd0 < fd1;
    lb1 = ab1 || ab2;
    ad1 = ad2 + ad3;
    ab3 = !ab4;
    fb0 = ad4 > fd0;
    fd1 *= -1;
    fb1 = ad1 > ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, lb0, lb1, ab1, ab2);
}
    Thought lo3 = Thought296.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, lb0, lb1, ab1, ab2);
}
    ad1 *= -1;
    ad2 *= -1;
    double ld4 = 367.53585265461595;
    ab3 = ab4 || fb0;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    if (lb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 + fd0;
        Output.points[4][4] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fb0 = !fb1;
        lb0 = fb0 && fb1;
        lb0 = fb0 && fb1;
        lb0 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fd0 = fd1 - fd0;
        boolean lb1 = true;
        boolean lb2 = true;
        lb2 = fd1 < fd0;
        if (lb0) {
if(fo0 != null){
              fo1 = fo0.m4(fb0, fb1, lb1, lb2);
}
}}
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
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = ab1 || ab2;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;

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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought132.getInstance(fb1, fb0, fb1, fb0);
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        fb0 = fb1 || lb1;
        fd0 = fd1 + ad1;
        fb0 = ad2 < ad3;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
}
        boolean lb2 = false;
        lb1 = ad2 > ad3;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1, lb2, fb0, fb1, lb1);
}
        Output.points[4][5] -= ad2;
        boolean lb3 = false;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, lb2, lb3, fb0, fb1);
}
        lb1 = lb2 || lb3;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0);
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
    Thought lo0 = Thought299.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    boolean lb1 = true;
    ab1 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2();
}
    ab3 = !ab4;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb1, ab1, ab2);
}
    boolean lb2 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      lb1 = fo0.m2(ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
        fb0 = fd0 < fd1;
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb3, lb1);
}
        lb2 = ab1 && ab2;
        ab3 = ad1 > ad2;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    Output.points[4][6] -= fd0;
if(ao4 != null){
      fd1 = ao4.m3();
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought224.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
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
    double ld0 = 87.27285292491119;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    Thought lo1 = Thought8.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, ld0, ad1, ad2);
}
    Output.points[4][7] -= ad3;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2);
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
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
            Output.points[4][8] += fd0;
    Thought lo0 = Thought77.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
      fd1 = ao2.m3(fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought7.getInstance(fd1, fd0, fd1, fd0, fb1, lb1, ab1, ab2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    boolean lb3 = true;
    fd0 *= -1;

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
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    lb0 = ad1 < ad2;
    ab1 = ad3 < ad4;
if(ao2 != null){
      ao2.m1(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    Thought lo1 = Thought117.getInstance();
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
}
if(ao2 != null){
      ao2.m3(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);
}
    boolean lb2 = true;
    ad4 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m2(ad1, ad2, ad3, ad4);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fb1 = lb0 && lb2;
    Output.points[5][0] += fd1;
    ab1 = ad1 > ad2;
    ab2 = ad3 < ad4;
    ab3 = fd0 > fd1;
    Output.points[5][1] -= ad1;
if(ao4 != null){
          ab4 = ao4.m2();
}
    boolean lb3 = false;

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
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    double ld1 = 512.0671546427566;
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    Thought lo2 = Thought200.getInstance(fo1, fo0, fo1, fo0);
    ld1 = fd0 + fd1;
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;

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
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    double ld0 = 108.00735238616379;
    fd0 = fd1 - ld0;
    ab1 = ab2 && ab3;
    Output.points[5][2] += fd0;
    ab4 = fb0 && fb1;
    Thought lo1 = Thought175.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
    boolean lb2 = true;
    ld0 *= -1;
if(fo1 != null){
      fo1.m2();
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      lb2 = fo0.m2(ab1, ab2, ab3, ab4);
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
    ad2 *= -1;
    Output.points[5][3] += ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    double ld0 = 767.039360398463;
    Thought lo1 = Thought348.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = !fb1;
        fb0 = fb1 || fb0;
if(fo1 != null){
          fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
        if (fb0) {
            fb1 = fb0 || fb1;
            } else if (fb0) {
            ad2 *= -1;
}}
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
    Thought lo0 = Thought70.getInstance();
    ab2 = ab3 || ab4;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    Thought lo1 = Thought18.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    Thought lo2 = Thought89.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    ab3 = !ab4;
    Output.points[5][4] += ad2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ad3 *= -1;
    fb0 = fb1 && ab1;
    Output.points[5][5] -= ad4;

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
    fb1 = fd0 < fd1;
    boolean lb0 = false;
    lb0 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 745.8865785779253;
    Thought lo2 = Thought344.getInstance(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
    Output.points[5][6] += fd0;
    fb1 = !lb0;
    fb0 = !fb1;
    Output.points[5][7] -= fd1;
    lb0 = !fb0;
    ld1 = fd0 - fd1;
if(ao1 != null){
      ld1 = ao1.m3();
}
    boolean lb3 = false;
    fd0 *= -1;
    Output.points[5][8] += fd1;
    boolean lb4 = true;
    lb4 = ld1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb3);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, lb4, fb0, fb1, lb0);
}
if(ao4 != null){
          ao3 = ao4.m4(ld1, fd0, fd1, ld1, lb3, lb4, fb0, fb1);
}
        Output.points[6][0] -= fd0;
        lb0 = fd1 < ld1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, lb3, lb4, fb0, fb1);
}
        Thought lo5 = Thought10.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
          ao2.m2(fd1, ld1, fd0, fd1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1);
}
        lb0 = lb3 || lb4;
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
    fb1 = ad2 > ad3;
    boolean lb0 = false;
if(ao2 != null){
      lb0 = ao2.m2();
}
if(ao3 != null){
      ad4 = ao3.m3(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought299.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
if(ao2 != null){
      ao2.m1(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    fb1 = lb0 || fb0;
    fb1 = !lb0;
    fb0 = !fb1;
    Thought lo2 = Thought66.getInstance();
if(fo0 != null){
      ad1 = fo0.m3(lb0, fb0, fb1, lb0);
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
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought93.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, lb2, ab1, ab2, ab3);
}
    boolean lb3 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ab3 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ab4 = ao1.m2();
}
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, lb0, lb2);
}
    lb3 = !ab1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;

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
    boolean lb0 = true;
        Thought lo1 = Thought78.getInstance(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    boolean lb2 = true;
    lb2 = ab1 || ab2;
    Output.points[6][1] += fd1;
    Output.points[6][2] += ad1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
    double ld3 = 336.65336933476055;

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
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
    Output.points[6][3] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
        fd0 = fd1 - fd0;
    Thought lo0 = Thought364.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought120.getInstance(fo0, fo1, fo0, fo1);
    Output.points[6][4] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Output.points[6][5] -= fd1;
    Output.points[6][6] -= fd0;

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
    fb0 = !fb1;
        fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2();
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, fb0);
}
    double ld1 = 900.5443392671064;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = ld1 - fd0;
        boolean lb2 = true;
    double ld3 = 194.27706496826278;
    boolean lb4 = true;
    boolean lb5 = false;
    fd0 *= -1;
    boolean lb6 = true;
    lb0 = fd1 > ld1;

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
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fd0 *= -1;
    boolean lb2 = false;
    boolean lb3 = false;
    lb2 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb0);
}
    lb1 = fd0 < fd1;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb5 = false;
    Thought lo6 = Thought178.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    lb2 = fd1 > fd0;
        fd1 = fd0 - fd1;
    Thought lo7 = Thought70.getInstance();
if(fo1 != null){
      lb3 = fo1.m2(lb4, lb5, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    Thought lo8 = Thought185.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, lb2, lb3);

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
