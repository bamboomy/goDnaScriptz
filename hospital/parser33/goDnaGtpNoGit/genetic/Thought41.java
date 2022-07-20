package genetic;
import java.util.ArrayList;
class Thought41 extends Thought{
private static ArrayList<Thought41> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 335.47871128019125;
private double fd1 = 152.15882969576882;
private Thought fo0 = null;
private Thought fo1 = null;
Thought41 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought41 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought41 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought41 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought41 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought41 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought41 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought41 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought41 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought392.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    boolean lb1 = false;
    double ld2 = 210.40304115209005;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ld2;
if(fo0 != null){
          fd0 = fo0.m3(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb1);
}
        double ld3 = 445.43047815451246;
        ld2 = fd0 + fd1;
        ld3 *= -1;
        ld2 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
        fd0 *= -1;
        fb1 = lb1 || fb0;
        fb1 = !lb1;
        fd1 = ld3 + ld2;
        fd0 = fd1 + ld3;
        Thought lo4 = Thought157.getInstance(fo0, fo1, fo0, fo1);
        ld2 *= -1;
        fd0 *= -1;
        fd1 = ld3 - ld2;
        fb0 = !fb1;
        Output.points[4][2] -= fd0;
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
    Thought lo0 = Thought382.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    Thought lo1 = Thought50.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    ab1 = ab2 && ab3;
    double ld2 = 92.99493279758329;
    fd0 = fd1 + ld2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ld2;
    ab4 = fd0 < fd1;
    Output.points[4][3] += ld2;
    fd0 = fd1 - ld2;
if(fo0 != null){
      fo0.m3(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, ab4, fb0, fb1, ab1);
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
    fb1 = !fb0;
    boolean lb0 = false;
    Thought lo1 = Thought120.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    boolean lb2 = false;
    fb0 = fb1 && lb0;
    lb2 = ad2 < ad3;
    ad4 *= -1;
    Thought lo3 = Thought388.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);

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
      ad1 = fo0.m3();
}
    double ld0 = 931.2468651040504;
if(fo1 != null){
      ad1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought255.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fd1 = fo0.m3(ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought151.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    boolean lb3 = false;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb4 = true;
    Thought lo5 = Thought150.getInstance(fd0, fd1, ld0, ad1);
    ab3 = ab4 || fb0;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb3, lb4, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad4, fd0, fd1, ld0, lb3, lb4, ab1, ab2);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
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
    boolean lb0 = false;
    lb0 = !fb0;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought99.getInstance(ao2, ao3, ao4, fo0);
    fd0 = fd1 - fd0;
    boolean lb2 = true;
    boolean lb3 = false;
    fd1 = fd0 - fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
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
    lb0 = ad1 > ad2;
    fb0 = fb1 || lb0;
if(ao2 != null){
      fb0 = ao2.m2(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    fd0 *= -1;
    fd1 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, lb0, lb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, fb1, lb0, lb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, lb1, fb0);
}
    fb1 = !lb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
    fd0 *= -1;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
        Output.points[4][4] += fd0;
    ab3 = fd1 < fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab4 = fd0 < fd1;
    Thought lo0 = Thought98.getInstance();
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        double ld1 = 468.86488457989634;
        boolean lb2 = false;
        boolean lb3 = true;
        if (lb2) {
if(ao3 != null){
              fd0 = ao3.m3(lb3, ab1, ab2, ab3);
}
            fd1 *= -1;
if(ao4 != null){
              ab4 = ao4.m2(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, fb0, fb1, lb2, lb3);
}
if(ao3 != null){
              ab1 = ao3.m2(fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
            fb1 = lb2 && lb3;
            ab1 = ab2 || ab3;
            ab4 = fb0 || fb1;
            for(int i1=0; i1<10; i1++){
}}}
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
    Thought lo1 = Thought354.getInstance(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
    ad1 = ad2 + ad3;
    ad4 *= -1;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    Output.points[4][5] -= fd0;
    lb0 = !ab1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = !lb0;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    ab1 = ad2 < ad3;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
    fb0 = !fb1;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, lb0, lb2, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ad1 *= -1;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought104.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb1 = !fb0;

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
    fd1 = fd0 - fd1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    ab1 = !ab2;
    boolean lb0 = true;
    ab2 = fd0 < fd1;

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
    fb0 = ad1 > ad2;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought240.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    double ld1 = 451.9284556270194;
    fb1 = !fb0;
    Thought lo2 = Thought361.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
    fb1 = ad2 > ad3;
    Thought lo3 = Thought159.getInstance();
    Thought lo4 = Thought197.getInstance(fb0, fb1, fb0, fb1);
    double ld5 = 254.72990863777014;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, ld5, ad1, fb1, fb0, fb1, fb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    ab1 = fd0 < fd1;
    double ld0 = 615.7438607745706;
    boolean lb1 = true;
    Thought lo2 = Thought326.getInstance(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    Output.points[4][6] += ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
    Thought lo3 = Thought179.getInstance(fo0, fo1, fo0, fo1);
    boolean lb4 = true;
    boolean lb5 = false;
    fd0 *= -1;
    fd1 *= -1;
    lb5 = ld0 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Output.points[4][7] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    if (ab1) {
        Thought lo6 = Thought110.getInstance(ab2, ab3, ab4, fb0);
        ad4 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, fb1, lb1, lb4, lb5);
}
        ab1 = ad4 > fd0;
        ab2 = fd1 < ld0;
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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[4][8] -= fd1;
    Thought lo0 = Thought123.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 622.7957641545675;
    fd0 = fd1 - ld1;
    double ld2 = 16.590570941297706;
    Thought lo3 = Thought343.getInstance(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld1);
if(fo1 != null){
      fo1.m3();
}
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld2, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
    fb1 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad4 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    Thought lo1 = Thought254.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
    Output.points[5][0] -= ad1;
    double ld2 = 176.7062889509707;
    ad1 = ad2 + ad3;
    for(int i0=0; i0<10; i0++){
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
    fd0 *= -1;
    fd1 *= -1;
    Thought lo0 = Thought117.getInstance(ao2, ao3, ao4, fo0);
    ab2 = ab3 && ab4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
        fb0 = fb1 && ab1;
    double ld1 = 139.66756341743377;
    boolean lb2 = true;
    boolean lb3 = true;
    Thought lo4 = Thought390.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb3 = fd1 > ld1;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb2, lb3, ab1);
}
    ab2 = fd0 > fd1;

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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
    Thought lo0 = Thought293.getInstance(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
    boolean lb1 = true;
    ab3 = fd1 < ad1;
    Thought lo2 = Thought362.getInstance(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb3 = false;
    lb3 = ab1 && ab2;
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
    double ld4 = 528.173567342493;
    boolean lb5 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld4, ad1);
}
    ad2 *= -1;
    ab2 = ad3 > ad4;
    boolean lb6 = false;
if(fo1 != null){
      fo1.m3();
}
if(ao1 != null){
      fd0 = ao1.m3(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld4, ad1, ad2, fb1, lb1, lb3, lb5);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, lb6, ab1, ab2, ab3);
}
    ld4 = ad1 + ad2;
    Output.points[5][1] -= ad3;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb1);
}
    boolean lb7 = false;
    Thought lo8 = Thought271.getInstance(ao3, ao4, fo0, fo1);
    lb3 = ad4 < fd0;
    lb5 = lb6 && lb7;

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
    Thought lo0 = Thought0.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought193.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Output.points[5][2] += fd0;
    if (fb0) {
        fb1 = fd1 > fd0;
        fd1 *= -1;
if(fo0 != null){
          fd0 = fo0.m3();
}
        Output.points[5][3] += fd1;
        boolean lb2 = false;
if(fo1 != null){
          fd0 = fo1.m3(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb2, fb0);
}
        fd0 = fd1 - fd0;
        fb1 = fd1 < fd0;
        boolean lb3 = false;
if(fo1 != null){
          lb2 = fo1.m2(fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb2);
}
        fd1 *= -1;
        double ld4 = 589.2256941373181;
if(fo0 != null){
          ld4 = fo0.m3(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb2);
}
        boolean lb5 = true;
        lb3 = fd0 > fd1;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab3 = fd1 < fd0;
    fd1 *= -1;
    ab4 = fb0 && fb1;
        fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
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
    ad2 = ad3 - ad4;
    double ld0 = 561.8766844545272;
    boolean lb1 = true;
        Thought lo2 = Thought386.getInstance(ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fb1 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fd1 = ld0 - ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[5][4] -= ad2;
    fb1 = lb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1);
}
    lb1 = !fb0;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        ab3 = ad2 > ad3;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        ad3 = ad4 - fd0;
        fb0 = fd1 > ad1;
        Thought lo1 = Thought251.getInstance(fo0, fo1, fo0, fo1);
        fb1 = lb0 && ab1;
}
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
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        boolean lb0 = false;
        for(int i0=0; i0<10; i0++){
            fb0 = !fb1;
if(ao2 != null){
              fd1 = ao2.m3();
}
            lb0 = fb0 || fb1;
            Output.points[5][5] -= fd0;
            fd1 = fd0 + fd1;
if(ao3 != null){
              fd0 = ao3.m3(lb0, fb0, fb1, lb0);
}
            fb0 = fd1 < fd0;
if(ao4 != null){
              ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
            fd1 = fd0 + fd1;
            fd0 *= -1;
            Thought lo1 = Thought130.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
            Output.points[5][6] += fd1;
            fb0 = fd0 < fd1;
}}
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
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    Output.points[5][7] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = lb0 && fb0;
    ad1 = ad2 - ad3;

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
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m2(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
        fb1 = fd1 < fd0;
    Output.points[5][8] += fd1;
    boolean lb0 = true;
    Output.points[6][0] += fd0;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao3.m1(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;

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
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ab1 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    ad1 *= -1;
    ab1 = !ab2;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[6][1] += ad1;
if(ao3 != null){
      ad2 = ao3.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad1 *= -1;

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
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought318.getInstance();
    fb1 = fd1 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    double ld1 = 632.5581026347738;
    fb0 = ld1 < fd0;
    fb1 = fd1 < ld1;
    boolean lb2 = false;
    double ld3 = 114.8637437159637;
    lb2 = ld3 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld3, fd0, fb0, fb1, lb2, fb0);
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
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought388.getInstance(fo0, fo1, fo0, fo1);
    fb1 = !ab1;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab4 = !fb0;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    fb0 = fb1 || lb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    boolean lb2 = true;
    fd0 = fd1 - fd0;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m1(lb3, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
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
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 - ad2;
        double ld1 = 279.36135947997354;
    lb0 = fb0 && fb1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    Thought lo2 = Thought340.getInstance(fd1, ld1, ad1, ad2);
    ad3 = ad4 - fd0;
    fd1 *= -1;
    Thought lo3 = Thought45.getInstance(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
    double ld4 = 93.84802084080737;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb5 = true;

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
    ad2 = ad3 - ad4;
    fd0 *= -1;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    Thought lo0 = Thought231.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb1 = false;
    Thought lo2 = Thought18.getInstance(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    lb1 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ad1;

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
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        }
    fb0 = !fb1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
if(ao4 != null){
      ao4.m1(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    fd0 *= -1;
    Thought lo2 = Thought14.getInstance(fo0, fo1, ao1, ao2, lb0, lb1, fb0, fb1);
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    for(int i1=0; i1<10; i1++){
if(ao3 != null){
          ao2 = ao3.m4();
}
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
if(ao1 != null){
      ad1 = ao1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ad1 *= -1;
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought298.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad4 > fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = ad1 + ad2;
        fb0 = ad3 > ad4;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
        for(int i1=0; i1<10; i1++){
            ad3 = ad4 - fd0;
            double ld1 = 689.3364370049258;
if(ao3 != null){
              fd0 = ao3.m3(fd1, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}
}}
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
    fd1 = fd0 + fd1;
    ab2 = !ab3;
    boolean lb0 = true;
    double ld1 = 796.5214620313299;
    ab3 = !ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
}
    Output.points[6][2] -= ld1;
    ab2 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        }
    ld1 = fd0 + fd1;
    ab3 = !ab4;
        ld1 = fd0 - fd1;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb3 = true;
    ld1 *= -1;
    boolean lb4 = false;
    ab2 = !ab3;
    fd0 = fd1 + ld1;
if(ao1 != null){
      ao1.m1(fd0, fd1, ld1, fd0);
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld0 = 135.7412557352784;
if(ao1 != null){
      ad4 = ao1.m3();
}
    fd0 = fd1 + ld0;
    ab2 = ad1 > ad2;
if(ao2 != null){
      ao2.m3(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    double ld1 = 571.3682598066005;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0);
}
    double ld2 = 264.1336281307174;
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, ld2, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    ld0 = ld1 + ld2;
    Output.points[6][3] -= ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < ld0;
    Output.points[6][4] += ld1;
if(fo1 != null){
      ld2 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
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
    Thought lo0 = Thought152.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fd1 *= -1;
    boolean lb1 = false;
    lb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb1 = lb1 && fb0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb1 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    fd0 *= -1;
    Thought lo2 = Thought134.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
    lb1 = fb0 || fb1;
        lb1 = fd1 < fd0;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought320.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought54.getInstance(fo1, fo0, fo1, fo0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    lb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    Output.points[6][5] += fd0;
    fb0 = fb1 || lb0;
    boolean lb1 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[6][6] += fd0;
    Thought lo2 = Thought204.getInstance();
    lb1 = fb0 && fb1;
if(fo0 != null){
          fo0.m1(lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
    boolean lb3 = false;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    lb3 = fb0 || fb1;
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
}
