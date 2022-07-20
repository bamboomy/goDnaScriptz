package genetic;
import java.util.ArrayList;
class Thought394 extends Thought{
private static ArrayList<Thought394> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 381.81575210424944;
private double fd1 = 881.6327617520158;
private Thought fo0 = null;
private Thought fo1 = null;
Thought394 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought394 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought394 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought394 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought394 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought394 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought394 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought394 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought394 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought394 instance = new Thought394 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought394 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought394 instance = new Thought394 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought394 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought394 instance = new Thought394 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought394 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought394 instance = new Thought394 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought394 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought394 instance = new Thought394 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought394 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought394 instance = new Thought394 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought394 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought394 instance = new Thought394 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought394 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought394 instance = new Thought394 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 *= -1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
    Thought lo0 = Thought13.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m1();
}
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb2, lb1);
}
        fb0 = fb1 || lb2;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb2);
}
        fd0 *= -1;
        double ld3 = 610.2279433321635;
        lb1 = fb0 && fb1;
        double ld4 = 891.1009316759712;
        lb2 = lb1 || fb0;
if(fo1 != null){
          fo1.m1(ld4, fd0, fd1, ld3, fb1, lb2, lb1, fb0);
}
        fb1 = ld4 < fd0;
        lb2 = lb1 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, lb1, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        boolean lb5 = false;
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
        Thought lo0 = Thought325.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    lb1 = ab1 || ab2;
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    ab2 = ab3 && ab4;
    fb0 = fd0 > fd1;
    boolean lb3 = false;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    boolean lb4 = false;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 965.3260380208625;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld0 *= -1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    if (fb0) {
        ad4 = fd0 - fd1;
        Thought lo1 = Thought191.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
        fb1 = ad4 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
        fb0 = ad3 > ad4;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
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
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ab1 = !ab2;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    double ld2 = 188.47136610011682;
    ld2 *= -1;
    boolean lb3 = false;
    ad1 *= -1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, lb3, ab1, ab2);
}
    fd1 = ld2 - ad1;
if(fo0 != null){
      ab3 = fo0.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = ld2 - ad1;
    lb1 = lb3 || ab1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, ad1, ad2);
}
    lb1 = ad3 > ad4;
    lb3 = fd0 > fd1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        double ld1 = 58.50423029045023;
        lb0 = ld1 < fd0;
        fd1 = ld1 + fd0;
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
        boolean lb2 = false;
        double ld3 = 23.082208184905124;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        Output.points[4][7] -= ld3;
        boolean lb4 = false;
if(ao1 != null){
          fd0 = ao1.m3(fd1, ld1, ld3, fd0);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd1, ld1, ld3, fd0);
}
        Output.points[4][8] -= fd1;
if(ao2 != null){
          ao1 = ao2.m4();
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought20.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    double ld2 = 266.2743203848952;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(ld2, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld2);
}
    double ld3 = 450.0233138854968;
if(ao1 != null){
      lb1 = ao1.m2();
}
    ld3 = ad1 + ad2;

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
      ao2.m2(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld0 = 720.9407353595725;
    ld0 = fd0 + fd1;
    fb1 = ld0 > fd0;
    ab1 = ab2 && ab3;
if(ao2 != null){
      fd1 = ao2.m3(ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought63.getInstance(ao3, ao4, fo0, fo1);
    Output.points[5][0] -= fd0;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
    fb0 = fd0 < fd1;
    fb1 = ld0 < fd0;
    Thought lo3 = Thought104.getInstance();
    fd1 = ld0 - fd0;

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
if(ao1 != null){
      ad1 = ao1.m3(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought262.getInstance(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought146.getInstance(ao1, ao2, ao3, ao4);
    ad4 = fd0 + fd1;
    Thought lo2 = Thought283.getInstance(ad1, ad2, ad3, ad4);
    Output.points[5][1] -= fd0;
    fd1 *= -1;
        boolean lb3 = true;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    double ld4 = 902.3094349944128;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    if (fb0) {
        boolean lb5 = true;
        ld4 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(fb0, fb1, lb5, lb3);
}
        ab1 = ad1 < ad2;
        ad3 *= -1;
        Output.points[5][2] -= ad4;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld4, ad1, ab2, ab3, ab4, fb0);
}
        } else if (lb3) {
        Thought lo6 = Thought267.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb3, ab1);
}
        ab2 = fd1 > ld4;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld0 = 476.508114643917;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    ab3 = !ab4;

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
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 660.6835171474822;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, ad1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 + ad1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought235.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
    lb1 = !fb0;
    fd1 = ld0 - ad1;

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
    Output.points[5][3] += ad1;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab4 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    ad3 = ad4 + fd0;
    ab1 = ab2 && ab3;
    ab4 = fd1 < ad1;
    boolean lb1 = false;
    ad2 = ad3 - ad4;
    Thought lo2 = Thought221.getInstance();
    ab4 = !fb0;
    Thought lo3 = Thought129.getInstance(fb1, lb0, lb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, fb1, lb0, lb1, ab1);
}
    ad1 *= -1;
    Thought lo4 = Thought268.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought62.getInstance();
    fb0 = !fb1;
if(ao2 != null){
      fd1 = ao2.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb1 = fd0 < fd1;
    Output.points[5][4] += fd0;
    Thought lo1 = Thought280.getInstance(ao3, ao4, fo0, fo1);
    Output.points[5][5] -= fd1;
    double ld2 = 822.5982319273484;
    ld2 = fd0 - fd1;
    boolean lb3 = false;
    ld2 = fd0 - fd1;
    double ld4 = 869.1177676087348;
    lb3 = fb0 && fb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    Thought lo0 = Thought231.getInstance(ad3, ad4, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
    fb0 = !fb1;
    ad2 *= -1;
    double ld1 = 527.0770315358153;
    fb0 = fb1 || fb0;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, lb2, fb0);
}
    Thought lo3 = Thought345.getInstance(fd1, ld1, ad1, ad2, fb1, lb2, fb0, fb1);
    boolean lb4 = false;
    lb2 = lb4 && fb0;
    Output.points[5][6] += ad3;
    Output.points[5][7] += ad4;

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
    fd1 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    ab4 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Thought lo1 = Thought343.getInstance();

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    Thought lo0 = Thought267.getInstance(ab3, ab4, fb0, fb1);
    ab1 = !ab2;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    ad4 = fd0 + fd1;
    fb1 = ab1 && ab2;
    ab3 = ad1 > ad2;
    ab4 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    double ld1 = 740.2104582757402;
    fb0 = fb1 && ab1;

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
double m3() throws CountDownExc {
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
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    Thought lo0 = Thought188.getInstance();
    fb0 = fd0 < fd1;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld1 = 506.830139534866;
    for(int i0=0; i0<10; i0++){
        ld1 *= -1;
        fb1 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb2 = true;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
        double ld3 = 347.31606458614436;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[5][8] += ld3;
        ld1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(ld3, ld1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ld1, fd0, fd1);
}
        fb1 = ld3 < ld1;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fd0 = fo1.m3(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld3, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
}
        fb1 = lb2 || fb0;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought49.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      ab1 = fo0.m2();
}
        ab2 = fd0 < fd1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          ab2 = fo0.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    double ld1 = 603.2955535653509;
    fd0 = fd1 - ld1;
        ab4 = fb0 || fb1;
    Thought lo2 = Thought196.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld3 = 784.8243154147918;
    ld3 *= -1;
    double ld4 = 721.8787510921072;
    ab2 = ld4 > fd0;

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
    ad1 *= -1;
    double ld0 = 760.5199985870264;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad4 *= -1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      lb1 = fo1.m2(ld0, ad1, ad2, ad3, lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
    double ld3 = 34.69408932838974;
    lb2 = fb0 || fb1;

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
        for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fd1, ad1, ad2, ad3);
}
        ab1 = ad4 < fd0;
        boolean lb0 = true;
        boolean lb1 = true;
        boolean lb2 = true;
        lb1 = lb2 || ab1;
        ab2 = ab3 && ab4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fd0 = fd1 - ad1;
        Thought lo3 = Thought35.getInstance(fb0, fb1, lb0, lb1);
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
        for(int i1=0; i1<10; i1++){
            double ld4 = 116.76668466511889;
            double ld5 = 584.3507220734017;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, lb1, lb2, ab1, ab2);
}
            ab3 = ad4 < fd0;
            double ld6 = 527.2102397921233;
            Thought lo7 = Thought57.getInstance(fo0, fo1, fo0, fo1);
}}
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
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m3();
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought13.getInstance(fb1, fb0, fb1, fb0);
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        boolean lb1 = true;
if(ao3 != null){
          fd0 = ao3.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
        fd1 *= -1;
        double ld2 = 189.4286871557386;
        Thought lo3 = Thought124.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb1, fb0);
if(ao2 != null){
          ld2 = ao2.m3(ao3, ao4, fo0, fo1);
}
        Output.points[6][0] -= fd0;
        fb1 = fd1 < ld2;
        double ld4 = 703.594420340901;
if(ao2 != null){
          ao1 = ao2.m4(ld4, fd0, fd1, ld2);
}
        double ld5 = 96.42634285261838;
        lb1 = fb0 || fb1;
        lb1 = !fb0;
        boolean lb6 = true;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ld4, ld5, fd0, fd1);
}
if(ao2 != null){
          fb0 = ao2.m2();
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
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        double ld0 = 330.27214539321824;
        Output.points[6][1] -= ad4;
        fd0 = fd1 - ld0;
        fb0 = !fb1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
        double ld1 = 129.42115895761583;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        boolean lb2 = false;
        ld1 = ad1 - ad2;
if(ao4 != null){
          ao4.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          ld0 = fo0.m3(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3);
}
        double ld3 = 592.8968705434769;
        Thought lo4 = Thought326.getInstance();
        lb2 = ad3 > ad4;
        fb0 = !fb1;
        fd0 = fd1 - ld0;
if(fo0 != null){
          ao4 = fo0.m4(lb2, fb0, fb1, lb2);
}
        boolean lb5 = false;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought335.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb1 = true;
    Thought lo2 = Thought23.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought34.getInstance();
    fd0 = fd1 - fd0;
    ab1 = !ab2;

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
    ab2 = !ab3;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    ad1 *= -1;
    if (lb0) {
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb0;
if(ao2 != null){
          ao2.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 + ad1;
        boolean lb1 = false;
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb1);
}
        lb0 = !ab1;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][2] -= fd1;
    fd0 *= -1;
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld1 = 650.6917411107187;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    lb0 = ld1 > fd0;
if(fo0 != null){
      lb2 = fo0.m2();
}
    fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(lb2, fb0, fb1, lb0);
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
    ab2 = fd0 < fd1;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo0.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 || ab3;
    double ld0 = 502.57422581768674;
    ld0 *= -1;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought116.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
    double ld2 = 551.23734816919;
    ab4 = !fb0;
    ld0 = ld2 - fd0;
if(fo0 != null){
      fo0.m3();
}
    fb1 = !ab1;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    fd1 = ld0 - ld2;
    fb0 = !fb1;
    lb3 = fd0 > fd1;
    ab1 = ab2 && ab3;
    Thought lo4 = Thought126.getInstance(fo0, fo1, fo0, fo1, ld0, ld2, fd0, fd1, ab4, fb0, fb1, lb3);
if(fo0 != null){
      fo0.m3(ld0, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = ad1 < ad2;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    boolean lb2 = false;
    lb2 = fb0 || fb1;
    Thought lo3 = Thought220.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo0.m3();
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
    Output.points[6][3] -= ad1;
    ad2 = ad3 - ad4;
    ab1 = ab2 || ab3;
    fd0 = fd1 + ad1;
    ab4 = fb0 && fb1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    ab1 = fd1 > ad1;
    boolean lb0 = true;
    ab1 = ad2 < ad3;
    double ld1 = 551.5995311188994;
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    ad3 = ad4 + fd0;
    ab1 = ab2 && ab3;
    double ld2 = 405.6149538268712;
    boolean lb3 = true;
    ab3 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld2, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      lb3 = fo1.m2(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb4 = false;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    lb3 = lb4 || ab1;

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
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 = fd0 + fd1;
    double ld0 = 16.703811024809895;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
    fb0 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
        Thought lo1 = Thought249.getInstance();
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
        fd1 *= -1;
        ld0 = fd0 - fd1;
        }
if(fo0 != null){
      ao4 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    fb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    double ld0 = 471.1155790667239;
    boolean lb1 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    boolean lb2 = true;
    lb1 = !lb2;
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld3 = 419.87775383554845;
    fb0 = fb1 || lb1;
    Thought lo4 = Thought379.getInstance(lb2, fb0, fb1, lb1);
    Output.points[6][4] += ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld3, lb2, fb0, fb1, lb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 || fb1;

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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    fb0 = fb1 || ab1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab3 = ab4 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, ab1, ab2);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 655.6206091075093;
if(ao2 != null){
      ao2.m3(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought249.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
    ad4 = fd0 - fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo2 = Thought340.getInstance(ld0, ad1, ad2, ad3);
    Thought lo3 = Thought310.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0);
    ad1 *= -1;
    double ld4 = 186.94890156444131;
    ab3 = !ab4;
    double ld5 = 542.1274410105206;
    Thought lo6 = Thought124.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ld5, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld4, ld5, ad1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ad2 *= -1;

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
    fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    Thought lo0 = Thought18.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 || fb0;
    Thought lo1 = Thought240.getInstance(fd1, fd0, fd1, fd0);
        Output.points[6][5] -= fd1;
    Output.points[6][6] -= fd0;
    Output.points[6][7] += fd1;
    double ld2 = 202.26511971765933;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    Output.points[6][8] += fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
        boolean lb1 = false;
    lb0 = lb1 || fb0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    fb0 = !fb1;
    fd1 *= -1;
    fb0 = fd0 < fd1;
    double ld0 = 464.5264053925884;
    Output.points[7][0] += ld0;
    double ld1 = 643.9859855978448;

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
