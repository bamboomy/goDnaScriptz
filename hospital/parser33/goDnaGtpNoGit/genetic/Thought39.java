package genetic;
import java.util.ArrayList;
class Thought39 extends Thought{
private static ArrayList<Thought39> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 328.37786683130554;
private double fd1 = 545.2650971548227;
private Thought fo0 = null;
private Thought fo1 = null;
Thought39 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought39 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought39 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought39 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought39 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought39 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought39 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought39 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought39 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd1 > fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought76.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld1 = 348.32313995928945;
    double ld2 = 568.0379511953712;
    double ld3 = 347.19078217273506;
    Thought lo4 = Thought257.getInstance();
if(fo1 != null){
      ld2 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb5 = false;
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, lb5, fb0, fb1, lb5);
}
    ld3 = fd0 - fd1;

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
    Output.points[7][0] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 803.4967919184136;
    ab4 = !fb0;
    fb1 = fd0 < fd1;
    ab1 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
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
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought206.getInstance(fo0, fo1, fo0, fo1);
    boolean lb1 = true;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    lb1 = fd1 < ad1;
    Thought lo2 = Thought283.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    fd1 = ad1 + ad2;
    fb0 = ad3 < ad4;
        fd0 = fd1 - ad1;
if(fo1 != null){
      fo1.m3();
}
    double ld3 = 194.9813676229616;

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
    ad2 *= -1;
    ab1 = ad3 < ad4;
    ab2 = fd0 > fd1;
if(fo0 != null){
      ad1 = fo0.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    Thought lo0 = Thought344.getInstance(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
    double ld1 = 488.5820112720955;
    ad3 = ad4 - fd0;
    Thought lo2 = Thought199.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
    fd1 = ld1 + ad1;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought235.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[7][1] += fd0;
    lb1 = fd1 < fd0;
    fb0 = fb1 && lb1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb1, fb0);
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
    fb0 = !fb1;
    Thought lo0 = Thought167.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought3.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 + ad1;
    fb1 = ad2 < ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    fb0 = fb1 && fb0;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought271.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao2.m2();
}
    ab4 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, ab1);
}
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = fd0 > fd1;
    ab1 = !ab2;
    Output.points[7][2] += fd0;
    ab3 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;

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
    Thought lo0 = Thought52.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ad1;
    Thought lo1 = Thought179.getInstance(ao1, ao2, ao3, ao4);
    ab1 = ab2 && ab3;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    Thought lo2 = Thought40.getInstance(fd0, fd1, ad1, ad2);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
        ab4 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
    Thought lo3 = Thought238.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    boolean lb4 = true;
    ab1 = fd0 < fd1;

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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    Output.points[7][3] += fd1;
    fb0 = fd0 > fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = lb0 && fb0;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      lb0 = fo1.m2(lb1, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    lb1 = fd0 < fd1;
    boolean lb2 = true;
    boolean lb3 = false;
    fd0 = fd1 + fd0;
    lb2 = lb3 && fb0;
    fb1 = fd1 < fd0;
    Thought lo4 = Thought328.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb1, lb2, lb3);
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    lb2 = fd0 > fd1;
    lb3 = fb0 || fb1;
    lb0 = fd0 > fd1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = !ab1;
    ab2 = fd0 < fd1;
    Thought lo0 = Thought70.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    Output.points[7][4] += fd0;
    if (ab1) {
        ab2 = ab3 && ab4;
        Thought lo1 = Thought284.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
        fd1 *= -1;
        boolean lb2 = false;
        fd0 *= -1;
if(fo0 != null){
          ab2 = fo0.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          lb2 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        Output.points[7][5] -= fd0;
        fd1 *= -1;
        double ld3 = 886.8448416015736;
        fb1 = ld3 < fd0;
        lb2 = ab1 && ab2;
        if (ab3) {
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    fb0 = ad2 > ad3;
    Thought lo1 = Thought271.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
    Output.points[7][6] += ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    lb0 = ad3 > ad4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought351.getInstance(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;

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
    ab1 = ad1 < ad2;
    Thought lo0 = Thought295.getInstance(ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought85.getInstance();
    fd0 = fd1 - ad1;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
    double ld3 = 107.16430379864101;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld3, ad1, ab4, fb0, fb1, lb2);
}
    ab1 = ad2 > ad3;
    double ld4 = 453.56225130859826;
        double ld5 = 765.9839452140676;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
    double ld6 = 543.0575728130005;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld7 = 960.9790586586819;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    Output.points[7][7] += fd1;
    Output.points[7][8] += fd0;
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb0 = false;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    if (lb0) {
if(fo0 != null){
          fd0 = fo0.m3(fb0, fb1, lb0, fb0);
}
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
        fb1 = !lb0;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        Output.points[8][0] += fd0;
        boolean lb1 = false;
        Output.points[8][1] -= fd1;
        fb0 = fd0 > fd1;
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb1, lb0, fb0);
}
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, lb1, lb0, fb0, fb1);
}
        boolean lb2 = false;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    fb0 = fb1 && fb0;
    ad1 *= -1;
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fb0 = !fb1;
    Thought lo1 = Thought209.getInstance(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m2(ad4, fd0, fd1, ad1);
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
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2();
}
    fd1 = fd0 - fd1;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    if (ab3) {
        Output.points[8][2] -= fd1;
        ab4 = fb0 || fb1;
        ab1 = fd0 > fd1;
        ab2 = ab3 && ab4;
if(ao2 != null){
          ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
        fd0 = fd1 + fd0;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
        boolean lb0 = false;
        ab3 = !ab4;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb0 = !fb1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought316.getInstance(ad1, ad2, ad3, ad4);
    boolean lb1 = true;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    double ld2 = 985.1576712686236;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
if(ao1 != null){
      ao1.m1();
}
    lb1 = fd1 > ld2;
    double ld3 = 225.31148596967668;
if(ao2 != null){
      ao2.m3(ab1, ab2, ab3, ab4);
}
    Thought lo4 = Thought380.getInstance(ao3, ao4, fo0, fo1, ld3, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
    Thought lo5 = Thought141.getInstance(ad4, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fb0 = fb1 && lb1;

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
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    Output.points[8][3] -= fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought99.getInstance();
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    Output.points[8][4] -= fd1;
    fb1 = fd0 < fd1;
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb2, fb0, fb1);
}
    lb0 = !lb2;
    boolean lb3 = false;
    lb3 = fd1 < fd0;
    Thought lo4 = Thought211.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);

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
    boolean lb0 = true;
    double ld1 = 45.43463900073367;
    lb0 = ab1 || ab2;
    double ld2 = 591.6011601790502;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought1.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      lb0 = fo1.m2(ld1, ld2, fd0, fd1);
}
    ld1 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1);
}
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
}
    ld2 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought80.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld1);
}
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1);
}
if(fo0 != null){
      ab2 = fo0.m2();
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought260.getInstance(lb0, fb0, fb1, lb0);
    Output.points[8][5] += ad1;
    boolean lb2 = false;
    ad2 = ad3 + ad4;
    Output.points[8][6] -= fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb2, fb0, fb1, lb0);
}
    lb2 = fb0 || fb1;
    lb0 = lb2 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, lb0, lb2, fb0);
}
        boolean lb3 = false;
    fb0 = fb1 && lb0;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
    fd0 *= -1;
    double ld4 = 293.51141367939607;
    fd0 = fd1 + ld4;
    lb0 = lb2 && lb3;
        Thought lo5 = Thought106.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld4, ad1);
}
    fb1 = lb0 || lb2;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 527.9651484858739;
    double ld1 = 88.42163711252478;
    ld1 = ad1 - ad2;
    Thought lo2 = Thought97.getInstance();
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
    Thought lo3 = Thought21.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 *= -1;
    double ld4 = 842.439238814455;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    boolean lb5 = true;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ab3 = ab4 || fb0;
    fb1 = lb5 && lb6;
    ab1 = ld0 < ld1;
    double ld7 = 447.90312975677193;
    ld4 = ld7 - ad1;
    Thought lo8 = Thought27.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(ab2, ab3, ab4, fb0);
}
    double ld9 = 685.0648466640928;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, ld4, ld7, fb1, lb5, lb6, ab1);
}
        ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(ld9, ad1, ad2, ad3, fb0, fb1, lb5, lb6);
}
    Output.points[8][7] += ad4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[8][8] += fd1;
    double ld0 = 956.6757339513125;
    double ld1 = 83.80828047954088;
if(ao1 != null){
      ao1.m3(ld0, ld1, fd0, fd1);
}
    Thought lo2 = Thought32.getInstance(ao2, ao3, ao4, fo0, ld0, ld1, fd0, fd1);
    ld0 = ld1 - fd0;
    boolean lb3 = false;
if(fo1 != null){
      fd1 = fo1.m3();
}
    lb3 = fb0 && fb1;
if(ao1 != null){
      ao1.m2(lb3, fb0, fb1, lb3);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld0, ld1, fd0, fd1, fb1, lb3, fb0, fb1);
}
if(ao1 != null){
      lb3 = ao1.m2(ld0, ld1, fd0, fd1, fb0, fb1, lb3, fb0);
}
    fb1 = lb3 || fb0;
    ld0 *= -1;
    Output.points[0][0] -= ld1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb3, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, ld1, fd0);
}
    double ld4 = 143.0561307488589;

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
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    ad1 = ad2 - ad3;
    if (fb0) {
        boolean lb1 = true;
if(ao1 != null){
          ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
        fb0 = !fb1;
if(ao1 != null){
          fo1 = ao1.m4();
}
        Thought lo2 = Thought158.getInstance(lb1, lb0, fb0, fb1);
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb1, lb0, fb0, fb1);
}
        boolean lb3 = false;
        double ld4 = 924.872824553996;
if(ao2 != null){
          ao1 = ao2.m4(ld4, ad1, ad2, ad3, lb1, lb3, lb0, fb0);
}
        fb1 = ad4 > fd0;
        fd1 *= -1;
        boolean lb5 = false;
        lb1 = ld4 > ad1;
        double ld6 = 116.22378639270573;
        boolean lb7 = true;
        lb3 = !lb5;
        ad1 = ad2 - ad3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb7, lb0, fb0, fb1);
}
        lb1 = lb3 && lb5;
        lb7 = lb0 || fb0;
        fb1 = lb1 || lb3;
        lb5 = lb7 || lb0;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
        boolean lb8 = false;
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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought10.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought299.getInstance();
        boolean lb2 = true;
        lb2 = !ab1;
if(ao2 != null){
          ao2.m1(ab2, ab3, ab4, fb0);
}
        fb1 = lb2 || ab1;
if(ao3 != null){
          ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        lb2 = ab1 && ab2;
        ab3 = !ab4;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought294.getInstance();
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    ad4 *= -1;
    fb0 = fb1 && lb1;
    ab1 = fd0 < fd1;
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    ad1 *= -1;
    ad2 *= -1;
    Thought lo2 = Thought139.getInstance(ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
    boolean lb3 = true;
    double ld4 = 3.18847694190864;
    boolean lb5 = true;
    Thought lo6 = Thought17.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
if(ao1 != null){
      ld4 = ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb7 = true;
    ad1 *= -1;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    Thought lo8 = Thought223.getInstance(ao1, ao2, ao3, ao4, fd1, ld4, ad1, ad2);

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
    fb1 = fb0 && fb1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        Thought lo1 = Thought116.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
        Thought lo2 = Thought388.getInstance(fo1, fo0, fo1, fo0);
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
    Output.points[0][1] -= fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ab1 = fo0.m2();
}
    Output.points[0][2] += fd1;
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought172.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);

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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought283.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m2();
}
    Output.points[0][3] += ad3;
    fb0 = fb1 && lb0;
    ad4 *= -1;
    double ld2 = 955.1621294497471;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    boolean lb3 = false;
        double ld4 = 39.32878191426294;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb3);
}
    ld2 *= -1;
    fb0 = fb1 || lb0;
    double ld5 = 554.0452762503771;
    ld4 *= -1;
if(fo0 != null){
      ld5 = fo0.m3(ad1, ad2, ad3, ad4, lb3, fb0, fb1, lb0);
}
    lb3 = !fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb3, fb0);
}
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
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ab2 = ad3 > ad4;
    Output.points[0][4] += fd0;
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 || fb0;
        boolean lb0 = false;
if(fo0 != null){
          fb0 = fo0.m2();
}
        fb1 = fd1 < ad1;
        }
    ab1 = ad2 > ad3;
if(fo1 != null){
      ad4 = fo1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    double ld1 = 355.02238843823125;
    ld1 = ad1 - ad2;
    ab1 = ab2 || ab3;
    ab4 = ad3 < ad4;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
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
    double ld0 = 897.5739600970082;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
    fb1 = fb0 && fb1;
    ld0 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
}
    fb0 = ld0 < fd0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    if (fb0) {
if(fo0 != null){
          fo0.m1();
}
        Thought lo1 = Thought134.getInstance(fb1, fb0, fb1, fb0);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = ld0 < fd0;
        if (fb0) {
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ad1;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
        double ld0 = 971.1988780067895;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ad1, ad2);
}
        double ld1 = 102.13973462741808;
    fb1 = fb0 || fb1;
    Thought lo2 = Thought287.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(ao4 != null){
      ao4.m2(ld0, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    fd0 = fd1 + fd0;
    double ld0 = 948.4438288986648;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    Thought lo1 = Thought304.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    ab1 = fd0 < fd1;
    ld0 = fd0 - fd1;
    ab2 = ab3 || ab4;
    double ld2 = 854.2357512047744;

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
    ab1 = ad1 < ad2;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = ad2 < ad3;
    ad4 *= -1;
if(ao3 != null){
      fd0 = ao3.m3(ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought235.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
if(ao2 != null){
      ao2.m2(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    Output.points[0][5] += ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);
}
    ab4 = ad3 > ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought144.getInstance();
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    double ld2 = 933.5440527363209;
    fb0 = !fb1;
    lb1 = fb0 || fb1;
    lb1 = fb0 && fb1;
    boolean lb3 = true;
    boolean lb4 = true;
    double ld5 = 109.90234875128286;
    Output.points[0][6] -= ld5;
    fd0 = fd1 - ld2;
    double ld6 = 765.7904778664787;
    boolean lb7 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld5, ld6, fd0, fd1, lb1, lb3, lb4, lb7);
}
    fb0 = !fb1;
    lb1 = lb3 && lb4;
    double ld8 = 191.5819512584915;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld5, ld6, ld8, lb7, fb0, fb1, lb1);
}
    boolean lb9 = true;
    lb3 = lb4 && lb7;
    Thought lo10 = Thought88.getInstance(fo1, fo0, fo1, fo0, lb9, fb0, fb1, lb1);
    boolean lb11 = true;
    lb3 = !lb4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    double ld12 = 761.2692987960146;

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
        Thought lo0 = Thought151.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1();
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought47.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;

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
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[0][7] -= fd0;
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
        boolean lb2 = false;
    lb1 = fd0 > fd1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
    Output.points[0][8] += fd1;
    fb0 = fb1 && lb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    lb1 = lb2 || fb0;
        fd0 = fd1 + fd0;
    boolean lb3 = false;
    Thought lo4 = Thought355.getInstance(fd1, fd0, fd1, fd0);
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld5 = 300.65034513730217;
    ld5 = fd0 - fd1;

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
