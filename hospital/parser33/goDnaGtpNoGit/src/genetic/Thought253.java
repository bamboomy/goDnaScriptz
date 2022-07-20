package genetic;
import java.util.ArrayList;
class Thought253 extends Thought{
private static ArrayList<Thought253> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 922.0581589084848;
private double fd1 = 178.49063700645326;
private Thought fo0 = null;
private Thought fo1 = null;
Thought253 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought253 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought253 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought253 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought253 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought253 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought253 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought253 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought253 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought253 instance = new Thought253 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought253 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought253 instance = new Thought253 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought253 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought253 instance = new Thought253 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought253 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought253 instance = new Thought253 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought253 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought253 instance = new Thought253 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought253 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought253 instance = new Thought253 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought253 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought253 instance = new Thought253 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought253 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought253 instance = new Thought253 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 800.850512064987;
    Thought lo1 = Thought224.getInstance(ld0, fd0, fd1, ld0);
    Thought lo2 = Thought362.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[5][4] += fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = ld0 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
    Thought lo3 = Thought205.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    double ld4 = 316.3204763626038;
if(fo0 != null){
      fo0.m1();
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    Output.points[5][5] += ld4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld4, fb1, fb0, fb1, fb0);
}
    boolean lb5 = true;
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld4, lb6, fb0, fb1, lb5);
}
    Output.points[5][6] += fd0;
    fd1 = ld0 - ld4;
    Thought lo7 = Thought218.getInstance(fo0, fo1, fo0, fo1, lb6, fb0, fb1, lb5);

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
        fd0 = fd1 + fd0;
    Thought lo0 = Thought81.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ab2 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        fd0 *= -1;
        fd1 *= -1;
if(fo0 != null){
          ab3 = fo0.m2();
}
        fd0 = fd1 + fd0;
        double ld3 = 748.7950942656154;
        boolean lb4 = true;
        fd0 *= -1;
if(fo1 != null){
          fo1.m3(ab3, ab4, fb0, fb1);
}
        boolean lb5 = false;
        boolean lb6 = false;
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
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    lb0 = !fb0;
    fb1 = ad4 < fd0;
        lb0 = fb0 && fb1;
    Thought lo1 = Thought151.getInstance(fd1, ad1, ad2, ad3);
    boolean lb2 = true;
    lb0 = lb2 && fb0;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    Thought lo0 = Thought236.getInstance(fb1, ab1, ab2, ab3);
    double ld1 = 766.8148200058886;
    Output.points[5][7] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 && fb1;
    double ld2 = 880.4340951792802;
if(fo0 != null){
      ab1 = fo0.m2(ad1, ad2, ad3, ad4);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fd0 = fd1 - fd0;
    boolean lb0 = true;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    lb0 = fd1 > fd0;
    boolean lb1 = true;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb1 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, lb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought349.getInstance(ao1, ao2, ao3, ao4, lb0, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb0 = fb0 && fb1;
if(ao3 != null){
      lb0 = ao3.m2(fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    double ld1 = 699.6294835553716;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    boolean lb2 = true;
    lb2 = ld1 > ad1;
    boolean lb3 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb3, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
    Output.points[5][8] -= fd1;
    ld1 *= -1;

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
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    ab2 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(ao1 != null){
      ao1.m1(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    boolean lb1 = true;

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
if(ao1 != null){
      lb0 = ao1.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab2 = fd1 > ad1;
    ab3 = !ab4;
    fb0 = !fb1;
    ad2 *= -1;
    double ld1 = 0.03729289788701595;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    double ld2 = 622.2489047425782;
    lb0 = ab1 && ab2;
    fd0 = fd1 + ld1;
    ab3 = !ab4;
    fb0 = ld2 < ad1;
    fb1 = ad2 < ad3;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo3 = Thought83.getInstance(lb0, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
    lb0 = ab1 || ab2;
    ld2 = ad1 - ad2;
    ad3 *= -1;
    double ld4 = 725.9869313524409;
    boolean lb5 = true;

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
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    double ld0 = 698.3701665350201;
    Output.points[6][0] += ld0;
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Output.points[6][1] += fd1;
    fb0 = ld0 < fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 < ld0;
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    double ld1 = 59.41505256843818;

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
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought347.getInstance();
    boolean lb2 = true;
    double ld3 = 727.4876974663329;
if(fo0 != null){
      fo0.m2(lb0, lb2, ab1, ab2);
}
    ab3 = ab4 && fb0;
    ld3 = fd0 - fd1;
    ld3 = fd0 - fd1;
    boolean lb4 = true;
    fb0 = fb1 && lb0;
    lb2 = lb4 || ab1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld3, fd0, lb4, ab1, ab2, ab3);
}
    Output.points[6][2] += fd1;
    ab4 = ld3 < fd0;
    fb0 = !fb1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    ad4 *= -1;
    fb1 = fd0 > fd1;
    Output.points[6][3] += ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    if (lb0) {
if(fo1 != null){
          fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
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
    Thought lo0 = Thought232.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 < ad1;
    ad2 = ad3 - ad4;
    ab2 = fd0 < fd1;
    ab3 = !ab4;
    fb0 = !fb1;
    ad1 = ad2 - ad3;
    double ld1 = 761.5668018575024;
    boolean lb2 = true;
    lb2 = ad3 > ad4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Output.points[6][4] -= fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought206.getInstance(fd1, fd0, fd1, fd0);
        fd1 *= -1;
    fd0 *= -1;

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
    ad2 *= -1;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
    ad1 *= -1;
    fb0 = !fb1;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m1();
}
    boolean lb1 = true;
    Thought lo2 = Thought384.getInstance(lb0, lb1, fb0, fb1);
    Thought lo3 = Thought39.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
        Output.points[6][5] -= fd1;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
    fd0 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
    fb0 = !fb1;
    Output.points[6][6] -= fd1;
    lb0 = lb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
    ab2 = fd1 > fd0;
if(ao3 != null){
      ao3.m3(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought81.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(ao2 != null){
      fb0 = ao2.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought38.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    ab2 = fd0 > fd1;
    boolean lb2 = true;
    ab2 = ab3 || ab4;
    fd0 = fd1 + fd0;

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
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    boolean lb1 = false;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
if(ao2 != null){
      ao2.m3(ad4, fd0, fd1, ad1, lb0, lb1, lb2, ab1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    lb1 = lb2 && ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}

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
    double ld0 = 157.48262838946343;
    boolean lb1 = true;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
    double ld2 = 908.8264266916613;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld2, fd0, fd1);
}
    double ld3 = 283.2602166927862;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo4 = Thought50.getInstance(fb0, fb1, lb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld2, ld3, fd0, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
    boolean lb5 = true;
    Output.points[6][7] += fd1;
    fb0 = !fb1;
    if (lb1) {
        lb5 = ld0 > ld2;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
if(fo0 != null){
      ab2 = fo0.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    double ld1 = 736.6139436681287;
    fd0 = fd1 + ld1;

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
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
        ad4 = fd0 - fd1;
    double ld0 = 974.859803453805;
    fb1 = ld0 < ad1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(ld0, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    double ld2 = 633.6694185224434;
    lb1 = fb0 || fb1;
    lb1 = fb0 && fb1;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ld0);
}
    Output.points[6][8] -= ld2;
    Output.points[7][0] += ad1;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 > ad2;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ad1 = ad2 - ad3;
    ab3 = ab4 && fb0;
    ad4 *= -1;
    fb1 = !ab1;
if(fo1 != null){
      fo1.m1();
}
    ab2 = fd0 < fd1;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    ab3 = ab4 && fb0;
    fd0 = fd1 + ad1;
    Output.points[7][1] -= ad2;
    Thought lo0 = Thought102.getInstance(fb1, ab1, ab2, ab3);
    Thought lo1 = Thought318.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
    Thought lo2 = Thought265.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ad1;
    Thought lo3 = Thought48.getInstance(fo1, fo0, fo1, fo0);
    ab4 = !fb0;

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
    boolean lb0 = true;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 *= -1;
    Thought lo1 = Thought275.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          lb0 = ao4.m2(fb0, fb1, lb2, lb0);
}
        fb0 = fd1 < fd0;
        fb1 = !lb2;
        lb0 = fd1 > fd0;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb2, lb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb2, lb0);
}
        fd1 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb2, lb0);
}
        fb0 = !fb1;
        fd0 = fd1 - fd0;
        lb2 = fd1 > fd0;
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
    double ld0 = 563.1560704839617;
    Thought lo1 = Thought244.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fb1 = fo1.m2(ld0, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(ao1 != null){
          ao1.m1();
}
        fb0 = fb1 || fb0;
if(ao2 != null){
          ad1 = ao2.m3(fb1, fb0, fb1, fb0);
}
        Thought lo2 = Thought88.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
        fb1 = fb0 || fb1;
        fb0 = fb1 || fb0;
if(ao1 != null){
          fd1 = ao1.m3(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        boolean lb3 = false;
        ad4 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb3, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
    double ld0 = 379.05779031845884;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ab2 = ld0 > fd0;
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 && fb0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        fd0 = fd1 - ld0;
if(fo0 != null){
          ao4 = fo0.m4(fb1, ab1, ab2, ab3);
}
        ab4 = fd0 > fd1;
        Output.points[7][2] += ld0;
        }
    Thought lo1 = Thought66.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    ld0 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, lb2, ab1, ab2, ab3);
}
    fd1 = ld0 + fd0;
    ab4 = fb0 || fb1;
    if (lb2) {
        fd1 = ld0 - fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    ab2 = ab3 || ab4;
    double ld0 = 807.1831457453416;
    ld0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
}
    boolean lb1 = false;
if(ao2 != null){
      ao2.m1();
}
    ad4 *= -1;
    fb0 = fd0 < fd1;
    Output.points[7][3] += ld0;
    fb1 = ad1 < ad2;
if(ao3 != null){
      ad3 = ao3.m3(lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought119.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ld0 - ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb1, ab1);
}
    Thought lo3 = Thought187.getInstance(ao2, ao3, ao4, fo0);
    ad3 = ad4 + fd0;
    Thought lo4 = Thought241.getInstance(fd1, ld0, ad1, ad2);

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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        boolean lb1 = false;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, lb2, fb0);
}
        fd0 *= -1;
        fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    lb0 = !lb1;
    boolean lb3 = true;
    Output.points[7][4] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    lb2 = !lb3;
    fd1 = fd0 + fd1;

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
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought14.getInstance(ab2, ab3, ab4, fb0);
    Output.points[7][5] -= fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb1 = true;
    ab4 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    double ld2 = 97.47194460395627;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
    fd1 = ld2 - fd0;
    ab1 = fd1 < ld2;
    Thought lo3 = Thought211.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
    fd1 = ld2 - fd0;

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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 - ad1;
    fb1 = fb0 || fb1;
    double ld0 = 260.3188030528159;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m1();
}
    double ld1 = 147.55873791832923;
if(fo1 != null){
      ld1 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    boolean lb0 = true;
    Output.points[7][6] += fd1;
    ab2 = ad1 < ad2;
    Thought lo1 = Thought147.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        boolean lb2 = false;
        ad3 = ad4 + fd0;
        Output.points[7][7] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
        Thought lo3 = Thought5.getInstance();
        double ld4 = 181.1205362388248;
        Thought lo5 = Thought20.getInstance(lb2, lb0, ab1, ab2);
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, ld4, ad1, ad2, ad3, ab4, fb0, fb1, lb2);
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
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(ao1 != null){
      lb0 = ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 - fd0;
    Thought lo1 = Thought328.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        Output.points[7][8] -= fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
        lb0 = ad2 < ad3;
    double ld1 = 988.1428361229583;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
    boolean lb2 = false;
    boolean lb3 = false;
    lb0 = lb2 && lb3;
    fb0 = ld1 > ad1;
    double ld4 = 689.0270480004804;
if(ao2 != null){
      ao1 = ao2.m4();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    ab1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    for(int i0=0; i0<10; i0++){
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Output.points[8][0] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    fb1 = ab1 && ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought376.getInstance();
    ab3 = !ab4;
if(ao1 != null){
      fb0 = ao1.m2(fb1, ab1, ab2, ab3);
}
    double ld1 = 786.5072303946112;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1, ab4, fb0, fb1, ab1);
}
    boolean lb2 = false;
    double ld3 = 616.3688914946787;
    boolean lb4 = false;
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4, lb4, ab1, ab2, ab3);
}
    fd0 = fd1 + ld1;
if(ao3 != null){
      ld3 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb2);
}
    Thought lo5 = Thought26.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
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
    Output.points[8][1] += fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
    fd0 *= -1;
    double ld0 = 470.16654560904436;
    boolean lb1 = false;
    boolean lb2 = true;
    Thought lo3 = Thought25.getInstance(lb2, fb0, fb1, lb1);
    double ld4 = 903.8142661344481;
if(fo0 != null){
      ld4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld4, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld4, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb5 = false;
if(fo0 != null){
      fd1 = fo0.m3(ld0, ld4, fd0, fd1);
}
    ld0 *= -1;
    lb1 = !lb2;
if(fo1 != null){
      lb5 = fo1.m2(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld0);
}
    ld4 = fd0 + fd1;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      lb2 = fo0.m2(lb5, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld4, fd0, fd1, lb2, lb5, fb0, fb1);
}
    boolean lb6 = true;

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
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[8][2] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fd0 *= -1;
    fb1 = lb0 && lb1;
        Thought lo2 = Thought284.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
    Output.points[8][3] -= fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 < fd1;
    fb1 = !lb0;
    Thought lo3 = Thought252.getInstance(fd0, fd1, fd0, fd1);
    Thought lo4 = Thought151.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
        lb1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, lb1);
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
        fd1 *= -1;
    fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
    fd0 *= -1;
    fb0 = fd1 < fd0;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought64.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    Output.points[8][4] -= fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld2 = 626.8552782128329;
    fb0 = ld2 > fd0;
    fd1 *= -1;
    boolean lb3 = false;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2);
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
