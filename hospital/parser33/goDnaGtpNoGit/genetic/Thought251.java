package genetic;
import java.util.ArrayList;
class Thought251 extends Thought{
private static ArrayList<Thought251> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 615.265396893459;
private double fd1 = 671.2440444573285;
private Thought fo0 = null;
private Thought fo1 = null;
Thought251 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought251 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought251 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought251 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought251 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought251 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought251 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought251 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought251 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought251 instance = new Thought251 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought251 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought251 instance = new Thought251 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought251 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought251 instance = new Thought251 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought251 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought251 instance = new Thought251 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought251 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought251 instance = new Thought251 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought251 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought251 instance = new Thought251 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought251 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought251 instance = new Thought251 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought251 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought251 instance = new Thought251 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 - fd1;
    Thought lo0 = Thought395.getInstance(fb1, fb0, fb1, fb0);
    fd0 = fd1 + fd0;
    double ld1 = 811.6114294530613;
    Thought lo2 = Thought233.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        ld1 *= -1;
        fb0 = !fb1;
        double ld3 = 35.588685548207735;
        double ld4 = 164.24430452566207;
        Output.points[7][4] -= ld4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = ld1 < fd0;
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
    Thought lo0 = Thought182.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = fd0 > fd1;
    fd0 = fd1 + fd0;
    ab4 = fd1 > fd0;
    Thought lo1 = Thought353.getInstance(fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 > fd0;
    Thought lo2 = Thought226.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);

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
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought279.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought258.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fd1 > ad1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought337.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld3 = 307.7395725068864;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
        boolean lb0 = false;
        fd0 = fd1 + ad1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        Thought lo1 = Thought388.getInstance();
if(fo0 != null){
          fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
        ab2 = ab3 || ab4;
        fb0 = fb1 && lb0;
        ab1 = ab2 && ab3;
        Thought lo2 = Thought38.getInstance(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
        boolean lb3 = false;
        lb3 = !ab1;
        boolean lb4 = true;
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
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    Output.points[7][5] += fd1;
    Output.points[7][6] += fd0;
    Thought lo1 = Thought297.getInstance();
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb0, fb0, fb1);
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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
    boolean lb0 = true;
    ad2 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
    if (lb0) {
        ad1 = ad2 + ad3;
        ad4 = fd0 - fd1;
        ad1 *= -1;
        fb0 = fb1 || lb0;
        double ld1 = 763.175242981973;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
        fb1 = ad1 < ad2;
        lb0 = fb0 || fb1;
        ad3 *= -1;
        } else {
        lb0 = fd0 < fd1;
        boolean lb2 = false;
        Output.points[7][7] += ad1;
        ad2 = ad3 - ad4;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || ab1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    ab2 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 *= -1;
if(ao3 != null){
      ao3.m1(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought241.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 && fb0;
        fd1 *= -1;
        fd0 *= -1;
        Thought lo1 = Thought86.getInstance(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
        Output.points[7][8] -= fd1;
        for(int i1=0; i1<10; i1++){
            }
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        double ld2 = 935.557733740397;
        fd0 = fd1 - ld2;
        ab4 = fb0 || fb1;
        ab1 = ab2 && ab3;
        ab4 = fb0 && fb1;
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
    boolean lb0 = false;
    lb0 = ab1 && ab2;
    ad2 *= -1;
    ab3 = !ab4;
    ad3 = ad4 - fd0;
    fb0 = fd1 < ad1;
    Thought lo1 = Thought92.getInstance();
if(ao1 != null){
      ao1.m2(fb1, lb0, ab1, ab2);
}
    Thought lo2 = Thought217.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Thought lo3 = Thought129.getInstance(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    ad4 = fd0 - fd1;
    ab4 = !fb0;
    ad1 = ad2 + ad3;
    Output.points[8][0] -= ad4;
    double ld4 = 146.7173451034148;
    ad4 = fd0 - fd1;
    fb1 = lb0 && ab1;
if(fo0 != null){
      fo0.m3(ld4, ad1, ad2, ad3);
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
    fb0 = fd0 < fd1;
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
    lb1 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fb0 = fb1 && lb0;
    lb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
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
    Thought lo0 = Thought48.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    ab1 = ab2 || ab3;
    ab4 = fd1 < fd0;
    fd1 *= -1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    boolean lb2 = false;
    ab4 = fd1 > fd0;
    fd1 *= -1;
    double ld3 = 590.7870985115401;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld3, fb0, fb1, lb1, lb2);
}
    fd0 = fd1 - ld3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld3;
    Thought lo4 = Thought145.getInstance(fo0, fo1, fo0, fo1);
        Thought lo5 = Thought32.getInstance(fd0, fd1, ld3, fd0);
    fb0 = fb1 && lb1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(fb1, fb0, fb1, fb0);
}
        Output.points[8][1] += ad2;
        fb1 = !fb0;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
        if (fb1) {
if(fo0 != null){
              fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
            fd1 *= -1;
            fb0 = fb1 || fb0;
if(fo1 != null){
              ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            Thought lo0 = Thought359.getInstance(ad2, ad3, ad4, fd0);
            fd1 = ad1 - ad2;
            fb1 = ad3 < ad4;
            fd0 = fd1 + ad1;
            ad2 *= -1;
            fb0 = ad3 > ad4;
            fd0 = fd1 + ad1;
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
            fd1 = ad1 + ad2;
if(fo1 != null){
              ad3 = fo1.m3();
}
            ad4 = fd0 + fd1;
            } else if (fb1) {
            fb0 = fb1 || fb0;
}}
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
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    Output.points[8][2] += ad1;
    ab4 = fb0 || fb1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Thought lo0 = Thought73.getInstance(fo1, fo0, fo1, fo0);
    ab1 = ad4 > fd0;
    fd1 = ad1 - ad2;
    if (ab2) {
        Output.points[8][3] += ad3;
if(fo1 != null){
          fo1.m3(ad4, fd0, fd1, ad1);
}
        ad2 = ad3 - ad4;
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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
        fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(ao1 != null){
      fd0 = ao1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought185.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb2 = false;
    fd1 *= -1;
    Thought lo3 = Thought177.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(lb1, lb2, fb0, fb1);
}
    if (lb1) {
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    if (fb1) {
        Thought lo0 = Thought345.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
        fb0 = fb1 && fb0;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        Thought lo1 = Thought244.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
if(fo0 != null){
          fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
        ad1 = ad2 - ad3;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
        ad2 *= -1;
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
    fd0 *= -1;
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
        fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
    boolean lb0 = false;
    Thought lo1 = Thought166.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
          ab3 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    ab4 = fb0 && fb1;
    fd0 = fd1 + fd0;
    lb0 = fd1 > fd0;
    ab1 = ab2 || ab3;
    fd1 = fd0 + fd1;
    boolean lb2 = true;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && lb0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad1 = ad2 + ad3;
    lb0 = ab1 && ab2;
    double ld1 = 137.71376258051174;
    Thought lo2 = Thought167.getInstance(ab3, ab4, fb0, fb1);
    ad3 = ad4 + fd0;
    fd1 = ld1 + ad1;
    lb0 = ab1 && ab2;
    boolean lb3 = true;
    ad2 = ad3 - ad4;
    boolean lb4 = false;
    fd0 = fd1 - ld1;
    boolean lb5 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb5, ab1, ab2, ab3);
}
    boolean lb6 = true;

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
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, lb2, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
        boolean lb3 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb3);
}
        fd0 = fd1 + fd0;
        boolean lb4 = false;
        Output.points[8][4] -= fd1;
        boolean lb5 = false;
        fd0 = fd1 + fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = !ab3;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
        ab2 = ab3 && ab4;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ab3 = fo1.m2(fd1, fd0, fd1, fd0);
}
        Output.points[8][5] -= fd1;
        boolean lb1 = false;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
    ad2 *= -1;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
    fb1 = fb0 && fb1;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    Output.points[8][6] += ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1);
}
    fb0 = !fb1;
    boolean lb0 = true;
    boolean lb1 = false;
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
    ad2 = ad3 + ad4;
    Thought lo0 = Thought84.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    ad3 = ad4 - fd0;
    Thought lo1 = Thought202.getInstance();
    fd1 = ad1 - ad2;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb2, ab1, ab2, ab3);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb2);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    boolean lb3 = false;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      lb3 = fo0.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb2;
        fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb4 = false;

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
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
if(ao2 != null){
      fb0 = ao2.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought344.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought349.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
        boolean lb2 = false;
    boolean lb3 = false;

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
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    double ld1 = 249.0494696668513;
    fb0 = fd0 < fd1;
    boolean lb2 = false;
    fb0 = ld1 < ad1;
    boolean lb3 = true;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb1 = lb0 && lb2;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb3, lb4, fb0, fb1);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3, lb0, lb2, lb3, lb4);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld1, fb0, fb1, lb0, lb2);
}
    Output.points[8][7] += ad1;
    Output.points[8][8] += ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb3, lb4, fb0, fb1);
}
    Thought lo5 = Thought155.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
          ao1.m1(ad3, ad4, fd0, fd1);
}
    ld1 = ad1 - ad2;
    Thought lo6 = Thought45.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    double ld1 = 347.9659476602742;
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
    ab3 = !ab4;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1, fb0, fb1, lb0, ab1);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 716.2625354044395;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    ld0 = ad1 + ad2;
    fb0 = fb1 || ab1;
    ad3 = ad4 + fd0;
    boolean lb1 = false;
    ab1 = fd1 < ld0;
    double ld2 = 788.0303819968516;
    boolean lb3 = true;
    Output.points[0][0] -= ld2;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb4 = true;
    Thought lo5 = Thought382.getInstance(ad1, ad2, ad3, ad4);
    fb0 = fb1 || lb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld2);
}
    Thought lo6 = Thought394.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(lb3, lb4, ab1, ab2);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
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
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[0][1] -= fd0;
    fb0 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fb0 = fo0.m2();
}
        fb1 = fb0 && fb1;
        }
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    Output.points[0][2] += fd0;
    Thought lo1 = Thought159.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb0 = fd0 < fd1;
    Thought lo2 = Thought290.getInstance(fd0, fd1, fd0, fd1);

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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = !ab3;
if(fo0 != null){
      fd0 = fo0.m3(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = ab1 && ab2;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        fd0 = fd1 - fd0;
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
        fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = false;
    if (lb0) {
        fb0 = !fb1;
        lb0 = !fb0;
        Thought lo1 = Thought315.getInstance();
        fb1 = !lb0;
        ad2 *= -1;
        boolean lb2 = false;
        ad3 *= -1;
        boolean lb3 = true;
        ad4 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(lb3, lb0, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb2, lb3, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, lb2, lb3, lb0);
}
        fb0 = fb1 && lb2;
if(fo1 != null){
          lb3 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        ab2 = ab3 || ab4;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought42.getInstance();
    double ld1 = 226.13779035929656;
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb2, ab1, ab2);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    lb2 = ab1 || ab2;
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, ld1, ad1, ab4, fb0, fb1, lb2);
}
    boolean lb3 = false;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld4 = 593.026018126822;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld4, ad1, ad2);
}
    lb2 = !lb3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo5 = Thought149.getInstance();
    ab1 = ld1 > ld4;
    double ld6 = 879.8541491647607;

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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
        lb0 = fd1 > fd0;
        double ld1 = 435.7484715200025;
        boolean lb2 = true;
        fd0 *= -1;
        lb0 = fd1 > ld1;
if(ao2 != null){
          fb0 = ao2.m2(fd0, fd1, ld1, fd0, fb1, lb2, lb0, fb0);
}
        fb1 = fd1 > ld1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, lb0, fb0, fb1);
}
        }
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      lb0 = ao3.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    if (fb0) {
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
    double ld0 = 784.9469146454289;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    lb1 = !fb0;
    fb1 = !lb1;
    fd1 = ld0 - ad1;
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m2();
}
    Output.points[0][3] -= fd0;

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
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Thought lo0 = Thought268.getInstance(ab1, ab2, ab3, ab4);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    boolean lb1 = false;
    Output.points[0][4] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb1 = !ab1;
    ab2 = fd1 > fd0;
    ab3 = fd1 < fd0;

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
    ab1 = ad2 > ad3;
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
if(ao2 != null){
      ao2.m1(fd0, fd1, ad1, ad2);
}
    fb0 = fb1 && lb0;
    ab1 = ab2 || ab3;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    double ld1 = 691.4353988994059;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, lb0);
}
    ab1 = ad3 < ad4;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ad1, ad2, fb0, fb1, lb0, lb2);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
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
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    Output.points[0][5] -= fd0;
    Thought lo0 = Thought15.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    double ld1 = 665.7058556315579;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = true;
    lb2 = !fb0;
    fd0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(lb2, fb0, fb1, lb2);
}
    fd1 *= -1;
    fb0 = !fb1;
    lb2 = ld1 > fd0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    ld1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, fb1, lb2, fb0, fb1);
}
    fd0 = fd1 - ld1;
    boolean lb3 = true;
    boolean lb4 = true;
    fd0 *= -1;
        boolean lb5 = false;
    lb2 = fd1 > ld1;
    lb3 = !lb4;

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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    boolean lb2 = false;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[0][6] += fd0;
    double ld3 = 271.8822797496772;
    fd0 = fd1 + ld3;
    Thought lo4 = Thought317.getInstance(fd0, fd1, ld3, fd0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1);
}
if(fo0 != null){
      lb0 = fo0.m2();
}
    double ld5 = 435.54231811735156;
    lb1 = lb2 && fb0;
if(fo1 != null){
      fo1.m2(fb1, lb0, lb1, lb2);
}
        boolean lb6 = false;
    lb6 = ld3 < ld5;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ld5, fb0, fb1, lb0, lb1);
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
    double ld0 = 842.3057011382917;
    double ld1 = 765.9506353943905;
    fb0 = !fb1;
    fb0 = !fb1;
    Output.points[0][7] += ld0;
    fb0 = ld1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    Output.points[0][8] += ld1;
    Output.points[1][0] -= fd0;
    fd1 = ld0 - ld1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb3 = false;
if(fo0 != null){
          fo1 = fo0.m4(ld0, ld1, fd0, fd1);
}
if(fo1 != null){
          lb2 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
    lb3 = !fb0;
    ld0 = ld1 - fd0;
            boolean lb4 = false;
    fb0 = fb1 || lb2;
    fd1 = ld0 + ld1;

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
