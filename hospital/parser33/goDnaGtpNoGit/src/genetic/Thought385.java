package genetic;
import java.util.ArrayList;
class Thought385 extends Thought{
private static ArrayList<Thought385> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 668.679116038911;
private double fd1 = 885.088344999831;
private Thought fo0 = null;
private Thought fo1 = null;
Thought385 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought385 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought385 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought385 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought385 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought385 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought385 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought385 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought385 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought385 instance = new Thought385 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought385 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought385 instance = new Thought385 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought385 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought385 instance = new Thought385 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought385 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought385 instance = new Thought385 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought385 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought385 instance = new Thought385 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought385 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought385 instance = new Thought385 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought385 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought385 instance = new Thought385 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought385 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought385 instance = new Thought385 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[0][5] += fd0;
    double ld0 = 466.47114021279987;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    boolean lb1 = false;
    fb0 = !fb1;
    ld0 = fd0 + fd1;
    Output.points[0][6] -= ld0;
    double ld2 = 115.58323154452283;
    ld2 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m2(ld0, ld2, fd0, fd1, fb1, lb1, fb0, fb1);
}
    ld0 = ld2 - fd0;
    lb1 = fd1 > ld0;
    fb0 = fb1 || lb1;

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
    double ld0 = 944.2403692356322;
    fd0 = fd1 - ld0;
    ab2 = fd0 < fd1;
    ab3 = ab4 || fb0;
    double ld1 = 326.8978834941236;
    fb1 = ld0 < ld1;
    Thought lo2 = Thought352.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld1 = fd0 + fd1;
    ld0 = ld1 + fd0;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo0.m3(fd1, ld0, ld1, fd0);
}
    double ld3 = 744.9750369385818;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
    ld3 = fd0 - fd1;
    if (ab3) {
if(fo1 != null){
          fo0 = fo1.m4();
}
        ld0 *= -1;
        Thought lo4 = Thought6.getInstance(ab4, fb0, fb1, ab1);
        ab2 = ld1 > ld3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m2(ld3, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        ab3 = !ab4;
        ld1 *= -1;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 449.73472653507;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(ld0, ad1, ad2, ad3);
}
    boolean lb2 = true;
    double ld3 = 775.814471444969;
    ad3 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    if (lb1) {
        ld3 = ad1 - ad2;
        double ld4 = 143.67189179104827;
        lb2 = !fb0;
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
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fb1 = fd1 < ad1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Output.points[0][7] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
        Thought lo0 = Thought22.getInstance(ad2, ad3, ad4, fd0);
    ab2 = !ab3;
    for(int i0=0; i0<10; i0++){
        fd1 = ad1 + ad2;
        ad3 = ad4 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
        boolean lb1 = true;
        boolean lb2 = false;
        ad4 *= -1;
        ab2 = !ab3;
        fd0 = fd1 - ad1;
        ad2 = ad3 - ad4;
        Output.points[0][8] -= fd0;
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
    fd1 = fd0 - fd1;
if(ao2 != null){
          ao2.m1();
}
    fb1 = fd0 > fd1;
    Thought lo0 = Thought68.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    lb1 = !fb0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    boolean lb2 = false;
    lb1 = fd0 > fd1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, lb2, fb0, fb1);
}
    fd1 = fd0 + fd1;
    Thought lo3 = Thought369.getInstance(ao4, fo0, fo1, ao1);

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
    Thought lo0 = Thought239.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(ao1 != null){
      ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    double ld1 = 249.84467716984724;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = ld1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo2 = Thought209.getInstance(fd0, fd1, ld1, ad1);
    ad2 *= -1;
    fb1 = ad3 < ad4;
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
    fb0 = ld1 < ad1;
    fb1 = ad2 < ad3;
    Output.points[1][0] -= ad4;
    fd0 *= -1;
    fb0 = fd1 < ld1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;

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
if(ao3 != null){
      ao3.m2(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought143.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < fd0;
        Output.points[1][1] += fd1;
    ab3 = fd0 > fd1;
    ab4 = fb0 && fb1;
    Thought lo1 = Thought37.getInstance(ao3, ao4, fo0, fo1);
    double ld2 = 365.76186087026446;
    ab1 = ld2 < fd0;
if(ao1 != null){
      ab2 = ao1.m2(fd1, ld2, fd0, fd1);
}
    double ld3 = 194.0347907775911;
    ab3 = ld2 > ld3;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ld3);
}
    fd0 = fd1 - ld2;
    fb0 = fb1 && ab1;
if(ao1 != null){
      ld3 = ao1.m3();
}
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    boolean lb1 = true;
    ab2 = !ab3;
    ab4 = ad1 < ad2;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    fb0 = fb1 || lb0;
    lb1 = ad1 < ad2;
    ad3 *= -1;
    boolean lb2 = true;

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
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    lb0 = !lb1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        double ld2 = 771.7699400830286;
        Output.points[1][2] -= fd0;
        Output.points[1][3] += fd1;
        ld2 *= -1;
        fb0 = fd0 < fd1;
        double ld3 = 843.9663717308999;
        Output.points[1][4] += ld2;
        ld3 *= -1;
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
if(fo1 != null){
      fo1.m2();
}
    fd0 = fd1 - fd0;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    fb1 = !ab1;
    ab2 = ab3 && ab4;
    fb0 = fd1 > fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
    ab3 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;

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
    if (fb0) {
        fb1 = fb0 || fb1;
        ad2 *= -1;
        fb0 = ad3 < ad4;
        double ld0 = 768.5365376130795;
        ad4 = fd0 - fd1;
if(fo1 != null){
          fo1.m1();
}
        ld0 = ad1 + ad2;
        ad3 = ad4 - fd0;
if(fo0 != null){
          fo0.m1(fb1, fb0, fb1, fb0);
}
        fb1 = fd1 > ld0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
        ad2 = ad3 + ad4;
        double ld1 = 902.3081106564834;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        boolean lb2 = true;
        Thought lo3 = Thought11.getInstance(fo0, fo1, fo0, fo1);
        lb2 = fd0 < fd1;
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
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
    ab1 = ab2 || ab3;
    fd0 *= -1;
    double ld0 = 590.962582351;
    Thought lo1 = Thought126.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
if(fo1 != null){
      ad2 = fo1.m3();
}
    boolean lb2 = false;
    ab3 = ab4 || fb0;
    ad3 = ad4 + fd0;
    fb1 = fd1 < ld0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought263.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    Thought lo2 = Thought50.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
    fb1 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought389.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);

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
    fb0 = !fb1;
    boolean lb0 = false;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought373.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
    fd1 = ad1 - ad2;
    Thought lo3 = Thought388.getInstance(ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
    Thought lo4 = Thought303.getInstance(ao3, ao4, fo0, fo1, lb0, lb1, fb0, fb1);
    double ld5 = 452.49238599420556;
    lb0 = ld5 > ad1;
    ad2 *= -1;
    Output.points[1][5] += ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      lb1 = ao1.m2(ad4, fd0, fd1, ld5);
}
    fb0 = fb1 || lb0;
    lb1 = !fb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    lb0 = ld5 < ad1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3();
}
    ab1 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    double ld0 = 913.3538196554669;
    fb1 = ld0 > fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[1][6] -= ld0;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
        if (ab1) {
            ab2 = fd1 > ld0;
            ab3 = !ab4;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
            fd0 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    ab1 = fd0 > fd1;
if(ao2 != null){
      ab2 = ao2.m2();
}
    ad1 = ad2 + ad3;
if(ao3 != null){
      ab3 = ao3.m2(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
    boolean lb1 = false;
    ad2 *= -1;
    ab1 = ab2 && ab3;
    boolean lb2 = false;
    boolean lb3 = true;
    ad3 = ad4 + fd0;
if(ao3 != null){
      ab2 = ao3.m2(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb1, lb2, lb3);
}
    double ld4 = 622.9080848124818;
    double ld5 = 719.0440628432191;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld6 = 96.6039456146237;
    ad1 *= -1;
    ab1 = ad2 < ad3;
    double ld7 = 134.0642125955259;

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
    fb0 = fd0 < fd1;
    double ld0 = 703.9388988813428;
    if (fb1) {
        for(int i0=0; i0<10; i0++){
            Thought lo1 = Thought304.getInstance(ld0, fd0, fd1, ld0);
            }
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
        double ld2 = 566.2997186739333;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ld2 *= -1;
if(fo0 != null){
          fb0 = fo0.m2(ld0, fd0, fd1, ld2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        double ld3 = 37.01583454595864;
        fb0 = fb1 && fb0;
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
    ab2 = fd0 < fd1;
        Output.points[1][7] += fd0;
    Thought lo0 = Thought225.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    ab2 = ab3 || ab4;
    fd1 *= -1;
    fb0 = fd0 < fd1;
    Thought lo2 = Thought276.getInstance();
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, ab1, ab2);
}
    if (ab3) {
        ab4 = fb0 || fb1;
        fd1 = fd0 - fd1;
        lb1 = !ab1;
        ab2 = !ab3;
        boolean lb3 = false;
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        lb3 = fd0 > fd1;
if(fo0 != null){
          lb1 = fo0.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        boolean lb4 = false;
        ab4 = fd0 > fd1;
        fb0 = fd0 > fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb1, lb3, lb4, lb1);
}
        double ld5 = 500.2622376383368;
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
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
    lb0 = ad3 < ad4;
    Output.points[1][8] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = fd0 > fd1;
    Output.points[2][0] += ad1;
    Output.points[2][1] += ad2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = !ab3;
    if (ab4) {
        ad4 = fd0 + fd1;
        boolean lb0 = true;
        boolean lb1 = true;
        ab3 = !ab4;
        ad1 *= -1;
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
    Output.points[2][2] += fd0;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    double ld0 = 457.2769068954156;
    fd0 = fd1 - ld0;
if(ao1 != null){
      ao1.m3(fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    double ld2 = 134.1891840663891;
if(ao2 != null){
          ao1 = ao2.m4();
}
    Output.points[2][3] += ld0;
    Thought lo3 = Thought96.getInstance(fb0, fb1, lb1, fb0);

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
    double ld0 = 858.5541010235565;
    Thought lo1 = Thought209.getInstance(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3);
}
    boolean lb2 = true;
    lb2 = ad4 > fd0;
    boolean lb3 = true;
if(ao4 != null){
      lb3 = ao4.m2(fd1, ld0, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0);
}
    fb0 = fb1 && lb2;
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao4.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(lb3, fb0, fb1, lb2);
}
    Output.points[2][4] += ad4;
    lb3 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, fb0, fb1, lb2, lb3);
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
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    fb1 = !ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fb1 = ab1 || ab2;
    ab3 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought109.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);

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
    ad1 = ad2 + ad3;
    ab2 = ab3 && ab4;
    fb0 = ad4 < fd0;
    boolean lb0 = true;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[2][5] -= ad1;
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    Output.points[2][6] -= fd1;
if(ao4 != null){
      ad1 = ao4.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[2][7] += fd1;
    ad1 = ad2 + ad3;
    fb0 = fb1 || lb0;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
    ad3 = ad4 + fd0;
    ab4 = fb0 || fb1;
    lb0 = fd1 > ad1;
    ad2 *= -1;

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
    fb1 = fd1 > fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    if (fb0) {
        fd1 *= -1;
        boolean lb0 = true;
if(fo1 != null){
          fo1.m3(fb0, fb1, lb0, fb0);
}
        fb1 = lb0 || fb0;
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        } else {
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought115.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
        Output.points[2][8] += fd0;
        fd1 = fd0 - fd1;
    Thought lo2 = Thought51.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought26.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    for(int i0=0; i0<10; i0++){
        ab2 = fd0 > fd1;
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
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          ad2 = fo0.m3(fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
        boolean lb1 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
        double ld2 = 874.6365208328766;
        lb1 = ld2 > ad1;
        fb0 = ad2 > ad3;
        boolean lb3 = false;
        ad4 = fd0 - fd1;
        fb0 = fb1 && lb0;
        Thought lo4 = Thought218.getInstance(ld2, ad1, ad2, ad3, lb1, lb3, fb0, fb1);
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, lb0, lb1, lb3, fb0);
}
        double ld5 = 276.0762044534795;
        boolean lb6 = true;
        fb0 = fb1 && lb0;
        Thought lo7 = Thought116.getInstance(fo0, fo1, fo0, fo1);
        double ld8 = 830.2247405242598;
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
    ab2 = ab3 || ab4;
    ad1 *= -1;
    boolean lb0 = true;
    boolean lb1 = false;
    Thought lo2 = Thought263.getInstance(ad2, ad3, ad4, fd0);
    Output.points[3][0] += fd1;
    double ld3 = 385.98096889125827;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3);
}
    ab3 = ad4 < fd0;
    for(int i0=0; i0<10; i0++){
        ab4 = fd1 < ld3;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb0 = !fb1;
        boolean lb4 = false;
        boolean lb5 = true;
        double ld6 = 152.3197245040357;
        Output.points[3][1] -= ld3;
if(fo0 != null){
          fo1 = fo0.m4(lb4, lb5, lb0, lb1);
}
        ab1 = ad1 < ad2;
        ad3 = ad4 - fd0;
        ab2 = ab3 || ab4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld6, ld3, ad1, fb0, fb1, lb4, lb5);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought195.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought248.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    boolean lb2 = false;
    Thought lo3 = Thought279.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ao1.m1(fb0, fb1, lb2, fb0);
}
    fb1 = fd1 < fd0;
    lb2 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
    Thought lo4 = Thought202.getInstance(ao4, fo0, fo1, ao1, fb1, lb2, fb0, fb1);
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || lb2;
        fb0 = fb1 && lb2;
        fd1 *= -1;
        fb0 = !fb1;
        lb2 = fd0 < fd1;
        fd0 = fd1 + fd0;
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
    double ld0 = 552.6111635620524;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m1();
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fb1 = ao3.m2(fb0, fb1, fb0, fb1);
}
        fd0 = fd1 - ld0;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ao3.m3(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
        ad2 = ad3 + ad4;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m3();
}
    Thought lo0 = Thought63.getInstance(ab2, ab3, ab4, fb0);
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought23.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    boolean lb2 = true;
    fb0 = fb1 && lb2;
    Output.points[3][2] -= fd0;
    fd1 *= -1;
    ab1 = fd0 > fd1;
    double ld3 = 492.43353891270993;

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
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought345.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
        ab1 = ad3 < ad4;
        boolean lb1 = true;
        ab1 = ab2 && ab3;
        double ld2 = 624.2463089144057;
        boolean lb3 = false;
if(ao1 != null){
          ao1.m3();
}
        Thought lo4 = Thought85.getInstance(ab3, ab4, fb0, fb1);
        double ld5 = 445.71369060635;
if(ao2 != null){
          lb1 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb3, ab1, ab2, ab3);
}
        Output.points[3][3] -= ld2;
        ab4 = ld5 < ad1;
if(ao1 != null){
          fb0 = ao1.m2(ad2, ad3, ad4, fd0, fb1, lb1, lb3, ab1);
}
if(ao2 != null){
          ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
        boolean lb6 = false;
        lb1 = lb3 || lb6;
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    Output.points[3][4] -= fd1;
    Output.points[3][5] += fd0;
    double ld1 = 141.3725269392941;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    fb0 = fb1 || lb0;
    fb0 = fd1 < ld1;
    fd0 *= -1;
    Thought lo2 = Thought153.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
    ld1 *= -1;
    fb1 = fd0 < fd1;
    lb0 = fb0 && fb1;
    lb0 = ld1 < fd0;
    fd1 = ld1 - fd0;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    double ld3 = 633.5995184530162;
    Thought lo4 = Thought196.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld3, lb0, fb0, fb1, lb0);
    boolean lb5 = true;
    fd0 = fd1 - ld1;
    boolean lb6 = false;
    boolean lb7 = true;

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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
        fd1 *= -1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > fd0;
    Thought lo0 = Thought149.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;

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
    fd1 *= -1;
    boolean lb0 = false;
    Thought lo1 = Thought263.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
    lb0 = !fb0;
    double ld2 = 869.8958733399975;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}
    fb1 = fd1 > ld2;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    Output.points[3][6] += ld2;
    fd0 = fd1 + ld2;
    fd0 = fd1 + ld2;
    lb0 = !fb0;
        Output.points[3][7] += fd0;

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
