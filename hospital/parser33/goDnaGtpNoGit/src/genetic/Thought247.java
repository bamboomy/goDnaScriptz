package genetic;
import java.util.ArrayList;
class Thought247 extends Thought{
private static ArrayList<Thought247> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 141.905995947437;
private double fd1 = 933.0487079328634;
private Thought fo0 = null;
private Thought fo1 = null;
Thought247 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought247 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought247 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought247 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought247 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought247 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought247 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought247 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought247 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought247 instance = new Thought247 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought247 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought247 instance = new Thought247 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought247 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought247 instance = new Thought247 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought247 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought247 instance = new Thought247 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought247 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought247 instance = new Thought247 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought247 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought247 instance = new Thought247 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought247 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought247 instance = new Thought247 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought247 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought247 instance = new Thought247 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought122.getInstance(fo0, fo1, fo0, fo1);
    boolean lb1 = false;
    fd1 *= -1;
    fb0 = fb1 || lb1;
    Output.points[3][1] += fd0;
    fb0 = fd1 > fd0;
    Thought lo2 = Thought51.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    Thought lo3 = Thought332.getInstance(fb1, lb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 > fd1;
    double ld4 = 915.8473378956326;
    boolean lb5 = true;
    ld4 = fd0 + fd1;
    boolean lb6 = true;
    lb6 = !fb0;

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
    ab1 = ab2 || ab3;
    fd0 = fd1 - fd0;
    ab4 = fd1 < fd0;
    fb0 = fd1 > fd0;
    Output.points[3][2] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    Thought lo0 = Thought188.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
    fd0 *= -1;
    ab3 = fd1 < fd0;

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
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fd1 *= -1;
    Thought lo0 = Thought23.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    fd0 = fd1 + ad1;
    Thought lo1 = Thought262.getInstance();
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    boolean lb3 = false;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    boolean lb4 = false;

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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought154.getInstance();
    Thought lo2 = Thought92.getInstance(lb0, ab1, ab2, ab3);
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = !lb0;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
    boolean lb3 = false;
    ab4 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb3, ab1);
}
    boolean lb4 = false;

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
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && lb0;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb1 = true;
    Thought lo2 = Thought161.getInstance(lb1, fb0, fb1, lb0);
    if (lb1) {
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
        boolean lb3 = false;
if(ao3 != null){
          fd0 = ao3.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb3, lb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb3);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        lb0 = fd1 > fd0;
        fd1 *= -1;
if(ao3 != null){
          fd0 = ao3.m3(fd1, fd0, fd1, fd0);
}
        double ld4 = 692.9972309135179;
        Thought lo5 = Thought171.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld4, fd0);
        lb1 = !fb0;
if(ao3 != null){
          ao2 = ao3.m4();
}
        fb1 = !lb3;
if(ao4 != null){
          ao4.m1(lb0, lb1, fb0, fb1);
}
        Thought lo6 = Thought12.getInstance(fo0, fo1, ao1, ao2, fd1, ld4, fd0, fd1, lb3, lb0, lb1, fb0);
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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    lb0 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m3(fb1, lb0, fb0, fb1);
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
    ab1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld0 = 296.57898940764176;
if(ao1 != null){
      ld0 = ao1.m3(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    if (ab1) {
        ld0 *= -1;
        boolean lb2 = true;
if(ao1 != null){
          ab1 = ao1.m2(fd0, fd1, ld0, fd0);
}
        fd1 = ld0 - fd0;
        ab2 = !ab3;
        } else if (fb0) {
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
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    Thought lo1 = Thought226.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(lb0, ab1, ab2, ab3);
}
    fd0 = fd1 - ad1;
    ab4 = !fb0;
    fb1 = !lb0;
    ab1 = ad2 < ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb0, ab1, ab2);
}
    Thought lo2 = Thought325.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1);
}
        ab3 = !ab4;
    Thought lo3 = Thought158.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
if(ao3 != null){
      ao3.m1();
}
if(ao4 != null){
      ao4.m2(fb0, fb1, lb0, ab1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought296.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    double ld1 = 266.4938063036887;
    ld1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    boolean lb2 = false;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1();
}
    lb2 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, fd0, fb1, lb2, fb0, fb1);
}
    lb2 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
    lb2 = !fb0;
    Thought lo3 = Thought210.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb2 = fb0 || fb1;
    Thought lo4 = Thought92.getInstance(lb2, fb0, fb1, lb2);

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
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;
        fd0 *= -1;
    ab1 = !ab2;
    Output.points[3][3] -= fd1;
    double ld1 = 125.31345144666612;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    double ld2 = 575.7881617084696;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(ld1, ld2, fd0, fd1);
}
    boolean lb3 = false;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1);
}
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = ld1 < ld2;
        double ld4 = 744.0712102589274;
if(fo1 != null){
          lb0 = fo1.m2();
}
        for(int i1=0; i1<10; i1++){
            lb3 = !ab1;
if(fo1 != null){
              fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
            fb1 = !lb0;
            ld2 = fd0 - fd1;
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, ld4, ld1, ld2, fd0, lb3, ab1, ab2, ab3);
}
}}
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
    ad1 = ad2 - ad3;
    fb0 = !fb1;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ad3 > ad4;
    lb0 = fd0 > fd1;
    boolean lb1 = true;
    boolean lb2 = true;
if(fo0 != null){
      lb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb4 = false;
    boolean lb5 = false;
    Thought lo6 = Thought217.getInstance();
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb3, lb4, lb5);
}
    boolean lb7 = true;
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      lb7 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    double ld8 = 317.04125311204723;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld8, lb2, lb3, lb4, lb5);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb7, fb0, fb1, lb0);
}
    lb1 = lb2 || lb3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb9 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought171.getInstance();
    ab2 = fd1 < ad1;
    ab3 = ad2 < ad3;
    ab4 = ad4 > fd0;
    fd1 *= -1;
    fb0 = ad1 > ad2;
    Thought lo1 = Thought238.getInstance(fb1, ab1, ab2, ab3);
    boolean lb2 = false;
    boolean lb3 = true;
    ab2 = ab3 || ab4;
    fb0 = ad3 > ad4;
    fb1 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb3, ab1, ab2, ab3);
}
    ab4 = ad3 < ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb2, lb3);
}
    ab1 = ab2 && ab3;
    ab4 = ad4 > fd0;
    fb0 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, lb3, ab1);
}
    boolean lb4 = false;
    boolean lb5 = false;
    boolean lb6 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought200.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    fb0 = fd1 > fd0;
    double ld1 = 161.10394837357904;
if(fo1 != null){
      fb1 = fo1.m2();
}
    Thought lo2 = Thought227.getInstance(fb0, fb1, fb0, fb1);
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld1;
    fd0 = fd1 + ld1;
    Thought lo3 = Thought111.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ld1 *= -1;
    fb1 = fd0 < fd1;
    Output.points[3][4] -= ld1;
    fb0 = fd0 > fd1;
    ld1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, fd0, fd1);
}
    fb1 = ld1 > fd0;
    Output.points[3][5] += fd1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
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
    ad1 *= -1;
    fb0 = ad2 < ad3;
    fb1 = ad4 > fd0;
    fb0 = fd1 < ad1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
    Thought lo0 = Thought104.getInstance(ao1, ao2, ao3, ao4);
    fd0 *= -1;
    fd1 = ad1 - ad2;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought138.getInstance(ad3, ad4, fd0, fd1);
    boolean lb2 = true;
    lb2 = ad1 > ad2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
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
    boolean lb0 = false;
    lb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    double ld1 = 236.59282562079142;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    double ld3 = 346.79677819202726;

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
    double ld0 = 665.2875142370636;
if(ao2 != null){
      ab1 = ao2.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    fd0 = fd1 + ld0;
    ab2 = !ab3;
        Thought lo1 = Thought349.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
    ab2 = ad1 < ad2;
    ab3 = ad3 < ad4;
    fd0 *= -1;

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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought227.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    lb1 = !fb0;
    boolean lb2 = false;

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
    boolean lb0 = false;
    Output.points[3][6] -= fd0;
    Thought lo1 = Thought65.getInstance();
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    Output.points[3][7] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought312.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    ab3 = !ab4;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m3();
}
    boolean lb3 = true;
if(fo1 != null){
      fd0 = fo1.m3(lb3, ab1, ab2, ab3);
}
    double ld4 = 925.2328048130399;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    lb3 = ab1 || ab2;
if(fo1 != null){
      ab3 = fo1.m2(ld4, fd0, fd1, ld4, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
    Thought lo5 = Thought146.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4);
}
if(fo0 != null){
          fo1 = fo0.m4();
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
    fb1 = ad1 > ad2;
    fb0 = !fb1;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
    fb1 = !fb0;
    fb1 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    boolean lb0 = false;
    double ld1 = 813.6877899981472;
    Output.points[3][8] -= ad2;
    boolean lb2 = false;
    lb0 = ad3 < ad4;
    lb2 = fb0 || fb1;
    lb0 = !lb2;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, ad1, ad2, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
    boolean lb3 = false;
    lb3 = !fb0;
    Thought lo4 = Thought341.getInstance(fo0, fo1, fo0, fo1);

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
    Thought lo0 = Thought117.getInstance(ad1, ad2, ad3, ad4);
    ab1 = !ab2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    double ld1 = 78.99056734067658;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, ab1, ab2, ab3);
}
    ld1 = ad1 + ad2;
    ad3 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
            Thought lo2 = Thought147.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
    ab4 = fb0 && fb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    Output.points[4][0] -= fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fb0 = fd0 > fd1;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    Output.points[4][1] -= fd1;
    fd0 = fd1 + fd0;
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
    if (fb1) {
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao3 != null){
          ao3.m2(lb0, fb0, fb1, lb0);
}
        boolean lb1 = true;
        boolean lb2 = false;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb2, lb0, fb0, fb1);
}
        boolean lb3 = false;
if(ao3 != null){
          ao3.m3(fd1, fd0, fd1, fd0, lb1, lb2, lb3, lb0);
}
        Thought lo4 = Thought60.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb2);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
        Thought lo5 = Thought66.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
        boolean lb6 = false;
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
      ao2 = ao3.m4();
}
    fb0 = ad1 < ad2;
    double ld0 = 805.3168682230936;
if(ao4 != null){
      ad2 = ao4.m3(fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    ld0 *= -1;
    Output.points[4][2] -= ad1;
    Output.points[4][3] -= ad2;
    double ld1 = 988.9294808484823;
    double ld2 = 101.83030738023749;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ld0 - ld1;
    fb1 = fb0 || fb1;
    ld2 *= -1;
    fb0 = fb1 && fb0;
    boolean lb3 = true;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb3, fb0);
}
    fb1 = ld0 > ld1;
    lb3 = ld2 > ad1;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, lb3, fb0);
}
    fb1 = ld0 < ld1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    double ld1 = 773.8913714679414;
    double ld2 = 132.1280411670759;
if(ao2 != null){
      ao1 = ao2.m4(ld1, ld2, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    boolean lb3 = false;
if(ao2 != null){
      ld2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb4 = false;
    double ld5 = 322.55121675883794;
    Thought lo6 = Thought73.getInstance(ld5, fd0, fd1, ld1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, ld5, fd0, fd1);
}
    ld1 = ld2 + ld5;
    fd0 = fd1 + ld1;
    Thought lo7 = Thought155.getInstance();
    lb3 = ld2 < ld5;
    boolean lb8 = true;

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
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    Thought lo0 = Thought320.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, ab1, ab2, ab3);
}
    Output.points[4][4] -= fd1;
    double ld2 = 804.1894760937785;
    double ld3 = 468.2197877782245;
    Output.points[4][5] -= ld2;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ab4 = ld3 > ad1;
    Thought lo4 = Thought355.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fb1 || lb1;
    ab1 = ab2 || ab3;
    Thought lo5 = Thought139.getInstance(ao1, ao2, ao3, ao4, fd1, ld2, ld3, ad1);
    ad2 = ad3 + ad4;
    ab4 = fd0 < fd1;
    fb0 = fb1 || lb1;
    boolean lb6 = false;
if(fo1 != null){
      fo0 = fo1.m4();
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    Output.points[4][6] -= fd0;
    double ld0 = 724.811563938076;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld0;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought371.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
        fd1 = ld0 - fd0;
        boolean lb2 = false;
        lb2 = fd1 < ld0;
        fb0 = fd0 < fd1;
        Output.points[4][7] += ld0;
        Output.points[4][8] -= fd0;
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
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    ab4 = fd0 > fd1;
    double ld1 = 555.7111746131989;
    fb0 = ld1 > fd0;
    double ld2 = 119.81443248870747;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = !lb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, ld2, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
}
    double ld3 = 203.36021415109823;
    ab1 = ld1 < ld2;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld1);
}
    Thought lo4 = Thought160.getInstance(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1);
    boolean lb5 = false;
    double ld6 = 328.4022172764976;

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
    Output.points[5][0] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || fb0;
    ad2 = ad3 - ad4;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    double ld0 = 213.3486098827776;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2();
}
    fb1 = fb0 && fb1;
    double ld1 = 783.0878379538074;

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
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    ab1 = ad3 < ad4;
    fd0 = fd1 + ad1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    boolean lb1 = false;
    boolean lb2 = false;
    if (lb2) {
        ab1 = ab2 && ab3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ab4 = fd1 > ad1;
if(fo0 != null){
          fo0.m1(ad2, ad3, ad4, fd0);
}
        boolean lb3 = true;
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
    fb1 = fd1 < fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, fb0, fb1);
}
    double ld0 = 474.40970912776527;
    boolean lb1 = false;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = fd1 < ld0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
    Thought lo3 = Thought215.getInstance(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb1);
    lb2 = fd1 > ld0;

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
    ad2 *= -1;
    Thought lo0 = Thought125.getInstance(ao2, ao3, ao4, fo0);
    fb0 = ad3 < ad4;
    double ld1 = 507.7285788028785;
    boolean lb2 = true;
    Output.points[5][1] -= ad4;
    fb0 = !fb1;
    Output.points[5][2] += fd0;
    Thought lo3 = Thought272.getInstance(fd1, ld1, ad1, ad2);
    ad3 = ad4 + fd0;
    Thought lo4 = Thought307.getInstance(fo1, ao1, ao2, ao3, fd1, ld1, ad1, ad2);
    Output.points[5][3] -= ad3;
    boolean lb5 = false;
    Thought lo6 = Thought48.getInstance();
    lb2 = ad4 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(lb5, fb0, fb1, lb2);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld1, ad1, ad2, lb5, fb0, fb1, lb2);
}
    lb5 = fb0 || fb1;
    ad3 = ad4 - fd0;
    fd1 *= -1;

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
    Output.points[5][4] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = fd1 > fd0;
    ab3 = fd1 > fd0;
    if (ab4) {
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
        } else if (fb0) {
        fd1 = fd0 + fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
        } else if (ab4) {
        fd0 = fd1 - fd0;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
        for(int i0=0; i0<10; i0++){
            Thought lo0 = Thought222.getInstance(fd1, fd0, fd1, fd0);
            fd1 *= -1;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
      ad1 = ao2.m3(lb0, ab1, ab2, ab3);
}
    double ld1 = 593.6887048278468;
    ab4 = fb0 && fb1;
    lb0 = ab1 || ab2;
    Thought lo2 = Thought294.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    boolean lb3 = true;
    Output.points[5][5] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, ad1, ad2, lb0, lb3, ab1, ab2);
}
    ab3 = !ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ld1);
}
    ab1 = !ab2;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ab3 = ao3.m2();
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
    Output.points[5][6] -= fd1;
    fd0 *= -1;
    Thought lo0 = Thought203.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought4.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    double ld3 = 277.5777192547871;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0);
}
    fd1 = ld3 - fd0;

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
    double ld0 = 955.3204665420219;
    fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    Output.points[5][7] -= fd1;
    ld0 = fd0 - fd1;
    fb0 = fb1 || fb0;
    Output.points[5][8] += ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 + fd0;
    boolean lb1 = false;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
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
    fb1 = fb0 || fb1;
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    double ld0 = 875.9256404044925;
    Thought lo1 = Thought174.getInstance(ld0, fd0, fd1, ld0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    fb0 = ld0 < fd0;
    fb1 = fd1 > ld0;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    Output.points[6][0] -= ld0;
    fd0 *= -1;
    double ld2 = 498.25611131210485;
    Thought lo3 = Thought289.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, fb0, fb1, fb0, fb1);
    boolean lb4 = false;
    fd0 = fd1 + ld0;
    lb4 = ld2 < fd0;
    fb0 = fd1 > ld0;
    fb1 = ld2 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld2, fd0, lb4, fb0, fb1, lb4);
}
    fd1 = ld0 - ld2;
    fd0 = fd1 + ld0;
    double ld5 = 182.15671184733182;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb4, fb0);
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
