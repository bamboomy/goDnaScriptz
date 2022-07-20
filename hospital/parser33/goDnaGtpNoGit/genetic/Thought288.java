package genetic;
import java.util.ArrayList;
class Thought288 extends Thought{
private static ArrayList<Thought288> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 432.4377029275858;
private double fd1 = 79.4005636935486;
private Thought fo0 = null;
private Thought fo1 = null;
Thought288 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought288 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought288 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought288 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought288 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought288 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought288 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought288 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought288 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought288 instance = new Thought288 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought288 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought288 instance = new Thought288 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought288 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought288 instance = new Thought288 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought288 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought288 instance = new Thought288 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought288 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought288 instance = new Thought288 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought288 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought288 instance = new Thought288 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought288 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought288 instance = new Thought288 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought288 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought288 instance = new Thought288 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    if (fb1) {
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        fd1 = fd0 - fd1;
        boolean lb0 = false;
        fd0 = fd1 - fd0;
if(fo1 != null){
          lb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        Thought lo1 = Thought44.getInstance();
        fb0 = fd0 > fd1;
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        Thought lo2 = Thought76.getInstance(fb1, lb0, fb0, fb1);
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        Thought lo3 = Thought45.getInstance();
        boolean lb4 = true;
if(fo0 != null){
          lb0 = fo0.m2(lb4, fb0, fb1, lb0);
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
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    Thought lo0 = Thought34.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fd1 = fd0 - fd1;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Thought lo1 = Thought53.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
    fd0 = fd1 - fd0;
    Thought lo2 = Thought53.getInstance(fo1, fo0, fo1, fo0);

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
    if (fb1) {
        boolean lb0 = true;
        lb0 = fb0 && fb1;
        boolean lb1 = false;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        Output.points[2][2] += fd1;
        Output.points[2][3] -= ad1;
        lb0 = lb1 || fb0;
        Thought lo2 = Thought58.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
        fb1 = fd1 < ad1;
        boolean lb3 = false;
        Thought lo4 = Thought251.getInstance();
        lb0 = lb1 && lb3;
if(fo1 != null){
          fo1.m3(fb0, fb1, lb0, lb1);
}
        lb3 = !fb0;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb3);
}
        Thought lo5 = Thought244.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
        fd0 = fd1 - ad1;
        lb3 = fb0 || fb1;
        ad2 = ad3 + ad4;
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
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    Output.points[2][4] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
    Thought lo0 = Thought211.getInstance(fd0, fd1, ad1, ad2);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        boolean lb1 = true;
    lb1 = !ab1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
    Thought lo2 = Thought183.getInstance();
    ab2 = ad4 > fd0;
    Thought lo3 = Thought139.getInstance(ab3, ab4, fb0, fb1);
    lb1 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
}
    Output.points[2][5] += ad4;
    double ld4 = 642.5364701854394;
    ad4 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo5 = Thought334.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fd1 < ld4;
    lb1 = ad1 > ad2;

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
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[2][6] += fd1;
    double ld0 = 271.6929511914127;
    ld0 *= -1;
    fb1 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought351.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 > ld0;
        Thought lo2 = Thought224.getInstance(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
        fb1 = fb0 && fb1;
        fd1 = ld0 - fd0;
        Thought lo3 = Thought218.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
        fb0 = fb1 || fb0;
        fd1 *= -1;
        ld0 = fd0 + fd1;
        Thought lo4 = Thought284.getInstance(ao2, ao3, ao4, fo0);
        ld0 *= -1;
        fb1 = fd0 < fd1;
        boolean lb5 = true;
if(fo1 != null){
          lb5 = fo1.m2(ld0, fd0, fd1, ld0);
}
        double ld6 = 555.5153698673798;
        boolean lb7 = false;
        Thought lo8 = Thought155.getInstance(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld6);
        lb7 = !fb0;
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
    ad2 *= -1;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
    lb0 = fd1 > ad1;
    ad2 = ad3 + ad4;
    lb1 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb0, lb1, fb0, fb1);
}
    lb0 = fd0 > fd1;

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
      ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought25.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    double ld2 = 133.8934631981017;
    ld2 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ld2 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        Output.points[2][7] += ld2;
        ab4 = fb0 && fb1;
if(ao3 != null){
          ao2 = ao3.m4(lb0, ab1, ab2, ab3);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0, ab4, fb0, fb1, lb0);
}
        Thought lo3 = Thought100.getInstance(fd1, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
        boolean lb4 = false;
        Thought lo5 = Thought252.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb4);
        Output.points[2][8] += ld2;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
        lb0 = ab1 && ab2;
if(fo1 != null){
          ab3 = fo1.m2(fd1, ld2, fd0, fd1);
}
        ab4 = ld2 > fd0;
        fb0 = fd1 > ld2;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab1 = ab2 || ab3;
    boolean lb0 = false;
if(ao1 != null){
      fd1 = ao1.m3();
}
    ab3 = ab4 && fb0;
    fb1 = lb0 && ab1;
if(ao2 != null){
      ad1 = ao2.m3(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
}
    fd1 = ad1 - ad2;
if(ao3 != null){
      ao3.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 + ad3;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fb0 = ad4 < fd0;
    fd1 *= -1;
    fb1 = lb0 && ab1;
    boolean lb1 = true;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ad2 = ad3 + ad4;
    double ld2 = 524.308867201496;
    ad4 *= -1;
    fd0 = fd1 - ld2;
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4);
}
    ab1 = fd0 > fd1;
    ld2 *= -1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    boolean lb3 = false;
    fd1 = ld2 - ad1;

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
    Thought lo0 = Thought84.getInstance();
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought317.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    if (fb1) {
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
    ab1 = ab2 || ab3;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb0, lb1, ab1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = fd1 < fd0;
    Thought lo2 = Thought389.getInstance(fd1, fd0, fd1, fd0);
    ab3 = ab4 || fb0;
    boolean lb3 = false;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
    Thought lo0 = Thought266.getInstance();
    double ld1 = 872.6089072415583;
    fb0 = fb1 && fb0;
    boolean lb2 = true;
    ad1 = ad2 - ad3;
    fb0 = !fb1;
    lb2 = fb0 && fb1;
    ad4 *= -1;
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
    fd0 = fd1 + ld1;
    boolean lb3 = true;
    boolean lb4 = true;
    boolean lb5 = false;
    boolean lb6 = false;
    ad1 = ad2 - ad3;
    double ld7 = 595.9402915105172;
    ad3 = ad4 + fd0;
    boolean lb8 = false;
    Output.points[3][0] -= fd1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld0 = 184.02106659178017;
    ld0 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ad4 = fd0 - fd1;
        double ld1 = 757.3905789082922;
    boolean lb2 = false;
    ab1 = ab2 && ab3;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ld1, ad1, ad2, ad3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    boolean lb3 = false;
    boolean lb4 = false;
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo6 = Thought331.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 || lb2;
    for(int i0=0; i0<10; i0++){
        ld1 *= -1;
        lb3 = ad1 < ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb4, lb5, ab1, ab2);
}
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
    Thought lo0 = Thought90.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld1 = 712.9095252200336;
    ld1 = fd0 - fd1;
    double ld2 = 242.96057982789765;
    fb1 = ld1 < ld2;
    fd0 *= -1;
    double ld3 = 11.173240500121395;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Thought lo4 = Thought169.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld1, ld2);
}
    fb0 = fb1 && fb0;
    boolean lb5 = false;
    ld3 *= -1;
    fb0 = fd0 < fd1;
    fb1 = lb5 || fb0;
    Output.points[3][1] -= ld1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ld2, ld3, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb5, fb0, fb1);
}
    ld1 *= -1;
    lb5 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ld3, fd0, fd1, lb5, fb0, fb1, lb5);
}
    ld1 *= -1;

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
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd1 < ad1;
    fb0 = fb1 && lb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    ad2 = ad3 - ad4;
    boolean lb1 = false;
    boolean lb2 = true;
    lb2 = !fb0;
    Thought lo3 = Thought330.getInstance(fd0, fd1, ad1, ad2);
    fb1 = lb0 && lb1;
    ad3 *= -1;
    Thought lo4 = Thought55.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb5 = false;
    Output.points[3][2] -= ad2;
if(ao3 != null){
      ao3.m2(lb2, lb5, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb0, lb1, lb2, lb5);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb2, lb5, fb0, fb1);
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
    ab2 = ab3 && ab4;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought108.getInstance(ao1, ao2, ao3, ao4);
    fb0 = !fb1;
    boolean lb1 = false;
    lb1 = !ab1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    double ld2 = 219.68608763286528;
    ld2 = fd0 + fd1;
    fb0 = fb1 || lb1;
    ld2 = fd0 - fd1;
    ld2 = fd0 + fd1;
    double ld3 = 739.1785753195107;
    ld2 = ld3 + fd0;
    boolean lb4 = true;
    lb4 = ab1 && ab2;
    fd1 *= -1;
    Thought lo5 = Thought224.getInstance();
    double ld6 = 67.18933008850303;
    boolean lb7 = true;
    Thought lo8 = Thought179.getInstance(ab2, ab3, ab4, fb0);
    ld2 = ld3 + ld6;
    fb1 = fd0 < fd1;

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
    boolean lb0 = true;
            Output.points[3][3] += ad1;
    ab1 = ad2 > ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    double ld1 = 159.16283066670312;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
    Thought lo3 = Thought118.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb2);
    fd1 = ld1 - ad1;
    ad2 *= -1;
    boolean lb4 = true;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    Thought lo0 = Thought173.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought207.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 < fd0;
    Output.points[3][4] += fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    Thought lo2 = Thought114.getInstance();
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 < fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    double ld1 = 77.32892860186844;
    Thought lo2 = Thought269.getInstance(fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
    Thought lo3 = Thought105.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = ld1 + fd0;
    ab3 = ab4 && fb0;
    boolean lb4 = true;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fb0 = fb1 || lb0;
    fd0 = fd1 - ld1;
    Thought lo6 = Thought145.getInstance();
    Thought lo7 = Thought94.getInstance(lb4, lb5, ab1, ab2);
    double ld8 = 628.6906225437948;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld8, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    boolean lb9 = true;
    lb0 = ld8 > fd0;
    fd1 = ld1 - ld8;

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
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
    Output.points[3][5] -= ad1;
    fb1 = ad2 > ad3;
    boolean lb1 = false;
    double ld2 = 788.1357160751944;
    lb0 = lb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, lb3, fb0);
}
    fb1 = lb0 && lb1;
    ld2 = ad1 - ad2;
    for(int i0=0; i0<10; i0++){
        lb3 = fb0 && fb1;
        boolean lb4 = false;
        ad3 = ad4 - fd0;
        lb4 = lb0 && lb1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        Thought lo5 = Thought272.getInstance(fd1, ld2, ad1, ad2);
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2);
}
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
    ad1 = ad2 - ad3;
    ab2 = ad4 < fd0;
    boolean lb0 = false;
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ab1 = ad1 < ad2;
    ab2 = ad3 > ad4;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
    Thought lo2 = Thought114.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb0, lb1, ab1);

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
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[3][6] += fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    double ld0 = 517.4292002196194;
    fb1 = ld0 < fd0;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    Output.points[3][7] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
    fb0 = !fb1;

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
    Thought lo0 = Thought114.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    Output.points[3][8] -= fd1;
    Thought lo1 = Thought128.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[4][0] -= ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
      ab1 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought115.getInstance();
    ab2 = fd1 > fd0;
if(ao1 != null){
      ab3 = ao1.m2(ab4, fb0, fb1, ab1);
}
    double ld1 = 394.6398456752669;
    boolean lb2 = true;
    fd0 = fd1 - ld1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb2;
    ab1 = !ab2;
    double ld3 = 880.3968680747582;
    ab3 = ab4 || fb0;
    fb1 = lb2 && ab1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, ld3, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought380.getInstance(ao4, fo0, fo1, ao1, fb1, lb2, ab1, ab2);
    ab3 = fd0 < fd1;
    ab4 = fb0 && fb1;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1);
}

Thought.STACK_COUNTER++;
return ld3;
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
if(ao1 != null){
      ab1 = ao1.m2(ad1, ad2, ad3, ad4);
}
    Output.points[4][1] += fd0;
    Thought lo0 = Thought20.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
if(fo1 != null){
      fo1.m3();
}
if(ao1 != null){
      ao1.m1(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = ab1 && ab2;

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
    Thought lo0 = Thought378.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought308.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
        fd0 = fd1 - fd0;
    boolean lb2 = false;
    fd1 *= -1;
    fb0 = fd0 < fd1;
        boolean lb3 = false;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb2, lb3, fb0);
}
    fb1 = lb2 || lb3;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb2);
}
    lb3 = !fb0;
    Thought lo4 = Thought343.getInstance(fd0, fd1, fd0, fd1, fb1, lb2, lb3, fb0);
    boolean lb5 = true;
    fb0 = !fb1;
    lb2 = fd0 < fd1;
    lb3 = lb5 && fb0;
    fb1 = lb2 || lb3;
    fd0 = fd1 + fd0;

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
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    Output.points[4][2] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab3 = fd0 < fd1;
    fd0 = fd1 + fd0;
    ab4 = fb0 && fb1;
    fd1 = fd0 + fd1;
    boolean lb2 = true;
    Output.points[4][3] += fd0;
    fd1 *= -1;
    lb0 = fd0 < fd1;
    Output.points[4][4] -= fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought313.getInstance();
    lb1 = fd1 < fd0;
    fd1 = fd0 - fd1;

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
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought125.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fd0 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought53.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
    double ld3 = 84.98815122322053;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    lb1 = ad3 > ad4;
    fb0 = fd0 < fd1;
    fb1 = lb1 && fb0;
    ld3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ad1);
}
    ad2 *= -1;

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
    boolean lb0 = false;
    lb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
    double ld1 = 732.9851865640603;
    double ld2 = 915.0169826486457;
    ld1 = ld2 - ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(ad4, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
    Output.points[4][5] -= ld2;

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
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fd0 > fd1;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought61.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    fb1 = lb0 && fb0;
    fb1 = lb0 && fb0;
    Thought lo2 = Thought256.getInstance();
    fb1 = lb0 || fb0;
    Output.points[4][6] += fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    double ld3 = 181.29375955642186;

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
    fb0 = !fb1;
    Thought lo0 = Thought268.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ad1 = ad2 + ad3;
        ad4 *= -1;
    Output.points[4][7] -= fd0;
    fb0 = fd1 > ad1;
    Thought lo1 = Thought381.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
if(fo0 != null){
      fo0.m3();
}
    double ld2 = 979.6161213877099;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb3 = true;
    fd0 *= -1;
    Thought lo4 = Thought140.getInstance(ao2, ao3, ao4, fo0, fd1, ld2, ad1, ad2, lb3, fb0, fb1, lb3);

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
    ab2 = ab3 || ab4;
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    double ld0 = 379.42838052236;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ld0 - fd0;
    fb0 = fd1 < ld0;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
    Thought lo2 = Thought307.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m2(fb0, fb1, lb1, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
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
    ab2 = ab3 && ab4;
    ad1 = ad2 - ad3;
    Output.points[4][8] -= ad4;
    Output.points[5][0] += fd0;
    fb0 = fd1 > ad1;
    fb1 = !ab1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    ab2 = ad2 < ad3;
    ab3 = ad4 < fd0;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld0 = 887.9201048711773;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ad1);
}
    ab3 = ab4 && fb0;
    fb1 = !ab1;
    Output.points[5][1] -= ad2;
    ad3 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
    boolean lb1 = false;
    Output.points[5][2] += ad1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
}
    ab2 = fd1 > ld0;
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
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
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    Output.points[5][3] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = fd1 > fd0;
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    lb1 = !fb0;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Thought lo2 = Thought199.getInstance(fb1, lb0, lb1, fb0);
    fd0 *= -1;
    fb1 = lb0 && lb1;

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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd1 *= -1;
    Output.points[5][4] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    Output.points[5][5] -= fd1;

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
    fb1 = fd0 < fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought167.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fb0 = fd1 > fd0;
    double ld1 = 767.8005460943426;
    boolean lb2 = false;
    fb0 = fb1 && lb2;
    Thought lo3 = Thought23.getInstance();
    Thought lo4 = Thought178.getInstance(fb0, fb1, lb2, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb2);
}
    Thought lo5 = Thought365.getInstance(fd1, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
    fb1 = ld1 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
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
